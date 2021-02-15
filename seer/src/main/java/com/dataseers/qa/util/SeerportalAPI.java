package com.dataseers.qa.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SeerportalAPI extends TestUtil {

	String portalUrl = prop.getProperty("url");

	@SuppressWarnings("unchecked")
	public String loginAPI() throws IOException {
		RestAssured.useRelaxedHTTPSValidation();
		String user = prop.getProperty("userName");
		String password = prop.getProperty("apiPassword");
		System.out.println(portalUrl);
		// The base URI to be used
		RestAssured.baseURI = portalUrl + "/userDetails/login";

		RequestSpecification request = RestAssured.given();

		// Define the specification of request. Server is specified by baseURI above.
		JSONObject requestParams = new JSONObject();
		requestParams.put("email", user);
		requestParams.put("password", password);
		request.header("Content-Type", "application/json");
		System.out.println(user);

		request.body(requestParams.toJSONString());
		Response response = request.request(Method.POST);
		JsonPath jsonPathEvaluator = response.jsonPath();
		String token = jsonPathEvaluator.getString("token");
		System.out.println(response.asString());
		return token;
	}

	public List<String> programMatrixAPI(String programData, String value) throws IOException {
		RestAssured.useRelaxedHTTPSValidation();

		// The base URI to be used
		RestAssured.baseURI = portalUrl + "/programMatrixDetails/program-matrix-dropdown-values";

		RequestSpecification request = RestAssured.given();

		// Define the specification of request. Server is specified by baseURI above.
		JSONObject requestParams = new JSONObject();
		request.header("Content-Type", "application/json");
		SeerportalAPI SeerportalAPI = new SeerportalAPI();

		request.header("auth-token", SeerportalAPI.loginAPI());
		request.body(requestParams.toJSONString());
		Response response = request.request(Method.GET);
		JsonPath jsonPathEvaluator = response.jsonPath();
		String totalData = jsonPathEvaluator.getString("data." + programData + ".size");
		int k = Integer.parseInt(totalData);
		System.out.println("total data: " + k);
		List<String> dataList = new ArrayList<String>();
		for (int i = 0; i < k; i++) {
			String fieldName = jsonPathEvaluator.getString("data." + programData + "[" + i + "]." + value);
			dataList.add(fieldName);
		}
		System.out.println(dataList);

		return dataList;

	}

	public HashMap<String, String> programNetworksAPI(String programData) throws IOException {

		RestAssured.useRelaxedHTTPSValidation();

		// The base URI to be used
		RestAssured.baseURI = portalUrl + "/programMatrixDetails/program-matrix-dropdown-values";

		RequestSpecification request = RestAssured.given();

		// Define the specification of request. Server is specified by baseURI above.
		JSONObject requestParams = new JSONObject();
		request.header("Content-Type", "application/json");
		SeerportalAPI SeerportalAPI = new SeerportalAPI();

		request.header("auth-token", SeerportalAPI.loginAPI());
		request.body(requestParams.toJSONString());
		Response response = request.request(Method.GET);
		JsonPath jsonPathEvaluator = response.jsonPath();
		String totalData = jsonPathEvaluator.getString("data." + programData + ".size");

		int k = Integer.parseInt(totalData);
		System.out.println("total data: " + k);

		HashMap<String, String> netWorkMap = new HashMap<String, String>();
		for (int i = 0; i < k; i++) {
			String networkField = jsonPathEvaluator.getString("data." + programData + "[" + i + "]." + "value");
			String netWorkType = jsonPathEvaluator.getString("data." + programData + "[" + i + "]." + "type");
			netWorkMap.put(networkField, netWorkType);
//			System.out.println(netWorkMap);
//			netWorkMap.put(netWorkType, networkField);
		}

//		for (Entry<String, String> entry : netWorkMap.entrySet()) {
//		    String key = entry.getKey();
//		    String value = entry.getValue();}
		return netWorkMap;

	}

	@SuppressWarnings("unchecked")
	public List<String> getProgramGroupDetails(String programData) throws IOException {
		RestAssured.useRelaxedHTTPSValidation();

		// The base URI to be used
		RestAssured.baseURI = portalUrl + "/programGroups/get-program-group-by-id";

		RequestSpecification request = RestAssured.given();

		// Define the specification of request. Server is specified by baseURI above.
		JSONObject requestParams = new JSONObject();
		requestParams.put("programGroupId", null);
		requestParams.put("kyckyb", programData);
		request.header("Content-Type", "application/json");
		SeerportalAPI SeerportalAPI = new SeerportalAPI();

		request.header("auth-token", SeerportalAPI.loginAPI());

		request.body(requestParams.toJSONString());
		Response response = request.request(Method.POST);
		System.out.println(response.asString());

		JsonPath jsonPathEvaluator = response.jsonPath();
		String programs = jsonPathEvaluator.getString("data.groupData.size");
		int k = Integer.parseInt(programs);
		System.out.println(k);
		List<String> programList = new ArrayList<String>();
		for (int i = 0; i < k; i++) {
			String processor = jsonPathEvaluator.getString("data.groupData[" + i + "].processor");
			programList.add(processor);
			System.out.println(programList);
		}
		return programList;

	}

	@SuppressWarnings("unchecked")
	public List<String> getReportGroupDetails() throws IOException {
		RestAssured.useRelaxedHTTPSValidation();

		// The base URI to be used
		RestAssured.baseURI = portalUrl + "/reportGroups/get-report-group";

		RequestSpecification request = RestAssured.given();

		// Define the specification of request. Server is specified by baseURI above.
		JSONObject requestParams = new JSONObject();
		requestParams.put("reportGroupId", "");
		request.header("Content-Type", "application/json");
		SeerportalAPI SeerportalAPI = new SeerportalAPI();

		request.header("auth-token", SeerportalAPI.loginAPI());

		request.body(requestParams.toJSONString());
		Response response = request.request(Method.POST);
		System.out.println(response.asString());

		JsonPath jsonPathEvaluator = response.jsonPath();
		String reports = jsonPathEvaluator.getString("data.groupData.size");
		int k = Integer.parseInt(reports);
		System.out.println(k);
		List<String> reportList = new ArrayList<String>();
		for (int i = 0; i < k; i++) {
			String report = jsonPathEvaluator.getString("data.groupData[" + i + "].full_name");
			reportList.add(report);
			System.out.println(reportList);
		}
		return reportList;

	}

//	@SuppressWarnings("unchecked")
	public List<String> getProcessorfileInfo(String infoType) throws IOException {
		RestAssured.useRelaxedHTTPSValidation();

		// The base URI to be used
		RestAssured.baseURI = portalUrl + "/codes/get-list-by-type";

		RequestSpecification request = RestAssured.given();

		// Define the specification of request. Server is specified by baseURI above.
		JSONObject requestParams = new JSONObject();
		request.header("Content-Type", "application/json");
		SeerportalAPI SeerportalAPI = new SeerportalAPI();

		request.header("auth-token", SeerportalAPI.loginAPI());
		request.queryParam("codeType", "delimiter,extensions,line_terminator,realtime_data");

		request.body(requestParams.toJSONString());
		Response response = request.request(Method.GET);
		List<String> realList = new ArrayList<String>();

//		System.out.println(response.asString());

		JsonPath jsonPathEvaluator = response.jsonPath();
//		if (infoType.contentEquals("realtime_data")) {
		String realTimeCount = jsonPathEvaluator.getString("data." + infoType + ".size");
		int k = Integer.parseInt(realTimeCount);
//			System.out.println(k);
		for (int i = 0; i < k; i++) {
			String fileDetails = jsonPathEvaluator.getString("data." + infoType + "[" + i + "].value");
			realList.add(fileDetails);
//				System.out.println(fileDetails);
		}
//			return realList;
//
//		} else {
//			String fileDetails = jsonPathEvaluator.getString("data." + infoType + "[" + valueIndex + "].value");
//			realList.add(fileDetails);
//			System.out.println(fileDetails);
		return realList;

	}

	public List<String> getMccAPI() throws IOException {
		RestAssured.useRelaxedHTTPSValidation();

		// The base URI to be used
		RestAssured.baseURI = portalUrl + "/mcc/get-list";

		RequestSpecification request = RestAssured.given();

		// Define the specification of request. Server is specified by baseURI above.
		JSONObject requestParams = new JSONObject();
		request.header("Content-Type", "application/json");
		SeerportalAPI SeerportalAPI = new SeerportalAPI();

		request.header("auth-token", SeerportalAPI.loginAPI());
		request.body(requestParams.toJSONString());
		Response response = request.request(Method.GET);
		JsonPath jsonPathEvaluator = response.jsonPath();
		String totalMcc = jsonPathEvaluator.getString("data.size");
		int k = Integer.parseInt(totalMcc);
		System.out.println("total mcc are: " + k);
		List<String> mccList = new ArrayList<String>();
		for (int i = 0; i < k; i++) {
			String mccName = jsonPathEvaluator.getString("data[" + i + "].name");
			mccList.add(mccName);
		}
		System.out.println(mccList);

		return mccList;

	}

	public List<String> getProcessserCodesAPI(String url, String mapCode) throws IOException {
		RestAssured.useRelaxedHTTPSValidation();
//		portalUrl+"/processor/get-ds-account-codes";
		// The base URI to be used
		RestAssured.baseURI = url;

		RequestSpecification request = RestAssured.given();

		// Define the specification of request. Server is specified by baseURI above.
		JSONObject requestParams = new JSONObject();
		request.header("Content-Type", "application/json");
		SeerportalAPI SeerportalAPI = new SeerportalAPI();

		request.header("auth-token", SeerportalAPI.loginAPI());
		request.body(requestParams.toJSONString());
		Response response = request.request(Method.GET);
		JsonPath jsonPathEvaluator = response.jsonPath();
		String totalCodes = jsonPathEvaluator.getString("data.size");
		int k = Integer.parseInt(totalCodes);
		System.out.println("total total processer codes are: " + k);
		List<String> processerCodeList = new ArrayList<String>();
		for (int i = 0; i < k; i++) {
//			ds_account_status_code
			String Code = jsonPathEvaluator.getString("data[" + i + "]." + mapCode);
			processerCodeList.add(Code);
		}
		System.out.println(processerCodeList);

		return processerCodeList;

	}

	public List<String> getTransCodesAPI() throws IOException {
		// The base URI to be used
		String url = portalUrl + "/processor/get-ds-tran-codes";
		return getProcessserCodesAPI(url, "ds_transaction_code");

	}

	public List<String> getAuthCodesAPI() throws IOException {
		// The base URI to be used
		String url = portalUrl + "/processor/get-ds-auth-codes";
		return getProcessserCodesAPI(url, "ds_authorization_code");

	}

	public List<String> getAccountStatusCodesAPI() throws IOException {
		// The base URI to be used
		String url = portalUrl + "/processor/get-ds-account-codes";
		return getProcessserCodesAPI(url, "ds_account_status_code");

	}

	public List<String> getCardCodesAPI() throws IOException {
		// The base URI to be used
		String url = portalUrl + "/processor/get-ds-card-codes";
		return getProcessserCodesAPI(url, "ds_card_status_code");
	}

	public List<String> getPosEntryCodesAPI() throws IOException {
		// The base URI to be used
		String url = portalUrl + "/processor/get-ds-pos-codes";
		return getProcessserCodesAPI(url, "ds_pos_entry_code");
	}

	public List<String> getNetworkCodesAPI() throws IOException {
		// The base URI to be used
		String url = portalUrl + "/processor/get-ds-network-codes";
		return getProcessserCodesAPI(url, "ds_network_code");
	}

	public List<String> getAlertReportConfig(String alertData) throws IOException {
		// The base URI to be used
		RestAssured.useRelaxedHTTPSValidation();
//		portalUrl+"/processor/get-ds-account-codes";
		// The base URI to be used
		RestAssured.baseURI = portalUrl + "/reportConfig/list";

		RequestSpecification request = RestAssured.given();

		// Define the specification of request. Server is specified by baseURI above.
		JSONObject requestParams = new JSONObject();
		request.header("Content-Type", "application/json");
		SeerportalAPI SeerportalAPI = new SeerportalAPI();

		request.header("auth-token", SeerportalAPI.loginAPI());
		request.body(requestParams.toJSONString());
		Response response = request.request(Method.POST);
		JsonPath jsonPathEvaluator = response.jsonPath();
		String totalCodes = jsonPathEvaluator.getString("data.size");
		int k = Integer.parseInt(totalCodes);
		System.out.println("total total processer codes are: " + k);
		List<String> alertsList = new ArrayList<String>();
		for (int i = 0; i < k; i++) {
//			ds_account_status_code
			String Code = jsonPathEvaluator.getString("data[" + i + "]." + alertData);
			alertsList.add(Code);
		}
		System.out.println(alertsList);

		return alertsList;

	}

	public List<String> getAlertProcessorAPI(String alertDetails) throws IOException {
		// The base URI to be used
		String url = portalUrl + "/alerts/get-user-processor-programs";
		return getProcessserCodesAPI(url, alertDetails);
	}

	public List<String> getAlertProgramAPI(int processorIndex, String alertData) throws IOException {
		RestAssured.useRelaxedHTTPSValidation();
		// The base URI to be used
		RestAssured.baseURI = portalUrl + "/alerts/get-user-processor-programs";

		RequestSpecification request = RestAssured.given();

		// Define the specification of request. Server is specified by baseURI above.
		JSONObject requestParams = new JSONObject();
		request.header("Content-Type", "application/json");
		SeerportalAPI SeerportalAPI = new SeerportalAPI();
		request.header("auth-token", SeerportalAPI.loginAPI());
		request.body(requestParams.toJSONString());
		Response response = request.request(Method.GET);
		JsonPath jsonPathEvaluator = response.jsonPath();
		String totalCodes = jsonPathEvaluator.getString("data[" + processorIndex + "]." + "programDetails.size");
		List<String> alertsList = new ArrayList<String>();

		for (int i = 0; i < Integer.parseInt(totalCodes); i++) {
			String programs = jsonPathEvaluator
					.getString("data[" + processorIndex + "]." + "programDetails" + "[" + i + "]." + alertData);
			alertsList.add(programs);
			System.out.println(programs);
		}
		return alertsList;
	}

	public List<String> getAlertReasonAPI(String alertReason) throws IOException {
		// The base URI to be used
		String url = portalUrl + "/reasons/get-list?zone=Asia/Calcutta";
		return getProcessserCodesAPI(url, alertReason);
	}


	public List<String> getCaseNamesAPI(String alertReason) throws IOException {
		// The base URI to be used
		String url = portalUrl + "/cases/get-list?zone=Asia/Calcutta&status=";
		return getProcessserCodesAPI(url, alertReason);
	}
	

	
	
	public static void main(String[] args) throws IOException {
		SeerportalAPI SeerportalAPI = new SeerportalAPI();
//		List<String> alertRespInfo = new ArrayList<>();
//		alertRespInfo.add(SeerportalAPI.getAlertReportConfig("name").get(0));
//		alertRespInfo.add(SeerportalAPI.getCaseNamesAPI("title").get(0));
////		alertRespInfo.add(SeerportalAPI.getAlertProgramAPI(0, "program_name").get(0));
////		alertRespInfo.add(SeerportalAPI.getAlertReasonAPI("name").get(0));
//		System.out.println(alertRespInfo);
		
		System.out.println(SeerportalAPI.getCaseNamesAPI("title").get(0));
//		SeerportalAPI.getCaseNamesAPI("title");
	}
}
