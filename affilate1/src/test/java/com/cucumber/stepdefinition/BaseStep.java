package com.cucumber.stepdefinition;

import com.cucumber.listener.Reporter;
import com.selenium.utillity.Constants;
import com.selenium.utillity.Reusables;

import com.utility.LogCapture;
import com.selenium.utillity.Constants;
//import com.utilities.Log;
import com.utility.LogCapture;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.testng.Assert;

import com.utility.LogCapture;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.logging.Log;
/*import io.cucumber.java.After;
import io.cucumber.java.Before;*/
import org.apache.commons.logging.Log;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Properties;


public class BaseStep {

    public static String scenarioName;

    @Before
    public void intialization(Scenario scenario) throws IOException {
        scenarioName = scenario.getName();

        Constants.key = new Reusables();
        FileInputStream fs = new FileInputStream(System.getProperty("user.dir") + "//src//Config//config.properties");
        Constants.CONFIG = new Properties();
        Constants.CONFIG.load(fs);
        //FCG Login Page OR
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//FCG//FCGloginPageOR.properties");
        Constants.FCGloginPageOR = new Properties();
        Constants.FCGloginPageOR.load(fs);

        //FCG_Dashboard
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//FCG//FCG_DashboardOR.properties");
        Constants.FCG_DashboardOR = new Properties();
        Constants.FCG_DashboardOR.load(fs);

        //FCG_NewRateAlert
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//FCG//FCG_NewRateAlertOR.properties");
        Constants.FCG_NewRateAlertOR = new Properties();
        Constants.FCG_NewRateAlertOR.load(fs);

        //FCG_Top up Wallet
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//FCG//FCG_TopupWalletOR.properties");
        Constants.FCG_TopupWalletOR = new Properties();
        Constants.FCG_TopupWalletOR.load(fs);

        //FCG_Make a Transfer
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//FCG//FCG_MakeTransferOR.properties");
        Constants.FCG_MakeTransferOR = new Properties();
        Constants.FCG_MakeTransferOR.load(fs);

        //Titan Login OR
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//Titan//TitanLoginOR.properties");
        Constants.TitanLoginOR = new Properties();
        Constants.TitanLoginOR.load(fs);

        //Titan_Create FX Ticket
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//Titan//CreateFxTicketOR.properties");
        Constants.CreateFxTicketOR = new Properties();
        Constants.CreateFxTicketOR.load(fs);

        //Atlas Login OR
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//Atlas//AtlasloginOR.properties");
        Constants.AtlasloginOR = new Properties();
        Constants.AtlasloginOR.load(fs);

        //Atlas dashboard OR
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//Atlas//AtlasDashboardOR.properties");
        Constants.AtlasDashboardOR = new Properties();
        Constants.AtlasDashboardOR.load(fs);

        //Atlas AtlasPaymentInQueueOR
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//Atlas//AtlasPaymentInQueueOR.properties");
        Constants.AtlasPaymentInQueueOR = new Properties();
        Constants.AtlasPaymentInQueueOR.load(fs);

        //Atlas_AtlasPaymentOutQueueOR
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//Atlas//AtlasPaymentOutQueueOR.properties");
        Constants.AtlasPaymentOutQueueOR = new Properties();
        Constants.AtlasPaymentOutQueueOR.load(fs);
        //SF Login OR
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//SF//SFLoginOR.properties");
        Constants.SFLoginOR = new Properties();
        Constants.SFLoginOR.load(fs);

//SF LeadGenerationOR
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//SF//LeadGenerationOR.properties");
        Constants.LeadGenerationOR = new Properties();
        Constants.LeadGenerationOR.load(fs);

        // FCG_ProfileManagementOR
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//FCG//FCG_ProfileManagementOR.properties");
        Constants.FCG_ProfileManagementOR = new Properties();
        Constants.FCG_ProfileManagementOR.load(fs);

        // FCG_SignUp
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//FCG//FCGSignUp.properties");
        Constants.FCGSignUp = new Properties();
        Constants.FCGSignUp.load(fs);

        //Affiliates_ForgotPasswordOR
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//Affiliates//Affiliates_ForgotPasswordOR.properties");
        Constants.Affiliates_ForgotPasswordOR = new Properties();
        Constants.Affiliates_ForgotPasswordOR.load(fs);

//Refer_a_Client.properties
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//Affiliates//Refer_a_Client.properties");
        Constants.Refer_a_Client = new Properties();
        Constants.Refer_a_Client.load(fs);

        //Affiliates_LoginPageOR
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//Affiliates//Affiliates_LoginPageOR.properties");
        Constants.Affiliates_LoginPageOR = new Properties();
        Constants.Affiliates_LoginPageOR.load(fs);

        //Affiliates_RegisterACustomerOR
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//Affiliates//Affiliates_RegisterACustomerOR.properties");
        Constants.Affiliates_RegisterACustomerOR = new Properties();
        Constants.Affiliates_RegisterACustomerOR.load(fs);

        //Affiliates_AccountsPageOR
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//Affiliates//Affiliates_AccountsPageOR.properties");
        Constants.Affiliates_AccountsPageOR = new Properties();
        Constants.Affiliates_AccountsPageOR.load(fs);

        //Affiliates_NotificationsPageOR
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//Affiliates//Affiliates_NotificationsPageOR.properties");
        Constants.Affiliates_NotificationsPageOR = new Properties();
        Constants.Affiliates_NotificationsPageOR.load(fs);

        //Affiliates_GlobalPageElementsOR
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//Affiliates//Affiliates_GlobalPageElementsOR.properties");
        Constants.Affiliates_GlobalPageElementsOR = new Properties();
        Constants.Affiliates_GlobalPageElementsOR.load(fs);

        //Affiliates_SettingsPageElementsOR
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//Affiliates//Affiliates_SettingsPageOR.properties");
        Constants.Affiliates_SettingsPageOR = new Properties();
        Constants.Affiliates_SettingsPageOR.load(fs);

        //Affiliates_ResourcesPageElementsOR
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//Affiliates//Affiliates_ResourcesPageOR.properties");
        Constants.Affiliates_ResourcesPageOR = new Properties();
        Constants.Affiliates_ResourcesPageOR.load(fs);

        //Affiliates_ReferralsPageOR
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//Affiliates//Affiliates_ReferralsPageOR.properties");
        Constants.Affiliates_ReferralsPageOR = new Properties();
        Constants.Affiliates_ReferralsPageOR.load(fs);

        //Affiliates_BecomeaPartnerElementsOR
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//Affiliates//Affiliates_BecomeaPartnerOR.properties");
        Constants.Affiliates_BecomeaPartnerOR = new Properties();
        Constants.Affiliates_BecomeaPartnerOR.load(fs);

        //Affiliates_CommissionPageOR
        fs = new FileInputStream(System.getProperty("user.dir") + "//src//test//java//com//Pages//Affiliates//Affiliates_CommissionsPageOR.properties");
        Constants.Affiliates_CommissionsPageOR = new Properties();
        Constants.Affiliates_CommissionsPageOR.load(fs);


        LogCapture.startLog("-------------------------Test Case Validation Started--------------------");


    }

    @After
    public void finish() {

        Constants.driver.quit();
        LogCapture.endLog("-------------------------Test Case Validation Ended--------------------");
    }

    public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File(Constants.key.getReportConfigPath()));

    }


}
