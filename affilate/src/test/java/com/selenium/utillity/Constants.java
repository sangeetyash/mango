package com.selenium.utillity;

//import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.sun.xml.bind.v2.model.core.ClassInfo;
import com.utility.LogCapture;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

import javax.xml.soap.Text;
import java.awt.*;
import java.util.Properties;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Constants {
    public static Reusables key;
    public static WebDriver driver;
    public static String KEYWORD_PASS = "PASS";
    public static String KEYWORD_FAIL = "FAIL";
    public static Properties CONFIG;
    public static Properties FCGloginPageOR;
    public static Properties FCG_DashboardOR;
    public static Properties FCG_NewRateAlertOR;
    public static String RANDOM_VALUE = "";
    public static LogCapture logs;
    public static Properties FCG_TopupWalletOR;
    public static Properties FCG_MakeTransferOR;
    public static Properties TitanLoginOR;
    public static Properties CreateFxTicketOR;
    public static Properties AtlasloginOR;
    public static Properties AtlasDashboardOR;
    public static Properties AtlasPaymentInQueueOR;
    public static Properties AtlasPaymentOutQueueOR;
    public static Properties SFLoginOR;
    public static Properties LeadGenerationOR;
    public static Properties FCG_ProfileManagementOR;
    public static Properties FCGSignUp;
    public static Properties Affiliates_ForgotPasswordOR;
    public static Properties Refer_a_Client;
    public static Properties Affiliates_LoginPageOR;
    public static Properties WebOutlookEmail;
    public static Properties Affiliates_RegisterACustomerOR;
    public static Properties Affiliates_AccountsPageOR;
    public static Properties Affiliates_NotificationsPageOR;
    public static Properties Affiliates_GlobalPageElementsOR;
    public static Properties Affiliates_SettingsPageOR;
    public static Properties Affiliates_ResourcesPageOR;
    public static Properties Affiliates_ReferralsPageOR;
    public static Properties Affiliates_BecomeaPartnerOR;
    public static Properties Affiliates_CommissionsPageOR;
    public static String FirstNameField = "";
    public static String LastNameField = "";
    public static String SalutationField = "";
    public static String MobileNumberField = "";
    public static String CountryCodeField = "";
    public static String AddressField = "";
    public static String EmailAddress = "";
    public static String PasswordField = "";
    public static String TradingNameField = "";
    public static String CompanyNameField = "";

}
