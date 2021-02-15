package com.dataseers.qa.pages.reports.realtimemesseges;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONObject;
import com.dataseers.qa.base.GenerateData;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class ReportsAPItest {

	@SuppressWarnings("unchecked")

	public static void accountAPITest(List<String> accountData) {
		RestAssured.useRelaxedHTTPSValidation();

		RestAssured.baseURI = "https://dev.dataseers.in:3000/services/v2/account";
		RequestSpecification request = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("Account_Number", GenerateData.generateIMEI());
		requestParams.put("Program_ID", "128");
		requestParams.put("Program_Name", "Program 128");
		requestParams.put("Program_Type", "B2C");

		requestParams.put("Product_ID", "6593");
		requestParams.put("Product_Desc", "Product 6593");

		requestParams.put("Group_ID", "12");
		requestParams.put("Group_Desc", "GroupName");
		requestParams.put("Account_Holder_ID", "AH1");
		requestParams.put("Proxy_Number", "003");
		requestParams.put("Issuer", "Bank");
		requestParams.put("DS_Account_Type_Code", "1");
		requestParams.put("DS_Account_Type_Desc", "Fiat");
		requestParams.put("Account_Status_ID", "1");
		requestParams.put("Account_Status_Desc", "open");
		requestParams.put("DS_Account_Status_Code", "1");
		requestParams.put("DS_Account_Status_Desc", "Active");
		requestParams.put("Account_Activated_Date", "20161225");
		requestParams.put("Account_Activated_Time", "000000");
		requestParams.put("Account_Expiration_Date", "20260131");
		requestParams.put("Account_Expiration_Time", "000000");
		requestParams.put("Current_Payment_Due_Date", "20170322");
		requestParams.put("Current_Payment_Due_Time", "000000");
		requestParams.put("Credit_Line", "5000");
		requestParams.put("Available_Credit", "1500.00");
		requestParams.put("Secured_Amount", "1500.00");
		requestParams.put("Ledger_Balance", "400.00");
		requestParams.put("Available_Balance", "566.00");
		requestParams.put("Delinquent_Amount", "200.00");
		requestParams.put("Denom_Amount", "5000.00");
		requestParams.put("Delinquent_Days", "5");
		requestParams.put("Bill_Cycle_Day", "20");
		requestParams.put("Account_Currency_Code", "USD");
		requestParams.put("Fee_Plan_ID", "111111111");
		requestParams.put("Fee_Plan_Desc", "feeplandemo");
		requestParams.put("Wallet_Address", "0");
		requestParams.put("Destination_Tag", "tag");
		requestParams.put("Notes", "testing");
		requestParams.put("Attribute1", "attr1");
		requestParams.put("Attribute2", "attr2");
		requestParams.put("Attribute3", "attr3");
		requestParams.put("Processor", "paypal");
		requestParams.put("As_Of_Date", "20151225");
		requestParams.put("As_Of_Time", "000000");
		request.header("Content-Type", "application/json");
		request.header("api-key", "QwnJcmmXN8xwWsX2dlCd5exdZjMkPvQD");

		request.body(requestParams.toJSONString());
		Response response = request.request(Method.POST);
		ResponseBody<Response> body = response.getBody();
		String bodyStringValue = body.asString();

		// Validate if Response Body Contains a specific String
		Assert.assertTrue(bodyStringValue.contains("user_id"));

		// Get JSON Representation from Response Body
		JsonPath jsonPathEvaluator = response.jsonPath();
		// Get specific element from JSON document
		List<String> responsedata = new ArrayList<>();
		responsedata.add(jsonPathEvaluator.getString("data['user_id']"));

		responsedata.add(jsonPathEvaluator.getString("data['account_number']"));

		responsedata.add(jsonPathEvaluator.getString("data['spik']"));

		responsedata.add(jsonPathEvaluator.getString("data['program_name']"));

		responsedata.add(jsonPathEvaluator.getString("data['product_desc']"));

		responsedata.add(jsonPathEvaluator.getString("data['group_desc']"));

		responsedata.add(jsonPathEvaluator.getString("data['processor']"));

		responsedata.add(jsonPathEvaluator.getString("data['account_holder_id']"));

		responsedata.add(jsonPathEvaluator.getString("data['unique_id']"));

		accountData.addAll(responsedata);
		System.out.println(accountData);

	}

	@SuppressWarnings("unchecked")

	public static void addressAPITest(List<String> addressData) {
		RestAssured.useRelaxedHTTPSValidation();

		RestAssured.baseURI = "https://dev.dataseers.in:3000/services/v2/address";
		RequestSpecification request = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("Account_Number", GenerateData.generateIMEI());
		requestParams.put("Program_ID", "128");
		requestParams.put("Program_Name", "Program 128");
		requestParams.put("Program_Type", "B2C");

		requestParams.put("Product_ID", "6593");
		requestParams.put("Product_Desc", "Product 6593");

		requestParams.put("Group_ID", "12");
		requestParams.put("Group_Desc", "GroupName");
		requestParams.put("Account_Holder_ID", "AH1");

		requestParams.put("Processor", "paypal");
		requestParams.put("As_Of_Date", "20151225");
		requestParams.put("As_Of_Time", "000000");

		requestParams.put("Address_1", "addr1");
		requestParams.put("City", "Thane");
		requestParams.put("State", "Maharashtra");
		requestParams.put("Zip", "400610");
		requestParams.put("Country", "India");
		requestParams.put("Country_Code", "IND");
		requestParams.put("Phone_1", GenerateData.generateRandomNumber(11));
		requestParams.put("Address_Type", "P");

		request.header("Content-Type", "application/json");
		request.header("api-key", "QwnJcmmXN8xwWsX2dlCd5exdZjMkPvQD");

		request.body(requestParams.toJSONString());
		Response response = request.request(Method.POST);
		ResponseBody<Response> body = response.getBody();
		String bodyStringValue = body.asString();
		System.out.println(bodyStringValue);
		// Validate if Response Body Contains a specific String
		Assert.assertTrue(bodyStringValue.contains("user_id"));

		// Get JSON Representation from Response Body
		JsonPath jsonPathEvaluator = response.jsonPath();
		// Get specific element from JSON document
		List<String> responsedata = new ArrayList<>();
		responsedata.add(jsonPathEvaluator.getString("data['user_id']"));

		responsedata.add(jsonPathEvaluator.getString("data['account_number']"));

		responsedata.add(jsonPathEvaluator.getString("data['spik']"));

		responsedata.add(jsonPathEvaluator.getString("data['program_name']"));

		responsedata.add(jsonPathEvaluator.getString("data['product_desc']"));

		responsedata.add(jsonPathEvaluator.getString("data['group_desc']"));

		responsedata.add(jsonPathEvaluator.getString("data['processor']"));

		responsedata.add(jsonPathEvaluator.getString("data['account_holder_id']"));

		responsedata.add(jsonPathEvaluator.getString("data['unique_id']"));

		addressData.addAll(responsedata);
		System.out.println(addressData);

	}

	@SuppressWarnings("unchecked")

	public static void accountHolderAPITest(List<String> accountHolderData) {
		RestAssured.useRelaxedHTTPSValidation();

		RestAssured.baseURI = "https://dev.dataseers.in:3000/services/v2/account-holder";
		RequestSpecification request = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("Account_Number", GenerateData.generateIMEI());
		requestParams.put("Program_ID", "128");
		requestParams.put("Program_Name", "Program 128");
		requestParams.put("Program_Type", "B2C");

		requestParams.put("Product_ID", "6593");
		requestParams.put("Product_Desc", "Product 6593");

		requestParams.put("Group_ID", "12");
		requestParams.put("Group_Desc", "GroupName");
		requestParams.put("Account_Holder_ID", "AH1");

		requestParams.put("Processor", "paypal");
		requestParams.put("As_Of_Date", "20151225");
		requestParams.put("As_Of_Time", "000000");

		requestParams.put("Birth_Date", "19940805");
		requestParams.put("Kycb_Date", "20201225");
		requestParams.put("SSN", "123456789");

		request.header("Content-Type", "application/json");
		request.header("api-key", "QwnJcmmXN8xwWsX2dlCd5exdZjMkPvQD");

		request.body(requestParams.toJSONString());
		Response response = request.request(Method.POST);
		ResponseBody<Response> body = response.getBody();
		String bodyStringValue = body.asString();
		System.out.println(bodyStringValue);
		// Validate if Response Body Contains a specific String
		Assert.assertTrue(bodyStringValue.contains("user_id"));

		// Get JSON Representation from Response Body
		JsonPath jsonPathEvaluator = response.jsonPath();
		// Get specific element from JSON document
		List<String> responsedata = new ArrayList<>();
		responsedata.add(jsonPathEvaluator.getString("data['user_id']"));

		responsedata.add(jsonPathEvaluator.getString("data['account_number']"));

		responsedata.add(jsonPathEvaluator.getString("data['spik']"));

		responsedata.add(jsonPathEvaluator.getString("data['program_name']"));

		responsedata.add(jsonPathEvaluator.getString("data['product_desc']"));

		responsedata.add(jsonPathEvaluator.getString("data['group_desc']"));

		responsedata.add(jsonPathEvaluator.getString("data['processor']"));

		responsedata.add(jsonPathEvaluator.getString("data['account_holder_id']"));

		responsedata.add(jsonPathEvaluator.getString("data['unique_id']"));

		accountHolderData.addAll(responsedata);
		System.out.println(accountHolderData);

	}

	@SuppressWarnings("unchecked")
	public static void cardAPITest(List<String> cardData) {
		RestAssured.useRelaxedHTTPSValidation();

		RestAssured.baseURI = "https://dev.dataseers.in:3000/services/v2/card";
		RequestSpecification request = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("Account_Number", GenerateData.generateIMEI());
		requestParams.put("Program_ID", "128");
		requestParams.put("Program_Name", "Program 128");
		requestParams.put("Program_Type", "B2C");

		requestParams.put("Product_ID", "6593");
		requestParams.put("Product_Desc", "Product 6593");

		requestParams.put("Group_ID", "12");
		requestParams.put("Group_Desc", "GroupName");
		requestParams.put("Account_Holder_ID", "AH1");

		requestParams.put("Processor", "paypal");
		requestParams.put("As_Of_Date", "20151225");
		requestParams.put("As_Of_Time", "000000");

		requestParams.put("Card_ID", "1");
		requestParams.put("Card_Number", GenerateData.generateIMEI());
		requestParams.put("Card_Status_ID", "001111");
		requestParams.put("Card_Expiration_Date", "2020122");
		requestParams.put("Card_Expiration_Time", "000000");
		request.header("Content-Type", "application/json");
		request.header("api-key", "QwnJcmmXN8xwWsX2dlCd5exdZjMkPvQD");

		request.body(requestParams.toJSONString());
		Response response = request.request(Method.POST);
		ResponseBody<Response> body = response.getBody();
		String bodyStringValue = body.asString();
		System.out.println(bodyStringValue);
		// Validate if Response Body Contains a specific String

		// Get JSON Representation from Response Body
		JsonPath jsonPathEvaluator = response.jsonPath();
		// Get specific element from JSON document
		List<String> responsedata = new ArrayList<>();
		responsedata.add(jsonPathEvaluator.getString("data['user_id']"));

		responsedata.add(jsonPathEvaluator.getString("data['account_number']"));

		responsedata.add(jsonPathEvaluator.getString("data['spik']"));

		responsedata.add(jsonPathEvaluator.getString("data['program_name']"));

		responsedata.add(jsonPathEvaluator.getString("data['product_desc']"));

		responsedata.add(jsonPathEvaluator.getString("data['group_desc']"));

		responsedata.add(jsonPathEvaluator.getString("data['processor']"));

		responsedata.add(jsonPathEvaluator.getString("data['account_holder_id']"));

		responsedata.add(jsonPathEvaluator.getString("data['unique_id']"));

		cardData.addAll(responsedata);
		System.out.println(cardData);

	}

	@SuppressWarnings("unchecked")
	public static void transactionAPITest(List<String> transactionData) {
		RestAssured.useRelaxedHTTPSValidation();

		RestAssured.baseURI = "https://dev.dataseers.in:3000/services/v2/transaction";
		RequestSpecification request = RestAssured.given();

		JSONObject requestParams = new JSONObject();
		requestParams.put("Account_Number", GenerateData.generateIMEI());
		requestParams.put("Program_ID", "128");
		requestParams.put("Program_Name", "Program 128");
		requestParams.put("Program_Type", "B2C");

		requestParams.put("Product_ID", "6593");
		requestParams.put("Product_Desc", "Product 6593");

		requestParams.put("Group_ID", "12");
		requestParams.put("Group_Desc", "GroupName");
		requestParams.put("Account_Holder_ID", "AH1");

		requestParams.put("Processor", "paypal");
		requestParams.put("As_Of_Date", "20151225");
		requestParams.put("As_Of_Time", "000000");

		requestParams.put("network_code", "wirex");
		requestParams.put("Transaction_Type", "Authorized");
		requestParams.put("Transaction_Date", "20200202");
		requestParams.put("Ledger_Balance", "10000.000");
		requestParams.put("Available_Balance", "120000");

		requestParams.put("Transaction_Time", "000000");

		requestParams.put("Transaction_Code", "001");
		requestParams.put("Transaction_Desc", "authorized");
		requestParams.put("Transaction_ID", "id001");

		requestParams.put("Transaction_Amount", "20.000");

		requestParams.put("Transaction_Fee_Amount", "0");

		requestParams.put("Authorization_Code", "authorized");
		requestParams.put("Interchange_Fee_Amount", "1000");

		requestParams.put("Cashback_Amount", "1000.0000");
		request.header("Content-Type", "application/json");
		request.header("api-key", "QwnJcmmXN8xwWsX2dlCd5exdZjMkPvQD");

		request.body(requestParams.toJSONString());
		Response response = request.request(Method.POST);
		ResponseBody<Response> body = response.getBody();
		String bodyStringValue = body.asString();
		System.out.println(bodyStringValue);
		// Validate if Response Body Contains a specific String

		// Get JSON Representation from Response Body
		JsonPath jsonPathEvaluator = response.jsonPath();
		// Get specific element from JSON document
		List<String> responsedata = new ArrayList<>();
		responsedata.add(jsonPathEvaluator.getString("data['user_id']"));

		responsedata.add(jsonPathEvaluator.getString("data['account_number']"));

		responsedata.add(jsonPathEvaluator.getString("data['spik']"));

		responsedata.add(jsonPathEvaluator.getString("data['program_name']"));

		responsedata.add(jsonPathEvaluator.getString("data['product_desc']"));

		responsedata.add(jsonPathEvaluator.getString("data['group_desc']"));

		responsedata.add(jsonPathEvaluator.getString("data['processor']"));

		responsedata.add(jsonPathEvaluator.getString("data['account_holder_id']"));

		responsedata.add(jsonPathEvaluator.getString("data['unique_id']"));

		transactionData.addAll(responsedata);
		System.out.println(transactionData);

	}
}