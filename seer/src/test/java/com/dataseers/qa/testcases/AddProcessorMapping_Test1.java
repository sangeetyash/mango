//package com.dataseers.qa.testcases;
//
//import java.io.IOException;
//import java.net.MalformedURLException;
//
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import com.dataseers.qa.pages.LoginPage;
//import com.dataseers.qa.pages.RegisterPage;
//import com.dataseers.qa.pages.rules_mdm.Processor;
//import com.dataseers.qa.pages.rules_mdm.ProcessorMapping;
//import com.dataseers.qa.util.TestUtil;
//
//public class AddProcessorMapping_Test1 extends TestUtil {
//
//	RegisterPage ds_RegisterPage;
//	LoginPage ds_LoginPage;
//	Processor ds_Processor_page;
//	ProcessorMapping ds_Processor_mapping;
//
//	public AddProcessorMapping_Test1() {
//		super();// Calls the TestBase class
//		log.info("************************** DS-Seed portal Add new client Page TEST  *****************************");
//	}
//
//	@BeforeTest
//	public void setUp() throws MalformedURLException, InterruptedException {
//		try {
//			log.info("Initalizing the seed portal login Page with all fields");
//			intialization();
//			ds_RegisterPage = new RegisterPage(d);
//			ds_LoginPage = new LoginPage(d);
//			ds_Processor_page = new Processor(d);
//			ds_Processor_mapping = new ProcessorMapping(d);
//		} catch (NullPointerException e) {
//			log.error("Unable to load homepage" + e);
//
//		}
//	}
//
//	@Test
//	public void tranasctionMap_Processor_Test1() throws InterruptedException, IOException {
//		try {
//			String user = prop.getProperty("userName");
//			String password = prop.getProperty("passWord");
//
//			String processor = TestUtil.selectquery(dbprop.getProperty("editFileMapping"));
//
//			log.info(processor);
//
////			ds_RegisterPage.proceedtoportal();
//
//			log.info("Seedportal:Login with Valid username and passw0rd");
//			ds_LoginPage.login(user, password);
//
//			ds_LoginPage.verify_successful_login();
//
//			log.info("Seedportal:Redirecting to add new processorpage");
//			ds_Processor_page.processorpage();
//			ds_Processor_page.searchProcessor(processor);
//			ds_Processor_mapping.processorMapIcon();
//
//			ds_Processor_mapping.transactionMapPage();
//			ds_Processor_mapping.addTransactionCode();
//			String transaction = TestUtil.selectquery(dbprop.getProperty("selectTransactionCode"));
//			ds_Processor_mapping.searchTransCode(transaction);
//			ds_Processor_mapping.verifyTransCode(transaction);
//			ds_Processor_mapping.goBackButton();
//
////			ds_Processor_mapping.mapTransCode();
//
//			ds_Processor_mapping.authorizationMapPage();
//			ds_Processor_mapping.addAuthorizationCode();
//			String authorization = TestUtil.selectquery(dbprop.getProperty("selectAuthorizationCode"));
//			ds_Processor_mapping.searchAuthCode(authorization);
//			ds_Processor_mapping.verifyAuthCode(authorization);
//			ds_Processor_mapping.goBackButton();
////			ds_Processor_mapping.mapAuthCode();
//
//			ds_Processor_mapping.accountStatusMapPage();
//			ds_Processor_mapping.addAccountStatusCode();
//			String accountStatus = TestUtil.selectquery(dbprop.getProperty("selectAccountStatusCode"));
//			ds_Processor_mapping.searchAccStatusCode(accountStatus);
//			ds_Processor_mapping.verifyAccStatusCode(accountStatus);
//			ds_Processor_mapping.goBackButton();
////			ds_Processor_mapping.mapAccStatusCode();
//
//			ds_Processor_mapping.cardStatusMapPage();
//			ds_Processor_mapping.addcardStatusCode();
//			String cardStatus = TestUtil.selectquery(dbprop.getProperty("selectCardStatusCode"));
//			ds_Processor_mapping.searchCardStatusCode(cardStatus);
//			ds_Processor_mapping.verifyCardStatusCode(cardStatus);
//			ds_Processor_mapping.goBackButton();
////			ds_Processor_mapping.mapCardStatusCode();
//
//			ds_Processor_mapping.posEntryMapPage();
//			ds_Processor_mapping.addposEntryCode();
//			String posEntry = TestUtil.selectquery(dbprop.getProperty("selectPosEntryCode"));
//			ds_Processor_mapping.searchposEntryCode(posEntry);
//			ds_Processor_mapping.verifyposEntryCode(posEntry);
//			ds_Processor_mapping.goBackButton();
////			ds_Processor_mapping.mapposEntryCode();
//
//			ds_Processor_mapping.networkCodeMapPage();
//			ds_Processor_mapping.addNetworkCode();
//			String network = TestUtil.selectquery(dbprop.getProperty("selectNetworkCode"));
//			ds_Processor_mapping.searchNetworkCode(network);
//			ds_Processor_mapping.verifyNetworkCode(network);
//			ds_Processor_mapping.goBackButton();
////			ds_Processor_mapping.mapNetworkCode();
//
////			log.info("Seedportal:Redirecting back to processor list page");
//
//		} catch (Exception e) {
//			Assert.fail("Edit processor test failed");
//
//		}
//	}
//
//	@AfterClass
//	public void Quit_Browser_Test() {
//		try {
//
//			log.info("Seedportal:Closing the current browser session");
////			d.quit();
//			log.info("******************END**********************");
//			log.info("browser closed");
//		} catch (Exception e) {
//			log.error("browser not closed");
//		}
//	}
//}
