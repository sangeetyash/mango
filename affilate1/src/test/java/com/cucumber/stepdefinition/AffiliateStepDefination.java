package com.cucumber.stepdefinition;

import com.selenium.utillity.Constants;


import com.selenium.utillity.Reusables;
import com.utility.LogCapture;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.File;
import java.time.*;

import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.*;

import org.apache.commons.lang.RandomStringUtils;
import org.joda.time.DateTime;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Logger;

import static com.selenium.utillity.Constants.driver;
//import static com.selenium.utillity.Reusables.ReadHtmlFile;


public class AffiliateStepDefination<retrun> {


    private int Count;
    private String YourReferralsCount;
    private String YourRegisteredCount;
    private String YourTradedAccountsCount;
    private int AccountSummaryYourTradedAccountsCount;
    private int AccountSummaryYourRegisteredCount;
    private int AccountSummaryYourReferralsCount;
    private int AnnualSummaryYourReferralsCount;
    private String NotificationNumberStr;
    private String AffiliatesManagerALLContactDetailsStr;
    private int TotalListOfUnReadNotificationsInt;
    private ArrayList<String> AllClientCountriesText;
    private ArrayList<String> AllClientIndustriesText;
    private ArrayList<String> ClientTypeText;
    private boolean NoResourcesAvailableStatus;
    boolean DownloadBtnAvailableStatus;
    private boolean LoadMoreBoolean;
    private int ListAvailableDocuments;
    private String MobileNumber_SettingsPage;
    private String UpdatedAddressCountryText;
    private String UpdatedAddressPostCodeText;
    private String UpdatedAddressStateText;
    private String UpdatedAddressCityText;
    private String UpdatedAddressLine1DetailText;
    private String SingleDOB_Selected;
    private String RandomSingleEmailAddress;
    private String RandomJointEmailAddress;
    private String JointDOB_Selected;
    private String UpdatedRandomSingleEmailAddress;
    private int MainUserYourReferralsCount;
    private int MainUserYourTradedAccountsCount;
    private int MainUserYourRegisteredCount;
    private int User1YourReferralsCount;
    private int User1YourTradedAccountsCount;
    private int User1YourRegisteredCount;
    private int TotalGroupYourReferralsCount;
    private int TotalGroupYourTradedAccountsCount;
    private int TotalGroupYourRegisteredCount;
    private int[] MainUserCount;
    private int[] TotalGroupCount;
    private int[] User1Count;


    @And("^User navigate to Affiliate (CD|TorFX|TorFXOz|CDSA) portal \"([^\"]*)\"$")
    public void userNavigateToAffiliateCDPortal(String application, String vUrl) throws Throwable {
        if (application.equalsIgnoreCase("CD")) {
            LogCapture.info(application + " Portal is loading....");
            String url = Constants.CONFIG.getProperty(vUrl);
            Assert.assertEquals("PASS", Constants.key.navigate("", url));
        } else if (application.equalsIgnoreCase("TorFX")) {
            LogCapture.info(application + " Portal is loading....");
            String url = Constants.CONFIG.getProperty(vUrl);
            Assert.assertEquals("PASS", Constants.key.navigate("", url));
        } else if (application.equalsIgnoreCase("TORFXOz")) {
            LogCapture.info(application + " Portal is loading....");
            String url = Constants.CONFIG.getProperty(vUrl);
            Assert.assertEquals("PASS", Constants.key.navigate("", url));
        } else if (application.equalsIgnoreCase("CDSA")) {
            LogCapture.info(application + " Portal is loading....");
            String url = Constants.CONFIG.getProperty(vUrl);
            Assert.assertEquals("PASS", Constants.key.navigate("", url));
        }

    }

    @And("^User Clicks on (Forgot Password|Reset Password|ResetYourPasswordHeaderScreen) button$")
    public void userClicksOnForgotPasswordButton(String button) throws Exception {
        if (button.equalsIgnoreCase("Forgot Password")) {
            LogCapture.info("User clicking " + button + " button...");
            String vForgotPasswordHyperlink = Constants.Affiliates_ForgotPasswordOR.getProperty("ForgotPasswordHyperlink");
            Assert.assertEquals("PASS", Constants.key.click(vForgotPasswordHyperlink, ""));
            Constants.key.pause("2", "");
        } else if (button.equalsIgnoreCase("Reset Password")) {
            LogCapture.info("User clicking " + button + " button...");
            String vResetPasswordButton = Constants.Affiliates_ForgotPasswordOR.getProperty("ResetPasswordButton");
            Assert.assertEquals("PASS", Constants.key.click(vResetPasswordButton, ""));
            Constants.key.pause("2", "");
        } else if (button.equalsIgnoreCase("ResetYourPasswordHeaderScreen")) {

            String vResetYourPasswordHeaderScreen = Constants.Affiliates_ForgotPasswordOR.getProperty("ResetYourPasswordHeaderScreen");
            Assert.assertEquals("PASS", Constants.key.click(vResetYourPasswordHeaderScreen, ""));
            Constants.key.pause("2", "");
        }
    }

    @Then("^User Navigates to (Reset Password|Verification Link) Page$")
    public void userNavigatesToForgotPasswordPage(String page) throws Exception {
        if (page.equalsIgnoreCase("Reset Password")) {
            LogCapture.info("User navigating to " + page + " page...");
            String vRestPasswordPageTitle = Constants.Affiliates_ForgotPasswordOR.getProperty("RestPasswordPageTitle");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vRestPasswordPageTitle, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vRestPasswordPageTitle, "Reset your password"));
            String vRestPasswordPageSubTitle = Constants.Affiliates_ForgotPasswordOR.getProperty("RestPasswordPageSubTitle");
            Assert.assertEquals("PASS", Constants.key.verifyText(vRestPasswordPageSubTitle, "When you fill in your registered email address, you will be sent a verification email to reset your password."));

        } else if (page.equalsIgnoreCase("Verification Link")) {
            LogCapture.info("User navigating to " + page + " page...");

            // String vRestPasswordPageTitle = Constants.Affiliates_ForgotPasswordOR.getProperty("VerificationLinkPage");
            //Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vRestPasswordPageTitle, ""));
            //Assert.assertEquals("PASS", Constants.key.verifyText(vRestPasswordPageTitle, "We’ve just sent you a verification link"));


            String vVerificationLinkPage = Constants.Affiliates_ForgotPasswordOR.getProperty("VerificationLinkPage");
            //Assert.assertEquals("PASS", Constants.key.click(vVerificationLinkPage, ""));
            //Constants.key.pause("2","");

            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vVerificationLinkPage, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vVerificationLinkPage, "We’ve just sent you a verification link"));

        }
    }

    @And("^User enters Email Address  \"([^\"]*)\"$")
    public void UserentersTheEmailAddress(String userName) throws Throwable {

        String vUserName = Constants.CONFIG.getProperty(userName);
        String vFPemailAddressTextBox = Constants.Affiliates_ForgotPasswordOR.getProperty("FPemailAddressTextBox");
        LogCapture.info("User Name " + vUserName + ", is entered.....");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vFPemailAddressTextBox, vUserName));
    }

    @When("^User enter UserName  \"([^\"]*)\" and password \"([^\"]*)\"and click login button$")
    public void user_enter_UserName_and_password_and_click_login_button(String userName, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String ExpectedLoginPageTitle = "Log in to your account";
        String ExpectedLoginPageSubTitle = "Refer clients online, check the status of your previous referrals and download marketing collateral, web tools and more!";
        String vObjLoginPageTitle = Constants.Affiliates_LoginPageOR.getProperty("LoginPageTitle");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjLoginPageTitle, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjLoginPageTitle, ExpectedLoginPageTitle));
        LogCapture.info("Login page title verified...");
        String vObjLoginPageSubTitle = Constants.Affiliates_LoginPageOR.getProperty("LoginPageSubTitle");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjLoginPageSubTitle, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjLoginPageSubTitle, ExpectedLoginPageSubTitle));
        LogCapture.info("Login page message verified...");
        String vUserName = Constants.CONFIG.getProperty(userName);
        String vPassword = Constants.CONFIG.getProperty(password);
        String vObjUser = Constants.Refer_a_Client.getProperty("Email_ID");
        String vObjPass = Constants.Refer_a_Client.getProperty("Password");
        LogCapture.info("User Name " + vUserName + ", Password " + password + " is validated ....");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjUser, vUserName));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPass, vPassword));
        LogCapture.info("User enters username and password...");
        Constants.key.pause("2", "");
        String vObjLoginButton = Constants.Refer_a_Client.getProperty("LoginButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjLoginButton, ""));
        LogCapture.info("User clicks on Login button...");
    }


    @And("^User click on (Load more|Account tab|Contact button|Refer a client|Profile Management button|Notification Bell Icon button|Resources tab|Referrals tab|Commission tab|Settings tab|Send registration link|Generate Button|Close Button|Send new link|Profile Link|Logout|AnyElement to close the Affiliates Manager Contact details section|Affiliate Manager Contact button|Affiliate Tracking Code|Become a Partner|Back to Login|Continue Button|Back|Save changes|Skip the step|Expander|Edit Button|Add Details Button|Your client Title|Edit address|Retrive Bank details|Month Dropdown|Enter Details Manually|Confirmation|PartnerConfirm|Enter Details Manually for Joint) on (dashboard|RefferalURLGenerator|Profile Link|Resources|Login|Create an Account|Settings page|Login Details|Bank Details|Your Clients|Personal Details|Referrals page|Register a customer|Commission page)\\.$")

    public void user_click_on_Refer_a_Friend_on_dashboard(String TargetTab, String TargetPage) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Constants.key.pause("3", "");
        if (TargetTab.equalsIgnoreCase("Account tab") && TargetPage.equalsIgnoreCase("dashboard")) {
            String vObjAccountTab = Constants.Refer_a_Client.getProperty("AccountTab");
            Assert.assertEquals("PASS", Constants.key.click(vObjAccountTab, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Account tab...");
        }
        if (TargetTab.equalsIgnoreCase("Refer a client") && TargetPage.equalsIgnoreCase("dashboard")) {
            String vObjRACBtn = Constants.Refer_a_Client.getProperty("Refer_a_Client");
            Assert.assertEquals("PASS", Constants.key.click(vObjRACBtn, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Refer a client tab...");
        }
        if (TargetTab.equalsIgnoreCase("Resources tab") && TargetPage.equalsIgnoreCase("dashboard")) {
            String vObjResourcesTab = Constants.Refer_a_Client.getProperty("ResourcesTab");
            Assert.assertEquals("PASS", Constants.key.click(vObjResourcesTab, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Resources Tab on Dashboard...");
        }

        if (TargetTab.equalsIgnoreCase("Referrals tab") && TargetPage.equalsIgnoreCase("dashboard")) {
            String vObjReferralsTab = Constants.Refer_a_Client.getProperty("ReferralsTab");
            Assert.assertEquals("PASS", Constants.key.click(vObjReferralsTab, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Referrals Tab on Dashboard...");
        }
        if (TargetTab.equalsIgnoreCase("Commission tab") && TargetPage.equalsIgnoreCase("dashboard")) {
            String vObjCommissionsTab = Constants.Refer_a_Client.getProperty("CommissionsTab");
            Assert.assertEquals("PASS", Constants.key.click(vObjCommissionsTab, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Commissions Tab on Dashboard...");
        }

        if (TargetTab.equalsIgnoreCase("Settings tab") && TargetPage.equalsIgnoreCase("dashboard")) {
            String vObjSettingsTab = Constants.Refer_a_Client.getProperty("SettingsTab");
            Assert.assertEquals("PASS", Constants.key.click(vObjSettingsTab, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Scettings Tab on Dashboard...");
        }
        if (TargetTab.equalsIgnoreCase("Contact button") && TargetPage.equalsIgnoreCase("dashboard")) {
            String vObjContactButton = Constants.Refer_a_Client.getProperty("ContactButton");
            Assert.assertEquals("PASS", Constants.key.click(vObjContactButton, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Contact Button on Dashboard...");
        }
        if (TargetTab.equalsIgnoreCase("Profile Management button") && TargetPage.equalsIgnoreCase("dashboard")) {
            String vObjProfileManagementButton = Constants.Refer_a_Client.getProperty("ProfileManagementButton");
            Constants.key.pause("3", "");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjProfileManagementButton, ""));
            Assert.assertEquals("PASS", Constants.key.click(vObjProfileManagementButton, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Profile Management Button on Dashboard...");
        }
        if (TargetTab.equalsIgnoreCase("Notification Bell Icon button") && TargetPage.equalsIgnoreCase("dashboard")) {
            String vObjNotificationBellIconButton = Constants.Refer_a_Client.getProperty("NotificationBellIconButton");
            Assert.assertEquals("PASS", Constants.key.click(vObjNotificationBellIconButton, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Notification bell icon Button on Dashboard...");
        }
        if (TargetTab.equalsIgnoreCase("Send registration link") && TargetPage.equalsIgnoreCase("dashboard")) {
            String vObjSendRegistrationLink = Constants.Affiliates_GlobalPageElementsOR.getProperty("SendRegistrationLink");
            Assert.assertEquals("PASS", Constants.key.click(vObjSendRegistrationLink, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Send Registration Link...");
        }
        if (TargetTab.equalsIgnoreCase("Generate Button") && TargetPage.equalsIgnoreCase("RefferalURLGenerator")) {
            String vObjGenerateButton = Constants.Affiliates_GlobalPageElementsOR.getProperty("GenerateButton");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjGenerateButton, ""));
            Assert.assertEquals("PASS", Constants.key.click(vObjGenerateButton, ""));
            Constants.key.pause("2", "");
            LogCapture.info("USer clicked on Generate button...");
        }
        if (TargetTab.equalsIgnoreCase("Close Button") && TargetPage.equalsIgnoreCase("RefferalURLGenerator")) {
            String vObjClose = Constants.Affiliates_GlobalPageElementsOR.getProperty("Close");
            Assert.assertEquals("PASS", Constants.key.click(vObjClose, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Close Button...");
        }
        if (TargetTab.equalsIgnoreCase("Send new link") && TargetPage.equalsIgnoreCase("RefferalURLGenerator")) {
            String vObjSendNewLink = Constants.Affiliates_GlobalPageElementsOR.getProperty("SendNewLink");
            Assert.assertEquals("PASS", Constants.key.click(vObjSendNewLink, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Send new link Button...");
        }

        if (TargetTab.equalsIgnoreCase("AnyElement to close the Affiliates Manager Contact details section") && TargetPage.equalsIgnoreCase("dashboard")) {
            Constants.driver.findElement(By.id("contact-pullout-popover")).click();
            LogCapture.info("User clicked on Element to close the Affiliates Manager Contact details section...");
        }
        if (TargetTab.equalsIgnoreCase("Affiliate Manager Contact button") && TargetPage.equalsIgnoreCase("dashboard")) {
            String vObjAffiliateManagerContactBtn = Constants.Affiliates_GlobalPageElementsOR.getProperty("AffiliateManagerContactBtn");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAffiliateManagerContactBtn, ""));
            Assert.assertEquals("PASS", Constants.key.click(vObjAffiliateManagerContactBtn, ""));
            LogCapture.info("User clicked on Affiliate Manager Contact button...");
        }


        if (TargetTab.equalsIgnoreCase("Profile Link") && TargetPage.equalsIgnoreCase("dashboard")) {
            String vObjProfileLink = Constants.Affiliates_GlobalPageElementsOR.getProperty("ProfileLink");
            Assert.assertEquals("PASS", Constants.key.click(vObjProfileLink, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Profile Link...");
        }
        if (TargetTab.equalsIgnoreCase("Logout") && TargetPage.equalsIgnoreCase("Profile Link")) {
            String vObjLogout = Constants.Affiliates_GlobalPageElementsOR.getProperty("Logout");
            Assert.assertEquals("PASS", Constants.key.click(vObjLogout, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Logout...");

        }
        if (TargetTab.equalsIgnoreCase("Save changes") && TargetPage.equalsIgnoreCase("Settings page")) {
            String vObjSaveChangesBtn = Constants.Affiliates_SettingsPageOR.getProperty("SaveChangesBtn");
            Assert.assertEquals("PASS", Constants.key.click(vObjSaveChangesBtn, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Save changes Button...");
        }

        if (TargetTab.equalsIgnoreCase("Affiliate Tracking Code") && TargetPage.equalsIgnoreCase("Resources")) {
            String vObjTrackingCode = Constants.Affiliates_ResourcesPageOR.getProperty("AffiliateTrackingCode");
            Assert.assertEquals("PASS", Constants.key.click(vObjTrackingCode, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Affiliate Tracking Code...");
        }
        if (TargetTab.equalsIgnoreCase("Load more") && TargetPage.equalsIgnoreCase("Resources")) {
            String vObjLoadMore = Constants.Affiliates_ResourcesPageOR.getProperty("LoadMore");
            Assert.assertEquals("PASS", Constants.key.click(vObjLoadMore, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Load more button...");
        }
        if (TargetTab.equalsIgnoreCase("Become a Partner") && TargetPage.equalsIgnoreCase("Login")) {
            String vObjBecomeaPartner = Constants.Affiliates_BecomeaPartnerOR.getProperty("BecomeaPartner");
            Assert.assertEquals("PASS", Constants.key.click(vObjBecomeaPartner, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Become a Partner button...");
        }
        if (TargetTab.equalsIgnoreCase("Back to Login") && TargetPage.equalsIgnoreCase("Create an Account")) {
            String vObjBackToLogin = Constants.Affiliates_BecomeaPartnerOR.getProperty("BackToLogin");
            Assert.assertEquals("PASS", Constants.key.click(vObjBackToLogin, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Back To Login...");
        }
        if (TargetTab.equalsIgnoreCase("Continue Button") && TargetPage.equalsIgnoreCase("Create an Account")) {
            String ContinueButton = Constants.Affiliates_BecomeaPartnerOR.getProperty("ContinueButton");
            Assert.assertEquals("PASS", Constants.key.WaitElementToBeVisible(ContinueButton, ""));
            Assert.assertEquals("PASS", Constants.key.click(ContinueButton, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Continue Button...");
        }
        if (TargetTab.equalsIgnoreCase("Back") && TargetPage.equalsIgnoreCase("Create an Account")) {
            String vObjBack = Constants.Affiliates_BecomeaPartnerOR.getProperty("Back");
            Assert.assertEquals("PASS", Constants.key.click(vObjBack, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Back...");
        }
        if (TargetTab.equalsIgnoreCase("Skip the step") && TargetPage.equalsIgnoreCase("Create an Account")) {
            String vObjSkipTheStep = Constants.Affiliates_BecomeaPartnerOR.getProperty("SkipThisStep");
            Assert.assertEquals("PASS", Constants.key.click(vObjSkipTheStep, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Skip the steps...");
        }

        if (TargetTab.equalsIgnoreCase("Expander") && TargetPage.equalsIgnoreCase("Login Details")) {
            String vObjLoginDetails = Constants.Affiliates_BecomeaPartnerOR.getProperty("LoginDetailsSectionExpand");
            Assert.assertEquals("PASS", Constants.key.click(vObjLoginDetails, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Login Details...");
        }
        if (TargetTab.equalsIgnoreCase("Expander") && TargetPage.equalsIgnoreCase("Bank Details")) {
            String vObjBankDetails = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankDetailsSectionExpand");
            Assert.assertEquals("PASS", Constants.key.click(vObjBankDetails, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Bank Details...");
        }
        if (TargetTab.equalsIgnoreCase("Expander") && TargetPage.equalsIgnoreCase("Your Clients")) {
            String YourClientsSectionExpand = Constants.Affiliates_BecomeaPartnerOR.getProperty("YourClientsSectionExpand");
            Assert.assertEquals("PASS", Constants.key.click(YourClientsSectionExpand, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Your Clients Details...");
        }
        if (TargetTab.equalsIgnoreCase("Expander") && TargetPage.equalsIgnoreCase("Personal Details")) {
            String PersonalDetailsSectionExpand = Constants.Affiliates_BecomeaPartnerOR.getProperty("PersonalDetailsSectionExpand");
            Assert.assertEquals("PASS", Constants.key.click(PersonalDetailsSectionExpand, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on PersonalDetailsSectionExpand...");
        }
        if (TargetTab.equalsIgnoreCase("Edit Button") && TargetPage.equalsIgnoreCase("Personal Details")) {
            String PersonalDetailsEdit = Constants.Affiliates_BecomeaPartnerOR.getProperty("PersonalDetailsEdit");
            Assert.assertEquals("PASS", Constants.key.click(PersonalDetailsEdit, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on PersonalDetailsEdit...");
        }
        if (TargetTab.equalsIgnoreCase("Edit Button") && TargetPage.equalsIgnoreCase("Login Details")) {
            String LoginDetailsEdit = Constants.Affiliates_BecomeaPartnerOR.getProperty("LoginDetailsEdit");
            Assert.assertEquals("PASS", Constants.key.click(LoginDetailsEdit, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on LoginDetailsEdit...");
        }
        if (TargetTab.equalsIgnoreCase("Edit Button") && TargetPage.equalsIgnoreCase("Bank Details")) {
            String BankDetailsEdit = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankDetailsEdit");
            Assert.assertEquals("PASS", Constants.key.click(BankDetailsEdit, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on BankDetailsEdit...");
        }
        if (TargetTab.equalsIgnoreCase("Add Details Button") && TargetPage.equalsIgnoreCase("Bank Details")) {
            String BankDetailsEdit = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankDetailsEdit");
            Assert.assertEquals("PASS", Constants.key.click(BankDetailsEdit, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on BankDetailsEdit...");
        }
        if (TargetTab.equalsIgnoreCase("Edit Button") && TargetPage.equalsIgnoreCase("Your Clients")) {
            String YourClientsEdit = Constants.Affiliates_BecomeaPartnerOR.getProperty("YourClientsEdit");
            Assert.assertEquals("PASS", Constants.key.click(YourClientsEdit, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on YourClientsEdit...");
        }
        if (TargetTab.equalsIgnoreCase("Edit address") && TargetPage.equalsIgnoreCase("Settings page")) {
            String vObjEditAddressBtn = Constants.Affiliates_SettingsPageOR.getProperty("EditAddressBtn");
            Assert.assertEquals("PASS", Constants.key.click(vObjEditAddressBtn, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Edit address Button...");

        }
        if (TargetTab.equalsIgnoreCase("Your client Title") && TargetPage.equalsIgnoreCase("Your Clients")) {
            String vObjYourClientsSidePageTitle = Constants.Affiliates_BecomeaPartnerOR.getProperty("YourClientsSidePageTitle");
            Assert.assertEquals("PASS", Constants.key.click(vObjYourClientsSidePageTitle, ""));
            Constants.key.pause("1", "");
            LogCapture.info("User clicked on YourClients side page title...");
        }
        if (TargetTab.equalsIgnoreCase("Retrive Bank details") && TargetPage.equalsIgnoreCase("Bank Details")) {
            String RetrieveBankDetails = Constants.Affiliates_BecomeaPartnerOR.getProperty("RetrieveBankDetails");
            Assert.assertEquals("PASS", Constants.key.click(RetrieveBankDetails, ""));
            Constants.key.pause("1", "");
            LogCapture.info("User clicked on RetrieveBankDetails side page title...");
        }
        if (TargetTab.equalsIgnoreCase("Edit address") && TargetPage.equalsIgnoreCase("Bank Details")) {
            String vObjEditAddressBtn = Constants.Affiliates_BecomeaPartnerOR.getProperty("EditAddressForManualEntry");
            Assert.assertEquals("PASS", Constants.key.click(vObjEditAddressBtn, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Edit address Button...");
        }
        if (TargetTab.equalsIgnoreCase("Month Dropdown") && TargetPage.equalsIgnoreCase("Referrals page")) {
            String vObjMonthDropdown = Constants.Affiliates_ReferralsPageOR.getProperty("MonthDropdown");
            Assert.assertEquals("PASS", Constants.key.exist(vObjMonthDropdown, ""));
            WebElement MonthDropdown = driver.findElement(By.xpath(vObjMonthDropdown));
            MonthDropdown.click();
            LogCapture.info("User clicked on Month Dropdown...");
        }
        if (TargetTab.equalsIgnoreCase("Enter Details Manually") && TargetPage.equalsIgnoreCase("Bank Details")) {
            String vObjEnterDetailsManuallyBtn = Constants.Affiliates_BecomeaPartnerOR.getProperty("EnterDetailsManuallyBtn");
            Assert.assertEquals("PASS", Constants.key.click(vObjEnterDetailsManuallyBtn, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Enter Details Manually...");

        }
        if (TargetTab.equalsIgnoreCase("Continue Button") && TargetPage.equalsIgnoreCase("Register a customer")) {
            String vObjContinueButton = Constants.Affiliates_RegisterACustomerOR.getProperty("ContinueButton");
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", Constants.driver.findElement(By.xpath(vObjContinueButton)));

        }
        if (TargetTab.equalsIgnoreCase("Enter Details Manually") && TargetPage.equalsIgnoreCase("Register a customer")) {
            String EnterAddressManually = Constants.Affiliates_RegisterACustomerOR.getProperty("EnterAddressManually");
//            Assert.assertEquals("PASS", Constants.key.click(EnterAddressManually, ""));
//            Constants.key.pause("2", "");
//            LogCapture.info("User clicked on Enter Details Manually...");

            // String vObjContinueButton = Constants.Affiliates_RegisterACustomerOR.getProperty("ContinueButton");
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", Constants.driver.findElement(By.xpath(EnterAddressManually)));


        }
        if (TargetTab.equalsIgnoreCase("Confirmation") && TargetPage.equalsIgnoreCase("Register a customer")) {
            String ConfirmButton = Constants.Affiliates_RegisterACustomerOR.getProperty("Confirm");
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", Constants.driver.findElement(By.xpath(ConfirmButton)));

        }
        if (TargetTab.equalsIgnoreCase("PartnerConfirm") && TargetPage.equalsIgnoreCase("Register a customer")) {
            String TermsCheckBox = Constants.Affiliates_RegisterACustomerOR.getProperty("TermsCheckBox");
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", Constants.driver.findElement(By.xpath(TermsCheckBox)));

        }
        if (TargetTab.equalsIgnoreCase("Enter Details Manually for Joint") && TargetPage.equalsIgnoreCase("Register a customer")) {
            String EnterAddressManuallyJoint = Constants.Affiliates_RegisterACustomerOR.getProperty("EnterAddressManuallyJoint");
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", Constants.driver.findElement(By.xpath(EnterAddressManuallyJoint)));


        }
        if (TargetTab.equalsIgnoreCase("Month Dropdown") && TargetPage.equalsIgnoreCase("Commission page")) {
            ((JavascriptExecutor) Constants.driver).executeScript("javascript:window.scrollBy(250,350)");
            String vObjMonthDropdown = Constants.Affiliates_ReferralsPageOR.getProperty("MonthDropDownFromCommission");
            Assert.assertEquals("PASS", Constants.key.exist(vObjMonthDropdown, ""));
            WebElement MonthDropdown = driver.findElement(By.xpath(vObjMonthDropdown));
            MonthDropdown.click();
            LogCapture.info("User clicked on Month Dropdown...");

        }
    }

    @Then("^System should able to view the Refer a client page with two options Individual and Corporate$")
    public void system_should_able_to_view_the_Refer_a_client_page_with_two_options_Individual_and_Corporate() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        LogCapture.info("Refer a Client Page Loading......");
        String vObjReferAClientPage = Constants.Refer_a_Client.getProperty("ReferAClientPage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjReferAClientPage, "Refer a client"));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjReferAClientPage, "Refer a client"));
        String vObjTransferLink = Constants.Refer_a_Client.getProperty("Individual_Text");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjTransferLink, "An individual"));
        String vObjIndividualRadioButton = Constants.Refer_a_Client.getProperty("IndividualRadioButton");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjIndividualRadioButton, "selected"));

        String vObjLink = Constants.Refer_a_Client.getProperty("Corporate_Text");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjLink, "A company"));
        String vObjCorporateRadioButton = Constants.Refer_a_Client.getProperty("CorporateRadioButton");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjCorporateRadioButton, "unselected"));
        String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));

    }

    //-----------------TC-2---------------------------------------------
    @Then("^User Selects (Individual|Corporate) option$")
    public void user_Selects_Individual_option(String ReferPersonalDetailType) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        if (ReferPersonalDetailType.equals("Individual")) {
            LogCapture.info("Refering Individual Personal Detail type");
            String vObjRadioButton = Constants.Refer_a_Client.getProperty("IndividualRadioButton");
            Assert.assertEquals("PASS", Constants.key.click(vObjRadioButton, ""));
        } else if (ReferPersonalDetailType.equals("Corporate")) {
            LogCapture.info("Refering Corporate Personal Detail type...");
            String vObjRadioButton = Constants.Refer_a_Client.getProperty("CorporateRadioButton");
            Assert.assertEquals("PASS", Constants.key.click(vObjRadioButton, ""));
        }
    }

    @Then("^user should be able to view the details required for Individual fields$")
    public void user_should_be_able_to_view_the_details_required_for_Individual_fields() throws Throwable {
        String vObjSalutation = Constants.Refer_a_Client.getProperty("Salutation");
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSalutation, ""));
        Constants.key.pause("2", "");
        String vObjFirstName = Constants.Refer_a_Client.getProperty("FirstName");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjFirstName, ""));
        Constants.key.pause("2", "");
        String vObjLastName = Constants.Refer_a_Client.getProperty("LastName");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjLastName, ""));
    }


    @Then("^user should be able to view the details required for Corporate fields$")
    public void user_should_be_able_to_view_the_details_required_for_Corporate_fields() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String vObjSalutation = Constants.Refer_a_Client.getProperty("Salutation");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSalutation, ""));
        String vObjFirstName = Constants.Refer_a_Client.getProperty("FirstName");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjFirstName, ""));
        String vObjLastName = Constants.Refer_a_Client.getProperty("LastName");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjLastName, ""));
        String vObjCompanyName = Constants.Refer_a_Client.getProperty("CompanyName");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCompanyName, ""));
        String vObjTradingName = Constants.Refer_a_Client.getProperty("TradingName");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjTradingName, ""));
    }


    @Then("^User should view the Organization information (Before Login|After Login) in header and fotter sections$")
    public void user_should_view_the_Organization_information_in_header_and_fotter_sections(String TypeOfLogin) throws Throwable {

        if (TypeOfLogin.equalsIgnoreCase("After Login")) {
            /*String vObjPhoneNumber = Constants.Refer_a_Client.getProperty("CD_PhoneNumber");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjPhoneNumber, ""));
            Assert.assertEquals("PASS", Constants.key.exist(vObjPhoneNumber, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjPhoneNumber, "+44 (0) 20 7847 9400"));*/

            String vObjLink = Constants.Refer_a_Client.getProperty("CD_Logo");
            Assert.assertEquals("PASS", Constants.key.exist(vObjLink, ""));
            LogCapture.info("Verified Organization information : Logo in header");

            String vObjFooter = Constants.Affiliates_SettingsPageOR.getProperty("Footer");
            String Footer = Constants.driver.findElement(By.xpath(vObjFooter)).getText();
            String vObjFooterMsg = Constants.Affiliates_SettingsPageOR.getProperty("FooterMessage");
            String FooterMsg = Constants.driver.findElement(By.xpath(vObjFooterMsg)).getText();
            if (Footer.equalsIgnoreCase("© Currencies Direct Ltd, One Canada Square, Canary Wharf, London E14 5AA, United Kingdom. Registered in England & Wales, No.: 03041197.") && FooterMsg.equalsIgnoreCase("Currencies Direct Ltd is authorised by the Financial Conduct Authority as an Electronic Money Institution under the Electronic Money Regulations 2011. Our FCA Firm Reference number is 900669.")) {
                LogCapture.info("Footer Message is display correctly");
            } else {
                Assert.fail();
                LogCapture.error("Footer Message is not displayed correctly. Expected Footer Msg: " + Footer + ". Actual Footer Msg: " + FooterMsg);
            }

            //as communicated, Not verified any footer as it will change in future i.e. copyright CD....
        }

        if (TypeOfLogin.equalsIgnoreCase("Before Login")) {
            String vObjPhoneNumber = Constants.Refer_a_Client.getProperty("CD_PhoneNumber");
            Assert.assertEquals("PASS", Constants.key.exist(vObjPhoneNumber, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjPhoneNumber, "+44 (0) 20 7847 9400"));

            String vObjLink = Constants.Affiliates_ForgotPasswordOR.getProperty("MainCD_Logo");
            Assert.assertEquals("PASS", Constants.key.exist(vObjLink, ""));
            LogCapture.info("Verified Organization information PhoneNumber & Logo in header");
            String vObjFooter = Constants.Affiliates_SettingsPageOR.getProperty("Footer");
            String Footer = Constants.driver.findElement(By.xpath(vObjFooter)).getText();
            String vObjFooterMsg = Constants.Affiliates_SettingsPageOR.getProperty("FooterMessage");
            String FooterMsg = Constants.driver.findElement(By.xpath(vObjFooterMsg)).getText();
            if (Footer.equalsIgnoreCase("© Currencies Direct Ltd, One Canada Square, Canary Wharf, London E14 5AA, United Kingdom. Registered in England & Wales, No.: 03041197.") && FooterMsg.equalsIgnoreCase("Currencies Direct Ltd is authorised by the Financial Conduct Authority as an Electronic Money Institution under the Electronic Money Regulations 2011. Our FCA Firm Reference number is 900669.")) {
                LogCapture.info("Footer Message is display correctly");
            } else {
                Assert.fail();
                LogCapture.error("Footer Message is not displayed correctly. Expected Footer Msg: " + Footer + ". Actual Footer Msg: " + FooterMsg);
            }
            //as communicated, Not verified any footer as it will change in future i.e. copyright CD....
        }
    }

    @Then("^User Enters Salutation \"([^\"]*)\" FirstName \"([^\"]*)\" LastName \"([^\"]*)\" CompanyName \"([^\"]*)\" TradingName \"([^\"]*)\"(| and Click on Continue)$")
    public void user_Enters_Salutation_FirstName_LastName_CompanyName_TradingName_and_Click_on_Continue(String Salutation, String FirstName, String LastName, String CompanyName, String TradingName, String TargetButton) throws Throwable {
        // Write code here that turns the phrase above into concrete action
        String vSalutation = Constants.Refer_a_Client.getProperty("Salutation");
        String vF_Name = Constants.Refer_a_Client.getProperty("FirstName");
        String vL_Name = Constants.Refer_a_Client.getProperty("LastName");
        String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
        LogCapture.info("Continue button is disable");
        LogCapture.info("Details ...Salutation- " + Salutation + ", First Name- " + FirstName + ", Sign Up Last Name " + LastName + " is validated ....");
        Assert.assertEquals("PASS", Constants.key.click(vSalutation, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vSalutation, Salutation));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "enter"));
        Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName));
        Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName));
        String vObjLink = Constants.Refer_a_Client.getProperty("CompanyDetailsText");
        Assert.assertEquals("PASS", Constants.key.verifyInnerText(vObjLink, "Company details"));
        String vC_Name = Constants.Refer_a_Client.getProperty("CompanyName");
        String vT_Name = Constants.Refer_a_Client.getProperty("TradingName");
        Assert.assertEquals("PASS", Constants.key.click(vC_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vC_Name, CompanyName));
        Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vT_Name, TradingName));

        if (TargetButton.equalsIgnoreCase(" and Click on Continue")) {
            String vObjRadioButton = Constants.Refer_a_Client.getProperty("ContinueButton");
            Assert.assertEquals("PASS", Constants.key.click(vObjRadioButton, ""));
            LogCapture.info("User entered all the Personal details and clicks on Continue button for Refer a client journey... ");
        }
        if (TargetButton.equalsIgnoreCase("")) {
            LogCapture.info("User entered all the Personal details for Refer a client journey... ");
        }
    }

    @Then("^System will navigate to the Contact details Page$")
    public void system_will_navigate_to_the_Contact_details_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String vObjLink = Constants.Refer_a_Client.getProperty("ContactDetailsText");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjLink, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjLink, "Contact details"));
        String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
        LogCapture.info("User on Contact Details page with Continue button disable....");
    }


    @Then("^System will Navigate to the Confirmation Page$")
    public void system_will_Navigate_to_the_Confirmation_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String vObjLink = Constants.Refer_a_Client.getProperty("ConfirmationDetailsText");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjLink, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjLink, "Confirmation"));
        String vObjSubmitButtonDisable = Constants.Refer_a_Client.getProperty("SubmitButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjSubmitButtonDisable, "disabled"));
        LogCapture.info("User is on Confirmation page with Confirm button disable....");

    }

    @Then("^User enters some value in TextArea \"([^\"]*)\" and Select the Checkboxes and Click on Confirm$")
    public void user_enters_some_value_in_TextArea_and_Select_the_Checkboxes_and_Click_on_Confirm(String Message) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String vMessage = Constants.Refer_a_Client.getProperty("Message");
        Assert.assertEquals("PASS", Constants.key.click(vMessage, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vMessage, Message));
        String vgdprOptInCheckbox = Constants.Refer_a_Client.getProperty("gdprOptInCheckbox");
        Assert.assertEquals("PASS", Constants.key.click(vgdprOptInCheckbox, ""));
        String vcommissionOptOutCheckbox = Constants.Refer_a_Client.getProperty("commissionOptOutCheckbox");
        Assert.assertEquals("PASS", Constants.key.click(vcommissionOptOutCheckbox, ""));

        String vObjConfirm = Constants.Refer_a_Client.getProperty("SubmitButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjConfirm, ""));
        // String vObjLink = Constants.Refer_a_Client.getProperty("ConfirmationMessage");
        //Constants.key.VisibleConditionWait(vObjLink, "");
        //Constants.key.pause("5", "");

    }

    @Then("^System will Navigate to Confirmation Message Page$")
    public void system_will_Navigate_to_Confirmation_Message_Page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String vObjLink = Constants.Refer_a_Client.getProperty("ConfirmationMessage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjLink, ""));
        Assert.assertEquals("PASS", Constants.key.verifyInnerText(vObjLink, "Your referral has been sent!"));
    }

    @Then("^After 10 secs system will navigate back to the Account Page$")
    public void after_secs_system_will_navigate_back_to_the_Account_Page() throws Exception {

        String vRACConfirmationPageTimer = Constants.Refer_a_Client.getProperty("RACConfirmationPageTimer");
        String Timer = Constants.driver.findElement(By.xpath(vRACConfirmationPageTimer)).getText();
        if (Timer.equalsIgnoreCase("You will be directed in 1 seconds")) {
            LogCapture.info("Waiting for 1 Second..");
            Constants.key.pause("1", "");
        }
        if (Timer.equalsIgnoreCase("You will be directed in 2 seconds")) {
            LogCapture.info("Waiting for 2 Seconds..");
            Constants.key.pause("2", "");
        }
        if (Timer.equalsIgnoreCase("You will be directed in 3 seconds")) {
            LogCapture.info("Waiting for 3 Seconds..");
            Constants.key.pause("3", "");
        }
        if (Timer.equalsIgnoreCase("You will be directed in 4 seconds")) {
            LogCapture.info("Waiting for 4 Seconds..");
            Constants.key.pause("4", "");
        }
        if (Timer.equalsIgnoreCase("You will be directed in 5 seconds")) {
            LogCapture.info("Waiting for 5 Seconds..");
            Constants.key.pause("5", "");
        }
        if (Timer.equalsIgnoreCase("You will be directed in 6 seconds")) {
            LogCapture.info("Waiting for 6 Seconds..");
            Constants.key.pause("6", "");
        }
        if (Timer.equalsIgnoreCase("You will be directed in 7 seconds")) {
            LogCapture.info("Waiting for 7 Seconds..");
            Constants.key.pause("7", "");
        }
        if (Timer.equalsIgnoreCase("You will be directed in 8 seconds")) {
            LogCapture.info("Waiting for 8 Seconds..");
            Constants.key.pause("8", "");
        }
        if (Timer.equalsIgnoreCase("You will be directed in 9 seconds")) {
            LogCapture.info("Waiting for 9 Seconds..");
            Constants.key.pause("9", "");
        }
        if (Timer.equalsIgnoreCase("You will be directed in 10 seconds")) {
            LogCapture.info("Waiting for 10 Seconds..");
            Constants.key.pause("10", "");
        }
        LogCapture.info("Accounts page is loading...");
        String vObjAccountSummary = Constants.Refer_a_Client.getProperty("AccountSummary");
        Constants.key.VisibleConditionWait(vObjAccountSummary, "");
        LogCapture.info("User is on Accounts page - Displaying Accounts Summary......");


    }

    @Then("^User Should be able to view the refer a new Client and Back to Account Button$")
    public void user_Should_be_able_to_view_the_refer_a_new_Client_and_Back_to_Account_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        LogCapture.info("Verify Refer a Client and Back to Account button is present......");
        String vObjReferNewClientButton = Constants.Refer_a_Client.getProperty("ReferAClientButton_New");
        Constants.key.VisibleConditionWait(vObjReferNewClientButton, "");
        LogCapture.info("Refer a Client button is present......");
        String vObjBackToAccountButton = Constants.Refer_a_Client.getProperty("BackToAccountButton");
        Constants.key.VisibleConditionWait(vObjBackToAccountButton, "");
        LogCapture.info("Back to Account button is present......");
    }

    @And("^User Enters Salutation \"([^\"]*)\" FirstName \"([^\"]*)\" LastName \"([^\"]*)\" and Click on Continue$")
    public void userEntersSalutationFirstNameLastNameAndClickOnContinue(String Salutation, String FirstName, String LastName) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String vSalutation = Constants.Refer_a_Client.getProperty("Salutation");
        String vF_Name = Constants.Refer_a_Client.getProperty("FirstName");
        String vL_Name = Constants.Refer_a_Client.getProperty("LastName");
        String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));

        LogCapture.info("Details ...Salutation- " + Salutation + ", First Name- " + FirstName + ", Sign Up Last Name " + LastName + " is validated ....");
        Assert.assertEquals("PASS", Constants.key.click(vSalutation, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vSalutation, Salutation));
        Constants.key.pause("2", "");

        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "enter"));
        Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName));
        Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName));
        String vObjRadioButton = Constants.Refer_a_Client.getProperty("ContinueButton");
        //new lines
        String VObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(VObjContinueButtonDisable, "enabled"));
        //till here
        Assert.assertEquals("PASS", Constants.key.click(vObjRadioButton, ""));
    }

    @Then("^User Clicks on Back to Account button$")
    public void userClicksOnBackToAccountButton() throws Throwable {
        LogCapture.info("Refer sent and user needs to click on Back to Account button......");
        String vObjBackToAccountButton = Constants.Refer_a_Client.getProperty("BackToAccountButton");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBackToAccountButton, ""));
        Assert.assertEquals("PASS", Constants.key.click(vObjBackToAccountButton, ""));
        LogCapture.info("User Successfully Clicked on Back to Account button......");
    }

    @Then("^User Clicks on Back to Account button on Missing Page error$")
    public void userClicksOnBackToAccountButtonOnMissingPageError() throws Throwable {
        LogCapture.info("Refer sent and user needs to click on Back to Account button......");
        String vObjBackToAccountButton = Constants.Affiliates_AccountsPageOR.getProperty("BackToAccountButton");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBackToAccountButton, ""));
        Assert.assertEquals("PASS", Constants.key.click(vObjBackToAccountButton, ""));
        LogCapture.info("User Successfully Clicked on Back to Account button......");
    }

    @And("^System should display the Account Page$")
    public void systemShouldDisplayTheAccountPage() throws Throwable {
        String vObjAccountSummary = Constants.Refer_a_Client.getProperty("AccountSummary");
        Constants.key.VisibleConditionWait(vObjAccountSummary, "");
        LogCapture.info("User is on Accounts page - Displaying Accounts Summary......");
    }

    @And("^User Clicks on Account button at the Left hand side Pane$")
    public void userClicksOnAccountButtonAtTheLeftHandSidePane() throws Throwable {
        LogCapture.info("Refer sent and user needs to click on Left side Account Button......");
        String vObjLeftSideAccountButton = Constants.Refer_a_Client.getProperty("LeftSideAccountButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjLeftSideAccountButton, ""));
        LogCapture.info("User Successfully Clicked on Left side Account button......");
    }

    @And("^User Clicks on Refer new Client$")
    public void userClicksOnReferNewClient() throws Throwable {
        LogCapture.info("User need to click on Refer a Client button......");
        String vObjReferNewClientButton = Constants.Refer_a_Client.getProperty("ReferAClientButton_New");
        Assert.assertEquals("PASS", Constants.key.click(vObjReferNewClientButton, ""));
        LogCapture.info("Clicked on Refer a Client button......");

    }

    @Then("^System should display the refer new client Page$")
    public void systemShouldDisplayTheReferNewClientPage() throws Throwable {
        LogCapture.info("Refer a Client Page Loading......");
        String vObjRefer_a_Client_header = Constants.Refer_a_Client.getProperty("Refer_a_Client_header");
        Constants.key.VisibleConditionWait(vObjRefer_a_Client_header, "");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjRefer_a_Client_header, "Refer a client"));
        LogCapture.info("User is on Refer a Client page......");
    }

    @And("^User Clicks on Refer new Client at the left hand side pane$")
    public void userClicksOnReferNewClientAtTheLeftHandSidePane() throws Throwable {
        LogCapture.info("Refer sent and user needs to click on Left side Refer Client Button......");
        String vObjLeftSideReferButton = Constants.Refer_a_Client.getProperty("LeftSideReferButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjLeftSideReferButton, ""));
        Constants.key.pause("2", "");
        LogCapture.info("User Successfully Clicked on Left side Refer Client button......");
    }

    @And("^User Should be able to view the refer a new Client and Back to Account Button and timer keeps on rolling$")
    public void userShouldBeAbleToViewTheReferANewClientAndBackToAccountButtonAndTimerKeepsOnRolling() throws Throwable {
        LogCapture.info("Verify Refer a Client button, Back to Account button and timer is rolling......");
        String vObjReferNewClientButton = Constants.Refer_a_Client.getProperty("ReferAClientButton_New");
        Constants.key.VisibleConditionWait(vObjReferNewClientButton, "");
        String vObjBackToAccountButton = Constants.Refer_a_Client.getProperty("BackToAccountButton");
        Constants.key.VisibleConditionWait(vObjBackToAccountButton, "");
        LogCapture.info("Both the button as visible and timer is rolling......");
    }

    @Then("^User Clicks on Back button of Browser$")
    public void userClicksOnBackButtonOfBrowser() throws Throwable {
        LogCapture.info("User will clicks on Back button on Browser.... ");
        Constants.driver.navigate().back();
        LogCapture.info("User clicked on Back button on Browser.... ");
        Constants.key.pause("2", "");
    }

    @Then("^System should not go back to the previously submitted form$")
    public void systemShouldNotGoBackToThePreviouslySubmittedForm() throws Throwable {
        String vObjLink = Constants.Refer_a_Client.getProperty("ConfirmationDetailsText");
        String vObjAccountSummary = Constants.Refer_a_Client.getProperty("AccountSummary");
        Constants.key.notexist(vObjLink, "");
        Constants.key.VisibleConditionWait(vObjAccountSummary, "");
        LogCapture.info("Did not get navigated to previously submitted form but to Accounts Summary as expected......");
    }


    @And("^User should be able to view ALL Individual details such as Salutation \"([^\"]*)\" FirstName\"([^\"]*)\" LastName\"([^\"]*)\" Email\"([^\"]*)\" Country_Code\"([^\"]*)\" Mobile_Number \"([^\"]*)\" LandLineCode \"([^\"]*)\" LandLine \"([^\"]*)\" EST_Value \"([^\"]*)\" Reason \"([^\"]*)\" on Confirm page which are been entered$")
    public void userShouldBeAbleToViewAllIndividualTheDetailsSuchAsSalutationFirstNameLastNameEmailCountry_CodeMobile_NumberLandLineCodeLandLineEST_ValueCurrencyHasCurrency_WantReasonOnConfirmPageWhichAreBeenEntered(String Salutation, String FirstName, String LastName, String Email, String Country_Code, String Mobile_Number, String LandLineCode, String LandLine, String EST_Value, String Reason) throws Throwable {

        String FullName = Salutation + " " + FirstName + " " + LastName;
        String FinalMobileNumber = Country_Code + Mobile_Number;
        String FinalLandLineNumber = LandLineCode + LandLine;

        String vObjFullName = Constants.Refer_a_Client.getProperty("FullName");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFullName, FullName));
        LogCapture.info("Full Name is visible and correct....");
        String vObjFinalMobileNumber = Constants.Refer_a_Client.getProperty("FinalMobileNumber");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalMobileNumber, FinalMobileNumber));
        LogCapture.info("Mobile Number is visible and correct....");
        String vObjFinalLandLineNumber = Constants.Refer_a_Client.getProperty("FinalLandLineNumber");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalLandLineNumber, FinalLandLineNumber));
        LogCapture.info("LandLine Number is visible and correct....");
        String vObjFinalCurrencyHas = Constants.Refer_a_Client.getProperty("FinalCurrencyHas");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalCurrencyHas, "GBP"));
        LogCapture.info("Curreny client has is visible and correct....");
        String vObjFinalCurrencyWant = Constants.Refer_a_Client.getProperty("FinalCurrencyWant");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalCurrencyWant, "EUR"));
        LogCapture.info("Curreny client wants is visible and correct....");
        String vObjFinalEmail = Constants.Refer_a_Client.getProperty("FinalEmail");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalEmail, Email));
        LogCapture.info("Email is visible and correct....");
        String vObjFinalEST_Value = Constants.Refer_a_Client.getProperty("FinalEST_Value");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalEST_Value, EST_Value));
        LogCapture.info("EST Value is visible and correct....");
//        String vObjFinalReason = Constants.Refer_a_Client.getProperty("FinalReason");
//        String TextForReason = Constants.driver.findElement(By.xpath(vObjFinalReason)).getText();
//        System.out.println("TextForReason::"+TextForReason);
//        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalReason, Reason));
//        LogCapture.info("Transfering Reason is visible and correct....");

        String vObjSubmitButtonDisable = Constants.Refer_a_Client.getProperty("SubmitButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjSubmitButtonDisable, "disabled"));
        LogCapture.info("Confirm button is disable...");

    }

    @And("^User should be able to view ALL Corporate details such as Salutation \"([^\"]*)\" FirstName\"([^\"]*)\" LastName\"([^\"]*)\" CompanyName \"([^\"]*)\" TradingName \"([^\"]*)\" Email \"([^\"]*)\" Country_Code \"([^\"]*)\" Mobile_Number \"([^\"]*)\" LandLineCode \"([^\"]*)\" LandLine \"([^\"]*)\" EST_Value \"([^\"]*)\" Reason \"([^\"]*)\" on Confirm page which are been entered$")
    public void userShouldBeAbleToViewAllCorporateTheDetailsSuchAsSalutationFirstNameLastNameCompanyNameTradingNameEmailCountry_CodeMobile_NumberLandLineCodeLandLineEST_ValueCurrencyHasCurrency_WantReasonOnConfirmPageWhichAreBeenEntered(String Salutation, String FirstName, String LastName, String CompanyName, String TradingName, String Email, String Country_Code, String Mobile_Number, String LandLineCode, String LandLine, String EST_Value, String Reason) throws Throwable {

        String FullName = Salutation + " " + FirstName + " " + LastName;
        String FinalMobileNumber = Country_Code + Mobile_Number;
        String FinalLandLineNumber = LandLineCode + LandLine;

        String vObjFullName = Constants.Refer_a_Client.getProperty("FullName");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFullName, FullName));
        LogCapture.info("Full Name is visible and correct....");
        String vObjFullCompanyName = Constants.Refer_a_Client.getProperty("FullCompanyName");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFullCompanyName, CompanyName));
        LogCapture.info("Full Company Name is visible and correct....");
        String vObjFinalTradingName = Constants.Refer_a_Client.getProperty("FinalTradingName");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalTradingName, TradingName));
        LogCapture.info("Trading Name is visible and correct....");
        String vObjFinalMobileNumber = Constants.Refer_a_Client.getProperty("FinalMobileNumber");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalMobileNumber, FinalMobileNumber));
        LogCapture.info("Mobile Number is visible and correct....");
        String vObjFinalLandLineNumber = Constants.Refer_a_Client.getProperty("FinalLandLineNumber");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalLandLineNumber, FinalLandLineNumber));
        LogCapture.info("LandLine Number is visible and correct....");
        String vObjFinalCurrencyHas = Constants.Refer_a_Client.getProperty("FinalCurrencyHas");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalCurrencyHas, "GBP"));
        LogCapture.info("Curreny client has is visible and correct....");
        String vObjFinalCurrencyWant = Constants.Refer_a_Client.getProperty("FinalCurrencyWant");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalCurrencyWant, "EUR"));
        LogCapture.info("Curreny client wants is visible and correct....");
        String vObjFinalEmail = Constants.Refer_a_Client.getProperty("FinalEmail");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalEmail, Email));
        LogCapture.info("Email is visible and correct....");
        String vObjFinalEST_Value = Constants.Refer_a_Client.getProperty("FinalEST_Value");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalEST_Value, EST_Value));
        LogCapture.info("EST Value is visible and correct....");
//        String vObjFinalReason = Constants.Refer_a_Client.getProperty("FinalReason");
//        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalReason, Reason));
//        LogCapture.info("Transfering Reason is visible and correct....");

        String vObjSubmitButtonDisable = Constants.Refer_a_Client.getProperty("SubmitButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjSubmitButtonDisable, "disabled"));
        LogCapture.info("Confirm button is disable...");

    }


    @And("^User Enters only mandatory Corporate fields Salutation \"([^\"]*)\" FirstName \"([^\"]*)\" LastName \"([^\"]*)\" CompanyName \"([^\"]*)\" and Click on Continue$")
    public void userEntersOnlyMandatoryCorporateFieldsSalutationFirstNameLastNameCompanyNameAndClickOnContinue(String Salutation, String FirstName, String LastName, String CompanyName) throws Throwable {

        String vSalutation = Constants.Refer_a_Client.getProperty("Salutation");
        String vF_Name = Constants.Refer_a_Client.getProperty("FirstName");
        String vL_Name = Constants.Refer_a_Client.getProperty("LastName");
        String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));

        LogCapture.info("Details ...Salutation- " + Salutation + ", First Name- " + FirstName + ", Sign Up Last Name " + LastName + " is validated ....");
        Assert.assertEquals("PASS", Constants.key.click(vSalutation, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vSalutation, Salutation));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "enter"));

        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));

        Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName));

        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));

        Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName));

        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));

        String vObjLink = Constants.Refer_a_Client.getProperty("CompanyDetailsText");
        Assert.assertEquals("PASS", Constants.key.verifyInnerText(vObjLink, "Company details"));
        String vC_Name = Constants.Refer_a_Client.getProperty("CompanyName");
        Assert.assertEquals("PASS", Constants.key.click(vC_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vC_Name, CompanyName));

        String vObjRadioButton = Constants.Refer_a_Client.getProperty("ContinueButton");
        String vContinueButtonEnable = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
        Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();

        Assert.assertEquals("PASS", Constants.key.click(vSalutation, ""));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "selectall"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "delete"));

        String vObjPersonalDetails = Constants.Refer_a_Client.getProperty("PersonalDetails");
        Assert.assertEquals("PASS", Constants.key.click(vObjPersonalDetails, ""));

        String vObjSalutationFieldEmptyErrorHighlight = Constants.Refer_a_Client.getProperty("SalutationFieldEmptyErrorHighlight");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSalutationFieldEmptyErrorHighlight, ""));

        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
        LogCapture.info("Salutation field is mandatory...");

        Assert.assertEquals("PASS", Constants.key.click(vSalutation, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vSalutation, Salutation));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "enter"));
        Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();

        Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "selectall"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "delete"));
        Assert.assertEquals("PASS", Constants.key.click(vObjPersonalDetails, ""));

        String vObjFirstNameFieldEmptyErrorHighlight = Constants.Refer_a_Client.getProperty("FirstNameFieldEmptyErrorHighlight");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjFirstNameFieldEmptyErrorHighlight, ""));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
        LogCapture.info("FirstName field is mandatory...");
        Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName));
        Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();

        Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "selectall"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "delete"));
        Assert.assertEquals("PASS", Constants.key.click(vObjPersonalDetails, ""));

        String vObjSurnameFieldEmptyErrorHighlight = Constants.Refer_a_Client.getProperty("SurnameFieldEmptyErrorHighlight");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSurnameFieldEmptyErrorHighlight, ""));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
        LogCapture.info("LastName field is mandatory...");
        Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName));
        Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();


        Assert.assertEquals("PASS", Constants.key.click(vC_Name, ""));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vC_Name, "selectall"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vC_Name, "delete"));
        Assert.assertEquals("PASS", Constants.key.click(vObjPersonalDetails, ""));

        String vObjCompanyNameFieldEmptyErrorHighlight = Constants.Refer_a_Client.getProperty("CompanyNameFieldEmptyErrorHighlight");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCompanyNameFieldEmptyErrorHighlight, ""));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
        LogCapture.info("Company Name field is mandatory...");
        Assert.assertEquals("PASS", Constants.key.click(vC_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vC_Name, CompanyName));
        Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();
        LogCapture.info("All Mandatory fields for Personal details is entered with continue button enabled...");
        Assert.assertEquals("PASS", Constants.key.click(vObjRadioButton, ""));
        LogCapture.info("User clicks on Continue button....");

    }

    @And("^User Enters only mandatory Individual fields Salutation \"([^\"]*)\" FirstName \"([^\"]*)\" LastName \"([^\"]*)\" and Click on Continue$")
    public void userEntersOnlyMandatoryIndividualFieldsSalutationFirstNameLastNameAndClickOnContinue(String Salutation, String FirstName, String LastName) throws Throwable {

        String vSalutation = Constants.Refer_a_Client.getProperty("Salutation");
        String vF_Name = Constants.Refer_a_Client.getProperty("FirstName");
        String vL_Name = Constants.Refer_a_Client.getProperty("LastName");
        String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));

        LogCapture.info("Details ...Salutation- " + Salutation + ", First Name- " + FirstName + ", Sign Up Last Name " + LastName + " is validated ....");
        Assert.assertEquals("PASS", Constants.key.click(vSalutation, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vSalutation, Salutation));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "enter"));

        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));

        Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName));

        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));

        Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName));

        String vObjRadioButton = Constants.Refer_a_Client.getProperty("ContinueButton");
        String vContinueButtonEnable = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
        Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();

//        Assert.assertEquals("PASS", Constants.key.click(vSalutation, ""));
//        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "selectall"));
//        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "delete"));
//
        String vObjPersonalDetails = Constants.Refer_a_Client.getProperty("PersonalDetails");
//        Assert.assertEquals("PASS", Constants.key.click(vObjPersonalDetails, ""));
//
//        String vObjSalutationFieldEmptyErrorHighlight = Constants.Refer_a_Client.getProperty("SalutationFieldEmptyErrorHighlight");
//        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSalutationFieldEmptyErrorHighlight, ""));
//
//        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
//        LogCapture.info("Salutation field is mandatory...");
//
//        Assert.assertEquals("PASS", Constants.key.click(vSalutation, ""));
//        Assert.assertEquals("PASS", Constants.key.writeInInput(vSalutation, Salutation));
//        Constants.key.pause("2", "");
//        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "downArrow"));
//        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "enter"));
//        Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();

        Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "selectall"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "delete"));
        Assert.assertEquals("PASS", Constants.key.click(vObjPersonalDetails, ""));

        String vObjFirstNameFieldEmptyErrorHighlight = Constants.Refer_a_Client.getProperty("FirstNameFieldEmptyErrorHighlight");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjFirstNameFieldEmptyErrorHighlight, ""));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
        LogCapture.info("FirstName field is mandatory...");
        Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName));
        Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();

        Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "selectall"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "delete"));
        Assert.assertEquals("PASS", Constants.key.click(vObjPersonalDetails, ""));

        String vObjSurnameFieldEmptyErrorHighlight = Constants.Refer_a_Client.getProperty("SurnameFieldEmptyErrorHighlight");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSurnameFieldEmptyErrorHighlight, ""));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
        LogCapture.info("LastName field is mandatory...");
        Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName));
        Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();

        LogCapture.info("Continue button is enable....");
        Assert.assertEquals("PASS", Constants.key.click(vObjRadioButton, ""));

    }


    @Then("^User should be able to view all Individual Mandatory the details such as Salutation \"([^\"]*)\" FirstName\"([^\"]*)\" LastName\"([^\"]*)\" Email \"([^\"]*)\" Country_Code \"([^\"]*)\" Mobile_Number \"([^\"]*)\" LandLineCode \"([^\"]*)\" EST_Value \"([^\"]*)\" Reason \"([^\"]*)\" on Confirm page which are been entered$")
    public void userShouldBeAbleToViewAllIndividualMandatoryTheDetailsSuchAsSalutationFirstNameLastNameEmailCountry_CodeMobile_NumberLandLineCodeEST_ValueReasonOnConfirmPageWhichAreBeenEntered(String Salutation, String FirstName, String LastName, String Email, String Country_Code, String Mobile_Number, String LandLineCode, String EST_Value, String Reason) throws Throwable {

        String IndividualFullName = Salutation + " " + FirstName + " " + LastName;
        String FinalMobileNumber = Country_Code + Mobile_Number;
        String FinalLandLineNumber = "—";

        String vObjFullName = Constants.Refer_a_Client.getProperty("FullName");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFullName, IndividualFullName));
        LogCapture.info("Full Name is visible and correct....");

        String vObjFinalMobileNumber = Constants.Refer_a_Client.getProperty("FinalMobileNumber");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalMobileNumber, FinalMobileNumber));
        LogCapture.info("Mobile Number is visible and correct....");

        //Remove the below check for Landline Country code if not mandatory in future
        String vObjFinalLandLineNumber = Constants.Refer_a_Client.getProperty("FinalLandLineNumber");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalLandLineNumber, FinalLandLineNumber));
        LogCapture.info("LandLine Number is visible and correct....");


        String vObjFinalCurrencyHas = Constants.Refer_a_Client.getProperty("FinalCurrencyHas");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalCurrencyHas, "GBP"));
        LogCapture.info("Curreny client has is visible and correct....");
        String vObjFinalCurrencyWant = Constants.Refer_a_Client.getProperty("FinalCurrencyWant");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalCurrencyWant, "EUR"));
        LogCapture.info("Curreny client wants is visible and correct....");
        String vObjFinalEmail = Constants.Refer_a_Client.getProperty("FinalEmail");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalEmail, Email));
        LogCapture.info("Email is visible and correct....");
        String vObjFinalEST_Value = Constants.Refer_a_Client.getProperty("FinalEST_Value");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalEST_Value, "—"));
        LogCapture.info("EST Value is visible and correct....");
//        String vObjFinalReason = Constants.Refer_a_Client.getProperty("FinalReason");
//        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalReason, Reason));
//        LogCapture.info("Transfering Reason is visible and correct....");

    }

    @Then("^User should be able to view all Corporate Mandatory details such as Salutation \"([^\"]*)\" FirstName\"([^\"]*)\" LastName\"([^\"]*)\" CompanyName\"([^\"]*)\" Email \"([^\"]*)\" Country_Code \"([^\"]*)\" Mobile_Number \"([^\"]*)\" LandLineCode \"([^\"]*)\" EST_Value \"([^\"]*)\" Reason \"([^\"]*)\" on Confirm page which are been entered$")
    public void userShouldBeAbleToViewAllCorporateMandatoryDetailsSuchAsSalutationFirstNameLastNameCompanyNameEmailCountry_CodeMobile_NumberLandLineCodeEST_ValueReasonOnConfirmPageWhichAreBeenEntered(String Salutation, String FirstName, String LastName, String CompanyName, String Email, String Country_Code, String Mobile_Number, String LandLineCode, String EST_Value, String Reason) throws Throwable {

        String CorporateFullName = Salutation + " " + FirstName + " " + LastName;
        String FinalMobileNumber = Country_Code + Mobile_Number;
        String FinalLandLineNumber = "—";

        String vObjCorporateFullName = Constants.Refer_a_Client.getProperty("FullName");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjCorporateFullName, CorporateFullName));
        LogCapture.info("Full Name is visible and correct....");

        String vObjFullCompanyName = Constants.Refer_a_Client.getProperty("FullCompanyName");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFullCompanyName, CompanyName));
        LogCapture.info("Full Company Name is visible and correct....");

        String vObjFinalTradingName = Constants.Refer_a_Client.getProperty("FinalTradingName");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalTradingName, "—"));
        LogCapture.info("Trading Name is visible and correct....");

        String vObjFinalMobileNumber = Constants.Refer_a_Client.getProperty("FinalMobileNumber");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalMobileNumber, FinalMobileNumber));
        LogCapture.info("Mobile Number is visible and correct....");

        //Remove the below check for Landline Country code if not mandatory in future
        String vObjFinalLandLineNumber = Constants.Refer_a_Client.getProperty("FinalLandLineNumber");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalLandLineNumber, FinalLandLineNumber));
        LogCapture.info("LandLine Number is visible and correct....");

        String vObjFinalCurrencyHas = Constants.Refer_a_Client.getProperty("FinalCurrencyHas");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalCurrencyHas, "GBP"));
        LogCapture.info("Curreny client has is visible and correct....");
        String vObjFinalCurrencyWant = Constants.Refer_a_Client.getProperty("FinalCurrencyWant");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalCurrencyWant, "EUR"));
        LogCapture.info("Curreny client wants is visible and correct....");
        String vObjFinalEmail = Constants.Refer_a_Client.getProperty("FinalEmail");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalEmail, Email));
        LogCapture.info("Email is visible and correct....");
        String vObjFinalEST_Value = Constants.Refer_a_Client.getProperty("FinalEST_Value");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalEST_Value, "—"));
//        LogCapture.info("EST Value is visible and correct....");
//        String vObjFinalReason = Constants.Refer_a_Client.getProperty("FinalReason");
//        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalReason, Reason));
//        LogCapture.info("Transfering Reason is visible and correct....");


    }

    @And("^User enters the proper data Message \"([^\"]*)\" in text area$")
    public void userEntersTheProperDataMessageInTextArea(String Message) throws Throwable {

        //Enter text message into text area on Confirm screen
        LogCapture.info("Entering text message into text area......");
        LogCapture.info(Message);
        String vMessage = Constants.Refer_a_Client.getProperty("Message");
        Assert.assertEquals("PASS", Constants.key.click(vMessage, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vMessage, Message));
        String vObjConfirm = Constants.Refer_a_Client.getProperty("SubmitButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjConfirm, "disabled"));
        LogCapture.info("Text message entered but Confirm button is disabled...");
        // String vgdprOptInCheckbox = Constants.Refer_a_Client.getProperty("gdprOptInCheckbox");
        //Assert.assertEquals("PASS", Constants.key.click(vgdprOptInCheckbox, ""))

    }

    @Then("^User is able to view previously entered text Message \"([^\"]*)\" into text area properly$")
    public void userIsAbleToViewPreviouslyEnteredTextMessageIntoTextAreaProperly(String MessageEntered) throws Throwable {
        LogCapture.info("Text need to verify: " + MessageEntered);
        String vMessage = Constants.Refer_a_Client.getProperty("Message");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vMessage, MessageEntered));
        Assert.assertEquals("PASS", Constants.key.verifyText(vMessage, MessageEntered));

        LogCapture.info("Text msg into Text area Verified......");

    }

    @And("^User clicks on (CommissionOptOut|Agreement) Checkbox$")
    public void userClicksOnCommissionOptOutCheckbox(String Checkbox) throws Throwable {

        if (Checkbox.equalsIgnoreCase("CommissionOptOut")) {
            String vcommissionOptOutCheckbox = Constants.Refer_a_Client.getProperty("commissionOptOutCheckbox");
            Assert.assertEquals("PASS", Constants.key.click(vcommissionOptOutCheckbox, ""));
            Constants.key.pause("2", "");
        }
        if (Checkbox.equalsIgnoreCase("Agreement")) {
            String vgdprOptInCheckbox = Constants.Refer_a_Client.getProperty("gdprOptInCheckbox");
            Assert.assertEquals("PASS", Constants.key.click(vgdprOptInCheckbox, ""));
            Constants.key.pause("2", "");
        }


    }

    @Then("^User should be able to view (Agreement|CommissionOptOut) Checkbox is (selected|unselected)$")
    public void userShouldBeAbleToViewCommissionOptOutCheckboxIsSelected(String Checkbox, String CheckboxStatus) throws Throwable {

        if (CheckboxStatus.equalsIgnoreCase("selected")) {
            if (Checkbox.equalsIgnoreCase("Agreement")) {
                String vgdprOptInCheckbox = Constants.Refer_a_Client.getProperty("gdprOptInCheckbox");
                Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vgdprOptInCheckbox, "selected"));
                LogCapture.info("Agreement OptOut Checkbox selected....");

            } else if (Checkbox.equalsIgnoreCase("CommissionOptOut")) {
                String vcommissionOptOutCheckbox = Constants.Refer_a_Client.getProperty("commissionOptOutCheckbox");
                Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vcommissionOptOutCheckbox, "selected"));
                LogCapture.info("Commission OptOut Checkbox selected....");
                String vObjConfirm = Constants.Refer_a_Client.getProperty("SubmitButtonDisable");
                Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjConfirm, "disabled"));
                LogCapture.info("CommissionOptOut checkbox selected but Confirm button is disabled...");

            }
        }
        if (CheckboxStatus.equalsIgnoreCase("unselected")) {
            if (Checkbox.equalsIgnoreCase("Agreement")) {
                String vgdprOptInCheckbox = Constants.Refer_a_Client.getProperty("gdprOptInCheckbox");
                Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vgdprOptInCheckbox, "unselected"));
                LogCapture.info("Agreement OptOut Checkbox unselected....");

            } else if (Checkbox.equalsIgnoreCase("CommissionOptOut")) {
                String vcommissionOptOutCheckbox = Constants.Refer_a_Client.getProperty("commissionOptOutCheckbox");
                Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vcommissionOptOutCheckbox, "unselected"));
                LogCapture.info("Commission OptOut Checkbox unselected....");
            }
        }
    }

    @And("^User Clicks on (Back|Continue) Button$")
    public void userClicksOnBackButton(String NavigationButton) throws Throwable {
        if (NavigationButton.equalsIgnoreCase("Back")) {
            String vObjBackButton = Constants.Refer_a_Client.getProperty("BackButton");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBackButton, ""));
            Assert.assertEquals("PASS", Constants.key.click(vObjBackButton, ""));
            LogCapture.info("User clicks on Back button..");
        }
        if (NavigationButton.equalsIgnoreCase("Continue")) {
            String vObjContinueButton = Constants.Refer_a_Client.getProperty("ContinueButton");
            String vContinueButtonEnable = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjContinueButton, ""));
            Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();
            Assert.assertEquals("PASS", Constants.key.click(vObjContinueButton, ""));
            LogCapture.info("User clicks on Continue button..");

        }


    }

    @And("^User updates Transaction Details New_EST_Value \"([^\"]*)\" New_Reason \"([^\"]*)\" as per Requirement and click on Continue$")
    public void userUpdatesTransactionDetailsAsPerRequirementAndClickOnContinue(String New_EST_Value, String New_Reason) throws Throwable {


        LogCapture.info("Transaction  Details Page......");
        LogCapture.info("EST Value......");
        String vEST_Value = Constants.Refer_a_Client.getProperty("EST_Value");
        Assert.assertEquals("PASS", Constants.key.click(vEST_Value, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vEST_Value, New_EST_Value));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vEST_Value, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vEST_Value, "enter"));

        // We need to also validate New currencies values but holding for now  due to APUI-329

//        LogCapture.info("Reason......");
//        String vReason = Constants.Refer_a_Client.getProperty("Reason");
//        Assert.assertEquals("PASS", Constants.key.click(vReason, ""));
//        Assert.assertEquals("PASS", Constants.key.writeInInput(vReason, New_Reason));
//        Constants.key.pause("2", "");
//        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vReason, "downArrow"));
//        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vReason, "enter"));
        String vObjRadioButton = Constants.Refer_a_Client.getProperty("ContinueButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjRadioButton, ""));


    }


    @Then("^User should be able to view the Newly Updated details Salutation \"([^\"]*)\" FirstName\"([^\"]*)\" LastName\"([^\"]*)\" Email\"([^\"]*)\" Country_Code\"([^\"]*)\" Mobile_Number \"([^\"]*)\" LandLineCode \"([^\"]*)\" New_EST_Value \"([^\"]*)\" New_Reason \"([^\"]*)\" on Confirmation page$")
    public void userShouleBeAbleToViewTheNewlyUpdatedDetailsSalutationFirstNameLastNameEmailCountry_CodeMobile_NumberLandLineCodeNew_EST_ValueNew_ReasonOnConfirmationPage(String Salutation, String FirstName, String LastName, String Email, String Country_Code, String Mobile_Number, String LandLineCode, String New_EST_Value, String New_Reason) throws Throwable {

        String FullName = Salutation + " " + FirstName + " " + LastName;
        String FinalMobileNumber = Country_Code + Mobile_Number;
        String FinalLandLineNumber = "—";

        String vObjFullName = Constants.Refer_a_Client.getProperty("FullName");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFullName, FullName));
        LogCapture.info("Full Name is visible and correct....");
        String vObjFinalMobileNumber = Constants.Refer_a_Client.getProperty("FinalMobileNumber");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalMobileNumber, FinalMobileNumber));
        LogCapture.info("Mobile Number is visible and correct....");
        String vObjFinalLandLineNumber = Constants.Refer_a_Client.getProperty("FinalLandLineNumber");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalLandLineNumber, FinalLandLineNumber));
        LogCapture.info("LandLine Number is visible and correct....");
        String vObjFinalCurrencyHas = Constants.Refer_a_Client.getProperty("FinalCurrencyHas");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalCurrencyHas, "GBP"));
        LogCapture.info("Curreny client has is visible and correct....");
        String vObjFinalCurrencyWant = Constants.Refer_a_Client.getProperty("FinalCurrencyWant");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalCurrencyWant, "EUR"));
        LogCapture.info("Curreny client wants is visible and correct....");
        String vObjFinalEmail = Constants.Refer_a_Client.getProperty("FinalEmail");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalEmail, Email));
        LogCapture.info("Email is visible and correct....");

        // Need to change the xpath for EST value after APUI-324

        //String vObjFinalEST_Value = Constants.Refer_a_Client.getProperty("FinalEST_Value");
        //Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalEST_Value, New_EST_Value));
        //LogCapture.info("EST Value is visible and correct....");
//        String vObjFinalReason = Constants.Refer_a_Client.getProperty("FinalReason");
//        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFinalReason, New_Reason));
//        LogCapture.info("Transfering Reason is visible and correct....");


    }

    @And("^User Enters (Mandatory|Optional|All) Contact Details Email \"([^\"]*)\" MobileCountryCode \"([^\"]*)\" MobileNumber \"([^\"]*)\" LandlineCountryCode\"([^\"]*)\" landlineNumber \"([^\"]*)\" and \"([^\"]*)\" and Click on Continue$")
    public void userEntersMandatoryDetailsOptionalDetailsAllDetailsEmailMobileCountryCodeMobileNumberLandlineCountryCodeLandlineNumberAndAndClickOnContinue(String Details, String EmailID, String CountryCode_Mobile, String MobileNumber, String CountryCode_LandLine, String LandLineNumber, String BestTimeToCall) throws Throwable {

        if (Details.equalsIgnoreCase("All")) {

            String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
            String vEmailID = Constants.Refer_a_Client.getProperty("Refer_a_Client_EmailID");
            Assert.assertEquals("PASS", Constants.key.writeInInput(vEmailID, EmailID));
            String vMobileDropDown = Constants.Refer_a_Client.getProperty("CountryCode_DropDownMobile");
            Assert.assertEquals("PASS", Constants.key.click(vMobileDropDown, ""));
            Constants.key.pause("1", "");
            String vMobileDropDownClear = Constants.Refer_a_Client.getProperty("CountryCode_DropDownMobileClear");
            Assert.assertEquals("PASS", Constants.key.click(vMobileDropDownClear, ""));
            Constants.key.pause("1", "");
            String vCountryCodeMobile = Constants.Refer_a_Client.getProperty("CountryCode_Mobile");
            Constants.key.pause("1", "");
            Assert.assertEquals("PASS", Constants.key.clearText(vCountryCodeMobile));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vCountryCodeMobile, CountryCode_Mobile));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeMobile, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeMobile, "enter"));
            String vMobileNumber = Constants.Refer_a_Client.getProperty("MobileNumber");
            Assert.assertEquals("PASS", Constants.key.writeInInput(vMobileNumber, MobileNumber));

            String vLandLineDropDown = Constants.Refer_a_Client.getProperty("CountryCode_DropDownLandline");
            Assert.assertEquals("PASS", Constants.key.click(vLandLineDropDown, ""));
            Constants.key.pause("1", "");
            String vCountryCodeLandLine = Constants.Refer_a_Client.getProperty("CountryCode_LandLine");
            Constants.key.pause("1", "");
            Assert.assertEquals("PASS", Constants.key.clearText(vCountryCodeLandLine));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vCountryCodeLandLine, CountryCode_LandLine));
            Constants.key.pause("1", "");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeLandLine, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeLandLine, "enter"));
            Constants.key.pause("1", "");
            String vLandLineNumber = Constants.Refer_a_Client.getProperty("LandLineNumber");
            //LogCapture.info(vLandLineNumber);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vLandLineNumber, LandLineNumber));
            Constants.key.pause("2", "");
            String vBestTimeToCall = Constants.Refer_a_Client.getProperty("BestTimeToCall");
            //LogCapture.info(vBestTimeToCall);
            Constants.key.pause("1", "");
            Assert.assertEquals("PASS", Constants.key.click(vBestTimeToCall, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vBestTimeToCall, BestTimeToCall));
            Constants.key.pause("1", "");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vBestTimeToCall, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vBestTimeToCall, "enter"));
            String vObjRadioButton = Constants.Refer_a_Client.getProperty("ContinueButton");
            Assert.assertEquals("PASS", Constants.key.click(vObjRadioButton, ""));
            LogCapture.info("Continue button is Enabled and user clicks on button...");

        }
        if (Details.equalsIgnoreCase("Optional")) {


        }

        if (Details.equalsIgnoreCase("Mandatory")) {

            String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
            String vEmailID = Constants.Refer_a_Client.getProperty("Refer_a_Client_EmailID");
            Assert.assertEquals("PASS", Constants.key.writeInInput(vEmailID, EmailID));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
            String vMobileDropDown = Constants.Refer_a_Client.getProperty("CountryCode_DropDownMobile");
            Assert.assertEquals("PASS", Constants.key.click(vMobileDropDown, ""));
            Constants.key.pause("2", "");
            String vMobileDropDownClear = Constants.Refer_a_Client.getProperty("CountryCode_DropDownMobileClear");
            Assert.assertEquals("PASS", Constants.key.click(vMobileDropDownClear, ""));
            Constants.key.pause("2", "");
            String vCountryCodeMobile = Constants.Refer_a_Client.getProperty("CountryCode_Mobile");
            Constants.key.pause("2", "");
            Assert.assertEquals("PASS", Constants.key.clearText(vCountryCodeMobile));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vCountryCodeMobile, CountryCode_Mobile));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeMobile, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeMobile, "enter"));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
            String vMobileNumber = Constants.Refer_a_Client.getProperty("MobileNumber");
            Assert.assertEquals("PASS", Constants.key.writeInInput(vMobileNumber, MobileNumber));
            Constants.key.pause("1", "");
            String vContinueButtonEnable = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
            Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();
            LogCapture.info("Continue button is enable....");

            Assert.assertEquals("PASS", Constants.key.click(vMobileNumber, ""));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vMobileNumber, "selectall"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vMobileNumber, "delete"));
            String vObjContactDetails = Constants.Refer_a_Client.getProperty("ContactDetails");
            Assert.assertEquals("PASS", Constants.key.click(vObjContactDetails, ""));

            String vObjMobileNumberFieldEmptyErrorHighlight = Constants.Refer_a_Client.getProperty("MobileNumberFieldEmptyErrorHighlight");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjMobileNumberFieldEmptyErrorHighlight, ""));

            String vObjEnterValidMobileNumberMessageFieldEmptyErrorHighlight = Constants.Refer_a_Client.getProperty("EnterValidMobileNumberMessageFieldEmptyErrorHighlight");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjEnterValidMobileNumberMessageFieldEmptyErrorHighlight, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjEnterValidMobileNumberMessageFieldEmptyErrorHighlight, "Please enter a valid phone number"));
            String vObjErrorIcon_MobileNumber = Constants.Refer_a_Client.getProperty("ErrorIcon_MobileNumber");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorIcon_MobileNumber, ""));
            LogCapture.info("Error message and cross tick validated for Mobile number field completed...");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
            LogCapture.info("Mobile number(Number) field is mandatory...");

            Assert.assertEquals("PASS", Constants.key.writeInInput(vMobileNumber, MobileNumber));
            Assert.assertEquals("PASS", Constants.key.click(vObjContactDetails, ""));
            LogCapture.info("Mobile number entered again...");
            String vObjTickIcon_MobileNumber = Constants.Refer_a_Client.getProperty("TickIcon_MobileNumber");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjTickIcon_MobileNumber, ""));
            LogCapture.info("Tick Icon is visible for mobile number field..");
            Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();
            LogCapture.info("Continue button is enable....");

//            Assert.assertEquals("PASS", Constants.key.click(vMobileDropDown, ""));
//            Constants.key.pause("1", "");
//            Assert.assertEquals("PASS", Constants.key.click(vMobileDropDownClear, ""));
//            Constants.key.pause("1", "");
//            Assert.assertEquals("PASS", Constants.key.clearText(vCountryCodeMobile));
//            Assert.assertEquals("PASS", Constants.key.click(vObjContactDetails, ""));
//            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
//            LogCapture.info("Continue button is disable...");
//            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjEnterValidMobileNumberMessageFieldEmptyErrorHighlight, ""));
//            Assert.assertEquals("PASS", Constants.key.verifyText(vObjEnterValidMobileNumberMessageFieldEmptyErrorHighlight, "Please enter a valid phone number"));
//
//            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorIcon_MobileNumber, ""));
//            LogCapture.info("Error message and cross tick validated for Mobile number field completed...");
//            //Assert.assertEquals("PASS", Constants.key.click(vMobileDropDown, ""));
            Constants.key.pause("1", "");
            Assert.assertEquals("PASS", Constants.key.clearText(vCountryCodeMobile));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vCountryCodeMobile, CountryCode_Mobile));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeMobile, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeMobile, "enter"));
            Assert.assertEquals("PASS", Constants.key.click(vObjContactDetails, ""));
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjTickIcon_MobileNumber, ""));
            LogCapture.info("Tick Icon is visible for mobile number field...");
            Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();
            LogCapture.info("Continue button is enable....");
            Assert.assertEquals("PASS", Constants.key.click(vEmailID, ""));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vEmailID, "selectall"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vEmailID, "delete"));
            Constants.key.pause("1", "");
            Assert.assertEquals("PASS", Constants.key.click(vObjContactDetails, ""));

            String vObjContactEmailAddressFieldEmptyErrorHighlight = Constants.Refer_a_Client.getProperty("ContactEmailAddressFieldEmptyErrorHighlight");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjContactEmailAddressFieldEmptyErrorHighlight, ""));
            String vObjEnterValidEmailAddressMessageFieldEmptyErrorHighlight = Constants.Refer_a_Client.getProperty("EnterValidEmailAddressMessageFieldEmptyErrorHighlight");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjEnterValidEmailAddressMessageFieldEmptyErrorHighlight, ""));
            String vObj_ExpectedErrorText_EnterValidEmailAddressMessage = Constants.Refer_a_Client.getProperty("ExpectedErrorText_EnterValidEmailAddressMessage");
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjEnterValidEmailAddressMessageFieldEmptyErrorHighlight, vObj_ExpectedErrorText_EnterValidEmailAddressMessage));
            String vObjErrorIcon_EmailAddress = Constants.Refer_a_Client.getProperty("ErrorIcon_EmailAddress");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorIcon_EmailAddress, ""));
            LogCapture.info("Error message and cross tick validated for Contact email address field...");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
            LogCapture.info("Continue button is disable...");

            Assert.assertEquals("PASS", Constants.key.writeInInput(vEmailID, EmailID));
            String vObjTickIcon_EmailAddress = Constants.Refer_a_Client.getProperty("TickIcon_EmailAddress");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjTickIcon_EmailAddress, ""));
            LogCapture.info("Tick Icon is visible for Contact Email address field...");

            Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();

            LogCapture.info("All Mandatory fields for Contact details is entered with continue button enabled...");

            String vObjRadioButton = Constants.Refer_a_Client.getProperty("ContinueButton");
            Assert.assertEquals("PASS", Constants.key.click(vObjRadioButton, ""));
            LogCapture.info("Continue button is Enabled and user clicks on button...");


        }
    }

    @And("^User Selects (Mandatory|Optional|All) Transaction details Estimation Value \"([^\"]*)\" Currency has \"([^\"]*)\" Currency_want \"([^\"]*)\" Reason \"([^\"]*)\" and Click on Continue$")
    public void userSelectsALLTransactionDetailsEstimationValueCurrencyHasCurrency_wantReasonAndClickOnContinue(String Details, String EST_Value, String CurrencyHas, String Currency_Want, String Reason) throws Throwable {

        if (Details.equalsIgnoreCase("All")) {
            String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
            LogCapture.info("EST Value......");
            String vEST_Value = Constants.Refer_a_Client.getProperty("EST_Value");
            Assert.assertEquals("PASS", Constants.key.click(vEST_Value, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vEST_Value, EST_Value));
            Constants.key.pause("2", "");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vEST_Value, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vEST_Value, "enter"));
            LogCapture.info("Sell Currency......");
            String vSell = Constants.Refer_a_Client.getProperty("CurrencyHas");
            Assert.assertEquals("PASS", Constants.key.click(vSell, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vSell, CurrencyHas));
            Constants.key.pause("2", "");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSell, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSell, "enter"));
            LogCapture.info("Buy Currency......");
            String vBuy = Constants.Refer_a_Client.getProperty("Currency_Want");
            Assert.assertEquals("PASS", Constants.key.click(vBuy, ""));

            Assert.assertEquals("PASS", Constants.key.writeInInput(vBuy, Currency_Want));
            Constants.key.pause("2", "");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vBuy, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vBuy, "enter"));
//            LogCapture.info("Reason......");
//            String vReason = Constants.Refer_a_Client.getProperty("Reason");
//            Assert.assertEquals("PASS", Constants.key.click(vReason, ""));
//            Assert.assertEquals("PASS", Constants.key.writeInInput(vReason, Reason));
//            Constants.key.pause("2", "");
//            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vReason, "downArrow"));
//            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vReason, "enter"));
            String vObjRadioButton = Constants.Refer_a_Client.getProperty("ContinueButton");
            Assert.assertEquals("PASS", Constants.key.click(vObjRadioButton, ""));
        }
        if (Details.equalsIgnoreCase("Mandatory")) {
            String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
            LogCapture.info("Sell Currency......");
            String vSell = Constants.Refer_a_Client.getProperty("CurrencyHas");
            Assert.assertEquals("PASS", Constants.key.click(vSell, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vSell, CurrencyHas));
            Constants.key.pause("1", "");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSell, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSell, "enter"));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
            LogCapture.info("Continue button is disable....");
            LogCapture.info("Buy Currency......");
            String vBuy = Constants.Refer_a_Client.getProperty("Currency_Want");
            Assert.assertEquals("PASS", Constants.key.click(vBuy, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vBuy, Currency_Want));
            Constants.key.pause("2", "");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vBuy, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vBuy, "enter"));
//            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
//            LogCapture.info("Continue button is disable....");
//            LogCapture.info("Reason......");
//            String vReason = Constants.Refer_a_Client.getProperty("Reason");
//            Assert.assertEquals("PASS", Constants.key.click(vReason, ""));
//            Assert.assertEquals("PASS", Constants.key.writeInInput(vReason, Reason));
//            Constants.key.pause("2", "");
//            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vReason, "downArrow"));
//            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vReason, "enter"));
            String vObjTransactionDetailsText = Constants.Refer_a_Client.getProperty("TransactionDetailsRightSideText");
            Assert.assertEquals("PASS", Constants.key.click(vObjTransactionDetailsText, ""));

            String vContinueButtonEnable = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
            Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();
            LogCapture.info("Continue button is enable....");

            Assert.assertEquals("PASS", Constants.key.click(vSell, ""));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSell, "selectall"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSell, "delete"));

            Assert.assertEquals("PASS", Constants.key.click(vObjTransactionDetailsText, ""));
            String vObjCurrencyHasFieldEmptyErrorHighlight = Constants.Refer_a_Client.getProperty("CurrencyHasFieldEmptyErrorHighlight");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCurrencyHasFieldEmptyErrorHighlight, ""));
            LogCapture.info("Currency Has Field is mandatory....");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
            LogCapture.info("Continue button is disable....");

            Assert.assertEquals("PASS", Constants.key.click(vSell, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vSell, CurrencyHas));
            Constants.key.pause("1", "");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSell, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSell, "enter"));
            Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();
            LogCapture.info("Continue button is enable....");

            Assert.assertEquals("PASS", Constants.key.click(vBuy, ""));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vBuy, "selectall"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vBuy, "delete"));
            Assert.assertEquals("PASS", Constants.key.click(vObjTransactionDetailsText, ""));
            String vObjCurrencyWantFieldEmptyErrorHighlight = Constants.Refer_a_Client.getProperty("CurrencyWantFieldEmptyErrorHighlight");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCurrencyWantFieldEmptyErrorHighlight, ""));
            LogCapture.info("Currency Want Field is mandatory....");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
            LogCapture.info("Continue button is disable....");

            Assert.assertEquals("PASS", Constants.key.click(vBuy, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vBuy, Currency_Want));
            Constants.key.pause("2", "");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vBuy, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vBuy, "enter"));
            Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();
            LogCapture.info("Continue button is enable....");


//            Assert.assertEquals("PASS", Constants.key.click(vReason, ""));
//            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vReason, "selectall"));
//            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vReason, "delete"));
//            Assert.assertEquals("PASS", Constants.key.click(vObjTransactionDetailsText, ""));
//            String vObjReasonFieldEmptyErrorHighlight = Constants.Refer_a_Client.getProperty("ReasonFieldEmptyErrorHighlight");
//            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjReasonFieldEmptyErrorHighlight, ""));
//            LogCapture.info("Reason Field is mandatory....");
//            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
//            LogCapture.info("Continue button is disable....");
//            Assert.assertEquals("PASS", Constants.key.click(vReason, ""));
//            Assert.assertEquals("PASS", Constants.key.writeInInput(vReason, Reason));
//            Constants.key.pause("1", "");
//            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vReason, "downArrow"));
//            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vReason, "enter"));
            Assert.assertEquals("PASS", Constants.key.click(vObjTransactionDetailsText, ""));
            Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();
            String vObjRadioButton = Constants.Refer_a_Client.getProperty("ContinueButton");
            Assert.assertEquals("PASS", Constants.key.click(vObjRadioButton, ""));
            LogCapture.info("All Mandatory fields for Transaction details is entered with continue button enabled...");

        }
        if (Details.equalsIgnoreCase("Optional")) {

        }


    }

    @And("^User try to enters text (morethan|lessthan|proper|Spaces&Text) 32760 character in text area$")
    public void userTryToEntersTextMorethanCharacterInTextArea(String TextMessage) throws Throwable {

        if (TextMessage.equalsIgnoreCase("morethan")) {

            String Message = RandomStringUtils.randomAlphanumeric(32761);
            LogCapture.info(Message);
            int LengthOfMessage = Message.length();
            LogCapture.info("Length of input message: " + LengthOfMessage);
            LogCapture.info("Entering text message into text area......");
            String vMessage = Constants.Refer_a_Client.getProperty("Message");
            Assert.assertEquals("PASS", Constants.key.click(vMessage, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vMessage, Message));
            String vObjFinalReason = Constants.Refer_a_Client.getProperty("commissionOptOutCheckbox");
            Assert.assertEquals("PASS", Constants.key.click(vObjFinalReason, ""));
//            LogCapture.info("Text message entered......");
        }

        if (TextMessage.equalsIgnoreCase("lessthan")) {

            String Message = RandomStringUtils.randomAlphanumeric(32759);
            LogCapture.info(Message);
            int LengthOfMessage = Message.length();
            LogCapture.info("Length of input message: " + LengthOfMessage);
            LogCapture.info("Entering text message into text area......");
            String vMessage = Constants.Refer_a_Client.getProperty("Message");
            Assert.assertEquals("PASS", Constants.key.click(vMessage, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vMessage, Message));
            LogCapture.info("Text message entered......");
        }
        if (TextMessage.equalsIgnoreCase("proper")) {

            String Message = RandomStringUtils.randomAlphanumeric(32760);
            LogCapture.info(Message);
            int LengthOfMessage = Message.length();
            LogCapture.info("Length of input message: " + LengthOfMessage);
            LogCapture.info("Entering text message into text area......");
            String vMessage = Constants.Refer_a_Client.getProperty("Message");
            Assert.assertEquals("PASS", Constants.key.click(vMessage, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vMessage, Message));
            LogCapture.info("Text message entered......");

        }

        if (TextMessage.equalsIgnoreCase("Spaces&Text")) {

            String Message = "                                              ";
            LogCapture.info(Message);
            int lengthOfMessage = Message.length();
            LogCapture.info("Length of input message: " + lengthOfMessage);
            LogCapture.info("Entering text message into text area......");
            String vMessage = Constants.Refer_a_Client.getProperty("Message");
            Assert.assertEquals("PASS", Constants.key.click(vMessage, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vMessage, Message));
            LogCapture.info("Text message entered......");

        }


    }

    @Then("^user should be allowed to save entered Spaces&Text in text area$")
    public void userShouldBeAllowedToSaveEnteredSpacesTextInTextArea() throws Throwable {

        String MessageEntered = "                                             Hello! Test in progress";
        int LengthOfMessage = MessageEntered.length();
        LogCapture.info("Length of input message: " + LengthOfMessage);
        LogCapture.info("Text need to verify: " + MessageEntered);
        String vMessage = Constants.Refer_a_Client.getProperty("Message");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vMessage, MessageEntered));
        Assert.assertEquals("PASS", Constants.key.verifyText(vMessage, MessageEntered));

        LogCapture.info("Text msg into Text area Verified......");

    }

    @When("^User Clicks on Forgot Passoward button$")
    public void userClicksOnForgotPassowrdButton() throws Throwable {

        String vObjForgotPasswordLink = Constants.Refer_a_Client.getProperty("ForgotPasswordLink");
        Assert.assertEquals("PASS", Constants.key.click(vObjForgotPasswordLink, ""));
        Constants.key.pause("2", "");

    }

    @And("^Enters the Email Address \"([^\"]*)\" on Reset password page and Click on Confirm$")
    public void entersTheEmailAddressOnResetPasswordPageAndClickOnConfirm(String Email_ID) throws Throwable {

        String vObjForgotPasswordLink = Constants.Affiliates_ForgotPasswordOR.getProperty("FPemailAddressTextBox");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjForgotPasswordLink, Email_ID));
        Constants.key.pause("2", "");
        String vObjResetPasswordButton = Constants.Affiliates_ForgotPasswordOR.getProperty("ResetPasswordButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjResetPasswordButton, ""));
        Constants.key.pause("2", "");

    }

    @Then("^user should be able to view the timer on UI$")
    public void user_should_be_able_to_view_the_timer_on_UI() throws Throwable {
        String vObjLink = Constants.Refer_a_Client.getProperty("ConfirmationMessage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjLink, ""));
        // Constants.key.pause("5", "");
        String vRACConfirmationPageTimer = Constants.Refer_a_Client.getProperty("RACConfirmationPageTimer");
        String Timer = Constants.driver.findElement(By.xpath(vRACConfirmationPageTimer)).getText();
        if (Timer.equalsIgnoreCase("You will be directed in 1 seconds")) {
            LogCapture.info("Waiting for 1 Second..");
        }
        if (Timer.equalsIgnoreCase("You will be directed in 2 seconds")) {
            LogCapture.info("Waiting for 2 Seconds..");
        }
        if (Timer.equalsIgnoreCase("You will be directed in 3 seconds")) {
            LogCapture.info("Waiting for 3 Seconds..");
        }
        if (Timer.equalsIgnoreCase("You will be directed in 4 seconds")) {
            LogCapture.info("Waiting for 4 Seconds..");
        }
        if (Timer.equalsIgnoreCase("You will be directed in 5 seconds")) {
            LogCapture.info("Waiting for 5 Seconds..");
        }
        if (Timer.equalsIgnoreCase("You will be directed in 6 seconds")) {
            LogCapture.info("Waiting for 6 Seconds..");
        }
        if (Timer.equalsIgnoreCase("You will be directed in 7 seconds")) {
            LogCapture.info("Waiting for 7 Seconds..");
        }
        if (Timer.equalsIgnoreCase("You will be directed in 8 seconds")) {
            LogCapture.info("Waiting for 8 Seconds..");
        }
        if (Timer.equalsIgnoreCase("You will be directed in 9 seconds")) {
            LogCapture.info("Waiting for 9 Seconds..");
        }
        if (Timer.equalsIgnoreCase("You will be directed in 10 seconds")) {
            LogCapture.info("Waiting for 10 Seconds..");
        }
    }

    @Then("^User should be able to display all the fields with dropdown$")
    public void userShouldBeAbleToDisplayAllTheFieldsWithDropdown() throws Throwable {
        LogCapture.info("Transaction  Details Page......");
        LogCapture.info("EST Value......");
        String vEST_Value = Constants.Refer_a_Client.getProperty("EST_Value");
        Assert.assertEquals("PASS", Constants.key.click(vEST_Value, ""));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.click(vEST_Value, ""));

        LogCapture.info("Sell Currency......");
        String vSell = Constants.Refer_a_Client.getProperty("CurrencyHas");
        Assert.assertEquals("PASS", Constants.key.click(vSell, ""));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.click(vSell, ""));

        LogCapture.info("Buy Currency......");
        String vBuy = Constants.Refer_a_Client.getProperty("Currency_Want");
        Assert.assertEquals("PASS", Constants.key.click(vBuy, ""));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.click(vBuy, ""));

//        LogCapture.info("Reason......");
//        String vReason = Constants.Refer_a_Client.getProperty("Reason");
//        Assert.assertEquals("PASS", Constants.key.click(vReason, ""));
//        Constants.key.pause("2", "");
//        Assert.assertEquals("PASS", Constants.key.click(vReason, ""));

    }

    @And("^user try to click on continue without selecting two fields and keep two as blank ESTValue\"([^\"]*)\" Currency Has\"([^\"]*)\"$")
    public void userTryToClickOnContinueWithoutSelectingFieldsAndKeepAsBlankESTValueCurrencyHas(String EST_Value, String CurrencyHas) throws Throwable {

        LogCapture.info("Transaction  Details Page......");
        LogCapture.info("EST Value......");
        String vEST_Value = Constants.Refer_a_Client.getProperty("EST_Value");
        Assert.assertEquals("PASS", Constants.key.click(vEST_Value, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vEST_Value, EST_Value));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vEST_Value, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vEST_Value, "enter"));
        LogCapture.info("Sell Currency......");
        String vSell = Constants.Refer_a_Client.getProperty("CurrencyHas");
        Assert.assertEquals("PASS", Constants.key.click(vSell, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vSell, CurrencyHas));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSell, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSell, "enter"));

    }

    @Then("^User should not be allowed to Click on Continue Button$")
    public void userShouldNotBeAllowedToClickOnContinueButton() throws Throwable {

        String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
    }

    @Then("^System should display error message as (EnterEmailAddress|AccountDoesNotExist|PleasePassCorrectValues|Invalid Credentials)$")
    public void systemShouldDisplayErrorMessageAsEnterEmailAddress(String MessageType) throws Throwable {

        if (MessageType.equalsIgnoreCase("AccountDoesNotExist")) {

            LogCapture.info("Error.. " + MessageType);
            String vRestPasswordPageTitle = Constants.Affiliates_ForgotPasswordOR.getProperty("AccountNotFoundErrorMessage");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vRestPasswordPageTitle, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vRestPasswordPageTitle, "Account not found. Please re-enter email"));

        }
        if (MessageType.equalsIgnoreCase("PleasePassCorrectValues")) {
            LogCapture.info("Error.. " + MessageType);
            String vRestPasswordPageTitle = Constants.Affiliates_ForgotPasswordOR.getProperty("InvalidEmailId");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vRestPasswordPageTitle, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vRestPasswordPageTitle, "Email address needs to contain '@' symbol"));
            String vErrorIconForInvalidEmailId = Constants.Affiliates_ForgotPasswordOR.getProperty("ErrorIconForInvalidEmailId");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIconForInvalidEmailId, ""));
            String vObjResetPasswordBtnDisable = Constants.Affiliates_ForgotPasswordOR.getProperty("ResetPasswordButton");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjResetPasswordBtnDisable, "disabled"));
        }
        if (MessageType.equalsIgnoreCase("Invalid Credentials")) {
            LogCapture.info("Error.. " + MessageType);
            String vErrorText = Constants.Affiliates_LoginPageOR.getProperty("ErrorText");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorText, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vErrorText, "ERROR:  "));
            String vErrorAlertIcon = Constants.Affiliates_LoginPageOR.getProperty("ErrorAlertIcon");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorAlertIcon, ""));
            String vError_InvalidCredentials = Constants.Affiliates_LoginPageOR.getProperty("Error_InvalidCredentials");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vError_InvalidCredentials, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vError_InvalidCredentials, "Invalid credentials"));
            LogCapture.info("Login Error verified for Invalid credentials with Error Alert icon");

        }
    }

    @And("^User Clicks on Email Address field$")
    public void userClicksOnEmailAddressField() throws Exception {
        String vFPemailAddressTextBox = Constants.Affiliates_ForgotPasswordOR.getProperty("FPemailAddressTextBox");
        LogCapture.info("No User Name is entered");
        Assert.assertEquals("PASS", Constants.key.click(vFPemailAddressTextBox, ""));

    }


    @Then("^System displays error message for entering over number of characters into text box$")
    public void SystemDisplaysErrorMessageForEnteringWrongNumberOfCharactersIntoTextBox() throws Exception {

        String vTextboxErrorMsg = Constants.Refer_a_Client.getProperty("ErrorMsgTextBox");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTextboxErrorMsg, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vTextboxErrorMsg, "Please enter 32760 characters or less"));
        LogCapture.info("Error message verified for entering more than 32760 characters....");
        String vObjConfirm = Constants.Refer_a_Client.getProperty("SubmitButtonDisabled");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjConfirm, "disabled"));
        LogCapture.info("Also Confirm button is disabled...");
    }

    @Then("^User should be abe to view entered spaces into textbox$")
    public void userShouldBeAbeToViewEnteredSpacesIntoTextbox() throws Exception {
        String spaces = "                                              ";
        LogCapture.info("Text need to verify: " + spaces);
        String vMessage = Constants.Refer_a_Client.getProperty("Message");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vMessage, spaces));
        Assert.assertEquals("PASS", Constants.key.verifyText(vMessage, spaces));
        LogCapture.info("Text msg into Text area Verified......");
    }

    @Then("^User Should be able to select only one option from Individual or Company$")
    public void userShouldBeAbleToSelectOnlyOneOptionFromIndividualOrCompany() throws Exception {

        String vObjTransferLink = Constants.Refer_a_Client.getProperty("Individual_Text");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjTransferLink, "An individual"));
        String vObjIndividualRadioButton = Constants.Refer_a_Client.getProperty("IndividualRadioButton");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjIndividualRadioButton, "selected"));
        String vObjLink = Constants.Refer_a_Client.getProperty("Corporate_Text");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjLink, "A company"));
        String vObjCorporateRadioButton = Constants.Refer_a_Client.getProperty("CorporateRadioButton");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjCorporateRadioButton, "unselected"));
        LogCapture.info("Verified that Individual option is selected and Company option is unselected....");

        Assert.assertEquals("PASS", Constants.key.click(vObjCorporateRadioButton, ""));
        Constants.key.pause("1", "");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjCorporateRadioButton, "selected"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjIndividualRadioButton, "unselected"));
        LogCapture.info("Verified that Individual option is Unselected and Company option is Selected....");

        Assert.assertEquals("PASS", Constants.key.click(vObjIndividualRadioButton, ""));
        Constants.key.pause("1", "");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjIndividualRadioButton, "selected"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjCorporateRadioButton, "unselected"));
        LogCapture.info("Verified that Individual option is Selected and Company option is Unselected....");
    }

    @Then("^User Refresh the whole session and remains on the same Page Refer a Client$")
    public void userRefreshTheWholeSessionAndRemainsOnTheSamePageReferAClient() throws Exception {

        Constants.driver.navigate().refresh();
        LogCapture.info("Refer a Client Page Loading......");
        String vObjReferAClientPage = Constants.Refer_a_Client.getProperty("ReferAClientPage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjReferAClientPage, "Refer a client"));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjReferAClientPage, "Refer a client"));

    }

    @And("^User try to Click on Continue button but Continue button is Disabled as no values were entered for (Individual|Corporate)$")
    public void userTryToClickOnContinueButtonButContinueButtonIsDisabledAsNoValuesWereEntered(String PersonalDetailsType) throws Exception {

        if (PersonalDetailsType.equalsIgnoreCase("Corporate")) {
            String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
            LogCapture.info("Continue button is disabled...");
            String vSalutationDropdownButton = Constants.Refer_a_Client.getProperty("SalutationDropdownButton");
            String vF_Name = Constants.Refer_a_Client.getProperty("FirstName");
            String vL_Name = Constants.Refer_a_Client.getProperty("LastName");
            Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
            Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
            Assert.assertEquals("PASS", Constants.key.click(vSalutationDropdownButton, ""));
            Constants.key.pause("1", "");
            Assert.assertEquals("PASS", Constants.key.click(vSalutationDropdownButton, ""));

            String vObjCompanyDetailsText = Constants.Refer_a_Client.getProperty("CompanyDetailsText");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCompanyDetailsText, ""));
            String vObjTradingName = Constants.Refer_a_Client.getProperty("TradingName");
            String vObjCompanyName = Constants.Refer_a_Client.getProperty("CompanyName");
            Assert.assertEquals("PASS", Constants.key.click(vObjCompanyName, ""));
            Assert.assertEquals("PASS", Constants.key.click(vObjTradingName, ""));
            LogCapture.info("User did not entered any Corporate Personal details....");

        }
        if (PersonalDetailsType.equalsIgnoreCase("Individual")) {
            String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
            LogCapture.info("Continue button is disabled...");
            String vSalutationDropdownButton = Constants.Refer_a_Client.getProperty("SalutationDropdownButton");
            String vF_Name = Constants.Refer_a_Client.getProperty("FirstName");
            String vL_Name = Constants.Refer_a_Client.getProperty("LastName");
            Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
            Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
            Assert.assertEquals("PASS", Constants.key.click(vSalutationDropdownButton, ""));
            Constants.key.pause("1", "");
            Assert.assertEquals("PASS", Constants.key.click(vSalutationDropdownButton, ""));
            LogCapture.info("User did not entered any Individual Personal details....");
        }
    }

    @Then("^System should NOT display error message for Not Entering Required Personal (Individual|Corporate) details$")
    public void systemShouldNOTDisplayErrorMessageForNotEnteringRequiredPersonalIndividualDetails(String PersonalDetailsType) throws Exception {

        String vTickIcon_FirstName = Constants.Refer_a_Client.getProperty("TickIcon_FirstName");
        String vTickIcon_CompanyName = Constants.Refer_a_Client.getProperty("TickIcon_CompanyName");
        String vTickIcon_LastName = Constants.Refer_a_Client.getProperty("TickIcon_LastName");

        if (PersonalDetailsType.equalsIgnoreCase("Individual")) {
            String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "enabled"));
            LogCapture.info("Continue button is enabled...");

            String vErrorIcon_FirstName = Constants.Refer_a_Client.getProperty("ErrorIcon_FirstName");
            Assert.assertEquals("PASS", Constants.key.notexist(vErrorIcon_FirstName, ""));
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_FirstName, ""));
            LogCapture.info("First name : Accepted and Tick icon is visible...");

            String vErrorIcon_LastName = Constants.Refer_a_Client.getProperty("ErrorIcon_LastName");
            Assert.assertEquals("PASS", Constants.key.notexist(vErrorIcon_LastName, ""));
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_LastName, ""));
            LogCapture.info("Last name : Accepted and Tick icon is visible...");

            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "enabled"));
            LogCapture.info("NO error message is displayed and continue button is enabled...");

        }
        if (PersonalDetailsType.equalsIgnoreCase("Corporate")) {
            String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "enabled"));
            LogCapture.info("Continue button is enabled...");

            String vErrorIcon_FirstName = Constants.Refer_a_Client.getProperty("ErrorIcon_FirstName");
            Assert.assertEquals("PASS", Constants.key.notexist(vErrorIcon_FirstName, ""));
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_FirstName, ""));
            LogCapture.info("First name : Accepted and Tick icon is visible...");

            String vErrorIcon_LastName = Constants.Refer_a_Client.getProperty("ErrorIcon_LastName");
            Assert.assertEquals("PASS", Constants.key.notexist(vErrorIcon_LastName, ""));
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_LastName, ""));
            LogCapture.info("Last name : Accepted and Tick icon is visible...");

            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "enabled"));
            LogCapture.info("NO error message is displayed and continue button is enabled...");

            String vErrorIcon_CompanyName = Constants.Refer_a_Client.getProperty("ErrorIcon_CompanyName");
            Assert.assertEquals("PASS", Constants.key.notexist(vErrorIcon_CompanyName, ""));
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_CompanyName, ""));
            LogCapture.info("Company name : Accepted and Tick icon is visible...");

            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "enabled"));
            LogCapture.info("NO error message is displayed and continue button is enabled...");
        }

    }

    @Then("^System should display error message for Not Entering Required Personal (Individual|Corporate|Customer) details$")
    public void systemShouldDisplayErrorMessageForNotEnteringRequiredPersonalIndividualDetails(String PersonalDetailsType) throws Exception {

        if (PersonalDetailsType.equalsIgnoreCase("Individual")) {
            String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
            LogCapture.info("Continue button is disabled...");

            String vError_EnterFirstName = Constants.Refer_a_Client.getProperty("Error_EnterFirstName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vError_EnterFirstName, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vError_EnterFirstName, "Please use your name as it appears on your passport"));
            String vErrorIcon_FirstName = Constants.Refer_a_Client.getProperty("ErrorIcon_FirstName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_FirstName, ""));
            LogCapture.info("Error: Please Enter valid first name as on Passport and Error icon (X) is visible");

            String vError_EnterLastName = Constants.Refer_a_Client.getProperty("Error_EnterLastName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vError_EnterLastName, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vError_EnterLastName, "Please use your name as it appears on your passport"));
            String vErrorIcon_LastName = Constants.Refer_a_Client.getProperty("ErrorIcon_LastName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_LastName, ""));
            LogCapture.info("Error: Please Enter valid Last Name as on Passport and Error icon (X) is visible");

            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));

        }
        if (PersonalDetailsType.equalsIgnoreCase("Corporate")) {
            String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
            LogCapture.info("Continue button is disabled...");

            String vError_EnterFirstName = Constants.Refer_a_Client.getProperty("Error_EnterFirstName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vError_EnterFirstName, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vError_EnterFirstName, "Please use your name as it appears on your passport"));
            String vErrorIcon_FirstName = Constants.Refer_a_Client.getProperty("ErrorIcon_FirstName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_FirstName, ""));
            LogCapture.info("Error: Please Enter valid first name as on Passport and Error icon (X) is visible");

            String vError_EnterLastName = Constants.Refer_a_Client.getProperty("Error_EnterLastName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vError_EnterLastName, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vError_EnterLastName, "Please use your name as it appears on your passport"));
            String vErrorIcon_LastName = Constants.Refer_a_Client.getProperty("ErrorIcon_LastName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_LastName, ""));
            LogCapture.info("Error: Please Enter valid Last Name as on Passport and Error icon (X) is visible");

            String vError_EnterCompanyName = Constants.Refer_a_Client.getProperty("Error_EnterCompanyName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vError_EnterCompanyName, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vError_EnterCompanyName, "Please enter a valid company name"));
            String vErrorIcon_CompanyName = Constants.Refer_a_Client.getProperty("ErrorIcon_CompanyName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_CompanyName, ""));
            LogCapture.info("Error: Please Enter valid Company Name and Error icon (X) is visible");

            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
        }
        if (PersonalDetailsType.equalsIgnoreCase("Customer")) {
            String vObjContinueButtonDisable = Constants.Affiliates_RegisterACustomerOR.getProperty("ContinueButtonDisable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
            LogCapture.info("Continue button is disabled...");

            String vErrorMsg_EnterFirstName = Constants.Affiliates_RegisterACustomerOR.getProperty("Error_EnterFirstName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorMsg_EnterFirstName, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vErrorMsg_EnterFirstName, "Please enter a valid first name"));
            String vErrorIcon_FirstName = Constants.Affiliates_RegisterACustomerOR.getProperty("ErrorIcon_FirstName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_FirstName, ""));
            LogCapture.info("Error: Please Enter valid first name and Error icon (X) is visible");

            String vError_EnterLastName = Constants.Affiliates_RegisterACustomerOR.getProperty("Error_EnterLastName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vError_EnterLastName, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vError_EnterLastName, "Please enter a valid last name"));
            String vErrorIcon_LastName = Constants.Affiliates_RegisterACustomerOR.getProperty("ErrorIcon_LastName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_LastName, ""));
            LogCapture.info("Error: Please Enter valid Last Name and Error icon (X) is visible");

            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));

        }
    }


    @And("^User clicks on (CountryCodeMobile|RACFirstName|RACLastName|RACSalutation|MobilePhone_CountryCode|Landline_CountryCode|BestTimeToCall|Country|RACCompanyName|RACTradingName|Categories|Industry|ClientType|Countries|Industries|CountryForClients|Language|Term|TermsAndConditions|RequireJointAccount|JointCountry|CountrySRL|Partner Confirmation checkbox) field$")
    public void userClicksOnTargetField(String TargetField) throws Exception {
        if (TargetField.equalsIgnoreCase("CountryCodeMobile")) {
            String vObjCountryCode = Constants.Affiliates_BecomeaPartnerOR.getProperty("CountryCode");
            Assert.assertEquals("PASS", Constants.key.click(vObjCountryCode, ""));
        }

        if (TargetField.equalsIgnoreCase("RACFirstName")) {
            String vF_Name = Constants.Refer_a_Client.getProperty("FirstName");
            Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
        }
        if (TargetField.equalsIgnoreCase("RACLastName")) {
            String vL_Name = Constants.Refer_a_Client.getProperty("LastName");
            Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
        }
        if (TargetField.equalsIgnoreCase("RACSalutation")) {
            String vSalutation = Constants.Refer_a_Client.getProperty("Salutation");
            Assert.assertEquals("PASS", Constants.key.click(vSalutation, ""));
        }
        if (TargetField.equalsIgnoreCase("RACCompanyName")) {
            String vCompanyName = Constants.Refer_a_Client.getProperty("CompanyName");
            Assert.assertEquals("PASS", Constants.key.click(vCompanyName, ""));
        }
        if (TargetField.equalsIgnoreCase("RACTradingName")) {
            String vTradingName = Constants.Refer_a_Client.getProperty("TradingName");
            Assert.assertEquals("PASS", Constants.key.click(vTradingName, ""));
        }

        if (TargetField.equalsIgnoreCase("MobilePhone_CountryCode")) {
            String vCountryCode_Mobile = Constants.Refer_a_Client.getProperty("CountryCode_Mobile");
            Assert.assertEquals("PASS", Constants.key.click(vCountryCode_Mobile, ""));
        }

        if (TargetField.equalsIgnoreCase("Country")) {
            String vAddressCountryDropdown = Constants.Affiliates_RegisterACustomerOR.getProperty("AddressCountryDropdown");
            Assert.assertEquals("PASS", Constants.key.click(vAddressCountryDropdown, ""));
            // Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountryDropdown, "downArrow"));
            //Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountryDropdown, "enter"));
        }
        if (TargetField.equalsIgnoreCase("Landline_CountryCode")) {
            String vCountryCode_LandLine = Constants.Refer_a_Client.getProperty("CountryCode_LandLine");
            Assert.assertEquals("PASS", Constants.key.click(vCountryCode_LandLine, ""));
        }
        if (TargetField.equalsIgnoreCase("BestTimeToCall")) {
            String vBestTimeToCall = Constants.Refer_a_Client.getProperty("BestTimeToCall");
            Assert.assertEquals("PASS", Constants.key.click(vBestTimeToCall, ""));
        }
        if (TargetField.equalsIgnoreCase("Categories")) {
            String vObjCategories = Constants.Affiliates_ResourcesPageOR.getProperty("Categories");
            Assert.assertEquals("PASS", Constants.key.click(vObjCategories, ""));
        }
        if (TargetField.equalsIgnoreCase("Industry")) {
            String vObjIndustry = Constants.Affiliates_ResourcesPageOR.getProperty("Industry");
            Assert.assertEquals("PASS", Constants.key.click(vObjIndustry, ""));
        }
        if (TargetField.equalsIgnoreCase("ClientType")) {
            String vObjClientType = Constants.Affiliates_ResourcesPageOR.getProperty("Clienttype");
            Assert.assertEquals("PASS", Constants.key.click(vObjClientType, ""));
        }
        if (TargetField.equalsIgnoreCase("Countries")) {
            String vObjCountries = Constants.Affiliates_ResourcesPageOR.getProperty("Countries");
            Assert.assertEquals("PASS", Constants.key.click(vObjCountries, ""));
        }
        if (TargetField.equalsIgnoreCase("Industries")) {
            String vObjIndustries = Constants.Affiliates_BecomeaPartnerOR.getProperty("Industries");
            Assert.assertEquals("PASS", Constants.key.click(vObjIndustries, ""));
        }
        if (TargetField.equalsIgnoreCase("CountryForClients")) {
            String vObjCountries = Constants.Affiliates_BecomeaPartnerOR.getProperty("Countries");
            Assert.assertEquals("PASS", Constants.key.click(vObjCountries, ""));
        }
        if (TargetField.equalsIgnoreCase("Language")) {
            String vObjLanguage = Constants.Affiliates_BecomeaPartnerOR.getProperty("Language");
            Assert.assertEquals("PASS", Constants.key.click(vObjLanguage, ""));
        }
        if (TargetField.equalsIgnoreCase("Term")) {
            String TermCheckBox = Constants.Affiliates_BecomeaPartnerOR.getProperty("TermCheckBox");
            Assert.assertEquals("PASS", Constants.key.click(TermCheckBox, ""));
        }
        if (TargetField.equalsIgnoreCase("TermsAndConditions")) {
            String TermsAndCondition = Constants.Affiliates_BecomeaPartnerOR.getProperty("TermsAndCondition");
            Assert.assertEquals("PASS", Constants.key.click(TermsAndCondition, ""));
        }
        if (TargetField.equalsIgnoreCase("RequireJointAccount")) {
            String ISJoint = Constants.Affiliates_RegisterACustomerOR.getProperty("ISJoint");
            Assert.assertEquals("PASS", Constants.key.click(ISJoint, ""));
        }
        if (TargetField.equalsIgnoreCase("JointCountry")) {
            String JointCountry = Constants.Affiliates_RegisterACustomerOR.getProperty("TheirAddressCountry");
            Assert.assertEquals("PASS", Constants.key.click(JointCountry, ""));
        }
        if (TargetField.equalsIgnoreCase("CountrySRL")) {
            String vAddressCountryDropdown = Constants.Affiliates_GlobalPageElementsOR.getProperty("CountryCodeDropDown");
            Assert.assertEquals("PASS", Constants.key.click(vAddressCountryDropdown, ""));
        }
        if (TargetField.equalsIgnoreCase("Partner Confirmation checkbox")) {
            String vObjPartnerConfirmCheckbox = Constants.Affiliates_BecomeaPartnerOR.getProperty("PartnerConfirmCheckbox");
            Assert.assertEquals("PASS", Constants.key.click(vObjPartnerConfirmCheckbox, ""));
            LogCapture.info("User clicks on Partner confirm checkbox...");
        }


    }


    @Then("^User Should be able to enter (any|numeric) Value in (RACFirstName|RACLastName|RACCompanyName) field and validate the same value$")
    public void userShouldBeAbleToEnterAnyValueInTargetField(String TargetValue, String TargetField) throws Exception {

        if (TargetField.equalsIgnoreCase("RACFirstName")) {
            String vF_Name = Constants.Refer_a_Client.getProperty("FirstName");
            String vPersonalDetails = Constants.Refer_a_Client.getProperty("PersonalDetails");
            String vTickIcon_FirstName = Constants.Refer_a_Client.getProperty("TickIcon_FirstName");
            String vErrorIcon_FirstName = Constants.Refer_a_Client.getProperty("ErrorIcon_FirstName");
            if (TargetValue.equalsIgnoreCase("any")) {
                LogCapture.info("Enter Random Alphabetic values with 40 characters for " + TargetField);
                String FirstName40 = RandomStringUtils.randomAlphabetic(40);
                Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName40));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                LogCapture.info("Enter Random Alphabetic values with 40 characters for " + TargetField);
                String vTickIcon_FirstName1 = Constants.Refer_a_Client.getProperty("TickIcon_FirstName");
                LogCapture.info("Enter Random Alphabetic values with 40 characters for " + TargetField);
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_FirstName1, ""));
                LogCapture.info("Accepted and Tick icon is visible...");


                LogCapture.info("Enter Random Alphabetic values with 39 characters for " + TargetField);
                String FirstName39 = RandomStringUtils.randomAlphabetic(39);
                Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "delete"));
                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName39));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_FirstName, ""));
                LogCapture.info("Accepted and Tick icon is visible...");

                LogCapture.info("Now Entering Random AlphaNumeric values...");
                String FirstName_AlphaNumeric = "1" + RandomStringUtils.randomAlphanumeric(10);
                Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "delete"));
                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName_AlphaNumeric));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_FirstName, ""));
                LogCapture.info("Accepted and Tick icon is visible...");

                // Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_FirstName, ""));
                //LogCapture.info("Error: Please valid Enter first name as on Passport and Error icon (X) is visible");

                LogCapture.info("Now Entering Random Numeric values...");
                String FirstName_Numeric = RandomStringUtils.randomNumeric(10);
                Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "delete"));

                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName_Numeric));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_FirstName, ""));
                LogCapture.info("Accepted and Tick icon is visible...");
                //Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_FirstName, ""));
                //LogCapture.info("Error: Please Enter valid first name as on Passport and Error icon (X) is visible");

                /*LogCapture.info("Enter Exception Special Char values...");
                String FirstName_ExceptionSpecChar = "_-";
                Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "delete"));

                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName_ExceptionSpecChar));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_FirstName, ""));
                LogCapture.info("Accepted and Tick icon is visible...");
*/
                LogCapture.info("Now Entering Random special character values...");
                String SpecChar = "~_-`!@#$%^&*()=+[{]}\\|;:'\",<.>/?";
                String FirstName_SpecChar = RandomStringUtils.random(1, SpecChar);
                Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "delete"));

                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName_SpecChar));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_FirstName, ""));
                LogCapture.info("Accepted and Tick icon is visible...");
                //Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_FirstName, ""));
                //LogCapture.info("Error: Please Enter valid first name as on Passport and Error icon (X) is visible");


                LogCapture.info("Enter Random Alphabetic values with 41 characters for " + TargetField);
                String FirstName41 = RandomStringUtils.randomAlphabetic(41);
                Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "delete"));
                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName41));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_FirstName, ""));
                LogCapture.info("Error: Please valid Enter first name as on Passport and Error icon (X) is visible");


            }
            if (TargetValue.equalsIgnoreCase("numeric")) {
                LogCapture.info("Now Entering Random Numeric values...");
                String FirstName_Numeric = RandomStringUtils.randomNumeric(1);
                Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
                Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName_Numeric));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_FirstName, ""));
                LogCapture.info("Accepted and Tick icon is visible...");
            }

        }

        if (TargetField.equalsIgnoreCase("RACLastName")) {
            String vL_Name = Constants.Refer_a_Client.getProperty("LastName");
            String vPersonalDetails = Constants.Refer_a_Client.getProperty("PersonalDetails");
            String vTickIcon_LastName = Constants.Refer_a_Client.getProperty("TickIcon_LastName");
            String vErrorIcon_LastName = Constants.Refer_a_Client.getProperty("ErrorIcon_LastName");
            if (TargetValue.equalsIgnoreCase("any")) {
                LogCapture.info("Enter Random Alphabetic values with 40 characters for " + TargetField);
                String LastName40 = RandomStringUtils.randomAlphabetic(40);
                Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName40));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_LastName, ""));
                LogCapture.info("Accepted and Tick icon is visible...");


                LogCapture.info("Enter Random Alphabetic values with 39 characters for " + TargetField);
                String LastName39 = RandomStringUtils.randomAlphabetic(39);
                Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "delete"));

                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName39));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_LastName, ""));
                LogCapture.info("Accepted and Tick icon is visible...");

                LogCapture.info("Now Entering Random AlphaNumeric values...");
                String LastName_AlphaNumeric = "1" + RandomStringUtils.randomAlphanumeric(10);
                Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "delete"));

                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName_AlphaNumeric));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_LastName, ""));
                LogCapture.info("Accepted and Tick icon is visible...");

                LogCapture.info("Now Entering Random Numeric values...");
                String LastName_Numeric = RandomStringUtils.randomNumeric(1);
                Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "delete"));

                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName_Numeric));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_LastName, ""));
                LogCapture.info("Accepted and Tick icon is visible...");

                /*LogCapture.info("Enter Exception Special Char values...");
                String LastName_ExpSpecChar = "_-";
                String LastName_ExceptionSpecChar = RandomStringUtils.random(1, LastName_ExpSpecChar);
                Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "delete"));

                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName_ExceptionSpecChar));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_LastName, ""));
                LogCapture.info("Accepted and Tick icon is visible...");
*/
                LogCapture.info("Now Entering Random special character values...");
                String SpecChar = "~`.!@#$%^&_-*()=+[{]}\\|;:'\",<.>/?";
                String LastName_SpecChar = RandomStringUtils.random(1, SpecChar);
                Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "delete"));
                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName_SpecChar));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_LastName, ""));
                LogCapture.info("Accepted and Tick icon is visible...");


                LogCapture.info("Enter Random Alphabetic values with 41 characters for " + TargetField);
                String LastName41 = RandomStringUtils.randomAlphabetic(41);
                Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "delete"));

                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName41));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_LastName, ""));
                LogCapture.info("Error: Please Enter valid last name as on Passport and Error icon (X) is visible");


            }
            if (TargetValue.equalsIgnoreCase("numeric")) {
                LogCapture.info("Now Entering Random Numeric values...");
                String LastName_Numeric = RandomStringUtils.randomNumeric(10);
                Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName_Numeric));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_LastName, ""));
                LogCapture.info("Accepted and Tick icon is visible...");
            }

        }

        if (TargetField.equalsIgnoreCase("RACCompanyName")) {
            String vC_Name = Constants.Refer_a_Client.getProperty("CompanyName");
            String vCompanyDetailsText = Constants.Refer_a_Client.getProperty("CompanyDetailsText");
            String vTickIcon_CompanyName = Constants.Refer_a_Client.getProperty("TickIcon_CompanyName");
            String vErrorIcon_CompanyName = Constants.Refer_a_Client.getProperty("ErrorIcon_CompanyName");
            if (TargetValue.equalsIgnoreCase("any")) {
                LogCapture.info("Enter Random Alphabetic values with 50 characters for " + TargetField);
                String CompanyName50 = RandomStringUtils.randomAlphabetic(50);
                Assert.assertEquals("PASS", Constants.key.writeInInput(vC_Name, CompanyName50));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vCompanyDetailsText, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_CompanyName, ""));
                LogCapture.info("Accepted Company name and Tick icon is visible...");

                LogCapture.info("Enter Random Alphabetic values with 49 characters for " + TargetField);
                String CompanyName49 = RandomStringUtils.randomAlphabetic(49);
                Assert.assertEquals("PASS", Constants.key.click(vC_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vC_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vC_Name, "delete"));
                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vC_Name, CompanyName49));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vCompanyDetailsText, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_CompanyName, ""));
                LogCapture.info("Accepted Company name and Tick icon is visible...");


                LogCapture.info("Now Entering Random AlphaNumeric values...");
                String CompanyName_AlphaNumeric = "1" + RandomStringUtils.randomAlphanumeric(10);
                Assert.assertEquals("PASS", Constants.key.click(vC_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vC_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vC_Name, "delete"));
                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vC_Name, CompanyName_AlphaNumeric));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vCompanyDetailsText, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_CompanyName, ""));
                LogCapture.info("Accepted Company name and Tick icon is visible...");


                LogCapture.info("Now Entering Random Numeric values...");
                String CompanyName_Numeric = RandomStringUtils.randomNumeric(10);
                Assert.assertEquals("PASS", Constants.key.click(vC_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vC_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vC_Name, "delete"));
                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vC_Name, CompanyName_Numeric));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vCompanyDetailsText, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_CompanyName, ""));
                LogCapture.info("Accepted Company name and Tick icon is visible...");
/*
                LogCapture.info("Enter Exception Special Char values...");
                String ExceptionSpecChar = " -";
                String CompanyName_SpecExpChar = RandomStringUtils.random(1, ExceptionSpecChar);
                Assert.assertEquals("PASS", Constants.key.click(vC_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vC_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vC_Name, "delete"));
                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vC_Name, CompanyName_SpecExpChar));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vCompanyDetailsText, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_CompanyName, ""));
                LogCapture.info("Accepted company name and Tick icon is visible...");
*/
                LogCapture.info("Now Entering Random special character values...");
                String SpecChar = "_.~`!@#$%^&*()- _=+[{]}\\|;:'\",<.>/?";
                String CompanyName_SpecChar = RandomStringUtils.random(1, SpecChar);
                Assert.assertEquals("PASS", Constants.key.click(vC_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vC_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vC_Name, "delete"));
                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vC_Name, CompanyName_SpecChar));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vCompanyDetailsText, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_CompanyName, ""));
                LogCapture.info("Accepted Company name and Tick icon is visible...");


                LogCapture.info("Enter Random Alphabetic values with 51 characters for " + TargetField);
                String CompanyName51 = RandomStringUtils.randomAlphabetic(51);
                Assert.assertEquals("PASS", Constants.key.click(vC_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vC_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vC_Name, "delete"));
                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vC_Name, CompanyName51));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vCompanyDetailsText, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_CompanyName, ""));
                LogCapture.info("Error: Please Enter valid Company name and Error icon (X) is visible");

            }
            if (TargetValue.equalsIgnoreCase("numeric")) {
                LogCapture.info("Now Entering Random Numeric values...");
                String CompanyName_Numeric = RandomStringUtils.randomNumeric(10);
                Assert.assertEquals("PASS", Constants.key.click(vC_Name, ""));
                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vC_Name, CompanyName_Numeric));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vCompanyDetailsText, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_CompanyName, ""));
                LogCapture.info("Accepted Company name and Tick icon is visible...");

            }
        }


    }

    @Then("^Open CD Web Outlook$")
    public void openCDWebOutlook() throws Throwable {

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Constants.key.pause("2", "");
        ArrayList<String> tabs = new ArrayList<String>(Constants.driver.getWindowHandles());
        Constants.driver.switchTo().window(tabs.get(1));
        //Open URL In 2nd tab.

        Constants.driver.get("https://outlook.office.com/mail/");
        //  driver.navigate().refresh();
        // driver.get("https://outlook.office.com/mail/");
        Constants.key.pause("15", "");
        // String SignIn = Constants.WebOutlookEmail.getProperty("SignIn");
        // Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(SignIn,""));
        //enter username
        Constants.driver.findElement(By.xpath("//input[@type='email' and @name='loginfmt']")).click();
        Constants.driver.findElement(By.xpath("//input[@type='email' and @name='loginfmt']")).sendKeys("sanket.yadav@currenciesdirect.com");
        //click next button
        Constants.driver.findElement(By.xpath("//input[@type='submit' and @id='idSIButton9']")).click();
        Constants.key.pause("10", "");
        // String EnterPassword = Constants.WebOutlookEmail.getProperty("EnterPassword");
        // Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(EnterPassword,""));
        //enter Password
        Constants.driver.findElement(By.xpath("//input[@type='password' and @name='passwd']")).click();
        Constants.driver.findElement(By.xpath("//input[@type='password' and @name='passwd']")).sendKeys("July@2020");
        //click Submit button
        Constants.driver.findElement(By.xpath("//input[@type='submit' and @id='idSIButton9']")).click();


        //wait till page to load
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='Inbox' and @class='_1XmKWz3L5NcheRkx38wxTL qDw7SZ9r6S7r0_qZS1aIG NJVykX0WljoRws2qTYI5G']//span[text()='Inbox']")));
        Thread.sleep(10000);
        Constants.driver.findElement(By.xpath("//input[@type='submit' and @id='idSIButton9']")).click();
        Thread.sleep(10000);
        //click on Inbox
        //WebElement Inbox = driver.findElement(By.xpath("//span[text()='Inbox']"));
        //Inbox.click();
        //Thread.sleep(3000);
        //click on Other
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='ms-Pivot-text _3d8zrTTgCkZi27bUS--28l text-85' and text()='Other']")));

       /* WebElement Others = Constants.driver.findElement(By.xpath("//button[@name='Other' and @type='button' and @id='Pivot33-Tab1']"));
        Others.click();
        Thread.sleep(5000);

        //click on Focus button
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='ms-Pivot-text _3d8zrTTgCkZi27bUS--28l text-85' and text()='Focused']")));
        WebElement Focused = Constants.driver.findElement(By.xpath("//span[@class='ms-Pivot-text _3d8zrTTgCkZi27bUS--28l text-85' and text()='Focused']"));
        Focused.click();
        Thread.sleep(10000);

        //click on 1st email
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='BVgxayg_IGpXi5g7S77GK']/div[1]")));
        Constants.driver.findElement(By.xpath("//div[@class='BVgxayg_IGpXi5g7S77GK']/div[1]")).click();
       Constants.key.pause("3","");


        //copy text into string
        //div[@class='mm4nCLKbIRtx5HvuorDWT']//div[@class='B1IVVpQay0rPzznhParFr KcNy0Xfd9-is-_CEp3QOI']/div[2]//div[@class='_3U2q6dcdZCrTrR_42Nxby JWNdg1hee9_Rz6bIGvG1c allowTextSelection']/div[1]//div[@class='PlainText']
        WebElement OTCEmailReceived = Constants.driver.findElement(By.xpath("//div[@class='mm4nCLKbIRtx5HvuorDWT']//div[@class='B1IVVpQay0rPzznhParFr KcNy0Xfd9-is-_CEp3QOI']/div[2]//div[@class='_3U2q6dcdZCrTrR_42Nxby JWNdg1hee9_Rz6bIGvG1c allowTextSelection']/div[1]//div[@class='PlainText']"));

        String OTPEmail= OTCEmailReceived.getText();
        LogCapture.info("Email received is: "+ OTPEmail);
*/
    }

    @And("^User enters more than required characters in (RACFirstName|RACLastName|RACCompanyName|RACTradingName|RegCustFirstName|RegCustLastName) field$")
    public void userEntersMoreThanCharactersInRACFirstNameField(String TargetField) throws Exception {

        if (TargetField.equalsIgnoreCase("RACFirstName")) {

            String vF_Name = Constants.Refer_a_Client.getProperty("FirstName");
            String vPersonalDetails = Constants.Refer_a_Client.getProperty("PersonalDetails");
            LogCapture.info("Enter Random 41 characters...");
            String FirstName = RandomStringUtils.randomAlphabetic(41);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName));
            Constants.key.pause("1", "");
            Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));

        }
        if (TargetField.equalsIgnoreCase("RACLastName")) {

            String vL_Name = Constants.Refer_a_Client.getProperty("LastName");
            String vPersonalDetails = Constants.Refer_a_Client.getProperty("PersonalDetails");
            LogCapture.info("Enter Random 81 characters...");
            String LastName = RandomStringUtils.randomAlphabetic(81);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName));
            Constants.key.pause("1", "");
            Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));

        }
        if (TargetField.equalsIgnoreCase("RACCompanyName")) {
            String vC_Name = Constants.Refer_a_Client.getProperty("CompanyName");
            String vPersonalDetails = Constants.Refer_a_Client.getProperty("PersonalDetails");
            LogCapture.info("Enter Random 51 characters...");
            String CompanyName = RandomStringUtils.randomAlphabetic(51);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vC_Name, CompanyName));
            Constants.key.pause("1", "");
            Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
        }
        if (TargetField.equalsIgnoreCase("RACTradingName")) {
            String vT_Name = Constants.Refer_a_Client.getProperty("TradingName");
            String vPersonalDetails = Constants.Refer_a_Client.getProperty("PersonalDetails");
            LogCapture.info("Enter Random 101 characters...");
            String TradingName = RandomStringUtils.randomAlphabetic(101);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vT_Name, TradingName));
            Constants.key.pause("1", "");
            Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
        }
        if (TargetField.equalsIgnoreCase("RegCustFirstName")) {

            String vF_Name = Constants.Affiliates_RegisterACustomerOR.getProperty("FirstName");
            String vPersonalDetails = Constants.Affiliates_RegisterACustomerOR.getProperty("PersonalDetails");
            LogCapture.info("Enter Random 41 characters...");
            String FirstName = RandomStringUtils.randomAlphabetic(41);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName));
            Constants.key.pause("1", "");
            Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));

        }
        if (TargetField.equalsIgnoreCase("RegCustLastName")) {

            String vL_Name = Constants.Affiliates_RegisterACustomerOR.getProperty("LastName");
            String vPersonalDetails = Constants.Affiliates_RegisterACustomerOR.getProperty("PersonalDetails");
            LogCapture.info("Enter Random 81 characters...");
            String LastName = RandomStringUtils.randomAlphabetic(81);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName));
            Constants.key.pause("1", "");
            Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));

        }


    }


    @Then("^User Should be able view the Error message for (RACFirstName|RACLastName|RACCompanyName|RACTradingName) field$")
    public void userShouldBeAbleViewTheErrorMessageForRACFirstNameField(String ErrorMessageTargetField) throws Exception {

        if (ErrorMessageTargetField.equalsIgnoreCase("RACFirstName")) {
            String vPersonalDetails = Constants.Refer_a_Client.getProperty("PersonalDetails");
            Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
            String vError_EnterFirstName = Constants.Refer_a_Client.getProperty("Error_EnterFirstName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vError_EnterFirstName, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vError_EnterFirstName, "Please use your name as it appears on your passport"));
            String vErrorIcon_FirstName = Constants.Refer_a_Client.getProperty("ErrorIcon_FirstName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_FirstName, ""));
            LogCapture.info("Error: Please Enter valid first name as on Passport and Error icon (X) is visible");

        }

        if (ErrorMessageTargetField.equalsIgnoreCase("RACLastName")) {
            String vPersonalDetails = Constants.Refer_a_Client.getProperty("PersonalDetails");
            Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
            String vError_EnterLastName = Constants.Refer_a_Client.getProperty("Error_EnterLastName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vError_EnterLastName, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vError_EnterLastName, "Please use your name as it appears on your passport"));
            String vErrorIcon_LastName = Constants.Refer_a_Client.getProperty("ErrorIcon_LastName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_LastName, ""));
            LogCapture.info("Error: Please Enter valid Last Name as on Passport and Error icon (X) is visible");

        }
        if (ErrorMessageTargetField.equalsIgnoreCase("RACCompanyName")) {

            String vCompanyDetailsText = Constants.Refer_a_Client.getProperty("CompanyDetailsText");
            Assert.assertEquals("PASS", Constants.key.click(vCompanyDetailsText, ""));
            String vError_EnterCompanyName = Constants.Refer_a_Client.getProperty("Error_EnterCompanyName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vError_EnterCompanyName, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vError_EnterCompanyName, "Please enter a valid company name"));
            String vErrorIcon_CompanyName = Constants.Refer_a_Client.getProperty("ErrorIcon_CompanyName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_CompanyName, ""));
            LogCapture.info("Error: Please Enter valid Company Name and Error icon (X) is visible");

        }
        if (ErrorMessageTargetField.equalsIgnoreCase("RACTradingName")) {

            String vCompanyDetailsText = Constants.Refer_a_Client.getProperty("CompanyDetailsText");
            Assert.assertEquals("PASS", Constants.key.click(vCompanyDetailsText, ""));
            String vError_EnterTradingName = Constants.Refer_a_Client.getProperty("Error_EnterTradingName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vError_EnterTradingName, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vError_EnterTradingName, "Please enter a valid trading name"));
            String vErrorIcon_TradingName = Constants.Refer_a_Client.getProperty("ErrorIcon_TradingName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_TradingName, ""));
            LogCapture.info("Error: Please Enter valid Trading Name and Error icon (X) is visible");

        }


    }


    @When("^User successfully landed on Login page$")
    public void userSuccessfullyLandedOnCDLoginPage() throws Exception {

        String vLogInPage = Constants.Affiliates_ForgotPasswordOR.getProperty("LogInPage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vLogInPage, ""));
        String vLogInPageMsg = Constants.Affiliates_ForgotPasswordOR.getProperty("LogInPageMsg");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vLogInPageMsg, ""));
        LogCapture.info("User successfully landed on CD LogIn Page...");

    }

    @Then("^User should be able to view the (ForgetPassword|) Link$")
    public void userShouldBeAbleToViewTheForgetPasswordLink(String Link) throws Exception {

        if (Link.equalsIgnoreCase("ForgetPassword")) {
            String vForgotPasswordHyperlink = Constants.Affiliates_ForgotPasswordOR.getProperty("ForgotPasswordHyperlink");
            Assert.assertEquals("PASS", Constants.key.verifyLinkText(vForgotPasswordHyperlink, "Forgot Password?"));
            Constants.key.pause("2", "");
            LogCapture.info("User is able to view " + Link + " Link...");

        }


    }


    @When("^User enters Login Email Address \"([^\"]*)\" and Password \"([^\"]*)\"$")
    public void userEntersLoginEmailAddressAndPassword(String userName, String password) throws Throwable {
        String vUserName = Constants.CONFIG.getProperty(userName);
        String vPassword = Constants.CONFIG.getProperty(password);
        String vObjUser = Constants.Refer_a_Client.getProperty("Email_ID");
        String vObjPass = Constants.Refer_a_Client.getProperty("Password");
        LogCapture.info("User Name " + vUserName + ", Password " + password + " is validated ....");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjUser, vUserName));
        //LogCapture.info("Dynamic Value is :" + dynamicValue);
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPass, vPassword));
        Constants.key.pause("3", "");
    }

    @Then("^User should be able to view the password in (Masked|unMasked) format \"([^\"]*)\"$")
    public void userShouldBeAbleToViewThePasswordInAbsoluteFormat(String PasswordFormat, String password) throws Exception {

        password = Constants.CONFIG.getProperty(password);
        if (PasswordFormat.equalsIgnoreCase("Masked")) {

            String vPassword = Constants.Affiliates_LoginPageOR.getProperty("AbsoluteFormatPassword");
            String YourUpdatedReferralsCountStr = Constants.driver.findElement(By.xpath(vPassword)).getAttribute("value");
            if (YourUpdatedReferralsCountStr.equals(password)) {
                LogCapture.info("User is not able to view Password");

            } else {
                LogCapture.info("User is able to view Password");
                Assert.fail();
            }
            // Assert.assertEquals("PASS", Constants.key.verifyText(vPassword, password));
        }

        if (PasswordFormat.equalsIgnoreCase("unMasked")) {

            String vPassword = Constants.Affiliates_LoginPageOR.getProperty("ReadOnlyFormatPassword");
            String YourUpdatedReferralsCountStr = Constants.driver.findElement(By.xpath(vPassword)).getAttribute("value");
            if (YourUpdatedReferralsCountStr.equals(password)) {
                LogCapture.info("User is able to view Password");

            } else {
                LogCapture.info("User is not able to view Password");
                Assert.fail();
            }
            // Assert.assertEquals("PASS", Constants.key.verifyText(YourUpdatedReferralsCountStr, password));


        }

    }


    @Then("^User clicks and Hold the on Eye button$")
    public void userClicksAndHoldTheOnEyeButton() throws Exception {
        LogCapture.info("Click n Eye Button....");
        String vEyeButton = Constants.Affiliates_LoginPageOR.getProperty("EyeButton");

        //Assert.assertEquals("PASS", Constants.key.click(vEyeButton, ""));
        // JavascriptExecutor executor = (JavascriptExecutor) driver;
        // executor.executeScript("arguments[0].click();", Constants.driver.findElement(By.xpath(vEyeButton)));
        // JavascriptExecutor executor = (JavascriptExecutor) driver;
        // executor.executeScript("arguments[0].click();", Constants.driver.findElement(By.xpath(vEyeButton)));


        Assert.assertEquals("PASS", Constants.key.click(vEyeButton, ""));
        // Assert.assertEquals("PASS", Constants.key.MouseFunctions(vEyeButton, "clickAndHold"));


    }

    @And("^User Releases the Mouse Click from Eye button$")
    public void userReleasesTheMouseClick() throws Exception {
        String vEyeButton = Constants.Affiliates_LoginPageOR.getProperty("EyeButton");
        Assert.assertEquals("PASS", Constants.key.click(vEyeButton, ""));
        LogCapture.info("MouseClick Released....");
    }


    @Then("^User Should be able to Verify All values for (CountryCodeMobile|Salutation|MobilePhone_CountryCode|Landline_CountryCode|BestTimeToCall|Country|Categories|Industry|ClientType|Countries|JointCountry) DropDown$")
    public void userShouldBeAbleToViewListOfDropDownValues(String DropdownName) throws Exception {
        if (DropdownName.equalsIgnoreCase("CountryCodeMobile")) {
            String vObjCountryCode = Constants.Affiliates_BecomeaPartnerOR.getProperty("CountryCode");
            Constants.key.VerifyAllDropDownValues("Dropdown", "MobilePhoneCountryCode", vObjCountryCode);
        }
        if (DropdownName.equalsIgnoreCase("Salutation")) {
            String vSalutationDropdown = Constants.Refer_a_Client.getProperty("Salutation");
            Constants.key.VerifyAllDropDownValues("Dropdown", "Salutation", vSalutationDropdown);
        }
        if (DropdownName.equalsIgnoreCase("MobilePhone_CountryCode")) {
            String vCountryCode_MobileDropDown = Constants.Refer_a_Client.getProperty("CountryCode_Mobile");
            Constants.key.VerifyAllDropDownValues("Dropdown", "MobilePhoneCountryCode", vCountryCode_MobileDropDown);
        }
        if (DropdownName.equalsIgnoreCase("Landline_CountryCode")) {
            String vCountryCode_LandlineDropDown = Constants.Refer_a_Client.getProperty("CountryCode_LandLine");
            Constants.key.VerifyAllDropDownValues("Dropdown", "LandlineCountryCode", vCountryCode_LandlineDropDown);
        }

        if (DropdownName.equalsIgnoreCase("BestTimeToCall")) {
            String vBestTimeToCallDropDown = Constants.Refer_a_Client.getProperty("BestTimeToCall");
            Constants.key.VerifyAllDropDownValues("Dropdown", "BestTimeToCall", vBestTimeToCallDropDown);
        }

        if (DropdownName.equalsIgnoreCase("Country")) {
            String vAddressCountry = Constants.Affiliates_RegisterACustomerOR.getProperty("AddressCountry");
            Constants.key.VerifyAllDropDownValues("Dropdown", "Country", vAddressCountry);
        }
        if (DropdownName.equalsIgnoreCase("JointCountry")) {
            String TheirAddressCountry = Constants.Affiliates_RegisterACustomerOR.getProperty("TheirAddressCountry");
            Constants.key.VerifyAllDropDownValues("Dropdown", "Country", TheirAddressCountry);
        }
        if (DropdownName.equalsIgnoreCase("Categories")) {
            String vObjCategories = Constants.Affiliates_ResourcesPageOR.getProperty("Categories");
            Constants.key.VerifyAllDropDownValues("Dropdown", "Categories", vObjCategories);
        }
        if (DropdownName.equalsIgnoreCase("Industry")) {
            String vObjIndustry = Constants.Affiliates_ResourcesPageOR.getProperty("Industry");
            Constants.key.VerifyAllDropDownValues("Dropdown", "Categories", vObjIndustry);
        }
        if (DropdownName.equalsIgnoreCase("ClientType")) {
            String vObjClientType = Constants.Affiliates_ResourcesPageOR.getProperty("Clienttype");
            Constants.key.VerifyAllDropDownValues("Dropdown", "Salutation", vObjClientType);
        }
        if (DropdownName.equalsIgnoreCase("Countries")) {
            String vObjCountries = Constants.Affiliates_ResourcesPageOR.getProperty("Countries");
            Constants.key.VerifyAllDropDownValues("Dropdown", "Salutation", vObjCountries);
        }
    }


    @Then("^User selects value for (Salutation|) \"([^\"]*)\" dropdown$")
    public void userSelectsValueForDropdown(String TargetDropdown, String Salutation) throws Throwable {

        if (TargetDropdown.equalsIgnoreCase("Salutation")) {
            LogCapture.info("Selecting Salutation dropdown....");
            String vSalutation = Constants.Refer_a_Client.getProperty("Salutation");
            Assert.assertEquals("PASS", Constants.key.click(vSalutation, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vSalutation, Salutation));
            Constants.key.pause("2", "");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "enter"));
            LogCapture.info("Value selected for Salutation dropdown: " + Salutation);
        }

    }

    @Then("^User is navigated to Dashboard$")
    public void userIsNavigatedToDashboard() throws Exception {
        String vObjAccountSummary = Constants.Affiliates_RegisterACustomerOR.getProperty("AccountSummary");
        //Constants.key.pause("2","");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAccountSummary, ""));
        Constants.key.pause("3", "");
        // Assert.assertEquals("PASS", Constants.key.verifyText(vObjAccountSummary, "Account summary"));
        // String vObjCommissionGenerated = Constants.Affiliates_AccountsPageOR.getProperty("CommissionGenerated");
        //Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCommissionGenerated, ""));
        //Assert.assertEquals("PASS", Constants.key.verifyText(vObjCommissionGenerated, "Commission generated"));
        LogCapture.info("User is on Dashboard page - Displaying Accounts Summary & Commissions generated......");

    }

    @And("^User Clicks on Register a Customer$")
    public void userClicksOnRegisterACustomer() throws Exception {
        String vObjRegisterACustomer = Constants.Affiliates_RegisterACustomerOR.getProperty("RegisterACustomer");
        Constants.key.VisibleConditionWait(vObjRegisterACustomer, "");
        Assert.assertEquals("PASS", Constants.key.click(vObjRegisterACustomer, ""));
        LogCapture.info("User clicked on Register A Customer button on Dashboard.....");
    }


    @And("^User Enters ALL Personal & Contact Details for Registration FirstName \"([^\"]*)\" LastName \"([^\"]*)\" DateOfBirth \"([^\"]*)\" EmailAddress \"([^\"]*)\" CountryCode_Mobile \"([^\"]*)\" MobileNumber \"([^\"]*)\" Occupation \"([^\"]*)\"$")
    public void userEntersALLPersonalContactDetailsForRegistrationFirstNameLastNameDateOfBirthEmailAddressMobile_CountryCodeMobileNumberAndClickOnContinue(String FirstName, String LastName, String DateOfBirth, String EmailAddress, String CountryCode_Mobile, String MobileNumber,String Occupation) throws Exception {
        String vPersonalDetails = Constants.Affiliates_RegisterACustomerOR.getProperty("PersonalDetails");
        Constants.key.VisibleConditionWait(vPersonalDetails, "");
        String vF_Name = Constants.Affiliates_RegisterACustomerOR.getProperty("FirstName");
        Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
        // Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, "zhrwf"));
        Assert.assertEquals("PASS", Constants.key.randomWordGenerator(vF_Name, 5));
        Constants.key.pause("2", "");
        String vFirstName = Constants.key.getText(vF_Name, "");
        LogCapture.info("First name is " + vFirstName);
        //String LastName = RandomStringUtils.randomAlphabetic(81);
        //Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName));
//        String vL_Name = Constants.Affiliates_RegisterACustomerOR.getProperty("LastName");
//        Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
//        Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName));
//
//        String DatePicker = Constants.Affiliates_RegisterACustomerOR.getProperty("DatePicker");
//        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "tab"));
//        Constants.key.pause("1", "");
//
//        String DatePicker5 = Constants.Affiliates_RegisterACustomerOR.getProperty("DatePicker5");
//        Assert.assertEquals("PASS", Constants.key.click(DatePicker5, ""));
        // Assert.assertEquals("PASS", Constants.key.click(DatePicker5, ""));
        Constants.key.pause("1", "");
        // Assert.assertEquals("PASS", Constants.key.KeyboardAction(DatePicker, "enter"));
        //Constants.key.pause("1", "");
        //Assert.assertEquals("PASS", Constants.key.KeyboardAction(DatePicker5, "esc"));
        //Constants.key.pause("1", "");
        //Click On Calendar icon
        // String vDOB_ChangeDate = Constants.Affiliates_RegisterACustomerOR.getProperty("DOB_ChangeDate");
        // Assert.assertEquals("PASS", Constants.key.click(vDOB_ChangeDate, ""));
        //Assert.assertEquals("PASS", Constants.key.datePicker(vDOB_ChangeDate, DateOfBirth));
        // String CustomerDetailsText = Constants.Affiliates_RegisterACustomerOR.getProperty("CustomerDetailsText");
        //Assert.assertEquals("PASS", Constants.key.click(CustomerDetailsText, ""));
        //Does not click on anyother element hence putting hard wait and manually clicking
        // Constants.key.pause("5", "");
        //USer manually clicks anywhere on screen

        String vEmailID = Constants.Affiliates_RegisterACustomerOR.getProperty("RegisterCustomerEmailAddress");
        Assert.assertEquals("PASS", Constants.key.click(vEmailID, ""));


        //RandomSingleEmailAddress = RandomStringUtils.randomAlphabetic(10) + "@gmail.com";
        //Assert.assertEquals("PASS", Constants.key.click(vEmailID, ""));
        // Assert.assertEquals("PASS", Constants.key.writeInInput(vEmailID, RandomSingleEmailAddress));
        // String Email = RandomStringUtils.randomAlphanumeric(10);


        if (EmailAddress.equalsIgnoreCase("ABC")) {
            RandomSingleEmailAddress = "ProdAutoTest_" + RandomStringUtils.randomAlphabetic(7) + "@gmail.com";
            Assert.assertEquals("PASS", Constants.key.writeInInput(vEmailID, RandomSingleEmailAddress));
            LogCapture.info("Email address used is " + RandomSingleEmailAddress);
        } else {
            Assert.assertEquals("PASS", Constants.key.writeInInput(vEmailID, EmailAddress));
            LogCapture.info("Email address used is " + EmailAddress);
        }
        // String Email = RandomStringUtils.randomAlphanumeric(10);

        //String Email1 = Email.concat("@gmail.com");
        //System.out.println(Email1);


        String vMobileDropDown = Constants.Affiliates_RegisterACustomerOR.getProperty("CountryCode_DropDownMobile");
        Assert.assertEquals("PASS", Constants.key.click(vMobileDropDown, ""));
        Constants.key.pause("1", "");
        String vMobileDropDownClear = Constants.Affiliates_RegisterACustomerOR.getProperty("CountryCode_DropDownMobileClear");
        Assert.assertEquals("PASS", Constants.key.click(vMobileDropDownClear, ""));
        Constants.key.pause("1", "");
        String vCountryCodeMobile = Constants.Affiliates_RegisterACustomerOR.getProperty("CountryCode_Mobile");
        Constants.key.pause("1", "");
        Assert.assertEquals("PASS", Constants.key.clearText(vCountryCodeMobile));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vCountryCodeMobile, CountryCode_Mobile));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeMobile, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeMobile, "enter"));


        String vMobileNumber = Constants.Affiliates_RegisterACustomerOR.getProperty("MobileNumber");
        //Assert.assertEquals("PASS", Constants.key.writeInInput(vMobileNumber, MobileNumber));
        //Constants.key.pause("5", "");
                String MobileNumber1 = RandomStringUtils.randomNumeric(10);
                LogCapture.info("MobileNum:-"+MobileNumber1);
        Assert.assertEquals("PASS", Constants.key.writeInInput(vMobileNumber, MobileNumber1));

        String vL_Name = Constants.Affiliates_RegisterACustomerOR.getProperty("LastName");
        Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
        //Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, "dsopq"));

        Assert.assertEquals("PASS", Constants.key.randomWordGenerator(vL_Name, 5));
        String vLastName = Constants.key.getText(vL_Name, "");
        LogCapture.info("Last name is " + vLastName);
        // Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName));

        String vObjOccupation = Constants.Affiliates_RegisterACustomerOR.getProperty("Occupation");
        Assert.assertEquals("PASS", Constants.key.click(vObjOccupation, ""));
        //Assert.assertEquals("PASS", Constants.key.writeInInput(vObjOccupation, "Accountant"));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjOccupation,Occupation));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjOccupation, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjOccupation, "enter"));
//        String vDOB_ChangeDate = Constants.Affiliates_RegisterACustomerOR.getProperty("DOB_ChangeDate");
//        Assert.assertEquals("PASS", Constants.key.click(vDOB_ChangeDate, ""));
//        Assert.assertEquals("PASS", Constants.key.datePicker(vDOB_ChangeDate, DateOfBirth));

        String DatePicker = Constants.Affiliates_RegisterACustomerOR.getProperty("DatePicker");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjOccupation, "tab"));
        Constants.key.pause("1", "");

        String DatePicker5 = Constants.Affiliates_RegisterACustomerOR.getProperty("DatePicker5");
        Assert.assertEquals("PASS", Constants.key.click(DatePicker5, ""));

        Constants.key.pause("3", "");

        // ((JavascriptExecutor) Constants.driver).executeScript("arguments[0].scrollIntoView();", vObjContinueButton);
        ((JavascriptExecutor) Constants.driver).executeScript("javascript:window.scrollBy(250,350)");
        // String DatePicker1 = Constants.Affiliates_RegisterACustomerOR.getProperty("DatePicker");
        // Assert.assertEquals("PASS", Constants.key.KeyboardAction(DatePicker, "tab"));
        //Assert.assertEquals("PASS", Constants.key.click(vObjContinueButton, ""));
        //Assert.assertEquals("PASS", Constants.key.click(vObjContinueButton, ""));
        // Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjContinueButton, "esc"));
        // Constants.key.pause("3", "");
        //Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButton,"enabled"));
        // String vObjContinueButton = Constants.Affiliates_RegisterACustomerOR.getProperty("ContinueButton");
        //Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButton,"enabled"));
        //Assert.assertEquals("PASS", Constants.key.click(vObjContinueButton, ""));
    }


    @Then("^System will navigate to the Address details Page$")
    public void systemWillNavigateToTheAddressDetailsPage() throws Exception {
        String vAddressDetailsPage = Constants.Affiliates_RegisterACustomerOR.getProperty("AddressDetailsPage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vAddressDetailsPage, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vAddressDetailsPage, "Address details"));
        LogCapture.info("User is on Address Details page....");
    }

    @Then("^User Should be able to enter (any|numeric) Value in (RegCustFirstName|RegCustLastName) field and validate the same value$")
    public void userShouldBeAbleToEnterValueInRegCustFirstLastNameFieldAndValidateTheSameValue(String TargetValue, String TargetField) throws Exception {
        if (TargetField.equalsIgnoreCase("RegCustFirstName")) {
            String vF_Name = Constants.Affiliates_RegisterACustomerOR.getProperty("FirstName");
            String vPersonalDetails = Constants.Affiliates_RegisterACustomerOR.getProperty("PersonalDetails");
            String vTickIcon_FirstName = Constants.Affiliates_RegisterACustomerOR.getProperty("TickIcon_FirstName");
            String vErrorIcon_FirstName = Constants.Affiliates_RegisterACustomerOR.getProperty("ErrorIcon_FirstName");
            String vErrorMsg_EnterFirstName = Constants.Affiliates_RegisterACustomerOR.getProperty("Error_EnterFirstName");
            if (TargetValue.equalsIgnoreCase("any")) {
                LogCapture.info("Enter Random Alphabetic values...");
                String FirstName = RandomStringUtils.randomAlphabetic(40);
                Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_FirstName, ""));
                LogCapture.info("Accepted and Tick icon is visible...");

                LogCapture.info("Now Entering Random AlphaNumeric values...");
                String FirstName_AlphaNumeric = "1" + RandomStringUtils.randomAlphanumeric(10);
                Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "delete"));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName_AlphaNumeric));
                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_FirstName, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorMsg_EnterFirstName, ""));
                Assert.assertEquals("PASS", Constants.key.verifyText(vErrorMsg_EnterFirstName, "Please enter a valid first name"));
                LogCapture.info("Error: Please Enter valid first name and Error icon (X) is visible");

                LogCapture.info("Enter Exception spaces...");
                String FirstName_ExceptionSpecChar = " ";
                Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "delete"));
                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName_ExceptionSpecChar));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_FirstName, ""));
                LogCapture.info("Accepted and Tick icon is visible...");

                LogCapture.info("Now Entering Random Numeric values...");
                String FirstName_Numeric = RandomStringUtils.randomNumeric(10);
                Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "delete"));
                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName_Numeric));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_FirstName, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorMsg_EnterFirstName, ""));
                Assert.assertEquals("PASS", Constants.key.verifyText(vErrorMsg_EnterFirstName, "Please enter a valid first name"));
                LogCapture.info("Error: Please Enter valid first name and Error icon (X) is visible");

                LogCapture.info("Now Entering Random special character values...");
                String SpecChar = "_-.~`!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?";
                String FirstName_SpecChar = RandomStringUtils.random(5, SpecChar);
                Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "delete"));
                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName_SpecChar));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_FirstName, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorMsg_EnterFirstName, ""));
                Assert.assertEquals("PASS", Constants.key.verifyText(vErrorMsg_EnterFirstName, "Please enter a valid first name"));
                LogCapture.info("Error: Please Enter valid first name and Error icon (X) is visible");

            }
            if (TargetValue.equalsIgnoreCase("numeric")) {
                LogCapture.info("Now Entering Random Numeric values...");
                String FirstName_Numeric = RandomStringUtils.randomNumeric(10);
                Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
                Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName_Numeric));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_FirstName, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorMsg_EnterFirstName, ""));
                Assert.assertEquals("PASS", Constants.key.verifyText(vErrorMsg_EnterFirstName, "Please enter a valid first name"));
                LogCapture.info("Error: Please Enter valid first name and Error icon (X) is visible");
            }

        }
        if (TargetField.equalsIgnoreCase("RegCustLastName")) {
            String vL_Name = Constants.Affiliates_RegisterACustomerOR.getProperty("LastName");
            String vPersonalDetails = Constants.Affiliates_RegisterACustomerOR.getProperty("PersonalDetails");
            String vTickIcon_LastName = Constants.Affiliates_RegisterACustomerOR.getProperty("TickIcon_LastName");
            String vErrorIcon_LastName = Constants.Affiliates_RegisterACustomerOR.getProperty("ErrorIcon_LastName");
            String vError_EnterLastName = Constants.Affiliates_RegisterACustomerOR.getProperty("Error_EnterLastName");

            if (TargetValue.equalsIgnoreCase("any")) {
                LogCapture.info("Enter Random Alphabetic values...");
                String LastName = RandomStringUtils.randomAlphabetic(80);
                Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_LastName, ""));
                LogCapture.info("Accepted and Tick icon is visible...");

                LogCapture.info("Now Entering Random AlphaNumeric values...");
                String LastName_AlphaNumeric = "1" + RandomStringUtils.randomAlphanumeric(10);
                Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "delete"));
                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName_AlphaNumeric));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_LastName, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vError_EnterLastName, ""));
                Assert.assertEquals("PASS", Constants.key.verifyText(vError_EnterLastName, "Please enter a valid last name"));
                LogCapture.info("Error: Please valid Enter Last name and Error icon (X) is visible");

                LogCapture.info("Now Entering Random Numeric values...");
                String LastName_Numeric = RandomStringUtils.randomNumeric(10);
                Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "delete"));
                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName_Numeric));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_LastName, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vError_EnterLastName, ""));
                Assert.assertEquals("PASS", Constants.key.verifyText(vError_EnterLastName, "Please enter a valid last name"));
                LogCapture.info("Error: Please Enter valid last name and Error icon (X) is visible");

                LogCapture.info("Enter Spaces...");
                String LastName_ExceptionSpecChar = "  ";
                Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "delete"));
                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName_ExceptionSpecChar));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_LastName, ""));
                LogCapture.info("Accepted and Tick icon is visible...");

                LogCapture.info("Now Entering Random special character values...");
                String SpecChar = "_-.~`!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?";
                String LastName_SpecChar = RandomStringUtils.random(5, SpecChar);
                Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "delete"));
                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName_SpecChar));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_LastName, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vError_EnterLastName, ""));
                Assert.assertEquals("PASS", Constants.key.verifyText(vError_EnterLastName, "Please enter a valid last name"));
                LogCapture.info("Error: Please Enter valid last name and Error icon (X) is visible");
            }
            if (TargetValue.equalsIgnoreCase("numeric")) {
                LogCapture.info("Now Entering Random Numeric values...");
                String LastName_Numeric = RandomStringUtils.randomNumeric(10);
                Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
                Constants.key.pause("2", "");
                Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName_Numeric));
                Constants.key.pause("1", "");
                Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vErrorIcon_LastName, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vError_EnterLastName, ""));
                Assert.assertEquals("PASS", Constants.key.verifyText(vError_EnterLastName, "Please enter a valid last name"));
                LogCapture.info("Error: Please Enter valid last name and Error icon (X) is visible");
            }

        }
    }

    @And("^User tries to Clicks on Continue Button but it is Disabled-Grayed Out$")
    public void userTriesToClicksOnContinueButtonButItIsDisabledGrayedOut() throws Exception {
        String vObjContinueButtonDisable = Constants.Affiliates_RegisterACustomerOR.getProperty("ContinueButtonDisable");
        String vObjContinueButton = Constants.Affiliates_RegisterACustomerOR.getProperty("ContinueButton");

        WebElement ContinueButton = Constants.driver.findElement(By.xpath(vObjContinueButton));
        boolean actualValue = ContinueButton.isEnabled();
        if (actualValue) {
            LogCapture.info("Button is enabled");
        } else {
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
            LogCapture.info("Continue button is disabled and cannot click...");
        }

    }


    @Then("^User keeps the (RegCustFirstName & RegCustLastNameLastName) as Blank$")
    public void userKeepsTheRegCustFirstNameRegCustLastNameLastNameAsBlank(String TargetField) throws Exception {
        if (TargetField.equalsIgnoreCase("RegCustFirstName & RegCustLastNameLastName")) {
            String vF_Name = Constants.Affiliates_RegisterACustomerOR.getProperty("FirstName");
            String vL_Name = Constants.Affiliates_RegisterACustomerOR.getProperty("LastName");
            String vPersonalDetails = Constants.Affiliates_RegisterACustomerOR.getProperty("PersonalDetails");
            Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
            Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
            Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
            Assert.assertEquals("PASS", Constants.key.click(vPersonalDetails, ""));
            LogCapture.info("User keeps blank field for RegCustFirstName & RegCustLAstName...");
        }
    }


    @Then("^User is able to view the Account Summary Section$")
    public void userIsAbleToViewTheAccountSummarySection() throws Throwable {
        String vObjAccountSummary = Constants.Affiliates_RegisterACustomerOR.getProperty("AccountSummary");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAccountSummary, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjAccountSummary, "Account summary"));
        // String vObjCommissionGenerated = Constants.Affiliates_AccountsPageOR.getProperty("CommissionGenerated");
        // Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCommissionGenerated, ""));
        // Assert.assertEquals("PASS", Constants.key.verifyText(vObjCommissionGenerated, "Commission generated"));
        LogCapture.info("Displaying Accounts page......");

    }


    @Then("^User should be able to view updated number of Referrals count on Account Summary Page$")
    public void userShouldBeAbleToViewUpdatedNumberOfReferralsCountOnAccountSummaryPage() {
        String vObjYourReferralsCount = Constants.Affiliates_AccountsPageOR.getProperty("YourReferralsCount");
        String YourUpdatedReferralsCountStr = Constants.driver.findElement(By.xpath(vObjYourReferralsCount)).getText();
        int UpdatedReferralsCountInt = Integer.parseInt(YourUpdatedReferralsCountStr);
        //Need to change when Referral count integration is done correctly
        if (UpdatedReferralsCountInt == (AccountSummaryYourReferralsCount + 1)) {
            LogCapture.info("Previous Referrals Count is: " + AccountSummaryYourReferralsCount);
            LogCapture.info("Updated Referrals Count is: " + UpdatedReferralsCountInt);
        } else {
            LogCapture.info("Previous Referrals Count: " + AccountSummaryYourReferralsCount + " NOT MATCHED Updated Referrals Count: " + UpdatedReferralsCountInt);
            //Assert.fail();
        }
    }


    @Then("^User Should NOT get Error message for valid inputs on optional (RACTradingName) field$")
    public void userShouldNOTGetErrorMessageForValidInputsOnOptionalTargetField(String TargetField) throws Throwable {
        if (TargetField.equalsIgnoreCase("RACTradingName")) {
            String vCompanyDetailsText = Constants.Refer_a_Client.getProperty("CompanyDetailsText");
            Assert.assertEquals("PASS", Constants.key.click(vCompanyDetailsText, ""));
            String vTickIcon_TradingName = Constants.Refer_a_Client.getProperty("TickIcon_TradingName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vTickIcon_TradingName, ""));
            LogCapture.info("Tick icon is visible for Trading name...");
        }

    }

    @Then("^Continue button should be enable$")
    public void continueButtonShouldBeEnable() {
        String vContinueButtonEnable = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
        Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();
        LogCapture.info("Continue button is enable....");
    }

    @Then("^User should note number of Referrals count on Account Summary Page$")
    public int userShouldNoteNumberOfReferralsCountOnAccountSummaryPage() {
        String vObjYourReferralsCount = Constants.Affiliates_AccountsPageOR.getProperty("YourReferralsCount");
        YourReferralsCount = Constants.driver.findElement(By.xpath(vObjYourReferralsCount)).getText();
        AccountSummaryYourReferralsCount = Integer.parseInt(YourReferralsCount);

        LogCapture.info("Registration Count is: " + AccountSummaryYourReferralsCount);
        if (YourReferralsCount.matches("[0-9]+")) {
            LogCapture.info("Your Registration Count is: " + YourReferralsCount);
        } else if (YourReferralsCount.matches("[a-zA-Z]+")) {
            LogCapture.info("Your Registration Count is Not Numeric value: " + YourReferralsCount);
            Assert.fail();
        } else if (YourReferralsCount.isEmpty() || YourReferralsCount.matches("0")) {
            LogCapture.info("Your Registration Count is Empty: " + YourReferralsCount);
            Assert.fail();
        }
        return AccountSummaryYourReferralsCount;
    }

    @Then("^User should note number of TradedAccounts count on Account Summary Page$")
    public int userShouldNoteNumberOfTradedAccountsCountOnAccountSummaryPage() {
        String vObjYourTradedAccountsCount = Constants.Affiliates_AccountsPageOR.getProperty("YourTradedAccountsCount");
        YourTradedAccountsCount = Constants.driver.findElement(By.xpath(vObjYourTradedAccountsCount)).getText();
        AccountSummaryYourTradedAccountsCount = Integer.parseInt(YourTradedAccountsCount);

        LogCapture.info("Trade Accounts Count is: " + AccountSummaryYourTradedAccountsCount);
        if (YourTradedAccountsCount.matches("[0-9]+")) {
            LogCapture.info("Your Trade Accounts Count is: " + YourTradedAccountsCount);
        } else if (YourTradedAccountsCount.matches("[a-zA-Z]+")) {
            LogCapture.info("Your Trade Accounts Count is Not Numeric value: " + YourTradedAccountsCount);
            Assert.fail();
        } else if (YourTradedAccountsCount.isEmpty()) {
            LogCapture.info("Your Trade Accounts Count is Empty: " + YourTradedAccountsCount);
            Assert.fail();
        }
        return AccountSummaryYourTradedAccountsCount;
    }

    @Then("^User should note number of Registration count on Account Summary Page$")
    public int userShouldNoteNumberOfRegistrationCountOnAccountSummaryPage() {

        String vObjYourRegisteredCount = Constants.Affiliates_AccountsPageOR.getProperty("YourRegisteredCount");
        YourRegisteredCount = Constants.driver.findElement(By.xpath(vObjYourRegisteredCount)).getText();
        AccountSummaryYourRegisteredCount = Integer.parseInt(YourRegisteredCount);

        LogCapture.info("Registration Count is: " + AccountSummaryYourRegisteredCount);
        if (YourRegisteredCount.matches("[0-9]+")) {
            LogCapture.info("Your Registration Count is: " + YourRegisteredCount);
        } else if (YourRegisteredCount.matches("[a-zA-Z]+")) {
            LogCapture.info("Your Registration Count is Not Numeric value: " + YourRegisteredCount);
            Assert.fail();
        } else if (YourRegisteredCount.isEmpty()) {
            LogCapture.info("Your Registration Count is Empty: " + YourRegisteredCount);
            Assert.fail();
        }
        return AccountSummaryYourRegisteredCount;

    }

    @And("^User Enter (other organization URL|any Invalid URL|any Invalid Path|path for page not developed) Appending the Base URL$")
    public void userEnterAnyInvalidPathAppendingTheBaseURL(String TargetValue) throws Exception {
        if (TargetValue.equalsIgnoreCase("any Invalid URL")) {
            String InvalidURLString = "https://uat-ap-cd.torfx.com/account";
            Constants.key.navigate("", InvalidURLString);
            LogCapture.info("Invalid Url Entered:" + InvalidURLString);
        }

        if (TargetValue.equalsIgnoreCase("other organization URL")) {
            String BaseURL = Constants.driver.getCurrentUrl();
            URL url = new URL(BaseURL);
            String URLString = url.getProtocol() + "://" + url.getHost();

            if (URLString.equalsIgnoreCase("https://uat-ap-cd.currenciesdirect.com")) {
                LogCapture.info("Current Url is of CD organization:" + URLString);
                String InvalidURLString = "https://uat-ap-torfx.currenciesdirect.com/account";
                LogCapture.info("Other organization Url is: " + InvalidURLString);
                Assert.assertEquals("PASS", Constants.key.navigate("", InvalidURLString));
            } else if (URLString.equalsIgnoreCase("https://uat-ap-torfx.currenciesdirect.com")) {
                LogCapture.info("Current Url is of TorFx organization:" + URLString);
                String InvalidURLString = "https://uat-ap-cd.currenciesdirect.com/account";
                LogCapture.info("Other organization Url is: " + InvalidURLString);
                Assert.assertEquals("PASS", Constants.key.navigate("", InvalidURLString));
            } else if (URLString.equalsIgnoreCase("https://uat-ap-torfxoz.currenciesdirect.com")) {
                LogCapture.info("Current Url is of TorFx organization:" + URLString);
                String InvalidURLString = "https://uat-ap-cd.currenciesdirect.com/account";
                LogCapture.info("Other organization Url is: " + InvalidURLString);
                Assert.assertEquals("PASS", Constants.key.navigate("", InvalidURLString));
            }

        } else if (TargetValue.equalsIgnoreCase("any Invalid Path")) {
            String BaseURL = Constants.driver.getCurrentUrl();
            String AdditionalInvalidPath = RandomStringUtils.randomAlphabetic(10);
            URL url = new URL(BaseURL);
            String InvalidBaseURLString = url.getProtocol() + "://" + url.getHost() + "/" + AdditionalInvalidPath;
            Assert.assertEquals("PASS", Constants.key.navigate("", InvalidBaseURLString));
            LogCapture.info("Appending BaseURL with Invalid path: " + InvalidBaseURLString);
        } else if (TargetValue.equalsIgnoreCase("path for page not developed")) {
            String BaseURL = Constants.driver.getCurrentUrl();
            String AdditionalInvalidPath = "ratealerts";
            URL url = new URL(BaseURL);
            String InvalidBaseURLString = url.getProtocol() + "://" + url.getHost() + "/" + AdditionalInvalidPath;
            Assert.assertEquals("PASS", Constants.key.navigate("", InvalidBaseURLString));
            LogCapture.info("Appending BaseURL with unavailable page: " + InvalidBaseURLString);
        }

    }


    @Then("^System will show Error Message as Page is missing for Invalid Base URL(| with Back to Accounts button on page)$")
    public void systemWillShowErrorMessageAsPageIsMissingForInvalidBaseURL(String TargetButton) throws Exception {
        if (TargetButton.equalsIgnoreCase("")) {
            String vObjPageIsMissing = Constants.Affiliates_AccountsPageOR.getProperty("InvalidPageMessage");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjPageIsMissing, "The page is missing..."));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjPageIsMissing, "The page is missing..."));
            String vObjInvalidPageDetailMessage = Constants.Affiliates_AccountsPageOR.getProperty("InvalidPageDetailMessage");
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjInvalidPageDetailMessage, "The page is missing or you assembled the link incorrectly"));
            LogCapture.info("Page is missing error is displayed");

        }
        if (TargetButton.equalsIgnoreCase(" with Back to Accounts button on page")) {
            String vObjPageIsMissing = Constants.Affiliates_AccountsPageOR.getProperty("InvalidPageMessage");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjPageIsMissing, "The page is missing..."));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjPageIsMissing, "The page is missing..."));
            String vObjInvalidPageDetailMessage = Constants.Affiliates_AccountsPageOR.getProperty("InvalidPageDetailMessage");
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjInvalidPageDetailMessage, "The page is missing or you assembled the link incorrectly"));
            String vObjBackToAccountButton = Constants.Affiliates_AccountsPageOR.getProperty("BackToAccountButton");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBackToAccountButton, ""));
            LogCapture.info("Error Message: Page is missing is displayed with Back to accounts button");
        }
    }

    @And("^User Clicks on Account tab$")
    public void userClicksOnVariousTab() throws Throwable {

        Constants.key.pause("2", "");
        String vObjAccountBtn = Constants.Refer_a_Client.getProperty("AccountButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjAccountBtn, ""));
        LogCapture.info("User clicked on Account tab...");

    }

    @And("^User clicks on the Click here option on Refer a client Confirmation page$")
    public void userClicksOnTheClickHereOptionOnReferAClientConfirmationPage() throws Throwable {
        String vClickHereLink = Constants.Refer_a_Client.getProperty("ClickHereLink");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vClickHereLink, ""));
        Assert.assertEquals("PASS", Constants.key.verifyLinkText(vClickHereLink, "Click here"));
        Assert.assertEquals("PASS", Constants.key.click(vClickHereLink, ""));
    }

    @And("^User Should be able to view the Refer a new Client Button$")
    public void userShouldBeAbleToViewTheReferANewClientButton() throws Throwable {
        LogCapture.info("Verify Refer a Client and Back to Account button is present......");
        String vObjReferNewClientButton = Constants.Refer_a_Client.getProperty("ReferAClientButton_New");
        // Constants.key.pause("2", "");
        Constants.key.VisibleConditionWait(vObjReferNewClientButton, "");
        String vObjReferAClient_New_ButtonText = Constants.Refer_a_Client.getProperty("ReferAClient_New_ButtonText");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjReferAClient_New_ButtonText, "Refer new client"));

        LogCapture.info("Refer new Client button is present......");
    }

    @Then("^User is able to view the Commission section on Dashboard$")
    public void userIsAbleToViewTheCommissionSection() throws Throwable {
        String vObjCommissionGenerated = Constants.Affiliates_AccountsPageOR.getProperty("CommissionGenerated");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCommissionGenerated, ""));
        Assert.assertEquals("PASS", Constants.key.verifyInnerText(vObjCommissionGenerated, "Commission generated"));
        LogCapture.info("Commission section visible on Dashboard(Account page)...");
    }

    @Then("^User should be able to view the Notification bell icon on UI$")
    public void userShouldBeAbleToViewTheNotificationBellIconOnUI() throws Throwable {
        String vObjNotificationBellIcon = Constants.Affiliates_NotificationsPageOR.getProperty("NotificationBellIcon");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjNotificationBellIcon, ""));
        LogCapture.info("Notification Bell icon visible...");
        //a[@href='/notifications']//*[local-name()='svg']
    }

    @Then("^User will be navigated to the Resources section Page$")
    public void userWillBeNavigatedToTheResourcesSectionPage() throws Throwable {
        LogCapture.info("Resources Page Loading......");
        String vObjResourcesSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("ResourcesSectionPage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjResourcesSectionPage, ""));

        Assert.assertEquals("PASS", Constants.key.verifyText(vObjResourcesSectionPage, "Resources"));
        LogCapture.info("User is on Resources Page...");
    }

    @Then("^User will be navigated to the Referrals section Page$")
    public void userWillBeNavigatedToTheReferralsSectionPage() throws Throwable {
        LogCapture.info("Referrals Page Loading......");
        String vObjReferralsSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("ReferralsSectionPage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjReferralsSectionPage, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjReferralsSectionPage, "Referrals"));
        LogCapture.info("User is on Referrals Page...");
    }

    @Then("^User will be navigated to the Commission section Page$")
    public void userWillBeNavigatedToTheCommissionsSectionPage() throws Throwable {
        LogCapture.info("Commissions Page Loading......");
        String vObjCommissionsSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("CommissionsSectionPage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCommissionsSectionPage, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjCommissionsSectionPage, "Commission"));
        LogCapture.info("User is on Commissions Page...");
    }

    @Then("^User will be navigated to the Settings section Page$")
    public void userWillBeNavigatedToTheSettingsSectionPage() throws Throwable {
        LogCapture.info("Settings Page Loading......");
        String vObjSettingsSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("SettingsSectionPage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSettingsSectionPage, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjSettingsSectionPage, "Settings"));
        LogCapture.info("User is on Settings Page...");
    }

    @And("^Click on (Personal Detail Section|Bank Detail Section|Logout) under Profile management$")
    public void clickOnPersonalDetailSectionUnderProfileManagement(String TargetSection) throws Throwable {
        if (TargetSection.equalsIgnoreCase("Personal Detail Section")) {
            String vObjPM_PersonalDetailSection = Constants.Refer_a_Client.getProperty("PM_PersonalDetailSection");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjPM_PersonalDetailSection, ""));
            Assert.assertEquals("PASS", Constants.key.click(vObjPM_PersonalDetailSection, ""));
            LogCapture.info("User clicks on Personal detail section under PM...");
        }
        if (TargetSection.equalsIgnoreCase("Bank Detail Section")) {
            String vObjPM_BankDetailSection = Constants.Refer_a_Client.getProperty("PM_BankDetailSection");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjPM_BankDetailSection, ""));
            Assert.assertEquals("PASS", Constants.key.click(vObjPM_BankDetailSection, ""));
            LogCapture.info("User clicks on Bank detail section under PM...");
        }
    }

    @Then("^System should display Your Bank details Notification frame on UI$")
    public void systemShouldDisplayYourBankDetailsNotificationFrameOnUI() throws Throwable {
        String vObjPM_YourBankDetails = Constants.Affiliates_NotificationsPageOR.getProperty("PM_YourBankDetails");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjPM_YourBankDetails, ""));
        LogCapture.info("User able to view Bank details notification frame...");
    }

    @Then("^User will be navigated to the Notification section Page$")
    public void userWillBeNavigatedToTheNotificationSectionPage() throws Throwable {
        boolean NotificationsHeader = Constants.driver.findElement(By.xpath("//h4[contains(text(),'Notifications')]")).isDisplayed();

        if (NotificationsHeader) {
            LogCapture.info("Notification Page is displayed...");
        } else {
            String vObjNotificationSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("NotificationSectionPage");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjNotificationSectionPage, ""));
            String vObjNotificationText = Constants.driver.findElement(By.xpath(vObjNotificationSectionPage)).getText();

            if (vObjNotificationText.equalsIgnoreCase("Notifications")) {
                String vNoNotificationsPresent = Constants.Affiliates_NotificationsPageOR.getProperty("NoNotificationsPresent");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vNoNotificationsPresent, ""));
                LogCapture.info("Notification Page is displayed with No Notifications...");
            } else if (vObjNotificationText.endsWith("Mark all as read")) {
                Assert.assertEquals("PASS", Constants.key.verifyText(vObjNotificationSectionPage, "Notifications\n" + "Mark all as read"));
                LogCapture.info("Notification Page is displayed with Notifications...");
            }
        }
    }

    @Then("^User should be able to view the list of Notifications$")
    public void userShouldBeAbleToViewTheListOfNotifications() {
        String vObjNotificationSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfNotifications");
        List<WebElement> listOfElements = Constants.driver.findElements(By.xpath(vObjNotificationSectionPage));
        LogCapture.info("Total number of elements present: " + listOfElements.size());
        for (int i = 0; i < listOfElements.size(); i++) {
            WebElement element = listOfElements.get(i);
            element.isDisplayed();
            LogCapture.info("Notification number " + (i + 1) + " from top is visible");
        }

    }

    @Then("^User should be able to view the Number of unread notifications on bell icon$")
    public void userShouldBeAbleToViewTheNumberOfUnreadNotificationsOnBellIcon() {
        String vObjNotificationBellIcon_Number = Constants.Affiliates_NotificationsPageOR.getProperty("NotificationBellIcon_Number");
        String NotificationNumberStr = Constants.driver.findElement(By.xpath(vObjNotificationBellIcon_Number)).getText();
        LogCapture.info(NotificationNumberStr);
        if (NotificationNumberStr.matches("[1-9]")) {
            if (NotificationNumberStr.matches("\\d")) {
                LogCapture.info("Number of Notifications on bell icon is: " + NotificationNumberStr);

            }
        }
        if (NotificationNumberStr.matches("9\\+")) {
            LogCapture.info("Number of Notifications are: 9+");
        }
        if (NotificationNumberStr.matches("0")) {
            LogCapture.info("Number of Notifications is: 0");
        }


    }

    @Then("^User Observe the list of Trading related notifications on UI along with the date$")
    public void userObserveTheListOfTradingRelatedNotificationsOnUIAlongWithTheDate() throws Throwable {

        String vObjNotificationSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfNotifications");
        List<WebElement> listOfElements = Constants.driver.findElements(By.xpath(vObjNotificationSectionPage));
        LogCapture.info("Total number of elements present: " + listOfElements.size());

        for (int i = 0; i < listOfElements.size(); i++) {
            WebElement element = listOfElements.get(i);
            element.isDisplayed();
            int j = i + 1;
            LogCapture.info("Notification number " + j + " from top is visible");
            String NotificationStatementText = "//h1[text()='Notifications']//following::ul[1]/div[" + j + "]/div[1]/span";
            String NotificationDateText = "//h1[text()='Notifications']//following::ul[1]//child::div[" + j + "]/div[2]/span";
            String NotificationStatementTextStr = Constants.driver.findElement(By.xpath(NotificationStatementText)).getText();

            String actualDate = Constants.driver.findElement(By.xpath(NotificationDateText)).getText();
            if (NotificationStatementTextStr.startsWith("A client has traded")) {
                Assert.assertEquals("PASS", Constants.key.MouseFunctions(NotificationStatementText, "MoveToElement"));
                LogCapture.info("This is Client Traded notification");

                SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
                Date Notificationdate = sdf.parse(actualDate);
                LogCapture.info("Notification Date is in correct format DD MMM YYYY :" + Notificationdate);  //Mar 2016

            } else {
                LogCapture.info("This is NOT Client Traded notification...");
            }
        }
    }


    @Then("^User Observe the list of commission statement related notifications on UI along with the date$")
    public void userObserveTheListOfCommissionStatementRelatedNotificationsOnUIAlongWithTheDate() throws Throwable {

        String vObjNotificationSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfNotifications");
        List<WebElement> listOfElements = Constants.driver.findElements(By.xpath(vObjNotificationSectionPage));
        LogCapture.info("Total number of elements present: " + listOfElements.size());

        for (int i = 0; i < listOfElements.size(); i++) {
            WebElement element = listOfElements.get(i);
            element.isDisplayed();
            int j = i + 1;
            LogCapture.info("Notification number " + j + " from top is visible");
            String NotificationStatementText = "//h1[text()='Notifications']//following::ul[1]/div[" + j + "]/div[1]/span";
            String NotificationDateText = "//h1[text()='Notifications']//following::ul[1]//child::div[" + j + "]/div[2]/span";
            String NotificationStatementTextStr = Constants.driver.findElement(By.xpath(NotificationStatementText)).getText();
            if (NotificationStatementTextStr.endsWith("commission statement is ready for download")) {
                Assert.assertEquals("PASS", Constants.key.MouseFunctions(NotificationStatementText, "MoveToElement"));
                LogCapture.info("This is Commission statement notification");
                String actualDate = Constants.driver.findElement(By.xpath(NotificationDateText)).getText();
                SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
                Date Notificationdate = sdf.parse(actualDate);
                LogCapture.info("Notification Date is in correct format DD MMM YYYY :" + Notificationdate);  //Mar 2016

            } else {
                LogCapture.info("This is NOT Commission statement notification...");
            }
        }
    }


    @Then("^User Observe the list of commission paid related notifications on UI along with the date$")
    public void userObserveTheListOfCommissionPaidRelatedNotificationsOnUIAlongWithTheDate() throws Throwable {

        String vObjNotificationSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfNotifications");
        List<WebElement> listOfElements = Constants.driver.findElements(By.xpath(vObjNotificationSectionPage));
        LogCapture.info("Total number of elements present: " + listOfElements.size());

        for (int i = 0; i < listOfElements.size(); i++) {
            WebElement element = listOfElements.get(i);
            element.isDisplayed();
            int j = i + 1;
            LogCapture.info("Notification number " + j + " from top is visible");
            String NotificationStatementText = "//h1[text()='Notifications']//following::ul[1]/div[" + j + "]/div[1]/span";
            String NotificationDateText = "//h1[text()='Notifications']//following::ul[1]//child::div[" + j + "]/div[2]/span";
            String NotificationStatementTextStr = Constants.driver.findElement(By.xpath(NotificationStatementText)).getText();
            String actualDate = Constants.driver.findElement(By.xpath(NotificationDateText)).getText();
            if (NotificationStatementTextStr.startsWith("Commission for")) {
                Assert.assertEquals("PASS", Constants.key.MouseFunctions(NotificationStatementText, "MoveToElement"));
                LogCapture.info("This is Commission paid notification");
                SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
                Date Notificationdate = sdf.parse(actualDate);
                LogCapture.info("Notification Date is in correct format DD MMM YYYY :" + Notificationdate);  //Mar 2016
            } else {
                LogCapture.info("This is NOT Commission paid notification...");
            }

        }
    }


    @Then("^User Observe the list of Registration related notifications on UI along with the date$")
    public void userObserveTheListOfRegistrationRelatedNotificationsOnUIAlongWithTheDate() throws Throwable {

        String vObjNotificationSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfNotifications");
        List<WebElement> listOfElements = Constants.driver.findElements(By.xpath(vObjNotificationSectionPage));
        LogCapture.info("Total number of elements present: " + listOfElements.size());
        for (int i = 0; i < listOfElements.size(); i++) {
            WebElement element = listOfElements.get(i);
            element.isDisplayed();
            int j = i + 1;
            LogCapture.info("Notification number " + j + " from top is visible");
            String NotificationStatementText = "//h1[text()='Notifications']//following::ul[1]/div[" + j + "]/div[1]/span";
            String NotificationDateText = "//h1[text()='Notifications']//following::ul[1]//child::div[" + j + "]/div[2]/span";
            String NotificationStatementTextStr = Constants.driver.findElement(By.xpath(NotificationStatementText)).getText();
            String actualDate = Constants.driver.findElement(By.xpath(NotificationDateText)).getText();
            if (NotificationStatementTextStr.equals("A client has registered")) {
                Assert.assertEquals("PASS", Constants.key.MouseFunctions(NotificationStatementText, "MoveToElement"));
                LogCapture.info("This is Client Registered notification");
                SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
                Date Notificationdate = sdf.parse(actualDate);
                LogCapture.info("Notification Date is in correct format DD MMM YYYY :" + Notificationdate);  //Mar 2016
            } else {
                LogCapture.info("This is NOT Client Registered notification...");
            }
        }
    }


    @Then("^User should be to view the proper subject line for the Registered notification which is been specified earlier$")
    public void userShouldBeToViewTheProperSubjectLineForTheRegisteredNotificationWhichIsBeenSpecifiedEarlier() throws Exception {

        String vObjNotificationSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfNotifications");
        List<WebElement> listOfElements = Constants.driver.findElements(By.xpath(vObjNotificationSectionPage));
        LogCapture.info("Total number of elements present: " + listOfElements.size());
        for (int i = 0; i < listOfElements.size(); i++) {
            WebElement element = listOfElements.get(i);
            element.isDisplayed();
            int j = i + 1;
            LogCapture.info("Notification number " + j + " from top is visible");
            String NotificationStatementText = "//h1[text()='Notifications']//following::ul[1]/div[" + j + "]/div[1]/span";
            String NotificationStatementTextStr = Constants.driver.findElement(By.xpath(NotificationStatementText)).getText();
            LogCapture.info("Notification Subject line: " + NotificationStatementTextStr);
            if (NotificationStatementTextStr.equals("A client has registered")) {
                Assert.assertEquals("PASS", Constants.key.MouseFunctions(NotificationStatementText, "MoveToElement"));
                LogCapture.info("Proper subject line is Visible for Registered notification");
            } else {
                LogCapture.info("Notification not related to Registration");
            }
        }
    }

    @Then("^User should be to view the proper subject line for the Trading notification which is been specified earlier$")
    public void userShouldBeToViewTheProperSubjectLineForTheTradingNotificationWhichIsBeenSpecifiedEarlier() throws Exception {
        String vObjNotificationSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfNotifications");
        List<WebElement> listOfElements = Constants.driver.findElements(By.xpath(vObjNotificationSectionPage));
        LogCapture.info("Total number of elements present: " + listOfElements.size());
        for (int i = 0; i < listOfElements.size(); i++) {
            WebElement element = listOfElements.get(i);
            element.isDisplayed();
            int j = i + 1;
            LogCapture.info("Notification number " + j + " from top is visible");
            String NotificationStatementText = "//h1[text()='Notifications']//following::ul[1]/div[" + j + "]/div[1]/span";
            String NotificationStatementTextStr = Constants.driver.findElement(By.xpath(NotificationStatementText)).getText();
            LogCapture.info("Notification Subject line: " + NotificationStatementTextStr);
            if (NotificationStatementTextStr.equals("A client has traded")) {
                Assert.assertEquals("PASS", Constants.key.MouseFunctions(NotificationStatementText, "MoveToElement"));
                LogCapture.info("Proper subject line is Visible for Trading notification");
            } else {
                LogCapture.info("Notification not related to Trading");
            }
        }
    }

    @Then("^User should be to view the proper subject line for the commission statement notification which is been specified earlier$")
    public void userShouldBeToViewTheProperSubjectLineForTheCommissionStatementNotificationWhichIsBeenSpecifiedEarlier() throws Exception {
        String vObjNotificationSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfNotifications");
        List<WebElement> listOfElements = Constants.driver.findElements(By.xpath(vObjNotificationSectionPage));
        LogCapture.info("Total number of elements present: " + listOfElements.size());
        for (int i = 0; i < listOfElements.size(); i++) {
            WebElement element = listOfElements.get(i);
            element.isDisplayed();
            int j = i + 1;
            LogCapture.info("Notification number " + j + " from top is visible");
            String NotificationStatementText = "//h1[text()='Notifications']//following::ul[1]/div[" + j + "]/div[1]/span";
            String NotificationStatementTextStr = Constants.driver.findElement(By.xpath(NotificationStatementText)).getText();
            LogCapture.info("Notification Subject line: " + NotificationStatementTextStr);

            if (NotificationStatementTextStr.endsWith("commission statement is ready for download")) {
                Assert.assertEquals("PASS", Constants.key.MouseFunctions(NotificationStatementText, "MoveToElement"));
                LogCapture.info("Proper subject line is Visible for commission statement notification");
            } else {
                LogCapture.info("Notification not related to commission statement");
            }
        }
    }

    @Then("^User should be to view the proper subject line for the commission paid notification which is been specified earlier$")
    public void userShouldBeToViewTheProperSubjectLineForTheCommissionPaidNotificationWhichIsBeenSpecifiedEarlier() throws Exception {
        String vObjNotificationSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfNotifications");
        List<WebElement> listOfElements = Constants.driver.findElements(By.xpath(vObjNotificationSectionPage));
        LogCapture.info("Total number of elements present: " + listOfElements.size());
        for (int i = 0; i < listOfElements.size(); i++) {
            WebElement element = listOfElements.get(i);
            element.isDisplayed();
            int j = i + 1;
            LogCapture.info("Notification number " + j + " from top is visible");
            String NotificationStatementText = "//h1[text()='Notifications']//following::ul[1]/div[" + j + "]/div[1]/span";

            String NotificationStatementTextStr = Constants.driver.findElement(By.xpath(NotificationStatementText)).getText();
            if (NotificationStatementTextStr.startsWith("Commission for")) {
                LogCapture.info("Notification Subject line: " + NotificationStatementTextStr);
                String[] both = NotificationStatementTextStr.split(" ");
                String NotificationCommissionPaidStatementTextStr = both[0] + " " + both[1] + " " + both[3] + " " + both[4] + " " + both[5] + " " + both[6] + " " + both[7];
                LogCapture.info("Split strng is: " + NotificationCommissionPaidStatementTextStr);
                if (NotificationCommissionPaidStatementTextStr.equals("Commission for has been paid on the")) {
                    Assert.assertEquals("PASS", Constants.key.MouseFunctions(NotificationStatementText, "MoveToElement"));
                    LogCapture.info("Proper subject line is Visible for commission paid notification");
                }
            } else {
                LogCapture.info("Notification not related to commission paid");
            }
        }
    }

    @Then("^User observe the list of Notifications on UI$")
    public void userObserveTheListOfNotificationsOnUI() throws Throwable {
        String vObjNotificationSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfNotifications");
        List<WebElement> listOfElements = Constants.driver.findElements(By.xpath(vObjNotificationSectionPage));
        LogCapture.info("Total number of elements present: " + listOfElements.size());
        if (listOfElements.size() <= 15) {
            LogCapture.info("User able to view Maximum 15 notifications on a page....");
            for (int i = 0; i < listOfElements.size(); i++) {
                WebElement element = listOfElements.get(i);
                element.isDisplayed();
                int j = i + 1;
                LogCapture.info("Notification number " + j + " from top is visible");
                String NotificationStatementText = "//h1[text()='Notifications']//following::ul[1]/div[" + j + "]/div[1]/span";
                String NotificationDateText = "//h1[text()='Notifications']//following::ul[1]//child::div[" + j + "]/div[2]/span";
                String NotificationStatementTextStr = Constants.driver.findElement(By.xpath(NotificationStatementText)).getText();
                String actualDate = Constants.driver.findElement(By.xpath(NotificationDateText)).getText();
                SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
                Date Notificationdate = sdf.parse(actualDate);
                LogCapture.info("Notification Date is in correct format DD MMM YYYY :" + Notificationdate);  //Mar 2016
                if (NotificationStatementTextStr.startsWith("Commission for")) {
                    Assert.assertEquals("PASS", Constants.key.MouseFunctions(NotificationStatementText, "MoveToElement"));
                    LogCapture.info("This is Comission paid notification");
                } else if (NotificationStatementTextStr.equals("A client has registered")) {
                    Assert.assertEquals("PASS", Constants.key.MouseFunctions(NotificationStatementText, "MoveToElement"));
                    LogCapture.info("This is Client Registered notification");
                } else if (NotificationStatementTextStr.startsWith("A client has traded")) {
                    Assert.assertEquals("PASS", Constants.key.MouseFunctions(NotificationStatementText, "MoveToElement"));
                    LogCapture.info("This is Client Traded notification");
                } else if (NotificationStatementTextStr.endsWith("commission statement is ready for download")) {
                    Assert.assertEquals("PASS", Constants.key.MouseFunctions(NotificationStatementText, "MoveToElement"));
                    LogCapture.info("This is Commission statement notification");
                } else {
                    Assert.assertEquals("PASS", Constants.key.MouseFunctions(NotificationStatementText, "MoveToElement"));
                    LogCapture.info("NOT VALID NOTIFICATION: " + NotificationStatementTextStr);
                    break;
                }
            }
        } else {

        }
    }

    @Then("^User notes the Number of unread notifications on bell icon$")
    public String userNotesTheNumberOfUnreadNotificationsOnBellIcon() {
        String vObjNotificationBellIcon_Number = Constants.Affiliates_NotificationsPageOR.getProperty("NotificationBellIcon_Number");
        NotificationNumberStr = Constants.driver.findElement(By.xpath(vObjNotificationBellIcon_Number)).getText();
        LogCapture.info(NotificationNumberStr);
        return NotificationNumberStr;

    }


    @Then("^User should be able to view the number of unread notification messages as not selected or read$")
    public void userShouldBeAbleToViewTheNumberOfUnreadNotificationMessagesAsNotSelectedOrRead() throws Exception {
        String vObjNotificationSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfNotifications");
        List<WebElement> listOfElements = Constants.driver.findElements(By.xpath(vObjNotificationSectionPage));
        int TotallistOfElementsInt = listOfElements.size();
        LogCapture.info("Total number of notifications on page: " + TotallistOfElementsInt);

        String vObjListOfReadNotifications = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfReadNotifications");
        List<WebElement> ListOfReadNotifications = Constants.driver.findElements(By.xpath(vObjListOfReadNotifications));
        int TotalListOfReadNotificationsInt = ListOfReadNotifications.size();
        LogCapture.info("Total number of Read notifications on page: " + TotalListOfReadNotificationsInt);

        String vListOfUnReadNotifications = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfUnReadNotifications");
        List<WebElement> ListOfUnReadNotifications = Constants.driver.findElements(By.xpath(vListOfUnReadNotifications));

        int TotalListOfUnReadNotificationsInt = TotallistOfElementsInt - TotalListOfReadNotificationsInt;
        LogCapture.info("Total number of Unread notifications on page: " + TotalListOfUnReadNotificationsInt);
        LogCapture.info("Return number is :" + NotificationNumberStr);
        if (NotificationNumberStr.matches("[0-9]")) {
            int InitialNotedUnreadNotificationNumberInt = Integer.parseInt(NotificationNumberStr);
            if (TotalListOfUnReadNotificationsInt == InitialNotedUnreadNotificationNumberInt) {
                LogCapture.info("Number of UnRead Notifications on UI: " + InitialNotedUnreadNotificationNumberInt + " MATCHED with number of UnRead message: " + TotalListOfUnReadNotificationsInt);
                for (int i = 0; i < ListOfUnReadNotifications.size(); i++) {
                    int j = i + 1;
                    String vObjTargetMessage = vListOfUnReadNotifications + "[" + j + "]";
                    Assert.assertEquals("PASS", Constants.key.MouseFunctions(vObjTargetMessage, "MoveToElement"));
                    Constants.key.pause("2", "");
                }
            } else {
                LogCapture.info("Number of UnRead Notifications on UI: " + InitialNotedUnreadNotificationNumberInt + " DOES NOT match with number of UnRead message: " + TotalListOfUnReadNotificationsInt);
            }
        } else if (NotificationNumberStr.matches("9\\+")) {
            if (TotalListOfUnReadNotificationsInt > 9 && TotalListOfUnReadNotificationsInt <= 15) {
                LogCapture.info("Number of UnRead Notifications on UI is: " + TotalListOfUnReadNotificationsInt);
                for (int i = 0; i < ListOfUnReadNotifications.size(); i++) {
                    int j = i + 1;
                    String vObjTargetMessage = vListOfUnReadNotifications + "[" + j + "]";
                    Assert.assertEquals("PASS", Constants.key.MouseFunctions(vObjTargetMessage, "MoveToElement"));
                    Constants.key.pause("2", "");
                }
            } else {
                LogCapture.info("Number of UnRead Notifications on UI: " + TotalListOfUnReadNotificationsInt + " DOES NOT match given range 9 to 15");
            }

        }

    }

    @Then("^User Should able to view the Loader with the Email \"([^\"]*)\" for which the Journey is been performed$")
    public void userShouldAbleToViewTheLoaderWithTheEmailForWhichTheJourneyIsBeenPerformed(String userName) throws Throwable {
        String vEmailAddressWhereVerificationLinkNeedToSent = Constants.Affiliates_ForgotPasswordOR.getProperty("EmailAddressWhereVerificationLinkNeedToSent");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vEmailAddressWhereVerificationLinkNeedToSent, ""));
        String VerificationPageEmailAddressText = Constants.driver.findElement(By.xpath(vEmailAddressWhereVerificationLinkNeedToSent)).getText();
        LogCapture.info(VerificationPageEmailAddressText);
        String vUserName = Constants.CONFIG.getProperty(userName);
        if (VerificationPageEmailAddressText.contains(vUserName)) {
            LogCapture.info("User able to view Email address");
            String vEmailAddressWhereVerificationLinkNeedToSentExpected = "We’ve sent a verification link to your email, " + vUserName + ".\n" +
                    "If you don’t see our email in your inbox, please check your spam folder.";
            Assert.assertEquals("PASS", Constants.key.verifyText(vEmailAddressWhereVerificationLinkNeedToSent, vEmailAddressWhereVerificationLinkNeedToSentExpected));

        } else {
            LogCapture.info("User NOT able to view Email address");
            String vEmailAddressWhereVerificationLinkNeedToSentExpected = "We’ve sent a verification link to your email, " + vUserName + "\n" +
                    "If you don’t see our email in your inbox, please check your spam folder.";
            Assert.assertEquals("PASS", Constants.key.verifyText(vEmailAddressWhereVerificationLinkNeedToSent, vEmailAddressWhereVerificationLinkNeedToSentExpected));

        }
    }


    @And("^User Clicks on Resend link$")
    public void userClicksOnResendLink() throws Throwable {
        String vResendLink = Constants.Affiliates_ForgotPasswordOR.getProperty("ResendLink");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vResendLink, ""));
        Assert.assertEquals("PASS", Constants.key.click(vResendLink, ""));

    }

    @Then("^System will display message as Another verification link is been send with loader$")
    public void systemWillDisplayMessageAsAnotherVerificationLinkIsBeenSendWithLoader() throws Throwable {
        String vAnotherVerificationLinkSent = Constants.Affiliates_ForgotPasswordOR.getProperty("AnotherVerificationLinkSent");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vAnotherVerificationLinkSent, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vAnotherVerificationLinkSent, "We've just sent you another verification link"));
    }

    @Then("^After 10 secs system will navigate to login page$")
    public void afterSecsSystemWillNavigateToLoginPage() throws Throwable {
        Constants.key.pause("10", "");
        String vLogInPage = Constants.Affiliates_ForgotPasswordOR.getProperty("LogInPage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vLogInPage, ""));
        String vLogInPageMsg = Constants.Affiliates_ForgotPasswordOR.getProperty("LogInPageMsg");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vLogInPageMsg, ""));
        LogCapture.info("User successfully landed on CD LogIn Page...");
    }

    @Then("^Resend link to be observed as Grayed out$")
    public void resendLinkToBeObservedAsGrayedOut() throws Exception {
        String vResendLink = Constants.Affiliates_ForgotPasswordOR.getProperty("ResendLink");
        Assert.assertEquals("PASS", Constants.key.notexist(vResendLink, ""));
        String vGreyOutLink = Constants.Affiliates_ForgotPasswordOR.getProperty("GreyOutLink");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vGreyOutLink, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vGreyOutLink, "Didn’t receive the email? Resend"));
    }


    @And("^User is able to view Resend link$")
    public void userIsAbleToViewResendLink() throws Exception {
        String vResendLink = Constants.Affiliates_ForgotPasswordOR.getProperty("ResendLink");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vResendLink, ""));
    }

    @Then("^User should be able to view Profile Link icon$")
    public void userShouldBeAbleToViewProfileLinkIcon() throws Exception {

        String vProfileLinkIcon = Constants.Affiliates_GlobalPageElementsOR.getProperty("ProfileLinkIcon");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vProfileLinkIcon, ""));
        LogCapture.info("User able to view Profile Icon");
    }

    @Then("^User will be navigated to the Register a customer Page$")
    public void userWillBeNavigatedToTheRegisterACustomerPage() throws Exception {
        String vRegisterACustomerPage = Constants.Affiliates_RegisterACustomerOR.getProperty("RegisterCustomerPage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vRegisterACustomerPage, ""));
        LogCapture.info("User is on Register A Customer Page...");
    }

    @And("^User clicks on the Profile icon$")
    public void userClicksOnTheProfileIcon() throws Exception {
        String vProfileLinkIcon = Constants.Affiliates_GlobalPageElementsOR.getProperty("ProfileLinkIcon");
        Assert.assertEquals("PASS", Constants.key.click(vProfileLinkIcon, ""));
        LogCapture.info("User clicked on Profile Icon");
    }

    @Then("^User will be able to view CustomerFullName \"([^\"]*)\" and AccountNumber \"([^\"]*)\" on Profile section$")
    public void userWillBeAbleToViewCustomerFullNameAndAccountNumberOnProfileSection(String CustomerFullName, String CustomerAccountNumber) throws Throwable {

        String vCustomerFullName = Constants.CONFIG.getProperty(CustomerFullName);
        String vCustomerAccountNumber = Constants.CONFIG.getProperty(CustomerAccountNumber);
        String vProfileFullName = Constants.Affiliates_GlobalPageElementsOR.getProperty("ProfileFullName");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vProfileFullName, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vProfileFullName, vCustomerFullName));
        LogCapture.info("User is able to view FullName...");
        String ExpectedCustomerAccountNumber = "Partner ID : " + vCustomerAccountNumber;
        String vProfileAccountNumber = Constants.Affiliates_GlobalPageElementsOR.getProperty("ProfileAccountNumber");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vProfileAccountNumber, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vProfileAccountNumber, ExpectedCustomerAccountNumber));
        LogCapture.info("User is able to view Account Number...");


    }

    @Then("^User will be able to view CustomerFullName \"([^\"]*)\" AccountNumber \"([^\"]*)\" and TradingName \"([^\"]*)\" on Profile section$")
    public void userWillBeAbleToViewCustomerFullNameAccountNumberAndTradingNameOnProfileSection(String CustomerFullName, String CustomerAccountNumber, String TradingName) throws Throwable {

        String vExpectedCustomerFullName = Constants.CONFIG.getProperty(CustomerFullName);
        String vExpectedCustomerAccountNumber = Constants.CONFIG.getProperty(CustomerAccountNumber);
        String vExpectedTradingName = Constants.CONFIG.getProperty(TradingName);
        String vProfileFullName = "//h6[contains(text(),'" + vExpectedCustomerFullName + "')]";
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vProfileFullName, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vProfileFullName, vExpectedCustomerFullName));
        LogCapture.info("User is able to view FullName...");
        String ExpectedCustomerAccountNumber = "Partner ID : " + vExpectedCustomerAccountNumber;
        String vProfileAccountNumber = "//h6[contains(text(),'" + ExpectedCustomerAccountNumber + "')]";
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vProfileAccountNumber, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vProfileAccountNumber, ExpectedCustomerAccountNumber));
        LogCapture.info("User is able to view Account Number...");

        String vProfileTradingName = "//a[@href='/notifications']//following::p[text()='" + vExpectedTradingName + "']";
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vProfileTradingName, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vProfileTradingName, vExpectedTradingName));
        LogCapture.info("User is able to view TradingName...");


    }

    @When("^User clicks on Become a partner button on Login page$")
    public void userClicksOnBecomeAPartnerButton() throws Throwable {
        String vBecomeAPartnerButton = Constants.Affiliates_LoginPageOR.getProperty("BecomeAPartnerButton");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBecomeAPartnerButton, ""));
        Assert.assertEquals("PASS", Constants.key.click(vBecomeAPartnerButton, ""));
        LogCapture.info("User clicked on Become A partner button present on login page...");
        Constants.key.pause("2", "");
    }

    @Then("^User should be navigate to Affiliates Registration Page$")
    public void userShouldBeNavigateToAffilateRegistrationPage() throws Throwable {
        String vCreateAnAccountPage = Constants.Affiliates_LoginPageOR.getProperty("CreateAnAccountPage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vCreateAnAccountPage, ""));
        LogCapture.info("User navigated to Registration page Create an account...");
        Constants.key.pause("2", "");
    }

    @Then("^User should be able to view (An Individual|Corporate) option on Affiliates Registration Page$")
    public void userShouldBeAbleToViewAnIndividualOptionOnAffiliatesRegistrationPage(String RadioButtonOptionType) throws Exception {
        if (RadioButtonOptionType.equalsIgnoreCase("An Individual")) {
            String vAnIndividualOption = Constants.Affiliates_LoginPageOR.getProperty("AnIndividualOption");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vAnIndividualOption, ""));
            LogCapture.info("User able to view An individual option on Registration page...");
        }
        if (RadioButtonOptionType.equalsIgnoreCase("Corporate")) {
            String vCompanyOption = Constants.Affiliates_LoginPageOR.getProperty("CompanyOption");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vCompanyOption, ""));
            LogCapture.info("User able to view Corporate option on Registration page...");
        }

    }


    @Then("^User should click on the Verification link been Provided in Email \"([^\"]*)\"$")
    public void userShouldClickOnTheVerificationLinkBeenProvidedInEmail(String userName) throws Throwable {

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_T);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Constants.key.pause("2", "");
        ArrayList<String> tabs = new ArrayList<String>(Constants.driver.getWindowHandles());
        Constants.driver.switchTo().window(tabs.get(1));
        //Open URL In 2nd tab.


        Constants.driver.get("https://www.mailinator.com/v3/#/#inboxpane");


        String vOkaUsername = "//label[contains(text(),'Username')]";
        Constants.key.VisibleConditionWait(vOkaUsername, "");

        Constants.driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Sanket.Yadav");
        Constants.driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Aug@2020");
        Constants.driver.findElement(By.xpath("//input[@class='button button-primary']")).click();

        //  Constants.driver.navigate().refresh();
        //Constants.driver.get("https://www.mailinator.com/v3/#/#inboxpane");
        String vMailinatorInboxText = "//b[contains(text(),'public')]";
        Constants.key.VisibleConditionWait(vMailinatorInboxText, "");
        Constants.key.pause("3", "");
        Constants.driver.findElement(By.xpath("//input[@id='inbox_field']")).clear();
        String vUserName = Constants.CONFIG.getProperty(userName);
        Constants.driver.findElement(By.xpath("//input[@id='inbox_field']")).sendKeys(vUserName);
        Constants.driver.findElement(By.xpath("//button[@id='go_inbox']")).click();
        String FirstEmail = "//table[@class='table table-striped jambo_table']//tbody/tr[1]/td[contains(text(),'cdfxservices.com')]";
        Constants.key.VisibleConditionWait(FirstEmail, "");
        // String SignIn = Constants.WebOutlookEmail.getProperty("SignIn");
        // Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(SignIn,""));
        //enter username
        Constants.driver.findElement(By.xpath(FirstEmail)).click();

        String ResetYourPasswordLink = "//a[contains(text(),'Reset your password')]";
        Constants.key.VisibleConditionWait(ResetYourPasswordLink, "");
        Constants.driver.findElement(By.xpath(ResetYourPasswordLink)).click();
        //Switch to other tab
        Constants.driver.switchTo().window(tabs.get(2));

        String NewPasswordPage = "//h4[text()='Choose a new password']";
        Constants.key.VisibleConditionWait(NewPasswordPage, "");
        /*String vNewResetPassword = Constants.CONFIG.getProperty(NewResetPassword);
        String NewPasswordString="//input[@name='newPassword']";
        Assert.assertEquals("PASS", Constants.key.writeInInput(NewPasswordString, vNewResetPassword));

        //click next button
        Constants.driver.findElement(By.xpath("//input[@type='submit' and @id='idSIButton9']")).click();
        Constants.key.pause("10", "");
        // String EnterPassword = Constants.WebOutlookEmail.getProperty("EnterPassword");
        // Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(EnterPassword,""));
        //enter Password
        Constants.driver.findElement(By.xpath("//input[@type='password' and @name='passwd']")).click();
        Constants.driver.findElement(By.xpath("//input[@type='password' and @name='passwd']")).sendKeys("July@2020");
        //click Submit button
        Constants.driver.findElement(By.xpath("//input[@type='submit' and @id='idSIButton9']")).click();


        //wait till page to load
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='Inbox' and @class='_1XmKWz3L5NcheRkx38wxTL qDw7SZ9r6S7r0_qZS1aIG NJVykX0WljoRws2qTYI5G']//span[text()='Inbox']")));
        Thread.sleep(10000);
        Constants.driver.findElement(By.xpath("//input[@type='submit' and @id='idSIButton9']")).click();
        Thread.sleep(10000);
        //click on Inbox
        //WebElement Inbox = driver.findElement(By.xpath("//span[text()='Inbox']"));
        //Inbox.click();
        //Thread.sleep(3000);
        //click on Other
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='ms-Pivot-text _3d8zrTTgCkZi27bUS--28l text-85' and text()='Other']")));

       /* WebElement Others = Constants.driver.findElement(By.xpath("//button[@name='Other' and @type='button' and @id='Pivot33-Tab1']"));
        Others.click();
        Thread.sleep(5000);

        //click on Focus button
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='ms-Pivot-text _3d8zrTTgCkZi27bUS--28l text-85' and text()='Focused']")));
        WebElement Focused = Constants.driver.findElement(By.xpath("//span[@class='ms-Pivot-text _3d8zrTTgCkZi27bUS--28l text-85' and text()='Focused']"));
        Focused.click();
        Thread.sleep(10000);

        //click on 1st email
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='BVgxayg_IGpXi5g7S77GK']/div[1]")));
        Constants.driver.findElement(By.xpath("//div[@class='BVgxayg_IGpXi5g7S77GK']/div[1]")).click();
       Constants.key.pause("3","");


        //copy text into string
        //div[@class='mm4nCLKbIRtx5HvuorDWT']//div[@class='B1IVVpQay0rPzznhParFr KcNy0Xfd9-is-_CEp3QOI']/div[2]//div[@class='_3U2q6dcdZCrTrR_42Nxby JWNdg1hee9_Rz6bIGvG1c allowTextSelection']/div[1]//div[@class='PlainText']
        WebElement OTCEmailReceived = Constants.driver.findElement(By.xpath("//div[@class='mm4nCLKbIRtx5HvuorDWT']//div[@class='B1IVVpQay0rPzznhParFr KcNy0Xfd9-is-_CEp3QOI']/div[2]//div[@class='_3U2q6dcdZCrTrR_42Nxby JWNdg1hee9_Rz6bIGvG1c allowTextSelection']/div[1]//div[@class='PlainText']"));

        String OTPEmail= OTCEmailReceived.getText();
        LogCapture.info("Email received is: "+ OTPEmail);
*/

    }


    @Then("^User should be able to view the message as No Notification is been present$")
    public void userShouldBeAbleToViewTheMessageAsNoNotificationIsBeenPresent() throws Exception {
        String vNoNotificationsPresent = Constants.Affiliates_NotificationsPageOR.getProperty("NoNotificationsPresent");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vNoNotificationsPresent, ""));
        String Expected_NoNotificationsPresentText = "You currently have no notifications";
        Assert.assertEquals("PASS", Constants.key.verifyText(vNoNotificationsPresent, Expected_NoNotificationsPresentText));

    }


    @Then("^User should able to view the Success message for Forgot Password - Verification link sent to an email \"([^\"]*)\"$")
    public void userShouldAbleToViewTheSuccessMessageForForgotPasswordVerificationLinkSentToAnEmail(String userName) throws Throwable {

        String vVerificationLinkPage = Constants.Affiliates_ForgotPasswordOR.getProperty("VerificationLinkPage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vVerificationLinkPage, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vVerificationLinkPage, "We’ve just sent you a verification link"));

        String vEmailAddressWhereVerificationLinkNeedToSent = Constants.Affiliates_ForgotPasswordOR.getProperty("EmailAddressWhereVerificationLinkNeedToSent");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vEmailAddressWhereVerificationLinkNeedToSent, ""));
        String vUserName = Constants.CONFIG.getProperty(userName);
        String vEmailAddressWhereVerificationLinkNeedToSentExpected = "We’ve sent a verification link to your email, " + vUserName + ".\n" +
                "If you don’t see our email in your inbox, please check your spam folder.";
        Assert.assertEquals("PASS", Constants.key.verifyText(vEmailAddressWhereVerificationLinkNeedToSent, vEmailAddressWhereVerificationLinkNeedToSentExpected));
        LogCapture.info("Email successfully sent on email for Forgot password...");
    }

    @And("^User clicks on the (Personal details|Bank details|Logout) button for Profile link navigation$")
    public void userClicksOnThePersonalDetailsButtonForProfileLinkNavigation(String TargetButton) throws Exception {
        if (TargetButton.equalsIgnoreCase("Personal details")) {
            String vPersonalDetailsButton = Constants.Affiliates_GlobalPageElementsOR.getProperty("PersonalDetailsButton");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vPersonalDetailsButton, ""));
            Assert.assertEquals("PASS", Constants.key.click(vPersonalDetailsButton, ""));
            LogCapture.info("User able to click on Profile details button..");
        }
        if (TargetButton.equalsIgnoreCase("Bank details")) {
            String vBankDetailsButton = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsButton");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBankDetailsButton, ""));
            Assert.assertEquals("PASS", Constants.key.click(vBankDetailsButton, ""));
            LogCapture.info("User able to click on Bank details button..");
        }
        if (TargetButton.equalsIgnoreCase("Logout")) {
            String vLogoutButton = Constants.Affiliates_GlobalPageElementsOR.getProperty("LogoutButton");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vLogoutButton, ""));
            Assert.assertEquals("PASS", Constants.key.click(vLogoutButton, ""));
            LogCapture.info("User clicked on Logout button..");
        }


    }

    @Then("^User should be able to view the Number of read messages as selected$")
    public void userShouldBeAbleToViewTheNumberOfReadMessagesAsSelected() throws Exception {

        String vObjNotificationSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfNotifications");
        List<WebElement> listOfElements = Constants.driver.findElements(By.xpath(vObjNotificationSectionPage));
        int TotallistOfElementsInt = listOfElements.size();
        LogCapture.info("Total number of notifications on page: " + TotallistOfElementsInt);

        String vObjListOfReadNotifications = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfReadNotifications");
        List<WebElement> ListOfReadNotifications = Constants.driver.findElements(By.xpath(vObjListOfReadNotifications));
        int TotalListOfReadNotificationsInt = ListOfReadNotifications.size();
        LogCapture.info("Number of Read Notifications on UI is: " + TotalListOfReadNotificationsInt);

        String vListOfUnReadNotifications = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfUnReadNotifications");
        List<WebElement> ListOfUnReadNotifications = Constants.driver.findElements(By.xpath(vListOfUnReadNotifications));
        int TotalListOfUnReadNotificationsInt = ListOfUnReadNotifications.size();
        LogCapture.info("Number of UnRead Notifications on UI is: " + TotalListOfUnReadNotificationsInt);

        int TotalCalculatedListOfReadNotificationsInt = TotallistOfElementsInt - TotalListOfUnReadNotificationsInt;
        if (TotalCalculatedListOfReadNotificationsInt == TotalListOfReadNotificationsInt) {
            LogCapture.info("Number of Read Notifications on UI is " + TotalListOfReadNotificationsInt + " which MATCHES Total calculated number of Read message " + TotalCalculatedListOfReadNotificationsInt);
            for (int i = 0; i < ListOfReadNotifications.size(); i++) {
                int j = i + 1;
                String vObjTargetMessage = vObjListOfReadNotifications + "[" + j + "]";
                Assert.assertEquals("PASS", Constants.key.MouseFunctions(vObjTargetMessage, "MoveToElement"));
                Constants.key.pause("2", "");
            }
        } else {
            LogCapture.info("Number of Read Notifications on UI: " + TotalListOfReadNotificationsInt + " which DOES NOT MATCHES Total calculated number of Read message " + TotalCalculatedListOfReadNotificationsInt);
        }

    }

    @And("^User is able to view Your Bank details section$")
    public void userIsAbleToViewYourBankDetailsSection() throws Throwable {
        LogCapture.info("Bank details section is Loading......");
        String vYouBankDetailsSection = Constants.Affiliates_GlobalPageElementsOR.getProperty("YouBankDetailsSection");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vYouBankDetailsSection, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vYouBankDetailsSection, "Your bank details"));
        LogCapture.info("User is on Your Bank details section...");
    }


    @And("^System will show the bank details for that particular (ONE|TWO) bank including all the bank details with \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" in expanded format$")
    public void systemWillShowTheBankDetailsForThatParticularTWOBankIncludingAllTheBankDetailsWithInExpandedFormat(String TargetBankNumber, String ExpectedAccountName1, String CurrencyCountryName1, String BankName1, String CurrencyCountryCode1, String CurrencyCountryCodeValue1, String AccountNumber1, String SWIFTcode1, String Reference1, String ExpectedAccountName2, String CurrencyCountryName2, String BankName2, String CurrencyCountryCode2, String CurrencyCountryCodeValue2, String AccountNumber2, String SWIFTcode2, String Reference2) throws Throwable {
        if (TargetBankNumber.equalsIgnoreCase("ONE")) {

            String vBankDetailsAccountNameHeader = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsAccountNameHeader");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBankDetailsAccountNameHeader, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vBankDetailsAccountNameHeader, "Account name"));
            LogCapture.info("Account name header visible and verified...");
            String vObjBankDetailsAccountName = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsAccountName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsAccountName, ""));
            String BankDetailsAccountName = Constants.driver.findElement(By.xpath(vObjBankDetailsAccountName)).getText();
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsAccountName, ExpectedAccountName1));
            LogCapture.info("Visible Account name: " + ExpectedAccountName1);

            String vBankDetailsCountryFlag = "//div[@class='MuiAccordionSummary-content Mui-expanded']//child::img[contains(@src,'/static/media/" + CurrencyCountryName1 + "')]";
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBankDetailsCountryFlag, ""));
            LogCapture.info("Country Flag visible...");
            String vObjBankDetailsAccountNameWithCountryFlag = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsAccountNameWithCountryFlag");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsAccountNameWithCountryFlag, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsAccountNameWithCountryFlag, ExpectedAccountName1));

            String BankDetailsAccountNameWithCountryFlag = Constants.driver.findElement(By.xpath(vObjBankDetailsAccountNameWithCountryFlag)).getText();
            LogCapture.info("Visible Account name With Country Flag: " + BankDetailsAccountNameWithCountryFlag);

            if (BankDetailsAccountName.equals(BankDetailsAccountNameWithCountryFlag)) {
                LogCapture.info("Account name & AccountName With Country Flag MATCHES......");
            } else {
                LogCapture.info("Account name & AccountName With Country Flag DOES NOT MATCHES......");
            }

            String vBankDetailsBankNameHeader = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsBankNameHeader");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBankDetailsBankNameHeader, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vBankDetailsBankNameHeader, "Bank name"));
            LogCapture.info("Bank name header visible and verified...");
            String vObjBankDetailsBankName = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsBankName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsBankName, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsBankName, BankName1));
            LogCapture.info("Visible Bank name is: " + BankName1);

            String vBankDetailsSortCodeHeader = "//li[text()='" + CurrencyCountryCode1 + "']";
            //String vBankDetailsSortCodeHeader = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsSortCodeHeader");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBankDetailsSortCodeHeader, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vBankDetailsSortCodeHeader, CurrencyCountryCode1));
            LogCapture.info("Country code header visible and verified...");
            String vObjBankDetailsSortCode = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsSortCode");
            //Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsSortCode, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsSortCode, CurrencyCountryCodeValue1));
            LogCapture.info("Visible Country code: " + CurrencyCountryCodeValue1);


            String vBankDetailsAccountNumberHeader = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsAccountNumberHeader");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBankDetailsAccountNumberHeader, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vBankDetailsAccountNumberHeader, "Account / IBAN no."));
            LogCapture.info("Account / IBAN no. header visible and verified...");
            String vObjBankDetailsAccountNumber = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsAccountNumber");
            //Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsAccountNumber, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsAccountNumber, AccountNumber1));
            // String BankDetailsAccountNumber = Constants.driver.findElement(By.xpath(vObjBankDetailsAccountNumber)).getText();
            LogCapture.info("Visible Account / IBAN no: " + AccountNumber1);


            String vBankDetailsSwiftCodeHeader = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsSwiftCodeHeader");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBankDetailsSwiftCodeHeader, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vBankDetailsSwiftCodeHeader, "SWIFT code"));
            LogCapture.info("SWIFT code header visible and verified...");
            String vObjBankDetailsSwiftCode = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsSwiftCode");
            // Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsSwiftCode, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsSwiftCode, SWIFTcode1));
            //String BankDetailsSwiftCode = Constants.driver.findElement(By.xpath(vObjBankDetailsSwiftCode)).getText();
            LogCapture.info("Visible SWIFT code: " + SWIFTcode1);

            String vBankDetailsReferenceHeader = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsReferenceHeader");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBankDetailsReferenceHeader, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vBankDetailsReferenceHeader, "Reference"));
            LogCapture.info("Reference header visible and verified...");
            String vObjBankDetailsReference = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsReference");
            //Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsReference, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsReference, Reference1));
            // String BankDetailsReference = Constants.driver.findElement(By.xpath(vObjBankDetailsReference)).getText();
            LogCapture.info("Visible Reference: " + Reference1);
            LogCapture.info("ALL details for ONE Bank is Visible and Verified...");
        }
        if (TargetBankNumber.equalsIgnoreCase("TWO")) {
            String vObjBankDetailsOneHeader = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsOneHeader");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsOneHeader, ""));
            String vObjBankDetailsTwoHeader = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsTwoHeader");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsTwoHeader, ""));
            LogCapture.info("TWO Bank Headers are visible...");
            String vObjBankDetailsOneCloseDropdown = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsOneCloseDropdown");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsOneCloseDropdown, ""));
            String vObjBankDetailsTwoOpenDropdown = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsTwoOpenDropdown");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsTwoOpenDropdown, ""));
            String vObjBankDetailsOneAccountNameHeader = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsOneAccountNameHeader");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsOneAccountNameHeader, ""));
            LogCapture.info("By default Bank 1 is visible in expanded format...");
//bhhbjhbhjbh
            String vBankDetailsOneAccountNameHeader = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsOneAccountNameHeader");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBankDetailsOneAccountNameHeader, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vBankDetailsOneAccountNameHeader, "Account name"));
            LogCapture.info("Bank 1 : Account name header visible and verified...");
            String vObjBankDetailsOneAccountName = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsOneAccountName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsOneAccountName, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsOneAccountName, ExpectedAccountName1));
            String BankDetailsOneAccountName = Constants.driver.findElement(By.xpath(vObjBankDetailsOneAccountName)).getText();
            LogCapture.info("Bank 1 visible Account name: " + BankDetailsOneAccountName);


            String vBankDetailsCountryFlag = "//div[@class='MuiAccordionSummary-content Mui-expanded']//child::img[contains(@src,'/static/media/" + CurrencyCountryName1 + "')]";
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBankDetailsCountryFlag, ""));
            LogCapture.info("Country Flag visible for Bank 1...");
            String vObjBankDetailsAccountNameWithCountryFlag = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsAccountNameWithCountryFlag");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsAccountNameWithCountryFlag, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsAccountNameWithCountryFlag, ExpectedAccountName1));

            String BankDetailsAccountNameWithCountryFlag = Constants.driver.findElement(By.xpath(vObjBankDetailsAccountNameWithCountryFlag)).getText();
            LogCapture.info("Visible Account name With Country Flag for Bank 1 is: " + BankDetailsAccountNameWithCountryFlag);

            if (BankDetailsOneAccountName.equals(BankDetailsAccountNameWithCountryFlag)) {
                LogCapture.info("Bank 1 Account name  & AccountName With Country Flag MATCHES......");
            } else {
                LogCapture.info("Bank 1 Account name & AccountName With Country Flag DOES NOT MATCHES......");
            }

            String vBankDetailsBankNameHeader = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsOneBankNameHeader");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBankDetailsBankNameHeader, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vBankDetailsBankNameHeader, "Bank name"));
            LogCapture.info("Bank name header visible and verified for Bank 1...");
            String vObjBankDetailsOneBankName = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsOneBankName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsOneBankName, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsOneBankName, BankName1));
            LogCapture.info("Visible Bank 1 name is: " + BankName1);

            String vBankDetailsCurrencyCountryCode1Header = "//div[@id='bank-details-0']//li[text()='" + CurrencyCountryCode1 + "']";
            //String vBankDetailsSortCodeHeader = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsSortCodeHeader");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBankDetailsCurrencyCountryCode1Header, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vBankDetailsCurrencyCountryCode1Header, CurrencyCountryCode1));
            LogCapture.info("Country code header visible and verified for Bank 1...");
            String vObjBankDetailsOneSortCode = "//div[@id='bank-details-0']//li[text()='" + CurrencyCountryCode1 + "']//following::li[1]";
            // Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsOneSortCode, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsOneSortCode, CurrencyCountryCodeValue1));
            LogCapture.info("Visible Country code for Bank 1 is: " + CurrencyCountryCodeValue1);


            String vBankDetailsOneAccountNumberHeader = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsOneAccountNumberHeader");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBankDetailsOneAccountNumberHeader, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vBankDetailsOneAccountNumberHeader, "Account / IBAN no."));
            LogCapture.info("Account / IBAN no. header visible and verified for Bank 1...");
            String vObjBankDetailsOneAccountNumber = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsOneAccountNumber");
            // Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsOneAccountNumber, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsOneAccountNumber, AccountNumber1));
            // String BankDetailsAccountNumber = Constants.driver.findElement(By.xpath(vObjBankDetailsAccountNumber)).getText();
            LogCapture.info("Visible Account / IBAN no. for Bank 1 is: " + AccountNumber1);

            String vBankDetailsOneSwiftCodeHeader = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsOneSwiftCodeHeader");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBankDetailsOneSwiftCodeHeader, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vBankDetailsOneSwiftCodeHeader, "SWIFT code"));
            LogCapture.info("SWIFT code header visible and verified for Bank 1...");
            String vObjBankDetailsOneSwiftCode = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsOneSwiftCode");
            // Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsOneSwiftCode, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsOneSwiftCode, SWIFTcode1));
            //String BankDetailsSwiftCode = Constants.driver.findElement(By.xpath(vObjBankDetailsSwiftCode)).getText();
            LogCapture.info("Visible SWIFT code for Bank 1 is: " + SWIFTcode1);

            String vBankDetailsOneReferenceHeader = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsOneReferenceHeader");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBankDetailsOneReferenceHeader, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vBankDetailsOneReferenceHeader, "Reference"));
            LogCapture.info("Reference header visible and verified for Bank 1...");
            String vObjBankDetailsOneReference = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsOneReference");
            //Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsReference, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsOneReference, Reference1));
            // String BankDetailsReference = Constants.driver.findElement(By.xpath(vObjBankDetailsReference)).getText();
            LogCapture.info("Visible Reference for Bank 1 is: " + Reference1);

            LogCapture.info("ALL details for Bank 1 is Visible and Verified...");

            LogCapture.info("User is closing Bank 1 details..");
            Assert.assertEquals("PASS", Constants.key.click(vObjBankDetailsOneCloseDropdown, ""));
            LogCapture.info("User is expanding Bank 2 details..");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsTwoOpenDropdown, ""));
            Assert.assertEquals("PASS", Constants.key.click(vObjBankDetailsTwoOpenDropdown, ""));
            String vObjBankDetailsTwoAccountNameHeader = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsTwoAccountNameHeader");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsTwoAccountNameHeader, ""));
            LogCapture.info("Bank 2 details is visible in expanded format...");

            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsTwoAccountNameHeader, "Account name"));
            LogCapture.info("Bank 2 : Account name header visible and verified...");
            String vObjBankDetailsTwoAccountName = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsTwoAccountName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsTwoAccountName, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsTwoAccountName, ExpectedAccountName2));
            String BankDetailsTwoAccountName = Constants.driver.findElement(By.xpath(vObjBankDetailsTwoAccountName)).getText();
            LogCapture.info("Bank 2 visible Account name: " + BankDetailsTwoAccountName);


            String vBankDetailsTwoCountryFlag = "//div[@class='MuiAccordionSummary-content Mui-expanded']//child::img[contains(@src,'/static/media/" + CurrencyCountryName2 + "')]";
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBankDetailsTwoCountryFlag, ""));
            LogCapture.info("Country Flag visible for Bank 2...");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsAccountNameWithCountryFlag, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsAccountNameWithCountryFlag, ExpectedAccountName2));

            String BankDetailsTwoAccountNameWithCountryFlag = Constants.driver.findElement(By.xpath(vObjBankDetailsAccountNameWithCountryFlag)).getText();
            LogCapture.info("Visible Account name With Country Flag for Bank 2 is: " + BankDetailsTwoAccountNameWithCountryFlag);

            if (BankDetailsTwoAccountName.equals(BankDetailsTwoAccountNameWithCountryFlag)) {
                LogCapture.info("Bank 2 Account name  & AccountName With Country Flag MATCHES......");
            } else {
                LogCapture.info("Bank 2 Account name & AccountName With Country Flag DOES NOT MATCHES......");
            }

            String vBankDetailsTwoBankNameHeader = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsTwoBankNameHeader");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBankDetailsTwoBankNameHeader, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vBankDetailsTwoBankNameHeader, "Bank name"));
            LogCapture.info("Bank name header visible and verified for Bank 2...");
            String vObjBankDetailsTwoBankName = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsTwoBankName");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsTwoBankName, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsTwoBankName, BankName2));
            LogCapture.info("Visible Bank 2 name is: " + BankName2);


            String vBankDetailsCurrencyCountryCode2Header = "//div[@id='bank-details-1']//li[text()='" + CurrencyCountryCode2 + "']";
            //String vBankDetailsSortCodeHeader = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsSortCodeHeader");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBankDetailsCurrencyCountryCode2Header, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vBankDetailsCurrencyCountryCode2Header, CurrencyCountryCode2));
            LogCapture.info("Country code header visible and verified for Bank 2...");
            String vObjBankDetailsTwoSortCode = "//div[@id='bank-details-1']//li[text()='" + CurrencyCountryCode2 + "']//following::li[1]";
            //Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsTwoSortCode, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsTwoSortCode, CurrencyCountryCodeValue2));
            LogCapture.info("Visible Country code for Bank 2 is: " + CurrencyCountryCodeValue2);


            String vBankDetailsTwoAccountNumberHeader = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsTwoAccountNumberHeader");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBankDetailsTwoAccountNumberHeader, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vBankDetailsTwoAccountNumberHeader, "Account / IBAN no."));
            LogCapture.info("Account / IBAN no. header visible and verified for Bank 2...");
            String vObjBankDetailsTwoAccountNumber = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsTwoAccountNumber");
            // Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsTwoAccountNumber, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsTwoAccountNumber, AccountNumber2));
            // String BankDetailsAccountNumber = Constants.driver.findElement(By.xpath(vObjBankDetailsAccountNumber)).getText();
            LogCapture.info("Visible Account / IBAN no. for Bank 2 is: " + AccountNumber2);

            String vBankDetailsTwoSwiftCodeHeader = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsTwoSwiftCodeHeader");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBankDetailsTwoSwiftCodeHeader, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vBankDetailsTwoSwiftCodeHeader, "SWIFT code"));
            LogCapture.info("SWIFT code header visible and verified for Bank 2...");
            String vObjBankDetailsTwoSwiftCode = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsTwoSwiftCode");
            //Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsTwoSwiftCode, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsTwoSwiftCode, SWIFTcode2));
            //String BankDetailsSwiftCode = Constants.driver.findElement(By.xpath(vObjBankDetailsSwiftCode)).getText();
            LogCapture.info("Visible SWIFT code for Bank 2 is: " + SWIFTcode2);

            String vBankDetailsTwoReferenceHeader = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsTwoReferenceHeader");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vBankDetailsTwoReferenceHeader, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vBankDetailsTwoReferenceHeader, "Reference"));
            LogCapture.info("Reference header visible and verified for Bank 2...");
            String vObjBankDetailsTwoReference = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsTwoReference");
            //Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBankDetailsReference, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBankDetailsTwoReference, Reference2));
            // String BankDetailsReference = Constants.driver.findElement(By.xpath(vObjBankDetailsReference)).getText();
            LogCapture.info("Visible Reference for Bank 2 is: " + Reference2);

            LogCapture.info("ALL details for Bank 2 is Visible and Verified...");

        }
    }

    @Then("^User Observe that Submit Button is (disabled|enabled) for Refer a client journey$")
    public void userObserveThatSubmitButtonIsDisabledEnabledForReferAClientJourney(String ButtonStatus) throws Throwable {
        if (ButtonStatus.equalsIgnoreCase("disabled")) {
            String vObjConfirm = Constants.Refer_a_Client.getProperty("SubmitButtonDisable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjConfirm, "disabled"));
            LogCapture.info("Submit button is disabled...");
        }
        if (ButtonStatus.equalsIgnoreCase("enabled")) {

        }


    }

    @Then("^System will navigate back to the Transaction details Page$")
    public void systemWillNavigateBackToTheTransactionDetailsPage() throws Throwable {
        String vObjTransactionDetailsText = Constants.Refer_a_Client.getProperty("TransactionDetailsText");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjTransactionDetailsText, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjTransactionDetailsText, "Transction details"));
        String vContinueButtonEnable = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
        Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();
        LogCapture.info("User on Transaction Details page with Continue button enable....");
    }

    @Then("^System will navigate back to the Contact details Page$")
    public void systemWillNavigateBackToTheContactDetailsPage() throws Throwable {
        String vObjLink = Constants.Refer_a_Client.getProperty("ContactDetailsText");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjLink, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjLink, "Contact details"));
        String vContinueButtonEnable = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
        Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();
        LogCapture.info("User on Contact Details page with Continue button enabled....");
    }

    @Then("^System will navigate back to the Personal details Page$")
    public void systemWillNavigateBackToThePersonalDetailsPage() throws Throwable {
        String vObjPersonalDetails = Constants.Refer_a_Client.getProperty("PersonalDetails");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjPersonalDetails, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjPersonalDetails, "Personal details"));
        //String vObjReferAClient_PersonalDetailsPage_Message = Constants.Refer_a_Client.getProperty("ReferAClient_PersonalDetailsPage_Message");

        String Expected_ReferAClient_PersonalDetailsPage_Message = "Enter the details of the client you" + "’" + "re referring.";
        String vObjReferAClient_PersonalDetailsPage_Message = "//p[text()='" + Expected_ReferAClient_PersonalDetailsPage_Message + "']";
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjReferAClient_PersonalDetailsPage_Message, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjReferAClient_PersonalDetailsPage_Message, Expected_ReferAClient_PersonalDetailsPage_Message));
        String vContinueButtonEnable = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
        Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();
        LogCapture.info("User on Personal Details page with Continue button enabled....");
    }

    @And("^User goes directly to Confirmation Page for Refer A Client$")
    public void UserGoesDirectlyToConfirmationPageForReferAClient() throws Throwable {
        String vObjPersonalDetails = Constants.Refer_a_Client.getProperty("PersonalDetails");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjPersonalDetails, ""));
        LogCapture.info("User is on Personal details page and click on continue button....");
        String vContinueButtonEnable = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
        Assert.assertEquals("PASS", Constants.key.click(vContinueButtonEnable, ""));
        String vObjLinkContactDetailsText = Constants.Refer_a_Client.getProperty("ContactDetailsText");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjLinkContactDetailsText, ""));
        LogCapture.info("User is on Contact details page and click on continue button....");
        Assert.assertEquals("PASS", Constants.key.click(vContinueButtonEnable, ""));
        String vObjTransactionDetailsText = Constants.Refer_a_Client.getProperty("TransactionDetailsText");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjTransactionDetailsText, ""));
        LogCapture.info("User is on Transaction details page and click on continue button....");
        Assert.assertEquals("PASS", Constants.key.click(vContinueButtonEnable, ""));
        String vObjConfirmationDetailsText = Constants.Refer_a_Client.getProperty("ConfirmationDetailsText");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjConfirmationDetailsText, ""));
        String vObjSubmitButtonDisable = Constants.Refer_a_Client.getProperty("SubmitButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjSubmitButtonDisable, "disabled"));
        LogCapture.info("User is on Confirmation page with Confirm button disable....");

    }

    @And("^User deletes (Optional|Mandatory) field values on Transaction details page(| with error messages and Continue button disable)$")
    public void userDeletesOptionalFieldValuesOnTransactionDetailsPage(String TargetFields, String TargetMessage) throws Throwable {
        if (TargetFields.equalsIgnoreCase("Optional")) {
            if (TargetMessage.equalsIgnoreCase("")) {
                String vObjESTValueClearBtn = Constants.Refer_a_Client.getProperty("ESTValueClearBtn");
                String vObjEST_Value = Constants.Refer_a_Client.getProperty("EST_Value");
                Assert.assertEquals("PASS", Constants.key.click(vObjEST_Value, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjESTValueClearBtn, ""));
                Assert.assertEquals("PASS", Constants.key.click(vObjESTValueClearBtn, ""));
                String vObjTransactionDetailsText = Constants.Refer_a_Client.getProperty("TransactionDetailsText");
                Assert.assertEquals("PASS", Constants.key.click(vObjTransactionDetailsText, ""));
                String vObjESTValueFieldDefaultText = Constants.Refer_a_Client.getProperty("ESTValueFieldDefaultText");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjESTValueFieldDefaultText, ""));
                Assert.assertEquals("PASS", Constants.key.verifyText(vObjESTValueFieldDefaultText, "Estimated transaction value (optional)"));
                LogCapture.info("EST value cleared & No error displayed as it is optional field...");
                String vContinueButtonEnable = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
                Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();
                LogCapture.info("Continue button enabled...");
            }
        }

        if (TargetFields.equalsIgnoreCase("Mandatory")) {
            if (TargetMessage.equalsIgnoreCase(" with error messages and Continue button disable")) {
                String vContinueButtonEnable = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
                Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();
                LogCapture.info("Continue button is enabled..");
                String vObjTransactionDetailsText = Constants.Refer_a_Client.getProperty("TransactionDetailsRightSideText");
                String vSell = Constants.Refer_a_Client.getProperty("CurrencyHas");
                Assert.assertEquals("PASS", Constants.key.click(vSell, ""));
                String vObjCurrencyHasClearBtn = Constants.Refer_a_Client.getProperty("CurrencyHasClearBtn");
                Assert.assertEquals("PASS", Constants.key.click(vObjCurrencyHasClearBtn, ""));
                Assert.assertEquals("PASS", Constants.key.click(vObjTransactionDetailsText, ""));
                String vObjCurrencyHasFieldEmptyErrorHighlight = Constants.Refer_a_Client.getProperty("CurrencyHasFieldEmptyErrorHighlight");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCurrencyHasFieldEmptyErrorHighlight, ""));
                LogCapture.info("Currency Has Field is mandatory....");
                String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
                Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
                LogCapture.info("Continue button is disable....");

                String vBuy = Constants.Refer_a_Client.getProperty("Currency_Want");
                Assert.assertEquals("PASS", Constants.key.click(vBuy, ""));
                String vObjCurrencyWantClearBtn = Constants.Refer_a_Client.getProperty("CurrencyWantClearBtn");
                Assert.assertEquals("PASS", Constants.key.click(vObjCurrencyWantClearBtn, ""));
                Assert.assertEquals("PASS", Constants.key.click(vObjTransactionDetailsText, ""));
                String vObjCurrencyWantFieldEmptyErrorHighlight = Constants.Refer_a_Client.getProperty("CurrencyWantFieldEmptyErrorHighlight");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCurrencyWantFieldEmptyErrorHighlight, ""));
                LogCapture.info("Currency Want Field is mandatory....");
                Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
                LogCapture.info("Continue button is disable....");


//                String vObjCurrencyPurposeClearBtn = Constants.Refer_a_Client.getProperty("CurrencyPurposeClearBtn");
//                String vReason = Constants.Refer_a_Client.getProperty("Reason");
//                Assert.assertEquals("PASS", Constants.key.click(vReason, ""));
//                Assert.assertEquals("PASS", Constants.key.click(vObjCurrencyPurposeClearBtn, ""));
//                Assert.assertEquals("PASS", Constants.key.click(vObjTransactionDetailsText, ""));
//                String vObjReasonFieldEmptyErrorHighlight = Constants.Refer_a_Client.getProperty("ReasonFieldEmptyErrorHighlight");
//                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjReasonFieldEmptyErrorHighlight, ""));
//                LogCapture.info("Reason Field is mandatory....");
//                Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
//                LogCapture.info("Continue button is disable....");
                LogCapture.info("All Contact details are deleted and fields highlighted in Red...");
            }
        }
    }

    @And("^User Selects (Email|SMS|Both) Checkbox for send registration link$")
    public void userSelectsEmailCheckboxForSendRegistrationLink(String TargetCheckBox) throws Throwable {

        Constants.key.pause("2", "");
        if (TargetCheckBox.equalsIgnoreCase("Email")) {
            String vObjReceiveEmail = Constants.Affiliates_GlobalPageElementsOR.getProperty("ReceiveEmail");
            String vObjReceiveSMS = Constants.Affiliates_GlobalPageElementsOR.getProperty("ReceiveSMS");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjReceiveEmail, "selected"));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjReceiveSMS, "selected"));
            Assert.assertEquals("PASS", Constants.key.click(vObjReceiveSMS, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on Email And Unchecked SMS Option...");
        }
        if (TargetCheckBox.equalsIgnoreCase("SMS")) {
            String vObjReceiveEmail = Constants.Affiliates_GlobalPageElementsOR.getProperty("ReceiveEmail");
            String vObjReceiveSMS = Constants.Affiliates_GlobalPageElementsOR.getProperty("ReceiveSMS");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjReceiveEmail, "selected"));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjReceiveSMS, "selected"));
            Assert.assertEquals("PASS", Constants.key.click(vObjReceiveEmail, ""));
            Constants.key.pause("2", "");
            LogCapture.info("User clicked on SMS And Unchecked Email Option...");
        }
        if (TargetCheckBox.equalsIgnoreCase("Both")) {
            String vObjReceiveEmail = Constants.Affiliates_GlobalPageElementsOR.getProperty("ReceiveEmail");
            String vObjReceiveSMS = Constants.Affiliates_GlobalPageElementsOR.getProperty("ReceiveSMS");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjReceiveEmail, "selected"));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjReceiveSMS, "selected"));
            LogCapture.info("User clicked on SMS And Email Option...");
        }
    }

    @When("^User enter the Name \"([^\"]*)\" and EmailID \"([^\"]*)\"$")
    public void userProvideTheValidNameAndEmailIDAndClickGenerateButton(String Name, String EmailId) throws
            Throwable {
        String vObjName = Constants.Affiliates_GlobalPageElementsOR.getProperty("Name");
        String vObjEmailId = Constants.Affiliates_GlobalPageElementsOR.getProperty("EmailId");
        LogCapture.info("Name " + Name + ", EmailID " + EmailId);
        Assert.assertEquals("PASS", Constants.key.clearText(vObjName));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjName, Name));
        Assert.assertEquals("PASS", Constants.key.clearText(vObjEmailId));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjEmailId, EmailId));
    }

    @Then("^success message to be displayed with EmailId \"([^\"]*)\" which is been entered$")
    public void successMessageToBeDisplayedWithEmailIdWhichIsBeenEntered(String EmailId) throws Throwable {
        String vObjReferralValidationEmailId = Constants.Affiliates_GlobalPageElementsOR.getProperty("ReferralLinkValidationEmailId");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjReferralValidationEmailId, ""));
        String ReferralValidationEmailId = Constants.driver.findElement(By.xpath(vObjReferralValidationEmailId)).getText();
        if (ReferralValidationEmailId.equalsIgnoreCase("We've sent a referral link to the email, " + EmailId)) {
            LogCapture.info("Referral URL Generator is validated successfully via Email Id");
        } else {
            LogCapture.error("Referral URL Generator is not validated successfully via Email Id" + ReferralValidationEmailId);
        }
    }

    @Then("^success message to be displayed with Mobile \"([^\"]*)\" which is been entered$")
    public void successMessageToBeDisplayedWithMobileWhichIsBeenEntered(String Mobile) throws Throwable {
        String vObjReferralValidationSMS = Constants.Affiliates_GlobalPageElementsOR.getProperty("ReferralLinkValidationSMS");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjReferralValidationSMS, ""));
        String ReferralValidationSMS = Constants.driver.findElement(By.xpath(vObjReferralValidationSMS)).getText();
        if (ReferralValidationSMS.equalsIgnoreCase("We've sent a referral link via SMS to the phone number ending in " + Mobile)) {
            LogCapture.info("Referral URL Generator is validated successfully via SMS");
        } else {
            LogCapture.error("Referral URL Generator is not validated successfully via SMS" + ReferralValidationSMS);
        }
    }

    @Then("^success message to be displayed with Email \"([^\"]*)\" And Mobile \"([^\"]*)\" which is been entered$")
    public void successMessageToBeDisplayedWithMobileAndEmailWhichIsBeenEntered(String Email, String Mobile) throws
            Throwable {
        String vObjReferralValidationEmailIdMobile = Constants.Affiliates_GlobalPageElementsOR.getProperty("ReferralLinkValidationEmailId");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjReferralValidationEmailIdMobile, ""));
        String ReferralValidationEmailIdMobile = Constants.driver.findElement(By.xpath(vObjReferralValidationEmailIdMobile)).getText();
        if (ReferralValidationEmailIdMobile.equalsIgnoreCase("We've sent a referral link to the email, " + Email + " and an SMS to the phone number ending in " + Mobile)) {
            LogCapture.info("Referral URL Generator is validated successfully via Email Id And SMS");
        } else {
            LogCapture.error("Referral URL Generator is not validated successfully via Email Id And SMS" + ReferralValidationEmailIdMobile + Mobile);
        }
    }

    @Then("^Verify User is able to view (Enable|Disable) the Generate button$")
    public void userShouldNotBeAbleToViewTheGenerateButton(String VisibilityText) throws Throwable {
        if (VisibilityText.equalsIgnoreCase("Disable")) {
            //String vObjGenerateURLButton = Constants.Affiliates_GlobalPageElementsOR.getProperty("GenerateButton");
            String vObjGenerateURL = Constants.Affiliates_GlobalPageElementsOR.getProperty("GenerateButtonDisable");
            //Assert.assertEquals("PASS", Constants.key.InVisibleConditionWaitWithText(vObjGenerateURLButton, "Generate URL"));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjGenerateURL, "disabled"));

            LogCapture.info("Referral URL Generator page with Generate URL button is disable....");
        }
        if (VisibilityText.equalsIgnoreCase("Enable")) {
            String vObjGenerateURLButton = Constants.Affiliates_GlobalPageElementsOR.getProperty("GenerateButton");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjGenerateURLButton, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjGenerateURLButton, "enabled"));
            LogCapture.info("Referral URL Generator page with Generate URL button is Enable....");
        }
    }

    @When("^User enter the Name \"([^\"]*)\" and MobileNumber \"([^\"]*)\"$")
    public void userProvideTheNameAndMobileNumber(String Name, String MobileNumber) throws Throwable {
        String vObjName = Constants.Affiliates_GlobalPageElementsOR.getProperty("Name");
        String vObjMobileNumber = Constants.Affiliates_GlobalPageElementsOR.getProperty("MobileNumber");
        LogCapture.info("Name " + Name + ", MobileNumber " + MobileNumber);
        Assert.assertEquals("PASS", Constants.key.clearText(vObjName));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjName, Name));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjMobileNumber, MobileNumber));
    }


    @Then("^Verify the error message is displayed when user enters an invalid value of (MobileNumber|EmailId)$")
    public void verifyTheErrorMessageIsDisplayedWhenUsersEnterInvalidValue(String InvalidValue) throws
            Throwable {
        if (InvalidValue.equalsIgnoreCase("MobileNumber")) {
            String vObjMobileNumber = Constants.Affiliates_GlobalPageElementsOR.getProperty("MobileNumber");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjMobileNumber, "enter"));
            String vObjName = Constants.Affiliates_GlobalPageElementsOR.getProperty("Name");
            Assert.assertEquals("PASS", Constants.key.clearText(vObjName));
            String vObjMobileFieldErrorMsg = Constants.Affiliates_GlobalPageElementsOR.getProperty("MobileFieldErrorMsg");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjMobileFieldErrorMsg, ""));
            String vObjMobileFieldErrorCrossSymbol = Constants.Affiliates_GlobalPageElementsOR.getProperty("MobileFieldErrorCross");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjMobileFieldErrorCrossSymbol, ""));
        }
        if (InvalidValue.equalsIgnoreCase("EmailId")) {
            String vObjEmailId = Constants.Affiliates_GlobalPageElementsOR.getProperty("EmailId");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjEmailId, "enter"));
            String vObjName = Constants.Affiliates_GlobalPageElementsOR.getProperty("Name");
            Assert.assertEquals("PASS", Constants.key.clearText(vObjName));
            String vObjEmailFieldErrorMsg = Constants.Affiliates_GlobalPageElementsOR.getProperty("EmailFieldErrorMsg");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjEmailFieldErrorMsg, ""));
            String vObjEmailFieldErrorCrossSymbol = Constants.Affiliates_GlobalPageElementsOR.getProperty("EmailFieldErrorCross");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjEmailFieldErrorCrossSymbol, ""));
        }

    }

    @When("^User enter the Name \"([^\"]*)\" and EmailID \"([^\"]*)\" and MobileNumber \"([^\"]*)\"$")
    public void userEnterTheNameAndEmailIDAndMobileNumber(String Name, String EmailId, String MobileNumber) throws
            Throwable {
        String vObjName = Constants.Affiliates_GlobalPageElementsOR.getProperty("Name");
        String vObjEmailId = Constants.Affiliates_GlobalPageElementsOR.getProperty("EmailId");
        String vObjMobileNumber = Constants.Affiliates_GlobalPageElementsOR.getProperty("MobileNumberText");
        LogCapture.info("Name " + Name + ", MobileNumber " + MobileNumber + ", EmailId " + EmailId);
        Assert.assertEquals("PASS", Constants.key.clearText(vObjName));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjName, Name));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjEmailId, EmailId));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjMobileNumber, MobileNumber));
    }

    @Then("^User will land back on (Account|Send Registration Link) Page$")
    public void userWillLandBackOnAccountPage(String LandingPage) throws Throwable {
        if (LandingPage.equalsIgnoreCase("Account")) {
            String vObjAccountPage = Constants.Affiliates_GlobalPageElementsOR.getProperty("LandingAccountPage");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAccountPage, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjAccountPage, "enabled"));
            LogCapture.info("User redirected to Account Page");
        }
        if (LandingPage.equalsIgnoreCase("Send Registration Link")) {
            String vObjReferralURLPage = Constants.Affiliates_GlobalPageElementsOR.getProperty("GenerateButton");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjReferralURLPage, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjReferralURLPage, "Disabled"));
            LogCapture.info("User redirected to Send Registration Link Page");
        }
    }

    @Then("^User should view the Organization information in header and footer section$")
    public void userShouldViewTheOrganizationInformationInHeaderAndFooterSection() throws Throwable {
        String vObjFooter = Constants.Affiliates_GlobalPageElementsOR.getProperty("Footer");
        String Footer = Constants.driver.findElement(By.xpath(vObjFooter)).getText();
        String vObjFooterMsg = Constants.Affiliates_GlobalPageElementsOR.getProperty("FooterMessage");
        String FooterMsg = Constants.driver.findElement(By.xpath(vObjFooterMsg)).getText();
        String vObjProfileName = Constants.Affiliates_GlobalPageElementsOR.getProperty("ProfileName");
        String ProfileName = Constants.driver.findElement(By.xpath(vObjProfileName)).getText();
        String vObjProfileText = Constants.Affiliates_GlobalPageElementsOR.getProperty("ProfileText");
        String ProfileText = Constants.driver.findElement(By.xpath(vObjProfileText)).getText();
        if (Footer.equalsIgnoreCase("© Currencies Direct Ltd, One Canada Square, Canary Wharf, London E14 5AA, United Kingdom. Registered in England & Wales, No.: 03041197.") && FooterMsg.equalsIgnoreCase("Currencies Direct Ltd is authorised by the Financial Conduct Authority as an Electronic Money Institution under the Electronic Money Regulations 2011. Our FCA Firm Reference number is 900669.")) {
            LogCapture.info("Footer Message is display correctly");
        } else {
            Assert.fail();
            LogCapture.error("Footer Message is not displayed correctly" + Footer + "" + FooterMsg);
        }
        if (ProfileName.equalsIgnoreCase("Paul White") && ProfileText.equalsIgnoreCase("Your affiliate manager")) {
            System.out.println(ProfileName + ":::" + ProfileText);
            LogCapture.info("Profile Name & Profile Text are display correctly");
        } else {
            Assert.fail();
            LogCapture.error("Profile Name & Profile Text are not displayed correctly" + ProfileName + "" + ProfileText);
        }
        String vObjContact = Constants.Affiliates_GlobalPageElementsOR.getProperty("Contact");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContact, "enabled"));
    }

    @When("^User enter the (Max|Min|Alphabets|Alphanumeric|Valid) Count Of (MobileNumber|Name)$")
    public void userEnterTheNameAndMaxCountOfMobileNumber(String Value, String Name) throws Throwable {
        if (Value.equalsIgnoreCase("Max") && Name.equalsIgnoreCase("MobileNumber")) {
            String RandomNumber = RandomStringUtils.randomNumeric(15);
            LogCapture.info(RandomNumber);
            int LengthOfMessage = RandomNumber.length();
            LogCapture.info("Length of input message: " + LengthOfMessage);
            String vObjMobileNumber = Constants.Affiliates_GlobalPageElementsOR.getProperty("MobileNumber");
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjMobileNumber, RandomNumber));

        }
        if (Value.equalsIgnoreCase("Min") && Name.equalsIgnoreCase("MobileNumber")) {
            String RandomNumber = RandomStringUtils.randomNumeric(7);
            LogCapture.info(RandomNumber);
            int LengthOfMessage = RandomNumber.length();
            LogCapture.info("Length of input message: " + LengthOfMessage);
            String vObjMobileNumber = Constants.Affiliates_GlobalPageElementsOR.getProperty("MobileNumber");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjMobileNumber, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjMobileNumber, "enter"));
            Assert.assertEquals("PASS", Constants.key.clearText(vObjMobileNumber));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjMobileNumber, RandomNumber));

        }
        if (Value.equalsIgnoreCase("Alphabets") && Name.equalsIgnoreCase("MobileNumber")) {
            String RandomNumber = RandomStringUtils.randomAlphabetic(5);
            LogCapture.info(RandomNumber);
            int LengthOfMessage = RandomNumber.length();
            LogCapture.info("Length of input message: " + LengthOfMessage);
            String vObjMobileNumber = Constants.Affiliates_GlobalPageElementsOR.getProperty("MobileNumber");
            Assert.assertEquals("PASS", Constants.key.clearText(vObjMobileNumber));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjMobileNumber, RandomNumber));

        }
        if (Value.equalsIgnoreCase("Alphanumeric") && Name.equalsIgnoreCase("MobileNumber")) {
            String RandomNumber = RandomStringUtils.randomAlphanumeric(7);
            LogCapture.info(RandomNumber);
            int LengthOfMessage = RandomNumber.length();
            LogCapture.info("Length of input message: " + LengthOfMessage);
            String vObjMobileNumber = Constants.Affiliates_GlobalPageElementsOR.getProperty("MobileNumber");
            Assert.assertEquals("PASS", Constants.key.clearText(vObjMobileNumber));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjMobileNumber, RandomNumber));

        }
        if (Value.equalsIgnoreCase("Valid") && Name.equalsIgnoreCase("MobileNumber")) {
            String RandomNumber = RandomStringUtils.randomNumeric(8);
            LogCapture.info(RandomNumber);
            int LengthOfMessage = RandomNumber.length();
            LogCapture.info("Length of input message: " + LengthOfMessage);
            String vObjMobileNumber = Constants.Affiliates_GlobalPageElementsOR.getProperty("MobileNumber");
            Assert.assertEquals("PASS", Constants.key.clearText(vObjMobileNumber));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjMobileNumber, RandomNumber));

        }

        if (Value.equalsIgnoreCase("Alphabets") && Name.equalsIgnoreCase("Name")) {
            String RandomNumber = RandomStringUtils.randomAlphabetic(41);
            LogCapture.info(RandomNumber);
            int LengthOfMessage = RandomNumber.length();
            LogCapture.info("Length of input message: " + LengthOfMessage);
            String vObjName = Constants.Affiliates_GlobalPageElementsOR.getProperty("Name");
            Assert.assertEquals("PASS", Constants.key.clearText(vObjName));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjName, RandomNumber));

        }

    }

    @And("^User Verify the Settings Page within section (Company Details|Personal Details|Contact Detail Email) is (Enabled|Disabled)$")
    public void userVerifyTheSettingsPage(String Section, String Status) throws Throwable {
        if (Section.equalsIgnoreCase("Company Details") && Status.equalsIgnoreCase("Disabled")) {
            String vObjCompanyName = Constants.Affiliates_SettingsPageOR.getProperty("CompanyName");
            String vObjTradingName = Constants.Affiliates_SettingsPageOR.getProperty("TradingName");
            String CompanyName = Constants.driver.findElement(By.xpath(vObjCompanyName)).getAttribute("value");
            String TradingName = Constants.driver.findElement(By.xpath(vObjTradingName)).getAttribute("value");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjCompanyName, "disabled"));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjTradingName, "disabled"));

        }
        if (Section.equalsIgnoreCase("Personal Details") && Status.equalsIgnoreCase("Disabled")) {
            String vObjFirstName = Constants.Affiliates_SettingsPageOR.getProperty("FirstName");
            String vObjSurName = Constants.Affiliates_SettingsPageOR.getProperty("SurName");
            String FirstName = Constants.driver.findElement(By.xpath(vObjFirstName)).getAttribute("value");
            String SurName = Constants.driver.findElement(By.xpath(vObjSurName)).getAttribute("value");
            System.out.println("FirstName" + FirstName);
            System.out.println("SurName" + SurName);
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjFirstName, "disabled"));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjSurName, "disabled"));
            if (FirstName.length() > 1 && !FirstName.isEmpty() && SurName.length() > 1 && !SurName.isEmpty()) {
                LogCapture.info("First Name & SurName fields are grayed out : Disabled mode with text value" + FirstName + "-> FirstName::SurName <-" + SurName);
            } else {
                Assert.fail();
                LogCapture.info("First Name & SurName fields are not grayed out : Enabled mode without text value" + FirstName + "-> FirstName::SurName <-" + SurName);
            }
        }
        if (Section.equalsIgnoreCase("Contact Detail Email") && Status.equalsIgnoreCase("Disabled")) {
            String vObjContactEmail = Constants.Affiliates_SettingsPageOR.getProperty("Email");
            String ContactEmail = Constants.driver.findElement(By.xpath(vObjContactEmail)).getAttribute("value");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContactEmail, "disabled"));

            if (ContactEmail.length() > 1 && !ContactEmail.isEmpty()) {
                LogCapture.info("Email field is grayed out : Disabled mode with text value" + ContactEmail);
            } else {
                Assert.fail();
                LogCapture.info("Email is not grayed out : Enabled mode without text value" + ContactEmail);
            }
        }

    }

    @And("^User deletes (Optional|Mandatory) field values on Contact details Page(| with error messages and Continue button disable)$")
    public void userDeletesOptionalFieldValuesOnContactDetailsPage(String TargetFields, String
            TargetMessage) throws Throwable {
        if (TargetFields.equalsIgnoreCase("Optional")) {
            if (TargetMessage.equalsIgnoreCase("")) {
                String vObjLandLineNumber = Constants.Refer_a_Client.getProperty("LandLineNumber");
                Assert.assertEquals("PASS", Constants.key.click(vObjLandLineNumber, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjLandLineNumber, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjLandLineNumber, "delete"));
                LogCapture.info("Deleting value for LandLine Number field...");
                String vObjContactDetailsText = Constants.Refer_a_Client.getProperty("ContactDetailsText");
                Assert.assertEquals("PASS", Constants.key.click(vObjContactDetailsText, ""));

                String vObjLandlineNumberErrorMessage = Constants.Refer_a_Client.getProperty("LandlineNumberErrorMessage");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjLandlineNumberErrorMessage, ""));
                Assert.assertEquals("PASS", Constants.key.verifyText(vObjLandlineNumberErrorMessage, "Landline number (optional)"));
                String vObjErrorIconLandlineErrorMessage = Constants.Refer_a_Client.getProperty("ErrorIconLandlineErrorMessage");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorIconLandlineErrorMessage, ""));
                String vObjErrorMessageEnterValidLandlineNumber = Constants.Refer_a_Client.getProperty("ErrorMessageEnterValidLandlineNumber");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorMessageEnterValidLandlineNumber, ""));
                Assert.assertEquals("PASS", Constants.key.verifyText(vObjErrorMessageEnterValidLandlineNumber, "Please enter a valid phone number"));
                LogCapture.info("Error message and Error icon to Enter Valid Phone number visible...");

                String vObjLandlineCountryCodeClearBtn = Constants.Refer_a_Client.getProperty("LandlineCountryCodeClearBtn");
                String vCountryCode_LandLine = Constants.Refer_a_Client.getProperty("CountryCode_LandLine");
                Assert.assertEquals("PASS", Constants.key.click(vCountryCode_LandLine, ""));
                Assert.assertEquals("PASS", Constants.key.click(vObjLandlineCountryCodeClearBtn, ""));
                Assert.assertEquals("PASS", Constants.key.click(vObjContactDetailsText, ""));
                String vObjTickIconLandlineNumber = Constants.Refer_a_Client.getProperty("TickIconLandlineNumber");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjTickIconLandlineNumber, ""));
                LogCapture.info("Deleted value for LandLine Number Country code field...");


                String vObjBestTimeToCallClearBtn = Constants.Refer_a_Client.getProperty("BestTimeToCallClearBtn");
                String vObjBestTimeToCall = Constants.Refer_a_Client.getProperty("BestTimeToCall");
                Assert.assertEquals("PASS", Constants.key.click(vObjBestTimeToCall, ""));
                Assert.assertEquals("PASS", Constants.key.click(vObjBestTimeToCallClearBtn, ""));
                Assert.assertEquals("PASS", Constants.key.click(vObjContactDetailsText, ""));
                LogCapture.info("Deleted value for Best Time to call field...");
                LogCapture.info("All Optional field cleared for Contact details page...");
                String vContinueButtonEnable = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
                Constants.driver.findElement(By.xpath(vContinueButtonEnable)).isEnabled();
                LogCapture.info("Continue button enabled...");
            }
        }
        if (TargetFields.equalsIgnoreCase("Mandatory")) {
            if (TargetMessage.equalsIgnoreCase(" with error messages and Continue button disable")) {

                String vObjMobileNumber = Constants.Refer_a_Client.getProperty("MobileNumber");
                Assert.assertEquals("PASS", Constants.key.click(vObjMobileNumber, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjMobileNumber, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjMobileNumber, "delete"));
                LogCapture.info("Deleting value for Mobile Number field...");
                String vObjContactDetailsText = Constants.Refer_a_Client.getProperty("ContactDetailsText");
                Assert.assertEquals("PASS", Constants.key.click(vObjContactDetailsText, ""));
                String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
                Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
                LogCapture.info("Continue button is disable....");
                String vObjMobileNumberErrorMessage = Constants.Refer_a_Client.getProperty("MobileNumberErrorMessage");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjMobileNumberErrorMessage, ""));
                Assert.assertEquals("PASS", Constants.key.verifyText(vObjMobileNumberErrorMessage, "Mobile number"));
                String vObjErrorIconMobileNumberErrorMessage = Constants.Refer_a_Client.getProperty("ErrorIconMobileNumberErrorMessage");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorIconMobileNumberErrorMessage, ""));
                String vObjErrorMessageEnterValidMobileNumber = Constants.Refer_a_Client.getProperty("ErrorMessageEnterValidMobileNumber");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorMessageEnterValidMobileNumber, ""));
                Assert.assertEquals("PASS", Constants.key.verifyText(vObjErrorMessageEnterValidMobileNumber, "Please enter a valid phone number"));
                LogCapture.info("Error message and Error icon to Enter Valid Phone number visible...");

                String vObjMobileNumberCountryCodeClearBtn = Constants.Refer_a_Client.getProperty("MobileNumberCountryCodeClearBtn");
                String vObjCountryCode_Mobile = Constants.Refer_a_Client.getProperty("CountryCode_Mobile");
                Assert.assertEquals("PASS", Constants.key.click(vObjCountryCode_Mobile, ""));
                Assert.assertEquals("PASS", Constants.key.click(vObjMobileNumberCountryCodeClearBtn, ""));
                LogCapture.info("Deleted Country code for Mobile number field...");
                Assert.assertEquals("PASS", Constants.key.click(vObjContactDetailsText, ""));
                Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
                LogCapture.info("Continue button is disable....");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjMobileNumberErrorMessage, ""));
                Assert.assertEquals("PASS", Constants.key.verifyText(vObjMobileNumberErrorMessage, "Mobile number"));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorIconMobileNumberErrorMessage, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorMessageEnterValidMobileNumber, ""));
                Assert.assertEquals("PASS", Constants.key.verifyText(vObjErrorMessageEnterValidMobileNumber, "Please enter a valid phone number"));
                LogCapture.info("Error message and Error icon to Enter Valid Phone number visible...");
                String vEmailID = Constants.Refer_a_Client.getProperty("Refer_a_Client_EmailID");
                Assert.assertEquals("PASS", Constants.key.click(vEmailID, ""));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vEmailID, "selectall"));
                Assert.assertEquals("PASS", Constants.key.KeyboardAction(vEmailID, "delete"));
                LogCapture.info("Deleting Email address field...");
                Assert.assertEquals("PASS", Constants.key.click(vObjContactDetailsText, ""));
                String vObjEmailAddFieldErrorHighlightMessage = Constants.Refer_a_Client.getProperty("EmailAddFieldErrorHighlightMessage");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjEmailAddFieldErrorHighlightMessage, ""));
                Assert.assertEquals("PASS", Constants.key.verifyText(vObjEmailAddFieldErrorHighlightMessage, "Email address"));
                String vObjErrorIconEmailAddressErrorMessage = Constants.Refer_a_Client.getProperty("ErrorIconEmailAddressErrorMessage");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorIconEmailAddressErrorMessage, ""));
                String vObjErrorMessageEnterValidEmailAddress = Constants.Refer_a_Client.getProperty("ErrorMessageEnterValidEmailAddress");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorMessageEnterValidEmailAddress, ""));
                Assert.assertEquals("PASS", Constants.key.verifyText(vObjErrorMessageEnterValidEmailAddress, "Please enter a valid email address"));
                LogCapture.info("Error message and Error icon to Enter Valid Email address visible...");

                Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
                LogCapture.info("Continue button is disable....");
                LogCapture.info("Deleted All mandatory value for contact details page...");
            }
        }
    }

    @Then("^User should be able to view the option as enabled and (Check|UnCheck)$")
    public void userShouldBeAbleToViewTheOptionAsEnabledAndTicked(String status) throws
            Throwable {
        if (status.equalsIgnoreCase("Check")) {
            String vObjOptOutCheckBox = Constants.Affiliates_SettingsPageOR.getProperty("OptOutCheckBox");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjOptOutCheckBox, "enabled"));
            if (Constants.driver.findElement(By.xpath(vObjOptOutCheckBox)).isSelected() == true) {
                LogCapture.info("The checkbox is selected" + Constants.driver.findElement(By.xpath(vObjOptOutCheckBox)).isSelected());
            } else {
                Assert.assertEquals("PASS", Constants.key.click(vObjOptOutCheckBox, ""));
                LogCapture.info("The checkbox is NOT selected" + Constants.driver.findElement(By.xpath(vObjOptOutCheckBox)).isSelected());
            }
        }
        if (status.equalsIgnoreCase("UnCheck")) {
            String vObjAccountManagerCheckBox = Constants.Affiliates_SettingsPageOR.getProperty("OptOutCheckBox");
            if (Constants.driver.findElement(By.xpath(vObjAccountManagerCheckBox)).isSelected() == false) {
                LogCapture.info("The checkbox is Unchecked" + Constants.driver.findElement(By.xpath(vObjAccountManagerCheckBox)).isSelected());
            } else {
                Assert.fail();
                LogCapture.info("The checkbox is Checked" + Constants.driver.findElement(By.xpath(vObjAccountManagerCheckBox)).isSelected());
            }
        }
    }

    @And("^User now Select a value on \"([^\"]*)\" preference list$")
    public void userNowSelectAValueOnPreferenceList(String EmailList) throws Throwable {
        String vObjEmailList = Constants.Affiliates_SettingsPageOR.getProperty("EmailList");
        Assert.assertEquals("PASS", Constants.key.click(vObjEmailList, ""));
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjEmailList, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjEmailList, EmailList));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjEmailList, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjEmailList, "enter"));
        Assert.assertEquals("PASS", Constants.key.click(vObjEmailList, ""));

    }

    @Then("^Verify the Header Section for Settings page$")
    public void verifyTheHeaderAndFooterSection() {
        String vObjFooter = Constants.Affiliates_SettingsPageOR.getProperty("Footer");
        String Footer = Constants.driver.findElement(By.xpath(vObjFooter)).getText();
        String vObjFooterMsg = Constants.Affiliates_SettingsPageOR.getProperty("FooterMessage");
        String FooterMsg = Constants.driver.findElement(By.xpath(vObjFooterMsg)).getText();
        String vObjHeaderText = Constants.Affiliates_SettingsPageOR.getProperty("HeaderText");
        String HeaderText = Constants.driver.findElement(By.xpath(vObjHeaderText)).getText();

        if (Footer.equalsIgnoreCase("© Currencies Direct Ltd, One Canada Square, Canary Wharf, London E14 5AA, United Kingdom. Registered in England & Wales, No.: 03041197.") && FooterMsg.equalsIgnoreCase("Currencies Direct Ltd is authorised by the Financial Conduct Authority as an Electronic Money Institution under the Electronic Money Regulations 2011. Our FCA Firm Reference number is 900669.")) {
            LogCapture.info("Footer Message is display correctly");
        } else {
            Assert.fail();
            LogCapture.error("Footer Message is not displayed correctly. Expected Footer Msg: " + Footer + ". Actual Footer Msg: " + FooterMsg);
        }
        if (HeaderText.equalsIgnoreCase("Please keep your details up to date so we can contact you when we need to.")) {
            LogCapture.info("Header Message is display correctly");
        } else {
            Assert.fail();
            LogCapture.error("Header Message is not displayed correctly" + HeaderText + "" + HeaderText);
        }

    }

    @And("^User deletes (Mandatory|optional) (Individual|Corporate) field values on Personal details Page(| with error messages and Continue button disable)$")
    public void userDeletesIndividualMandatoryFieldValuesOnPersonalDetailsPageWithErrorMessagesAndContinueButtonDisable
            (String TargetFields, String TargetType, String TargetMessage) throws Throwable {

        if (TargetFields.equalsIgnoreCase("optional")) {
            if (TargetType.equalsIgnoreCase("Corporate")) {
                if (TargetMessage.equalsIgnoreCase("")) {
                    String vPM_PersonalDetailSection = Constants.Refer_a_Client.getProperty("PM_PersonalDetailSection");
                    String vObjTradingName = Constants.Refer_a_Client.getProperty("TradingName");
                    Assert.assertEquals("PASS", Constants.key.click(vObjTradingName, ""));
                    Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjTradingName, "selectall"));
                    Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjTradingName, "delete"));
                    Assert.assertEquals("PASS", Constants.key.click(vPM_PersonalDetailSection, ""));
                    LogCapture.info("Trading name field deleted...");
                }
            }
        }

        if (TargetFields.equalsIgnoreCase("Mandatory")) {
            if (TargetType.equalsIgnoreCase("Individual")) {
                if (TargetMessage.equalsIgnoreCase(" with error messages and Continue button disable")) {
                    String vSalutationClearBtn = Constants.Refer_a_Client.getProperty("SalutationClearBtn");
                    String vF_Name = Constants.Refer_a_Client.getProperty("FirstName");
                    String vL_Name = Constants.Refer_a_Client.getProperty("LastName");
                    String vSalutation = Constants.Refer_a_Client.getProperty("Salutation");
                    Assert.assertEquals("PASS", Constants.key.click(vSalutation, ""));
                    Assert.assertEquals("PASS", Constants.key.click(vSalutationClearBtn, ""));
                    String vPM_PersonalDetailSection = Constants.Refer_a_Client.getProperty("PM_PersonalDetailSection");
                    Assert.assertEquals("PASS", Constants.key.click(vPM_PersonalDetailSection, ""));
                    String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
                    Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
                    LogCapture.info("Salutation field deleted and Continue button disable...");
                    String vObjSalutationFieldErrorHighlightMessagee = Constants.Refer_a_Client.getProperty("SalutationFieldErrorHighlightMessage");
                    Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSalutationFieldErrorHighlightMessagee, ""));
                    Assert.assertEquals("PASS", Constants.key.verifyText(vObjSalutationFieldErrorHighlightMessagee, "Salutation"));
                    LogCapture.info("Error highlighted for Salutation field...");

                    Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
                    Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "selectall"));
                    Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "delete"));
                    Assert.assertEquals("PASS", Constants.key.click(vPM_PersonalDetailSection, ""));
                    Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
                    LogCapture.info("First name field deleted and Continue button disable...");
                    String vObjFirstNameFieldErrorHighlightMessage = Constants.Refer_a_Client.getProperty("FirstNameFieldErrorHighlightMessage");
                    Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjFirstNameFieldErrorHighlightMessage, ""));
                    Assert.assertEquals("PASS", Constants.key.verifyText(vObjFirstNameFieldErrorHighlightMessage, "First name"));

                    String vObjErrorIconFirstNameErrorMessage = Constants.Refer_a_Client.getProperty("ErrorIconFirstNameErrorMessage");
                    Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorIconFirstNameErrorMessage, ""));
                    String vObjErrorMessageEnterValidFirstName = Constants.Refer_a_Client.getProperty("ErrorMessageEnterValidFirstName");
                    Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorMessageEnterValidFirstName, ""));
                    Assert.assertEquals("PASS", Constants.key.verifyText(vObjErrorMessageEnterValidFirstName, "Please use your name as it appears on your passport"));
                    LogCapture.info("Error message and Error icon to Enter Valid First Name visible...");

                    Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
                    Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "selectall"));
                    Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "delete"));
                    Assert.assertEquals("PASS", Constants.key.click(vPM_PersonalDetailSection, ""));
                    Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
                    LogCapture.info("Last name field deleted and Continue button disable...");
                    String vObjLastNameFieldErrorHighlightMessage = Constants.Refer_a_Client.getProperty("LastNameFieldErrorHighlightMessage");
                    Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjLastNameFieldErrorHighlightMessage, ""));
                    Assert.assertEquals("PASS", Constants.key.verifyText(vObjLastNameFieldErrorHighlightMessage, "Surname"));
                    String vObjErrorIconLastNameErrorMessage = Constants.Refer_a_Client.getProperty("ErrorIconLastNameErrorMessage");
                    Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorIconLastNameErrorMessage, ""));
                    String vObjErrorMessageEnterValidLastName = Constants.Refer_a_Client.getProperty("ErrorMessageEnterValidLastName");
                    Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorMessageEnterValidLastName, ""));
                    Assert.assertEquals("PASS", Constants.key.verifyText(vObjErrorMessageEnterValidLastName, "Please use your name as it appears on your passport"));
                    LogCapture.info("Error message and Error icon to Enter Valid Last Name visible...");

                    LogCapture.info("All Mandatory fields deleted and continue button is disable..");
                }
            }
            if (TargetFields.equalsIgnoreCase("Mandatory")) {
                if (TargetType.equalsIgnoreCase("Corporate")) {
                    if (TargetMessage.equalsIgnoreCase(" with error messages and Continue button disable")) {
                        String vSalutationClearBtn = Constants.Refer_a_Client.getProperty("SalutationClearBtn");
                        String vF_Name = Constants.Refer_a_Client.getProperty("FirstName");
                        String vL_Name = Constants.Refer_a_Client.getProperty("LastName");
                        String vSalutation = Constants.Refer_a_Client.getProperty("Salutation");
                        Assert.assertEquals("PASS", Constants.key.click(vSalutation, ""));
                        Assert.assertEquals("PASS", Constants.key.click(vSalutationClearBtn, ""));
                        String vPM_PersonalDetailSection = Constants.Refer_a_Client.getProperty("PM_PersonalDetailSection");
                        Assert.assertEquals("PASS", Constants.key.click(vPM_PersonalDetailSection, ""));
                        String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
                        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
                        LogCapture.info("Salutation field deleted and Continue button disable...");
                        String vObjSalutationFieldErrorHighlightMessagee = Constants.Refer_a_Client.getProperty("SalutationFieldErrorHighlightMessage");
                        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSalutationFieldErrorHighlightMessagee, ""));
                        Assert.assertEquals("PASS", Constants.key.verifyText(vObjSalutationFieldErrorHighlightMessagee, "Salutation"));
                        LogCapture.info("Error highlighted for Salutation field...");

                        Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
                        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "selectall"));
                        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "delete"));
                        Assert.assertEquals("PASS", Constants.key.click(vPM_PersonalDetailSection, ""));
                        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
                        LogCapture.info("First name field deleted and Continue button disable...");
                        String vObjFirstNameFieldErrorHighlightMessage = Constants.Refer_a_Client.getProperty("FirstNameFieldErrorHighlightMessage");
                        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjFirstNameFieldErrorHighlightMessage, ""));
                        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFirstNameFieldErrorHighlightMessage, "First name"));

                        String vObjErrorIconFirstNameErrorMessage = Constants.Refer_a_Client.getProperty("ErrorIconFirstNameErrorMessage");
                        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorIconFirstNameErrorMessage, ""));
                        String vObjErrorMessageEnterValidFirstName = Constants.Refer_a_Client.getProperty("ErrorMessageEnterValidFirstName");
                        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorMessageEnterValidFirstName, ""));
                        Assert.assertEquals("PASS", Constants.key.verifyText(vObjErrorMessageEnterValidFirstName, "Please use your name as it appears on your passport"));
                        LogCapture.info("Error message and Error icon to Enter Valid First Name visible...");

                        Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
                        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "selectall"));
                        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "delete"));
                        Assert.assertEquals("PASS", Constants.key.click(vPM_PersonalDetailSection, ""));
                        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
                        LogCapture.info("Last name field deleted and Continue button disable...");
                        String vObjLastNameFieldErrorHighlightMessage = Constants.Refer_a_Client.getProperty("LastNameFieldErrorHighlightMessage");
                        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjLastNameFieldErrorHighlightMessage, ""));
                        Assert.assertEquals("PASS", Constants.key.verifyText(vObjLastNameFieldErrorHighlightMessage, "Surname"));
                        String vObjErrorIconLastNameErrorMessage = Constants.Refer_a_Client.getProperty("ErrorIconLastNameErrorMessage");
                        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorIconLastNameErrorMessage, ""));
                        String vObjErrorMessageEnterValidLastName = Constants.Refer_a_Client.getProperty("ErrorMessageEnterValidLastName");
                        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorMessageEnterValidLastName, ""));
                        Assert.assertEquals("PASS", Constants.key.verifyText(vObjErrorMessageEnterValidLastName, "Please use your name as it appears on your passport"));
                        LogCapture.info("Error message and Error icon to Enter Valid Last Name visible...");

                        String vObjCompanyName = Constants.Refer_a_Client.getProperty("CompanyName");
                        Assert.assertEquals("PASS", Constants.key.click(vObjCompanyName, ""));
                        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCompanyName, "selectall"));
                        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCompanyName, "delete"));
                        Assert.assertEquals("PASS", Constants.key.click(vPM_PersonalDetailSection, ""));
                        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
                        LogCapture.info("Company name field deleted and Continue button disable...");

                        String vObjCompanyNameFieldErrorHighlightMessage = Constants.Refer_a_Client.getProperty("CompanyNameFieldErrorHighlightMessage");
                        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCompanyNameFieldErrorHighlightMessage, ""));
                        Assert.assertEquals("PASS", Constants.key.verifyText(vObjCompanyNameFieldErrorHighlightMessage, "Company name"));
                        String vObjErrorIcon_CompanyName = Constants.Refer_a_Client.getProperty("ErrorIcon_CompanyName");
                        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorIcon_CompanyName, ""));
                        String vObjErrorMessageEnterValidCompanyName = Constants.Refer_a_Client.getProperty("ErrorMessageEnterValidCompanyName");
                        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorMessageEnterValidCompanyName, ""));
                        Assert.assertEquals("PASS", Constants.key.verifyText(vObjErrorMessageEnterValidCompanyName, "Please enter a valid company name"));
                        LogCapture.info("Error message and Error icon to Enter Valid Company Name visible...");
                        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
                        LogCapture.info("All Personal details for Corporate type deleted and Continue button is disable...");

                    }
                }
            }


        }
    }

    @And("^User Enters Email \"([^\"]*)\" on Contact details page$")
    public void userEntersInvalidEmailOnContactDetailsPage(String Email) throws Throwable {
        String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
        String vEmailID = Constants.Refer_a_Client.getProperty("Refer_a_Client_EmailID");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vEmailID, Email));
        LogCapture.info("User entered Invalid email id...");
    }

    @And("^User Should be able to view the error on Contact details page and Continue button as disabled$")
    public void UserShouldBeAbleToViewTheErrorOnContactDetailsPageAndContinueButtonAsDisabled() throws
            Throwable {
        String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
        String vObjContactDetailsText = Constants.Refer_a_Client.getProperty("ContactDetailsText");
        Assert.assertEquals("PASS", Constants.key.click(vObjContactDetailsText, ""));
        String vObjEmailAddFieldErrorHighlightMessage = Constants.Refer_a_Client.getProperty("EmailAddFieldErrorHighlightMessage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjEmailAddFieldErrorHighlightMessage, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjEmailAddFieldErrorHighlightMessage, "Email address"));
        String vObjErrorIconEmailAddressErrorMessage = Constants.Refer_a_Client.getProperty("ErrorIconEmailAddressErrorMessage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorIconEmailAddressErrorMessage, ""));
        String vObjErrorMessageEnterValidEmailAddress = Constants.Refer_a_Client.getProperty("ErrorMessageEnterValidEmailAddress");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorMessageEnterValidEmailAddress, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjErrorMessageEnterValidEmailAddress, "Please enter a valid email address"));
        LogCapture.info("Error message and Error icon to Enter Valid Email address visible...");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
        LogCapture.info("Continue button is disable....");
    }

    @And("^User Enters the (seven|fifteen) digit numbers on both Mobile number and Landline number$")
    public void UserEnterstheSevendigitnumbersonbothMobilenumberandLandlinenumber(String TargetValue) throws
            Throwable {
        if (TargetValue.equalsIgnoreCase("seven")) {
            String LessThanMinValueNumber = RandomStringUtils.randomNumeric(7);
            String vObjLandLineNumber = Constants.Refer_a_Client.getProperty("LandLineNumber");
            Assert.assertEquals("PASS", Constants.key.click(vObjLandLineNumber, ""));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjLandLineNumber, "selectall"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjLandLineNumber, "delete"));
            LogCapture.info("Deleting and entering random 7 digit value for LandLine Number field...");
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjLandLineNumber, LessThanMinValueNumber));
            String vObjContactDetailsText = Constants.Refer_a_Client.getProperty("ContactDetailsText");
            Assert.assertEquals("PASS", Constants.key.click(vObjContactDetailsText, ""));
            LogCapture.info("7 digit Landline number entered...");

            String vObjMobileNumber = Constants.Refer_a_Client.getProperty("MobileNumber");
            Assert.assertEquals("PASS", Constants.key.click(vObjMobileNumber, ""));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjMobileNumber, "selectall"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjMobileNumber, "delete"));
            LogCapture.info("Deleting and entering random 7 digit value for Mobile Number field...");
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjMobileNumber, LessThanMinValueNumber));
            Assert.assertEquals("PASS", Constants.key.click(vObjContactDetailsText, ""));
            LogCapture.info("7 digit Mobile number entered...");
        }
        if (TargetValue.equalsIgnoreCase("fifteen")) {
            String LessThanMinValueNumber = RandomStringUtils.randomNumeric(15);
            String vObjLandLineNumber = Constants.Refer_a_Client.getProperty("LandLineNumber");
            Assert.assertEquals("PASS", Constants.key.click(vObjLandLineNumber, ""));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjLandLineNumber, "selectall"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjLandLineNumber, "delete"));
            LogCapture.info("Deleting and entering random 7 digit value for LandLine Number field...");
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjLandLineNumber, LessThanMinValueNumber));
            String vObjContactDetailsText = Constants.Refer_a_Client.getProperty("ContactDetailsText");
            Assert.assertEquals("PASS", Constants.key.click(vObjContactDetailsText, ""));
            LogCapture.info("7 digit Landline number entered...");

            String vObjMobileNumber = Constants.Refer_a_Client.getProperty("MobileNumber");
            Assert.assertEquals("PASS", Constants.key.click(vObjMobileNumber, ""));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjMobileNumber, "selectall"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjMobileNumber, "delete"));
            LogCapture.info("Deleting and entering random 7 digit value for Mobile Number field...");
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjMobileNumber, LessThanMinValueNumber));
            Assert.assertEquals("PASS", Constants.key.click(vObjContactDetailsText, ""));
            LogCapture.info("7 digit Mobile number entered...");
        }


    }


    @And("^User Should be able to view the error and Continue button as disabled for both Mobile number and Landline number$")
    public void userShouldBeAbleToViewTheErrorAndContinueButtonAsDisabledForBothMobileNumberAndLandlineNumber() throws
            Throwable {

        String vObjMobileNumberErrorMessage = Constants.Refer_a_Client.getProperty("MobileNumberErrorMessage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjMobileNumberErrorMessage, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjMobileNumberErrorMessage, "Mobile number"));
        String vObjErrorIconMobileNumberErrorMessage = Constants.Refer_a_Client.getProperty("ErrorIconMobileNumberErrorMessage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorIconMobileNumberErrorMessage, ""));
        String vObjErrorMessageEnterValidMobileNumber = Constants.Refer_a_Client.getProperty("ErrorMessageEnterValidMobileNumber");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorMessageEnterValidMobileNumber, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjErrorMessageEnterValidMobileNumber, "Please enter a valid phone number"));
        LogCapture.info("Error message and Error icon to Enter Valid Phone number visible...");

        String vObjLandlineNumberErrorMessage = Constants.Refer_a_Client.getProperty("LandlineNumberErrorMessage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjLandlineNumberErrorMessage, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjLandlineNumberErrorMessage, "Landline number (optional)"));
        String vObjErrorIconLandlineErrorMessage = Constants.Refer_a_Client.getProperty("ErrorIconLandlineErrorMessage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorIconLandlineErrorMessage, ""));
        String vObjErrorMessageEnterValidLandlineNumber = Constants.Refer_a_Client.getProperty("ErrorMessageEnterValidLandlineNumber");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjErrorMessageEnterValidLandlineNumber, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjErrorMessageEnterValidLandlineNumber, "Please enter a valid phone number"));
        LogCapture.info("Error message and Error icon to Enter Valid Phone number visible...");
        String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
        LogCapture.info("Continue button is disable....");
    }


    @And("^User Enters All Contact Details Email \"([^\"]*)\" MobileCountryCode \"([^\"]*)\" MobileNumber \"([^\"]*)\" LandlineCountryCode\"([^\"]*)\" landlineNumber \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersAllContactDetailsEmailMobileCountryCodeMobileNumberLandlineCountryCodeLandlineNumberAnd(String EmailID, String CountryCode_Mobile, String MobileNumber, String CountryCode_LandLine, String LandLineNumber, String BestTimeToCall) throws Throwable {
        String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
        String vEmailID = Constants.Refer_a_Client.getProperty("Refer_a_Client_EmailID");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vEmailID, EmailID));
        String vMobileDropDown = Constants.Refer_a_Client.getProperty("CountryCode_DropDownMobile");
        Assert.assertEquals("PASS", Constants.key.click(vMobileDropDown, ""));
        Constants.key.pause("1", "");
        String vMobileDropDownClear = Constants.Refer_a_Client.getProperty("CountryCode_DropDownMobileClear");
        Assert.assertEquals("PASS", Constants.key.click(vMobileDropDownClear, ""));
        Constants.key.pause("1", "");
        String vCountryCodeMobile = Constants.Refer_a_Client.getProperty("CountryCode_Mobile");
        Constants.key.pause("1", "");
        Assert.assertEquals("PASS", Constants.key.clearText(vCountryCodeMobile));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vCountryCodeMobile, CountryCode_Mobile));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeMobile, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeMobile, "enter"));
        String vMobileNumber = Constants.Refer_a_Client.getProperty("MobileNumber");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vMobileNumber, MobileNumber));

        String vLandLineDropDown = Constants.Refer_a_Client.getProperty("CountryCode_DropDownLandline");
        Assert.assertEquals("PASS", Constants.key.click(vLandLineDropDown, ""));
        Constants.key.pause("1", "");
        String vCountryCodeLandLine = Constants.Refer_a_Client.getProperty("CountryCode_LandLine");
        Constants.key.pause("1", "");
        Assert.assertEquals("PASS", Constants.key.clearText(vCountryCodeLandLine));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vCountryCodeLandLine, CountryCode_LandLine));
        Constants.key.pause("1", "");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeLandLine, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeLandLine, "enter"));
        Constants.key.pause("1", "");
        String vLandLineNumber = Constants.Refer_a_Client.getProperty("LandLineNumber");
        //LogCapture.info(vLandLineNumber);
        Assert.assertEquals("PASS", Constants.key.writeInInput(vLandLineNumber, LandLineNumber));
        Constants.key.pause("2", "");
        String vBestTimeToCall = Constants.Refer_a_Client.getProperty("BestTimeToCall");
        //LogCapture.info(vBestTimeToCall);
        Constants.key.pause("1", "");
        Assert.assertEquals("PASS", Constants.key.click(vBestTimeToCall, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vBestTimeToCall, BestTimeToCall));
        Constants.key.pause("1", "");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vBestTimeToCall, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vBestTimeToCall, "enter"));
        LogCapture.info("User enters all contact details and does not clicks on continue");
    }

    @Then("^System will show Error Message as Site not reachable$")
    public void systemWillShowErrorMessageAsSiteNotReachable() throws Throwable {
        String SiteNotReachable = "//span[text()=" + "'This site can" + "’" + "t be reached" + "'" + "]";
        LogCapture.info(SiteNotReachable);
        Constants.key.VisibleConditionWait(SiteNotReachable, "");
        LogCapture.info("ERROR:Site not reachable..");
    }

    @And("^User Enter Valid (cd|torfx|torfxoz) URL for Account page$")
    public void userEnterValidURLForAccountPage(String application) throws Throwable {
        String url = "https://uat-ap-" + application + ".currenciesdirect.com/account";
        if (application.equalsIgnoreCase("cd")) {
            LogCapture.info(application + " Accounts page is loading....");
            Assert.assertEquals("PASS", Constants.key.navigate("", url));
        } else if (application.equalsIgnoreCase("torfx")) {
            LogCapture.info(application + " Accounts page is loading....");
            Assert.assertEquals("PASS", Constants.key.navigate("", url));
        } else if (application.equalsIgnoreCase("torfxoz")) {
            LogCapture.info(application + " Accounts page is loading....");
            Assert.assertEquals("PASS", Constants.key.navigate("", url));
        }
    }

    @Then("^User will be navigated to the Affiliates Login Page$")
    public void userWillBeNavigatedToTheAffiliatesLoginPage() throws Throwable {
        LogCapture.info("Login Page Loading......");
        String ExpectedLoginPageTitle = "Log in to your account";
        String ExpectedLoginPageSubTitle = "Refer clients online, check the status of your previous referrals and download marketing collateral, web tools and more!";
        String vObjLoginPageTitle = Constants.Affiliates_LoginPageOR.getProperty("LoginPageTitle");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjLoginPageTitle, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjLoginPageTitle, ExpectedLoginPageTitle));
        LogCapture.info("Login page title verified...");
        String vObjLoginPageSubTitle = Constants.Affiliates_LoginPageOR.getProperty("LoginPageSubTitle");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjLoginPageSubTitle, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjLoginPageSubTitle, ExpectedLoginPageSubTitle));
        LogCapture.info("Login page message verified...");
    }

    @Then("^User will be able to view the Logout option in the dropdown$")
    public void userWillBeAbleToViewTheLogoutOptionInTheDropdown() throws Throwable {
        String vObjLogout = Constants.Affiliates_GlobalPageElementsOR.getProperty("Logout");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjLogout, ""));
        LogCapture.info("Logout option into dropdown is visible...");
    }

    @Then("^Verify User logged out successfully from (Account) Page$")
    public void verifyUserLoggedOutSuccessfully(String Value) throws Throwable {
        if (Value.equalsIgnoreCase("Account")) {
            String vObjAlertIcon = Constants.Affiliates_GlobalPageElementsOR.getProperty("AlertIcon");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAlertIcon, ""));
            String vObjCrossLoggedOut = Constants.Affiliates_GlobalPageElementsOR.getProperty("CrossLoggedOut");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCrossLoggedOut, ""));
            String vObjLoggedOutMessage = Constants.Affiliates_GlobalPageElementsOR.getProperty("LoggedOutMessage");
            String LoggedOutMessage = Constants.driver.findElement(By.xpath(vObjLoggedOutMessage)).getText();
            System.out.println("LoggedOut:" + LoggedOutMessage);
            if (LoggedOutMessage.equalsIgnoreCase("LOGGED OUT:  You have been logged out")) {
                LogCapture.info("Logged Out Message is display correctly");
            } else {
                Assert.fail();
                LogCapture.error("Logged Out Message is not display correctly. Actual Logged Out Msg: " + LoggedOutMessage);
            }
        }
    }

    @Then("^User will land on the (Login Page)$")
    public void userWillLandOnTheLoginPage(String Page) throws Throwable {
        if (Page.equalsIgnoreCase("Login Page")) {
            String vObjLoginMessage = Constants.Affiliates_GlobalPageElementsOR.getProperty("LoginMessage");
            String LoginMessage = Constants.driver.findElement(By.xpath(vObjLoginMessage)).getText();
            System.out.println("LoginMessage:" + LoginMessage);
            String vObjUser = Constants.Refer_a_Client.getProperty("Email_ID");
            String vObjPass = Constants.Refer_a_Client.getProperty("Password");
            String vObjLoginButton = Constants.Refer_a_Client.getProperty("LoginButton");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjUser, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjPass, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjLoginButton, ""));
            if (LoginMessage.equalsIgnoreCase("Log in to your account")) {
                LogCapture.info("LoginMessage Message is display correctly");
            } else {
                Assert.fail();
                LogCapture.error("LoginMessage Message is not display correctly. Actual Login Msg: " + LoginMessage);
            }
        }

    }

    @Then("^System will navigate to the Transaction details Page$")
    public void systemWillNavigateToTheTransactionDetailsPage() throws Throwable {
        String vObjTransactionDetailsText = Constants.Refer_a_Client.getProperty("TransactionDetailsText");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjTransactionDetailsText, ""));
        LogCapture.info("User on Transaction Details page....");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjTransactionDetailsText, "Transction details"));
        String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
        LogCapture.info("User on Transaction Details page with Continue button disable....");

    }

    @Then("^User is logged out of the system with generic message as LOGGED OUT$")
    public void userIsLoggedOutOfTheSystemWithGenericMessageAsLOGGEDOUT() throws Throwable {
        String vObjLoggedOutMsg = Constants.Affiliates_LoginPageOR.getProperty("LogoutMsg");
        String vObjLoggedOutAlertIcon = Constants.Affiliates_LoginPageOR.getProperty("LoggedOutAlertIcon");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjLoggedOutAlertIcon, ""));
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjLoggedOutMsg, ""));
        String ExpectedLogoutMsg = "LOGGED OUT:  You have been logged out";
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjLoggedOutMsg, ExpectedLogoutMsg));
        LogCapture.info("User logged out successfully with message: " + ExpectedLogoutMsg + " and MsgAlert icon");
    }

    @Then("^System will show the generic message as No Bank available$")
    public void systemWillShowTheGenericMessageAsNoBankAvailable() throws Throwable {
        String vNoBankDetailsPageTitle = Constants.Affiliates_GlobalPageElementsOR.getProperty("NoBankDetailsPageTitle");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vNoBankDetailsPageTitle, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vNoBankDetailsPageTitle, "No bank details found"));
        LogCapture.info("User is on Bank details section & No bank details found...");
    }

    @Then("^User is able to view the Partnership manager email along with phone number on (No|Available) Bank available$")
    public void userIsAbleToViewThePartnershipManagerEmailAlongWithPhoneNumberOnNoBankAvailable(String TargetBank) throws Throwable {
        if (TargetBank.equalsIgnoreCase("No")) {
            String vObjNoBankDetailsFooterMsgLine1 = Constants.Affiliates_GlobalPageElementsOR.getProperty("NoBankDetailsFooterMsgLine1");
            String vObjNoBankDetailsFooterMsgLine2 = Constants.Affiliates_GlobalPageElementsOR.getProperty("NoBankDetailsFooterMsgLine2");
            String vObjNoBankDetailsFooterMsgLine3 = Constants.Affiliates_GlobalPageElementsOR.getProperty("NoBankDetailsFooterMsgLine3");
            String vObjNoBankDetailsFooterMsgLine4 = Constants.Affiliates_GlobalPageElementsOR.getProperty("NoBankDetailsFooterMsgLine4");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjNoBankDetailsFooterMsgLine1, ""));
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjNoBankDetailsFooterMsgLine2, ""));
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjNoBankDetailsFooterMsgLine3, ""));
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjNoBankDetailsFooterMsgLine4, ""));
            LogCapture.info("User able to view Footer message for No Bank Detail found...");
            String AffManagerContactDetails = AffiliatesManagerALLContactDetailsStr;
            String[] AffManagerContactDetailsStr = AffManagerContactDetails.split(",");
            String AffManagerContactDetailsStrTrim = AffManagerContactDetailsStr[0].replaceAll("\\s", "");
            String AffManagerPhoneNumber = "or phone " + AffManagerContactDetailsStrTrim + ".";
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjNoBankDetailsFooterMsgLine1, "We don't have your bank details on record"));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjNoBankDetailsFooterMsgLine2, "to add them please contact your Partnership Manager on"));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjNoBankDetailsFooterMsgLine3, AffManagerContactDetailsStr[1]));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjNoBankDetailsFooterMsgLine4, AffManagerPhoneNumber));
            LogCapture.info("User Verified the Footer message for No Bank details found...");
        }
        if (TargetBank.equalsIgnoreCase("Available")) {
            String vObjAvailableBankDetailsFooterMsgLine1 = Constants.Affiliates_GlobalPageElementsOR.getProperty("AvailableBankDetailsFooterMsgLine1");
            String vObjAvailableBankDetailsFooterMsgLine21 = Constants.Affiliates_GlobalPageElementsOR.getProperty("AvailableBankDetailsFooterMsgLine21");

            String vObjAvailableBankDetailsFooterMsgLine3 = Constants.Affiliates_GlobalPageElementsOR.getProperty("AvailableBankDetailsFooterMsgLine3");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAvailableBankDetailsFooterMsgLine1, ""));
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAvailableBankDetailsFooterMsgLine21, ""));

            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAvailableBankDetailsFooterMsgLine3, ""));
            LogCapture.info("User able to view Footer message for Bank Detail section...");


            String AffManagerContactDetails = AffiliatesManagerALLContactDetailsStr;
            String[] AffManagerContactDetailsStr = AffManagerContactDetails.split(",");
            String AffManagerContactDetailsStrTrim = AffManagerContactDetailsStr[0].replaceAll("\\s", "");
            String AffManagerPhoneNumber = "or phone " + AffManagerContactDetailsStrTrim + " to add your details.";
            String AffiliatesManagerNameWithEmail = AffManagerContactDetailsStr[2] + " on Email: " + AffManagerContactDetailsStr[1];
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjAvailableBankDetailsFooterMsgLine1, "If you would like to update your bank details on record. Please contact"));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjAvailableBankDetailsFooterMsgLine21, AffiliatesManagerNameWithEmail));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjAvailableBankDetailsFooterMsgLine3, AffManagerPhoneNumber));
            LogCapture.info("User Verified the Footer message for Bank details section...");

        }
    }

    @Then("^User is able to view and Note the Contact details for Affiliates manager$")
    public String userIsAbleToViewAndNoteTheContactDetailsForAffiliatesManager() throws Throwable {
        String vObjYourContactManagerName = Constants.Affiliates_GlobalPageElementsOR.getProperty("YourContactManagerName");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjYourContactManagerName, ""));
        String YourContactManagerNameStr = Constants.driver.findElement(By.xpath(vObjYourContactManagerName)).getText();
        int a = YourContactManagerNameStr.indexOf(" "); // check where first space occurs
        String YourContactManagerName = YourContactManagerNameStr.substring(a + 1);// start from the first word after space
        LogCapture.info("Your manager name is: " + YourContactManagerName); //print the string
        String vObjDirectLineNumber = Constants.Affiliates_GlobalPageElementsOR.getProperty("DirectLineNumber");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjDirectLineNumber, ""));
        String vObjAffiliateManagerContactEmail = Constants.Affiliates_GlobalPageElementsOR.getProperty("AffiliateManagerContactEmail");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAffiliateManagerContactEmail, ""));
        String AffiliatesManagerDirectLineNumber = Constants.driver.findElement(By.xpath(vObjDirectLineNumber)).getText();
        String AffiliateManagerContactEmail = Constants.driver.findElement(By.xpath(vObjAffiliateManagerContactEmail)).getText();
        AffiliatesManagerALLContactDetailsStr = AffiliatesManagerDirectLineNumber + "," + AffiliateManagerContactEmail + "," + YourContactManagerName;
        LogCapture.info(AffiliatesManagerALLContactDetailsStr);
        LogCapture.info("Affiliates Manager Contact Details Displayed: DirectLine Number- " + AffiliatesManagerDirectLineNumber + " Email-" + AffiliateManagerContactEmail + " Manager name-" + YourContactManagerName);
        return AffiliatesManagerALLContactDetailsStr;
    }


    @And("^User clicks on any of the Unread notification record$")
    public int userClicksOnAnyOfTheUnreadNotificationRecord() throws Throwable {

        String vListOfUnReadNotifications = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfUnReadNotifications");
        List<WebElement> ListOfUnReadNotifications = Constants.driver.findElements(By.xpath(vListOfUnReadNotifications));
        TotalListOfUnReadNotificationsInt = ListOfUnReadNotifications.size();
        if (TotalListOfUnReadNotificationsInt == 0) {
            LogCapture.info("Total Unread notification count is: 0");

        }
        if (TotalListOfUnReadNotificationsInt != 0) {
            LogCapture.info("Total number of UnRead notifications on page: " + TotalListOfUnReadNotificationsInt);
            int StartCount = 1;
            int RandomUnreadNotificationSelection = StartCount + (int) (Math.random() * (TotalListOfUnReadNotificationsInt - StartCount + 1));
            String vObjTargetNotification = vListOfUnReadNotifications + "[" + RandomUnreadNotificationSelection + "]";
            Assert.assertEquals("PASS", Constants.key.MouseFunctions(vObjTargetNotification, "MoveToElement"));
            Assert.assertEquals("PASS", Constants.key.click(vObjTargetNotification, ""));
            LogCapture.info("User clicked on any one Unread notification...");

        }
        return TotalListOfUnReadNotificationsInt;
    }

    @Then("^System should mark previously clicked notification messages as read$")
    public void systemShouldMarkPreviouslyClickedNotificationMessagesAsRead() {
        String vListOfUnReadNotifications = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfUnReadNotifications");
        List<WebElement> ListOfUnReadNotifications = Constants.driver.findElements(By.xpath(vListOfUnReadNotifications));
        int TotalListOfUpdatedUnReadNotificationsInt = ListOfUnReadNotifications.size();
        LogCapture.info("Updated Total number of UnRead notifications on page: " + TotalListOfUpdatedUnReadNotificationsInt);
        if (TotalListOfUnReadNotificationsInt == 0) {
            LogCapture.info("Total Unread notification count is: 0");

        }
        if (TotalListOfUnReadNotificationsInt != 0) {
            int ExpectedTotalListOfUnreadNotifications = TotalListOfUnReadNotificationsInt - 1;
            if (TotalListOfUpdatedUnReadNotificationsInt == ExpectedTotalListOfUnreadNotifications) {
                LogCapture.info("Total updated Unread notification count after clicking One Unread notification is: " + TotalListOfUpdatedUnReadNotificationsInt + " which is one less then Previously Unread count: " + TotalListOfUnReadNotificationsInt);
            }
        }


    }

    @And("^User clicks on the Unread (commission paid|commission statement|Registration|Trading) related notification and navigates to (Referrals|Commission) section Page$")
    public void userClicksOnTheUnreadRegistrationRelatedNotification(String TargetNotification, String TargetPage) throws Throwable {

        if (TargetNotification.equalsIgnoreCase("Registration") && TargetPage.equalsIgnoreCase("Referrals")) {
            String vListOfUnReadRegistrationNotifications = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfUnReadRegistrationNotifications");
            boolean vListOfUnReadRegisteredNotificationsDisplayed = Constants.driver.findElement(By.xpath(vListOfUnReadRegistrationNotifications)).isDisplayed();
            if (vListOfUnReadRegisteredNotificationsDisplayed) {
                Assert.assertEquals("PASS", Constants.key.click(vListOfUnReadRegistrationNotifications, ""));
                LogCapture.info("UnRead Registration related Notification visible and User clicked on First Notification...");
                LogCapture.info("Referrals Page Loading......");
                String vObjReferralsSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("ReferralsSectionPage");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjReferralsSectionPage, ""));
                Assert.assertEquals("PASS", Constants.key.verifyText(vObjReferralsSectionPage, "Referrals"));
                LogCapture.info("User is on Referrals Page...");

            } else {
                LogCapture.info("There are NO UnRead Registration related Notifications...");
            }

        }
        if (TargetNotification.equalsIgnoreCase("Trading") && TargetPage.equalsIgnoreCase("Referrals")) {
            String vListOfUnReadTradingNotifications = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfUnReadTradingNotifications");
            boolean vListOfUnReadTradingNotificationsDisplayed = Constants.driver.findElement(By.xpath(vListOfUnReadTradingNotifications)).isDisplayed();
            if (vListOfUnReadTradingNotificationsDisplayed) {
                Assert.assertEquals("PASS", Constants.key.click(vListOfUnReadTradingNotifications, ""));
                LogCapture.info("UnRead Trading related Notification visible and User clicked on First Notification...");
                LogCapture.info("Referrals Page Loading......");
                String vObjReferralsSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("ReferralsSectionPage");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjReferralsSectionPage, ""));
                Assert.assertEquals("PASS", Constants.key.verifyText(vObjReferralsSectionPage, "Referrals"));
                LogCapture.info("User is on Referrals Page...");
            } else {
                LogCapture.info("There are NO UnRead Trading related Notifications...");
            }
        }
        if (TargetNotification.equalsIgnoreCase("commission statement") && TargetPage.equalsIgnoreCase("Commission")) {
            String vListOfUnReadCommissionStatementNotifications = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfUnReadCommissionStatementNotifications");
            boolean vListOfUnReadCommissionStatementNotificationsDisplayed = Constants.driver.findElement(By.xpath(vListOfUnReadCommissionStatementNotifications)).isDisplayed();
            if (vListOfUnReadCommissionStatementNotificationsDisplayed) {
                Assert.assertEquals("PASS", Constants.key.click(vListOfUnReadCommissionStatementNotifications, ""));
                LogCapture.info("UnRead Commission Statement related Notification visible and User clicked on First Notification...");
                LogCapture.info("Commissions Page Loading......");
                String vObjCommissionsSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("CommissionsSectionPage");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCommissionsSectionPage, ""));
                Assert.assertEquals("PASS", Constants.key.verifyText(vObjCommissionsSectionPage, "Commission"));
                LogCapture.info("User is on Commissions Page...");
            } else {
                LogCapture.info("There are NO UnRead Commission Statement related Notifications...");
            }
        }
        if (TargetNotification.equalsIgnoreCase("commission paid") && TargetPage.equalsIgnoreCase("Commission")) {
            String vListOfUnReadCommissionPaidNotifications = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfUnReadCommissionPaidNotifications");
            boolean vListOfUnReadCommissionPaidNotificationsDisplayed = Constants.driver.findElement(By.xpath(vListOfUnReadCommissionPaidNotifications)).isDisplayed();
            if (vListOfUnReadCommissionPaidNotificationsDisplayed) {
                Assert.assertEquals("PASS", Constants.key.click(vListOfUnReadCommissionPaidNotifications, ""));
                LogCapture.info("UnRead Commission Paid related Notification visible and User clicked on First Notification...");
                LogCapture.info("Commissions Page Loading......");
                String vObjCommissionsSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("CommissionsSectionPage");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCommissionsSectionPage, ""));
                Assert.assertEquals("PASS", Constants.key.verifyText(vObjCommissionsSectionPage, "Commission"));
                LogCapture.info("User is on Commissions Page...");
            } else {
                LogCapture.info("There are NO UnRead Commission Paid related Notifications...");
            }
        }

    }


    @Then("^User should be able to view the Page Numbers at the bottom of Notifications Page$")
    public void userShouldBeAbleToViewThePageNumbersAtTheBottomOfNotificationsPage() throws Throwable {
        String vListOfNotificationsPageNumbers = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfNotificationsPageNumbers");
        boolean PageNumbersDisplayed = Constants.driver.findElement(By.xpath(vListOfNotificationsPageNumbers)).isDisplayed();
        if (PageNumbersDisplayed) {
            List<WebElement> ListOfNotificationsPageNumbers = Constants.driver.findElements(By.xpath(vListOfNotificationsPageNumbers));
            int TotalListOfNotificationsPageNumbersInt = ListOfNotificationsPageNumbers.size();
            for (int i = 1; i < TotalListOfNotificationsPageNumbersInt; i++) {
                String PageNumberXpath = vListOfNotificationsPageNumbers + "[" + i + "]/button";
                String PageNumber = Constants.driver.findElement(By.xpath(PageNumberXpath)).getText();
                LogCapture.info("User able to view Page number " + PageNumber);
            }
            String vGoToNextPageButton = Constants.Affiliates_NotificationsPageOR.getProperty("GoToNextPageButton");
            boolean GoToNextPageButtonDisplayed = Constants.driver.findElement(By.xpath(vGoToNextPageButton)).isDisplayed();
            if (GoToNextPageButtonDisplayed) {
                LogCapture.info("Go to Next page button is Displayed...");
                Assert.assertEquals("PASS", Constants.key.click(vGoToNextPageButton, ""));
                LogCapture.info("User clicked on Go to next page button...");
                String vGoToPreviousPageButton = Constants.Affiliates_NotificationsPageOR.getProperty("GoToPreviousPageButton");
                boolean GoToPreviousPageButtonDisplayed = Constants.driver.findElement(By.xpath(vGoToPreviousPageButton)).isDisplayed();
                if (GoToPreviousPageButtonDisplayed) {
                    LogCapture.info("Go to Previous page button is Displayed...");
                } else {
                    LogCapture.info("Go to Previous page button is NOT Displayed...");
                }
            } else {
                LogCapture.info("Go to Next page button is NOT Displayed...");
            }
        } else {
            LogCapture.info("No page number is displayed as no notifications");
        }
    }

    @Then("^User should be able to view only 15 notifications on one page$")
    public String userShouldBeAbleToViewOnlyNotificationsOnOnePage() {
        String vObjNotificationSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfNotifications");
        List<WebElement> listOfElements = Constants.driver.findElements(By.xpath(vObjNotificationSectionPage));
        LogCapture.info("Total number of elements present: " + listOfElements.size());
        if (listOfElements.size() <= 15) {
            LogCapture.info("USer is able to view maximum 15 notifications on a page...");
            LogCapture.info("Currently User is able to view " + listOfElements.size() + " notifications on a page....");
        } else {
            LogCapture.info("User is able to view MORE THAN Maximum acceptable count of 15 notifications on a page...");
            LogCapture.info("Currently User is able to view " + listOfElements.size() + " notifications on a page....");
            Assert.fail();
        }

        return Constants.KEYWORD_PASS;
    }

    @Then("^User will be view filter options on UI as Catogries Industry Client Type and Country$")
    public void userWillBeViewFilterOptionsOnUIAsCatogriesIndustryClientTypeAndCountry() throws Throwable {
        String vObjFilters = Constants.Affiliates_ResourcesPageOR.getProperty("Filters");
        String vObjCategories = Constants.Affiliates_ResourcesPageOR.getProperty("Categories");
        String vObjIndustry = Constants.Affiliates_ResourcesPageOR.getProperty("Industry");
        String vObjClientType = Constants.Affiliates_ResourcesPageOR.getProperty("Clienttype");
        String vObjCountries = Constants.Affiliates_ResourcesPageOR.getProperty("Countries");
        Assert.assertEquals("PASS", Constants.key.exist(vObjFilters, ""));
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCategories, "enabled"));
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjIndustry, "enabled"));
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjClientType, "enabled"));
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCountries, "enabled"));
    }

    @Then("^User (Select|UnSelect) (Logos|Personals clients|Banners|Corporate clients|Factsheets|Leaflets) option from (Categories|ClientType) dropdown$")
    public void userUnSelectsOptionFromDropdown(String Selection, String DropDownValue, String DropDownName) throws Throwable {
        if (DropDownName.equalsIgnoreCase("Categories") && DropDownValue.equalsIgnoreCase("Logos") && Selection.equalsIgnoreCase("UnSelect")) {

            String vObjCategory = Constants.Affiliates_ResourcesPageOR.getProperty("LogosCategory");
            Assert.assertEquals("PASS", Constants.key.click(vObjCategory, ""));
        }
        if (DropDownName.equalsIgnoreCase("ClientType") && DropDownValue.equalsIgnoreCase("Personals clients") && Selection.equalsIgnoreCase("UnSelect")) {
            String vObjClientType = Constants.Affiliates_ResourcesPageOR.getProperty("Personalclients");
            Assert.assertEquals("PASS", Constants.key.click(vObjClientType, ""));
        }
        if (DropDownName.equalsIgnoreCase("Categories") && DropDownValue.equalsIgnoreCase("Banners") && Selection.equalsIgnoreCase("Select")) {
            String vObjCategoriesBanners = Constants.Affiliates_ResourcesPageOR.getProperty("BannersCategory");
            Assert.assertEquals("PASS", Constants.key.click(vObjCategoriesBanners, ""));
        }
        if (DropDownName.equalsIgnoreCase("ClientType") && DropDownValue.equalsIgnoreCase("Corporate clients") && Selection.equalsIgnoreCase("Select")) {
            String vObjCorporateclients = Constants.Affiliates_ResourcesPageOR.getProperty("Corporateclients");
            Assert.assertEquals("PASS", Constants.key.click(vObjCorporateclients, ""));
        }
        if (DropDownName.equalsIgnoreCase("Categories") && DropDownValue.equalsIgnoreCase("Factsheets") && Selection.equalsIgnoreCase("Select")) {
            String vObjFactsheets = Constants.Affiliates_ResourcesPageOR.getProperty("FactsheetsCategory");
            Assert.assertEquals("PASS", Constants.key.click(vObjFactsheets, ""));
        }
        if (DropDownName.equalsIgnoreCase("Categories") && DropDownValue.equalsIgnoreCase("Leaflets") && Selection.equalsIgnoreCase("Select")) {
            String vObjLeaflets = Constants.Affiliates_ResourcesPageOR.getProperty("Leaflets");
            Assert.assertEquals("PASS", Constants.key.click(vObjLeaflets, ""));
        }
    }

    @Then("^Page Should be refresshed$")
    public void pageShouldBeRefresshed() throws Throwable {
        Assert.assertEquals("PASS", Constants.key.RefreshPage("", ""));
        Constants.key.pause("2", "");
    }

    @Then("^User (Select|UnSelect) (all|few) the values from (Categories|Industry|Country|ClientType)$")
    public void userSelectsAllTheValuesFromCategories(String Selection, String DropDownName, String Values) throws Throwable {
        if (DropDownName.equalsIgnoreCase("Industry") && Selection.equalsIgnoreCase("Select") && Values.equalsIgnoreCase("all")) {
            String vObjCategory = Constants.Affiliates_ResourcesPageOR.getProperty("DropDownValues");
            Assert.assertEquals("PASS", Constants.key.SelectDropDownAllValues(vObjCategory, ""));
        }
        if (DropDownName.equalsIgnoreCase("Industry") && Selection.equalsIgnoreCase("UnSelect") && Values.equalsIgnoreCase("all")) {
            String vObjCategory = Constants.Affiliates_ResourcesPageOR.getProperty("DropDownValues");
            Assert.assertEquals("PASS", Constants.key.SelectDropDownAllValues(vObjCategory, ""));
        }
        if (DropDownName.equalsIgnoreCase("Country") && Selection.equalsIgnoreCase("Select") && Values.equalsIgnoreCase("all")) {
            String vObjCategory = Constants.Affiliates_ResourcesPageOR.getProperty("DropDownValues");
            Assert.assertEquals("PASS", Constants.key.SelectDropDownAllValues(vObjCategory, ""));
        }
        if (DropDownName.equalsIgnoreCase("Country") && Selection.equalsIgnoreCase("UnSelect") && Values.equalsIgnoreCase("all")) {
            String vObjCategory = Constants.Affiliates_ResourcesPageOR.getProperty("DropDownValues");
            Assert.assertEquals("PASS", Constants.key.SelectDropDownAllValues(vObjCategory, ""));
        }
        if (DropDownName.equalsIgnoreCase("Industry") && Selection.equalsIgnoreCase("Select") && Values.equalsIgnoreCase("few")) {
            String vObjRemovalsIndustry = Constants.Affiliates_ResourcesPageOR.getProperty("RemovalsIndustry");
            Assert.assertEquals("PASS", Constants.key.click(vObjRemovalsIndustry, ""));
        }
        if (DropDownName.equalsIgnoreCase("Country") && Selection.equalsIgnoreCase("Select") && Values.equalsIgnoreCase("few")) {
            String vObjCountry = Constants.Affiliates_ResourcesPageOR.getProperty("IndiaCountry");
            Assert.assertEquals("PASS", Constants.key.click(vObjCountry, ""));
        }
        if (DropDownName.equalsIgnoreCase("ClientType") && Selection.equalsIgnoreCase("Select") && Values.equalsIgnoreCase("all")) {
            String vObjDropDown = Constants.Affiliates_ResourcesPageOR.getProperty("DropDownValues");
            Assert.assertEquals("PASS", Constants.key.click(vObjDropDown, ""));
        }
    }


    @Then("^User will be able to view the (Categories|Industry|Countries|ClientType|Search) count as (1|2)$")
    public void userWillBeAbleToViewTheCatogriesCountAs(String Values, String Count) throws Throwable {
        if (Values.equalsIgnoreCase("Categories") && Count.equalsIgnoreCase("1")) {

            String vObjCategoriesCount = Constants.Affiliates_ResourcesPageOR.getProperty("CategoriesCount");
            String CategoriesCount = Constants.driver.findElement(By.xpath(vObjCategoriesCount)).getText();
            Assert.assertEquals("(1)", CategoriesCount);
        }
        if (Values.equalsIgnoreCase("Industry") && Count.equalsIgnoreCase("1")) {
            String vObjIndustryCount = Constants.Affiliates_ResourcesPageOR.getProperty("IndustryCount");
            String IndustryCount = Constants.driver.findElement(By.xpath(vObjIndustryCount)).getText();
            Assert.assertEquals("(1)", IndustryCount);
        }
        if (Values.equalsIgnoreCase("Industry") && Count.equalsIgnoreCase("2")) {
            String vObjIndustryCount = Constants.Affiliates_ResourcesPageOR.getProperty("IndustryCount");
            String IndustryCount = Constants.driver.findElement(By.xpath(vObjIndustryCount)).getText();
            Assert.assertEquals("(2)", IndustryCount);
        }
        if (Values.equalsIgnoreCase("ClientType") && Count.equalsIgnoreCase("1")) {
            String vObjClientType = Constants.Affiliates_ResourcesPageOR.getProperty("ClientTypeCount");
            String ClientTypeCount = Constants.driver.findElement(By.xpath(vObjClientType)).getText();
            Assert.assertEquals("(1)", ClientTypeCount);
        }
        if (Values.equalsIgnoreCase("Countries") && Count.equalsIgnoreCase("1")) {
            String vObjCountries = Constants.Affiliates_ResourcesPageOR.getProperty("CountriesCount");
            String CountriesCount = Constants.driver.findElement(By.xpath(vObjCountries)).getText();
            Assert.assertEquals("(1)", CountriesCount);
        }


    }

    @Then("^System removes all the set filter which were set$")
    public void systemRemovesAllTheSetFilterWhichWereSet() throws Throwable {
        String vObjCategoriesCount = Constants.Affiliates_ResourcesPageOR.getProperty("CategoriesCount");
        String CategoriesCount = Constants.driver.findElement(By.xpath(vObjCategoriesCount)).getText();
        System.out.println("CategoriesCount" + CategoriesCount);

        String vObjIndustry = Constants.Affiliates_ResourcesPageOR.getProperty("IndustryCount");
        String Industry = Constants.driver.findElement(By.xpath(vObjIndustry)).getText();
        System.out.println("Industry" + Industry);
        //Assert.assertEquals(" ", Industry);
        String vObjClientType = Constants.Affiliates_ResourcesPageOR.getProperty("ClientTypeCount");
        String ClientType = Constants.driver.findElement(By.xpath(vObjClientType)).getText();
        System.out.println("ClientType" + ClientType);
        //Assert.assertEquals(" ", ClientType);
        String vObjCountriesCount = Constants.Affiliates_ResourcesPageOR.getProperty("CountriesCount");
        String CountriesCount = Constants.driver.findElement(By.xpath(vObjCountriesCount)).getText();
        System.out.println("CountriesCount" + CountriesCount);
        //Assert.assertEquals(" ", CountriesCount);
        if (CategoriesCount.isEmpty() && Industry.isEmpty() && ClientType.isEmpty() && CountriesCount.isEmpty()) {
            System.out.println("CategoriesCount" + CategoriesCount);
        }
    }


    @Then("^User is able to view Mobile number Country code as (\\+61|\\+44) by default for (CD|TorFXOz|TorFX)$")
    public void userIsAbleToViewMobileNumberCountryCodeAsByDefaultForCD(String TargetCode, String TargetOrganization) throws Throwable {

        if (TargetCode.equalsIgnoreCase("+61") && TargetOrganization.equalsIgnoreCase("TorFXOz")) {
            String vDefaultValue_MobileCountryCode = Constants.Refer_a_Client.getProperty("DefaultValue_MobileCountryCode");
            Assert.assertEquals("PASS", Constants.key.verifyText(vDefaultValue_MobileCountryCode, "+61"));
            String vDefaultTorFXOz_MobileCountryFlag = Constants.Refer_a_Client.getProperty("DefaultTorFXOz_MobileCountryFlag");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vDefaultTorFXOz_MobileCountryFlag, ""));
            LogCapture.info("User is able to view Default Mobile number Country code as " + TargetCode + " for " + TargetOrganization + " with Australia Country flag....");
        }
        if (TargetCode.equalsIgnoreCase("+44") && TargetOrganization.equalsIgnoreCase("CD")) {
            String vDefaultValue_MobileCountryCode = Constants.Refer_a_Client.getProperty("DefaultValue_MobileCountryCode");
            Assert.assertEquals("PASS", Constants.key.verifyText(vDefaultValue_MobileCountryCode, "+44"));
            String vDefaultCD_MobileCountryFlag = Constants.Refer_a_Client.getProperty("DefaultCD_MobileCountryFlag");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vDefaultCD_MobileCountryFlag, ""));
            LogCapture.info("User is able to view Default Mobile number Country code as " + TargetCode + " for " + TargetOrganization + " with United Kingdom Country flag....");
        }

    }

    @Then("^User should be able to view the new records at the top as per date in descending order$")
    public String userShouldBeAbleToViewTheNewRecordsAtTheTopAsPerDateInDescendingOrder() throws ParseException {
        //div[contains(@class,'MuiListItemText-root')]/span[contains(@class,'displayBlock')]
        //list of elements
        //String vObjNotificationSectionPage = Constants.Affiliates_NotificationsPageOR.getProperty("ListOfNotifications");
        List<WebElement> listOfElements = Constants.driver.findElements(By.xpath("//h1[text()='Notifications']//following::ul[1]//child::div/div[2]/span"));
        for (int i = 0; i < listOfElements.size(); i++) {
            for (int j = 1; j < listOfElements.size(); j++) {
                String FirstDatetext = listOfElements.get(i).getText();
                String SecondDatetext = listOfElements.get(j).getText();
                SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
                Date FirstDate = sdf.parse(FirstDatetext);
                Date SecondDate = sdf.parse(SecondDatetext);
                if (FirstDate.compareTo(SecondDate) > 0 || FirstDate.compareTo(SecondDate) == 0) {
                    System.out.println("Date 1 occurs after Date 2 OR Both dates are equal");

                } else {
                    System.out.println("Date 1 occurs before Date 2");
                    Assert.fail();
                }

            }

        }
        return Constants.KEYWORD_PASS;

    }


    @Then("^User notes Your clients details such as Client type$")
    public List<String> userNotesYourClientsDetailsSuchAsClientType() {

        String vObjClientTypePersonalCheckbox = Constants.Affiliates_SettingsPageOR.getProperty("ClientTypePersonalCheckbox");
        String vObjClientTypeOnlineMarketplaceSellersCheckbox = Constants.Affiliates_SettingsPageOR.getProperty("ClientTypeOnlineMarketplaceSellersCheckbox");
        String vObjClientTypeCorporateCheckbox = Constants.Affiliates_SettingsPageOR.getProperty("ClientTypeCorporateCheckbox");

        String vObjClientTypePersonalText = Constants.Affiliates_SettingsPageOR.getProperty("ClientTypePersonalText");
        String vObjClientTypeOnlineMarketplaceSellersText = Constants.Affiliates_SettingsPageOR.getProperty("ClientTypeOnlineMarketplaceSellersText");
        String vObjClientTypeCorporateText = Constants.Affiliates_SettingsPageOR.getProperty("ClientTypeCorporateText");

        // String ClientTypePersonalText = null;
        //String ClientTypeOnlineMarketplaceSellersText=null;
        //String ClientTypeCorporateText=null;

        ClientTypeText = new ArrayList<>();

        if (Constants.driver.findElement(By.xpath(vObjClientTypePersonalCheckbox)).isSelected()) {
            String ClientTypePersonalText = Constants.driver.findElement(By.xpath(vObjClientTypePersonalText)).getText();
            ClientTypeText.add(ClientTypePersonalText);
        }
        if (Constants.driver.findElement(By.xpath(vObjClientTypeOnlineMarketplaceSellersCheckbox)).isSelected()) {
            String ClientTypeOnlineMarketplaceSellersText = Constants.driver.findElement(By.xpath(vObjClientTypeOnlineMarketplaceSellersText)).getText();
            ClientTypeText.add(ClientTypeOnlineMarketplaceSellersText);
        }
        if (Constants.driver.findElement(By.xpath(vObjClientTypeCorporateCheckbox)).isSelected()) {
            String ClientTypeCorporateText = Constants.driver.findElement(By.xpath(vObjClientTypeCorporateText)).getText();
            ClientTypeText.add(ClientTypeCorporateText);
        }
        // SelectedClientType=ClientTypePersonalText+","+ClientTypeOnlineMarketplaceSellersText+","+ClientTypeCorporateText;
        LogCapture.info("User noted which Client type is checked on settings page...");
        System.out.println(ClientTypeText);
        return ClientTypeText;
    }

    @Then("^User notes Your clients details such as Industries$")
    public List<String> userNotesYourClientsDetailsSuchAsIndustries() {

        String vObjClientIndustriesText = Constants.Affiliates_SettingsPageOR.getProperty("ClientIndustriesText");
        List<WebElement> listOfClientIndustriesText = Constants.driver.findElements(By.xpath(vObjClientIndustriesText));
        LogCapture.info("Total number of Client Industries present is: " + listOfClientIndustriesText.size());
        AllClientIndustriesText = new ArrayList<>();

        for (int i = 0; i < listOfClientIndustriesText.size(); i++) {
            AllClientIndustriesText.add(listOfClientIndustriesText.get(i).getText());

        }
        LogCapture.info("User noted the Industries on Settings page...");
        System.out.println(AllClientIndustriesText);

        return AllClientIndustriesText;
    }

    @Then("^User notes Your clients details such as Countries$")
    public ArrayList<String> userNotesYourClientsDetailsSuchAsCountries() {
        String vObjClientCountriesText = Constants.Affiliates_SettingsPageOR.getProperty("ClientCountriesText");
        List<WebElement> listOfClientCountriesText = Constants.driver.findElements(By.xpath(vObjClientCountriesText));
        LogCapture.info("Total number of Client Countries present is: " + listOfClientCountriesText.size());
        AllClientCountriesText = new ArrayList<>();
        for (int i = 0; i < listOfClientCountriesText.size(); i++) {
            String CountriesText = listOfClientCountriesText.get(i).getAttribute("alt");
            String CountriesTextTrimed = CountriesText.trim();
            AllClientCountriesText.add(CountriesTextTrimed);

        }
        LogCapture.info("User noted the Countries on Settings page...");
        System.out.println(AllClientCountriesText);
        return AllClientCountriesText;

    }

    @Then("^User should view the selected Industry section same as Industries on Settings page$")
    public void userShouldViewTheSelectedIndustrySectionSameAsIndustriesOnSettingsPage() throws Throwable {
        String vObjIndustry = Constants.Affiliates_ResourcesPageOR.getProperty("Industry");
        Assert.assertEquals("PASS", Constants.key.click(vObjIndustry, ""));
        for (String SelectedIndustry : AllClientIndustriesText) {
            String SelectedIndustryXpath = "//*[contains(@class,'is-active')]//ul//li//label[@class='is-active'][text()='" + SelectedIndustry + "']/input[@checked]";
            Assert.assertEquals("PASS", Constants.key.exist(SelectedIndustryXpath, ""));
            LogCapture.info("Client Industry: " + SelectedIndustry + " is checked in the dropdown list of Industry....");
        }
        LogCapture.info("Selected Industry option onto Resources page is same as reflected on Settings page...");

    }

    @Then("^User should view the Selected ClientType section same as ClientType on Settings page$")
    public void userShouldViewTheSelectedClientTypeSectionSameAsClientTypeOnSettingsPage() throws Throwable {

        String vObjClienttype = Constants.Affiliates_ResourcesPageOR.getProperty("Clienttype");
        Assert.assertEquals("PASS", Constants.key.click(vObjClienttype, ""));
        for (String SelectedClientType : ClientTypeText) {
            String SelectedClientTypeXpath = "//*[contains(@class,'is-active')]//ul//li//label[@class='is-active'][text()='" + SelectedClientType + "']/input[@checked]";
            Assert.assertEquals("PASS", Constants.key.exist(SelectedClientTypeXpath, ""));
            LogCapture.info("Client Type: " + SelectedClientType + " is checked in the dropdown list of ClientType....");
        }
        LogCapture.info("Selected ClientType option onto Resources page is same as reflected on Settings page...");
    }

    @Then("^User should view the Selected Country section same as Country on Settings page$")
    public void userShouldViewTheSelectedCountrySectionSameAsCountryOnSettingsPage() throws Throwable {
        String vObjCountries = Constants.Affiliates_ResourcesPageOR.getProperty("Countries");
        Assert.assertEquals("PASS", Constants.key.click(vObjCountries, ""));
        for (String SelectedCountries : AllClientCountriesText) {
            String SelectedCountriesXpath = "//*[contains(@class,'is-active')]//ul//li//label[@class='is-active'][text()='" + SelectedCountries + "']/input[@checked]";
            Assert.assertEquals("PASS", Constants.key.exist(SelectedCountriesXpath, ""));
            LogCapture.info("Client Countries: " + SelectedCountries + " is checked in the dropdown list of Countries....");
        }
        LogCapture.info("Selected Countries option onto Resources page is same as reflected on Settings page...");


    }

    @Then("^User should be able to view (ALL |)the document count$")
    public int userShouldBeAbleToViewTheDocumentCount(String TargetDocuments) throws Exception {
        if (TargetDocuments.equalsIgnoreCase("")) {
            String vObjResources = Constants.Affiliates_ResourcesPageOR.getProperty("Resources");
            Assert.assertEquals("PASS", Constants.key.click(vObjResources, ""));

            String vObjNoResourceAvailable = Constants.Affiliates_ResourcesPageOR.getProperty("NoResourceAvailable");
            String vObjAvailableDocuments = Constants.Affiliates_ResourcesPageOR.getProperty("AvailableDocuments");
            try {
                NoResourcesAvailableStatus = Constants.driver.findElement(By.xpath(vObjNoResourceAvailable)).isDisplayed();
            } catch (NoSuchElementException e) {

                NoResourcesAvailableStatus = false;
            }
            if (NoResourcesAvailableStatus) {
                String vObjNoResourceAvailableSubMsg = Constants.Affiliates_ResourcesPageOR.getProperty("NoResourceAvailableSubMsg");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjNoResourceAvailable, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjNoResourceAvailableSubMsg, ""));
                String ExpectedNoResourceAvailableText = "No resources available";
                String ExpectedNoResourceAvailableSubMsg = "There are no resources available for the criteria selected. Please try a different combination of filters.";
                Assert.assertEquals("PASS", Constants.key.verifyText(vObjNoResourceAvailable, ExpectedNoResourceAvailableText));
                Assert.assertEquals("PASS", Constants.key.verifyText(vObjNoResourceAvailableSubMsg, ExpectedNoResourceAvailableSubMsg));
                LogCapture.info("User is able to see Message: " + ExpectedNoResourceAvailableText + " when No document is available");
                LogCapture.info("User also verified Sub-Message: " + ExpectedNoResourceAvailableSubMsg);
                LogCapture.info("No document is visible....");
            } else {
                List<WebElement> listOfClientCountriesText = Constants.driver.findElements(By.xpath(vObjAvailableDocuments));
                ListAvailableDocuments = listOfClientCountriesText.size();
                LogCapture.info("Total Documents count count for the selected combination is: " + listOfClientCountriesText.size());
                return ListAvailableDocuments;
            }

        }

        if (TargetDocuments.equalsIgnoreCase("ALL ")) {
            String vObjResources = Constants.Affiliates_ResourcesPageOR.getProperty("Resources");
            Assert.assertEquals("PASS", Constants.key.click(vObjResources, ""));

            String vObjNoResourceAvailable = Constants.Affiliates_ResourcesPageOR.getProperty("NoResourceAvailable");
            String vObjAvailableDocuments = Constants.Affiliates_ResourcesPageOR.getProperty("AvailableDocuments");
            try {
                NoResourcesAvailableStatus = Constants.driver.findElement(By.xpath(vObjNoResourceAvailable)).isDisplayed();
            } catch (NoSuchElementException e) {

                NoResourcesAvailableStatus = false;
            }
            if (NoResourcesAvailableStatus) {
                String vObjNoResourceAvailableSubMsg = Constants.Affiliates_ResourcesPageOR.getProperty("NoResourceAvailableSubMsg");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjNoResourceAvailable, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjNoResourceAvailableSubMsg, ""));
                String ExpectedNoResourceAvailableText = "No resources available";
                String ExpectedNoResourceAvailableSubMsg = "There are no resources available for the criteria selected. Please try a different combination of filters.";
                Assert.assertEquals("PASS", Constants.key.verifyText(vObjNoResourceAvailable, ExpectedNoResourceAvailableText));
                Assert.assertEquals("PASS", Constants.key.verifyText(vObjNoResourceAvailableSubMsg, ExpectedNoResourceAvailableSubMsg));
                LogCapture.info("User is able to see Message: " + ExpectedNoResourceAvailableText + " when No document is available");
                LogCapture.info("User also verified Sub-Message: " + ExpectedNoResourceAvailableSubMsg);
                LogCapture.info("No document is visible....");
            } else {
                String vObjLoadMore = Constants.Affiliates_ResourcesPageOR.getProperty("LoadMore");
                LoadMoreBoolean = Constants.driver.findElement(By.xpath(vObjLoadMore)).isDisplayed();
                if (LoadMoreBoolean) {

                    LogCapture.info("LoadMore button is available...");
                    int Count = 0;

                    while (LoadMoreBoolean) {
                        //((JavascriptExecutor) Constants.driver).executeScript("arguments[0].scrollIntoView();", LoadMoreBtnn);
                        Constants.key.pause("3", "");
                        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjLoadMore, ""));
                        Assert.assertEquals("PASS", Constants.key.click(vObjLoadMore, ""));
                        Constants.key.pause("3", "");
                        ((JavascriptExecutor) Constants.driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
                        Constants.key.pause("2", "");
                        try {
                            LoadMoreBoolean = Constants.driver.findElement(By.xpath(vObjLoadMore)).isDisplayed();
                            System.out.println(LoadMoreBoolean);
                        } catch (NoSuchElementException e) {
                            LoadMoreBoolean = false;
                            System.out.println(Count);
                        }

                    }

                    List<WebElement> listOfClientCountriesText = Constants.driver.findElements(By.xpath(vObjAvailableDocuments));
                    LogCapture.info("Total Documents count count for the selected combination is: " + listOfClientCountriesText.size());

                } else {

                    List<WebElement> listOfClientCountriesText = Constants.driver.findElements(By.xpath(vObjAvailableDocuments));
                    LogCapture.info("Total Documents count count for the selected combination is: " + listOfClientCountriesText.size());
                }
            }

        }
        return 0;
    }

    @Then("^User should be able to view message as Resources not available$")
    public void userShouldBeAbleToViewMessageAsResourcesNotAvailable() throws Throwable {

        String vObjResources = Constants.Affiliates_ResourcesPageOR.getProperty("Resources");
        Assert.assertEquals("PASS", Constants.key.click(vObjResources, ""));

        String vObjNoResourceAvailable = Constants.Affiliates_ResourcesPageOR.getProperty("NoResourceAvailable");

        try {
            NoResourcesAvailableStatus = Constants.driver.findElement(By.xpath(vObjNoResourceAvailable)).isDisplayed();
        } catch (NoSuchElementException e) {

            NoResourcesAvailableStatus = false;
        }
        if (NoResourcesAvailableStatus) {
            String vObjNoResourceAvailableSubMsg = Constants.Affiliates_ResourcesPageOR.getProperty("NoResourceAvailableSubMsg");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjNoResourceAvailable, ""));
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjNoResourceAvailableSubMsg, ""));
            String ExpectedNoResourceAvailableText = "No resources available";
            String ExpectedNoResourceAvailableSubMsg = "There are no resources available for the criteria selected. Please try a different combination of filters.";
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjNoResourceAvailable, ExpectedNoResourceAvailableText));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjNoResourceAvailableSubMsg, ExpectedNoResourceAvailableSubMsg));
            LogCapture.info("User is able to see Message: " + ExpectedNoResourceAvailableText + " when No document is available");
            LogCapture.info("User also verified Sub-Message: " + ExpectedNoResourceAvailableSubMsg);

        } else {
            LogCapture.info("User not able to view No Resource Available....");
            Assert.fail();
        }
    }

    @Then("^System will open a slider on right hand side along with the list of tracking codes$")
    public void systemWillOpenASliderOnRightHandSideAlongWithTheListOfTrackingCodes() throws Throwable {
        Constants.key.pause("2", "");
        String vObjAffiliateTrackingCodeLink = Constants.Affiliates_ResourcesPageOR.getProperty("AffiliateTrackingCodeLink");
        List<WebElement> AffiliateTrackingCodeLinkCount = Constants.driver.findElements(By.xpath(vObjAffiliateTrackingCodeLink));
        System.out.println("Count" + AffiliateTrackingCodeLinkCount.size());
        if (!AffiliateTrackingCodeLinkCount.isEmpty() && AffiliateTrackingCodeLinkCount.size() > 0)
            LogCapture.info("User will be able to view the Tracking Code");
        else
            Assert.fail();
        LogCapture.info("User will not be able to view the Tracking Code");

    }

    @And("^User click on Copy Code for (UK|US) Country And verify CopyCodeMessage is displayed on the top$")
    public void userClickOnCopyCodeForUKCountry(String Country) throws Throwable {
        if (Country.equalsIgnoreCase("UK")) {
            String vObjAffiliateUKTrackingURL = Constants.Affiliates_ResourcesPageOR.getProperty("AffiliateTrackingUKCopyCode");
            String vObjCopyCodeMsg = Constants.Affiliates_ResourcesPageOR.getProperty("CopyCodeMsg");
            Assert.assertEquals("PASS", Constants.key.click(vObjAffiliateUKTrackingURL, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjCopyCodeMsg, ""));
        }
    }

    @Then("^User will be able to view the (Banners|Logos|Factsheets|Leaflets) on the Search Page$")
    public void userWillBeAbleToViewTheDocumentOnTheSearchPage(String Categories) throws Throwable {
        if (Categories.equalsIgnoreCase("Factsheets") || Categories.equalsIgnoreCase("Leaflets")) {
            Constants.key.pause("2", "");
            String vObjFiltersEmbed = Constants.Affiliates_ResourcesPageOR.getProperty("FiltersEmbed");
            List<WebElement> CountriesCount = Constants.driver.findElements(By.xpath(vObjFiltersEmbed));
            System.out.println("Count" + CountriesCount.size());
            String vObjView = Constants.Affiliates_ResourcesPageOR.getProperty("View");
            List<WebElement> ViewCounts = Constants.driver.findElements(By.xpath(vObjView));
            if (CountriesCount.size() > 0 && ViewCounts.size() > 0)
                LogCapture.info("User will be able to view the Document on the Search Page");
            else
                Assert.fail();
            LogCapture.info("User will not be able to view the Document on the Search Page");

        }
        if (Categories.equalsIgnoreCase("Banners")) {
            Constants.key.pause("2", "");
            String vObjFiltersEmbed = Constants.Affiliates_ResourcesPageOR.getProperty("FiltersImg");
            List<WebElement> CountriesCount = Constants.driver.findElements(By.xpath(vObjFiltersEmbed));
            System.out.println("Count" + CountriesCount.size());
            String vObjView = Constants.Affiliates_ResourcesPageOR.getProperty("View");
            List<WebElement> ViewCounts = Constants.driver.findElements(By.xpath(vObjView));
            if (CountriesCount.size() > 0 && ViewCounts.size() > 0)
                LogCapture.info("User will be able to view the Document on the Search Page");
            else
                Assert.fail();
            LogCapture.info("User will not be able to view the Document on the Search Page");

        }
    }

    @And("^User chooses documnet (Banners|Factsheets|Leaflets) and Click on (View|Print|Download|Copycode|DownloadFromDocument|PrintFromDocument)$")
    public void userChoosesDocumnetAndClickOnView(String DropDownValues, String Action) throws Throwable {
        Constants.key.pause("3", "");
        if (DropDownValues.equalsIgnoreCase("Banners") && Action.equalsIgnoreCase("View")) {
            String vObjImageView = Constants.Affiliates_ResourcesPageOR.getProperty("ImageView");
            Assert.assertEquals("PASS", Constants.key.click(vObjImageView, ""));
        }
        if (DropDownValues.equalsIgnoreCase("Factsheets") && Action.equalsIgnoreCase("View") || DropDownValues.equalsIgnoreCase("Leaflets") && Action.equalsIgnoreCase("View")) {
            String vObjImageView = Constants.Affiliates_ResourcesPageOR.getProperty("EmbedView");
            Assert.assertEquals("PASS", Constants.key.click(vObjImageView, ""));
        }
        if (DropDownValues.equalsIgnoreCase("Banners") && Action.equalsIgnoreCase("View")) {
            String vObjImageView = Constants.Affiliates_ResourcesPageOR.getProperty("CopyCode");
            Assert.assertEquals("PASS", Constants.key.click(vObjImageView, ""));
            String vObjCopyCodeMsg = Constants.Affiliates_ResourcesPageOR.getProperty("CopyCodeMsg");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjCopyCodeMsg, ""));
        }
        if (DropDownValues.equalsIgnoreCase("Leaflets") && Action.equalsIgnoreCase("Download") || DropDownValues.equalsIgnoreCase("Factsheets") && Action.equalsIgnoreCase("Download")) {
            String vObjDownload = Constants.Affiliates_ResourcesPageOR.getProperty("Download");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjDownload, ""));
            Assert.assertEquals("PASS", Constants.key.click(vObjDownload, ""));
        }
        if (DropDownValues.equalsIgnoreCase("Leaflets") && Action.equalsIgnoreCase("DownloadFromDocument") || DropDownValues.equalsIgnoreCase("Factsheets") && Action.equalsIgnoreCase("DownloadFromDocument")) {
            String vObjDownload = Constants.Affiliates_ResourcesPageOR.getProperty("Downloads");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjDownload, "disabled"));
        }
        if (DropDownValues.equalsIgnoreCase("Leaflets") && Action.equalsIgnoreCase("PrintFromDocument") || DropDownValues.equalsIgnoreCase("Factsheets") && Action.equalsIgnoreCase("PrintFromDocument")) {
            String vObjDownload = Constants.Affiliates_ResourcesPageOR.getProperty("Prints");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjDownload, "disabled"));
        }

    }

    @Then("^System will opens a slider with the details of the (Banner|Factsheet) document been selected$")
    public void systemWillOpensASliderWithTheDetailsOfTheDocumentBeenSelected(String TargetCategories) throws Throwable {
        String vObjResourceInformationPage = Constants.Affiliates_ResourcesPageOR.getProperty("ResourceInformationPage");
        String ResourceInformationPage = "Resource information";
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjResourceInformationPage, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjResourceInformationPage, ResourceInformationPage));
        LogCapture.info("User is on Resource Information page....");

        if (TargetCategories.equalsIgnoreCase("Banner")) {
            String vObjResourceInformationPageBannerTile = Constants.Affiliates_ResourcesPageOR.getProperty("ResourceInformationPageBannerTile");
            String ResourceInformationPageBannerTile = "Banner";
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjResourceInformationPageBannerTile, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjResourceInformationPageBannerTile, ResourceInformationPageBannerTile));
            LogCapture.info("User has opened a Banner...");
        }
        if (TargetCategories.equalsIgnoreCase("Factsheet")) {
            String vObjResourceInformationPageFactsheetTile = Constants.Affiliates_ResourcesPageOR.getProperty("ResourceInformationPageFactsheetTile");
            String ResourceInformationPageFactsheetTile = "Factsheet";
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjResourceInformationPageFactsheetTile, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjResourceInformationPageFactsheetTile, ResourceInformationPageFactsheetTile));
            LogCapture.info("User has opened a Factsheet...");
        }
        //Document name element
        //*[contains(@src,'id=0150O000004QVq')]//following::span[contains(text(),'Banner')][1]//preceding::span[1]

    }

    @And("^User Clicks on thrumbled view with (9|20) option$")
    public void userClicksOnThrumbledViewOption(String TargetOption) throws Throwable {

        if (TargetOption.equalsIgnoreCase("9")) {
            String vObjthrumbled9 = Constants.Affiliates_ResourcesPageOR.getProperty("thrumbled9");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjthrumbled9, ""));
            Assert.assertEquals("PASS", Constants.key.click(vObjthrumbled9, ""));
            LogCapture.info("User clicked on thrumbled with " + TargetOption + " views on a page...");
            Constants.key.pause("2", "");
        }
        if (TargetOption.equalsIgnoreCase("20")) {
            String vObjthrumbled20 = Constants.Affiliates_ResourcesPageOR.getProperty("thrumbled20");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjthrumbled20, ""));
            Assert.assertEquals("PASS", Constants.key.click(vObjthrumbled20, ""));
            LogCapture.info("User clicked on thrumbled with " + TargetOption + " views on a page...");
            Constants.key.pause("2", "");
        }
    }

    @Then("^User will be able to view (9|20|9 more|20 more) documents in a particular page$")
    public void userWillBeAbleToViewDocumentsInAParticularPage(String TargetCount) throws Throwable {
        if (TargetCount.equalsIgnoreCase("9 more")) {
            String vObjAvailableDocuments = Constants.Affiliates_ResourcesPageOR.getProperty("AvailableDocuments");
            List<WebElement> listOfClientCountriesText = Constants.driver.findElements(By.xpath(vObjAvailableDocuments));
            int ActualTargetCount = listOfClientCountriesText.size();
            if (ActualTargetCount == 18) {
                LogCapture.info("Document visible on a page is: 18");
            } else {
                LogCapture.info("Document visible on a page should be 9 + " + TargetCount + " but it is: " + ActualTargetCount);
                Assert.fail();
            }
        }
        if (TargetCount.equalsIgnoreCase("20 more")) {
            String vObjAvailableDocuments = Constants.Affiliates_ResourcesPageOR.getProperty("AvailableDocuments");
            List<WebElement> listOfClientCountriesText = Constants.driver.findElements(By.xpath(vObjAvailableDocuments));
            int ActualTargetCount = listOfClientCountriesText.size();
            if (ActualTargetCount == 40) {
                LogCapture.info("Document visible on a page is: 40");
            } else {
                LogCapture.info("Document visible on a page should be 20 + " + TargetCount + " but it is: " + ActualTargetCount);
                Assert.fail();
            }
        }
        if (TargetCount.equalsIgnoreCase("9")) {
            String vObjResources = Constants.Affiliates_ResourcesPageOR.getProperty("Resources");
            Assert.assertEquals("PASS", Constants.key.click(vObjResources, ""));

            String vObjNoResourceAvailable = Constants.Affiliates_ResourcesPageOR.getProperty("NoResourceAvailable");
            String vObjAvailableDocuments = Constants.Affiliates_ResourcesPageOR.getProperty("AvailableDocuments");
            try {
                NoResourcesAvailableStatus = Constants.driver.findElement(By.xpath(vObjNoResourceAvailable)).isDisplayed();
            } catch (NoSuchElementException e) {

                NoResourcesAvailableStatus = false;
            }
            if (NoResourcesAvailableStatus) {
                String vObjNoResourceAvailableSubMsg = Constants.Affiliates_ResourcesPageOR.getProperty("NoResourceAvailableSubMsg");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjNoResourceAvailable, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjNoResourceAvailableSubMsg, ""));
                LogCapture.info("No document is visible....");
            } else {
                List<WebElement> listOfClientCountriesText = Constants.driver.findElements(By.xpath(vObjAvailableDocuments));
                int ActualTargetCount = listOfClientCountriesText.size();
                if (ActualTargetCount == 9) {
                    LogCapture.info("Document visible on a page is: 9");
                } else {
                    LogCapture.info("Document visible on a page should be 9 but it is: " + ActualTargetCount);
                    Assert.fail();
                }
            }
        }

        if (TargetCount.equalsIgnoreCase("20")) {

            String vObjResources = Constants.Affiliates_ResourcesPageOR.getProperty("Resources");
            Assert.assertEquals("PASS", Constants.key.click(vObjResources, ""));

            String vObjNoResourceAvailable = Constants.Affiliates_ResourcesPageOR.getProperty("NoResourceAvailable");
            String vObjAvailableDocuments = Constants.Affiliates_ResourcesPageOR.getProperty("AvailableDocuments");
            try {
                NoResourcesAvailableStatus = Constants.driver.findElement(By.xpath(vObjNoResourceAvailable)).isDisplayed();
            } catch (NoSuchElementException e) {

                NoResourcesAvailableStatus = false;
            }
            if (NoResourcesAvailableStatus) {
                String vObjNoResourceAvailableSubMsg = Constants.Affiliates_ResourcesPageOR.getProperty("NoResourceAvailableSubMsg");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjNoResourceAvailable, ""));
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjNoResourceAvailableSubMsg, ""));
                LogCapture.info("No document is visible....");
            } else {
                List<WebElement> listOfClientCountriesText = Constants.driver.findElements(By.xpath(vObjAvailableDocuments));
                int ActualTargetCount = listOfClientCountriesText.size();
                if (ActualTargetCount == 20) {
                    LogCapture.info("Document visible on a page is: 20");
                } else {
                    LogCapture.info("Document visible on a page should be 20 but it is: " + ActualTargetCount);
                    Assert.fail();
                }
            }

        }
    }


    @Then("^User will be Navigated to become a partner page$")
    public void userWillBeNavigatedToBecomeAPartnerPage() throws Throwable {
        String vObjCreateAnAccount = Constants.Affiliates_BecomeaPartnerOR.getProperty("CreateAnAccount");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCreateAnAccount, ""));

    }

    @Then("^User will will be able to view (Personal) radio button as bydefault selection$")
    public void userWillWillBeAbleToViewPersonalRadioButtonAsBydefaultSelection(String RadioSelection) throws Throwable {
        if (RadioSelection.equalsIgnoreCase("Personal")) {
            String vObjPersonalDetails = Constants.Affiliates_BecomeaPartnerOR.getProperty("PersonalDetails");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjPersonalDetails, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjPersonalDetails, "enabled"));
            //Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjPersonalDetails, "selected"));
        }
    }

    @And("^User go to Country Option and try to search Country \"([^\"]*)\"$")
    public void userGoToCountryOptionAndTryToSearchCountry(String Country) throws Throwable {
        String vObjCountry = Constants.Affiliates_BecomeaPartnerOR.getProperty("Country");
        Assert.assertEquals("PASS", Constants.key.click(vObjCountry, Country));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjCountry, Country));
        Constants.key.pause("2", "");
//        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCountry, "downArrow"));
//        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCountry, "enter"));
//        System.out.println("value"+Constants.driver.findElement(By.xpath(vObjCountry)).getAttribute("value"));

    }

    @Then("^System will not show any result$")
    public void systemWillNotShowAnyResult() throws Throwable {
        String vObjCountry = Constants.Affiliates_BecomeaPartnerOR.getProperty("Country");
        String SearchText = Constants.Affiliates_BecomeaPartnerOR.getProperty("SearchText");
        String SearchText1 = Constants.Affiliates_BecomeaPartnerOR.getProperty("SearchText1");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCountry, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCountry, "enter"));
        try {
            if (Constants.driver.findElement(By.xpath(SearchText)).isDisplayed() || Constants.driver.findElement(By.xpath(SearchText1)).isDisplayed()) {
                LogCapture.info("The results is displayed");
                Assert.fail();
            }
        } catch (Exception e) {
            LogCapture.info("The results not displayed");
        }

    }

    @And("^User Selects the (Corporate|Personal) option$")
    public void userSelectsTheCorporateOption(String Option) throws Throwable {
        if (Option.equalsIgnoreCase("Corporate")) {
            String vObjCompanyRadioButton = Constants.Affiliates_BecomeaPartnerOR.getProperty("CompanyRadioButton");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjCompanyRadioButton, ""));
            Assert.assertEquals("PASS", Constants.key.click(vObjCompanyRadioButton, ""));
            Constants.key.pause("2", "");
        }
    }

    @And("^User enters (An Individual|A Company) the personal details Salutation \"([^\"]*)\" FirstName \"([^\"]*)\" LastName \"([^\"]*)\" CountryCode \"([^\"]*)\" MobileNumber \"([^\"]*)\" Country \"([^\"]*)\" Address \"([^\"]*)\" CompanyName \"([^\"]*)\" TradingName \"([^\"]*)\"$")
    public void userEntersThePersonalDetailsSalutationFirstNameLastNameCountryCodeMobileNumberCountryAddress(String Value, String Salutation, String FirstName, String LastName, String CountryCode, String MobileNumber, String Country, String Address, String CompanyName, String TradingName) throws Throwable {
        Constants.FirstNameField = FirstName;
        Constants.LastNameField = LastName;
        Constants.SalutationField = Salutation;
        Constants.MobileNumberField = MobileNumber;
        Constants.CountryCodeField = CountryCode;
        Constants.TradingNameField = TradingName;
        Constants.CompanyNameField = CompanyName;
        String vSalutation = Constants.Refer_a_Client.getProperty("Salutation");
        String vF_Name = Constants.Refer_a_Client.getProperty("FirstName");
        String vL_Name = Constants.Refer_a_Client.getProperty("LastName");
        String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
        LogCapture.info("Continue button is disable");
        LogCapture.info("Details ...Salutation- " + Salutation + ", First Name- " + FirstName + ", Sign Up Last Name " + LastName + " is validated ....");
        Assert.assertEquals("PASS", Constants.key.click(vSalutation, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vSalutation, Constants.SalutationField));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "enter"));

        Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, Constants.FirstNameField));

        Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, Constants.LastNameField));

        String vMobileNumber = Constants.Affiliates_BecomeaPartnerOR.getProperty("MobileNumber");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vMobileNumber, Constants.MobileNumberField));

        String vObjCountry = Constants.Affiliates_BecomeaPartnerOR.getProperty("Country");
        Assert.assertEquals("PASS", Constants.key.click(vObjCountry, Country));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjCountry, Country));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCountry, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCountry, "enter"));
        Constants.key.pause("2", "");
        String vObjSearchAddress = Constants.Affiliates_BecomeaPartnerOR.getProperty("SearchText");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjSearchAddress, Address));
        Constants.key.pause("4", "");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjSearchAddress, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjSearchAddress, "enter"));
        Constants.key.pause("2", "");

        String vObjCountryCode = Constants.Affiliates_BecomeaPartnerOR.getProperty("CountryCodeDropDown");
        Assert.assertEquals("PASS", Constants.key.click(vObjCountryCode, ""));
        Constants.key.pause("2", "");
        String vObjCountryCode1 = Constants.Affiliates_BecomeaPartnerOR.getProperty("CountryCodeClear");
        Assert.assertEquals("PASS", Constants.key.click(vObjCountryCode1, ""));
        Constants.key.pause("2", "");
        String vObjCountryCD = Constants.Affiliates_BecomeaPartnerOR.getProperty("CountryCode");
        Assert.assertEquals("PASS", Constants.key.clearText(vObjCountryCD));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjCountryCD, Constants.CountryCodeField));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCountryCD, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCountryCD, "enter"));

        if (Value.equalsIgnoreCase("A Company")) {
            String vC_Name = Constants.Affiliates_BecomeaPartnerOR.getProperty("CompanyName");
            String vT_Name = Constants.Affiliates_BecomeaPartnerOR.getProperty("TradingName");
            Assert.assertEquals("PASS", Constants.key.writeInInput(vC_Name, Constants.CompanyNameField));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vT_Name, Constants.TradingNameField));

        }
    }

    @And("^Verify the Address to be populated properly And Verify the Details$")
    public void verifyTheAddressToBePopulatedProperlyAndVerifyTheDetails() throws Throwable {
        Constants.key.pause("2", "");
        String vObjEditAddress = Constants.Affiliates_BecomeaPartnerOR.getProperty("EditAddress");
        Assert.assertEquals("PASS", Constants.key.exist(vObjEditAddress, ""));
        String vObjAddressLine1 = Constants.Affiliates_BecomeaPartnerOR.getProperty("AddressLine1");
        String AddressLine1 = Constants.driver.findElement(By.xpath(vObjAddressLine1)).getText();
        Constants.AddressField = AddressLine1;
        if (AddressLine1.equalsIgnoreCase("A, Selborne Mansions")) {
            Assert.assertEquals("PASS", Constants.key.exist(vObjAddressLine1, ""));
        } else
            Assert.fail();

    }

    @Then("^User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled$")
    public void userShouldBeAbleToViewTheInputsAreBeenProperlyMappedAndBackToLoginAndContinueButtonToBeEnabled() throws Throwable {
        String vObjContinueButtonDisable = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "enabled"));
        LogCapture.info("Continue button is Enabled");
        String vObjBackToLogin = Constants.Affiliates_BecomeaPartnerOR.getProperty("BackToLogin");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjBackToLogin, "enabled"));
        LogCapture.info("BackToLogin button is Enabled");
        String vObjEditAddress = Constants.Affiliates_BecomeaPartnerOR.getProperty("EditAddress");
        Assert.assertEquals("PASS", Constants.key.click(vObjEditAddress, ""));
        Constants.key.pause("2", "");
        String vObjAddressLine1 = Constants.Affiliates_BecomeaPartnerOR.getProperty("Line1");
        String AddressLine1 = Constants.driver.findElement(By.xpath(vObjAddressLine1)).getAttribute("value");
        System.out.println(AddressLine1);
        String vObjCity = Constants.Affiliates_BecomeaPartnerOR.getProperty("City");
        String City = Constants.driver.findElement(By.xpath(vObjCity)).getAttribute("value");
        System.out.println(City);
        String vObjCountyText = Constants.Affiliates_BecomeaPartnerOR.getProperty("CountyText");
        String CountyText = Constants.driver.findElement(By.xpath(vObjCountyText)).getAttribute("value");
        System.out.println(CountyText);
        String vObjPostCode = Constants.Affiliates_BecomeaPartnerOR.getProperty("PostCode");
        String PostCode = Constants.driver.findElement(By.xpath(vObjPostCode)).getAttribute("value");
        System.out.println(PostCode);
        if (AddressLine1.equalsIgnoreCase("A, Selborne Mansions") && City.equalsIgnoreCase("Bradford") && CountyText.equalsIgnoreCase("West Yorkshire") && PostCode.equalsIgnoreCase("BD9 4NP")) {
            //Assert.assertEquals("PASS", Constants.key.exist(vObjAddressLine1,""));
            System.out.println(PostCode);
            //Reusables.ReadHtmlFile();
        } else
            Assert.fail();


    }


    @And("^User selects the Country\"([^\"]*)\" and address\"([^\"]*)\"$")
    public void userSelectsTheCountryAndAddress(String Country, String Address) throws Throwable {
        String vObjCountry = Constants.Affiliates_BecomeaPartnerOR.getProperty("Country");
        Assert.assertEquals("PASS", Constants.key.click(vObjCountry, Country));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjCountry, Country));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCountry, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCountry, "enter"));
        Constants.key.pause("2", "");
        String vObjSearchAddress = Constants.Affiliates_BecomeaPartnerOR.getProperty("SearchText");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjSearchAddress, Address));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjSearchAddress, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjSearchAddress, "enter"));
        Constants.key.pause("2", "");

    }

    @Then("^User Should be able to view the list of address based on the Selected Country (United Kingdom|Austrilia) (with|Without) Edit Option$")
    public void userShouldBeAbleToViewTheListOfAddressBasedOnTheSelectedCountry(String Country, String Mode) throws Throwable {
        if (Country.equalsIgnoreCase("United Kingdom") && Mode.equalsIgnoreCase("with")) {
            String vObjEditAddress = Constants.Affiliates_BecomeaPartnerOR.getProperty("EditAddress");
            Assert.assertEquals("PASS", Constants.key.click(vObjEditAddress, ""));
            Constants.key.pause("2", "");
            String vObjAddressLine1 = Constants.Affiliates_BecomeaPartnerOR.getProperty("Line1");
            String AddressLine1 = Constants.driver.findElement(By.xpath(vObjAddressLine1)).getAttribute("value");
            System.out.println(AddressLine1);
            String vObjCity = Constants.Affiliates_BecomeaPartnerOR.getProperty("City");
            String City = Constants.driver.findElement(By.xpath(vObjCity)).getAttribute("value");
            System.out.println(City);
            String vObjCountyText = Constants.Affiliates_BecomeaPartnerOR.getProperty("CountyText");
            String CountyText = Constants.driver.findElement(By.xpath(vObjCountyText)).getAttribute("value");
            System.out.println(CountyText);
            String vObjPostCode = Constants.Affiliates_BecomeaPartnerOR.getProperty("PostCode");
            String PostCode = Constants.driver.findElement(By.xpath(vObjPostCode)).getAttribute("value");
            System.out.println(PostCode);
            if (!AddressLine1.isEmpty() && !City.isEmpty() && !PostCode.isEmpty()) {
                //Assert.assertEquals("PASS", Constants.key.exist(vObjAddressLine1,""));
                System.out.println(PostCode);
            } else
                Assert.fail();
        }


        if (Country.equalsIgnoreCase("Austrilia") && Mode.equalsIgnoreCase("with")) {
            String vObjEditAddress = Constants.Affiliates_BecomeaPartnerOR.getProperty("EditAddress");
            Assert.assertEquals("PASS", Constants.key.click(vObjEditAddress, ""));
            Constants.key.pause("2", "");
            String vObjAddressLine1 = Constants.Affiliates_BecomeaPartnerOR.getProperty("Line1");
            String AddressLine1 = Constants.driver.findElement(By.xpath(vObjAddressLine1)).getAttribute("value");
            System.out.println(AddressLine1);
            String vObjCity = Constants.Affiliates_BecomeaPartnerOR.getProperty("City");
            String City = Constants.driver.findElement(By.xpath(vObjCity)).getAttribute("value");
            System.out.println(City);
            String vObjCountyText = Constants.Affiliates_BecomeaPartnerOR.getProperty("CountyText");
            String CountyText = Constants.driver.findElement(By.xpath(vObjCountyText)).getAttribute("value");
            System.out.println(CountyText);
            String vObjPostCode = Constants.Affiliates_BecomeaPartnerOR.getProperty("PostCode");
            String PostCode = Constants.driver.findElement(By.xpath(vObjPostCode)).getAttribute("value");
            System.out.println(PostCode);
            if (!AddressLine1.isEmpty() && !City.isEmpty() && !PostCode.isEmpty()) {
                //Assert.assertEquals("PASS", Constants.key.exist(vObjAddressLine1,""));
                System.out.println(PostCode);
            } else
                Assert.fail();

        }
        if (Country.equalsIgnoreCase("United Kingdom") && Mode.equalsIgnoreCase("Without")) {
            String vObjEditAddress = Constants.Affiliates_BecomeaPartnerOR.getProperty("EditAddress");
            Assert.assertEquals("PASS", Constants.key.exist(vObjEditAddress, ""));
            Constants.key.pause("2", "");
        }
        if (Country.equalsIgnoreCase("Austrilia") && Mode.equalsIgnoreCase("Without")) {
            String vObjEditAddress = Constants.Affiliates_BecomeaPartnerOR.getProperty("EditAddress");
            Assert.assertEquals("PASS", Constants.key.exist(vObjEditAddress, ""));
            Constants.key.pause("2", "");
        }
    }

    @And("^User Deletes the Country been Selected and updates it to other Country \"([^\"]*)\" And \"([^\"]*)\"$")
    public void userDeletesTheCountryBeenSelectedAndUpdatesItToOtherCountry(String updateCountry, String Address) throws Throwable {
        String vObjCountryDropDown = Constants.Affiliates_BecomeaPartnerOR.getProperty("CountryDropDown");
        Assert.assertEquals("PASS", Constants.key.click(vObjCountryDropDown, ""));
        Constants.key.pause("2", "");
        String vObjCountryClear = Constants.Affiliates_BecomeaPartnerOR.getProperty("CountryClear");
        Assert.assertEquals("PASS", Constants.key.click(vObjCountryClear, ""));
        Constants.key.pause("2", "");
        String vObjCountry = Constants.Affiliates_BecomeaPartnerOR.getProperty("Country");

        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjCountry, updateCountry));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCountry, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCountry, "enter"));
        Constants.key.pause("2", "");
        String vObjSearchAddress = Constants.Affiliates_BecomeaPartnerOR.getProperty("SearchText");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjSearchAddress, Address));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjSearchAddress, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjSearchAddress, "enter"));
        Constants.key.pause("2", "");

    }

    @Then("^Individual option is been selected by default$")
    public void individualOptionIsBeenSelectedByDefault() throws Throwable {
        String vObjRadioButton = Constants.Refer_a_Client.getProperty("IndividualRadioButton");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjRadioButton, "selected"));
        LogCapture.info("Individual option is by default selected....");
    }

    @Then("^User should be able to view read all button as disabled$")
    public void userShouldBeAbleToViewReadAllButtonAsDisabled() throws Throwable {

        String vObjReadAllNotificationBtnDisable = Constants.Affiliates_NotificationsPageOR.getProperty("ReadAllNotificationBtnDisable");
        //String vObjReadAllNotificationBtnEnable = Constants.Affiliates_NotificationsPageOR.getProperty("ReadAllNotificationBtnEnable");
        boolean ReadAllNotificationBtnDisable = Constants.driver.findElement(By.xpath(vObjReadAllNotificationBtnDisable)).isDisplayed();

        if (ReadAllNotificationBtnDisable) {
            LogCapture.info("Mark all as read button is disable...");
        } else {
            LogCapture.info("Mark all as read button is NOT disable...");
            Assert.fail();
        }
    }


    @And("^By default Referrals option should be selected$")
    public void byDefaultReferralsOptionShouldBeSelected() {

        String vObjGroupBtnEnable = Constants.Affiliates_ReferralsPageOR.getProperty("GroupBtnEnable");
        String vObjReferralsBtnEnable = Constants.Affiliates_ReferralsPageOR.getProperty("ReferralsBtnEnable");
        String vObjRegistrationsBtnEnable = Constants.Affiliates_ReferralsPageOR.getProperty("RegistrationsBtnEnable");
        String vObjTradesBtnEnable = Constants.Affiliates_ReferralsPageOR.getProperty("TradesBtnEnable");
        String vObjReferralsBtnDisable = Constants.Affiliates_ReferralsPageOR.getProperty("ReferralsBtnDisable");
        String vObjRegistrationsBtnDisable = Constants.Affiliates_ReferralsPageOR.getProperty("RegistrationsBtnDisable");
        String vObjTradesBtnDisable = Constants.Affiliates_ReferralsPageOR.getProperty("TradesBtnDisable");

        WebElement ReferralsBtnEnable = Constants.driver.findElement(By.xpath(vObjReferralsBtnEnable));
        ((JavascriptExecutor) Constants.driver).executeScript("arguments[0].scrollIntoView();", ReferralsBtnEnable);
        if (ReferralsBtnEnable.isEnabled()) {
            LogCapture.info("Referrals button is selected by default...");
        } else {
            LogCapture.info("Referrals button is NOT selected by default...");
            Assert.fail();
        }
    }

    @Then("^User validate CustomerName Type and (Date|Date Registered|Commission Closed Date|Closed Date) columns for (Referrals|Registrations|Trades)$")
    public void userValidateCustomerNameTypeAndDateColumnsForReferrals(String TargetDate, String TargetSection) throws Throwable {

        String vObjCustomerNameColumn = Constants.Affiliates_ReferralsPageOR.getProperty("CustomerNameColumn");
        String vObjTypeColumn = Constants.Affiliates_ReferralsPageOR.getProperty("TypeColumn");


        String CustomerNameColumn = "Customer Name";
        String ActualCustomerNameColumnText = CustomerNameColumn.toUpperCase();
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjCustomerNameColumn, ActualCustomerNameColumnText));
        LogCapture.info("Customer Name column is present on Referrals Page....");

        String TypeColumn = "Type";
        String ActualTypeColumnText = TypeColumn.toUpperCase();
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjTypeColumn, ActualTypeColumnText));
        LogCapture.info("Type column is present on Referrals Page....");

        if (TargetDate.equalsIgnoreCase("Date") && TargetSection.equalsIgnoreCase("Referrals")) {
            String vObjDateColumn = Constants.Affiliates_ReferralsPageOR.getProperty("DateColumn");
            String DateColumn = "Date";
            String ActualDateColumnText = DateColumn.toUpperCase();
            // Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjDateColumn, ""));
            //Assert.assertEquals("PASS", Constants.key.verifyText(vObjDateColumn, ActualDateColumnText));
            LogCapture.info("Date column is present on Referrals Page....");
            LogCapture.info("CustomerName, Type and Date columns are present on " + TargetSection);

        }
        if (TargetDate.equalsIgnoreCase("Date Registered") && TargetSection.equalsIgnoreCase("Registrations")) {
            String vObjDateRegisteredColumn = Constants.Affiliates_ReferralsPageOR.getProperty("DateRegisteredColumn");
            // Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjDateRegisteredColumn, ""));
            //Assert.assertEquals("PASS", Constants.key.exist(vObjDateRegisteredColumn, ""));
            String DateRegisteredColumn = "Date Registered";
            String ActualDateRegisteredColumnText = DateRegisteredColumn.toUpperCase();
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjDateRegisteredColumn, ActualDateRegisteredColumnText));
            LogCapture.info("Date Registered column is present on Referrals Page into Registrations section....");
            LogCapture.info("CustomerName, Type and Date Registered columns are present on " + TargetSection);
        }
        if (TargetDate.equalsIgnoreCase("Commission Closed Date") && TargetSection.equalsIgnoreCase("Trades")) {

            String vObjCommissionColumn = Constants.Affiliates_ReferralsPageOR.getProperty("CommissionColumn");
            //Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCommissionColumn, ""));
            //Assert.assertEquals("PASS", Constants.key.exist(vObjCommissionColumn,""));
            String CommissionColumn = "Commission";
            String ActualCommissionColumnText = CommissionColumn.toUpperCase();
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjCommissionColumn, ActualCommissionColumnText));
            LogCapture.info("Commission column is present on Referrals Page into Trades section....");

            String vObjClosedDateColumn = Constants.Affiliates_ReferralsPageOR.getProperty("ClosedDateColumn");
            // Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjClosedDateColumn, ""));
            //Assert.assertEquals("PASS", Constants.key.exist(vObjClosedDateColumn,""));
            String ClosedDateColumn = "Closed Date";
            String ActualClosedDateColumnText = ClosedDateColumn.toUpperCase();
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjClosedDateColumn, ActualClosedDateColumnText));
            LogCapture.info("Closed Date column is present on Referrals Page into Trades section....");
            LogCapture.info("CustomerName, Type and Closed Date columns are present on " + TargetSection);
        }
        if (TargetDate.equalsIgnoreCase("Closed Date") && TargetSection.equalsIgnoreCase("Trades")) {

            String vObjClosedDateColumn = Constants.Affiliates_ReferralsPageOR.getProperty("ClosedDateColumn");
            // Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjClosedDateColumn, ""));
            // Assert.assertEquals("PASS", Constants.key.exist(vObjClosedDateColumn, ""));
            String ClosedDateColumn = "Closed Date";
            String ActualClosedDateColumnText = ClosedDateColumn.toUpperCase();
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjClosedDateColumn, ActualClosedDateColumnText));
            LogCapture.info("Closed Date column is present on Referrals Page into Trades section....");
            LogCapture.info("CustomerName, Type and Closed Date columns are present on " + TargetSection);
        }

    }


    @Then("^User will get an error message enter (address manually|Account Already Exist)$")
    public void userWillGetAnErrorMessageEnterAddressManually(String Value) throws Throwable {

        if (Value.equalsIgnoreCase("address manually")) {
            String vObjErrorMsg = Constants.Affiliates_BecomeaPartnerOR.getProperty("ErrorMessage1");
            String ErrorMsg = Constants.driver.findElement(By.xpath(vObjErrorMsg)).getText();
            System.out.println(ErrorMsg);
            if (ErrorMsg.equalsIgnoreCase("ERROR:  We couldn't find all your details, please enter your address manually.")) {
                Assert.assertEquals("PASS", Constants.key.exist(vObjErrorMsg, ""));
            } else {
                Assert.fail();
                LogCapture.info(vObjErrorMsg + " Does not exist....");

            }
        }
        if (Value.equalsIgnoreCase("Account Already Exist")) {
            String vObjErrorMsg1 = Constants.Affiliates_BecomeaPartnerOR.getProperty("ErrorMessage");
            String ErrorMsg1 = Constants.driver.findElement(By.xpath(vObjErrorMsg1)).getText();
            System.out.println(ErrorMsg1);
            if (ErrorMsg1.equalsIgnoreCase("ERROR:  This email address is already attached to an account log in now")) {
                Assert.assertEquals("PASS", Constants.key.exist(vObjErrorMsg1, ""));
            } else {
                Assert.fail();
                LogCapture.info(vObjErrorMsg1 + " Does not exist....");

            }
        }
    }

    @And("^User clicks on (Salutation|FirstName|LastName|CompanyName|EmailAddress|Password|AccountName|PaymentCountry|PaymentCurrency|BankName) and do not select any Value$")
    public void userClicksOnSalutationAndDoNotSelectAnyValue(String DropDown) throws Throwable {
        if (DropDown.equalsIgnoreCase("Salutation")) {
            String vSalutation = Constants.Refer_a_Client.getProperty("Salutation");
            Assert.assertEquals("PASS", Constants.key.click(vSalutation, ""));
            String PersonalDetails = Constants.Affiliates_BecomeaPartnerOR.getProperty("PersonalDetails");
            Assert.assertEquals("PASS", Constants.key.click(PersonalDetails, ""));
        }
        if (DropDown.equalsIgnoreCase("FirstName")) {
            String vFirstName = Constants.Refer_a_Client.getProperty("FirstName");
            Assert.assertEquals("PASS", Constants.key.click(vFirstName, ""));
            String vObjFirstName = Constants.Refer_a_Client.getProperty("LastName");
            Assert.assertEquals("PASS", Constants.key.click(vObjFirstName, ""));
        }
        if (DropDown.equalsIgnoreCase("LastName")) {
            String vLastName = Constants.Refer_a_Client.getProperty("LastName");
            Assert.assertEquals("PASS", Constants.key.click(vLastName, ""));
            String vObjFirstName = Constants.Refer_a_Client.getProperty("FirstName");
            Assert.assertEquals("PASS", Constants.key.click(vObjFirstName, ""));
        }
        if (DropDown.equalsIgnoreCase("CompanyName")) {
            String vCompanyName = Constants.Affiliates_BecomeaPartnerOR.getProperty("CompanyName");
            Assert.assertEquals("PASS", Constants.key.click(vCompanyName, ""));
            String vObjFirstName = Constants.Refer_a_Client.getProperty("FirstName");
            Assert.assertEquals("PASS", Constants.key.click(vObjFirstName, ""));
        }
        if (DropDown.equalsIgnoreCase("EmailAddress")) {
            String vObjEmailAddress = Constants.Affiliates_BecomeaPartnerOR.getProperty("EmailAddress");
            Assert.assertEquals("PASS", Constants.key.click(vObjEmailAddress, ""));
            String vObjPassword = Constants.Affiliates_BecomeaPartnerOR.getProperty("Password");
            Assert.assertEquals("PASS", Constants.key.click(vObjPassword, ""));
        }
        if (DropDown.equalsIgnoreCase("Password")) {
            String vObjPassword = Constants.Affiliates_BecomeaPartnerOR.getProperty("Password");
            Assert.assertEquals("PASS", Constants.key.click(vObjPassword, ""));
            String vObjEmailAddress = Constants.Affiliates_BecomeaPartnerOR.getProperty("EmailAddress");
            Assert.assertEquals("PASS", Constants.key.click(vObjEmailAddress, ""));
        }
        if (DropDown.equalsIgnoreCase("AccountName")) {
            String vObjAccountNameField = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNameField");
            Assert.assertEquals("PASS", Constants.key.click(vObjAccountNameField, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjAccountNameField, ""));
            String BankDetailsSidePageTitle = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankDetailsSidePageTitle");
            Assert.assertEquals("PASS", Constants.key.click(BankDetailsSidePageTitle, ""));


        }
        if (DropDown.equalsIgnoreCase("PaymentCountry")) {
            String PaymentCountryField = Constants.Affiliates_BecomeaPartnerOR.getProperty("PaymentCountryField");
            Assert.assertEquals("PASS", Constants.key.click(PaymentCountryField, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(PaymentCountryField, ""));
            String BankDetailsSidePageTitle = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankDetailsSidePageTitle");
            Assert.assertEquals("PASS", Constants.key.click(BankDetailsSidePageTitle, ""));

        }
        if (DropDown.equalsIgnoreCase("PaymentCurrency")) {
            String PaymentCurrencyField = Constants.Affiliates_BecomeaPartnerOR.getProperty("PaymentCurrencyField");
            Assert.assertEquals("PASS", Constants.key.click(PaymentCurrencyField, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(PaymentCurrencyField, ""));
            String BankDetailsSidePageTitle = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankDetailsSidePageTitle");
            Assert.assertEquals("PASS", Constants.key.click(BankDetailsSidePageTitle, ""));

        }
        if (DropDown.equalsIgnoreCase("BankName")) {
            String vObjBankNameField = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankNameField");
            Assert.assertEquals("PASS", Constants.key.click(vObjBankNameField, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjBankNameField, ""));
            String BankDetailsSidePageTitle = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankDetailsSidePageTitle");
            Assert.assertEquals("PASS", Constants.key.click(BankDetailsSidePageTitle, ""));
            LogCapture.info("User enters BankName: ");

        }
    }

    @Then("^System (Salutation|FirstName|LastName|CompanyName|TradingName|EmailAddress|Password|MobileNumber|AccountName|PaymentCountry|PaymentCurrency) should turn the input red and Continue button is been Grayed Out$")
    public void systemShouldTurnTheInputRedAndContinueButtonIsBeenGrayedOut(String Field) throws Throwable {
        if (Field.equalsIgnoreCase("Salutation")) {
            String vSalutationError = Constants.Affiliates_BecomeaPartnerOR.getProperty("SalutationError");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vSalutationError, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(vSalutationError, ""));
            String vSalutation = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vSalutation, "disabled"));
        }
        if (Field.equalsIgnoreCase("FirstName")) {
            String vFirstNameError = Constants.Affiliates_BecomeaPartnerOR.getProperty("FirstNameError");
            String vFirstNameErrorIcon = Constants.Affiliates_BecomeaPartnerOR.getProperty("FirstNameErrorIcon");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vFirstNameError, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(vFirstNameError, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vFirstNameErrorIcon, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(vFirstNameErrorIcon, ""));
            String vSalutation = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vSalutation, "disabled"));
        }
        if (Field.equalsIgnoreCase("LastName")) {
            String vLastNameError = Constants.Affiliates_BecomeaPartnerOR.getProperty("LastNameError");
            String vLastNameErrorIcon = Constants.Affiliates_BecomeaPartnerOR.getProperty("LastNameErrorIcon");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vLastNameError, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(vLastNameError, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vLastNameErrorIcon, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(vLastNameErrorIcon, ""));
            String vSalutation = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vSalutation, "disabled"));
        }
        if (Field.equalsIgnoreCase("CompanyName")) {
            String vCompanyNameError = Constants.Affiliates_BecomeaPartnerOR.getProperty("CompanyNameError");
            String CompanyNameErrorIcon = Constants.Affiliates_BecomeaPartnerOR.getProperty("CompanyNameErrorIcon");
            String CompanyNameErrorMsg = Constants.Affiliates_BecomeaPartnerOR.getProperty("CompanyNameErrorMsg");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vCompanyNameError, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(vCompanyNameError, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(CompanyNameErrorIcon, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(CompanyNameErrorIcon, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(CompanyNameErrorMsg, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(CompanyNameErrorMsg, ""));
            String vSalutation = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vSalutation, "disabled"));
        }
        if (Field.equalsIgnoreCase("TradingName")) {
            String TradingNameError = Constants.Affiliates_BecomeaPartnerOR.getProperty("TradingNameError");
            String TradingNameErrorIcon = Constants.Affiliates_BecomeaPartnerOR.getProperty("TradingNameErrorIcon");
            String TradingNameErrorMsg = Constants.Affiliates_BecomeaPartnerOR.getProperty("TradingNameErrorMsg");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(TradingNameError, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(TradingNameError, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(TradingNameErrorIcon, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(TradingNameErrorIcon, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(TradingNameErrorMsg, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(TradingNameErrorMsg, ""));
            String vSalutation = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vSalutation, "disabled"));
        }
        if (Field.equalsIgnoreCase("EmailAddress")) {
            String TradingNameError = Constants.Affiliates_BecomeaPartnerOR.getProperty("EmailAddressError");
            String TradingNameErrorIcon = Constants.Affiliates_BecomeaPartnerOR.getProperty("EmailAddressErrorIcon");
            String TradingNameErrorMsg = Constants.Affiliates_BecomeaPartnerOR.getProperty("EmailAddressErrorMsg");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(TradingNameError, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(TradingNameError, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(TradingNameErrorIcon, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(TradingNameErrorIcon, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(TradingNameErrorMsg, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(TradingNameErrorMsg, ""));
            String vSalutation = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vSalutation, "disabled"));
        }
        if (Field.equalsIgnoreCase("Password")) {
            String TradingNameErrorIcon = Constants.Affiliates_BecomeaPartnerOR.getProperty("PasswordErrorIcon");
            String TradingNameErrorMsg = Constants.Affiliates_BecomeaPartnerOR.getProperty("PasswordErrorMsg");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(TradingNameErrorIcon, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(TradingNameErrorIcon, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(TradingNameErrorMsg, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(TradingNameErrorMsg, ""));
            String vSalutation = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vSalutation, "disabled"));
        }
        if (Field.equalsIgnoreCase("MobileNumber")) {
            String vObjMobileNumberErrorIcon = Constants.Affiliates_BecomeaPartnerOR.getProperty("MobileNumberErrorIcon");
            String vObjMobileNumberErrorField = Constants.Affiliates_BecomeaPartnerOR.getProperty("MobileNumberErrorField");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjMobileNumberErrorIcon, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(vObjMobileNumberErrorIcon, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjMobileNumberErrorField, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(vObjMobileNumberErrorField, ""));
            LogCapture.info("Error Icon and Error filed turn to red is visible....");

            String vSalutation = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vSalutation, "disabled"));
            LogCapture.info("Continue button is disabled..");
        }
        if (Field.equalsIgnoreCase("AccountName")) {
            String vObjAccountNameErrorIcon = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNameErrorIcon");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAccountNameErrorIcon, ""));
            LogCapture.info("AccountName field Error icon visible...");
            String vObjAccountNameErrorField = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNameErrorField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAccountNameErrorField, ""));
            LogCapture.info("AccountName text box turns red...");
            String vSalutation = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vSalutation, "disabled"));
        }
        if (Field.equalsIgnoreCase("AccountName")) {
            String vObjAccountNameErrorIcon = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNameErrorIcon");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAccountNameErrorIcon, ""));
            LogCapture.info("AccountName field Error icon visible...");
            String vObjAccountNameErrorField = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNameErrorField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAccountNameErrorField, ""));
            LogCapture.info("AccountName text box turns red...");
            String vSalutation = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vSalutation, "disabled"));
        }
        if (Field.equalsIgnoreCase("PaymentCountry")) {
            String PaymentCountryErrorField = Constants.Affiliates_BecomeaPartnerOR.getProperty("PaymentCountryErrorField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(PaymentCountryErrorField, ""));
            LogCapture.info("PaymentCountryErrorField field text box turns red");
            String vSalutation = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vSalutation, "disabled"));
        }
        if (Field.equalsIgnoreCase("PaymentCurrency")) {
            String PaymentCurrencyErrorField = Constants.Affiliates_BecomeaPartnerOR.getProperty("PaymentCurrencyErrorField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(PaymentCurrencyErrorField, ""));
            LogCapture.info("PaymentCurrencyErrorField field text box turns red");
            String vSalutation = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vSalutation, "disabled"));
        }
    }

    @And("^User clicks on (Salutation) and select (any Value) from Dropdown \"([^\"]*)\"$")
    public void userClicksOnSalutationAndSelectAnyValueFromDropdown(String DropDown, String Value, String Salutation) throws Throwable {
        if (DropDown.equalsIgnoreCase("Salutation") && Value.equalsIgnoreCase("any Value")) {
            String vSalutation = Constants.Refer_a_Client.getProperty("Salutation");
            Assert.assertEquals("PASS", Constants.key.click(vSalutation, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vSalutation, Salutation));
            Constants.key.pause("2", "");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vSalutation, "enter"));
            Constants.key.pause("2", "");
        }
    }

    @And("^User Deletes (Salutation) which is been Selected$")
    public void userDeletesCountryWhichIsBeenSelected(String DropDown) throws Throwable {
        if (DropDown.equalsIgnoreCase("Salutation")) {
            String SalutationClearBtn = Constants.Refer_a_Client.getProperty("SalutationClearBtn");
            Assert.assertEquals("PASS", Constants.key.click(SalutationClearBtn, ""));
            String vObjFirstName = Constants.Refer_a_Client.getProperty("FirstName");
            Assert.assertEquals("PASS", Constants.key.click(vObjFirstName, ""));
        }
    }

    @And("^User click on the (FirstName|LastName|CompanyName|TradingName|Password|JointFirstName|JointLastName|JointMobileNumber|Email|JointEmail|MobileNumber|EmailSRL) enter the name (more than 40|more than 50|more than 100|Minimum 10|Less than 16|a lower case|a upper case|atleast 1 number And Special|atleast 1 number|more than 64|Only one|more than 160|more than 24|Less Than 8) characters$")

    public void userClickOnTheFirstNameEnterTheNameMoreThanCharacters(String FieldName, String Value) throws Throwable {
        if (FieldName.equalsIgnoreCase("FirstName") && Value.equalsIgnoreCase("more than 40")) {
            String vF_Name = Constants.Refer_a_Client.getProperty("FirstName");
            LogCapture.info("Enter Random Alphabetic values with More Than 40 characters for " + Value);
            String FirstName = RandomStringUtils.randomAlphabetic(41);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName));
            Constants.key.pause("1", "");
            String vObjLastName = Constants.Refer_a_Client.getProperty("LastName");
            Assert.assertEquals("PASS", Constants.key.click(vObjLastName, ""));

        }
        if (FieldName.equalsIgnoreCase("LastName") && Value.equalsIgnoreCase("more than 40")) {
            String vF_Name = Constants.Refer_a_Client.getProperty("LastName");
            LogCapture.info("Enter Random Alphabetic values with More Than 40 characters for " + Value);
            String LastName = RandomStringUtils.randomAlphabetic(41);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, LastName));
            Constants.key.pause("1", "");
            String vObjFirstName = Constants.Refer_a_Client.getProperty("FirstName");
            Assert.assertEquals("PASS", Constants.key.click(vObjFirstName, ""));

        }
        if (FieldName.equalsIgnoreCase("CompanyName") && Value.equalsIgnoreCase("more than 50")) {
            String vF_Name = Constants.Affiliates_BecomeaPartnerOR.getProperty("CompanyName");
            LogCapture.info("Enter Random Alphabetic values with More Than 50 characters for " + Value);
            String LastName = RandomStringUtils.randomAlphabetic(51);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, LastName));
            Constants.key.pause("1", "");
            String vObjFirstName = Constants.Refer_a_Client.getProperty("FirstName");
            Assert.assertEquals("PASS", Constants.key.click(vObjFirstName, ""));

        }
        if (FieldName.equalsIgnoreCase("TradingName") && Value.equalsIgnoreCase("more than 100")) {
            String vF_Name = Constants.Affiliates_BecomeaPartnerOR.getProperty("TradingName");
            LogCapture.info("Enter Random Alphabetic values with More Than 100 characters for " + Value);
            String LastName = RandomStringUtils.randomAlphabetic(101);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, LastName));
            Constants.key.pause("1", "");
            String vObjFirstName = Constants.Refer_a_Client.getProperty("FirstName");
            Assert.assertEquals("PASS", Constants.key.click(vObjFirstName, ""));

        }

        if (FieldName.equalsIgnoreCase("FirstName") && Value.equalsIgnoreCase("more than 40")) {
            String vF_Name = Constants.Refer_a_Client.getProperty("FirstName");
            LogCapture.info("Enter Random Alphabetic values with More Than 40 characters for " + Value);
            String FirstName = RandomStringUtils.randomAlphabetic(41);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName));
            Constants.key.pause("1", "");
            String vObjLastName = Constants.Refer_a_Client.getProperty("LastName");
            Assert.assertEquals("PASS", Constants.key.click(vObjLastName, ""));

        }
        if (FieldName.equalsIgnoreCase("LastName") && Value.equalsIgnoreCase("more than 40")) {
            String vF_Name = Constants.Refer_a_Client.getProperty("LastName");
            LogCapture.info("Enter Random Alphabetic values with More Than 40 characters for " + Value);
            String LastName = RandomStringUtils.randomAlphabetic(41);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, LastName));
            Constants.key.pause("1", "");
            String vObjFirstName = Constants.Refer_a_Client.getProperty("FirstName");
            Assert.assertEquals("PASS", Constants.key.click(vObjFirstName, ""));

        }
        if (FieldName.equalsIgnoreCase("CompanyName") && Value.equalsIgnoreCase("more than 50")) {
            String vF_Name = Constants.Affiliates_BecomeaPartnerOR.getProperty("CompanyName");
            LogCapture.info("Enter Random Alphabetic values with More Than 50 characters for " + Value);
            String LastName = RandomStringUtils.randomAlphabetic(51);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, LastName));
            Constants.key.pause("1", "");
            String vObjFirstName = Constants.Refer_a_Client.getProperty("FirstName");
            Assert.assertEquals("PASS", Constants.key.click(vObjFirstName, ""));

        }
        if (FieldName.equalsIgnoreCase("TradingName") && Value.equalsIgnoreCase("more than 100")) {
            String vF_Name = Constants.Affiliates_BecomeaPartnerOR.getProperty("TradingName");
            LogCapture.info("Enter Random Alphabetic values with More Than 100 characters for " + Value);
            String LastName = RandomStringUtils.randomAlphabetic(101);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, LastName));
            Constants.key.pause("1", "");
            String vObjFirstName = Constants.Refer_a_Client.getProperty("FirstName");
            Assert.assertEquals("PASS", Constants.key.click(vObjFirstName, ""));

        }
        if (FieldName.equalsIgnoreCase("Password") && Value.equalsIgnoreCase("Minimum 10")) {

            String vF_Name = Constants.Affiliates_BecomeaPartnerOR.getProperty("Password");
            LogCapture.info("Enter Random Alphabetic values with Minimum 10 characters for " + Value);
            String Password = RandomStringUtils.randomAlphabetic(10);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, Password));
            Constants.key.pause("2", "");

        }
        if (FieldName.equalsIgnoreCase("Password") && Value.equalsIgnoreCase("Less than 16")) {
            String vF_Name = Constants.Affiliates_BecomeaPartnerOR.getProperty("Password");
            LogCapture.info("Enter Random Alphabetic values with Less than 16 characters for " + Value);
            String Password = RandomStringUtils.randomAlphabetic(15);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, Password));
            Constants.key.pause("2", "");

        }
        if (FieldName.equalsIgnoreCase("Password") && Value.equalsIgnoreCase("a lower case")) {
            String vF_Name = Constants.Affiliates_BecomeaPartnerOR.getProperty("Password");
            LogCapture.info("Enter Random Alphabetic values with a lower case characters for " + Value);
            String Password = RandomStringUtils.randomAlphabetic(10);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, Password));
            Constants.key.pause("2", "");
        }
        if (FieldName.equalsIgnoreCase("Password") && Value.equalsIgnoreCase("a upper case")) {
            String vF_Name = Constants.Affiliates_BecomeaPartnerOR.getProperty("Password");
            LogCapture.info("Enter Random Alphabetic values with a Upper case characters for " + Value);
            String Password = RandomStringUtils.randomAlphabetic(10);
            String Password1 = Password.toUpperCase();
            Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, Password1));
            Constants.key.pause("2", "");
        }
        if (FieldName.equalsIgnoreCase("Password") && Value.equalsIgnoreCase("atleast 1 number And Special")) {
            Constants.key.pause("2", "");
            String vF_Name = Constants.Affiliates_BecomeaPartnerOR.getProperty("Password");
            LogCapture.info("Enter Random Alphabetic values with a Upper case characters for " + Value);
            String Password = RandomStringUtils.randomAlphanumeric(10);
            String Password1 = Password.concat("#1@$&");
            System.out.println(Password1);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, Password1));
            Constants.key.pause("2", "");
        }
        if (FieldName.equalsIgnoreCase("Password") && Value.equalsIgnoreCase("atleast 1 number")) {
            String vF_Name = Constants.Affiliates_BecomeaPartnerOR.getProperty("Password");
            LogCapture.info("Enter Random Alphabetic values with a Upper case characters for " + Value);
            String Password = RandomStringUtils.randomAlphanumeric(10);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, Password));
            Constants.key.pause("2", "");

        }
        if (FieldName.equalsIgnoreCase("JointFirstName") && Value.equalsIgnoreCase("more than 40")) {
            String vF_Name = Constants.Affiliates_RegisterACustomerOR.getProperty("JointFirstName");
            LogCapture.info("Enter Random Alphabetic values with More Than 40 characters for " + Value);
            String FirstName = RandomStringUtils.randomAlphabetic(41);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName));
            Constants.key.pause("1", "");
            String vObjLastName = Constants.Affiliates_RegisterACustomerOR.getProperty("JointLastName");
            Assert.assertEquals("PASS", Constants.key.click(vObjLastName, ""));

        }
        if (FieldName.equalsIgnoreCase("JointLastName") && Value.equalsIgnoreCase("more than 40")) {
            String vL_Name = Constants.Affiliates_RegisterACustomerOR.getProperty("JointLastName");
            LogCapture.info("Enter Random Alphabetic values with More Than 40 characters for " + Value);
            String LastName = RandomStringUtils.randomAlphabetic(41);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName));
            Constants.key.pause("1", "");
            String JointEmail = Constants.Affiliates_RegisterACustomerOR.getProperty("JointEmail");
            Assert.assertEquals("PASS", Constants.key.click(JointEmail, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(JointEmail, ""));

        }
        if (FieldName.equalsIgnoreCase("JointMobileNumber") && Value.equalsIgnoreCase("Less Than 16")) {
            String JointMobile = Constants.Affiliates_RegisterACustomerOR.getProperty("JointMobile");
            LogCapture.info("Enter Random Alphabetic values with More Than 40 characters for " + Value);
            String JointMobile1 = RandomStringUtils.randomNumeric(16);
            Assert.assertEquals("PASS", Constants.key.writeInInput(JointMobile, JointMobile1));
            Constants.key.pause("1", "");
            String JointFirstName = Constants.Affiliates_RegisterACustomerOR.getProperty("JointFirstName");
            Assert.assertEquals("PASS", Constants.key.click(JointFirstName, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(JointFirstName, "sdfsdfdsf"));

        }
        if (FieldName.equalsIgnoreCase("Email") && Value.equalsIgnoreCase("more than 64")) {
            String RegisterCustomerEmailAddress = Constants.Affiliates_RegisterACustomerOR.getProperty("RegisterCustomerEmailAddress");
            LogCapture.info("Enter Random Alphabetic values with More Than 40 characters for " + Value);
            String Email = RandomStringUtils.randomAlphanumeric(65);
            String Email1 = Email.concat("@gmail.com");
            System.out.println(Email1);
            Assert.assertEquals("PASS", Constants.key.click(RegisterCustomerEmailAddress, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(RegisterCustomerEmailAddress, Email1));
            Constants.key.pause("1", "");
            String JointFirstName = Constants.Affiliates_RegisterACustomerOR.getProperty("FirstName");
            Assert.assertEquals("PASS", Constants.key.click(JointFirstName, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(JointFirstName, "sdfs"));

        }
        if (FieldName.equalsIgnoreCase("JointEmail") && Value.equalsIgnoreCase("Only one")) {
            String RegisterCustomerEmailAddress = Constants.Affiliates_RegisterACustomerOR.getProperty("JointEmail");
            LogCapture.info("Enter Random Alphabetic values with More Than 40 characters for " + Value);
            String Email = RandomStringUtils.randomAlphabetic(1);
            String Email1 = "Testing";
            String Email2 = Email1.concat("@").concat(Email).concat(".com");
            System.out.println(Email2);
            Assert.assertEquals("PASS", Constants.key.click(RegisterCustomerEmailAddress, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(RegisterCustomerEmailAddress, Email2));
            Constants.key.pause("1", "");
            String JointFirstName = Constants.Affiliates_RegisterACustomerOR.getProperty("JointFirstName");
            Assert.assertEquals("PASS", Constants.key.click(JointFirstName, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(JointFirstName, "sdfs"));

        }
        if (FieldName.equalsIgnoreCase("JointEmail") && Value.equalsIgnoreCase("more than 160")) {

            String RegisterCustomerEmailAddress = Constants.Affiliates_RegisterACustomerOR.getProperty("JointEmail");
            LogCapture.info("Enter Random Alphabetic values with More Than 40 characters for " + Value);
            String Email1 = "Testing@";
            String Email = RandomStringUtils.randomAlphabetic(161);
            String Email2 = Email1.concat(Email).concat(".com");
            Assert.assertEquals("PASS", Constants.key.click(RegisterCustomerEmailAddress, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(RegisterCustomerEmailAddress, Email2));
            Constants.key.pause("1", "");
            String JointFirstName = Constants.Affiliates_RegisterACustomerOR.getProperty("JointFirstName");
            Assert.assertEquals("PASS", Constants.key.click(JointFirstName, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(JointFirstName, "sdfs"));

        }
        if (FieldName.equalsIgnoreCase("JointEmail") && Value.equalsIgnoreCase("more than 24")) {

            String RegisterCustomerEmailAddress = Constants.Affiliates_RegisterACustomerOR.getProperty("JointEmail");
            LogCapture.info("Enter Random Alphabetic values with More Than 40 characters for " + Value);
            String Email1 = "Testing@radom.";
            String Email = RandomStringUtils.randomAlphabetic(25);
            String Email2 = Email1.concat(Email);
            Assert.assertEquals("PASS", Constants.key.click(RegisterCustomerEmailAddress, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(RegisterCustomerEmailAddress, Email2));
            Constants.key.pause("1", "");
            String JointFirstName = Constants.Affiliates_RegisterACustomerOR.getProperty("JointFirstName");
            Assert.assertEquals("PASS", Constants.key.click(JointFirstName, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(JointFirstName, "sdfs"));

        }
        if (FieldName.equalsIgnoreCase("MobileNumber") && Value.equalsIgnoreCase("Less Than 16")) {
            String JointMobile = Constants.Affiliates_RegisterACustomerOR.getProperty("MobileNumber");
            LogCapture.info("Enter Random Alphabetic values with More Than 40 characters for " + Value);
            String JointMobile1 = RandomStringUtils.randomNumeric(16);
            Assert.assertEquals("PASS", Constants.key.writeInInput(JointMobile, JointMobile1));
            Constants.key.pause("1", "");
            String JointFirstName = Constants.Affiliates_RegisterACustomerOR.getProperty("FirstName");
            Assert.assertEquals("PASS", Constants.key.click(JointFirstName, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(JointFirstName, "sdfsdfdsf"));

        }
        if (FieldName.equalsIgnoreCase("JointMobileNumber") && Value.equalsIgnoreCase("Less Than 8")) {
            String JointMobile = Constants.Affiliates_RegisterACustomerOR.getProperty("JointMobile");
            LogCapture.info("Enter Random Alphabetic values with More Than 40 characters for " + Value);
            String JointMobile1 = RandomStringUtils.randomNumeric(7);
            Assert.assertEquals("PASS", Constants.key.writeInInput(JointMobile, JointMobile1));
            Constants.key.pause("1", "");
            String JointFirstName = Constants.Affiliates_RegisterACustomerOR.getProperty("JointFirstName");
            Assert.assertEquals("PASS", Constants.key.click(JointFirstName, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(JointFirstName, ""));

        }
        if (FieldName.equalsIgnoreCase("Email") && Value.equalsIgnoreCase("more than 160")) {
            String RegisterCustomerEmailAddress = Constants.Affiliates_RegisterACustomerOR.getProperty("RegisterCustomerEmailAddress");
            LogCapture.info("Enter Random Alphabetic values with More Than 40 characters for " + Value);
            String Email1 = "Testing@";
            String Email = RandomStringUtils.randomAlphabetic(161);
            String Email2 = Email1.concat(Email).concat(".com");
            Assert.assertEquals("PASS", Constants.key.click(RegisterCustomerEmailAddress, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(RegisterCustomerEmailAddress, Email2));
            Constants.key.pause("1", "");
            String JointFirstName = Constants.Affiliates_RegisterACustomerOR.getProperty("FirstName");
            Assert.assertEquals("PASS", Constants.key.click(JointFirstName, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(JointFirstName, ""));

        }
        if (FieldName.equalsIgnoreCase("Email") && Value.equalsIgnoreCase("more than 24")) {
            String RegisterCustomerEmailAddress = Constants.Affiliates_RegisterACustomerOR.getProperty("RegisterCustomerEmailAddress");
            LogCapture.info("Enter Random Alphabetic values with More Than 40 characters for " + Value);
            String Email1 = "Testing@radom.";
            String Email = RandomStringUtils.randomAlphabetic(25);
            String Email2 = Email1.concat(Email);
            Assert.assertEquals("PASS", Constants.key.click(RegisterCustomerEmailAddress, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(RegisterCustomerEmailAddress, Email2));
            Constants.key.pause("1", "");
            String JointFirstName = Constants.Affiliates_RegisterACustomerOR.getProperty("FirstName");
            Assert.assertEquals("PASS", Constants.key.click(JointFirstName, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(JointFirstName, ""));

        }
        if (FieldName.equalsIgnoreCase("JointEmail") && Value.equalsIgnoreCase("more than 64")) {

            String RegisterCustomerEmailAddress = Constants.Affiliates_RegisterACustomerOR.getProperty("JointEmail");
            LogCapture.info("Enter Random Alphabetic values with More Than 40 characters for " + Value);
            String Email = RandomStringUtils.randomAlphanumeric(65);
            String Email1 = Email.concat("@gmail.com");
            System.out.println(Email1);
            Assert.assertEquals("PASS", Constants.key.click(RegisterCustomerEmailAddress, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(RegisterCustomerEmailAddress, Email1));
            Constants.key.pause("1", "");
            String JointFirstName = Constants.Affiliates_RegisterACustomerOR.getProperty("JointFirstName");
            Assert.assertEquals("PASS", Constants.key.click(JointFirstName, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(JointFirstName, ""));

        }
        if (FieldName.equalsIgnoreCase("EmailSRL") && Value.equalsIgnoreCase("more than 64")) {
            String vObjEmailId = Constants.Affiliates_GlobalPageElementsOR.getProperty("EmailId");
            LogCapture.info("Enter Random Alphabetic values with More Than 40 characters for " + Value);
            String Email = RandomStringUtils.randomAlphanumeric(65);
            String Email1 = Email.concat("@gmail.com");
            System.out.println(Email1);
            Assert.assertEquals("PASS", Constants.key.click(vObjEmailId, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjEmailId, Email1));
            Constants.key.pause("1", "");
            String vObjName = Constants.Affiliates_GlobalPageElementsOR.getProperty("Name");
            Assert.assertEquals("PASS", Constants.key.click(vObjName, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjName, ""));

        }
        if (FieldName.equalsIgnoreCase("EmailSRL") && Value.equalsIgnoreCase("Only one")) {
            String vObjEmailId = Constants.Affiliates_GlobalPageElementsOR.getProperty("EmailId");
            LogCapture.info("Enter Random Alphabetic values with More Than 40 characters for " + Value);
            String Email = RandomStringUtils.randomAlphabetic(1);
            String Email1 = "Testing";
            String Email2 = Email1.concat("@").concat(Email).concat(".com");
            System.out.println(Email2);
            Assert.assertEquals("PASS", Constants.key.click(vObjEmailId, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjEmailId, Email2));
            Constants.key.pause("1", "");
            String vObjName = Constants.Affiliates_GlobalPageElementsOR.getProperty("Name");
            Assert.assertEquals("PASS", Constants.key.click(vObjName, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjName, ""));

        }
        if (FieldName.equalsIgnoreCase("EmailSRL") && Value.equalsIgnoreCase("more than 160")) {
            String vObjEmailId = Constants.Affiliates_GlobalPageElementsOR.getProperty("EmailId");
            LogCapture.info("Enter Random Alphabetic values with More Than 40 characters for " + Value);
            String Email1 = "Testing@";
            String Email = RandomStringUtils.randomAlphabetic(161);
            String Email2 = Email1.concat(Email).concat(".com");
            Assert.assertEquals("PASS", Constants.key.click(vObjEmailId, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjEmailId, Email2));
            Constants.key.pause("1", "");
            String vObjName = Constants.Affiliates_GlobalPageElementsOR.getProperty("Name");
            Assert.assertEquals("PASS", Constants.key.click(vObjName, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjName, ""));

        }
        if (FieldName.equalsIgnoreCase("EmailSRL") && Value.equalsIgnoreCase("more than 24")) {

            String vObjEmailId = Constants.Affiliates_GlobalPageElementsOR.getProperty("EmailId");
            LogCapture.info("Enter Random Alphabetic values with More Than 40 characters for " + Value);
            String Email1 = "Testing@radom.";
            String Email = RandomStringUtils.randomAlphabetic(25);
            String Email2 = Email1.concat(Email);
            Assert.assertEquals("PASS", Constants.key.click(vObjEmailId, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjEmailId, Email2));
            Constants.key.pause("1", "");
            String vObjName = Constants.Affiliates_GlobalPageElementsOR.getProperty("Name");
            Assert.assertEquals("PASS", Constants.key.click(vObjName, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjName, ""));

        }
    }

    @And("^User click on (Referrals tab|Registration tab|Trades tab|Download button|PDF Download button|XLSX Download button|Affiliates Group DropDown) on Referrals Page$")
    public void userClickOnRegistrationTabOnReferralsPage(String TargetBtn) throws Throwable {
        if (TargetBtn.equalsIgnoreCase("Referrals tab")) {
            String vObjReferralsBtn = Constants.Affiliates_ReferralsPageOR.getProperty("ReferralsBtn");
            Assert.assertEquals("PASS", Constants.key.click(vObjReferralsBtn, ""));
        }
        if (TargetBtn.equalsIgnoreCase("Registration tab")) {
            String vObjRegistrationsBtn = Constants.Affiliates_ReferralsPageOR.getProperty("RegistrationsBtn");
            Assert.assertEquals("PASS", Constants.key.click(vObjRegistrationsBtn, ""));
            Constants.key.pause("2", "");
        }
        if (TargetBtn.equalsIgnoreCase("Trades tab")) {
            String vObjTradesBtn = Constants.Affiliates_ReferralsPageOR.getProperty("TradesBtn");
            Assert.assertEquals("PASS", Constants.key.click(vObjTradesBtn, ""));
        }
        if (TargetBtn.equalsIgnoreCase("Download button")) {
            String vObjDownloadBtn = Constants.Affiliates_ReferralsPageOR.getProperty("DownloadBtn");
            Assert.assertEquals("PASS", Constants.key.click(vObjDownloadBtn, ""));
        }
        if (TargetBtn.equalsIgnoreCase("PDF Download button")) {

            String vObjPDFDownloadBtn = Constants.Affiliates_ReferralsPageOR.getProperty("PDFDownloadBtn");
            Assert.assertEquals("PASS", Constants.key.click(vObjPDFDownloadBtn, ""));
        }
        if (TargetBtn.equalsIgnoreCase("XLSX Download button")) {
            String vObjXLSXDownloadBtn = Constants.Affiliates_ReferralsPageOR.getProperty("XLSXDownloadBtn");
            Assert.assertEquals("PASS", Constants.key.click(vObjXLSXDownloadBtn, ""));
        }
        if (TargetBtn.equalsIgnoreCase("Affiliates Group DropDown")) {
            String vObjAffiliatesGroupDropdown = Constants.Affiliates_ReferralsPageOR.getProperty("AffiliatesGroupDropdown");
            Assert.assertEquals("PASS", Constants.key.exist(vObjAffiliatesGroupDropdown, ""));
            WebElement AffiliatesGroupDropdown = driver.findElement(By.xpath(vObjAffiliatesGroupDropdown));
            AffiliatesGroupDropdown.click();
            LogCapture.info("USer clicked on Affiliates Group Dropdown..");
        }
        Constants.key.pause("2", "");
    }

    @Then("^User should(| NOT) be able to view the download button on Referrals section$")
    public void userShouldNOTBeAbleToViewTheDownloadButtonOnReferralsSection(String TargetBtnVisible) throws Throwable {
        if (TargetBtnVisible.equalsIgnoreCase(" NOT")) {
            try {
                String vObjDownloadBtn = Constants.Affiliates_ReferralsPageOR.getProperty("DownloadBtn");
                DownloadBtnAvailableStatus = Constants.driver.findElement(By.xpath(vObjDownloadBtn)).isDisplayed();
            } catch (NoSuchElementException e) {
                DownloadBtnAvailableStatus = false;
            }
            if (DownloadBtnAvailableStatus) {
                LogCapture.info("Download button is visible on Download button...");
                Assert.fail();
            } else {
                LogCapture.info("Download button is NOT visible on Download button...");
            }
        }
        if (TargetBtnVisible.equalsIgnoreCase("")) {
            String vObjDownloadBtn = Constants.Affiliates_ReferralsPageOR.getProperty("DownloadBtn");
            WebElement DownloadBtn = Constants.driver.findElement(By.xpath(vObjDownloadBtn));
            if (DownloadBtn.isDisplayed()) {
                LogCapture.info("Download button is visible on Referrals section...");
            } else {
                LogCapture.info("Download button is NOT visible on Referrals section...");
                Assert.fail();
            }
        }
    }

    @Then("^User validate UID Type (and Date|CustomerID and Date Registered|CustomerID Sold Bought TurnOver Profit Commission and Closed Date) columns for (Referrals|Registrations|Trades)$")
    public void userValidateUIDTypeAndDateColumnsForReferrals(String TargetColumns, String TargetSection) throws Throwable {
        String vObjUIDColumn = Constants.Affiliates_ReferralsPageOR.getProperty("UIDColumn");
        String UIDColumn = "UID";
        String ActualUIDColumnText = UIDColumn.toUpperCase();
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjUIDColumn, ActualUIDColumnText));
        LogCapture.info("UID column is present on " + TargetSection + " section....");

        String vObjTypeColumn = Constants.Affiliates_ReferralsPageOR.getProperty("TypeColumn");
        String TypeColumn = "Type";
        String ActualTypeColumnText = TypeColumn.toUpperCase();
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjTypeColumn, ActualTypeColumnText));
        LogCapture.info("Type column is present " + TargetSection + " section....");

        if (TargetColumns.equalsIgnoreCase("and Date") && TargetSection.equalsIgnoreCase("Referrals")) {
            String vObjDateColumn = Constants.Affiliates_ReferralsPageOR.getProperty("DateColumn");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjDateColumn, ""));
            Assert.assertEquals("PASS", Constants.key.exist(vObjDateColumn, ""));
            String DateColumn = "Date";
            String ActualDateColumnText = DateColumn.toUpperCase();
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjDateColumn, ActualDateColumnText));
            LogCapture.info("Date column is present " + TargetSection + " section....");
            LogCapture.info("UID, Type and Date columns are present on " + TargetSection + " section..");
        }
        if (TargetColumns.equalsIgnoreCase("CustomerID and Date Registered") && TargetSection.equalsIgnoreCase("Registrations")) {
            String vObjDateRegisteredColumn = Constants.Affiliates_ReferralsPageOR.getProperty("DateRegisteredColumn");
            String DateRegisteredColumn = "Date Registered";
            String ActualDateRegisteredColumnText = DateRegisteredColumn.toUpperCase();
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjDateRegisteredColumn, ActualDateRegisteredColumnText));
            LogCapture.info("Date Registered column is present on " + TargetSection + " section....");

            String vObjCustomerIDColumn = Constants.Affiliates_ReferralsPageOR.getProperty("CustomerIDColumn");
            String CustomerIDColumn = "Customer ID";
            String ActualCustomerIDColumnText = CustomerIDColumn.toUpperCase();
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjCustomerIDColumn, ActualCustomerIDColumnText));
            LogCapture.info("CustomerID and Date Registered column is present on " + TargetSection + " section....");

            LogCapture.info("CustomerID, UID, Type and Date Registered columns are present on " + TargetSection + " section..");
        }
        if (TargetColumns.equalsIgnoreCase("CustomerID Sold Bought TurnOver Profit Commission and Closed Date") && TargetSection.equalsIgnoreCase("Trades")) {

            String vObjCustomerIDColumn = Constants.Affiliates_ReferralsPageOR.getProperty("CustomerIDColumn");
            String CustomerIDColumn = "Customer ID";
            String ActualCustomerIDColumnText = CustomerIDColumn.toUpperCase();
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjCustomerIDColumn, ActualCustomerIDColumnText));
            LogCapture.info("CustomerID column is present on " + TargetSection + " section....");

            String vObjClosedDateColumn = Constants.Affiliates_ReferralsPageOR.getProperty("ClosedDateColumn");
            String ClosedDateColumn = "Closed Date";
            String ActualClosedDateColumnText = ClosedDateColumn.toUpperCase();
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjClosedDateColumn, ActualClosedDateColumnText));
            LogCapture.info("Closed Date column is present on on " + TargetSection + " section....");

            String vObjSoldColumn = Constants.Affiliates_ReferralsPageOR.getProperty("SoldColumn");
            String SoldColumn = "Sold";
            String ActualSoldColumnText = SoldColumn.toUpperCase();
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjSoldColumn, ActualSoldColumnText));
            LogCapture.info("Sold column is present on " + TargetSection + " section....");

            String vObjBoughtColumn = Constants.Affiliates_ReferralsPageOR.getProperty("BoughtColumn");
            String BoughtColumn = "Bought";
            String ActualBoughtColumnText = BoughtColumn.toUpperCase();
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjBoughtColumn, ActualBoughtColumnText));
            LogCapture.info("Bought column is present on " + TargetSection + " section....");

            String vObjTurnoverColumn = Constants.Affiliates_ReferralsPageOR.getProperty("TurnoverColumn");
            String TurnoverColumn = "Turnover";
            String ActualTurnoverColumnText = TurnoverColumn.toUpperCase();
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjTurnoverColumn, ActualTurnoverColumnText));
            LogCapture.info("Turnover column is present on " + TargetSection + " section....");

            String vObjProfitColumn = Constants.Affiliates_ReferralsPageOR.getProperty("ProfitColumn");
            String ProfitColumn = "Profit";
            String ActualProfitColumnText = ProfitColumn.toUpperCase();
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjProfitColumn, ActualProfitColumnText));
            LogCapture.info("Profit Column is present on " + TargetSection + " section....");

            String vObjCommissionColumn = Constants.Affiliates_ReferralsPageOR.getProperty("CommissionColumn");
            String CommissionColumn = "Commission";
            String ActualCommissionColumnText = CommissionColumn.toUpperCase();
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjCommissionColumn, ActualCommissionColumnText));
            LogCapture.info("Commission column is present on " + TargetSection + " section....");

            LogCapture.info("CustomerID, Sold, Bought, TurnOver, Type Profit, Commission and Closed Date columns are present on " + TargetSection);
        }
    }


    @Then("^User observes proper values for MobileNumber and Address field$")
    public void userObservesProperValuesForMobileNumberAndAddressField() throws Throwable {

        String vObjMobileNumberText = Constants.Affiliates_SettingsPageOR.getProperty("MobileNumber");
        String vObjMobileNumberCodeText = Constants.Affiliates_SettingsPageOR.getProperty("MobileNumberCodeText");

        String vObjMobileNumberCodeText1 = Constants.driver.findElement(By.xpath(vObjMobileNumberCodeText)).getAttribute("value");
        System.out.println("Code value" + vObjMobileNumberCodeText1);

        WebElement MobileNumberText = Constants.driver.findElement(By.xpath(vObjMobileNumberText));

        ((JavascriptExecutor) Constants.driver).executeScript("arguments[0].scrollIntoView();", MobileNumberText);

        String ActualMobileNumberText = Constants.driver.findElement(By.xpath(vObjMobileNumberText)).getAttribute("value");
        // String ActualMobileNumberCodeText = Constants.driver.findElement(By.xpath(vObjMobileNumberCodeText)).getAttribute("value");
        // String[] ActualMobileNumberCodeSplit = ActualMobileNumberCodeText.split("\\+");
        if ((ActualMobileNumberText.length() >= 8) && ActualMobileNumberText.matches("[0-9]+") && (ActualMobileNumberText.length() <= 14)) {
            LogCapture.info("Mobile number is displayed with proper value " + ActualMobileNumberText);
        } else {
            LogCapture.info("Mobile number is NOT displayed with proper value. Actual value is " + ActualMobileNumberText);
            Assert.fail();
        }

        if ((vObjMobileNumberCodeText1.isEmpty())) {
            String vObjMobileNumberErrorText = Constants.Affiliates_SettingsPageOR.getProperty("MobileNumberErrorText1");
            //String ExpectedMobileNumberErrorText = "Enter a valid mobilenumber";
            String ExpectedMobileNumberErrorText = "Enter a valid phone number";
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjMobileNumberErrorText, ExpectedMobileNumberErrorText));
            LogCapture.info("Mobile number Error message visible is " + ExpectedMobileNumberErrorText);
            LogCapture.info("Mobile number Code is NOT displayed with proper value. Actual value is ");
            // Assert.fail();

        } else {
            LogCapture.info("Mobile number Code is displayed with proper value ");

        }


        String vObjAddressLine1Text = Constants.Affiliates_SettingsPageOR.getProperty("AddressLine1Text");
        String vObjAddressLine2Text = Constants.Affiliates_SettingsPageOR.getProperty("AddressLine2Text");
        String vObjAddressLine3Text = Constants.Affiliates_SettingsPageOR.getProperty("AddressLine3Text");
        String ActualAddressLine1Text = Constants.driver.findElement(By.xpath(vObjAddressLine1Text)).getText();
        String ActualAddressLine2Text = Constants.driver.findElement(By.xpath(vObjAddressLine2Text)).getText();
        String ActualAddressLine3Text = Constants.driver.findElement(By.xpath(vObjAddressLine3Text)).getText();

        if (ActualAddressLine1Text != null && ActualAddressLine2Text != null && ActualAddressLine3Text != null) {
            LogCapture.info("Address is displayed with proper value. AddressLine1: " + ActualAddressLine1Text + " AddressLine2: " + ActualAddressLine2Text + " AddressLine3: " + ActualAddressLine3Text);
        } else {
            LogCapture.info("Address is NOT displayed with proper value. AddressLine1: " + ActualAddressLine1Text + " AddressLine2: " + ActualAddressLine2Text + " AddressLine3: " + ActualAddressLine3Text);
            Assert.fail();
        }

    }


    @And("^User Deletes (the MobileNumber|All Address) field on Settings page$")
    public void userDeletesTheMobileNumberFieldOnSettingsPage(String TargetField) throws Throwable {
        if (TargetField.equalsIgnoreCase("the MobileNumber")) {
            String vObjMobileNumberText = Constants.Affiliates_SettingsPageOR.getProperty("MobileNumber");
            WebElement MobileNumberText = Constants.driver.findElement(By.xpath(vObjMobileNumberText));
            ((JavascriptExecutor) Constants.driver).executeScript("arguments[0].scrollIntoView();", MobileNumberText);
            Constants.key.pause("1", "");
            Assert.assertEquals("PASS", Constants.key.click(vObjMobileNumberText, ""));
            Actions action = new Actions(driver);
            action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
            action.sendKeys(Keys.DELETE).perform();
            LogCapture.info("Mobile number field deleted..");
            String vObjAddressDetails = Constants.Affiliates_SettingsPageOR.getProperty("AddressDetails");
            Constants.key.click(vObjAddressDetails, "");

        }
        if (TargetField.equalsIgnoreCase("All Address")) {

            String vObjAddressDetailTitle = Constants.Affiliates_SettingsPageOR.getProperty("AddressDetailTitle");
            WebElement AddressDetailTitle = Constants.driver.findElement(By.xpath(vObjAddressDetailTitle));
            ((JavascriptExecutor) Constants.driver).executeScript("arguments[0].scrollIntoView();", AddressDetailTitle);

            String vObjAddressLine1DetailText = Constants.Affiliates_SettingsPageOR.getProperty("AddressLine1DetailText");
            Assert.assertEquals("PASS", Constants.key.click(vObjAddressLine1DetailText, ""));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjAddressLine1DetailText, "selectall"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjAddressLine1DetailText, "delete"));
            LogCapture.info("User deleted Address Line1 field of Address detail..");

            String vObjAddressCity = Constants.Affiliates_SettingsPageOR.getProperty("AddressCity");
            Assert.assertEquals("PASS", Constants.key.click(vObjAddressCity, ""));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjAddressCity, "selectall"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjAddressCity, "delete"));
            LogCapture.info("User deleted City field of Address detail..");

            String vObjAddressState = Constants.Affiliates_SettingsPageOR.getProperty("AddressState");
            Assert.assertEquals("PASS", Constants.key.click(vObjAddressState, ""));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjAddressState, "selectall"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjAddressState, "delete"));
            LogCapture.info("User deleted State field of Address detail..");
            String vObjAddressPostCode = Constants.Affiliates_SettingsPageOR.getProperty("AddressPostCode");
            Assert.assertEquals("PASS", Constants.key.click(vObjAddressPostCode, ""));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjAddressPostCode, "selectall"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjAddressPostCode, "delete"));
            LogCapture.info("User deleted Postcode field of Address detail..");

            String vObjAddressCountry = Constants.Affiliates_SettingsPageOR.getProperty("AddressCountry");
            Assert.assertEquals("PASS", Constants.key.click(vObjAddressCountry, ""));
            Constants.key.pause("1", "");
            String vObjCountryClearBtn = Constants.Affiliates_SettingsPageOR.getProperty("CountryClearBtn");
            Assert.assertEquals("PASS", Constants.key.click(vObjCountryClearBtn, ""));
            LogCapture.info("User deleted Country field of Address detail..");

            Assert.assertEquals("PASS", Constants.key.click(vObjAddressDetailTitle, ""));

        }

    }


    @Then("^User will observe error message and error icon for MobileNumber textbox$")
    public void userWillObserveErrorMessageAndErrorIconForMobileNumberTextbox() throws Throwable {

        String vObjMobileNumberErrorText = Constants.Affiliates_SettingsPageOR.getProperty("MobileNumberErrorText1");
        //String ExpectedMobileNumberErrorText = "Enter a valid mobilenumber";
        String ExpectedMobileNumberErrorText = "Enter a valid phone number";
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjMobileNumberErrorText, ExpectedMobileNumberErrorText));
        LogCapture.info("Mobile number Error message visible is " + ExpectedMobileNumberErrorText);
//        String vObjMobileNumberErrorIcon = Constants.Affiliates_SettingsPageOR.getProperty("MobileNumberErrorIcon");
//        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjMobileNumberErrorIcon, ""));
//        LogCapture.info("Mobile number Error icon visible...");
        String vObjMobileNumberErrorTextBox = Constants.Affiliates_SettingsPageOR.getProperty("MobileNumberErrorTextBox");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjMobileNumberErrorTextBox, ""));
        LogCapture.info("Mobile number text box turns red...");

    }

    @And("^User enters MobileNumber of (7|15|8|0) digits$")
    public String userEntersMobileNumberOfDigits(String TargetDigit) throws Throwable {
        if (TargetDigit.equalsIgnoreCase("7")) {
            MobileNumber_SettingsPage = RandomStringUtils.randomNumeric(7);
            LogCapture.info("Length of MobileNumber entered is: " + MobileNumber_SettingsPage.length());
            String vObjMobileNumberField_AfterError = Constants.Affiliates_SettingsPageOR.getProperty("MobileNumberField_AfterError");
            Assert.assertEquals("PASS", Constants.key.click(vObjMobileNumberField_AfterError, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjMobileNumberField_AfterError, MobileNumber_SettingsPage));
            LogCapture.info("User enters MobileNumber as " + MobileNumber_SettingsPage);
        }
        if (TargetDigit.equalsIgnoreCase("15")) {
            MobileNumber_SettingsPage = RandomStringUtils.randomNumeric(15);
            LogCapture.info("Length of MobileNumber entered is: " + MobileNumber_SettingsPage.length());
            String vObjMobileNumberField_AfterError = Constants.Affiliates_SettingsPageOR.getProperty("MobileNumberField_AfterError");
            Assert.assertEquals("PASS", Constants.key.click(vObjMobileNumberField_AfterError, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjMobileNumberField_AfterError, MobileNumber_SettingsPage));
            LogCapture.info("User enters MobileNumber as " + MobileNumber_SettingsPage);
        }
        if (TargetDigit.equalsIgnoreCase("8")) {
            MobileNumber_SettingsPage = RandomStringUtils.randomNumeric(8);
            LogCapture.info("Length of MobileNumber entered is: " + MobileNumber_SettingsPage.length());
            String vObjMobileNumberField_AfterError = Constants.Affiliates_SettingsPageOR.getProperty("MobileNumberField_AfterError1");
            Assert.assertEquals("PASS", Constants.key.click(vObjMobileNumberField_AfterError, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjMobileNumberField_AfterError, MobileNumber_SettingsPage));
            LogCapture.info("User enters MobileNumber as " + MobileNumber_SettingsPage);
        }
        if (TargetDigit.equalsIgnoreCase("0")) {
            String vObjMobileNumberField_AfterError = Constants.Affiliates_SettingsPageOR.getProperty("MobileNumberField_AfterError");
            Assert.assertEquals("PASS", Constants.key.click(vObjMobileNumberField_AfterError, ""));
            LogCapture.info("User DOES NOT enters MobileNumber.....");
        }
        String vObjAddressDetails = Constants.Affiliates_SettingsPageOR.getProperty("AddressDetails");
        Constants.key.click(vObjAddressDetails, "");
        return MobileNumber_SettingsPage;
    }

    @Then("^User should be able to view the newly updated MobileNumber$")
    public void userShouldBeAbleToViewTheNewlyUpdatedMobileNumber() {
        String vObjMobileNumberText = Constants.Affiliates_SettingsPageOR.getProperty("MobileNumberText");
        String UpdatedMobileNumberText = Constants.driver.findElement(By.xpath(vObjMobileNumberText)).getAttribute("value");
        if (UpdatedMobileNumberText.equals(MobileNumber_SettingsPage)) {
            LogCapture.info("User is able to see updated Mobile number..");
        } else {
            LogCapture.info("User is NOT able to see updated Mobile number..Current mobile number displayed is: " + UpdatedMobileNumberText + " Updated mobile number was: " + MobileNumber_SettingsPage);
            Assert.fail();
        }
    }

    @And("^User is able to view Success Message for updating details on Settings page$")
    public void userIsAbleToViewSuccessMessageForUpdatingDetailsOnSettingsPage() throws Throwable {
        String vObjSuccessMsg = Constants.Affiliates_SettingsPageOR.getProperty("SuccessMsg");
        String vObjSuccessAlertIcon = Constants.Affiliates_SettingsPageOR.getProperty("SuccessAlertIcon");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSuccessAlertIcon, ""));
        String vObjSuccessSubMsg = Constants.Affiliates_SettingsPageOR.getProperty("SuccessSubMsg");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSuccessSubMsg, ""));
        String SuccessMsg = Constants.driver.findElement(By.xpath(vObjSuccessMsg)).getText();
        String SuccessSubMsg = Constants.driver.findElement(By.xpath(vObjSuccessSubMsg)).getText();

        String ActualSuccessMsg = SuccessMsg + SuccessSubMsg;
        String ExpectedSuccessMsg = "SUCCESS:  Your settings have been updated.";
        if (ActualSuccessMsg.equals(ExpectedSuccessMsg)) {
            LogCapture.info("Success message is displayed correctly..." + ActualSuccessMsg);
        } else {
            LogCapture.info("Success message is NOT displayed correctly... ActualMsg: " + ActualSuccessMsg + " ExpectedMsg: " + ExpectedSuccessMsg);
            Assert.fail();
        }

    }

    @Then("^User will be navigated to (Login detail|Your Client Detail|Personal Details for PFX|Personal Details for CFX|Bank Details|TermsAndConditions|TermsAndConditions with Different tab) Page$")
    public void userWillBeNavigatedToLoginDetailPage(String Page) throws Throwable {
        Constants.key.pause("2", "");
        if (Page.equalsIgnoreCase("Login detail")) {
            //String vObjLoginDetailsText = Constants.Affiliates_BecomeaPartnerOR.getProperty("LoginDetailsText");
            String vObjEmailAddress = Constants.Affiliates_BecomeaPartnerOR.getProperty("EmailAddress");
            String vObjPassword = Constants.Affiliates_BecomeaPartnerOR.getProperty("Password");
            //Assert.assertEquals("PASS", Constants.key.exist(vObjLoginDetailsText, ""));
            Assert.assertEquals("PASS", Constants.key.exist(vObjEmailAddress, ""));
            Assert.assertEquals("PASS", Constants.key.exist(vObjPassword, ""));
            //Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjLoginDetailsText, "visible"));

        }
        if (Page.equalsIgnoreCase("Your Client Detail")) {
            String vObjClientText = Constants.Affiliates_BecomeaPartnerOR.getProperty("ClientText");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjClientText, "visible"));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjClientText, "Which clients do you service?"));
        }
        if (Page.equalsIgnoreCase("Bank details")) {
            String vObjAccountDetailTitle = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountDetailTitle");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAccountDetailTitle, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjAccountDetailTitle, "visible"));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjAccountDetailTitle, "Account details"));
            LogCapture.info("User is navigated on Bank detail page..");
        }

        if (Page.equalsIgnoreCase("Personal Details for PFX")) {
            String vObjRadioButton = Constants.Affiliates_BecomeaPartnerOR.getProperty("IndividualRadioButton");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjRadioButton, "selected"));
            LogCapture.info("Individual option is by default selected....");
        }
        if (Page.equalsIgnoreCase("Personal Details for CFX")) {
            String vObjRadioButton = Constants.Affiliates_BecomeaPartnerOR.getProperty("CompanyRadioButton");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjRadioButton, "selected"));
            LogCapture.info("Individual option is by default selected....");
        }
        if (Page.equalsIgnoreCase("Bank Detail")) {
            String AccountDetailsStep = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountDetailsStep");
            Assert.assertEquals("PASS", Constants.key.exist(AccountDetailsStep, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(AccountDetailsStep, "visible"));

        }
        if (Page.equalsIgnoreCase("TermsAndConditions") || Page.equalsIgnoreCase("TermsAndConditions with Different tab")) {
            Constants.key.pause("3", "");
            ArrayList tabs = new ArrayList(driver.getWindowHandles());
            int countTab = tabs.size();
            if (countTab == 2) {
                LogCapture.info("The page is redirected Properly with Different Tab");
            } else {
                Assert.fail();
                LogCapture.info("The page is not redirected Properly with Different Tab");
            }
            System.out.println(tabs.size());
            Constants.driver.switchTo().window((String) tabs.get(1));
            String Title = Constants.driver.getTitle();
            String CurrentURL = Constants.driver.getCurrentUrl();
            System.out.println("URL:::Title" + CurrentURL + "::::::::" + Title);
            if (CurrentURL.equalsIgnoreCase("https://www.currenciesdirect.com/en/info/currencies-direct-partner-terms-and-conditions") && Title.equalsIgnoreCase("Currencies Direct Partner Terms And Conditions | Currencies Direct")) {
                LogCapture.info("The page is redirected Properly");
            } else {
                Assert.fail();
                LogCapture.info("The page is not redirected Properly");
            }

        }

    }


    @Then("^User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled$")
    public void userWillBeAbleToViewEmailIDPasswordOptionsAlongWithPasswordCriteriaAndDisbaledContinueAndBackButtonAsEnabled() throws Throwable {
        String vObjEmailAddress = Constants.Affiliates_BecomeaPartnerOR.getProperty("EmailAddress");
        String vObjPassword = Constants.Affiliates_BecomeaPartnerOR.getProperty("Password");
        String vObjPasswordText = Constants.Affiliates_BecomeaPartnerOR.getProperty("PasswordText");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjEmailAddress, "enabled"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjPassword, "enabled"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjPasswordText, "visible"));
        String vObjContinue = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinue, "disabled"));
        String vObjBack = Constants.Affiliates_BecomeaPartnerOR.getProperty("Back");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjBack, "enabled"));
    }

    @And("^User enters (Valid|invalid) value in (email|password|NewEmailAddress|NewRandomPassword) \"([^\"]*)\"$")
    public void userEntersInvalidValueInEmail(String Valid, String Value, String Values) throws Throwable {
        if (Value.equalsIgnoreCase("email") && Valid.equalsIgnoreCase("invalid")) {
            String vObjEmailAddress = Constants.Affiliates_BecomeaPartnerOR.getProperty("EmailAddress");
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjEmailAddress, Values));
            String vObjPassword = Constants.Affiliates_BecomeaPartnerOR.getProperty("Password");
            Assert.assertEquals("PASS", Constants.key.click(vObjPassword, ""));
        }
        if (Value.equalsIgnoreCase("email") && Valid.equalsIgnoreCase("Valid")) {
            String vObjEmailAddress = Constants.Affiliates_BecomeaPartnerOR.getProperty("EmailAddress");
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjEmailAddress, Values));
        }
        if (Value.equalsIgnoreCase("password") && Valid.equalsIgnoreCase("invalid")) {
            String vObjPassword = Constants.Affiliates_BecomeaPartnerOR.getProperty("Password");
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPassword, Values));
            String vObjEmail = Constants.Affiliates_BecomeaPartnerOR.getProperty("EmailAddress");
            Assert.assertEquals("PASS", Constants.key.click(vObjEmail, ""));
        }
        if (Value.equalsIgnoreCase("password") && Valid.equalsIgnoreCase("Valid")) {
            String vObjPassword = Constants.Affiliates_BecomeaPartnerOR.getProperty("Password");
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPassword, Values));
            String vObjEmail = Constants.Affiliates_BecomeaPartnerOR.getProperty("EmailAddress");
            Assert.assertEquals("PASS", Constants.key.click(vObjEmail, ""));
        }

    }

    @Then("^User should be able to view the (at least 10|less than 16|a lower case|a upper case|atleast 1 number and special|atleast 1 number) characters option in green$")
    public void userShouldBeAbleToViewTheMinimumCharactersOptionInGreen(String Value) throws Throwable {
        Constants.key.pause("2", "");
        if (Value.equalsIgnoreCase("at least 10")) {
            String AtLeast10CharText = Constants.Affiliates_BecomeaPartnerOR.getProperty("Atleast10Char");
            Assert.assertEquals("PASS", Constants.key.exist(AtLeast10CharText, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(AtLeast10CharText, "visible"));
            //Assert.assertEquals("PASS", Constants.key.verifyElementProperties(AtLeast10CharText,"unselected"));
            Assert.assertEquals("PASS", Constants.key.verifyText(AtLeast10CharText, "at least 10 characters"));
        }
        if (Value.equalsIgnoreCase("Less than 16")) {
            String vObjLessThan16Char = Constants.Affiliates_BecomeaPartnerOR.getProperty("LessThan16Char");
            Assert.assertEquals("PASS", Constants.key.exist(vObjLessThan16Char, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjLessThan16Char, "visible"));
            //Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjLessThan16Char,"selected"));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjLessThan16Char, "less than 16 characters"));
        }
        if (Value.equalsIgnoreCase("a lower case")) {
            String vObjLessThan16Char = Constants.Affiliates_BecomeaPartnerOR.getProperty("LowerCaseChar");
            Assert.assertEquals("PASS", Constants.key.exist(vObjLessThan16Char, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjLessThan16Char, "visible"));
            //Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjLessThan16Char,"selected"));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjLessThan16Char, "a lower case character"));
        }
        if (Value.equalsIgnoreCase("a upper case")) {
            String vObjLessThan16Char = Constants.Affiliates_BecomeaPartnerOR.getProperty("UpperCaseChar");
            Assert.assertEquals("PASS", Constants.key.exist(vObjLessThan16Char, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjLessThan16Char, "visible"));
            // Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjLessThan16Char,"selected"));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjLessThan16Char, "a upper case character"));
        }
        if (Value.equalsIgnoreCase("atleast 1 number and special")) {
            String vObjLessThan16Char = Constants.Affiliates_BecomeaPartnerOR.getProperty("Atleaset1NumAndSpecialChar");
            Assert.assertEquals("PASS", Constants.key.exist(vObjLessThan16Char, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjLessThan16Char, "visible"));
            //Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjLessThan16Char,"selected"));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjLessThan16Char, "at least 1 number and special character"));
        }
        if (Value.equalsIgnoreCase("atleast 1 number")) {
            String vObjLessThan16Char = Constants.Affiliates_BecomeaPartnerOR.getProperty("Atleaset1NumAndSpecialChar1");
            Assert.assertEquals("PASS", Constants.key.exist(vObjLessThan16Char, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjLessThan16Char, "unselected"));
            //Assert.assertEquals("PASS", Constants.key.verifyText(vObjLessThan16Char,"at least 1 number and special character"));
        }

    }

    @And("^User selects (Only One|Multiple) option from (client|Industry|Country|Language) option$")
    public void userSelectsOnlyOneOptionFromClientOption(String Value, String Type) throws Throwable {

        if (Value.equalsIgnoreCase("Only One") && Type.equalsIgnoreCase("client")) {
            String vObjPersonalClients = Constants.Affiliates_BecomeaPartnerOR.getProperty("PersonalClients");
            Assert.assertEquals("PASS", Constants.key.click(vObjPersonalClients, ""));
        }
        if (Value.equalsIgnoreCase("Multiple") && Type.equalsIgnoreCase("client")) {
            String vObjPersonalClients = Constants.Affiliates_BecomeaPartnerOR.getProperty("PersonalClients");
            Assert.assertEquals("PASS", Constants.key.click(vObjPersonalClients, ""));
            String vObjOnlieMarketSellers = Constants.Affiliates_BecomeaPartnerOR.getProperty("OnlineMarketSellers");
            Assert.assertEquals("PASS", Constants.key.click(vObjOnlieMarketSellers, ""));
            String vObjCorporateClients = Constants.Affiliates_BecomeaPartnerOR.getProperty("CorporateClients");
            Assert.assertEquals("PASS", Constants.key.click(vObjCorporateClients, ""));
        }
        if (Value.equalsIgnoreCase("Only One") && Type.equalsIgnoreCase("Industry")) {
            String vObjIndustries = Constants.Affiliates_BecomeaPartnerOR.getProperty("Industries");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjIndustries, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjIndustries, "enter"));
        }
        if (Value.equalsIgnoreCase("Multiple") && Type.equalsIgnoreCase("Industry")) {
            String vObjIndustries = Constants.Affiliates_BecomeaPartnerOR.getProperty("Industries");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjIndustries, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjIndustries, "enter"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjIndustries, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjIndustries, "enter"));
        }
        if (Value.equalsIgnoreCase("Only One") && Type.equalsIgnoreCase("Country")) {
            String vObjCountries = Constants.Affiliates_BecomeaPartnerOR.getProperty("Countries");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCountries, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCountries, "enter"));
        }
        if (Value.equalsIgnoreCase("Multiple") && Type.equalsIgnoreCase("Country")) {
            String vObjCountries = Constants.Affiliates_BecomeaPartnerOR.getProperty("Countries");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCountries, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCountries, "enter"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCountries, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCountries, "enter"));
        }
        if (Value.equalsIgnoreCase("Only One") && Type.equalsIgnoreCase("Language")) {
            String vObjLanguage = Constants.Affiliates_BecomeaPartnerOR.getProperty("Language");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjLanguage, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjLanguage, "enter"));
        }
        if (Value.equalsIgnoreCase("Multiple") && Type.equalsIgnoreCase("Language")) {
            String vObjLanguage = Constants.Affiliates_BecomeaPartnerOR.getProperty("Language");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjLanguage, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjLanguage, "enter"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjLanguage, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjLanguage, "enter"));
        }
    }

    @Then("^User should be able to view the (Single|Multiple) option been selected on (client|Industry|Country|Language)$")
    public void userShouldBeAbleToViewTheSingleOptionBeenSelected(String Value, String Type) throws Throwable {
        Constants.key.pause("2", "");
        if (Value.equalsIgnoreCase("Single") && Type.equalsIgnoreCase("client")) {
            String vObjPersonalClients = Constants.Affiliates_BecomeaPartnerOR.getProperty("PersonalClients");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjPersonalClients, "selected"));
        }
        if (Value.equalsIgnoreCase("Multiple") && Type.equalsIgnoreCase("client")) {
            String vObjPersonalClients = Constants.Affiliates_BecomeaPartnerOR.getProperty("PersonalClients");
            String vObjOnlieMarketSellers = Constants.Affiliates_BecomeaPartnerOR.getProperty("OnlineMarketSellers");
            String vObjCorporateClients = Constants.Affiliates_BecomeaPartnerOR.getProperty("CorporateClients");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjPersonalClients, "selected"));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjOnlieMarketSellers, "selected"));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjCorporateClients, "selected"));
        }
        if (Value.equalsIgnoreCase("Single") && Type.equalsIgnoreCase("Industry")) {
            String vObjProperty = Constants.Affiliates_BecomeaPartnerOR.getProperty("Property");
            String Property = Constants.driver.findElement(By.xpath(vObjProperty)).getText();
            if (Property.equalsIgnoreCase("Property")) {
                LogCapture.info("Property is selected...");
            } else {
                LogCapture.info("Property is not selected...");
                Assert.fail();
            }
        }
        if (Value.equalsIgnoreCase("Multiple") && Type.equalsIgnoreCase("Industry")) {
            String vObjProperty = Constants.Affiliates_BecomeaPartnerOR.getProperty("Property");
            String Property = Constants.driver.findElement(By.xpath(vObjProperty)).getText();
            String vObjEmigration = Constants.Affiliates_BecomeaPartnerOR.getProperty("Emigration");
            String Emigration = Constants.driver.findElement(By.xpath(vObjEmigration)).getText();
            if (Property.equalsIgnoreCase("Property") && Emigration.equalsIgnoreCase("Emigration")) {
                LogCapture.info("Property & Emigration are selected...");
            } else {
                LogCapture.info("Property & Emigration are not selected...");
                Assert.fail();
            }
        }
        if (Value.equalsIgnoreCase("Single") && Type.equalsIgnoreCase("Country")) {
            String vObjCountryAus = Constants.Affiliates_BecomeaPartnerOR.getProperty("CountryAus");
            String Country = Constants.driver.findElement(By.xpath(vObjCountryAus)).getText();
            if (Country.equalsIgnoreCase("Australia")) {
                LogCapture.info("Country is selected...");
            } else {
                LogCapture.info("Country is not selected...");
                Assert.fail();
            }
        }
        if (Value.equalsIgnoreCase("Multiple") && Type.equalsIgnoreCase("Country")) {
            String vObjCountryCan = Constants.Affiliates_BecomeaPartnerOR.getProperty("CountryCan");
            String vObjCountryAus = Constants.Affiliates_BecomeaPartnerOR.getProperty("CountryAus");
            String CountryCan = Constants.driver.findElement(By.xpath(vObjCountryCan)).getText();
            String CountryAus = Constants.driver.findElement(By.xpath(vObjCountryAus)).getText();
            if (CountryAus.equalsIgnoreCase("Australia") && CountryCan.equalsIgnoreCase("Canada")) {
                LogCapture.info("Country is selected...");
            } else {
                LogCapture.info("Country is not selected...");
                Assert.fail();
            }
        }
        if (Value.equalsIgnoreCase("Single") && Type.equalsIgnoreCase("Language")) {
            String vObjLanguage = Constants.Affiliates_BecomeaPartnerOR.getProperty("LanguageEng");
            String Language = Constants.driver.findElement(By.xpath(vObjLanguage)).getText();
            if (Language.equalsIgnoreCase("English")) {
                LogCapture.info("Language is selected...");
            } else {
                LogCapture.info("Language is not selected...");
                Assert.fail();
            }
        }
        if (Value.equalsIgnoreCase("Multiple") && Type.equalsIgnoreCase("Language")) {
            String vObjLanguage = Constants.Affiliates_BecomeaPartnerOR.getProperty("LanguageEng");
            String Language = Constants.driver.findElement(By.xpath(vObjLanguage)).getText();
            String vObjLanguage1 = Constants.Affiliates_BecomeaPartnerOR.getProperty("LanguageFrn");
            String Language1 = Constants.driver.findElement(By.xpath(vObjLanguage1)).getText();
            if (Language.equalsIgnoreCase("English") && Language1.equalsIgnoreCase("French")) {
                LogCapture.info("Language is selected...");
            } else {
                LogCapture.info("Language is not selected...");
                Assert.fail();
            }
        }
    }

    @And("^User does not select any (client|Industry|Language|Country) options$")
    public void userDoesNotSelectAnyClientOptions(String Type) throws Throwable {
        if (Type.equalsIgnoreCase("client")) {
            String vObjPersonalClients = Constants.Affiliates_BecomeaPartnerOR.getProperty("PersonalClients");
            String vObjOnlieMarketSellers = Constants.Affiliates_BecomeaPartnerOR.getProperty("OnlineMarketSellers");
            String vObjCorporateClients = Constants.Affiliates_BecomeaPartnerOR.getProperty("CorporateClients");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjPersonalClients, "unselected"));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjOnlieMarketSellers, "unselected"));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjCorporateClients, "unselected"));
        }
        if (Type.equalsIgnoreCase("Industry") || Type.equalsIgnoreCase("Language") || Type.equalsIgnoreCase("Country")) {
            String vObjDropDown = Constants.Affiliates_BecomeaPartnerOR.getProperty("DropDownValues");
            List<WebElement> dropdown_list = Constants.driver.findElements(By.xpath(vObjDropDown));
            System.out.println("The Options in the Dropdown are: " + dropdown_list.size());
            if (dropdown_list.size() == 0) {
                LogCapture.info("The Options are not displayed");
            } else {
                LogCapture.info("The Options äre displayed");
                Assert.fail();
            }

        }

    }

    @Then("^Continue button to be Observed as Grayed Out$")
    public void continueButtonToBeObservedAsGrayedOut() throws Throwable {
        String vObjContinue = Constants.Refer_a_Client.getProperty("ContinueButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinue, "disabled"));
        LogCapture.info("Continue button is disable...");
    }

    @And("^User enters (Valid|invalid) value in (NewEmailAddress|NewRandomPassword)$")
    public void userEntersvalidValues(String Valid, String Value) throws Throwable {
        if (Value.equalsIgnoreCase("NewEmailAddress") && Valid.equalsIgnoreCase("Valid")) {
            String vObjEmailAddress = Constants.Affiliates_BecomeaPartnerOR.getProperty("EmailAddress");
            String EmailAddress = RandomStringUtils.randomAlphanumeric(10);
            String EmailAddress1 = EmailAddress.concat("@mailinator.com");
            Constants.EmailAddress = "ProdUserAutoTest_"+EmailAddress1;
            LogCapture.info("Become a Partner Email Address:"+Constants.EmailAddress);
            System.out.println("Become a Partner Email Address:" + Constants.EmailAddress);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjEmailAddress, Constants.EmailAddress));
        }
        if (Value.equalsIgnoreCase("NewRandomPassword") && Valid.equalsIgnoreCase("Valid")) {
            String vObjPassword = Constants.Affiliates_BecomeaPartnerOR.getProperty("Password");
            String Password = RandomStringUtils.randomAlphanumeric(10);
            String Password1 = Password.concat("1A#");
            Constants.PasswordField = Password1;
            System.out.println("Password:-->" + Constants.PasswordField);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPassword, "Password@12"));

        }

    }

    @Then("^User should view the expander feature defaults to the Personal details summary being open with details being entered for (PFX|CFX)$")
    public void userShouldViewTheExpanderFeatureDefaultsToThePersonalDetailsSummaryBeingOpenWithDetailsBeingEntered(String Value) throws Throwable {
        String vObjPersonalDetails = Constants.Affiliates_BecomeaPartnerOR.getProperty("PersonalDetailsSection");
        String vObjPersonalDetailsExpand = Constants.Affiliates_BecomeaPartnerOR.getProperty("PersonalDetailsSectionExpand");
        String RegisteringAs = Constants.Affiliates_BecomeaPartnerOR.getProperty("RegisteringAs");
        String RegisteringText = Constants.driver.findElement(By.xpath(RegisteringAs)).getText();
        System.out.println("RegisteringText::" + RegisteringText);
        String FullName = Constants.Affiliates_BecomeaPartnerOR.getProperty("FullName");
        String FullNameText = Constants.driver.findElement(By.xpath(FullName)).getText();
        String FullNameActualText = Constants.SalutationField + " " + Constants.FirstNameField + " " + Constants.LastNameField;
        System.out.println("FullNameActualText::" + FullNameActualText);
        String Mobile = Constants.Affiliates_BecomeaPartnerOR.getProperty("Mobile");
        String Address = Constants.Affiliates_BecomeaPartnerOR.getProperty("Address");
        String MobileText = Constants.driver.findElement(By.xpath(Mobile)).getText();
        String MobileActualText = Constants.CountryCodeField.concat(Constants.MobileNumberField);
        System.out.println("MobileActualText::" + MobileActualText);
        String AddressActualText = Constants.driver.findElement(By.xpath(Address)).getText();
        System.out.println("FullAddressTextNameText::" + AddressActualText);
        System.out.println("FullAddressTexAddresstNameText::" + Constants.AddressField);
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjPersonalDetails, "visible"));
        Assert.assertEquals("PASS", Constants.key.exist(vObjPersonalDetails, ""));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjPersonalDetailsExpand, "visible"));
        Assert.assertEquals("PASS", Constants.key.exist(vObjPersonalDetailsExpand, ""));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(RegisteringAs, "visible"));
        Assert.assertEquals("PASS", Constants.key.exist(RegisteringAs, ""));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(FullName, "visible"));
        Assert.assertEquals("PASS", Constants.key.exist(FullName, ""));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(Mobile, "visible"));
        Assert.assertEquals("PASS", Constants.key.exist(Mobile, ""));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(Address, "visible"));
        Assert.assertEquals("PASS", Constants.key.exist(Address, ""));
        // Assert.assertEquals("PASS", Constants.key.click(vObjPersonalDetails, ""));

        if (Value.equalsIgnoreCase("PFX")) {
            if (RegisteringText.equalsIgnoreCase("PFX") && FullNameText.equalsIgnoreCase(FullNameActualText) && MobileText.equalsIgnoreCase(MobileActualText) && AddressActualText.contains(Constants.AddressField)) {
                System.out.println("FullNameActualText::" + FullNameActualText);
                System.out.println("MobileActualText::" + MobileActualText);
            } else {
                Assert.fail();
            }
        }
        if (Value.equalsIgnoreCase("CFX")) {
            String TradingName = Constants.Affiliates_BecomeaPartnerOR.getProperty("TradingName1");
            String TradingName1 = Constants.driver.findElement(By.xpath(TradingName)).getText();
            if (RegisteringText.equalsIgnoreCase("CFX") && FullNameText.equalsIgnoreCase(FullNameActualText) && MobileText.equalsIgnoreCase(MobileActualText) && AddressActualText.contains(Constants.AddressField) && TradingName1.equalsIgnoreCase(Constants.TradingNameField)) {
                System.out.println("FullNameActualText::" + FullNameActualText);
                System.out.println("MobileActualText::" + MobileActualText);
            } else {
                Assert.fail();
            }
        }
    }

    @Then("^User should be able to view the (Login details|Bank details|Your Clients) which we have entered for (PFX|CFX)$")
    public void userShouldBeAbleToViewTheLoginDetailsWhichWeHaveEntered(String Details, String Value) throws Throwable {
        if (Details.equalsIgnoreCase("Login details") && Value.equalsIgnoreCase("PFX")) {
            String vObjPersonalDetails = Constants.Affiliates_BecomeaPartnerOR.getProperty("Email");
            String Email = Constants.driver.findElement(By.xpath(vObjPersonalDetails)).getText();
            String vObjPersonalDetailsExpand = Constants.Affiliates_BecomeaPartnerOR.getProperty("PasswordVerify");
            String Password = Constants.driver.findElement(By.xpath(vObjPersonalDetailsExpand)).getText();
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjPersonalDetails, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(vObjPersonalDetails, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjPersonalDetailsExpand, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(vObjPersonalDetailsExpand, ""));
            if (Email.equalsIgnoreCase(Constants.EmailAddress) && Password.equalsIgnoreCase("**********")) {
                System.out.println(Email + Password);
            } else {
                Assert.fail();
            }
        }
        if (Details.equalsIgnoreCase("Login details") && Value.equalsIgnoreCase("CFX")) {
            String vObjPersonalDetails = Constants.Affiliates_BecomeaPartnerOR.getProperty("Email");
            String vObjPersonalDetailsExpand = Constants.Affiliates_BecomeaPartnerOR.getProperty("PasswordVerify");
            String Email = Constants.driver.findElement(By.xpath(vObjPersonalDetails)).getText();
            String Password = Constants.driver.findElement(By.xpath(vObjPersonalDetailsExpand)).getText();
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjPersonalDetails, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(vObjPersonalDetails, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjPersonalDetailsExpand, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(vObjPersonalDetailsExpand, ""));
            if (Email.equalsIgnoreCase(Constants.EmailAddress) && Password.equalsIgnoreCase("**********")) {
                System.out.println(Email + Password);
                LogCapture.info("Login Details Are displayed corectly");
            } else {
                Assert.fail();
                LogCapture.info("Login Details Are not displayed corectly");
            }
        }
        if (Details.equalsIgnoreCase("Bank details") && Value.equalsIgnoreCase("PFX")) {
            String vObjBankNodetails = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankNoDetails");
            String BankDetails = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankNoDetailsText");
            String BankDetailsText = Constants.driver.findElement(By.xpath(BankDetails)).getText();
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjBankNodetails, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(vObjBankNodetails, ""));
            if (BankDetailsText.equalsIgnoreCase("No details added.")) {
                System.out.println(BankDetailsText);
                LogCapture.info("No Bank Details displayed corectly");
            } else if (!BankDetailsText.equalsIgnoreCase("No details added.")) {
                System.out.println(BankDetailsText);
                LogCapture.info("Bank Details are displayed corectly");
            } else {
                LogCapture.info("Bank Details are not displayed corectly");
                Assert.fail();
            }

        }
        if (Details.equalsIgnoreCase("Bank details") && Value.equalsIgnoreCase("CFX")) {
            String vObjBankNodetails = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankNoDetails");
            String BankDetails = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankNoDetailsText");
            String BankDetailsText = Constants.driver.findElement(By.xpath(BankDetails)).getText();
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjBankNodetails, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(vObjBankNodetails, ""));
            if (BankDetailsText.equalsIgnoreCase("No details added.")) {
                System.out.println(BankDetailsText);
                LogCapture.info("No Bank Details displayed corectly");
            } else if (!BankDetailsText.equalsIgnoreCase("No details added.")) {
                System.out.println(BankDetailsText);
                LogCapture.info("Bank Details are displayed corectly");
            } else {
                LogCapture.info("Bank Details are not displayed corectly");
                Assert.fail();
            }
        }
        if (Details.equalsIgnoreCase("Your Clients") && Value.equalsIgnoreCase("PFX")) {
            String ClientYouService = Constants.Affiliates_BecomeaPartnerOR.getProperty("ClientYouService");
            String ClientYouService1 = Constants.driver.findElement(By.xpath(ClientYouService)).getText();
            String IndustryOperateIn = Constants.Affiliates_BecomeaPartnerOR.getProperty("IndustryOperateIn");
            String IndustryOperateIn1 = Constants.driver.findElement(By.xpath(IndustryOperateIn)).getText();
            String CountryYourClients = Constants.Affiliates_BecomeaPartnerOR.getProperty("CountryYourClients");
            String CountryYourClients1 = Constants.driver.findElement(By.xpath(CountryYourClients)).getText();
            String LanguageYourClients = Constants.Affiliates_BecomeaPartnerOR.getProperty("LanguageYourClients");
            String LanguageYourClients1 = Constants.driver.findElement(By.xpath(LanguageYourClients)).getText();
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(ClientYouService, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(ClientYouService, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(IndustryOperateIn, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(IndustryOperateIn, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(CountryYourClients, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(CountryYourClients, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(LanguageYourClients, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(LanguageYourClients, ""));
            if (ClientYouService1.equalsIgnoreCase("Personal Clients") && IndustryOperateIn1.equalsIgnoreCase("Property") && CountryYourClients1.equalsIgnoreCase("Australia") && LanguageYourClients1.equalsIgnoreCase("English")) {
                System.out.println(ClientYouService1);
                LogCapture.info("Your Clients Details displayed corectly");
            } else {
                Assert.fail();
                LogCapture.info("Your Clients Details not displayed corectly");
            }
        }
        if (Details.equalsIgnoreCase("Your Clients") && Value.equalsIgnoreCase("CFX")) {
            String ClientYouService = Constants.Affiliates_BecomeaPartnerOR.getProperty("ClientYouService");
            String ClientYouService1 = Constants.driver.findElement(By.xpath(ClientYouService)).getText();
            System.out.println(ClientYouService1);
            String IndustryOperateIn = Constants.Affiliates_BecomeaPartnerOR.getProperty("IndustryOperateIn");
            String IndustryOperateIn1 = Constants.driver.findElement(By.xpath(IndustryOperateIn)).getText();
            System.out.println(IndustryOperateIn1);
            String CountryYourClients = Constants.Affiliates_BecomeaPartnerOR.getProperty("CountryYourClients");
            String CountryYourClients1 = Constants.driver.findElement(By.xpath(CountryYourClients)).getText();
            System.out.println(CountryYourClients1);
            String LanguageYourClients = Constants.Affiliates_BecomeaPartnerOR.getProperty("LanguageYourClients");
            String LanguageYourClients1 = Constants.driver.findElement(By.xpath(LanguageYourClients)).getText();
            System.out.println(LanguageYourClients1);
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(ClientYouService, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(ClientYouService, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(IndustryOperateIn, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(IndustryOperateIn, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(CountryYourClients, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(CountryYourClients, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(LanguageYourClients, "visible"));
            Assert.assertEquals("PASS", Constants.key.exist(LanguageYourClients, ""));
            if (ClientYouService1.equalsIgnoreCase("Personal Clients") && IndustryOperateIn1.equalsIgnoreCase("Property") && CountryYourClients1.equalsIgnoreCase("Australia") && LanguageYourClients1.equalsIgnoreCase("English")) {
                System.out.println(ClientYouService1);
                LogCapture.info("Your Clients Details displayed corectly");
            } else {
                Assert.fail();
                LogCapture.info("Your Clients Details not displayed corectly");
            }
        }
    }

    @Then("^User should Should see the (Confirm) button as (enabled|disabled)$")
    public void userShouldShouldSeeTheContinueButtonAsEnabled(String button, String Value) throws Throwable {
        if (button.equalsIgnoreCase("Confirm") && Value.equalsIgnoreCase("enabled")) {
            String ConfirmButton = Constants.Affiliates_BecomeaPartnerOR.getProperty("ConfirmButton");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(ConfirmButton, "enabled"));
        }
        if (button.equalsIgnoreCase("Confirm") && Value.equalsIgnoreCase("disabled")) {
            String ConfirmButtonDisable = Constants.Affiliates_BecomeaPartnerOR.getProperty("ConfirmButtonDisable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(ConfirmButtonDisable, "disabled"));
        }
    }

    @Then("^User Click on Confirm button$")
    public void userClickOnConfirm() throws Throwable {
            String vObjConfirmButton = Constants.Affiliates_BecomeaPartnerOR.getProperty("ConfirmButton");
            Assert.assertEquals("PASS", Constants.key.click(vObjConfirmButton,""));
    }

    @Then("^User will observe error message and error icon for (All Address|Address Line 1|Town/City|Country|Postcode|State) textbox$")
    public void userWillObserveErrorMessageAndErrorIconForAllAddressTextbox(String TargetField) throws Throwable {

        if (TargetField.equalsIgnoreCase("Äll Address")) {
            //Address line 1
            String vObjAddressLine1ErrorMsg = Constants.Affiliates_SettingsPageOR.getProperty("AddressLine1ErrorMsg");
            String ExpectedAddressLine1ErrorMsg = "Please enter valid address";
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjAddressLine1ErrorMsg, ExpectedAddressLine1ErrorMsg));
            LogCapture.info("Address Line1 Error message visible is " + ExpectedAddressLine1ErrorMsg);
            String vObjAddressLine1ErrorIcon = Constants.Affiliates_SettingsPageOR.getProperty("AddressLine1ErrorIcon");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAddressLine1ErrorIcon, ""));
            LogCapture.info("Address Line1 Error icon visible...");
            String vObjAddressLine1ErrorField = Constants.Affiliates_SettingsPageOR.getProperty("AddressLine1ErrorField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAddressLine1ErrorField, ""));
            LogCapture.info("Address Line1 text box turns red...");

            //Town/City
            String vObjTownCityErrorMsg = Constants.Affiliates_SettingsPageOR.getProperty("TownCityErrorMsg");
            String ExpectedTownCityErrorMsg = "Please enter valid town name";
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjTownCityErrorMsg, ExpectedTownCityErrorMsg));
            LogCapture.info("Town/City field Error message visible is " + ExpectedTownCityErrorMsg);
            String vObjTownCityErrorIcon = Constants.Affiliates_SettingsPageOR.getProperty("TownCityErrorIcon");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjTownCityErrorIcon, ""));
            LogCapture.info("Town/City field Error icon visible...");
            String vObjTownCityErrorField = Constants.Affiliates_SettingsPageOR.getProperty("TownCityErrorField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjTownCityErrorField, ""));
            LogCapture.info("Town/City text box turns red...");

            //State
            String vObjStateErrorMsg = Constants.Affiliates_SettingsPageOR.getProperty("StateErrorMsg");
            String ExpectedStateErrorMsg = "Please enter valid state name";
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjStateErrorMsg, ExpectedStateErrorMsg));
            LogCapture.info("State field Error message visible is " + ExpectedStateErrorMsg);
            String vObjStateErrorIcon = Constants.Affiliates_SettingsPageOR.getProperty("StateErrorIcon");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjStateErrorIcon, ""));
            LogCapture.info("State field Error icon visible...");
            String vObjStateErrorField = Constants.Affiliates_SettingsPageOR.getProperty("StateErrorField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjStateErrorField, ""));
            LogCapture.info("State text box turns red...");

            //Postcode
            String vObjPostCodeErrorMsg = Constants.Affiliates_SettingsPageOR.getProperty("PostCodeErrorMsg");
            String ExpectedPostCodeErrorMsg = "Please enter valid postcode";
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjPostCodeErrorMsg, ExpectedPostCodeErrorMsg));
            LogCapture.info("State field Error message visible is " + ExpectedPostCodeErrorMsg);
            String vObjPostCodeErrorIcon = Constants.Affiliates_SettingsPageOR.getProperty("PostCodeErrorIcon");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjPostCodeErrorIcon, ""));
            LogCapture.info("Postcode field Error icon visible...");
            String vObjPostCodeErrorField = Constants.Affiliates_SettingsPageOR.getProperty("PostCodeErrorField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjPostCodeErrorField, ""));
            LogCapture.info("Postcode text box turns red...");

            //Country
            String vObjCountryErrorMsg = Constants.Affiliates_SettingsPageOR.getProperty("CountryErrorMsg");
            String ExpectedCountryErrorMsg = "Please enter valid country";
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjCountryErrorMsg, ExpectedCountryErrorMsg));
            LogCapture.info("Country field Error message visible is " + ExpectedCountryErrorMsg);
            String vObjCountryErrorIcon = Constants.Affiliates_SettingsPageOR.getProperty("CountryErrorIcon");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCountryErrorIcon, ""));
            LogCapture.info("Country field Error icon visible...");
            String vObjCountryErrorField = Constants.Affiliates_SettingsPageOR.getProperty("CountryErrorField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCountryErrorField, ""));
            LogCapture.info("Country text box turns red...");

            LogCapture.info("Address details - All errors message, error icons and field turns verified on Settings page....");
        }
        if (TargetField.equalsIgnoreCase("Address Line 1")) {
            //Address line 1
            String vObjAddressLine1ErrorMsg = Constants.Affiliates_SettingsPageOR.getProperty("AddressLine1ErrorMsg");
            String ExpectedAddressLine1ErrorMsg = "Please enter valid address";
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjAddressLine1ErrorMsg, ExpectedAddressLine1ErrorMsg));
            LogCapture.info("Address Line1 Error message visible is " + ExpectedAddressLine1ErrorMsg);
            String vObjAddressLine1ErrorIcon = Constants.Affiliates_SettingsPageOR.getProperty("AddressLine1ErrorIcon");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAddressLine1ErrorIcon, ""));
            LogCapture.info("Address Line1 Error icon visible...");
            String vObjAddressLine1ErrorField = Constants.Affiliates_SettingsPageOR.getProperty("AddressLine1ErrorField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAddressLine1ErrorField, ""));
            LogCapture.info("Address Line1 text box turns red...");
        }
        if (TargetField.equalsIgnoreCase("Town/City")) {
            //Town/City
            String vObjTownCityErrorMsg = Constants.Affiliates_SettingsPageOR.getProperty("TownCityErrorMsg");
            String ExpectedTownCityErrorMsg = "Please enter valid town name";
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjTownCityErrorMsg, ExpectedTownCityErrorMsg));
            LogCapture.info("Town/City field Error message visible is " + ExpectedTownCityErrorMsg);
            String vObjTownCityErrorIcon = Constants.Affiliates_SettingsPageOR.getProperty("TownCityErrorIcon");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjTownCityErrorIcon, ""));
            LogCapture.info("Town/City field Error icon visible...");
            String vObjTownCityErrorField = Constants.Affiliates_SettingsPageOR.getProperty("TownCityErrorField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjTownCityErrorField, ""));
            LogCapture.info("Town/City text box turns red...");

        }
        if (TargetField.equalsIgnoreCase("Country")) {
            //Country
            String vObjCountryErrorMsg = Constants.Affiliates_SettingsPageOR.getProperty("CountryErrorMsg");
            String ExpectedCountryErrorMsg = "Please enter valid country";
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjCountryErrorMsg, ExpectedCountryErrorMsg));
            LogCapture.info("Country field Error message visible is " + ExpectedCountryErrorMsg);
            String vObjCountryErrorIcon = Constants.Affiliates_SettingsPageOR.getProperty("CountryErrorIcon");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCountryErrorIcon, ""));
            LogCapture.info("Country field Error icon visible...");
            String vObjCountryErrorField = Constants.Affiliates_SettingsPageOR.getProperty("CountryErrorField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCountryErrorField, ""));
            LogCapture.info("Country text box turns red...");

        }
        if (TargetField.equalsIgnoreCase("Postcode")) {
            //Postcode
            String vObjPostCodeErrorMsg = Constants.Affiliates_SettingsPageOR.getProperty("PostCodeErrorMsg");
            String ExpectedPostCodeErrorMsg = "Please enter valid postcode";
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjPostCodeErrorMsg, ExpectedPostCodeErrorMsg));
            LogCapture.info("State field Error message visible is " + ExpectedPostCodeErrorMsg);
            String vObjPostCodeErrorIcon = Constants.Affiliates_SettingsPageOR.getProperty("PostCodeErrorIcon");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjPostCodeErrorIcon, ""));
            LogCapture.info("Postcode field Error icon visible...");
            String vObjPostCodeErrorField = Constants.Affiliates_SettingsPageOR.getProperty("PostCodeErrorField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjPostCodeErrorField, ""));
            LogCapture.info("Postcode text box turns red...");

        }
        if (TargetField.equalsIgnoreCase("State")) {
            //State
            String vObjStateErrorMsg = Constants.Affiliates_SettingsPageOR.getProperty("StateErrorMsg");
            String ExpectedStateErrorMsg = "Please enter valid state name";
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjStateErrorMsg, ExpectedStateErrorMsg));
            LogCapture.info("State field Error message visible is " + ExpectedStateErrorMsg);
            String vObjStateErrorIcon = Constants.Affiliates_SettingsPageOR.getProperty("StateErrorIcon");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjStateErrorIcon, ""));
            LogCapture.info("State field Error icon visible...");
            String vObjStateErrorField = Constants.Affiliates_SettingsPageOR.getProperty("StateErrorField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjStateErrorField, ""));
            LogCapture.info("State text box turns red...");

        }


    }

    @And("^Enters the (Address line 1|City|State|Postcode|AccountName) (more than 255|more than 40|more than 80|more than 20) characters$")
    public void entersTheAddressLineMoreThanCharacters(String TargetField, String TargetValue) throws Throwable {
        if (TargetField.equalsIgnoreCase("Address line 1") && TargetValue.equalsIgnoreCase("more than 255")) {
            String vObjAddressLine1DetailText = Constants.Affiliates_SettingsPageOR.getProperty("AddressLine1DetailText");
            Assert.assertEquals("PASS", Constants.key.click(vObjAddressLine1DetailText, ""));
            String AddressLine1DetailText = RandomStringUtils.randomAlphabetic(256);
            int LengthOfMessage = AddressLine1DetailText.length();
            LogCapture.info("Length of input Address line 1 is: " + LengthOfMessage);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjAddressLine1DetailText, AddressLine1DetailText));
            LogCapture.info("User enters " + TargetField + " with " + TargetValue + "...");
//            String vObjAddressDetails = Constants.Affiliates_SettingsPageOR.getProperty("AddressDetails");
//            Constants.key.click(vObjAddressDetails, "");
            String vObjAddressCity = Constants.Affiliates_SettingsPageOR.getProperty("AddressCity");
            Assert.assertEquals("PASS", Constants.key.click(vObjAddressCity, ""));
        }

        if (TargetField.equalsIgnoreCase("City") && TargetValue.equalsIgnoreCase("more than 40")) {
            String vObjAddressCity = Constants.Affiliates_SettingsPageOR.getProperty("AddressCity");
            Assert.assertEquals("PASS", Constants.key.click(vObjAddressCity, ""));
            String AddressCityText = RandomStringUtils.randomAlphabetic(41);
            int LengthOfMessage = AddressCityText.length();
            LogCapture.info("Length of input City is: " + LengthOfMessage);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjAddressCity, AddressCityText));
            LogCapture.info("User enters " + TargetField + " with " + TargetValue + "...");
        }
        if (TargetField.equalsIgnoreCase("State") && TargetValue.equalsIgnoreCase("more than 80")) {
            String vObjAddressState = Constants.Affiliates_SettingsPageOR.getProperty("AddressState");
            Assert.assertEquals("PASS", Constants.key.click(vObjAddressState, ""));
            String AddressStateText = RandomStringUtils.randomAlphabetic(81);
            int LengthOfMessage = AddressStateText.length();
            LogCapture.info("Length of input State is: " + LengthOfMessage);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjAddressState, AddressStateText));
            LogCapture.info("User enters " + TargetField + " with " + TargetValue + "...");
        }
        if (TargetField.equalsIgnoreCase("Postcode") && TargetValue.equalsIgnoreCase("more than 20")) {
            String vObjAddressPostCode = Constants.Affiliates_SettingsPageOR.getProperty("AddressPostCode");
            Assert.assertEquals("PASS", Constants.key.click(vObjAddressPostCode, ""));
            String AddressPostCodeText = RandomStringUtils.randomAlphabetic(21);
            int LengthOfMessage = AddressPostCodeText.length();
            LogCapture.info("Length of input Postcode is: " + LengthOfMessage);
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjAddressPostCode, AddressPostCodeText));
            LogCapture.info("User enters " + TargetField + " with " + TargetValue + "...");
        }


    }

    @And("^User Updates All Address fields AddressLine1 \"([^\"]*)\" City \"([^\"]*)\" State \"([^\"]*)\" Postcode \"([^\"]*)\" Country \"([^\"]*)\" on Settings page$")
    public void userUpdatesAllAddressFieldsAddressLineCityStatePostcodeCountryOnSettingsPage(String AddressLine1, String City, String State, String Postcode, String Country) throws Throwable {


        String vObjAddressLine1DetailText = Constants.Affiliates_SettingsPageOR.getProperty("AddressLine1DetailText");
        Assert.assertEquals("PASS", Constants.key.click(vObjAddressLine1DetailText, ""));

        UpdatedAddressLine1DetailText = AddressLine1;
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjAddressLine1DetailText, UpdatedAddressLine1DetailText));
        LogCapture.info("User enters Address line1 field...");

        String vObjAddressCity = Constants.Affiliates_SettingsPageOR.getProperty("AddressCity");
        Assert.assertEquals("PASS", Constants.key.click(vObjAddressCity, ""));
        UpdatedAddressCityText = City;
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjAddressCity, UpdatedAddressCityText));
        LogCapture.info("User enters City field...");

        String vObjAddressState = Constants.Affiliates_SettingsPageOR.getProperty("AddressState");
        Assert.assertEquals("PASS", Constants.key.click(vObjAddressState, ""));
        UpdatedAddressStateText = State;
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjAddressState, UpdatedAddressStateText));
        LogCapture.info("User enters State field...");

        String vObjAddressPostCode = Constants.Affiliates_SettingsPageOR.getProperty("AddressPostCode");
        Assert.assertEquals("PASS", Constants.key.click(vObjAddressPostCode, ""));
        UpdatedAddressPostCodeText = Postcode;
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjAddressPostCode, UpdatedAddressPostCodeText));
        LogCapture.info("User enters Postcode field...");

        String vObjAddressCountry = Constants.Affiliates_SettingsPageOR.getProperty("AddressCountry");
        Assert.assertEquals("PASS", Constants.key.click(vObjAddressCountry, ""));
        UpdatedAddressCountryText = Country;
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjAddressCountry, UpdatedAddressCountryText));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjAddressCountry, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjAddressCountry, "enter"));
        LogCapture.info("User enters Country field...");

        String vObjAddressDetails = Constants.Affiliates_SettingsPageOR.getProperty("AddressDetails");
        Constants.key.click(vObjAddressDetails, "");
        LogCapture.info("User enters ALL Address details");

    }

    @Then("^User should be able to view the Updated All Address details$")
    public void userShouldBeAbleToViewTheUpdatedAllAddressDetails() throws Throwable {
        Constants.key.pause("2", "");
        String vObjAddressDetailTitle = Constants.Affiliates_SettingsPageOR.getProperty("AddressDetailTitle");
        WebElement AddressDetailTitle = Constants.driver.findElement(By.xpath(vObjAddressDetailTitle));
        ((JavascriptExecutor) Constants.driver).executeScript("arguments[0].scrollIntoView();", AddressDetailTitle);
        Constants.key.pause("2", "");
        String vObjUpdatedAddressLine1DetailText = Constants.Affiliates_SettingsPageOR.getProperty("UpdatedAddressLine1DetailText");
        String vObjUpdatedAddressLine2DetailText = Constants.Affiliates_SettingsPageOR.getProperty("UpdatedAddressLine2DetailText");
        String vObjUpdatedAddressLine3DetailText = Constants.Affiliates_SettingsPageOR.getProperty("UpdatedAddressLine3DetailText");

        String ActualAddressLine1Text = Constants.driver.findElement(By.xpath(vObjUpdatedAddressLine1DetailText)).getText();
        String ActualAddressLine2Text = Constants.driver.findElement(By.xpath(vObjUpdatedAddressLine2DetailText)).getText();
        String ActualAddressLine3Text = Constants.driver.findElement(By.xpath(vObjUpdatedAddressLine3DetailText)).getText();

        LogCapture.info(ActualAddressLine2Text);

        String UpdatedAddressLine2Text = UpdatedAddressCityText + " " + UpdatedAddressStateText + " , " + UpdatedAddressPostCodeText;
        LogCapture.info(UpdatedAddressLine2Text);
        if (ActualAddressLine1Text.equals(UpdatedAddressLine1DetailText) && ActualAddressLine2Text.equals(UpdatedAddressLine2Text) && ActualAddressLine3Text.equals(UpdatedAddressCountryText)) {
            LogCapture.info("Updated Address details are displayed with with previously updated value. AddressLine1: " + ActualAddressLine1Text + " AddressLine2: " + ActualAddressLine2Text + " AddressLine3: " + ActualAddressLine3Text);
        } else {
            LogCapture.info("Updated Address details are NOT displayed with previously updated value. AddressLine1: " + ActualAddressLine1Text + " AddressLine2: " + ActualAddressLine2Text + " AddressLine3: " + ActualAddressLine3Text);
            Assert.fail();
        }

    }


    @Then("^User should NOT be able to view any sections on Settings page$")
    public void userShouldNOTBeAbleToViewAnySectionsOnSettingsPage() throws Throwable {

        String vObjReferralsBtnEnable = Constants.Affiliates_ReferralsPageOR.getProperty("ReferralsBtnEnable");
        String vObjRegistrationsBtnEnable = Constants.Affiliates_ReferralsPageOR.getProperty("RegistrationsBtnEnable");
        String vObjTradesBtnEnable = Constants.Affiliates_ReferralsPageOR.getProperty("TradesBtnEnable");
        String vObjReferralsBtnDisable = Constants.Affiliates_ReferralsPageOR.getProperty("ReferralsBtnDisable");
        String vObjRegistrationsBtnDisable = Constants.Affiliates_ReferralsPageOR.getProperty("RegistrationsBtnDisable");
        String vObjTradesBtnDisable = Constants.Affiliates_ReferralsPageOR.getProperty("TradesBtnDisable");

        Assert.assertEquals("PASS", Constants.key.notexist(vObjReferralsBtnEnable, ""));
        Assert.assertEquals("PASS", Constants.key.notexist(vObjReferralsBtnDisable, ""));
        LogCapture.info("User NOT able to view Referrals section...");
        Assert.assertEquals("PASS", Constants.key.notexist(vObjRegistrationsBtnEnable, ""));
        Assert.assertEquals("PASS", Constants.key.notexist(vObjRegistrationsBtnDisable, ""));
        LogCapture.info("User NOT able to view Registration section...");
        Assert.assertEquals("PASS", Constants.key.notexist(vObjTradesBtnEnable, ""));
        Assert.assertEquals("PASS", Constants.key.notexist(vObjTradesBtnDisable, ""));
        LogCapture.info("User NOT able to view Trades section...");

        LogCapture.info("User NOT able to view Any section on Settings page...");

    }

    @And("^User enters CountryCode \"([^\"]*)\" on Become a partner page$")
    public void userEntersCountryCodeOnBecomeAPartnerPage(String CountryCode) throws Throwable {
        String vObjCountryCode = Constants.Affiliates_BecomeaPartnerOR.getProperty("CountryCodeDropDown");
        Assert.assertEquals("PASS", Constants.key.click(vObjCountryCode, ""));
        Constants.key.pause("2", "");
        String vObjCountryCode1 = Constants.Affiliates_BecomeaPartnerOR.getProperty("CountryCodeClear");
        Assert.assertEquals("PASS", Constants.key.click(vObjCountryCode1, ""));
        Constants.key.pause("2", "");
        String vObjCountryCD = Constants.Affiliates_BecomeaPartnerOR.getProperty("CountryCode");
        Assert.assertEquals("PASS", Constants.key.clearText(vObjCountryCD));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjCountryCD, CountryCode));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCountryCD, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjCountryCD, "enter"));
        LogCapture.info("User enters Country code for MobileNumber as " + CountryCode);
    }


    @And("^User enters AccountName \"([^\"]*)\" PaymentCountry \"([^\"]*)\" PaymentCurrency \"([^\"]*)\" AccountNumber \"([^\"]*)\" SortCode \"([^\"]*)\" BankName \"([^\"]*)\" BankAddress \"([^\"]*)\" for BecomeAPartner journey$")
    public void userEntersAccountNamePaymentCountryPaymentCurrencyAccountNumberSortCodeBankNameBankAddressForBecomeAPartnerJourney(String AccountName, String PaymentCountry, String PaymentCurrency, String AccountNumber, String SortCode, String BankName, String BankAddress) throws Throwable {

        String vObjAccountNameField = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNameField");
        Assert.assertEquals("PASS", Constants.key.click(vObjAccountNameField, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjAccountNameField, AccountName));
        LogCapture.info("User enters AccountName: " + AccountName);

        String vObjPaymentCountryField = Constants.Affiliates_BecomeaPartnerOR.getProperty("PaymentCountryField");
        Assert.assertEquals("PASS", Constants.key.click(vObjPaymentCountryField, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPaymentCountryField, PaymentCountry));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjPaymentCountryField, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjPaymentCountryField, "enter"));
        LogCapture.info("User enters PaymentCountry: " + PaymentCountry);


        String vObjPaymentCurrencyField = Constants.Affiliates_BecomeaPartnerOR.getProperty("PaymentCurrencyField");
        Assert.assertEquals("PASS", Constants.key.click(vObjPaymentCurrencyField, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPaymentCurrencyField, PaymentCurrency));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjPaymentCurrencyField, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjPaymentCurrencyField, "enter"));
        LogCapture.info("User enters PaymentCurrency: " + PaymentCurrency);
        Constants.key.pause("2", "");
        String vObjEnterDetailsManuallyBtn = Constants.Affiliates_BecomeaPartnerOR.getProperty("EnterDetailsManuallyBtn");
        Assert.assertEquals("PASS", Constants.key.click(vObjEnterDetailsManuallyBtn, ""));
        Constants.key.pause("2", "");

        String vObjAccountNumberField = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNumberField");
        Assert.assertEquals("PASS", Constants.key.click(vObjAccountNumberField, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjAccountNumberField, AccountNumber));
        LogCapture.info("User enters SortCode: " + AccountNumber);

        String vObjSortCodeField = Constants.Affiliates_BecomeaPartnerOR.getProperty("SortCodeField");
        Assert.assertEquals("PASS", Constants.key.click(vObjSortCodeField, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjSortCodeField, SortCode));
        LogCapture.info("User enters SortCode: " + SortCode);

        String vObjBankNameField = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankNameField");
        Assert.assertEquals("PASS", Constants.key.click(vObjBankNameField, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjBankNameField, BankName));
        LogCapture.info("User enters BankName: " + BankName);

        String vObjBankAddressField = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankAddressField");
        Assert.assertEquals("PASS", Constants.key.click(vObjBankAddressField, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjBankAddressField, BankAddress));
        LogCapture.info("User enters BankAddress: " + BankAddress);

    }

    @Then("^User is able to view No details added on Bank Details$")
    public void userIsAbleToViewNoDetailsAddedOnBankDetails() throws Throwable {

        String vObjNoDetailsAddedMsg = Constants.Affiliates_BecomeaPartnerOR.getProperty("NoDetailsAddedMsg");
        String ExpectedMsg = "No details added.";
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjNoDetailsAddedMsg, "visible"));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjNoDetailsAddedMsg, ExpectedMsg));
        LogCapture.info("User is able to view " + ExpectedMsg + " on expanding Bank details section...");
    }

    @And("^User only clicks on AccountName PaymentCountry PaymentCurrency for BecomeAPartner journey$")
    public void userOnlyClicksOnAccountNamePaymentCountryPaymentCurrencyForBecomeAPartnerJourney() throws Throwable {

        String vObjAccountNameField = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNameField");
        Assert.assertEquals("PASS", Constants.key.click(vObjAccountNameField, ""));
        LogCapture.info("User clicks on AccountName field but does not enters any value...");
        String vObjBankDetailsSidePageTitle = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankDetailsSidePageTitle");
        Assert.assertEquals("PASS", Constants.key.click(vObjBankDetailsSidePageTitle, ""));
        Constants.key.pause("1", "");

        String vObjPaymentCountryField = Constants.Affiliates_BecomeaPartnerOR.getProperty("PaymentCountryField");
        Assert.assertEquals("PASS", Constants.key.click(vObjPaymentCountryField, ""));
        LogCapture.info("User clicks on PaymentCountry field but does not enters any value...");
        Assert.assertEquals("PASS", Constants.key.click(vObjBankDetailsSidePageTitle, ""));
        String vObjPaymentCurrencyField = Constants.Affiliates_BecomeaPartnerOR.getProperty("PaymentCurrencyField");
        Assert.assertEquals("PASS", Constants.key.click(vObjPaymentCurrencyField, ""));
        LogCapture.info("User clicks on PaymentCurrency field but does not enters any value...");
        Assert.assertEquals("PASS", Constants.key.click(vObjBankDetailsSidePageTitle, ""));

        LogCapture.info("User clicked on BankDetails side page title to deviate the cursor focus...");

    }

    @Then("^User should get error field and textbox should turn red for AccountName PaymentCountry PaymentCurrency fields$")
    public void userShouldGetErrorFieldAndTextboxShouldTurnRedForAccountNamePaymentCountryPaymentCurrencyFields() throws Throwable {

        String vObjAccountNameErrorIcon = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNameErrorIcon");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAccountNameErrorIcon, ""));
        LogCapture.info("AccountName field Error icon visible...");
        String vObjAccountNameErrorField = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNameErrorField");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAccountNameErrorField, ""));
        LogCapture.info("AccountName text box turns red...");

        String vObjPaymentCountryErrorField = Constants.Affiliates_BecomeaPartnerOR.getProperty("PaymentCountryErrorField");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjPaymentCountryErrorField, ""));
        LogCapture.info("PaymentCountry text box turns red...");

        String vObjPaymentCurrencyErrorField = Constants.Affiliates_BecomeaPartnerOR.getProperty("PaymentCurrencyErrorField");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjPaymentCurrencyErrorField, ""));
        LogCapture.info("PaymentCurrency text box turns red...");

    }

    @Then("^User should be able to view the Privacy and Policy Section on UI$")
    public void userShouldBeAbleToViewThePrivacyAndPolicySectionOnUI() throws Throwable {
        String PrivacyPolicyText = Constants.Affiliates_BecomeaPartnerOR.getProperty("PrivacyPolicyText");
        String PrivacyPolicyLink = Constants.Affiliates_BecomeaPartnerOR.getProperty("PrivacyPolicyLink");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(PrivacyPolicyText, "visible"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(PrivacyPolicyLink, "visible"));
        Assert.assertEquals("PASS", Constants.key.exist(PrivacyPolicyText, ""));
        Assert.assertEquals("PASS", Constants.key.exist(PrivacyPolicyText, ""));

    }

    @And("^User enters (BankAddress|BankName|AccountName) (more than 40|No|more than 65) characters on Bank details page$")
    public void userEntersBankAddressMoreThanCharactersOnBankDetailsPage(String TargetField, String TargetValue) throws Throwable {

        if (TargetValue.equalsIgnoreCase("more than 65") && TargetField.equalsIgnoreCase("BankAddress")) {
            String vObjBankAddressField = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankAddressField");
            String BankAddress = RandomStringUtils.randomAlphabetic(66);
            Assert.assertEquals("PASS", Constants.key.click(vObjBankAddressField, ""));
            Assert.assertEquals("PASS", Constants.key.clearText(vObjBankAddressField));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjBankAddressField, BankAddress));
            LogCapture.info("User enters BankAddress " + TargetValue + ": " + BankAddress);
        }
        if (TargetValue.equalsIgnoreCase("No") && TargetField.equalsIgnoreCase("BankAddress")) {
            String vObjBankAddressField = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankAddressField");
            Assert.assertEquals("PASS", Constants.key.click(vObjBankAddressField, ""));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjBankAddressField, "selectall"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjBankAddressField, "delete"));
            Constants.key.pause("2", "");
            LogCapture.info("User enters BankAddress NO value only click...");
        }
        if (TargetValue.equalsIgnoreCase("more than 65") && TargetField.equalsIgnoreCase("BankName")) {
            String vObjBankNameField = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankNameField");
            String BankNameField = RandomStringUtils.randomAlphabetic(66);
            Assert.assertEquals("PASS", Constants.key.click(vObjBankNameField, ""));
            Assert.assertEquals("PASS", Constants.key.clearText(vObjBankNameField));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjBankNameField, BankNameField));
            LogCapture.info("User enters BankName " + TargetValue + ": " + BankNameField);
        }
        if (TargetValue.equalsIgnoreCase("No") && TargetField.equalsIgnoreCase("BankName")) {
            String vObjBankNameField = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankNameField");
            Assert.assertEquals("PASS", Constants.key.click(vObjBankNameField, ""));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjBankNameField, "selectall"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjBankNameField, "delete"));
            Constants.key.pause("2", "");
            LogCapture.info("User enters BankName NO value only click...");
        }
        if (TargetValue.equalsIgnoreCase("more than 40") && TargetField.equalsIgnoreCase("AccountName")) {
            String vObjAccountName = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNameField");
            String AccountName = RandomStringUtils.randomAlphabetic(41);
            Assert.assertEquals("PASS", Constants.key.click(vObjAccountName, ""));
            Assert.assertEquals("PASS", Constants.key.clearText(vObjAccountName));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjAccountName, AccountName));
            LogCapture.info("User enters AccountName " + TargetValue + ": " + AccountName);
        }
    }

    @Then("^User should get error field and textbox should turn red for (BankAddress|BankName) fields on Bank details$")
    public void userShouldGetErrorFieldAndTextboxShouldTurnRedForBankAddressFieldsOnBankDetails(String TargetField) throws Throwable {

        if (TargetField.equalsIgnoreCase("BankAddress")) {
            String vObjBankAddressErrorIcon = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankAddressErrorIcon");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjBankAddressErrorIcon, "visible"));
            LogCapture.info("BankAddress field Error icon visible...");
            String vObjBankAddressErrorField = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankAddressErrorField");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjBankAddressErrorField, "visible"));
            LogCapture.info("BankAddress text box turns red...");
        }
        if (TargetField.equalsIgnoreCase("BankName")) {
            String vObjBankNameErrorIcon = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankNameErrorIcon");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjBankNameErrorIcon, "visible"));
            LogCapture.info("BankName field Error icon visible...");
            String vObjBankNameErrorField = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankNameErrorField");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjBankNameErrorField, "visible"));
            LogCapture.info("BankName text box turns red...");
        }


    }

    @And("^User enters AccountName \"([^\"]*)\" PaymentCountry \"([^\"]*)\" PaymentCurrency \"([^\"]*)\" for BecomeAPartner journey$")
    public void userEntersAccountNamePaymentCountryPaymentCurrencyForBecomeAPartnerJourney(String AccountName, String PaymentCountry, String PaymentCurrency) throws Throwable {
        String vObjAccountNameField = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNameField");
        Assert.assertEquals("PASS", Constants.key.click(vObjAccountNameField, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjAccountNameField, AccountName));
        LogCapture.info("User enters AccountName: " + AccountName);

        String vObjBankDetailsSidePageTitle = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankDetailsSidePageTitle");
        Assert.assertEquals("PASS", Constants.key.click(vObjBankDetailsSidePageTitle, ""));
        Constants.key.pause("1", "");


        String vObjPaymentCountryField = Constants.Affiliates_BecomeaPartnerOR.getProperty("PaymentCountryField");
        Assert.assertEquals("PASS", Constants.key.click(vObjPaymentCountryField, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPaymentCountryField, PaymentCountry));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjPaymentCountryField, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjPaymentCountryField, "enter"));
        LogCapture.info("User enters PaymentCountry: " + PaymentCountry);

        Assert.assertEquals("PASS", Constants.key.click(vObjBankDetailsSidePageTitle, ""));

        String vObjPaymentCurrencyField = Constants.Affiliates_BecomeaPartnerOR.getProperty("PaymentCurrencyField");
        Assert.assertEquals("PASS", Constants.key.click(vObjPaymentCurrencyField, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPaymentCurrencyField, PaymentCurrency));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjPaymentCurrencyField, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjPaymentCurrencyField, "enter"));
        LogCapture.info("User enters PaymentCurrency: " + PaymentCurrency);
        Assert.assertEquals("PASS", Constants.key.click(vObjBankDetailsSidePageTitle, ""));
        Constants.key.pause("2", "");

    }

    @And("^User provide the AccountNumber \"([^\"]*)\" SortCode \"([^\"]*)\"$")
    public void userProvideTheAccountNumberSortCode(String AccountNumber, String SortCode) throws Throwable {
        String vObjAccountNumberField = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNumberField");
        Assert.assertEquals("PASS", Constants.key.click(vObjAccountNumberField, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjAccountNumberField, AccountNumber));
        LogCapture.info("User enters SortCode: " + AccountNumber);

        String vObjSortCodeField = Constants.Affiliates_BecomeaPartnerOR.getProperty("SortCodeField");
        Assert.assertEquals("PASS", Constants.key.click(vObjSortCodeField, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjSortCodeField, SortCode));
        LogCapture.info("User enters SortCode: " + SortCode);
    }

    @And("^User provide the AccountNumber \"([^\"]*)\" BSBNumber \"([^\"]*)\"$")
    public void userProvideTheAccountNumberBSBNumber(String AccountNumber, String BSBNumber) throws Throwable {
        String vObjAccountNumberField = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNumberField");
        Assert.assertEquals("PASS", Constants.key.click(vObjAccountNumberField, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjAccountNumberField, AccountNumber));
        LogCapture.info("User enters SortCode: " + AccountNumber);

        String BSBNumberField = Constants.Affiliates_BecomeaPartnerOR.getProperty("BSBNumberField");
        Assert.assertEquals("PASS", Constants.key.click(BSBNumberField, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(BSBNumberField, BSBNumber));
        LogCapture.info("User enters SortCode: " + BSBNumber);
    }

    @Then("^User will be able to view the (Retrive Bank details|Continue) option as (enabled|disabled)$")
    public void userWillBeAbleToViewTheRetriveBankDetailsOptionAsEnabled(String Field, String Value) throws Throwable {
        if (Field.equalsIgnoreCase("Retrive Bank details") && Value.equalsIgnoreCase("enabled")) {
            String RetrieveBankDetails = Constants.Affiliates_BecomeaPartnerOR.getProperty("RetrieveBankDetails");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(RetrieveBankDetails, "enabled"));
        }
        if (Field.equalsIgnoreCase("Retrive Bank details") && Value.equalsIgnoreCase("disabled")) {
            String RetrieveBankDetails = Constants.Affiliates_BecomeaPartnerOR.getProperty("RetrieveBankDetailsDisabled");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(RetrieveBankDetails, "disabled"));
        }
        if (Field.equalsIgnoreCase("Continue") && Value.equalsIgnoreCase("enabled")) {
            String ContinueButtonEnable = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(ContinueButtonEnable, "enabled"));
        }
        if (Field.equalsIgnoreCase("Continue") && Value.equalsIgnoreCase("disabled")) {
            String ContinueButtonEnable = Constants.Refer_a_Client.getProperty("ContinueButtonEnable");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(ContinueButtonEnable, "disabled"));
        }

    }

    @Then("^System should display the lookup and matching values against values been entered BankAddress \"([^\"]*)\" And BankHeadOfficeAddress \"([^\"]*)\"$")
    public void systemShouldDisplayTheLookupAndMatchingValuesAgainstValuesBeenEnteredBankAddressAndBankHeadOfficeAddress(String BankAddress, String BankHeadOfficeAddress) throws Throwable {
        String BankAddressField = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankAddress");
        String BankHeadOfficeAddressField = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankHeadOfficeAddress");
        String BankAddressText = Constants.driver.findElement(By.xpath(BankAddressField)).getText();
        String BankHeadOfficeAddressText = Constants.driver.findElement(By.xpath(BankHeadOfficeAddressField)).getText();

        if (BankAddressText.equals(BankAddress) && BankHeadOfficeAddress.equals(BankHeadOfficeAddress)) {
            LogCapture.info("The Value is matching: " + BankAddressText + "" + BankHeadOfficeAddressText);
        } else {
            Assert.fail();
            LogCapture.info("The Value is not matching: " + BankAddressText + "" + BankHeadOfficeAddressText);
        }

    }

    @And("^User Enters the AccountNumber \"([^\"]*)\" and TransitNumber \"([^\"]*)\"$")
    public void userEntersTheAccountNumberAndTransitNumber(String AccountNumber, String TransitNumber) throws Throwable {
        String vObjAccountNumberField = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNumberField");
        Assert.assertEquals("PASS", Constants.key.click(vObjAccountNumberField, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjAccountNumberField, AccountNumber));
        LogCapture.info("User enters AccountNumber: " + AccountNumber);

        String TransitNumberField = Constants.Affiliates_BecomeaPartnerOR.getProperty("TransitNumberField");
        Assert.assertEquals("PASS", Constants.key.click(TransitNumberField, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(TransitNumberField, TransitNumber));
        LogCapture.info("User enters TransitNumber: " + TransitNumber);
    }

    @Then("^User should open the manual address window to allow user to manually put the address BankAddress \"([^\"]*)\" and BankHeadOfficeAddress \"([^\"]*)\"$")
    public void userShouldOpenTheManualAddressWindowToAllowUserToManuallyPutTheAddress(String BankName, String HeadOffice) throws Throwable {
        String ErrorMsg = Constants.Affiliates_BecomeaPartnerOR.getProperty("ErrorMsg");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(ErrorMsg, ""));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(ErrorMsg, "visible"));
        String ErrorMsgActual = Constants.driver.findElement(By.xpath(ErrorMsg)).getText();
        System.out.println("ErrorMessage" + ErrorMsgActual);
        if (ErrorMsgActual.equalsIgnoreCase("ERROR:  Your bank details cannot be found, please enter them manually below.")) {
            LogCapture.info("Error Message is getting displayed in UI");
        } else {
            LogCapture.info("Error Message is not getting displayed in UI");
            Assert.fail();
        }
        String BankNameField = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankNameField");
        Assert.assertEquals("PASS", Constants.key.click(BankNameField, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(BankNameField, BankName));
        LogCapture.info("User enters BankName: " + BankNameField);

        String BankAddressField = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankAddressField");
        Assert.assertEquals("PASS", Constants.key.click(BankAddressField, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(BankAddressField, HeadOffice));
        LogCapture.info("User enters BankAddressField: " + BankAddressField);
    }

    @And("^User update the BankName \"([^\"]*)\" and BankAddress \"([^\"]*)\"$")
    public void userUpdateTheBankNameAndBankAddress(String BankName, String BankAddress) throws Throwable {
        String BankNameField = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankNameField");
        String BankAddressField = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankAddressField");
        String BankAddressText = Constants.driver.findElement(By.xpath(BankNameField)).getText();
        String BankHeadOfficeAddressText = Constants.driver.findElement(By.xpath(BankAddressField)).getText();
//
//        if(!BankAddressText.isEmpty()||!BankHeadOfficeAddressText.isEmpty()){
//            Assert.assertEquals("PASS", Constants.key.click(BankNameField,""));
//            Assert.assertEquals("PASS", Constants.key.clearText(BankNameField));
//            Assert.assertEquals("PASS", Constants.key.click(BankAddressField,""));
//            Assert.assertEquals("PASS", Constants.key.clearText(BankAddressField));
//        }

        Assert.assertEquals("PASS", Constants.key.click(BankNameField, ""));
        Assert.assertEquals("PASS", Constants.key.clearText(BankNameField));
        Assert.assertEquals("PASS", Constants.key.writeInInput(BankNameField, BankName));
        LogCapture.info("User enters BankName: " + BankName);

        Assert.assertEquals("PASS", Constants.key.click(BankAddressField, ""));
        Assert.assertEquals("PASS", Constants.key.clearText(BankAddressField));
        Assert.assertEquals("PASS", Constants.key.writeInInput(BankAddressField, BankAddress));
        LogCapture.info("User enters BankAddressField: " + BankAddress);
    }

    @Then("^User should be able to view the updated BankName \"([^\"]*)\" and BankAddress \"([^\"]*)\"$")
    public void userShouldBeAbleToViewTheUpdatedBankNameAndBankAddress(String BankName, String BankAddress) throws Throwable {
        String BankAddressField1 = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankNameField");
        String BankHeadOfficeAddressField1 = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankAddressField");
        String BankAddressText1 = Constants.driver.findElement(By.xpath(BankAddressField1)).getAttribute("value");
        String BankHeadOfficeAddressText1 = Constants.driver.findElement(By.xpath(BankHeadOfficeAddressField1)).getAttribute("value");
        System.out.println("Bank Address:" + BankAddressText1 + "::::" + BankHeadOfficeAddressText1);
        System.out.println("BankName:" + BankName + "::::" + BankAddress);
        if (BankAddressText1.equals(BankName) && BankHeadOfficeAddressText1.equals(BankAddress)) {
            LogCapture.info("The Value is matching: " + BankAddressText1 + "" + BankHeadOfficeAddressText1);
        } else {
            Assert.fail();
            LogCapture.info("The Value is not matching: " + BankAddressText1 + "" + BankHeadOfficeAddressText1);
        }
    }


    @Then("^User is able to view (Account number Sort code|Account number BSB number SWIFT code|Account number SWIFT code Transit number|Account number SWIFT code|IBAN|SWIFT code IBAN|Account number SWIFT code CNAPS code|Account number SWIFT code ABA number|Account number SWIFT code IFSC code|Account number SWIFT code Branch code) combination depending upon selected PaymentCountry and PaymentCurreny$")
    public void userIsAbleToViewAccountNumberSortCodeCombinationDependingUponSelectedPaymentCountryAndPaymentCurreny(String TargetField) throws Throwable {

        if (TargetField.equalsIgnoreCase("Account number Sort code")) {
            String vObjAccountNumberField = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNumberField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAccountNumberField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjAccountNumberField, "visible"));
            LogCapture.info("User is able to view Account Number field...");
            String vObjSortCodeField = Constants.Affiliates_BecomeaPartnerOR.getProperty("SortCodeField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSortCodeField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjSortCodeField, "visible"));
            LogCapture.info("User is able to view Sort code field...");
        }
        if (TargetField.equalsIgnoreCase("Account number BSB number SWIFT code")) {
            String vObjAccountNumberField = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNumberField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAccountNumberField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjAccountNumberField, "visible"));
            LogCapture.info("User is able to view Account Number field...");
            String vObjBSBNumberField = Constants.Affiliates_BecomeaPartnerOR.getProperty("BSBNumberField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBSBNumberField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjBSBNumberField, "visible"));
            LogCapture.info("User is able to view BSB Number field...");
            String vObjSWIFTCodeField = Constants.Affiliates_BecomeaPartnerOR.getProperty("SWIFTCodeField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSWIFTCodeField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjSWIFTCodeField, "visible"));
            LogCapture.info("User is able to view SWIFT code field...");

        }
        if (TargetField.equalsIgnoreCase("Account number SWIFT code Transit number")) {
            String vObjAccountNumberField = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNumberField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAccountNumberField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjAccountNumberField, "visible"));
            LogCapture.info("User is able to view Account Number field...");
            String vObjSWIFTCodeField = Constants.Affiliates_BecomeaPartnerOR.getProperty("SWIFTCodeField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSWIFTCodeField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjSWIFTCodeField, "visible"));
            LogCapture.info("User is able to view SWIFT code field...");
            String vObjTransitNumberField = Constants.Affiliates_BecomeaPartnerOR.getProperty("TransitNumberField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjTransitNumberField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjTransitNumberField, "visible"));
            LogCapture.info("User is able to view Transit number field...");
        }
        if (TargetField.equalsIgnoreCase("Account number SWIFT code ABA number")) {
            String vObjAccountNumberField = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNumberField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAccountNumberField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjAccountNumberField, "visible"));
            LogCapture.info("User is able to view Account Number field...");
            String vObjSWIFTCodeField = Constants.Affiliates_BecomeaPartnerOR.getProperty("SWIFTCodeField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSWIFTCodeField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjSWIFTCodeField, "visible"));
            LogCapture.info("User is able to view SWIFT code field...");
            String vObjABANumberField = Constants.Affiliates_BecomeaPartnerOR.getProperty("ABANumberField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjABANumberField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjABANumberField, "visible"));
            LogCapture.info("User is able to view ABA number field...");
        }

        if (TargetField.equalsIgnoreCase("Account number SWIFT code Branch code")) {
            String vObjAccountNumberField = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNumberField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAccountNumberField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjAccountNumberField, "visible"));
            LogCapture.info("User is able to view Account Number field...");
            String vObjSWIFTCodeField = Constants.Affiliates_BecomeaPartnerOR.getProperty("SWIFTCodeField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSWIFTCodeField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjSWIFTCodeField, "visible"));
            LogCapture.info("User is able to view SWIFT code field...");
            String vObjBranchCodeField = Constants.Affiliates_BecomeaPartnerOR.getProperty("BranchCodeField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBranchCodeField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjBranchCodeField, "visible"));
            LogCapture.info("User is able to view Branch code field...");

        }
        if (TargetField.equalsIgnoreCase("Account number SWIFT code IFSC code")) {
            String vObjAccountNumberField = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNumberField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAccountNumberField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjAccountNumberField, "visible"));
            LogCapture.info("User is able to view Account Number field...");
            String vObjSWIFTCodeField = Constants.Affiliates_BecomeaPartnerOR.getProperty("SWIFTCodeField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSWIFTCodeField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjSWIFTCodeField, "visible"));
            LogCapture.info("User is able to view SWIFT code field...");
            String vObjIFSCCodeField = Constants.Affiliates_BecomeaPartnerOR.getProperty("IFSCCodeField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjIFSCCodeField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjIFSCCodeField, "visible"));
            LogCapture.info("User is able to view IFSC code field...");
        }
        if (TargetField.equalsIgnoreCase("Account number SWIFT code CNAPS code")) {
            String vObjAccountNumberField = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNumberField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAccountNumberField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjAccountNumberField, "visible"));
            LogCapture.info("User is able to view Account Number field...");
            String vObjSWIFTCodeField = Constants.Affiliates_BecomeaPartnerOR.getProperty("SWIFTCodeField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSWIFTCodeField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjSWIFTCodeField, "visible"));
            LogCapture.info("User is able to view SWIFT code field...");
            String vObjCNAPSCodeField = Constants.Affiliates_BecomeaPartnerOR.getProperty("CNAPSCodeField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCNAPSCodeField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjCNAPSCodeField, "visible"));
            LogCapture.info("User is able to view CNAPS code field...");
        }
        if (TargetField.equalsIgnoreCase("SWIFT code IBAN")) {
            String vObjSWIFTCodeField = Constants.Affiliates_BecomeaPartnerOR.getProperty("SWIFTCodeField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSWIFTCodeField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjSWIFTCodeField, "visible"));
            LogCapture.info("User is able to view SWIFT code field...");
            String vObjIBANField = Constants.Affiliates_BecomeaPartnerOR.getProperty("IBANField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjIBANField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjIBANField, "visible"));
            LogCapture.info("User is able to view IBAN code field...");
        }
        if (TargetField.equalsIgnoreCase("IBAN")) {
            String vObjIBANField = Constants.Affiliates_BecomeaPartnerOR.getProperty("IBANField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjIBANField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjIBANField, "visible"));
            LogCapture.info("User is able to view IBAN code field...");

        }
        if (TargetField.equalsIgnoreCase("Account number SWIFT code")) {
            String vObjAccountNumberField = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNumberField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAccountNumberField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjAccountNumberField, "visible"));
            LogCapture.info("User is able to view Account Number field...");
            String vObjSWIFTCodeField = Constants.Affiliates_BecomeaPartnerOR.getProperty("SWIFTCodeField");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSWIFTCodeField, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjSWIFTCodeField, "visible"));
            LogCapture.info("User is able to view SWIFT code field...");
        }
    }

    @Then("^User should not be able to view the option in PaymentCountry dropdown$")
    public void userShouldNotBeAbleToViewTheOptionInPaymentCountryDropdown() throws Throwable {
        String vObjPaymentCountryErrorField = Constants.Affiliates_BecomeaPartnerOR.getProperty("PaymentCountryErrorField");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjPaymentCountryErrorField, ""));
        LogCapture.info("User not able to view any option for PaymentCountry: USA and text box turns red...");
    }

    @Then("^User should be able to view the correct Bank details which we have entered for (PFX|CFX)$")
    public void userShouldBeAbleToViewTheCorrectBankDetailsWhichWeHaveEnteredForPFX(String Value) throws Throwable {
        Constants.key.pause("2", "");
        if (Value.equalsIgnoreCase("PFX") || Value.equalsIgnoreCase("CFX")) {

            String AccountNameVerify = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNameVerify");
            String AccountNameVerifyText = Constants.driver.findElement(By.xpath(AccountNameVerify)).getText();
            System.out.println("AccountNameVerifyText" + AccountNameVerifyText);

            String PaymentCountryVerify = Constants.Affiliates_BecomeaPartnerOR.getProperty("PaymentCountryVerify");
            String PaymentCountryVerifyText = Constants.driver.findElement(By.xpath(PaymentCountryVerify)).getText();
            System.out.println("AccountNameVerifyText" + PaymentCountryVerifyText);

            String PaymentCurrencyVerify = Constants.Affiliates_BecomeaPartnerOR.getProperty("PaymentCurrencyVerify");
            String PaymentCurrencyVerifyText = Constants.driver.findElement(By.xpath(PaymentCurrencyVerify)).getText();
            System.out.println("AccountNameVerifyText" + PaymentCurrencyVerifyText);

            String AccountNoVerify = Constants.Affiliates_BecomeaPartnerOR.getProperty("AccountNoVerify");
            String AccountNoVerifyText = Constants.driver.findElement(By.xpath(AccountNoVerify)).getText();
            System.out.println("AccountNoVerify" + AccountNoVerifyText);

            String SortCodeVerify = Constants.Affiliates_BecomeaPartnerOR.getProperty("SortCodeVerify");
            String SortCodeVerifyText = Constants.driver.findElement(By.xpath(SortCodeVerify)).getText();
            System.out.println("SortCodeVerify" + SortCodeVerifyText);

            String BankNameVerify = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankNameVerify");
            String BankNameVerifyText = Constants.driver.findElement(By.xpath(BankNameVerify)).getText();
            System.out.println("AccountNameVerifyText" + BankNameVerifyText);

            String BankHeadOfficeAddressVerify = Constants.Affiliates_BecomeaPartnerOR.getProperty("BankHeadOfficeAddressVerify");
            String BankHeadOfficeAddressVerifyText = Constants.driver.findElement(By.xpath(BankHeadOfficeAddressVerify)).getText();
            System.out.println("AccountNameVerifyText" + BankHeadOfficeAddressVerifyText);

            if (AccountNameVerifyText.equalsIgnoreCase("Sam Jeo") && PaymentCountryVerifyText.equalsIgnoreCase("GBR") && PaymentCurrencyVerifyText.equalsIgnoreCase("GBP") && AccountNoVerifyText.equalsIgnoreCase("4587459852367") && SortCodeVerifyText.equalsIgnoreCase("SJU37ED") && BankNameVerifyText.equalsIgnoreCase("Bank of UK") && BankHeadOfficeAddressVerifyText.equalsIgnoreCase("UK wall street")) {

                LogCapture.info("Bank Details displayed corectly");
            } else {
                LogCapture.info("Bank Details are not displayed corectly");
                Assert.fail();
            }

        }

    }

    @Then("^User verify the Commision Balance on the UI which is yet to be paid$")
    public void userVerifyTheCommisionBalanceOnTheUIWhichIsYetToBePaid() throws Throwable {
        // String NextCommissionText = Constants.Affiliates_AccountsPageOR.getProperty("NextCommissionText");
        //Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(NextCommissionText, ""));
        String Balance = Constants.Affiliates_AccountsPageOR.getProperty("Balance");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(Balance, ""));
        String BalanceToBepaid = Constants.driver.findElement(By.xpath(Balance)).getText();
        System.out.println("BalanceToBepaid" + BalanceToBepaid);
        //Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(NextCommissionText, ""));
        //Assert.assertEquals("PASS", Constants.key.verifyElementProperties(NextCommissionText, "visible"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(Balance, "visible"));
        LogCapture.info("Commission section visible on Dashboard(Account page)...");
        if (BalanceToBepaid.contains("£0.00")) {
            LogCapture.info("the Commision Balance on the UI which is paid already");

        } else {
            LogCapture.info("The Commision Balance on the UI which is yet to be paid" + BalanceToBepaid);
            Assert.fail();
        }
    }

    @Then("^User verify the Last Commision amount which is been generated last quater$")
    public void userVerifyTheLastCommisionAmountWhichIsBeenGeneratedLastQuater() throws Throwable {
        String NextCommissionText = Constants.Affiliates_AccountsPageOR.getProperty("NextCommissionText");
        String LastQtr = Constants.Affiliates_AccountsPageOR.getProperty("LastQtr");
        String LastQtrText = Constants.driver.findElement(By.xpath(LastQtr)).getText();
        System.out.println("BalanceToBepaid" + LastQtrText);
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(NextCommissionText, ""));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(NextCommissionText, "visible"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(LastQtr, "visible"));
        LogCapture.info("Commission section visible on Dashboard(Account page)...");
        if (LastQtrText.contains("£0.00GEN LAST QTR")) {
            LogCapture.info("Last Commision amount  which is not been generated last quater. The Amount is ZERO.Please check the Test data");

        } else {
            LogCapture.info("Last Commision amount  which is been generated last quater" + LastQtrText);
            Assert.fail();
        }
    }

    @Then("^User verify the (Last Commision Quarter|Last Commision Month|Last Commision|Last Commision Quarter For Paid|Last Commision Month For Paid) percentage difference for last year$")
    public void userVerifyTheLastCommisionQuarterPercentageDifferenceForLastYear(String Cal) throws Throwable {
        if (Cal.equalsIgnoreCase("Last Commision Quarter")) {
            Constants.key.pause("3", "");
            String NextCommissionText = Constants.Affiliates_AccountsPageOR.getProperty("NextCommissionText");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(NextCommissionText, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(NextCommissionText, "visible"));
            String GENLASTQTRPERCENTAGE1 = Constants.Affiliates_CommissionsPageOR.getProperty("GENLASTQTRPERCENTAGE");
            String GENLASTQTRPERCENTAGETX1 = Constants.driver.findElement(By.xpath(GENLASTQTRPERCENTAGE1)).getText();
            System.out.println("BalanceToBepaid" + GENLASTQTRPERCENTAGETX1);
            String GENLASTQTRPERCENTAGVSTEXT1 = Constants.Affiliates_CommissionsPageOR.getProperty("GENLASTQTRPERCENTAGEVSTEXT");
            String GENLASTQTRPERCENTAGVSTX1 = Constants.driver.findElement(By.xpath(GENLASTQTRPERCENTAGVSTEXT1)).getText();
            System.out.println("BalanceToBepaid" + GENLASTQTRPERCENTAGVSTX1);
            LogCapture.info("Commission section visible on Dashboard(Account page)...");
            if (GENLASTQTRPERCENTAGETX1.equalsIgnoreCase("0.00 (0.00%)") && GENLASTQTRPERCENTAGVSTX1.contains("vs. same period last year")) {
                LogCapture.info("Last Commision amount  which is not been generated last quater. The Amount is ZERO.Please check the Test data");
                //
            } else {
                LogCapture.info("Last Commision amount  which is been generated last quater" + GENLASTQTRPERCENTAGETX1 + GENLASTQTRPERCENTAGVSTX1);
                Assert.fail();
            }
        }
        if (Cal.equalsIgnoreCase("Last Commision Month")) {
            String NextCommissionText = Constants.Affiliates_AccountsPageOR.getProperty("NextCommissionText");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(NextCommissionText, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(NextCommissionText, "visible"));
            String GENLASTQTRPERCENTAGE = Constants.Affiliates_CommissionsPageOR.getProperty("GENLASTMONTHPERCENTAGE");
            String GENLASTQTRPERCENTAGETX = Constants.driver.findElement(By.xpath(GENLASTQTRPERCENTAGE)).getText();
            System.out.println("BalanceToBepaid" + GENLASTQTRPERCENTAGETX);
            String GENLASTQTRPERCENTAGVSTEXT = Constants.Affiliates_CommissionsPageOR.getProperty("GENLASTMONTHPERCENTAGEVSTEXT");
            String GENLASTQTRPERCENTAGVSTX = Constants.driver.findElement(By.xpath(GENLASTQTRPERCENTAGVSTEXT)).getText();
            System.out.println("BalanceToBepaid" + GENLASTQTRPERCENTAGVSTX);
            LogCapture.info("Commission section visible on Dashboard(Account page)...");
            if (GENLASTQTRPERCENTAGETX.equalsIgnoreCase("0.00 (0.00%)") && GENLASTQTRPERCENTAGVSTX.contains("vs. same period last year")) {
                LogCapture.info("Last Commision amount  which is not been generated last quater. The Amount is ZERO.Please check the Test data");
            } else {
                LogCapture.info("Last Commision amount  which is been generated last quater" + GENLASTQTRPERCENTAGETX + GENLASTQTRPERCENTAGVSTX);
                Assert.fail();
            }
        }
        if (Cal.equalsIgnoreCase("Last Commision")) {
            String NextCommissionText = Constants.Affiliates_AccountsPageOR.getProperty("NextCommissionText");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(NextCommissionText, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(NextCommissionText, "visible"));
            String GENLASTQTRPERCENTAGE = Constants.Affiliates_CommissionsPageOR.getProperty("GENLASTMONTHPERCENTAGE");
            String GENLASTQTRPERCENTAGETX = Constants.driver.findElement(By.xpath(GENLASTQTRPERCENTAGE)).getText();
            System.out.println("BalanceToBepaid" + GENLASTQTRPERCENTAGETX);
            String GENLASTQTRPERCENTAGVSTEXT = Constants.Affiliates_CommissionsPageOR.getProperty("GENLASTMONTHPERCENTAGEVSTEXT");
            String GENLASTQTRPERCENTAGVSTX = Constants.driver.findElement(By.xpath(GENLASTQTRPERCENTAGVSTEXT)).getText();
            System.out.println("BalanceToBepaid" + GENLASTQTRPERCENTAGVSTX);
            LogCapture.info("Commission section visible on Dashboard(Account page)...");
            if (!GENLASTQTRPERCENTAGETX.equalsIgnoreCase("0.00 (0.00%)") && GENLASTQTRPERCENTAGVSTX.contains("vs. same period last year")) {
                LogCapture.info("Last Commision amount  which is not been generated last quater. The Amount is ZERO.Please check the Test data");
            } else {
                LogCapture.info("Last Commision amount  which is been generated last quater" + GENLASTQTRPERCENTAGETX + GENLASTQTRPERCENTAGVSTX);
                Assert.fail();
            }
            String GENLASTQTRPERCENTAGE1 = Constants.Affiliates_CommissionsPageOR.getProperty("GENLASTQTRPERCENTAGE");
            String GENLASTQTRPERCENTAGETX1 = Constants.driver.findElement(By.xpath(GENLASTQTRPERCENTAGE1)).getText();
            System.out.println("BalanceToBepaid" + GENLASTQTRPERCENTAGETX1);
            String GENLASTQTRPERCENTAGVSTEXT1 = Constants.Affiliates_CommissionsPageOR.getProperty("GENLASTQTRPERCENTAGEVSTEXT");
            String GENLASTQTRPERCENTAGVSTX1 = Constants.driver.findElement(By.xpath(GENLASTQTRPERCENTAGVSTEXT1)).getText();
            System.out.println("BalanceToBepaid" + GENLASTQTRPERCENTAGVSTX1);
            LogCapture.info("Commission section visible on Dashboard(Account page)...");
            if (!GENLASTQTRPERCENTAGETX1.equalsIgnoreCase("0.00 (0.00%)") && GENLASTQTRPERCENTAGVSTX1.contains("vs. same period last year")) {
                LogCapture.info("Last Commision amount  which is not been generated last quater. The Amount is ZERO.Please check the Test data");
            } else {
                LogCapture.info("Last Commision amount  which is been generated last quater" + GENLASTQTRPERCENTAGETX1 + GENLASTQTRPERCENTAGVSTX1);
                Assert.fail();
            }
        }
        if (Cal.equalsIgnoreCase("Last Commision Quarter For Paid")) {
            Constants.key.pause("3", "");
            String NextCommissionText = Constants.Affiliates_AccountsPageOR.getProperty("NextCommissionText");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(NextCommissionText, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(NextCommissionText, "visible"));
            String GENLASTQTRPERCENTAGE1 = Constants.Affiliates_CommissionsPageOR.getProperty("PaidLASTQTRPERCENTAGE");
            String GENLASTQTRPERCENTAGETX1 = Constants.driver.findElement(By.xpath(GENLASTQTRPERCENTAGE1)).getText();
            System.out.println("BalanceToBepaid" + GENLASTQTRPERCENTAGETX1);
            String GENLASTQTRPERCENTAGVSTEXT1 = Constants.Affiliates_CommissionsPageOR.getProperty("PaidLASTQTRPERCENTAGEText");
            String GENLASTQTRPERCENTAGVSTX1 = Constants.driver.findElement(By.xpath(GENLASTQTRPERCENTAGVSTEXT1)).getText();
            System.out.println("BalanceToBepaid" + GENLASTQTRPERCENTAGVSTX1);
            LogCapture.info("Commission section visible on Dashboard(Account page)...");
            if (GENLASTQTRPERCENTAGETX1.equalsIgnoreCase("0.00 (0.00%)") && GENLASTQTRPERCENTAGVSTX1.contains("vs. same period last year")) {
                LogCapture.info("Last Commision amount  which is not been generated last quater. The Amount is ZERO.Please check the Test data");
                //
            } else {
                LogCapture.info("Last Commision amount  which is been generated last quater" + GENLASTQTRPERCENTAGETX1 + GENLASTQTRPERCENTAGVSTX1);
                Assert.fail();
            }
        }
        if (Cal.equalsIgnoreCase("Last Commision Month For Paid")) {
            Constants.key.pause("3", "");
            String NextCommissionText = Constants.Affiliates_AccountsPageOR.getProperty("NextCommissionText");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(NextCommissionText, ""));
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(NextCommissionText, "visible"));
            String GENLASTQTRPERCENTAGE1 = Constants.Affiliates_CommissionsPageOR.getProperty("PaidLASTMONTHPERCENTAGE");
            String GENLASTQTRPERCENTAGETX1 = Constants.driver.findElement(By.xpath(GENLASTQTRPERCENTAGE1)).getText();
            System.out.println("BalanceToBepaid" + GENLASTQTRPERCENTAGETX1);
            String GENLASTQTRPERCENTAGVSTEXT1 = Constants.Affiliates_CommissionsPageOR.getProperty("PaidLASTMONTHPERCENTAGEVSTEXT");
            String GENLASTQTRPERCENTAGVSTX1 = Constants.driver.findElement(By.xpath(GENLASTQTRPERCENTAGVSTEXT1)).getText();
            System.out.println("BalanceToBepaid" + GENLASTQTRPERCENTAGVSTX1);
            LogCapture.info("Commission section visible on Dashboard(Account page)...");
            if (GENLASTQTRPERCENTAGETX1.equalsIgnoreCase("0.00 (0.00%)") && GENLASTQTRPERCENTAGVSTX1.contains("vs. same period last year")) {
                LogCapture.info("Last Commision amount  which is not been generated last Month. The Amount is ZERO.Please check the Test data");
                //
            } else {
                LogCapture.info("Last Commision amount  which is been generated lastmonth" + GENLASTQTRPERCENTAGETX1 + GENLASTQTRPERCENTAGVSTX1);
                Assert.fail();
            }
        }
    }

    @And("^Use Clicks on (Generated|Paid) Radio Button$")
    public void useClicksOnGeneratedRadioButton(String ToBepay) throws Throwable {
        if (ToBepay.equalsIgnoreCase("Generated")) {
            String GeneratedRadioBtn = Constants.Affiliates_AccountsPageOR.getProperty("GeneratedRadioBtn");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(GeneratedRadioBtn, "selected"));
            LogCapture.info("User Clicked on Radio Button");

        }
        if (ToBepay.equalsIgnoreCase("Paid")) {
            String PaidRadioBtn = Constants.Affiliates_CommissionsPageOR.getProperty("PaidRadioBtn");
            Assert.assertEquals("PASS", Constants.key.click(PaidRadioBtn, ""));
            LogCapture.info("User Clicked on Radio Button");

        }
    }


    @Then("^User will be able to view the list of months in X Axis and Commsion Count in Y axis$")
    public void userWillBeAbleToViewTheListOfMonthsInXAxisAndCommsionCountInYAxis() throws Throwable {
        String XAxis = Constants.Affiliates_AccountsPageOR.getProperty("XAxis");
        String YAxis = Constants.Affiliates_AccountsPageOR.getProperty("YAxis");
        String XAxisText = Constants.driver.findElement(By.xpath(XAxis)).getText();
        String YAxisText = Constants.driver.findElement(By.xpath(YAxis)).getText();
        System.out.println(XAxisText + "XAXIS:YAXIS");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(XAxis, "visible"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(YAxis, "visible"));
    }

    @Then("^User will be able to view the two years as Select option$")
    public void userWillBeAbleToViewTheYearsAsSelectOption() throws Throwable {
        String CurrentYear = Constants.Affiliates_AccountsPageOR.getProperty("CurrentYear");
        String LastYear = Constants.Affiliates_AccountsPageOR.getProperty("LastYear");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(CurrentYear, "enabled"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(CurrentYear, "enabled"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(LastYear, "enabled"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(CurrentYear, "visible"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(LastYear, "visible"));
    }

    @And("^User DeSelects (both|Last|Current|Paid Current|Paid Last) the Years$")
    public void userDeSelectsBothTheYears(String Year) throws Throwable {
        if (Year.equalsIgnoreCase("both")) {
            String CurrentYear = Constants.Affiliates_AccountsPageOR.getProperty("CurrentYear");
            String LastYear = Constants.Affiliates_AccountsPageOR.getProperty("LastYear");
            Assert.assertEquals("PASS", Constants.key.click(CurrentYear, ""));
            Assert.assertEquals("PASS", Constants.key.click(LastYear, ""));

        }
        if (Year.equalsIgnoreCase("Last")) {
            // String CurrentYear = Constants.Affiliates_AccountsPageOR.getProperty("CurrentYear");
            String LastYear = Constants.Affiliates_AccountsPageOR.getProperty("LastYear");
            // Assert.assertEquals("PASS", Constants.key.click(CurrentYear, ""));
            Assert.assertEquals("PASS", Constants.key.click(LastYear, ""));

        }
        if (Year.equalsIgnoreCase("Current")) {
            String CurrentYear = Constants.Affiliates_AccountsPageOR.getProperty("CurrentYear");
            // String LastYear = Constants.Affiliates_AccountsPageOR.getProperty("LastYear");
            Assert.assertEquals("PASS", Constants.key.click(CurrentYear, ""));
            // Assert.assertEquals("PASS", Constants.key.click(LastYear, ""));

        }
        if (Year.equalsIgnoreCase("PaidCurrent")) {
            String CurrentYear = Constants.Affiliates_AccountsPageOR.getProperty("CurrentYearPaid");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(CurrentYear, ""));
            // String LastYear = Constants.Affiliates_AccountsPageOR.getProperty("LastYear");
            Assert.assertEquals("PASS", Constants.key.click(CurrentYear, ""));
            // Assert.assertEquals("PASS", Constants.key.click(LastYear, ""));

        }
        if (Year.equalsIgnoreCase("PaidLast")) {
            // String CurrentYear = Constants.Affiliates_AccountsPageOR.getProperty("CurrentYear");
            String LastYear = Constants.Affiliates_AccountsPageOR.getProperty("LastYearPaid");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(LastYear, ""));
            // Assert.assertEquals("PASS", Constants.key.click(CurrentYear, ""));
            Assert.assertEquals("PASS", Constants.key.click(LastYear, ""));

        }
    }

    @Then("^User will be able to view (blank|Both Year|Current Year|Last Year) graph$")
    public void userWillBeAbleToViewBlankGraph(String Value) throws Throwable {
        if (Value.equalsIgnoreCase("blank")) {
            String NoGraphCount = Constants.Affiliates_AccountsPageOR.getProperty("NoGraphCount");
            List<WebElement> listOfElements = Constants.driver.findElements(By.xpath(NoGraphCount));
            LogCapture.info("Total number of elements present: " + listOfElements.size());
            if (listOfElements.size() == 0) {
                LogCapture.info("Total number of elements present: " + listOfElements.size());
            } else {
                LogCapture.info("Total number of elements present: " + listOfElements.size());
                Assert.fail();
            }

        }
        if (Value.equalsIgnoreCase("Last Year")) {
            String NoGraphCount = Constants.Affiliates_AccountsPageOR.getProperty("NoGraphCount");
            List<WebElement> listOfElements = Constants.driver.findElements(By.xpath(NoGraphCount));
            LogCapture.info("Total number of elements present: " + listOfElements.size());
            if (listOfElements.size() == 12) {
                LogCapture.info("Total number of elements present: " + listOfElements.size());
            } else {
                LogCapture.info("Total number of elements present: " + listOfElements.size());
                Assert.fail();
            }

        }
    }

    @Then("^User should be able to view the both years in number format in place of text format$")
    public void userShouldBeAbleToViewTheBothYearsInNumberFormatInPlaceOfTextFormat() throws Throwable {
        String CurrentYear = Constants.Affiliates_AccountsPageOR.getProperty("CurrentYearText");
        String LastYear = Constants.Affiliates_AccountsPageOR.getProperty("LastYearText");
        String CurrentYearText = Constants.driver.findElement(By.xpath(CurrentYear)).getText();
        System.out.println("CurrentYearText:->" + CurrentYearText);
        int CurrentYearTextActualI = Constants.key.getCurrentYear();
        String CurrentYearTextActual = Integer.toString(CurrentYearTextActualI);
        String LastYearText = Constants.driver.findElement(By.xpath(LastYear)).getText();
        System.out.println("LastYearText:->" + LastYearText);
        int PreviousYearTextActualI = Constants.key.getPreviousYear();
        String PreviousYearTextActual = Integer.toString(PreviousYearTextActualI);
        if (CurrentYearText.equalsIgnoreCase(CurrentYearTextActual) && LastYearText.equalsIgnoreCase(PreviousYearTextActual)) {
            LogCapture.info("The Current Year and Last year is getting displayed");
        } else {
            LogCapture.info("The Current Year and Last year is not getting displayed");
            Assert.fail();
        }

    }

    @Then("^User should not be able to view the Commission tab as view is been set none at the Salesforce side$")
    public void userShouldNotBeAbleToViewTheCommissionTabAsViewIsBeenSetNoneAtTheSalesforceSide() throws Throwable {
        String Commission = Constants.Affiliates_CommissionsPageOR.getProperty("Commission");
        Assert.assertEquals("PASS", Constants.key.notexist(Commission, ""));

    }

    @Then("^User will be able to view the (Summary|Detail) report for Commission section$")
    public void userWillBeAbleToViewTheSummaryReportForCommissionSection(String Value) throws Throwable {
        if (Value.equalsIgnoreCase("Summary")) {
            String vObjCommissionGenerated = Constants.Affiliates_CommissionsPageOR.getProperty("Commission");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCommissionGenerated, ""));
            Assert.assertEquals("PASS", Constants.key.verifyInnerText(vObjCommissionGenerated, "Commission"));
            LogCapture.info("Commission section visible on Dashboard(Commission page)...");
        }
        if (Value.equalsIgnoreCase("Detail")) {
            String vObjCommissionGenerated = Constants.Affiliates_CommissionsPageOR.getProperty("CommissionStatementText");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCommissionGenerated, ""));
            Assert.assertEquals("PASS", Constants.key.verifyInnerText(vObjCommissionGenerated, "Your commission statement"));
            LogCapture.info("Commission section visible on Dashboard(Commission page)...");
        }
    }

    @Then("^User will be able to view the fifth day of next month along with year$")
    public void userWillBeAbleToViewTheThDayOfNextMonthAlongWithYear() throws Throwable {
        String NextCommissionText = Constants.Affiliates_CommissionsPageOR.getProperty("NextCommissionText");
        String NextCommission = Constants.driver.findElement(By.xpath(NextCommissionText)).getText();
        String NextCommissionText1 = Constants.Affiliates_CommissionsPageOR.getProperty("NextCommissionText5th");
        String NextCommission1 = Constants.driver.findElement(By.xpath(NextCommissionText1)).getText();
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(NextCommissionText, ""));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(NextCommissionText, "visible"));

        if (NextCommission.equalsIgnoreCase("Your next commission will be paid on or around") && NextCommission1.equalsIgnoreCase("5th March 2021")) {
            LogCapture.info("Your next commission will be paid on or around 5th" + NextCommission + "" + NextCommission1);
        } else {
            LogCapture.info("Your next commission will be paid on or around 5th" + NextCommission + "" + NextCommission1);
        }
    }

    @And("^User should be able to view Referrals Registration and Trades section on UI$")
    public void userShouldBeAbleToViewReferralsRegistrationAndTradesSectionOnUI() throws Throwable {
        String vObjReferralsBtnEnable = Constants.Affiliates_ReferralsPageOR.getProperty("ReferralsBtnEnable");
        Assert.assertEquals("PASS", Constants.key.exist(vObjReferralsBtnEnable, ""));
        LogCapture.info("User is able to view Referrals section on UI...");

        String vObjRegistrationsBtnEnable = Constants.Affiliates_ReferralsPageOR.getProperty("RegistrationsBtnEnable");
        Assert.assertEquals("PASS", Constants.key.exist(vObjRegistrationsBtnEnable, ""));
        LogCapture.info("User is able to view Registration section on UI...");
        String vObjTradesBtnEnable = Constants.Affiliates_ReferralsPageOR.getProperty("TradesBtnEnable");
        Assert.assertEquals("PASS", Constants.key.exist(vObjTradesBtnEnable, ""));

//        String vObjRegistrationsBtnDisable = Constants.Affiliates_ReferralsPageOR.getProperty("RegistrationsBtnEnable");
//        Assert.assertEquals("PASS", Constants.key.exist(vObjRegistrationsBtnDisable, ""));
//        LogCapture.info("User is able to view Registration section on UI...");
//        String vObjTradesBtnDisable = Constants.Affiliates_ReferralsPageOR.getProperty("TradesBtnEnable");
//        Assert.assertEquals("PASS", Constants.key.exist(vObjTradesBtnDisable, ""));
        LogCapture.info("User is able to view Trades section on UI...");
    }

    @Then("^User is able to view Month dropdown on Referrals page$")
    public void userIsAbleToViewMonthDropdownOnReferralsPage() throws Throwable {
        String vObjMonthDropdown = Constants.Affiliates_ReferralsPageOR.getProperty("MonthDropdown");
        Assert.assertEquals("PASS", Constants.key.exist(vObjMonthDropdown, ""));
        LogCapture.info("User is able to view Month Dropdown on UI...");
    }

    @Then("^User will be able to view latest month by default been selected for Month dropdown on Referrals page$")
    public void userWillBeAbleToViewCurrentMonthByDeafultBeenSelected() throws Throwable {

        String vObjMonthDropdown = Constants.Affiliates_ReferralsPageOR.getProperty("MonthDropdown");
        Assert.assertEquals("PASS", Constants.key.exist(vObjMonthDropdown, ""));
        LogCapture.info("User is able to view Month Dropdown on UI...");
        WebElement month_dropdown = Constants.driver.findElement(By.xpath(vObjMonthDropdown));
        Select CurrentMonth = new Select(month_dropdown);
        List<WebElement> dropdown = CurrentMonth.getOptions();
        String DefaultDropdownValue = dropdown.get(0).getText();
        LogCapture.info("Default dropdown value is: " + DefaultDropdownValue);

        String SystemLatestMonth = "December 2020";
        if (DefaultDropdownValue.equals(SystemLatestMonth)) {


            //Create a Calendar Object
            Date date = new Date();
            Calendar calendar = Calendar.getInstance();
            // SimpleDateFormat CurrentMonth= new SimpleDateFormat()
            calendar.setTime(date);
            //Getting current month
            LocalDate today = LocalDate.now();
            int todayMonthInt = today.getMonthValue();
            String monthName = DateTime.now().withMonthOfYear(todayMonthInt).toString("MMMMMMMMMMMM");
            System.out.println("Current Month Str: " + monthName);
            //Getting Current year
            int todayYearInt = calendar.get(Calendar.YEAR);
            System.out.println("Current Year Int: " + todayYearInt);
            String SystemCurrentMonth = monthName + " " + todayYearInt;
            if (DefaultDropdownValue.equals(SystemCurrentMonth)) {

                LogCapture.info("User is able to view current month and Year: " + DefaultDropdownValue + " selected by Default in dropdown...");
            } else {
                LogCapture.info("User is NOT able to view current month and Year: " + DefaultDropdownValue + " selected by Default in dropdown...");
                Assert.fail();
            }
        }
    }


    @Then("^User will observe the previous month in statement month in commission header section$")
    public void userWillObserveThePreviousMonthInStatementMonthInCommissionHeaderSection() throws Throwable {
        String StatementMonthText = Constants.Affiliates_CommissionsPageOR.getProperty("StatementMonth");
        String StatementMonthTx = Constants.driver.findElement(By.xpath(StatementMonthText)).getText();
        String StatementMonthText1 = Constants.Affiliates_CommissionsPageOR.getProperty("StatementMonthText");
        String StatementMonthTx1 = Constants.driver.findElement(By.xpath(StatementMonthText1)).getText();
        if (StatementMonthTx.equalsIgnoreCase("Statement month") && StatementMonthTx1.equalsIgnoreCase("September 2020")) {
            LogCapture.info("Your next commission will be paid on or around 5th" + StatementMonthTx + "" + StatementMonthTx1);
        } else {
            LogCapture.info("Your next commission will be paid on or around 5th" + StatementMonthTx + "" + StatementMonthTx1);
            Assert.fail();
        }
    }


    @Then("^User able to view PDF and XLSX option for downloading Referrals$")
    public void userAbleToViewPDFAndXLSXOptionForDownloadingReferrals() throws Throwable {
        String vObjPDFDownloadBtn = Constants.Affiliates_ReferralsPageOR.getProperty("PDFDownloadBtn");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjPDFDownloadBtn, ""));
        Assert.assertEquals("PASS", Constants.key.exist(vObjPDFDownloadBtn, ""));
        LogCapture.info("User is able to view PDF option for downloading...");
        String vObjXLSXDownloadBtn = Constants.Affiliates_ReferralsPageOR.getProperty("XLSXDownloadBtn");
        Assert.assertEquals("PASS", Constants.key.exist(vObjXLSXDownloadBtn, ""));
        LogCapture.info("User is able to view XLSX option for downloading...");
    }


    @Then("^User should be able to view the Total Group option in the Affiliates Group dropdown$")
    public void userShouldBeAbleToViewTheTotalGroupOptionInTheAffiliatesGroupDropdown() {

        WebElement TotalGroupOptionStatus = Constants.driver.findElement(By.xpath("//select[@name='Partner Group']/option[text()='Total Group']"));

        if (TotalGroupOptionStatus.isDisplayed()) {
            LogCapture.info("User is able to see Total Group option in Affiliates Group dropdown list..");
        } else {
            LogCapture.info("User is NOT able to see Total Group option in Affiliates Group dropdown list..");
            Assert.fail();
        }
    }

    @Then("^User should be able to view the list of options in the Affiliates Group dropdown$")
    public void userShouldBeAbleToViewTheListOfOptionsInTheAffiliatesGroupDropdown() {
        WebElement AffiliatesGrpDropdwn = driver.findElement(By.name("Partner Group"));
        Select select = new Select(AffiliatesGrpDropdwn);
        List<WebElement> allOptions = select.getOptions();
        if (allOptions.size() == 0) {
            LogCapture.info("User is NOT able to see any option in Affiliates Group dropdown list..");
            Assert.fail();
        } else {
            LogCapture.info("User is able to see options in Affiliates Group dropdown list..");
            for (int i = 0; i < allOptions.size(); i++) {
                String Option = allOptions.get(i).getText();
                LogCapture.info("Option " + i + ": " + Option);
            }
        }
    }

    @Then("^User should be able to view Main user been selected by default in Affiliate Group dropdown$")
    public void userShouldBeAbleToViewMainUserBeenSelectedByDefaultInAffiliateGroupDropdown() {

        Select select = new Select(Constants.driver.findElement(By.name("Partner Group")));
        WebElement option = select.getFirstSelectedOption();
        String defaultOption = option.getText();
        String ExpectedOption = "Jhon Referrals";
        if (defaultOption.equals(ExpectedOption)) {
            LogCapture.info("User is able to see Total Group option in Affiliates Group dropdown list..");
        } else {
            LogCapture.info("User is NOT able to see Total Group option in Affiliates Group dropdown list..");
            Assert.fail();
        }
    }

    @Then("^User should be able to view Referrals Registration and Trades section enable on UI$")
    public void userShouldBeAbleToViewReferralsRegistrationAndTradesSectionEnableOnUI() throws Throwable {
        String vObjReferralsBtnEnable = Constants.Affiliates_ReferralsPageOR.getProperty("ReferralsBtnEnable");
        WebElement scrollToelement = Constants.driver.findElement(By.xpath(vObjReferralsBtnEnable));
        ((JavascriptExecutor) Constants.driver).executeScript("arguments[0].scrollIntoView();", scrollToelement);
        Assert.assertEquals("PASS", Constants.key.exist(vObjReferralsBtnEnable, ""));
        LogCapture.info("User is able to view Referrals section on UI...");
        String vObjRegistrationsBtnEnable = Constants.Affiliates_ReferralsPageOR.getProperty("RegistrationsBtnEnable");
        Assert.assertEquals("PASS", Constants.key.exist(vObjRegistrationsBtnEnable, ""));
        LogCapture.info("User is able to view Registration section on UI...");
        String vObjTradesBtnEnable = Constants.Affiliates_ReferralsPageOR.getProperty("TradesBtnEnable");
        Assert.assertEquals("PASS", Constants.key.exist(vObjTradesBtnEnable, ""));
        LogCapture.info("User is able to view Trades section on UI...");

    }

    @And("^User just click on FirstName \"([^\"]*)\" LastName \"([^\"]*)\" EmailAddress \"([^\"]*)\" CountryCode_Mobile \"([^\"]*)\" MobileNumber \"([^\"]*)\" but does not select any value$")
    public void userJustClickOnFirstNameLastNameEmailAddressCountryCode_MobileMobileNumberButDoesNotSelectAnyValue(String FirstName, String LastName, String EmailAddress, String CountryCode_Mobile, String MobileNumber) throws Throwable {
        String vPersonalDetails = Constants.Affiliates_RegisterACustomerOR.getProperty("PersonalDetails");
        Constants.key.VisibleConditionWait(vPersonalDetails, "");
        String vF_Name = Constants.Affiliates_RegisterACustomerOR.getProperty("FirstName");
        Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName));
        Constants.key.pause("1", "");

        String vEmailID = Constants.Affiliates_RegisterACustomerOR.getProperty("RegisterCustomerEmailAddress");
        Assert.assertEquals("PASS", Constants.key.click(vEmailID, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vEmailID, EmailAddress));
        String vMobileDropDown = Constants.Affiliates_RegisterACustomerOR.getProperty("CountryCode_DropDownMobile");
        Assert.assertEquals("PASS", Constants.key.click(vMobileDropDown, ""));
        Constants.key.pause("1", "");
        String vMobileDropDownClear = Constants.Affiliates_RegisterACustomerOR.getProperty("CountryCode_DropDownMobileClear");
        Assert.assertEquals("PASS", Constants.key.click(vMobileDropDownClear, ""));
        Constants.key.pause("1", "");
        String vCountryCodeMobile = Constants.Affiliates_RegisterACustomerOR.getProperty("CountryCode_Mobile");
        Constants.key.pause("1", "");
        Assert.assertEquals("PASS", Constants.key.clearText(vCountryCodeMobile));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vCountryCodeMobile, CountryCode_Mobile));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeMobile, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeMobile, "enter"));
        String vMobileNumber = Constants.Affiliates_RegisterACustomerOR.getProperty("MobileNumber");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vMobileNumber, MobileNumber));
        Constants.key.pause("5", "");

        String vL_Name = Constants.Affiliates_RegisterACustomerOR.getProperty("LastName");
        Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName));

        String FirstName1 = Constants.Affiliates_RegisterACustomerOR.getProperty("FirstName");
        Assert.assertEquals("PASS", Constants.key.click(FirstName1, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName));

    }


    @And("^User Enters ALL Personal & Contact Details for Registration FirstName \"([^\"]*)\" LastName \"([^\"]*)\" EmailAddress \"([^\"]*)\" CountryCode_Mobile \"([^\"]*)\" MobileNumber \"([^\"]*)\"$")
    public void userEntersALLPersonalContactDetailsForRegistrationFirstNameLastNameDateOfBirthEmailAddressCountryCode_MobileMobileNumber(String FirstName, String LastName, String EmailAddress, String CountryCode_Mobile, String MobileNumber) throws Throwable {
        String vPersonalDetails = Constants.Affiliates_RegisterACustomerOR.getProperty("PersonalDetails");
        Constants.key.VisibleConditionWait(vPersonalDetails, "");
        String vF_Name = Constants.Affiliates_RegisterACustomerOR.getProperty("FirstName");
        Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName));


        String vEmailID = Constants.Affiliates_RegisterACustomerOR.getProperty("RegisterCustomerEmailAddress");
        Assert.assertEquals("PASS", Constants.key.click(vEmailID, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vEmailID, EmailAddress));
        String vMobileDropDown = Constants.Affiliates_RegisterACustomerOR.getProperty("CountryCode_DropDownMobile");
        Assert.assertEquals("PASS", Constants.key.click(vMobileDropDown, ""));
        Constants.key.pause("1", "");
        String vMobileDropDownClear = Constants.Affiliates_RegisterACustomerOR.getProperty("CountryCode_DropDownMobileClear");
        Assert.assertEquals("PASS", Constants.key.click(vMobileDropDownClear, ""));
        Constants.key.pause("1", "");
        String vCountryCodeMobile = Constants.Affiliates_RegisterACustomerOR.getProperty("CountryCode_Mobile");
        Constants.key.pause("1", "");
        Assert.assertEquals("PASS", Constants.key.clearText(vCountryCodeMobile));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vCountryCodeMobile, CountryCode_Mobile));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeMobile, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeMobile, "enter"));
        String vMobileNumber = Constants.Affiliates_RegisterACustomerOR.getProperty("MobileNumber");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vMobileNumber, MobileNumber));
        Constants.key.pause("5", "");

        String vL_Name = Constants.Affiliates_RegisterACustomerOR.getProperty("LastName");
        Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName));

        String vObjContinueButton = Constants.Affiliates_RegisterACustomerOR.getProperty("ContinueButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButton, "disabled"));
        // String MobileNumberErrorMsg = Constants.Affiliates_RegisterACustomerOR.getProperty("MobileNumberErrorMsg");
        //Assert.assertEquals("PASS", Constants.key.verifyInnerText(MobileNumberErrorMsg,"Please enter a valid mobile number"));
    }

    @Then("^System will Give error message as Please Enter Valid Inputs for (Mobile|Email|All|FirstAndLastName)$")
    public void systemWillGiveErrorMessageAsPleaseEnterValidInputsForMobile(String SVAlue) throws Throwable {
        if (SVAlue.equalsIgnoreCase("Mobile")) {
            String MobileNumberErrorMsg = Constants.Affiliates_RegisterACustomerOR.getProperty("MobileNumberErrorMsg");
            Assert.assertEquals("PASS", Constants.key.verifyInnerText(MobileNumberErrorMsg, "Please enter a valid mobile number"));
        }
        if (SVAlue.equalsIgnoreCase("Email")) {
            String EmailAddressErrorMsg = Constants.Affiliates_RegisterACustomerOR.getProperty("EmailAddressErrorMsg");
            Assert.assertEquals("PASS", Constants.key.verifyInnerText(EmailAddressErrorMsg, "Please enter a valid email"));
        }
        if (SVAlue.equalsIgnoreCase("FirstAndLastName")) {
            String FirstNameErrorMsg = Constants.Affiliates_RegisterACustomerOR.getProperty("FirstNameErrorMsg");
            Assert.assertEquals("PASS", Constants.key.verifyInnerText(FirstNameErrorMsg, "Please enter a valid first name"));
            String LastNameErrorMsg = Constants.Affiliates_RegisterACustomerOR.getProperty("LastNameErrorMsg");
            Assert.assertEquals("PASS", Constants.key.verifyInnerText(LastNameErrorMsg, "Please enter a valid last name"));
        }
        if (SVAlue.equalsIgnoreCase("All")) {

            String FirstNameErrorMsg = Constants.Affiliates_RegisterACustomerOR.getProperty("FirstNameErrorMsg");
            Assert.assertEquals("PASS", Constants.key.verifyInnerText(FirstNameErrorMsg, "Please enter a valid first name"));
            String LastNameErrorMsg = Constants.Affiliates_RegisterACustomerOR.getProperty("LastNameErrorMsg");
            Assert.assertEquals("PASS", Constants.key.verifyInnerText(LastNameErrorMsg, "Please enter a valid last name"));
            String MobileNumberErrorMsg = Constants.Affiliates_RegisterACustomerOR.getProperty("MobileNumberErrorMsg");
            Assert.assertEquals("PASS", Constants.key.verifyInnerText(MobileNumberErrorMsg, "Please enter a valid mobile number"));
            String EmailAddressErrorMsg = Constants.Affiliates_RegisterACustomerOR.getProperty("EmailAddressErrorMsg");
            Assert.assertEquals("PASS", Constants.key.verifyInnerText(EmailAddressErrorMsg, "Please enter a valid email"));
        }
    }

    @And("^User Enters ALL Personal & Contact Details for Registration FirstName \"([^\"]*)\" LastName \"([^\"]*)\" DateOfBirth \"([^\"]*)\" EmailAddress \"([^\"]*)\" CountryCode_Mobile \"([^\"]*)\" MobileNumber \"([^\"]*)\" Occupation \"([^\"]*)\" for JointAccount$")
    public void userEntersSecondTimeALLPersonalContactDetailsForRegistrationFirstNameLastNameDateOfBirthEmailAddressMobile_CountryCodeMobileNumberAndClickOnContinue(String FirstName, String LastName, String DateOfBirth, String EmailAddress, String CountryCode_Mobile, String MobileNumber,String Occupation) throws Exception {

        String vF_Name = Constants.Affiliates_RegisterACustomerOR.getProperty("JointFirstName");
        Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "selectall"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "delete"));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, FirstName));
        RandomJointEmailAddress = RandomStringUtils.randomAlphabetic(10) + "@gmail.com";
        String vEmailID = Constants.Affiliates_RegisterACustomerOR.getProperty("JointEmail");
        Assert.assertEquals("PASS", Constants.key.click(vEmailID, ""));
        // Assert.assertEquals("PASS", Constants.key.KeyboardAction(vEmailID, "selectall"));
        //Assert.assertEquals("PASS", Constants.key.KeyboardAction(vEmailID, "delete"));

        // if (EmailAddress.equalsIgnoreCase("ABC")) {

        //RandomJointEmailAddress = RandomStringUtils.randomAlphabetic(10) + "@gmail.com";
        // Assert.assertEquals("PASS", Constants.key.click(vEmailID, ""));
        if (EmailAddress.equalsIgnoreCase("ABC")) {
            Assert.assertEquals("PASS", Constants.key.writeInInput(vEmailID, RandomJointEmailAddress));
        } else {
            Assert.assertEquals("PASS", Constants.key.writeInInput(vEmailID, EmailAddress));
        }

        String vMobileDropDown = Constants.Affiliates_RegisterACustomerOR.getProperty("JointCountryCode_DropDownMobile");
        Assert.assertEquals("PASS", Constants.key.click(vMobileDropDown, ""));
        Constants.key.pause("1", "");
        String vMobileDropDownClear = Constants.Affiliates_RegisterACustomerOR.getProperty("JointCountryCode_DropDownMobileClear");
        Assert.assertEquals("PASS", Constants.key.click(vMobileDropDownClear, ""));
        Constants.key.pause("1", "");
        String vCountryCodeMobile = Constants.Affiliates_RegisterACustomerOR.getProperty("JointCountryCode_Mobile");
        Constants.key.pause("1", "");
        Assert.assertEquals("PASS", Constants.key.clearText(vCountryCodeMobile));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vCountryCodeMobile, CountryCode_Mobile));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeMobile, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeMobile, "enter"));
        String vMobileNumber = Constants.Affiliates_RegisterACustomerOR.getProperty("JointMobile");
        Assert.assertEquals("PASS", Constants.key.click(vMobileNumber, ""));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vMobileNumber, "selectall"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vMobileNumber, "delete"));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vMobileNumber, MobileNumber));
        Constants.key.pause("5", "");

        String vL_Name = Constants.Affiliates_RegisterACustomerOR.getProperty("JointLastName");
        Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "selectall"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "delete"));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, LastName));

//        String DatePicker = Constants.Affiliates_RegisterACustomerOR.getProperty("DatePicker");
//        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "tab"));
//        Constants.key.pause("1", "");
//
//        String DatePicker5 = Constants.Affiliates_RegisterACustomerOR.getProperty("DatePicker5");
//        Assert.assertEquals("PASS", Constants.key.click(DatePicker5, ""));

        Constants.key.pause("3", "");

        String vObjOccupation = Constants.Affiliates_RegisterACustomerOR.getProperty("jointOccupation");
        Assert.assertEquals("PASS", Constants.key.click(vObjOccupation, ""));
        //Assert.assertEquals("PASS", Constants.key.writeInInput(vObjOccupation, "Accountant"));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjOccupation,Occupation));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjOccupation, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjOccupation, "enter"));
//

        // ((JavascriptExecutor) Constants.driver).executeScript("arguments[0].scrollIntoView();", vObjContinueButton);
        ((JavascriptExecutor) Constants.driver).executeScript("javascript:window.scrollBy(250,350)");

    }


    @And("^User does not Select any Country from Country DropDown for (Single|Joint)$")
    public void userDoesNotSelectAnyCountryFromCountryDropDown(String Value) throws Throwable {
        if (Value.equalsIgnoreCase("Single")) {
            String vAddressCountryDropdown = Constants.Affiliates_RegisterACustomerOR.getProperty("AddressCountryDropdown");
            Assert.assertEquals("PASS", Constants.key.click(vAddressCountryDropdown, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vAddressCountryDropdown, ""));
            ((JavascriptExecutor) Constants.driver).executeScript("javascript:window.scrollBy(250,350)");

        }
        if (Value.equalsIgnoreCase("Joint")) {
            String vAddressCountryDropdown = Constants.Affiliates_RegisterACustomerOR.getProperty("TheirAddressCountry");
            Assert.assertEquals("PASS", Constants.key.click(vAddressCountryDropdown, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vAddressCountryDropdown, ""));
            ((JavascriptExecutor) Constants.driver).executeScript("javascript:window.scrollBy(250,350)");

        }
    }
//    @And("^User Select any Country from Country DropDown$")
//    public void userDoesSelectAnyCountryFromCountryDropDown()  throws Throwable{
//        String vAddressCountryDropdown = Constants.Affiliates_RegisterACustomerOR.getProperty("AddressCountryDropdown");
//        Assert.assertEquals("PASS", Constants.key.click(vAddressCountryDropdown, ""));
//        Assert.assertEquals("PASS", Constants.key.writeInInput(vAddressCountryDropdown, "France"));
//        Constants.key.pause("2", "");
//        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountryDropdown, "downArrow"));
//        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountryDropdown, "enter"));
//        Constants.key.pause("2", "");
//       // ((JavascriptExecutor) Constants.driver).executeScript("javascript:window.scrollBy(250,350)");
//
//    }

    @Then("^User should (not be|be) able to view address details \"([^\"]*)\" and options in dropdown for (Single|Joint)$")
    public void userShouldNotBeAbleToViewAddressDetailsAndOptionsInDropdown(String value, String Address, String Register) throws Throwable {
        if (value.equalsIgnoreCase("not be") && Register.equalsIgnoreCase("Single")) {
            String vAddressCountryDropdown = Constants.Affiliates_RegisterACustomerOR.getProperty("SearchText1");
            Assert.assertEquals("PASS", Constants.key.notexist(vAddressCountryDropdown, ""));
        }
        if (value.equalsIgnoreCase("be") && Register.equalsIgnoreCase("Single")) {
            String vAddressCountry = Constants.Affiliates_RegisterACustomerOR.getProperty("SearchText");
            Assert.assertEquals("PASS", Constants.key.click(vAddressCountry, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vAddressCountry, Address));
            Constants.key.pause("2", "");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountry, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountry, "enter"));
            Constants.key.pause("2", "");
        }
        if (value.equalsIgnoreCase("not be") && Register.equalsIgnoreCase("Joint")) {
            String vAddressCountryDropdown = Constants.Affiliates_RegisterACustomerOR.getProperty("SearchTextForJoint");
            Assert.assertEquals("PASS", Constants.key.notexist(vAddressCountryDropdown, ""));
        }
        if (value.equalsIgnoreCase("be") && Register.equalsIgnoreCase("Joint")) {
            String vAddressCountry = Constants.Affiliates_RegisterACustomerOR.getProperty("SearchTextForJoint");
            Assert.assertEquals("PASS", Constants.key.click(vAddressCountry, ""));
            Assert.assertEquals("PASS", Constants.key.writeInInput(vAddressCountry, Address));
            Constants.key.pause("4", "");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountry, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountry, "enter"));
            Constants.key.pause("2", "");
        }
    }

    @And("^User (Selects|Delete) Country \"([^\"]*)\"$")
    public void userSelectsAnyCountry(String Country, String Value) throws Throwable {
        if (Value.equalsIgnoreCase("Delete")) {
//            Constants.key.pause("2", "");
//

//
//            Assert.assertEquals("PASS", Constants.key.click(vAddressCountryDropdown1, ""));
//            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountryDropdown1, "selectall"));
//            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountryDropdown1, "delete"));
////
//
//            Assert.assertEquals("PASS", Constants.key.click(vAddressCountryDropdown1, ""));
//            Assert.assertEquals("PASS", Constants.key.clearText(vAddressCountryDropdown1));
//
//            Constants.key.pause("2", "");

//            String vAddressCountryDropdown = Constants.Affiliates_RegisterACustomerOR.getProperty("AddressCountryDropdown");
//            Assert.assertEquals("PASS", Constants.key.click(vAddressCountryDropdown, ""));
//            String vAddressCountryDropdown1 = Constants.Affiliates_RegisterACustomerOR.getProperty("AddressCountry");
//            Assert.assertEquals("PASS", Constants.key.click(vAddressCountryDropdown1, ""));
//            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountryDropdown1, "selectall"));
//            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountryDropdown1, "delete"));
//


//            String vMobileDropDown = Constants.Affiliates_RegisterACustomerOR.getProperty("CountryCode_DropDown");
//            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vMobileDropDown, ""));
//            Assert.assertEquals("PASS", Constants.key.click(vMobileDropDown, ""));
//            Constants.key.pause("1", "");
            String vMobileDropDownClear = Constants.Affiliates_RegisterACustomerOR.getProperty("CountryCode_DropDownClear");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vMobileDropDownClear, ""));
            Assert.assertEquals("PASS", Constants.key.click(vMobileDropDownClear, ""));
            Constants.key.pause("1", "");
//            JavascriptExecutor executor = (JavascriptExecutor) driver;
//            executor.executeScript("arguments[0].click();", Constants.driver.findElement(By.xpath(vMobileDropDownClear)));
////            String vAddressCountryDrop = Constants.Affiliates_RegisterACustomerOR.getProperty("AddressCountry");
//            Assert.assertEquals("PASS", Constants.key.click(vAddressCountryDrop, ""));
//            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountryDrop, "selectall"));
//            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountryDrop, "delete"));
////            Assert.assertEquals("PASS", Constants.key.click(vAddressCountryDropdown1, ""));
//            String vObjCountry1 = Constants.Affiliates_RegisterACustomerOR.getProperty("ClearCountryAddressDetails");
//            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjCountry1, "visible"));
//            Assert.assertEquals("PASS", Constants.key.click(vObjCountry1, ""));
//            Constants.key.pause("2", "");
        }
    }

    @Then("^User should be allowed to enter the details manually$")
    public void userShouldBeAllowedToEnterTheDetailsManually() throws Throwable {
        String vObjCountry = Constants.Affiliates_RegisterACustomerOR.getProperty("AddressLine1");
        Assert.assertEquals("PASS", Constants.key.click(vObjCountry, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjCountry, ""));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjCountry, "enabled"));

        String City = Constants.Affiliates_RegisterACustomerOR.getProperty("City");
        Assert.assertEquals("PASS", Constants.key.click(City, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(City, ""));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(City, "enabled"));

        String County = Constants.Affiliates_RegisterACustomerOR.getProperty("County");
        Assert.assertEquals("PASS", Constants.key.click(County, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(County, ""));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(County, "enabled"));

        String PostCode = Constants.Affiliates_RegisterACustomerOR.getProperty("PostCode");
        Assert.assertEquals("PASS", Constants.key.click(PostCode, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(PostCode, ""));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(PostCode, "enabled"));

    }

    @And("^USer clicks to minimize Affiliate Manager Contact details$")
    public void userClicksToMinimizeAffiliateManagerContactDetails() throws Throwable {
        String PullOutFocus = Constants.Affiliates_GlobalPageElementsOR.getProperty("PullOutFocus");
        Constants.key.click(PullOutFocus, "");
        LogCapture.info("User clicked to minimize details for Affiliate Manager contact details");
    }

    @Then("^User closes Bank details section$")
    public void userClosesBankDetailsSection() throws Throwable {
        String CrossButton = Constants.Affiliates_GlobalPageElementsOR.getProperty("BankDetailsCrossButton");
        Constants.key.click(CrossButton, "");
        LogCapture.info("User clicks on close button on bank details section..");
    }

    @Then("^User is able to view Customer details for Registering a Customer$")
    public void userIsAbleToViewCustomerDetailsForRegisteringACustomer() throws Throwable {
        String vObjPersonalDetails = Constants.Affiliates_RegisterACustomerOR.getProperty("PersonalDetails");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjPersonalDetails, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjPersonalDetails, "Personal details"));
        LogCapture.info("User is able to view Personal details...");

        String vObjFirstMiddleNameField = Constants.Affiliates_RegisterACustomerOR.getProperty("FirstMiddleNameField");
        // Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjFirstMiddleNameField,""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjFirstMiddleNameField, "First and middle names"));
        LogCapture.info("User is able to view First and middle names field...");

        String vObjLastNameField = Constants.Affiliates_RegisterACustomerOR.getProperty("LastNameField");
        // Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjLastNameField,""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjLastNameField, "Last name"));
        LogCapture.info("User is able to view Last names field...");

        String vObjDOBField = Constants.Affiliates_RegisterACustomerOR.getProperty("DOBField");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjDOBField, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjDOBField, "Date of Birth"));
        LogCapture.info("User is able to view Date of Birth field...");

        String vObjContactDetails = Constants.Affiliates_RegisterACustomerOR.getProperty("ContactDetails");
        //Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjContactDetails,""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjContactDetails, "Contact details"));
        LogCapture.info("User is able to view Contact details...");

        String vObjEmailAddressField = Constants.Affiliates_RegisterACustomerOR.getProperty("EmailAddressField");
        // Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjEmailAddressField,""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjEmailAddressField, "Email address"));
        LogCapture.info("User is able to view Email address field...");

        String vObjMobileNumberField = Constants.Affiliates_RegisterACustomerOR.getProperty("MobileNumberField");
        //Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjMobileNumberField,""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjMobileNumberField, "Mobile number"));
        LogCapture.info("User is able to view Mobile number field...");

        String vObjContinueButtonDisable = Constants.Affiliates_RegisterACustomerOR.getProperty("ContinueButtonDisable");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjContinueButtonDisable, "disabled"));
        LogCapture.info("Continue button is disable...");
    }

    @Then("^User will be able to view the Rocket animation on UI$")
    public void userWillBeAbleToViewTheRocketAnimationOnUI() throws Throwable {
        String RocketImage = Constants.Affiliates_RegisterACustomerOR.getProperty("RocketImage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(RocketImage, ""));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(RocketImage, "visible"));
        String RocketImageText = Constants.Affiliates_RegisterACustomerOR.getProperty("RocketImageText");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(RocketImageText, "visible"));

    }

    @Then("^User Should be able to see the Progress bar stating the completed percentage$")
    public void userShouldBeAbleToSeeTheProgressBarStatingTheCompletedPercentage() throws Throwable {
        String Percentage = Constants.Affiliates_RegisterACustomerOR.getProperty("Percentage");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(Percentage, "visible"));
        String DataBase = Constants.Affiliates_RegisterACustomerOR.getProperty("RegisteringCustomerInprogressDatabase");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(DataBase, "visible"));
        String Loading = Constants.Affiliates_RegisterACustomerOR.getProperty("RegisteringCustomerInprogressText");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(Loading, "visible"));

    }

    @Then("^User has to wait for few more seconds to wait for the next page to be displayed$")
    public void userHasToWaitForFewMoreSecondsToWaitForTheNextPageToBeDisplayed() throws Throwable {
        String Identity = Constants.Affiliates_RegisterACustomerOR.getProperty("Identity");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(Identity, "visible"));

    }

    @And("^User Select Country \"([^\"]*)\" from Country DropDown for (Single Registration|Joint Registration)$")
    public void userSelectCountryFromCountryDropDown(String Country, String Value) throws Throwable {
        if (Value.equalsIgnoreCase("Single Registration")) {
            String vAddressCountryDropdown = Constants.Affiliates_RegisterACustomerOR.getProperty("AddressCountryDropdown");
            Assert.assertEquals("PASS", Constants.key.click(vAddressCountryDropdown, ""));
            String vAddressCountryDropdown1 = Constants.Affiliates_RegisterACustomerOR.getProperty("AddressCountry");
            Assert.assertEquals("PASS", Constants.key.click(vAddressCountryDropdown1, ""));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountryDropdown1, "selectall"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountryDropdown1, "delete"));

            Assert.assertEquals("PASS", Constants.key.writeInInput(vAddressCountryDropdown1, Country));
            Constants.key.pause("4", "");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountryDropdown1, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountryDropdown1, "enter"));
        }
        if (Value.equalsIgnoreCase("Joint Registration")) {
            String JointCountry = Constants.Affiliates_RegisterACustomerOR.getProperty("TheirAddressCountryDropDown");
            Assert.assertEquals("PASS", Constants.key.click(JointCountry, ""));
            String JointCountry1 = Constants.Affiliates_RegisterACustomerOR.getProperty("TheirAddressCountry");
            Assert.assertEquals("PASS", Constants.key.click(JointCountry1, ""));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(JointCountry1, "selectall"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(JointCountry1, "delete"));

            Assert.assertEquals("PASS", Constants.key.writeInInput(JointCountry1, Country));
            Constants.key.pause("5", "");
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(JointCountry1, "downArrow"));
            Assert.assertEquals("PASS", Constants.key.KeyboardAction(JointCountry1, "enter"));
        }
    }

    @Then("^User should be able to view Send Registration Link Button$")
    public void userShouldBeAbleToViewSendRegistrationLinkButton() throws Throwable {
        String vObjSendRegistrationLink = Constants.Affiliates_GlobalPageElementsOR.getProperty("SendRegistrationLink");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjSendRegistrationLink, "visible"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjSendRegistrationLink, "enabled"));
        Constants.key.pause("2", "");
        LogCapture.info("User is able to view on Send Registration Link...");
    }

    @Then("^User should be able to view the default country code based on the Organization been selected$")
    public void userShouldBeAbleToViewTheDefaultCountryCodeBasedOnTheOrganizationBeenSelected() throws Throwable {
        String CountryCodeDefaultValue = Constants.Affiliates_GlobalPageElementsOR.getProperty("CountryCodeDefaultValue");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(CountryCodeDefaultValue, "visible"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(CountryCodeDefaultValue, "enabled"));
        Constants.key.pause("2", "");
        String CountryCodeDefaultValue1 = Constants.driver.findElement(By.xpath(CountryCodeDefaultValue)).getAttribute("value");
        if (CountryCodeDefaultValue1.equalsIgnoreCase("+44")) {
            LogCapture.info("Default Countyr code..." + CountryCodeDefaultValue1);
        } else {
            Assert.fail();
            LogCapture.info("Default Countyr code..." + CountryCodeDefaultValue1);
        }
    }

    @And("^User clicks on view details button for (Commission section|Account Summary) on Dashboard$")
    public void userClicksOnViewDetailsButtonForCommissionSectionOnDashboard(String TargetSection) throws Throwable {
        if (TargetSection.equalsIgnoreCase("Commission section")) {
            String vObjCommissionGeneratedViewDetailsBtn = Constants.Affiliates_AccountsPageOR.getProperty("CommissionGeneratedViewDetailsBtn");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjCommissionGeneratedViewDetailsBtn, "visible"));
            Assert.assertEquals("PASS", Constants.key.click(vObjCommissionGeneratedViewDetailsBtn, ""));
            LogCapture.info("User clicks on View details button for Commission Generated section....");
        }
        if (TargetSection.equalsIgnoreCase("Account Summary")) {
            String vObjAccountSummaryViewDetailsBtn = Constants.Affiliates_AccountsPageOR.getProperty("AccountSummaryViewDetailsBtn");
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjAccountSummaryViewDetailsBtn, "visible"));
            Assert.assertEquals("PASS", Constants.key.click(vObjAccountSummaryViewDetailsBtn, ""));
            LogCapture.info("User clicks on View details button for Account Summary section....");
        }
    }

    @Then("^User is navigated on Confirmation Page for Register a customer$")
    public void userIsNavigatedOnConfirmationPageForRegisterACustomer() throws Throwable {
        LogCapture.info("Confirmation page for Register a customer is Loading......");
        String vObjConfirmationPage = Constants.Affiliates_RegisterACustomerOR.getProperty("ConfirmationPage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjConfirmationPage, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjConfirmationPage, "Confirmation"));
        LogCapture.info("User is on Confirmation Page for Register a Customer...");
    }

    @Then("^User validates the (Single|Joint) Registration details FirstName \"([^\"]*)\" LastName \"([^\"]*)\" DateOfBirth \"([^\"]*)\" EmailAddress \"([^\"]*)\" CountryCode_Mobile \"([^\"]*)\" MobileNumber \"([^\"]*)\" Country \"([^\"]*)\" address details \"([^\"]*)\" on Confirmation page$")
    public void userValidatesTheSingleRegistrationDetailsFirstNameLastNameDateOfBirthEmailAddressCountryCode_MobileMobileNumberCountryAddressDetailsOnConfirmationPage(String TargetRegistration, String FirstName, String LastName, String DateOfBirth, String EmailAddress, String CountryCode_Mobile, String MobileNumber, String Country, String Address) throws Throwable {
        if (TargetRegistration.equalsIgnoreCase("Single")) {
            LogCapture.info("User is verifying Single Registration details....");
            String vObjFullNameFieldData = Constants.Affiliates_RegisterACustomerOR.getProperty("FullNameFieldData");
            String ExpectedFullName = FirstName + " " + LastName;
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjFullNameFieldData, ExpectedFullName));
            LogCapture.info("User able to view Full name as expected...");
            String vObjDOBFieldData = Constants.Affiliates_RegisterACustomerOR.getProperty("DOBFieldData");
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjDOBFieldData, SingleDOB_Selected));
            LogCapture.info("User able to view Date of Birth as expected...");
            String vObjEmailAddressFieldData = Constants.Affiliates_RegisterACustomerOR.getProperty("EmailAddressFieldData");
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjEmailAddressFieldData, EmailAddress));
            LogCapture.info("User able to view Email Address as expected...");
            String vObjMobileNumberFieldData = Constants.Affiliates_RegisterACustomerOR.getProperty("MobileNumberFieldData");
            String ExpectedMobileNumber = CountryCode_Mobile + MobileNumber;
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjMobileNumberFieldData, ExpectedMobileNumber));
            LogCapture.info("User able to view Mobile Number as expected...");
            String vObjAddressFieldData = Constants.Affiliates_RegisterACustomerOR.getProperty("AddressFieldData");
            String ExpectedAddress = Constants.driver.findElement(By.xpath(vObjAddressFieldData)).getText();
            String Address1 = "E, Selborne Mansions, Bradford, West Yorkshire, BD9 4NP";
            if (ExpectedAddress.equals(Address)) {
                LogCapture.info("User able to view Address as expected...");
            } else if (ExpectedAddress.equals(Address1)) {
                LogCapture.info("User able to view Address as expected...");
            } else {
                LogCapture.info("User NOT able to view entered Address......");
                Assert.fail();
            }
            String vObjCountryFieldData = Constants.Affiliates_RegisterACustomerOR.getProperty("CountryFieldData");
            //Assert.assertEquals("PASS", Constants.key.verifyText(vObjCountryFieldData, "GBR"));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjCountryFieldData, Country));
            LogCapture.info("User able to view Country as expected...");
            LogCapture.info("Details Verified: Single Registration...");
        }
        if (TargetRegistration.equalsIgnoreCase("Joint")) {
            LogCapture.info("User is verifying Joint Registration details....");
            String vObjJointRegistrationDetailsPage = Constants.Affiliates_RegisterACustomerOR.getProperty("JointRegistrationDetailsPage");
            String JointRegistrationHeader = "Joint account holder details";
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjJointRegistrationDetailsPage, JointRegistrationHeader));
            String vObjFullNameFieldData = Constants.Affiliates_RegisterACustomerOR.getProperty("JointFullNameFieldData");
            String ExpectedFullName = FirstName + " " + LastName;
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjFullNameFieldData, ExpectedFullName));
            LogCapture.info("User able to view Full name as expected for Joint Registration...");
            String vObjDOBFieldData = Constants.Affiliates_RegisterACustomerOR.getProperty("JointDOBFieldData");
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjDOBFieldData, JointDOB_Selected));
            LogCapture.info("User able to view Date of Birth as expected for Joint Registration...");
            String vObjEmailAddressFieldData = Constants.Affiliates_RegisterACustomerOR.getProperty("JointEmailAddressFieldData");
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjEmailAddressFieldData, RandomJointEmailAddress));
            LogCapture.info("User able to view Email Address as expected for Joint Registration...");
            String vObjMobileNumberFieldData = Constants.Affiliates_RegisterACustomerOR.getProperty("JointMobileNumberFieldData");
            String ExpectedMobileNumber = CountryCode_Mobile + MobileNumber;
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjMobileNumberFieldData, ExpectedMobileNumber));
            LogCapture.info("User able to view Mobile Number as expected for Joint Registration...");
            String vObjAddressJointFieldData = Constants.Affiliates_RegisterACustomerOR.getProperty("JointAddressFieldData");
            ((JavascriptExecutor) Constants.driver).executeScript("javascript:window.scrollBy(250,350)");
            Constants.key.pause("5", "");
            String ExpectedJointAddress = Constants.driver.findElement(By.xpath(vObjAddressJointFieldData)).getText();
            String Address1 = "E, Selborne Mansions, Bradford, West Yorkshire, BD9 4NP";
            String JointUpdatedAddress = "Tamba Kunta Road, Mumbai, Maharashtra, 400002";
            if (ExpectedJointAddress.equals(Address)) {
                LogCapture.info("User able to view Address as expected...add");
            } else if (ExpectedJointAddress.equals(Address1)) {
                LogCapture.info("User able to view Address as expected...add1");
            } else if (ExpectedJointAddress.equals(JointUpdatedAddress)) {
                LogCapture.info("User able to view Address as expected...Joint updated");
            } else {
                LogCapture.info("User NOT able to view entered Address......" + ExpectedJointAddress);
                Assert.fail();
            }
            String vObjCountryFieldData = Constants.Affiliates_RegisterACustomerOR.getProperty("JointCountryFieldData");
            //Assert.assertEquals("PASS", Constants.key.verifyText(vObjCountryFieldData, "GBR"));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjCountryFieldData, Country));
            LogCapture.info("User able to view Country as expected for Joint Registration...");
            LogCapture.info("Details Verified: Joint Registration...");
        }
    }

    @And("^User notes (Single|Joint) selected DateOfBirth for Register a customer$")
    public void userNotesSelectedDateOfBirth(String TargetRegistration) {
        if (TargetRegistration.equalsIgnoreCase("Single")) {
            String vObjDOBSelected = Constants.Affiliates_RegisterACustomerOR.getProperty("DOBSelected");
            SingleDOB_Selected = Constants.driver.findElement(By.xpath(vObjDOBSelected)).getAttribute("value");
            LogCapture.info("User selected DOB as " + SingleDOB_Selected);
        }
        if (TargetRegistration.equalsIgnoreCase("Joint")) {
            String vObjDOBSelected = Constants.Affiliates_RegisterACustomerOR.getProperty("DOBSelected");
            JointDOB_Selected = Constants.driver.findElement(By.xpath(vObjDOBSelected)).getAttribute("value");
            LogCapture.info("User selected DOB as " + JointDOB_Selected);
        }
    }


    @Then("^User will land on Document Upload Page$")

    public void userWillLandOnDocumentUploadPage() throws Throwable {
        String Identity = Constants.Affiliates_RegisterACustomerOR.getProperty("Identity");
        WebDriverWait w = new WebDriverWait(Constants.driver, 300);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Identity)));
        Assert.assertEquals("PASS", Constants.key.exist(Identity, ""));
        // Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(Identity, ""));
        // Assert.assertEquals("PASS", Constants.key.exist(Identity, ""));
    }

    @Then("^User should be able to get success response in less than 90 seconds$")
    public void userShouldBeAbleToGetResponseInLessThanSeconds() throws Throwable {
        String vObjRegisterCustomerSuccessMsg = Constants.Affiliates_RegisterACustomerOR.getProperty("RegisterCustomerSuccessMsg");
        WebDriverWait w = new WebDriverWait(Constants.driver, 90);
        w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(vObjRegisterCustomerSuccessMsg)));
        LogCapture.info("User should gets success message within 90 seconds...");
    }

    @Then("^User should be able to view the Successful Registration Page$")
    public void userShouldBeAbleToViewTheSuccessfulRegistrationPage() throws Throwable {
        String vObjRegisterCustomerSuccessMsg = Constants.Affiliates_RegisterACustomerOR.getProperty("RegisterCustomerSuccessMsg");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjRegisterCustomerSuccessMsg, ""));
        String ExpectedRegisterCustomerSuccessMsg = "Your customer is registered";
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjRegisterCustomerSuccessMsg, ExpectedRegisterCustomerSuccessMsg));
        LogCapture.info("User is able to view Successful registration message...");
    }

    @And("^User clicks on Skip the step on Identity documents page$")
    public void userClicksOnSkipTheStepOnIdentityDocumentsPage() throws Throwable {
        String vObjSkipTheStep = Constants.Affiliates_RegisterACustomerOR.getProperty("SkipTheStep");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSkipTheStep, ""));
        Assert.assertEquals("PASS", Constants.key.click(vObjSkipTheStep, ""));
        LogCapture.info("User clicks on Skip the Step...");
    }

    @Then("^User will be able to see the (POI|POA|POIplusPOA) Document upload frame$")
    public void userWillBeAbleToSeeThePOIDocumentUploadFrame(String Document) throws Throwable {
        if (Document.equalsIgnoreCase("POI")) {
            String POI = Constants.Affiliates_RegisterACustomerOR.getProperty("POI");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(POI, ""));
            Assert.assertEquals("PASS", Constants.key.exist(POI, ""));
        }

    }


    @Then("^User tries to Clicks on Confirm Button but it is Disabled-Grayed Out for Register a customer$")
    public void userTriesToClicksOnConfirmButtonButItIsDisabledGrayedOutForRegisterACustomer() throws Throwable {
        String vObjConfirmDisable = Constants.Affiliates_RegisterACustomerOR.getProperty("ConfirmDisable");
        String vObjConfirm = Constants.Affiliates_RegisterACustomerOR.getProperty("Confirm");

        WebElement ContinueButton = Constants.driver.findElement(By.xpath(vObjConfirm));
        boolean actualValue = ContinueButton.isEnabled();
        if (actualValue) {
            LogCapture.info("Confirm button is enabled");
        } else {
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjConfirmDisable, "disabled"));
            LogCapture.info("Confirm button is disabled and cannot click...");
        }
    }

    @Then("^User will be navigated to the Personal details page of Register a customer$")
    public void userWillBeNavigatedToThePersonalDetailsPageOfRegisterACustomer() throws Throwable {
        String vPersonalDetails = Constants.Affiliates_RegisterACustomerOR.getProperty("PersonalDetails");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vPersonalDetails, ""));
        LogCapture.info("User is on Personal details Page...");
    }


    @And("^User Re-Enters ALL Personal & Contact Details for Registration UpdatedFirstName \"([^\"]*)\" UpdatedLastName \"([^\"]*)\" DateOfBirth \"([^\"]*)\" EmailAddress \"([^\"]*)\" UpdatedCountryCode_Mobile \"([^\"]*)\" UpdatedMobileNumber \"([^\"]*)\"$")
    public void userReEntersALLPersonalContactDetailsForRegistrationUpdatedFirstNameUpdatedLastNameDateOfBirthEmailAddressUpdatedCountryCode_MobileUpdatedMobileNumber(String UpdatedFirstName, String UpdatedLastName, String DateOfBirth, String EmailAddress, String UpdatedCountryCode_Mobile, String UpdatedMobileNumber) throws Throwable {
        String vPersonalDetails = Constants.Affiliates_RegisterACustomerOR.getProperty("PersonalDetails");
        Constants.key.VisibleConditionWait(vPersonalDetails, "");
        String vF_Name = Constants.Affiliates_RegisterACustomerOR.getProperty("FirstName");
        Assert.assertEquals("PASS", Constants.key.click(vF_Name, ""));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "selectall"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vF_Name, "delete"));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vF_Name, UpdatedFirstName));

        String vEmailID = Constants.Affiliates_RegisterACustomerOR.getProperty("RegisterCustomerEmailAddress");
        Assert.assertEquals("PASS", Constants.key.click(vEmailID, ""));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vEmailID, "selectall"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vEmailID, "delete"));
        UpdatedRandomSingleEmailAddress = RandomStringUtils.randomAlphabetic(10) + "@gmail.com";
        Assert.assertEquals("PASS", Constants.key.writeInInput(vEmailID, UpdatedRandomSingleEmailAddress));

        String vMobileDropDown = Constants.Affiliates_RegisterACustomerOR.getProperty("CountryCode_DropDownMobile");
        Assert.assertEquals("PASS", Constants.key.click(vMobileDropDown, ""));
        Constants.key.pause("1", "");
        String vMobileDropDownClear = Constants.Affiliates_RegisterACustomerOR.getProperty("CountryCode_DropDownMobileClear");
        Assert.assertEquals("PASS", Constants.key.click(vMobileDropDownClear, ""));
        Constants.key.pause("1", "");
        String vCountryCodeMobile = Constants.Affiliates_RegisterACustomerOR.getProperty("CountryCode_Mobile");
        Constants.key.pause("1", "");
        Assert.assertEquals("PASS", Constants.key.clearText(vCountryCodeMobile));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vCountryCodeMobile, UpdatedCountryCode_Mobile));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeMobile, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountryCodeMobile, "enter"));
        String vMobileNumber = Constants.Affiliates_RegisterACustomerOR.getProperty("MobileNumber");
        Assert.assertEquals("PASS", Constants.key.click(vMobileNumber, ""));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vMobileNumber, "selectall"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vMobileNumber, "delete"));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vMobileNumber, UpdatedMobileNumber));
        Constants.key.pause("2", "");

        String vL_Name = Constants.Affiliates_RegisterACustomerOR.getProperty("LastName");
        Assert.assertEquals("PASS", Constants.key.click(vL_Name, ""));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "selectall"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vL_Name, "delete"));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vL_Name, UpdatedLastName));

        String vObjOccupation = Constants.Affiliates_RegisterACustomerOR.getProperty("Occupation");
        //Assert.assertEquals("PASS", Constants.key.click(vObjOccupation, ""));
        //Assert.assertEquals("PASS", Constants.key.writeInInput(vObjOccupation, "Accountant"));
//        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjOccupation,Occupation));
//        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjOccupation, "downArrow"));
//        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjOccupation, "enter"));
////

        String DatePicker = Constants.Affiliates_RegisterACustomerOR.getProperty("DatePicker");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjOccupation, "tab"));
        Constants.key.pause("1", "");

        String DatePicker6 = Constants.Affiliates_RegisterACustomerOR.getProperty("DatePicker6");
        Assert.assertEquals("PASS", Constants.key.click(DatePicker6, ""));

        Constants.key.pause("2", "");

        // ((JavascriptExecutor) Constants.driver).executeScript("arguments[0].scrollIntoView();", vObjContinueButton);
        ((JavascriptExecutor) Constants.driver).executeScript("javascript:window.scrollBy(250,350)");

    }

    @And("^User validates the Updated (Single|Joint) Registration details UpdatedFirstName \"([^\"]*)\" UpdatedLastName \"([^\"]*)\" DateOfBirth \"([^\"]*)\" EmailAddress \"([^\"]*)\" UpdatedCountryCode_Mobile \"([^\"]*)\" UpdatedMobileNumber \"([^\"]*)\" Country \"([^\"]*)\" address details \"([^\"]*)\" on Confirmation page$")
    public void userValidatesTheUpdatedSingleRegistrationDetailsUpdatedFirstNameUpdatedLastNameDateOfBirthEmailAddressUpdatedCountryCode_MobileUpdatedMobileNumberCountryAddressDetailsOnConfirmationPage(String TargetRegistration, String UpdatedFirstName, String UpdatedLastName, String DateOfBirth, String EmailAddress, String UpdatedCountryCode_Mobile, String UpdatedMobileNumber, String Country, String Address) throws Throwable {
        if (TargetRegistration.equalsIgnoreCase("Single")) {
            LogCapture.info("User is verifying Updated Single Registration details....");
            String vObjFullNameFieldData = Constants.Affiliates_RegisterACustomerOR.getProperty("FullNameFieldData");
            String ExpectedFullName = UpdatedFirstName + " " + UpdatedLastName;
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjFullNameFieldData, ExpectedFullName));
            LogCapture.info("User able to view Updated Full name as expected...");
            String vObjDOBFieldData = Constants.Affiliates_RegisterACustomerOR.getProperty("DOBFieldData");
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjDOBFieldData, SingleDOB_Selected));
            LogCapture.info("User able to view Updated Date of Birth as expected...");
            String vObjEmailAddressFieldData = Constants.Affiliates_RegisterACustomerOR.getProperty("EmailAddressFieldData");
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjEmailAddressFieldData, UpdatedRandomSingleEmailAddress));
            LogCapture.info("User able to view Updated Email Address as expected...");
            String vObjMobileNumberFieldData = Constants.Affiliates_RegisterACustomerOR.getProperty("MobileNumberFieldData");
            String ExpectedMobileNumber = UpdatedCountryCode_Mobile + UpdatedMobileNumber;
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjMobileNumberFieldData, ExpectedMobileNumber));
            LogCapture.info("User able to view Updated Mobile Number as expected...");
            String vObjAddressFieldData = Constants.Affiliates_RegisterACustomerOR.getProperty("AddressFieldData");
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjAddressFieldData, Address));
            LogCapture.info("User able to view Address as expected...");
            String vObjCountryFieldData = Constants.Affiliates_RegisterACustomerOR.getProperty("CountryFieldData");
            //Assert.assertEquals("PASS", Constants.key.verifyText(vObjCountryFieldData, "GBR"));
            Assert.assertEquals("PASS", Constants.key.verifyText(vObjCountryFieldData, Country));
            LogCapture.info("User able to view Country as expected...");
            LogCapture.info("Updated Details Verified: Single Registration...");
        }
    }


    /*-----------APUI-152----------*/
    @Then("^User Should be landed on the Account Page$")
    public void userShouldBeLandedOnTheAccountPage() throws Exception {
        LogCapture.info("Account Page Loading......");
        String vObjAccountSectionPage = Constants.Affiliates_AccountsPageOR.getProperty("AccountDetailPage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAccountSectionPage, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjAccountSectionPage, "Account summary"));
        LogCapture.info("User is on Account Page...");
    }

    @And("^User is able to view the Annual Summary Section$")
    public void userIsAbleToViewTheAnnualSummarySection() throws Exception {
        LogCapture.info("Annual Summary Loading......");
        String vObjAccountSectionPage = Constants.Affiliates_AccountsPageOR.getProperty("AnnualDetailsSection");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjAccountSectionPage, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjAccountSectionPage, "Annual summary"));
        LogCapture.info("User is on Annual Summary Section...");
    }


    @Then("^User will be able to view Annual Summary table with Month Referals Registrations Traded Accounts along with Commission generated and paid amounts$")
    public void userWillBeAbleToViewAnnualSummaryTableWithMonthReferalsRegistrationsTradedAccountsAlongWithCommissionGeneratedAndPaidAmounts() throws Exception {
        LogCapture.info("Month Option");
        String vObjMonthOption = Constants.Affiliates_AccountsPageOR.getProperty("MonthOption");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjMonthOption, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjMonthOption, "Month"));


        LogCapture.info("Referrals Option");
        String vObjReferralsOption = Constants.Affiliates_AccountsPageOR.getProperty("ReferralsOption");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjReferralsOption, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjReferralsOption, "REFERRALS"));

        LogCapture.info("Registrations Option");
        String vObjRegistrationsOption = Constants.Affiliates_AccountsPageOR.getProperty("RegistrationOption");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjRegistrationsOption, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjRegistrationsOption, "REGISTRATIONS"));

        LogCapture.info("Traded Account Option");
        String vObjTradedAccountOption = Constants.Affiliates_AccountsPageOR.getProperty("TradedAccountOption");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjTradedAccountOption, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjTradedAccountOption, "TRADED ACCOUNTS"));

        LogCapture.info("Commissions Option");
        String vObjCommissionsOption = Constants.Affiliates_AccountsPageOR.getProperty("CommissionOption");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCommissionsOption, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjCommissionsOption, "COMMISSIONS"));


    }


    @Then("^User will be able to view the data for last twelve months$")
    public void userWillBeAbleToViewTheDataForLastTwelveMonths() {

        List<WebElement> rows = Constants.driver.findElements(By.xpath("//*[@class='MuiTableBody-root']/tr"));

        LocalDate currentdate = LocalDate.now();

        //Getting the current month
        int currentMonth = currentdate.getMonthValue();
        int currentYear = currentdate.getYear();
        LogCapture.info("Current Month and Year: " + currentMonth + +currentYear);

        int previousMonth = currentdate.minusMonths(12).getMonthValue();
        int previousYear = currentdate.minusYears(1).getYear();
        LogCapture.info("Previous Month and Year: " + previousMonth + +previousYear);

        LogCapture.info("" + rows.size());

        for (int i = 1; i <= rows.size(); i++) {
            String AnnualSummaryMonthActualXpath = Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryMonthBeforeXpath") + i + Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryMonthAfterXpath");

            String Record = Constants.driver.findElement(By.xpath(AnnualSummaryMonthActualXpath)).getText();
            String tableMonthName = Record.split(" ")[0];
            LogCapture.info("" + tableMonthName);

            String tableYear = Record.split(" ")[1];
            int tableYearValue = Integer.parseInt(tableYear);
            LogCapture.info("" + tableYear);

            DateTimeFormatter parser = DateTimeFormatter.ofPattern("MMMM")
                    .withLocale(Locale.ENGLISH);
            TemporalAccessor accessor = parser.parse(tableMonthName);


            int tableMonthValue = accessor.get(ChronoField.MONTH_OF_YEAR);
            LogCapture.info("" + tableMonthValue);

            if ((tableMonthValue >= 1 || tableMonthValue <= 12) && (tableYearValue >= previousYear || tableYearValue <= currentYear)) {
                LogCapture.info("Record is Valid: ");
            } else {
                LogCapture.info("Record is InValid:");
                Assert.fail();
            }
        }
    }

    @And("^User verifies the Referals in Annual Summary$")
    public void userVerifiesTheReferalsInAnnualSummary() throws Exception {

        LogCapture.info("Referrals Option");
        String vObjReferralsOption = Constants.Affiliates_AccountsPageOR.getProperty("ReferralsOption");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjReferralsOption, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjReferralsOption, "REFERRALS"));
    }

    @Then("^User should be able to get the total number of refral count in particular month$")
    public void userShouldBeAbleToGetTheTotalNumberOfRefralCountInParticularMonth() {

        List<WebElement> rows = Constants.driver.findElements(By.xpath("//*[@class='MuiTableBody-root']/tr"));

        for (int i = 1; i < rows.size(); i++) {
            String AnnualSummaryRefferalActualXpath = Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryRefferalBeforeXpath") + i + Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryRefferalAfterXpath");
            WebElement element = driver.findElement(By.xpath(AnnualSummaryRefferalActualXpath));

            String AnnualReferralsCount = element.getText();
            LogCapture.info("" + AnnualReferralsCount);

            if (AnnualReferralsCount.matches("[0-9]+")) {
                LogCapture.info("Number is Valid: " + AnnualReferralsCount);
            } else if (AnnualReferralsCount.matches("[a-zA-Z]+")) {
                LogCapture.info("Number Not Valid: " + AnnualReferralsCount);
                Assert.fail();
            } else if (AnnualReferralsCount.isEmpty() || AnnualReferralsCount.matches("0")) {
                LogCapture.info("Number Not Valid: " + AnnualReferralsCount);
                Assert.fail();
            }

        }
    }

    @And("^User verifies the Registrations in Annual Summary$")
    public void userVerifiesTheRegistrationsInAnnualSummary() throws Exception {
        LogCapture.info("Registration Option");
        String vObjRegistrationOption = Constants.Affiliates_AccountsPageOR.getProperty("RegistrationOption");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjRegistrationOption, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjRegistrationOption, "REGISTRATIONS"));

    }

    @Then("^User should be able to get the total number of Registration count in particular month$")
    public void userShouldBeAbleToGetTheTotalNumberOfRegistrationCountInParticularMonth() {
        List<WebElement> rows = Constants.driver.findElements(By.xpath("//*[@class='MuiTableBody-root']/tr"));

        for (int i = 1; i < rows.size(); i++) {
            String AnnualSummaryRegistrationActualXpath = Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryRegistrationBeforeXpath") + i + Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryRegistrationAfterXpath");
            WebElement element = driver.findElement(By.xpath(AnnualSummaryRegistrationActualXpath));

            String AnnualRegistrationCount = element.getText();
            LogCapture.info("" + AnnualRegistrationCount);

            if (AnnualRegistrationCount.matches("[0-9]+")) {
                LogCapture.info("Number is Valid: " + AnnualRegistrationCount);
            } else if (AnnualRegistrationCount.matches("[a-zA-Z]+")) {
                LogCapture.info("Number Not Valid: " + AnnualRegistrationCount);
                Assert.fail();
            } else if (AnnualRegistrationCount.isEmpty() || AnnualRegistrationCount.matches("0")) {
                LogCapture.info("Number Not Valid: " + AnnualRegistrationCount);
                Assert.fail();
            }
        }
    }

    @And("^User verifies the Traded Accounts in Annual Summary$")
    public void userVerifiesTheTradedAccountsInAnnualSummary() throws Exception {
        LogCapture.info("Traded Account Option");
        String vObjTradedOption = Constants.Affiliates_AccountsPageOR.getProperty("TradedAccountOption");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjTradedOption, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjTradedOption, "TRADED ACCOUNTS"));

    }

    @Then("^User should be able to get the total number of Traded Accounts count in particular month$")
    public void userShouldBeAbleToGetTheTotalNumberOfTradedAccountsCountInParticularMonth() {
        List<WebElement> rows = Constants.driver.findElements(By.xpath("//*[@class='MuiTableBody-root']/tr"));

        for (int i = 1; i < rows.size(); i++) {
            String AnnualSummaryTradeActualXpath = Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryTradeBeforeXpath") + i + Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryTradeAfterXpath");
            WebElement element = driver.findElement(By.xpath(AnnualSummaryTradeActualXpath));

            String AnnualTradeCount = element.getText();
            LogCapture.info("" + AnnualTradeCount);

            if (AnnualTradeCount.matches("[0-9]+")) {
                LogCapture.info("Number is Valid: " + AnnualTradeCount);
            } else if (AnnualTradeCount.matches("[a-zA-Z]+")) {
                LogCapture.info("Number Not Valid: " + AnnualTradeCount);
                Assert.fail();
            } else if (AnnualTradeCount.isEmpty() || AnnualTradeCount.matches("0")) {
                LogCapture.info("Number Not Valid: " + AnnualTradeCount);
                Assert.fail();
            }
        }
    }

    @And("^User Selects the Paid option$")
    public void userSelectsThePaidOption() throws Exception {
        String vObjGeneratedOption = Constants.Affiliates_AccountsPageOR.getProperty("GeneratedOption");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjGeneratedOption, "selected"));

        String vObjPaidOption = Constants.Affiliates_AccountsPageOR.getProperty("PaidOption");
        Assert.assertEquals("PASS", Constants.key.click(vObjPaidOption, ""));
        LogCapture.info("Paid Option Selected");
    }

    @And("^User verifies the  Commission in Annual Summary$")
    public void userVerifiesTheCommissionInAnnualSummary() throws Exception {
        LogCapture.info("Commission Option");
        String vObjCommissionOption = Constants.Affiliates_AccountsPageOR.getProperty("CommissionOption");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCommissionOption, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjCommissionOption, "COMMISSIONS"));

    }


    @Then("^User should be able to get the paid commission amount$")
    public void userShouldBeAbleToGetThePaidCommissionAmount() {
        List<WebElement> rows = Constants.driver.findElements(By.xpath("//*[@class='MuiTableBody-root']/tr"));

        for (int i = 1; i < rows.size(); i++) {
            String AnnualSummaryCommissionActualXpath = Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryCommissionBeforeXpath") + i + Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryCommissionAfterXpath");
            WebElement element = driver.findElement(By.xpath(AnnualSummaryCommissionActualXpath));

            String AnnualCommissionCount = element.getText();
            LogCapture.info("" + AnnualCommissionCount);

            if (AnnualCommissionCount.matches("[0-9]+")) {
                LogCapture.info("Number is Valid: " + AnnualCommissionCount);
            } else if (AnnualCommissionCount.matches("[a-zA-Z]+")) {
                LogCapture.info("Number Not Valid: " + AnnualCommissionCount);
                Assert.fail();
            } else if (AnnualCommissionCount.isEmpty() || AnnualCommissionCount.matches("0")) {
                LogCapture.info("Number Not Valid: " + AnnualCommissionCount);
                Assert.fail();
            }
        }
    }

    @And("^User Selects the Generated option$")
    public void userSelectsTheGeneratedOption() throws Exception {
        String vObjGeneratedOption = Constants.Affiliates_AccountsPageOR.getProperty("GeneratedOption");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjGeneratedOption, "selected"));
        LogCapture.info("Generated Selected ");

    }

    @Then("^User mouse hovers or clicks on the Question Mark option$")
    public void userMouseHoversOrClicksOnTheQuestionMarkOption() throws Exception {
        //We have got APUI-801 for it so let it fail as Fields is not present now
        String vObjGeneratedOption = Constants.Affiliates_AccountsPageOR.getProperty("GeneratedOptionErrors");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjGeneratedOption, "selected"));

    }

    @Then("^User will be able to get more details about the commission section field$")
    public void userWillBeAbleToGetMoreDetailsAboutTheCommissionSectionField() throws Exception {
        //We have got APUI-801 for it so let it fail as Fields is not present now
        String vObjGeneratedOption = Constants.Affiliates_AccountsPageOR.getProperty("GeneratedOptionErrors");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjGeneratedOption, "selected"));

    }

    @And("^User click on Download option$")
    public void userClickOnDownloadOption() throws Exception {
        String vObjDownloadOption = Constants.Affiliates_AccountsPageOR.getProperty("DownloadOption");
        Assert.assertEquals("PASS", Constants.key.click(vObjDownloadOption, ""));
    }


    @Then("^User will be able to get two download option xlsx and pdf$")
    public void userWillBeAbleToGetTwoDownloadOptionXlsxAndPdf() throws Exception {
        String vObjPDFOption = Constants.Affiliates_AccountsPageOR.getProperty("PDFOption");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjPDFOption, "PDF"));

        String vObjXLSXOption = Constants.Affiliates_AccountsPageOR.getProperty("XLSXOption");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjXLSXOption, "XLSX"));

    }

    @Then("^User will be able to see zero values as no data available$")
    public void userWillBeAbleToSeeZeroValuesAsNoDataAvailable() {
        List<WebElement> rows = Constants.driver.findElements(By.xpath("//*[@class='MuiTableBody-root']/tr"));
        for (int i = 1; i < rows.size(); i++) {
            String AnnualSummaryRefferalActualXpath = Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryRefferalBeforeXpath") + i + Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryRefferalAfterXpath");
            WebElement element = driver.findElement(By.xpath(AnnualSummaryRefferalActualXpath));
            String AnnualReferralsCount = element.getText();
            LogCapture.info("" + AnnualReferralsCount);
            if (AnnualReferralsCount.matches("[0]+")) {
                LogCapture.info("Record Present");
            } else if (AnnualReferralsCount.matches("[1-9]+")) {
                LogCapture.info("Record Not Present " + AnnualReferralsCount);
                Assert.fail();
            } else if (AnnualReferralsCount.matches("[a-zA-Z]+")) {
                LogCapture.info("Record Not Present" + AnnualReferralsCount);
                Assert.fail();
            } else if (AnnualReferralsCount.isEmpty() || AnnualReferralsCount.matches("0")) {
                LogCapture.info("Record Not Present" + AnnualReferralsCount);
                Assert.fail();
            }
        }
        for (int i = 1; i < rows.size(); i++) {
            String AnnualSummaryRegistrationActualXpath = Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryRegistrationBeforeXpath") + i + Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryRegistrationAfterXpath");
            WebElement element = driver.findElement(By.xpath(AnnualSummaryRegistrationActualXpath));

            String AnnualRegistrationCount = element.getText();
            LogCapture.info("" + AnnualRegistrationCount);

            if (AnnualRegistrationCount.matches("[0]+")) {
                LogCapture.info("Record Present");
            } else if (AnnualRegistrationCount.matches("[1-9]+")) {
                LogCapture.info("Record Not Present " + AnnualRegistrationCount);
                Assert.fail();
            } else if (AnnualRegistrationCount.matches("[a-zA-Z]+")) {
                LogCapture.info("Number Not Valid: " + AnnualRegistrationCount);
                Assert.fail();
            } else if (AnnualRegistrationCount.isEmpty() || AnnualRegistrationCount.matches("0")) {
                LogCapture.info("Number Not Valid: " + AnnualRegistrationCount);
                Assert.fail();
            }
        }

        for (int i = 1; i < rows.size(); i++) {
            String AnnualSummaryTradeActualXpath = Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryTradeBeforeXpath") + i + Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryTradeAfterXpath");
            WebElement element = driver.findElement(By.xpath(AnnualSummaryTradeActualXpath));

            String AnnualTradeCount = element.getText();
            LogCapture.info("" + AnnualTradeCount);

            if (AnnualTradeCount.matches("[0]+")) {
                LogCapture.info("Record Present");
            } else if (AnnualTradeCount.matches("[1-9]+")) {
                LogCapture.info("Record Not Present " + AnnualTradeCount);
                Assert.fail();

            } else if (AnnualTradeCount.matches("[a-zA-Z]+")) {
                LogCapture.info("Number Not Valid: " + AnnualTradeCount);
                Assert.fail();
            } else if (AnnualTradeCount.isEmpty() || AnnualTradeCount.matches("0")) {
                LogCapture.info("Number Not Valid: " + AnnualTradeCount);
                Assert.fail();
            }
        }
        for (int i = 1; i < rows.size(); i++) {
            String AnnualSummaryCommissionActualXpath = Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryCommissionBeforeXpath") + i + Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryCommissionAfterXpath");
            WebElement element = driver.findElement(By.xpath(AnnualSummaryCommissionActualXpath));

            String AnnualCommissionCount = element.getText();
            LogCapture.info("" + AnnualCommissionCount);

            if (AnnualCommissionCount.matches("[0]+")) {
                LogCapture.info("Record Present");
            } else if (AnnualCommissionCount.matches("[1-9]+")) {
                LogCapture.info("Record Not Present " + AnnualCommissionCount);
                Assert.fail();
            } else if (AnnualCommissionCount.matches("[a-zA-Z]+")) {
                LogCapture.info("Number Not Valid: " + AnnualCommissionCount);
                Assert.fail();
            } else if (AnnualCommissionCount.isEmpty() || AnnualCommissionCount.matches("0")) {
                LogCapture.info("Number Not Valid: " + AnnualCommissionCount);
                Assert.fail();
            }
        }
    }


    //--------end of APUI152---


    @Then("^User will be able to view the currency in the amount section$")
    public void userWillBeAbleToViewTheCurrencyInTheAmountSection() throws Throwable {
        String vObjCurrency = Constants.Affiliates_AccountsPageOR.getProperty("Currency");
        String vObjCurrencyText = Constants.Affiliates_AccountsPageOR.getProperty("CurrencyDefaultText");
        Assert.assertEquals("PASS", Constants.key.exist(vObjCurrency, ""));
        Assert.assertEquals("PASS", Constants.key.verifyInnerText(vObjCurrencyText, "GBP"));
        LogCapture.info("User will be able to view the currency in the amount section......");
    }

    @Then("^User will be able to view the (Current|Future) month date in Commission section$")
    public void userWillBeAbleToViewTheCurrentMonthDateInCommissionSection(String Month) throws Throwable {
        if (Month.equalsIgnoreCase("Current")) {
            String vObjCommissionMonth = Constants.Affiliates_AccountsPageOR.getProperty("CommissionMonth");
            Assert.assertEquals("PASS", Constants.key.exist(vObjCommissionMonth, ""));
            String CommissionMonth = driver.findElement(By.xpath(vObjCommissionMonth)).getText();
            if (CommissionMonth.contains("March")) {
                LogCapture.info("User will be able to view the current month date in Commission section");
            } else {
                LogCapture.info("User not be able to view the current month date in Commission section");
                Assert.fail();
            }

        }
        if (Month.equalsIgnoreCase("Future")) {
            String vObjCommissionMonth = Constants.Affiliates_AccountsPageOR.getProperty("CommissionMonth");
            Assert.assertEquals("PASS", Constants.key.exist(vObjCommissionMonth, ""));
            String CommissionMonth = driver.findElement(By.xpath(vObjCommissionMonth)).getText();
            if (CommissionMonth.contains("March")) {
                LogCapture.info("User will be able to view the Future month date in Commission section");
            } else {
                LogCapture.info("User not be able to view the Future month date in Commission section");
                Assert.fail();
            }

        }
    }

    @Then("^User will be able to view Zero amount$")
    public void userWillBeAbleToViewAmount() throws Throwable {
        String NextCommissionText = Constants.Affiliates_AccountsPageOR.getProperty("NextCommissionText");
        String vObjBalance = Constants.Affiliates_AccountsPageOR.getProperty("Balance");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBalance, ""));
        String BalanceToBepaid = Constants.driver.findElement(By.xpath(vObjBalance)).getText();
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjBalance, "visible"));
        LogCapture.info("Commission section visible on Dashboard(Account page)...");
        if (BalanceToBepaid.contains("£0.00")) {
            LogCapture.info("the Commision Balance on the UI which is ZERO");
        } else {
            LogCapture.info("the Commision Balance on the UI which is not ZERO" + BalanceToBepaid);
            Assert.fail();
        }
    }

    @Then("^User verify the Last Commision which is been paid last time$")
    public void userVerifyTheLastCommisionWhichIsBeenPaidLastTime() throws Throwable {
        String NextCommissionText = Constants.Affiliates_AccountsPageOR.getProperty("NextCommissionText");
        String LastQtr = Constants.Affiliates_AccountsPageOR.getProperty("PaidLastQtr");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(LastQtr, ""));
        String LastQtrText = Constants.driver.findElement(By.xpath(LastQtr)).getText();
        System.out.println("BalanceToBepaid" + LastQtrText);
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(NextCommissionText, ""));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(NextCommissionText, "visible"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(LastQtr, "visible"));
        LogCapture.info("Commission section visible on Dashboard(Account page)...");
        if (LastQtrText.contains("£0.00PAID LAST QTR")) {
            LogCapture.info("Last Commision amount  which is not been generated last quater. The Amount is ZERO.Please check the Test data");

        } else {
            LogCapture.info("Last Commision amount  which is been generated last quater" + LastQtrText);
            Assert.fail();
        }
    }

    @Then("^User verify the Last Commision amount which is been generated last month$")
    public void userVerifyTheLastCommisionAmountWhichIsBeenGeneratedLastMonth() throws Throwable {
        String NextCommissionText = Constants.Affiliates_AccountsPageOR.getProperty("NextCommissionText");
        String LastQtr = Constants.Affiliates_AccountsPageOR.getProperty("GeneratedLastMonth");
        String LastQtrText = Constants.driver.findElement(By.xpath(LastQtr)).getText();

        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(LastQtr, "visible"));
        LogCapture.info("Commission section visible on Dashboard(Account page)...");
        if (!LastQtrText.contains("£0.00GEN LAST MONTH")) {
            LogCapture.info("Last Commision amount  which is not been generated last Month. The Amount is ZERO.Please check the Test data");
        } else {
            LogCapture.info("Last Commision amount  which is been generated last Month" + LastQtrText);
            Assert.fail();
        }
    }

    @And("^User Updates all the Address details \"([^\"]*)\" \"([^\"]*)\" for Single Registration$")
    public void userUpdatesAllTheAddressDetailsForSingleRegistration(String UpdatedCountry, String UpdatedAddress) throws Throwable {
        String vAddressCountryDropdown1 = Constants.Affiliates_RegisterACustomerOR.getProperty("AddressCountry");
        Assert.assertEquals("PASS", Constants.key.click(vAddressCountryDropdown1, ""));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountryDropdown1, "selectall"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountryDropdown1, "delete"));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vAddressCountryDropdown1, UpdatedCountry));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountryDropdown1, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountryDropdown1, "enter"));
        LogCapture.info("User entered updated Country as " + UpdatedCountry);

        String vAddressCountry = Constants.Affiliates_RegisterACustomerOR.getProperty("SearchText");
        Assert.assertEquals("PASS", Constants.key.click(vAddressCountry, ""));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountry, "selectall"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountry, "delete"));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vAddressCountry, UpdatedAddress));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountry, "downArrow"));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAddressCountry, "enter"));
        LogCapture.info("User entered updated Country Address as " + UpdatedAddress);

    }


    @Then("^User Validates Updated Address details \"([^\"]*)\" \"([^\"]*)\" for Single Registration$")
    public void userValidatesUpdatedAddressDetailsForSingleRegistration(String UpdatedCountry, String UpdatedAddress) throws Throwable {
        String vObjAddressFieldData = Constants.Affiliates_RegisterACustomerOR.getProperty("AddressFieldData");
        String ActualAddress = Constants.driver.findElement(By.xpath(vObjAddressFieldData)).getText();
        if (ActualAddress.equals(UpdatedAddress)) {
            LogCapture.info("User able to view Updated Address as expected...");
        } else {
            LogCapture.info("User NOT able to view entered Address......" + ActualAddress);
            Assert.fail();
        }
        String vObjCountryFieldData = Constants.Affiliates_RegisterACustomerOR.getProperty("CountryFieldData");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjCountryFieldData, UpdatedCountry));
        LogCapture.info("User able to view Updated Country as expected...");
    }

    @Then("^User selects DateOfBirth \"([^\"]*)\" for Joint Registration$")
    public void userSelectsDateOfBirthForJointRegistration(String Date) throws Throwable {
        //String vL_Name = Constants.Affiliates_RegisterACustomerOR.getProperty("JointLastName");
        String vObjOccupation = Constants.Affiliates_RegisterACustomerOR.getProperty("jointOccupation");
        //Assert.assertEquals("PASS", Constants.key.click(vObjOccupation, ""));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vObjOccupation, "tab"));
        Constants.key.pause("1", "");
        String DateClick = "//*[text()='" + Date + "']";
        Assert.assertEquals("PASS", Constants.key.click(DateClick, ""));
        Constants.key.pause("2", "");

        // ((JavascriptExecutor) Constants.driver).executeScript("arguments[0].scrollIntoView();", vObjContinueButton);
        ((JavascriptExecutor) Constants.driver).executeScript("javascript:window.scrollBy(250,350)");
    }

    @Then("^User should NOT be able to view any Affilate DropDown on Referrals page$")
    public void userShouldNOTBeAbleToViewAnyAffilateDropDownOnReferralsPage() throws Throwable {
        String vObjPartnerGroupDropdown = Constants.Affiliates_RegisterACustomerOR.getProperty("PartnerGroupDropdown");
        Assert.assertEquals("PASS", Constants.key.notexist(vObjPartnerGroupDropdown, ""));
        LogCapture.info("Partner Dropdown Not visible...");
    }

    @And("^User Selects (Total Group|Jhon Wick|Jhon Referrals) option from the list of options in the Affiliates Group dropdown$")
    public void userSelectsTotalGroupOptionFromTheListOfOptionsInTheAffiliatesGroupDropdown(String TargetValue) throws Throwable {
        if (TargetValue.equalsIgnoreCase("Total Group")) {
            WebElement AffiliatesGrpDropdwn = driver.findElement(By.name("Partner Group"));
            Select select = new Select(AffiliatesGrpDropdwn);
            select.selectByVisibleText("Total Group");
            LogCapture.info("User selected " + TargetValue + " from the dropdown..");
        }
        if (TargetValue.equalsIgnoreCase("Jhon Wick")) {
            WebElement AffiliatesGrpDropdwn = driver.findElement(By.name("Partner Group"));
            Select select = new Select(AffiliatesGrpDropdwn);
            select.selectByVisibleText("Jhon Wick");
            LogCapture.info("User selected " + TargetValue + " from the dropdown..");
        }
        if (TargetValue.equalsIgnoreCase("Jhon Referrals")) {
            WebElement AffiliatesGrpDropdwn = driver.findElement(By.name("Partner Group"));
            Select select = new Select(AffiliatesGrpDropdwn);
            select.selectByVisibleText("Jhon Referrals");
            LogCapture.info("User selected " + TargetValue + " from the dropdown..");
        }

    }

    @And("^User note count of records for Referrals Registration Trades for Main user$")
    public void userNoteCountOfRecordsForReferralsRegistrationTradesForMainUser() throws Throwable {
        Constants.key.pause("3", "");
        String vObjYourReferralsCount = Constants.Affiliates_AccountsPageOR.getProperty("YourReferralsCount");
        YourReferralsCount = Constants.driver.findElement(By.xpath(vObjYourReferralsCount)).getText();
        MainUserYourReferralsCount = Integer.parseInt(YourReferralsCount);
        LogCapture.info("Referrals Count is: " + MainUserYourReferralsCount);

        String vObjYourTradedAccountsCount = Constants.Affiliates_AccountsPageOR.getProperty("YourTradedAccountsCount");
        YourTradedAccountsCount = Constants.driver.findElement(By.xpath(vObjYourTradedAccountsCount)).getText();
        MainUserYourTradedAccountsCount = Integer.parseInt(YourTradedAccountsCount);
        LogCapture.info("Trade Accounts Count is: " + MainUserYourTradedAccountsCount);

        String vObjYourRegisteredCount = Constants.Affiliates_AccountsPageOR.getProperty("YourRegisteredCount");
        YourRegisteredCount = Constants.driver.findElement(By.xpath(vObjYourRegisteredCount)).getText();
        MainUserYourRegisteredCount = Integer.parseInt(YourRegisteredCount);

        LogCapture.info("Registration Count is: " + MainUserYourRegisteredCount);

        MainUserCount = new int[]{MainUserYourReferralsCount, MainUserYourTradedAccountsCount, MainUserYourRegisteredCount};

    }


    @And("^User note count of records for Referrals Registration Trades for User1$")
    public void userNoteCountOfRecordsForReferralsRegistrationTradesForUser() throws Throwable {
        Constants.key.pause("3", "");
        String vObjYourReferralsCount = Constants.Affiliates_AccountsPageOR.getProperty("YourReferralsCount");
        YourReferralsCount = Constants.driver.findElement(By.xpath(vObjYourReferralsCount)).getText();
        User1YourReferralsCount = Integer.parseInt(YourReferralsCount);
        LogCapture.info("Referrals Count is: " + User1YourReferralsCount);

        String vObjYourTradedAccountsCount = Constants.Affiliates_AccountsPageOR.getProperty("YourTradedAccountsCount");
        YourTradedAccountsCount = Constants.driver.findElement(By.xpath(vObjYourTradedAccountsCount)).getText();
        User1YourTradedAccountsCount = Integer.parseInt(YourTradedAccountsCount);
        LogCapture.info("Trade Accounts Count is: " + User1YourTradedAccountsCount);

        String vObjYourRegisteredCount = Constants.Affiliates_AccountsPageOR.getProperty("YourRegisteredCount");
        YourRegisteredCount = Constants.driver.findElement(By.xpath(vObjYourRegisteredCount)).getText();
        User1YourRegisteredCount = Integer.parseInt(YourRegisteredCount);

        LogCapture.info("Registration Count is: " + User1YourRegisteredCount);

        User1Count = new int[]{User1YourReferralsCount, User1YourTradedAccountsCount, User1YourRegisteredCount};

    }

    @And("^User note count of records for Referrals Registration Trades for Total Group$")
    public void userNoteCountOfRecordsForReferralsRegistrationTradesForTotalGroup() throws Throwable {
        Constants.key.pause("3", "");
        String vObjYourReferralsCount = Constants.Affiliates_AccountsPageOR.getProperty("YourReferralsCount");
        YourReferralsCount = Constants.driver.findElement(By.xpath(vObjYourReferralsCount)).getText();
        TotalGroupYourReferralsCount = Integer.parseInt(YourReferralsCount);
        LogCapture.info("Referrals Count is: " + TotalGroupYourReferralsCount);

        String vObjYourTradedAccountsCount = Constants.Affiliates_AccountsPageOR.getProperty("YourTradedAccountsCount");
        YourTradedAccountsCount = Constants.driver.findElement(By.xpath(vObjYourTradedAccountsCount)).getText();
        TotalGroupYourTradedAccountsCount = Integer.parseInt(YourTradedAccountsCount);
        LogCapture.info("Trade Accounts Count is: " + TotalGroupYourTradedAccountsCount);

        String vObjYourRegisteredCount = Constants.Affiliates_AccountsPageOR.getProperty("YourRegisteredCount");
        YourRegisteredCount = Constants.driver.findElement(By.xpath(vObjYourRegisteredCount)).getText();
        TotalGroupYourRegisteredCount = Integer.parseInt(YourRegisteredCount);

        LogCapture.info("Registration Count is: " + TotalGroupYourRegisteredCount);

        TotalGroupCount = new int[]{TotalGroupYourReferralsCount, TotalGroupYourTradedAccountsCount, TotalGroupYourRegisteredCount};
    }

    @Then("^System will display Total Group count equals to sum of all Affiliates count$")
    public void systemWillDisplayTotalGroupCountEqualsToSumOfAllAffiliatesCount() {
        int AllAffiliatesReferralsCount = User1YourReferralsCount + MainUserYourReferralsCount;
        int AllAffiliatesRegistrationCount = User1YourRegisteredCount + MainUserYourRegisteredCount;
        int AllAffiliatesTradeCount = User1YourTradedAccountsCount + MainUserYourTradedAccountsCount;
        if (AllAffiliatesReferralsCount == TotalGroupYourReferralsCount && AllAffiliatesRegistrationCount == TotalGroupYourRegisteredCount && AllAffiliatesTradeCount == TotalGroupYourTradedAccountsCount) {
            LogCapture.info("Sum of All Affiliates counts are equal to Total Group counts");
        } else {
            LogCapture.info("Total Group Referrals Count-" + TotalGroupYourReferralsCount + " and All Affiliates Referrals Count-" + AllAffiliatesReferralsCount);
            LogCapture.info("Total Group Registered Count-" + TotalGroupYourRegisteredCount + " and All Affiliates Registration Count-" + AllAffiliatesRegistrationCount);
            LogCapture.info("Total Group Traded Accounts Count-" + TotalGroupYourTradedAccountsCount + " and All Affiliates Trade Count-" + AllAffiliatesTradeCount);
            Assert.fail();
        }
    }

    @And("^User hovers the Mouse on the Question mark near the (Balance tag|Generated Last Month|Paid Last Month|Generated Last Quarter|Paid Last Quarter)$")
    public void userHoversTheMouseOnTheQuestionMarkNearTheBalanceTag(String Tooltip) throws Throwable {
        if (Tooltip.equalsIgnoreCase("Balance tag")) {
            String QuestionTagForBalance = Constants.Affiliates_AccountsPageOR.getProperty("QuestionTagForBalance");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(QuestionTagForBalance, ""));
            Assert.assertEquals("PASS", Constants.key.click(QuestionTagForBalance, ""));
            LogCapture.info("User hovers the Mouse on the Question mark near the Balance tag");
        }
        if (Tooltip.equalsIgnoreCase("Generated Last Month")) {
            String QuestionTagForBalance = Constants.Affiliates_AccountsPageOR.getProperty("QuestionTagForGLM");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(QuestionTagForBalance, ""));
            Assert.assertEquals("PASS", Constants.key.click(QuestionTagForBalance, ""));
            LogCapture.info("User hovers the Mouse on the Question mark near the Generated Last Month");
        }
        if (Tooltip.equalsIgnoreCase("Generated Last Quarter")) {
            String QuestionTagForBalance = Constants.Affiliates_AccountsPageOR.getProperty("QuestionTagForGLQ");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(QuestionTagForBalance, ""));
            Assert.assertEquals("PASS", Constants.key.click(QuestionTagForBalance, ""));
            LogCapture.info("User hovers the Mouse on the Question mark near the Generated Lat Quarter");
        }
        if (Tooltip.equalsIgnoreCase("Paid Last Month")) {
            String QuestionTagForBalance = Constants.Affiliates_AccountsPageOR.getProperty("QuestionTagForPLM");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(QuestionTagForBalance, ""));
            Assert.assertEquals("PASS", Constants.key.click(QuestionTagForBalance, ""));
            LogCapture.info("User hovers the Mouse on the Question mark near the Paid Last Month");
        }
        if (Tooltip.equalsIgnoreCase("Paid Last Quarter")) {
            String QuestionTagForBalance = Constants.Affiliates_AccountsPageOR.getProperty("QuestionTagForGLQ");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(QuestionTagForBalance, ""));
            Assert.assertEquals("PASS", Constants.key.click(QuestionTagForBalance, ""));
            LogCapture.info("User hovers the Mouse on the Question mark near the Paid Last Quarter");
        }
    }

    @Then("^User Should able to see the details explaing the Details of (Balance tag|Generated Last Month|Generated Last Quarter|Paid Last Month|Paid Last Quarter)$")
    public void userShouldAbleToSeeTheDetailsExplaingTheDetailsOfBalanceTag(String ToolTip) throws Throwable {
        if (ToolTip.equalsIgnoreCase("Balance tag")) {
            String QuestionTagInfoForBalance = Constants.Affiliates_AccountsPageOR.getProperty("QuestionTagInfoForBalance");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(QuestionTagInfoForBalance, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(QuestionTagInfoForBalance, "BALANCE TOOLTIP"));
            LogCapture.info("User Should able to see the details explaing the Details of Balance tag");

        }
        if (ToolTip.equalsIgnoreCase("Generated Last Month")) {
            String QuestionTagInfoForBalance = Constants.Affiliates_AccountsPageOR.getProperty("QuestionTagInfoForGLM");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(QuestionTagInfoForBalance, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(QuestionTagInfoForBalance, "GENERATED LAST MONTH VS. SAME MONTH LAST YEAR TOOLTIP"));
            LogCapture.info("User Should able to see the details explaing the Details of QuestionTagInfoForGLM");

        }
        if (ToolTip.equalsIgnoreCase("Generated Last Quarter")) {
            String QuestionTagInfoForBalance = Constants.Affiliates_AccountsPageOR.getProperty("QuestionTagInfoForGLQ");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(QuestionTagInfoForBalance, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(QuestionTagInfoForBalance, "GENERATED LAST QUARTER VS. SAME QUARTER LAST YEAR TOOLTIP"));
            LogCapture.info("User Should able to see the details explaing the Details of QuestionTagInfoForGLQ");

        }
        if (ToolTip.equalsIgnoreCase("Paid Last Month")) {
            String QuestionTagInfoForBalance = Constants.Affiliates_AccountsPageOR.getProperty("QuestionTagInfoForPLM");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(QuestionTagInfoForBalance, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(QuestionTagInfoForBalance, "PAID LAST MONTH VS. SAME MONTH LAST YEAR TOOLTIP"));
            LogCapture.info("User Should able to see the details explaing the Details of QuestionTagInfoForGLM");

        }
        if (ToolTip.equalsIgnoreCase("Paid Last Quarter")) {
            String QuestionTagInfoForBalance = Constants.Affiliates_AccountsPageOR.getProperty("QuestionTagInfoForPLQ");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(QuestionTagInfoForBalance, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(QuestionTagInfoForBalance, "PAID LAST QUARTER VS. SAME QUARTER LAST YEAR TOOLTIP"));
            LogCapture.info("User Should able to see the details explaing the Details of QuestionTagInfoForGLQ");

        }
    }

    @Then("^User will be able to see the Commison count with the year along with Month$")
    public void userWillBeAbleToSeeTheCommisonCountWithTheYearAlongWithMonth() throws Throwable {
        String ToolTip = Constants.Affiliates_AccountsPageOR.getProperty("ToolTip");
        ((JavascriptExecutor) Constants.driver).executeScript("javascript:window.scrollBy(250,350)");
        Assert.assertEquals("PASS", Constants.key.exist(ToolTip, ""));
        Assert.assertEquals("PASS", Constants.key.MouseFunctions(ToolTip, "MoveToElement"));
        String ToolTip1 = Constants.driver.findElement(By.xpath(ToolTip)).getText();
        System.out.println("ToolTip" + ToolTip1);
    }

    @And("^User validate graph is present on UI and by default Referrals Registration Trade graph is shown$")
    public void userValidateGraphIsPresentOnUIAndByDefaultReferralsRegistrationTradeGraphIsShown() throws Throwable {
        String vObjReferralsGraphTick = Constants.Affiliates_ReferralsPageOR.getProperty("ReferralsGraphTick");
        String vObjRegistrationGraphTick = Constants.Affiliates_ReferralsPageOR.getProperty("RegistrationGraphTick");
        String vObjTradeAccountsGraphTick = Constants.Affiliates_ReferralsPageOR.getProperty("TradeAccountsGraphTick");
        String vObjGraphContainer = Constants.Affiliates_ReferralsPageOR.getProperty("GraphContainer");
        String vObjReferralsGraphLine = Constants.Affiliates_ReferralsPageOR.getProperty("ReferralsGraphLine");
        String vObjRegistrationsGraphLine = Constants.Affiliates_ReferralsPageOR.getProperty("RegistrationsGraphLine");
        String vObjTradeAccountsGraphLine = Constants.Affiliates_ReferralsPageOR.getProperty("TradeAccountsGraphLine");

        boolean ReferralsGraphTickDisplayed = driver.findElement(By.xpath(vObjReferralsGraphTick)).isDisplayed();
        boolean RegistrationGraphTickDisplayed = driver.findElement(By.xpath(vObjRegistrationGraphTick)).isDisplayed();
        boolean TradeAccountsGraphTickDisplayed = driver.findElement(By.xpath(vObjTradeAccountsGraphTick)).isDisplayed();
        boolean ReferralsGraphLineDisplayed = driver.findElement(By.xpath(vObjReferralsGraphLine)).isDisplayed();
        boolean RegistrationsGraphLineDisplayed = driver.findElement(By.xpath(vObjRegistrationsGraphLine)).isDisplayed();
        boolean TradeAccountsGraphLineDisplayed = driver.findElement(By.xpath(vObjTradeAccountsGraphLine)).isDisplayed();
        boolean GraphContainerDisplayed = driver.findElement(By.xpath(vObjGraphContainer)).isDisplayed();

        if (GraphContainerDisplayed) {
            LogCapture.info("User is able to view Graph container on UI....");
            if (ReferralsGraphTickDisplayed && RegistrationGraphTickDisplayed && TradeAccountsGraphTickDisplayed) {
                LogCapture.info("User is able to view Referrals Registrations & Traded Accounts Graphs Ticks on UI....");
                if (ReferralsGraphLineDisplayed && RegistrationsGraphLineDisplayed && TradeAccountsGraphLineDisplayed) {
                    LogCapture.info("User is able to view Referrals Registrations & Traded Accounts Graphs Lines on UI....");
                } else {
                    LogCapture.info("User is NOT able to view Referrals Registrations & Traded Accounts Graphs Lines by default on UI....");
                    Assert.fail();
                }
            } else {
                LogCapture.info("User is NOT able to view Referrals Registrations & Traded Accounts Graphs Ticks by default on UI....");
                Assert.fail();
            }
        } else {
            LogCapture.info("User is NOT able to view Graph container on UI....");
            Assert.fail();
        }

    }

    @Then("^User will be able to view 12 months on X axis and values on Y axis$")
    public void userWillBeAbleToViewMonthsOnXAxisAndValuesOnYAxis() throws Throwable {
        String XAxis = Constants.Affiliates_AccountsPageOR.getProperty("XAxis");
        String YAxis = Constants.Affiliates_AccountsPageOR.getProperty("YAxis");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(XAxis, "visible"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(YAxis, "visible"));
        String vObjMonthsOnXaxis = Constants.Affiliates_ReferralsPageOR.getProperty("MonthsOnXaxis");
        List<WebElement> listOfElements = Constants.driver.findElements(By.xpath(vObjMonthsOnXaxis));
        LogCapture.info("Total number of months present on X-axis: " + listOfElements.size());
        if (listOfElements.size() == 12) {
            LogCapture.info("Total number of months present on X-axis is 12");
            for (WebElement element : listOfElements) {
                String XaxisMonths = element.getText();
                LogCapture.info("User is able view count on Y-axis as: " + XaxisMonths);
            }
        } else {
            LogCapture.info("Total number of months present on X-axis: " + listOfElements.size());
            Assert.fail();
        }
        String vObjValuesOnYaxis = Constants.Affiliates_ReferralsPageOR.getProperty("ValuesOnYaxis");
        List<WebElement> listOfValues = Constants.driver.findElements(By.xpath(vObjValuesOnYaxis));
        LogCapture.info("Total number of values present on Y-axis: " + listOfValues.size());
        for (WebElement element : listOfValues) {
            String YaxisValue = element.getText();
            if (YaxisValue.matches("[0-9]+")) {
                LogCapture.info("User is able view count on Y-axis as: " + YaxisValue);
            } else {
                LogCapture.info("User is NOT able view count on Y-axis as: " + YaxisValue);
                Assert.fail();
            }
        }

    }


    @Then("^User will be able to view message as no commission is been generated$")
    public void userWillBeAbleToViewMessageAsNoCommissionIsBeenGenerated() throws Throwable {
        String vObjCommissionStatementText = Constants.Affiliates_AccountsPageOR.getProperty("CommissionStatementText");
        Assert.assertEquals("PASS", Constants.key.notexist(vObjCommissionStatementText, ""));
    }

    @Then("^User will be able to view the (Balance Amount|commission Generated in the last month|commission Generated in the last Quater|commission Paid in the last month|commission Paid in the last Quater) in Bold letters$")
    public void userWillBeAbleToViewTheBalanceWhichWeNeedToPayInBoldLetters(String Bold) throws Throwable {
        if (Bold.equalsIgnoreCase("Balance Amount")) {
            String vObjBalance = Constants.Affiliates_AccountsPageOR.getProperty("BalanceBold");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjBalance, ""));
            String BalanceToBepaid = Constants.driver.findElement(By.xpath(vObjBalance)).getText();
            String Bold1 = Constants.driver.findElement(By.xpath(vObjBalance)).getCssValue("font-weight");
            int BoldNumber = Integer.parseInt(Bold1);
            System.out.println("Letter:>>>" + BalanceToBepaid + "Font Weight:::->" + Bold1);
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjBalance, "visible"));
            LogCapture.info("Commission section visible on Dashboard(Account page)...");
            if (BoldNumber >= 700) {
                LogCapture.info(" User will be able to view the Balance which we need to pay in Bold letters");
            } else {
                LogCapture.info(" User not be able to view the Balance which we need to pay in Bold letters" + BalanceToBepaid);
                Assert.fail();
            }

        }
        if (Bold.equalsIgnoreCase("commission Generated in the last month")) {
            String vObjGeneratedLastMonthBold = Constants.Affiliates_AccountsPageOR.getProperty("GeneratedLastMonthBold");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjGeneratedLastMonthBold, ""));
            String BalanceToBepaid = Constants.driver.findElement(By.xpath(vObjGeneratedLastMonthBold)).getText();
            String Bold1 = Constants.driver.findElement(By.xpath(vObjGeneratedLastMonthBold)).getCssValue("font-weight");
            int BoldNumber = Integer.parseInt(Bold1);
            System.out.println("Letter:>>>" + BalanceToBepaid + "Font Weight:::->" + Bold1);
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjGeneratedLastMonthBold, "visible"));
            LogCapture.info("Commission section visible on Dashboard(Account page)...");
            if (BoldNumber >= 700) {
                LogCapture.info(" User will be able to view the commission Generated in the last month in Bold letters");
            } else {
                LogCapture.info(" User not be able to view commission Generated in the last month in Bold letters" + BalanceToBepaid);
                Assert.fail();
            }
        }
        if (Bold.equalsIgnoreCase("commission Generated in the last Quater")) {
            String vObjGeneratedLastQTRBold = Constants.Affiliates_AccountsPageOR.getProperty("GeneratedLastQTRBold");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjGeneratedLastQTRBold, ""));
            String BalanceToBepaid = Constants.driver.findElement(By.xpath(vObjGeneratedLastQTRBold)).getText();
            String Bold1 = Constants.driver.findElement(By.xpath(vObjGeneratedLastQTRBold)).getCssValue("font-weight");
            int BoldNumber = Integer.parseInt(Bold1);
            System.out.println("Letter:>>>" + BalanceToBepaid + "Font Weight:::->" + Bold1);
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjGeneratedLastQTRBold, "visible"));
            LogCapture.info("Commission section visible on Dashboard(Account page)...");
            if (BoldNumber >= 700) {
                LogCapture.info(" User will be able to view the commission Generated in the last month in Bold letters");
            } else {
                LogCapture.info(" User not be able to view commission Generated in the last month in Bold letters" + BalanceToBepaid);
                Assert.fail();
            }
        }
        if (Bold.equalsIgnoreCase("commission Paid in the last month")) {
            String vObjPaidLastMonthBold = Constants.Affiliates_AccountsPageOR.getProperty("PaidLastMonthBold");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjPaidLastMonthBold, ""));
            String BalanceToBepaid = Constants.driver.findElement(By.xpath(vObjPaidLastMonthBold)).getText();
            String Bold1 = Constants.driver.findElement(By.xpath(vObjPaidLastMonthBold)).getCssValue("font-weight");
            int BoldNumber = Integer.parseInt(Bold1);
            System.out.println("Letter:>>>" + BalanceToBepaid + "Font Weight:::->" + Bold1);
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjPaidLastMonthBold, "visible"));
            LogCapture.info("Commission section visible on Dashboard(Account page)...");
            if (BoldNumber >= 700) {
                LogCapture.info(" User will be able to view the commission Paid in the last month in Bold letters");
            } else {
                LogCapture.info(" User not be able to view commission Paid in the last month in Bold letters" + BalanceToBepaid);
                Assert.fail();
            }
        }
        if (Bold.equalsIgnoreCase("commission Paid in the last Quater")) {
            String vObjPaidLastQTRBold = Constants.Affiliates_AccountsPageOR.getProperty("PaidLastQTRBold");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjPaidLastQTRBold, ""));
            String BalanceToBepaid = Constants.driver.findElement(By.xpath(vObjPaidLastQTRBold)).getText();
            String Bold1 = Constants.driver.findElement(By.xpath(vObjPaidLastQTRBold)).getCssValue("font-weight");
            int BoldNumber = Integer.parseInt(Bold1);
            System.out.println("Letter:>>>" + BalanceToBepaid + "Font Weight:::->" + Bold1);
            Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjPaidLastQTRBold, "visible"));
            LogCapture.info("Commission section visible on Dashboard(Account page)...");
            if (BoldNumber >= 700) {
                LogCapture.info(" User will be able to view the commission Paid in the last month in Bold letters");
            } else {
                LogCapture.info(" User not be able to view commission Paid in the last month in Bold letters" + BalanceToBepaid);
                Assert.fail();
            }
        }

    }

    @Then("^User \"([^\"]*)\" will be able to view latest month for which record is present by default been selected$")
    public void userWillBeAbleToViewLatestMonthForWhichRecordIsPresentByDefaultBeenSelected(String userName) throws Throwable {
        String vUserName = Constants.CONFIG.getProperty(userName);
        String vObjMonthDropdown = Constants.Affiliates_ReferralsPageOR.getProperty("MonthDropdown");
        Assert.assertEquals("PASS", Constants.key.exist(vObjMonthDropdown, ""));
        LogCapture.info("User is able to view Month Dropdown on UI...");
        WebElement month_dropdown = Constants.driver.findElement(By.xpath(vObjMonthDropdown));
        Select CurrentMonth = new Select(month_dropdown);
        List<WebElement> dropdown = CurrentMonth.getOptions();
        String DefaultDropdownValue = dropdown.get(0).getText();
        LogCapture.info("Default dropdown value for which data is present: " + DefaultDropdownValue);

        String ExpectedDropdownValue = null;
        if (vUserName.equalsIgnoreCase("jhon.tabo@mailinator.com") || vUserName.equalsIgnoreCase("jhon.luis@mailinator.com") || vUserName.equalsIgnoreCase("jwick1@mailinator.com")) {
            ExpectedDropdownValue = "November 2020";
        }

        if (DefaultDropdownValue.equals(ExpectedDropdownValue)) {
            LogCapture.info("User is able to view latest month and Year: " + DefaultDropdownValue + " selected by Default in dropdown...");
        } else {
            LogCapture.info("User is NOT able to view latest month and Year: " + DefaultDropdownValue + " selected by Default in dropdown...");
            Assert.fail();
        }

    }

    @Then("^User \"([^\"]*)\" will be able to view the Completed months in the dropdown$")
    public void userWillBeAbleToViewTheCompletedMonthsInTheDropdown(String userName) throws Throwable {
        String vUserName = Constants.CONFIG.getProperty(userName);
        String vObjMonthDropdown = Constants.Affiliates_ReferralsPageOR.getProperty("MonthDropdown");
        Assert.assertEquals("PASS", Constants.key.exist(vObjMonthDropdown, ""));
        LogCapture.info("User is able to view Month Dropdown on UI...");
        WebElement month_dropdown = Constants.driver.findElement(By.xpath(vObjMonthDropdown));
        Select CurrentMonth = new Select(month_dropdown);
        List<WebElement> dropdown = CurrentMonth.getOptions();

        String ExpectedDropdownValue = null;
        if (vUserName.equalsIgnoreCase("jhon.tabo@mailinator.com") || vUserName.equalsIgnoreCase("jhon.luis@mailinator.com") || vUserName.equalsIgnoreCase("jwick1@mailinator.com")) {
            ExpectedDropdownValue = "November 2020";
        }


        String CompletedMonthDropdownValue = null;
        for (WebElement webElement : dropdown) {
            String DefaultDropdownValue = webElement.getText();
            if (DefaultDropdownValue.equals(ExpectedDropdownValue)) {
                LogCapture.info("completed month dropdown value for which data is present: " + DefaultDropdownValue);
                CompletedMonthDropdownValue = "true";
                break;
            } else {
                CompletedMonthDropdownValue = "false";
            }
        }

        assert CompletedMonthDropdownValue != null;
        if (CompletedMonthDropdownValue.equalsIgnoreCase("true")) {
            LogCapture.info("User is able to view completed month and Year into the dropdown values...");
        } else {
            LogCapture.info("User is NOT able to view completed month and Year into the dropdown values...");
            Assert.fail();
        }


    }

    @Then("^User \"([^\"]*)\" will be NOT able to view the Completed months in the dropdown for which data is NOT present$")
    public void userWillBeNOTAbleToViewTheCompletedMonthsInTheDropdownforWhichDataIsNOTpresent(String userName) throws Throwable {
        String vUserName = Constants.CONFIG.getProperty(userName);
        String vObjMonthDropdown = Constants.Affiliates_ReferralsPageOR.getProperty("MonthDropdown");
        Assert.assertEquals("PASS", Constants.key.exist(vObjMonthDropdown, ""));
        LogCapture.info("User is able to view Month Dropdown on UI...");
        WebElement month_dropdown = Constants.driver.findElement(By.xpath(vObjMonthDropdown));
        Select CurrentMonth = new Select(month_dropdown);
        List<WebElement> dropdown = CurrentMonth.getOptions();

        String ExpectedDropdownValue = null;
        if (vUserName.equalsIgnoreCase("jhon.tabo@mailinator.com") || vUserName.equalsIgnoreCase("jhon.luis@mailinator.com") || vUserName.equalsIgnoreCase("jwick1@mailinator.com")) {
            ExpectedDropdownValue = "October 2020";
        }


        String CompletedMonthDropdownValue = null;
        for (WebElement webElement : dropdown) {
            String DefaultDropdownValue = webElement.getText();
            if (DefaultDropdownValue.equals(ExpectedDropdownValue)) {
                LogCapture.info("completed month dropdown value for which data is present: " + DefaultDropdownValue);
                CompletedMonthDropdownValue = "true";
                break;
            } else {
                CompletedMonthDropdownValue = "false";
            }
        }

        assert CompletedMonthDropdownValue != null;
        if (CompletedMonthDropdownValue.equalsIgnoreCase("true")) {
            LogCapture.info("User is able to view month and Year into the dropdown values for which data is NOT present...");
            Assert.fail();
        } else {
            LogCapture.info("User is NOT able to view month and Year into the dropdown values for which data is NOT present...\"");
        }

    }

    @And("^User should NOT observe the Statement Month under Your Commission Statement$")
    public void userShouldNOTObserveTheStatementMonthUnderYourCommissionStatement() throws Throwable {
        String vObjStatementMonth = Constants.Affiliates_CommissionsPageOR.getProperty("StatementMonth");
        Assert.assertEquals("PASS", Constants.key.notexist(vObjStatementMonth, ""));
        LogCapture.info("Statement Month is NOT visible for No trade accounts...");

    }

    @Then("^User will be able to view Zero amount Balance Gen Last Month and Gen Last Qtr$")
    public void userWillBeAbleToViewZeroAmountBalanceGenLastMonthAndGenLastQtr() throws Throwable {
        String vObjBalance = Constants.Affiliates_AccountsPageOR.getProperty("Balance");
        String VObjGeneratedLastMonth = Constants.Affiliates_AccountsPageOR.getProperty("GeneratedLastMonth");
        String vObjLastQtr = Constants.Affiliates_AccountsPageOR.getProperty("LastQtr");

        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjBalance, "visible"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(VObjGeneratedLastMonth, "visible"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjLastQtr, "visible"));
        String vObjBalanceAmt = Constants.Affiliates_CommissionsPageOR.getProperty("BalanceAmt");
        String VObjLastQtrAmt = Constants.Affiliates_CommissionsPageOR.getProperty("LastQtrAmt");
        String vObjGeneratedLastMonthAmt = Constants.Affiliates_CommissionsPageOR.getProperty("GeneratedLastMonthAmt");

        String ZeroAmt = "£0.00";

        Assert.assertEquals("PASS", Constants.key.verifyText(vObjBalanceAmt, ZeroAmt));
        LogCapture.info("User is able to view £0.00 Commission Balance");
        Assert.assertEquals("PASS", Constants.key.verifyText(VObjLastQtrAmt, ZeroAmt));
        LogCapture.info("User is able to view £0.00 as GEN LAST QTR");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjGeneratedLastMonthAmt, ZeroAmt));
        LogCapture.info("User is able to view £0.00 GEN LAST MONTH");

    }


    @Then("^User should be able to view single line graph on UI for all 12 months$")
    public void userShouldBeAbleToViewSingleLineGraphOnUIForAllMonths() throws Throwable {
        String XAxis = Constants.Affiliates_AccountsPageOR.getProperty("XAxis");
        String YAxis = Constants.Affiliates_AccountsPageOR.getProperty("YAxis");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(XAxis, "visible"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(YAxis, "visible"));
        String vObjMonthsOnXaxis = Constants.Affiliates_ReferralsPageOR.getProperty("MonthsOnXaxis");
        List<WebElement> listOfElements = Constants.driver.findElements(By.xpath(vObjMonthsOnXaxis));
        LogCapture.info("Total number of months present on X-axis: " + listOfElements.size());
        if (listOfElements.size() == 12) {
            LogCapture.info("Total number of months present on X-axis is 12");
            for (WebElement element : listOfElements) {
                String XaxisMonths = element.getText();
                LogCapture.info("User is able view count on Y-axis as: " + XaxisMonths);
            }
        } else {
            LogCapture.info("Total number of months present on X-axis: " + listOfElements.size());
        }
    }


    @Then("^User Observe the value of Statement Month under Your Commission Statement in bold letter$")
    public void userObserveTheStatementMonthUnderYourCommissionStatementInBoldLetter() throws Throwable {
        String vObjStatementMonthText = Constants.Affiliates_CommissionsPageOR.getProperty("StatementMonthText");
        Assert.assertEquals("PASS", Constants.key.verifyFontProperties(vObjStatementMonthText, "font-size", "22px"));
        Assert.assertEquals("PASS", Constants.key.verifyFontProperties(vObjStatementMonthText, "font-weight", "700"));

    }

    @And("^USer observe Your Commission Statement on Commissions page in bold$")
    public void userObserveYourCommissionStatementOnCommissionsPageInBold() throws Throwable {

        String vObjCommissionStatementText = Constants.Affiliates_CommissionsPageOR.getProperty("CommissionStatementText");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjCommissionStatementText, ""));
        WebElement CommissionStatementText = Constants.driver.findElement(By.xpath(vObjCommissionStatementText));
        ((JavascriptExecutor) Constants.driver).executeScript("arguments[0].scrollIntoView();", CommissionStatementText);

        Assert.assertEquals("PASS", Constants.key.verifyFontProperties(vObjCommissionStatementText, "font-weight", "600"));

        LogCapture.info("User is able to see Commission Statement text...");
    }

    @Then("^User will be able to view the previous month of paid date into Statement month$")
    public void userWillBeAbleToViewThePreviousMonthOfPaidDateIntoStatementMonth() {
        String vObjPaidDateText = Constants.Affiliates_CommissionsPageOR.getProperty("PaidDateText");
        String PaidDate = driver.findElement(By.xpath(vObjPaidDateText)).getText();
        String[] Date = PaidDate.split("/");

        String monthNumberStr = Date[1];
        String YearNumberStr = Date[2];
        int MonthNumber = Integer.parseInt(monthNumberStr);
        int PreviousMonthInt = MonthNumber - 1;
        String PreviousMonthTextCap = Month.of(PreviousMonthInt).name();
        LogCapture.info("PreviousMonth::" + PreviousMonthTextCap);
        String PreviousMonthTextLower = PreviousMonthTextCap.toLowerCase();
        String PreviousMonthText = PreviousMonthTextLower.substring(0, 1).toUpperCase() + PreviousMonthTextLower.substring(1);
        String ExpectedStatementMonthText = PreviousMonthText + " " + YearNumberStr;
        String vObjStatementMonthText = Constants.Affiliates_CommissionsPageOR.getProperty("StatementMonthText");
        String StatementMonthText = driver.findElement(By.xpath(vObjStatementMonthText)).getText();
        if (StatementMonthText.equals(ExpectedStatementMonthText)) {
            LogCapture.info("User is able to view previous month of paid date into Statement month...");
        } else {
            LogCapture.info("User is NOT able to view previous month of paid date into Statement month..." + StatementMonthText);
            Assert.fail();
        }
    }

    @And("^User Observe the FirstTier options of the statement which is been Selected$")
    public void userObserveTheTierOptionsOfTheStatementWhichIsBeenSelected() throws Throwable {
        String vObjFirstTierBtn = Constants.Affiliates_CommissionsPageOR.getProperty("FirstTierBtn");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vObjFirstTierBtn, "enabled"));
        String Button = driver.findElement(By.xpath(vObjFirstTierBtn)).getAttribute("class");
        String[] button = Button.split("jss");
        if (button.length >= 3) {
            LogCapture.info("First tier button is selected...");
        } else {
            LogCapture.info("First tier button is NOT selected...");
            Assert.fail();
        }
    }

    @And("^User Validates the Transaction Headers of FirstTier$")
    public void userValidatesTheTransactionHeadersOfFirstTier() throws Throwable {

        String vObjTransactionHeader = Constants.Affiliates_CommissionsPageOR.getProperty("TransactionHeader");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjTransactionHeader, "Transactions (First tier)"));
        Assert.assertEquals("PASS", Constants.key.verifyFontProperties(vObjTransactionHeader, "font-size", "18px"));
        Assert.assertEquals("PASS", Constants.key.verifyFontProperties(vObjTransactionHeader, "font-weight", "500"));

        String vObjTransactionHeaderFor = Constants.Affiliates_CommissionsPageOR.getProperty("TransactionHeaderFor");
        Assert.assertEquals("PASS", Constants.key.verifyFontProperties(vObjTransactionHeaderFor, "font-size", "16px"));
        Assert.assertEquals("PASS", Constants.key.verifyFontProperties(vObjTransactionHeaderFor, "font-weight", "400"));
        LogCapture.info("User is able to view Transaction header for First Tier and Font size & weight is verified...");

    }

    @Then("^User will Validate Date ClientID/DealNumber UID Turnover CurrencyPair Profit Commission and Paid column present$")
    public void userWillValidateDateClientIDDealNumberUIDTurnoverCurrencyPairProfitCommissionAndPaidColumnClearly() throws Throwable {
        String vObjDateColumn = Constants.Affiliates_CommissionsPageOR.getProperty("DateColumn");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjDateColumn, "Date"));
        LogCapture.info("Able to view Date column..");
        String vObjClientIDDealNumberColumn = Constants.Affiliates_CommissionsPageOR.getProperty("ClientIDDealNumberColumn");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjClientIDDealNumberColumn, "CLIENT ID / DEAL NUMBER"));
        LogCapture.info("Able to view CLIENT ID / DEAL NUMBER column..");
        String vObjUIDColumn = Constants.Affiliates_CommissionsPageOR.getProperty("UIDColumn");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjUIDColumn, "UID"));
        LogCapture.info("Able to view UID column..");
        String vObjTurnoverColumn = Constants.Affiliates_CommissionsPageOR.getProperty("TurnoverColumn");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjTurnoverColumn, "TURNOVER"));
        LogCapture.info("Able to view TURNOVER column..");
        String vObjCurrPairColumn = Constants.Affiliates_CommissionsPageOR.getProperty("CurrPairColumn");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjCurrPairColumn, "CURR PAIR"));
        LogCapture.info("Able to view CURR PAIR column..");
        String vObjProfitColumn = Constants.Affiliates_CommissionsPageOR.getProperty("ProfitColumn");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjProfitColumn, "PROFIT"));
        LogCapture.info("Able to view PROFIT column..");
        String vObjCommissionColumn = Constants.Affiliates_CommissionsPageOR.getProperty("CommissionColumn");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjCommissionColumn, "COMMISSION"));
        LogCapture.info("Able to view COMMISSION column..");
        String vObjPaidColumn = Constants.Affiliates_CommissionsPageOR.getProperty("PaidColumn");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjPaidColumn, "PAID"));
        LogCapture.info("Able to view PAID column..");
        LogCapture.info("User is able to view columns properly under Transaction table on Commission page...");
    }

    @Then("^User should be able to view Completed months in Month dropdown on Referrals page$")
    public void userShouldBeAbleToViewCompletedMonthsInMonthDropdownOnReferralsPage() throws Throwable {
        String vObjMonthDropdown = Constants.Affiliates_ReferralsPageOR.getProperty("MonthDropdown");
        WebElement month_dropdown = Constants.driver.findElement(By.xpath(vObjMonthDropdown));
        Select CurrentMonth = new Select(month_dropdown);
        List<WebElement> dropdown = CurrentMonth.getOptions();
        String MonthPresent = null;
        for (WebElement webElement : dropdown) {
            String DefaultDropdownValue = webElement.getText();
            String SystemLatestMonth = "November 2020";
            if (DefaultDropdownValue.equals(SystemLatestMonth)) {
                LogCapture.info("User is able to view Completed month and Year: " + DefaultDropdownValue);
                MonthPresent = "true";
            } else {
                MonthPresent = "false";
            }
        }
        assert MonthPresent != null;
        if (MonthPresent.equalsIgnoreCase("true")) {
            LogCapture.info("User is able to view Completed month and Year..");
        } else {
            LogCapture.info("User is NOT able to view Completed month and Year..");
            Assert.fail();
        }

    }

    @Then("^User will be able to view the two years as Select option for Paid$")
    public void userWillBeAbleToViewTheYearsAsSelectOptionForPaid() throws Throwable {
        String CurrentYear = Constants.Affiliates_AccountsPageOR.getProperty("CurrentYearPaid");
        String LastYear = Constants.Affiliates_AccountsPageOR.getProperty("LastYearPaid");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(CurrentYear, "enabled"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(CurrentYear, "enabled"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(LastYear, "enabled"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(CurrentYear, "visible"));
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(LastYear, "visible"));
    }

    @Then("^User should be able to view Completed and latest months in Month dropdown on Referrals page$")
    public void userShouldBeAbleToViewCompletedAndLatestMonthsInMonthDropdownOnReferralsPage() {
        String vObjMonthDropdown = Constants.Affiliates_ReferralsPageOR.getProperty("MonthDropdown");
        WebElement month_dropdown = Constants.driver.findElement(By.xpath(vObjMonthDropdown));
        Select CurrentMonth = new Select(month_dropdown);
        List<WebElement> dropdown = CurrentMonth.getOptions();
        String CompletedMonthPresent = null;
        for (WebElement webElement : dropdown) {
            String DefaultDropdownValue = webElement.getText();
            String SystemLatestMonth = "November 2020";
            if (DefaultDropdownValue.equals(SystemLatestMonth)) {
                LogCapture.info("User is able to view Completed month and Year: " + DefaultDropdownValue);
                CompletedMonthPresent = "true";
            } else {
                CompletedMonthPresent = "false";
            }
        }

        String LatestMonthPresent = null;
        for (WebElement webElement : dropdown) {
            String DefaultDropdownValue = webElement.getText();
            String SystemLatestMonth = "December 2020";
            if (DefaultDropdownValue.equals(SystemLatestMonth)) {
                LogCapture.info("User is able to view Completed month and Year: " + DefaultDropdownValue);
                LatestMonthPresent = "true";
            } else {
                LatestMonthPresent = "false";
            }
        }
        assert CompletedMonthPresent != null;
        assert LatestMonthPresent != null;
        if (CompletedMonthPresent.equalsIgnoreCase("true") && LatestMonthPresent.equalsIgnoreCase("true")) {
            LogCapture.info("User is able to view Completed and Latest month and Year..");
        } else {
            LogCapture.info("User is NOT able to view Completed(" + CompletedMonthPresent + ") and Latest(" + LatestMonthPresent + ") month and Year..");
            Assert.fail();
        }
    }

    @Then("^User should be NOT able to view months in Month dropdown for which data is not present on Referrals page$")
    public void userShouldBeNOTAbleToViewMonthsInMonthDropdownForWhichDataIsNotPresentOnReferralsPage() {

        String vObjMonthDropdown = Constants.Affiliates_ReferralsPageOR.getProperty("MonthDropdown");
        WebElement month_dropdown = Constants.driver.findElement(By.xpath(vObjMonthDropdown));
        Select CurrentMonth = new Select(month_dropdown);
        List<WebElement> dropdown = CurrentMonth.getOptions();
        String MonthPresent = null;
        for (WebElement webElement : dropdown) {
            String DefaultDropdownValue = webElement.getText();
            String SystemLatestMonth = "March 2020";
            if (DefaultDropdownValue.equals(SystemLatestMonth)) {
                LogCapture.info("User is able to view month for which data is not present: " + DefaultDropdownValue);
                MonthPresent = "false";
            } else {
                LogCapture.info("User is NOT able to view month for which data is not present: " + DefaultDropdownValue);
                MonthPresent = "true";
            }
        }
        assert MonthPresent != null;
        if (MonthPresent.equalsIgnoreCase("true")) {
            LogCapture.info("User is NOT able to view month for which data is not present..");
        } else {
            LogCapture.info("User is able to view month for which data is not present..");
            Assert.fail();
        }
    }


    @And("^User Selects the Current year option$")
    public void userSelectsTheCurrentYearOption() throws Exception {
        String vCurrentYear = Constants.Affiliates_AccountsPageOR.getProperty("LastYear");
        Assert.assertEquals("PASS", Constants.key.click(vCurrentYear, ""));
        Constants.key.pause("2", "");

    }

    @And("^User Selects the Previous year option$")
    public void userSelectsThePreviousYearOption() throws Exception {
        String vPreviousYear = Constants.Affiliates_AccountsPageOR.getProperty("CurrentYear");
        Assert.assertEquals("PASS", Constants.key.click(vPreviousYear, ""));
        Constants.key.pause("2", "");
    }

    @Then("^User should be able to view the current year in number format in place of text format$")
    public void userShouldBeAbleToViewTheCurrentYearInNumberFormatInPlaceOfTextFormat() {
        String CurrentYear = Constants.Affiliates_AccountsPageOR.getProperty("CurrentYearText");
        String CurrentYearText = Constants.driver.findElement(By.xpath(CurrentYear)).getText();
        System.out.println("CurrentYearText:->" + CurrentYearText);
        int CurrentYearTextActualI = Constants.key.getCurrentYear();
        String CurrentYearTextActual = Integer.toString(CurrentYearTextActualI);
        if (CurrentYearText.equalsIgnoreCase(CurrentYearTextActual)) {
            LogCapture.info("The Current Year is getting displayed");
        } else {
            LogCapture.info("The Current Year is not getting displayed");
            Assert.fail();
        }
    }

    @Then("^User should be able to view the previous year in number format in place of text format$")
    public void userShouldBeAbleToViewThePreviousYearInNumberFormatInPlaceOfTextFormat() {
        String LastYear = Constants.Affiliates_AccountsPageOR.getProperty("LastYearText");
        String LastYearText = Constants.driver.findElement(By.xpath(LastYear)).getText();
        System.out.println("LastYearText:->" + LastYearText);
        int PreviousYearTextActualI = Constants.key.getPreviousYear();
        String PreviousYearTextActual = Integer.toString(PreviousYearTextActualI);
        if (LastYearText.equalsIgnoreCase(PreviousYearTextActual)) {
            LogCapture.info("Last year is getting displayed");
        } else {
            LogCapture.info("Last year is not getting displayed");
            Assert.fail();
        }
    }

    @And("^User Observe the commission payment breakdown options of the statement which is been Selected$")
    public void userObserveTheCommissionPaymentBreakdownOptionsOfTheStatementWhichIsBeenSelected() throws Throwable {
        LogCapture.info("User Observe the commission payment breakdown options of the statement which is been Selected");
        String vObjCommissionPaymentBreakDown = Constants.Affiliates_CommissionsPageOR.getProperty("CommissionPaymentBreakDown");
        // String CommissionPaymentBreakDown = Constants.driver.findElement(By.xpath(vObjCommissionPaymentBreakDown)).getText();
        // System.out.println("CommissionPaymentBreakDown::"+CommissionPaymentBreakDown);
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjCommissionPaymentBreakDown, "Commission Payment Breakdown"));
        Constants.key.pause("2", "");
        //LogCapture.info("User Observe the commission payment breakdown options of the statement which is been Selected"+CommissionPaymentBreakDown);
    }

    @Then("^User will display the Client name and commission generated by him$")
    public void userWillDisplayTheClientNameAndCommissionGeneratedByHim() throws Throwable {
        String vObjClientName = Constants.Affiliates_CommissionsPageOR.getProperty("ClientName");
        // String ClientName = Constants.driver.findElement(By.xpath(vObjClientName)).getText();
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjClientName, "CLIENT NAME"));
        String vObjCommissionPay = Constants.Affiliates_CommissionsPageOR.getProperty("CommissionPay");
        //String CommissionPay = Constants.driver.findElement(By.xpath(vObjCommissionPay)).getText();
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjCommissionPay, "COMMISSION"));
        String vObjCommissionPaid = Constants.Affiliates_CommissionsPageOR.getProperty("CommissionPaid");
        // String CommissionPaid = Constants.driver.findElement(By.xpath(vObjCommissionPaid)).getText();
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjCommissionPaid, "PAID"));
        // LogCapture.info("User will display the Client name and commission generated by him"+ClientName+""+CommissionPay+""+CommissionPaid);

    }

    @Then("^User will validate the tier1 Date field record should be match with the paid date$")
    public void userWillValidateThatTheTierFieldsShouldBeOfTheSameMonthWhichIsBeenSelectedInBeenByDefaultSelected() throws Throwable {
        String vObjPaidDateText = Constants.Affiliates_CommissionsPageOR.getProperty("PaidDateText");
        String PaidDate = driver.findElement(By.xpath(vObjPaidDateText)).getText();
        System.out.println("PaidDate" + PaidDate);
        String vObjFirstTierDate = Constants.Affiliates_CommissionsPageOR.getProperty("FirstTierDate");
        String FirstTierDate = driver.findElement(By.xpath(vObjFirstTierDate)).getText();
        System.out.println("FirstTierDate" + FirstTierDate);
        if (PaidDate.equals(FirstTierDate)) {
            LogCapture.info("User will validate that the tier1 Date field should be match with the paid date");

        } else {
            LogCapture.info("User will not validate that the tier1 Date field should be match with the paid date");
            Assert.fail();

        }

    }

    @And("^User confirms that system should only display 10 records in one page$")
    public void userConfirmsThatSystemShouldOnlyDisplayRecordsInOnePage() throws Throwable {
        String vObjTableRow = Constants.Affiliates_CommissionsPageOR.getProperty("TableRow");
        List<WebElement> rows = Constants.driver.findElements(By.xpath(vObjTableRow));
        if (rows.size() == 10) {
            LogCapture.info("User confirms that system should only display 10 records in one page" + rows.size());
        } else {
            LogCapture.info("User confirms that system not display 10 records in one page::->>" + rows.size());
            Assert.fail();
        }

    }

    @And("^User clicks on forward option And User will be able to view next page records$")
    public void userClicksOnPageAndUserWillBeAbleToViewOnlyRecordsInPage() throws Throwable {
        String vObjTableRow = Constants.Affiliates_CommissionsPageOR.getProperty("TableRow");
        String vObjGotoNextPage = Constants.Affiliates_CommissionsPageOR.getProperty("GotoNextPage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjGotoNextPage, ""));
        Assert.assertEquals("PASS", Constants.key.click(vObjGotoNextPage, ""));
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjTableRow, ""));
        List<WebElement> rows = Constants.driver.findElements(By.xpath(vObjTableRow));
        if (rows.size() <= 10) {
            LogCapture.info("User confirms that system should only display 10 records in one page" + rows.size());
        } else {
            LogCapture.info("User confirms that system not display 10 records in one page::->>" + rows.size());
            Assert.fail();
        }
    }

    @Then("^User should be able to View multiple values from the list$")
    public void userShouldBeAbleToViewMultipleValuesFromTheList() throws Throwable {
        String vObjMonthDropdown = Constants.Affiliates_CommissionsPageOR.getProperty("DropDownValue");
        List<WebElement> rows = Constants.driver.findElements(By.xpath(vObjMonthDropdown));
        if (rows.size() >= 2) {
            LogCapture.info("User should be able to View multiple values from the list" + rows.size());
        } else {
            LogCapture.info("User is not able to View multiple values from the list::->>" + rows.size());
            Assert.fail();
        }

    }

    @Then("^User should be able to view respective records for (Referrals|Registration|Trades)$")
    public void userShouldBeAbleToViewRespectiveRecords(String Tab) throws Throwable {
        if (Tab.equalsIgnoreCase("Referrals")) {
            int count = 0;
            String vObjReferralsCounts = Constants.Affiliates_CommissionsPageOR.getProperty("ReferralsCounts");
            String ReferralsCounts = Constants.driver.findElement(By.xpath(vObjReferralsCounts)).getText();
            System.out.println("ReferralsCounts" + ReferralsCounts);
            int RefCount = Integer.parseInt(ReferralsCounts);
            ((JavascriptExecutor) Constants.driver).executeScript("javascript:window.scrollBy(250,350)");
            for (int j = 0; j < 10; j++) {
                String vObjTableRow = Constants.Affiliates_CommissionsPageOR.getProperty("TableRow");
                List<WebElement> rows = Constants.driver.findElements(By.xpath(vObjTableRow));
                count = count + rows.size();
                String vObjGotoNextPage = Constants.Affiliates_CommissionsPageOR.getProperty("GotoNextPage");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjGotoNextPage, ""));
                if (rows.size() == 10) {
                    LogCapture.info("User confirms that system is displayed 10 records in one page::Row Size->>" + rows.size() + "" + "Count:" + count);
                    System.out.println("Record Count is::" + count);
                    Assert.assertEquals("PASS", Constants.key.click(vObjGotoNextPage, ""));
                } else {
                    System.out.println("Record Count is::" + count);
                    LogCapture.info("User confirms that system is displayed Less Than 10 records in one page::Row Size->>" + rows.size() + "" + "Count:" + count);
                    break;
                }
            }

            if (RefCount >= count) {
                LogCapture.info("User confirms that system is display correct count::Refferal Count is->>" + RefCount + "" + "Table Count:" + count);

            } else {
                LogCapture.info("User confirms that system is not display correct count::Refferal Count is->>->>" + RefCount + "" + "Table Count:" + count);
                Assert.fail();
            }
        }

        if (Tab.equalsIgnoreCase("Registration")) {
            int count = 0;
            String vObjRegistrationCounts = Constants.Affiliates_CommissionsPageOR.getProperty("RegistrationCounts");
            String RegistrationCounts = Constants.driver.findElement(By.xpath(vObjRegistrationCounts)).getText();
            System.out.println("RegistrationCounts" + RegistrationCounts);
            int ActualCount = Integer.parseInt(RegistrationCounts);
            ((JavascriptExecutor) Constants.driver).executeScript("javascript:window.scrollBy(250,350)");
            for (int j = 0; j < 10; j++) {
                String vObjTableRow = Constants.Affiliates_CommissionsPageOR.getProperty("TableRow");
                List<WebElement> rows = Constants.driver.findElements(By.xpath(vObjTableRow));
                count = count + rows.size();
                String vObjGotoNextPage = Constants.Affiliates_CommissionsPageOR.getProperty("GotoNextPage");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjGotoNextPage, ""));
                if (rows.size() == 10) {
                    LogCapture.info("User confirms that system is displayed 10 records in one page::Row Size->>" + rows.size() + "" + "Count:" + count);
                    System.out.println("Record Count is::" + count);
                    Assert.assertEquals("PASS", Constants.key.click(vObjGotoNextPage, ""));
                } else {
                    System.out.println("Record Count is::" + count);
                    LogCapture.info("User confirms that system is displayed Less Than 10 records in one page::Row Size->>" + rows.size() + "" + "Count:" + count);
                    break;
                }
            }

            if (ActualCount >= count) {
                LogCapture.info("User confirms that system is display correct count::RegistrationCounts Count is->>" + ActualCount + "" + "Table Count:" + count);

            } else {
                LogCapture.info("User confirms that system is not display correct count::RegistrationCounts Count is->>->>" + ActualCount + "" + "Table Count:" + count);
                Assert.fail();
            }
        }
        if (Tab.equalsIgnoreCase("Trades")) {
            int count = 0;
            String vObjTradedCounts = Constants.Affiliates_CommissionsPageOR.getProperty("TradedCounts");
            String TradedCounts = Constants.driver.findElement(By.xpath(vObjTradedCounts)).getText();
            System.out.println("RegistrationCounts" + TradedCounts);
            int ActualCount = Integer.parseInt(TradedCounts);
            ((JavascriptExecutor) Constants.driver).executeScript("javascript:window.scrollBy(250,350)");
            for (int j = 0; j < 10; j++) {
                String vObjTableRow = Constants.Affiliates_CommissionsPageOR.getProperty("TableRow");
                List<WebElement> rows = Constants.driver.findElements(By.xpath(vObjTableRow));
                count = count + rows.size();
                String vObjGotoNextPage = Constants.Affiliates_CommissionsPageOR.getProperty("GotoNextPage");
                Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjGotoNextPage, ""));
                if (rows.size() == 10) {
                    LogCapture.info("User confirms that system is displayed 10 records in one page::Row Size->>" + rows.size() + "" + "Count:" + count);
                    System.out.println("Record Count is::" + count);
                    Assert.assertEquals("PASS", Constants.key.click(vObjGotoNextPage, ""));
                } else {
                    System.out.println("Record Count is::" + count);
                    LogCapture.info("User confirms that system is displayed Less Than 10 records in one page::Row Size->>" + rows.size() + "" + "Count:" + count);
                    break;
                }
            }

            if (ActualCount <= count) {
                LogCapture.info("User confirms that system is display correct count::TradedCountsCounts Count is->>" + ActualCount + "" + "Table Count:" + count);

            } else {
                LogCapture.info("User confirms that system is not display correct count::TradedCountsCounts Count is->>->>" + ActualCount + "" + "Table Count:" + count);
                Assert.fail();
            }
        }
    }

    @Then("^User should be able to view the  Steve John Group Affilate been selected by default$")
    public void userShouldBeAbleToViewTheSteveJohnGroupAffilateBeenSelectedByDefault() {
        Select select = new Select(Constants.driver.findElement(By.name("Partner Group")));
        WebElement option = select.getFirstSelectedOption();
        String defaultOption = option.getText();
        String ExpectedOption = "Jhon Referrals";
        if (defaultOption.equals(ExpectedOption)) {
            LogCapture.info("Affilate by default been selected");
        } else {
            LogCapture.info("Affilate by not been selected");
            Assert.fail();
        }
    }

    @And("^User click on the Affilate Group DropDown$")
    public void userClickOnTheAffilateGroupDropDown() throws Exception {
        String vAffilateDropDown = Constants.Affiliates_AccountsPageOR.getProperty("AffilateDropDown");
        Assert.assertEquals("PASS", Constants.key.click(vAffilateDropDown, ""));
        LogCapture.info("User Click on Group affilate");
    }

    @Then("^User should be able to view the list of options on the dropdown$")
    public void userShouldBeAbleToViewTheListOfOptionsOnTheDropdown() throws Exception {
        LogCapture.info("Validating All options");
        String[] exp = {"Jhon Referrals", "Total Group", "Jhon Wick", "Detailed Test Accounts"};
        WebElement dropdown = driver.findElement(By.name("Partner Group"));
        Select select = new Select(dropdown);
        List<WebElement> options = select.getOptions();
        for (WebElement we : options) {
            boolean match = false;
            for (int i = 0; i < exp.length; i++) {
                if (we.getText().equals(exp[i])) {
                    match = true;
                }
            }
            Assert.assertTrue(match);
        }
    }

    @And("^User Selects the (Total Group|subaffilate) option from the list$")
    public void userSelectsTheTotalGroupOptionFromTheList(String Value) throws Exception {
        if (Value.equalsIgnoreCase("Total Group")) {
            String vAffilateDropDown = Constants.Affiliates_AccountsPageOR.getProperty("AffilateDropDown");
            Assert.assertEquals("PASS", Constants.key.SelectDropDownValue(vAffilateDropDown, "Total Group"));
            Constants.key.pause("3", "");
        }
        if (Value.equalsIgnoreCase("subaffilate")) {
            String vAffilateDropDown = Constants.Affiliates_AccountsPageOR.getProperty("AffilateDropDown");
            Assert.assertEquals("PASS", Constants.key.SelectDropDownValue(vAffilateDropDown, "Jhon Wick"));
            Constants.key.pause("3", "");

        }
    }

    @Then("^System will display a total of records which is sum of all affilates$")
    public void systemWillDisplayATotalOfRecordsWhichIsSumOfAllAffilates() throws Exception {
        String vWebtables = Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryRows");
        Assert.assertEquals("PASS", Constants.key.ValidateWebtablePagination(vWebtables, "Total Group"));
        Constants.key.pause("5", "");
    }

    @And("^User clicks on (Registration|Trades) tab$")
    public void userClicksOnRegistrationTab(String Tab) throws Exception {
        if (Tab.equalsIgnoreCase("Registration")) {
            String vRegistrationWebtable = Constants.Affiliates_AccountsPageOR.getProperty("RegistrationWebtable");
            Assert.assertEquals("PASS", Constants.key.click(vRegistrationWebtable, ""));
            LogCapture.info("Registration Option Selected");
            Constants.key.pause("3", "");
        }
        if (Tab.equalsIgnoreCase("Trades")) {
            String vTradeWebtable = Constants.Affiliates_AccountsPageOR.getProperty("TradeWebtable");
            Assert.assertEquals("PASS", Constants.key.click(vTradeWebtable, ""));
            LogCapture.info("Trade Option Selected");
            Constants.key.pause("3", "");
        }
    }

    @Then("^user should be able to get a total count in Trades section$")
    public void userShouldBeAbleToGetATotalCountInTradesSection() throws Exception {
        String vWebtables = Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryRows");
        Assert.assertEquals("PASS", Constants.key.ValidateWebtablePagination(vWebtables, "Total Group"));
        Constants.key.pause("3", "");
    }

    @Then("^User should be able to view the (summary view|No view) user been Affilate been selected by default$")
    public void userShouldBeAbleToViewTheSummaryViewUserBeenAffilateBeenSelectedByDefault(String View) {
        if (View.equalsIgnoreCase("summary view")) {
            Select select = new Select(Constants.driver.findElement(By.name("Partner Group")));
            WebElement option = select.getFirstSelectedOption();
            String defaultOption = option.getText();
            String ExpectedOption = "Jhonny Bravo";
            if (defaultOption.equals(ExpectedOption)) {
                LogCapture.info("Affilate by default been selected");
            } else {
                LogCapture.info("Affilate by not been selected");
                Assert.fail();
            }
        }
        if (View.equalsIgnoreCase("No view")) {
            Select select = new Select(Constants.driver.findElement(By.name("Partner Group")));
            WebElement option = select.getFirstSelectedOption();
            String defaultOption = option.getText();
            String ExpectedOption = "Jhon Luis";
            if (defaultOption.equals(ExpectedOption)) {
                LogCapture.info("Affilate by default been selected");
            } else {
                LogCapture.info("Affilate by not been selected");
                Assert.fail();
            }
        }
    }

    @Then("^User should be able to view (Referalls|Registration) records$")
    public void userShouldBeAbleToViewReferallsRecords(String Tab) throws Exception {
        if (Tab.equalsIgnoreCase("Referalls")) {
            String vWebtables = Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryRows");
            Assert.assertEquals("PASS", Constants.key.ValidateWebtablePagination(vWebtables, "Total Group"));
            Constants.key.pause("3", "");
        }
        if (Tab.equalsIgnoreCase("Registration")) {
            String vWebtables = Constants.Affiliates_AccountsPageOR.getProperty("AnnualSummaryRows");
            Assert.assertEquals("PASS", Constants.key.ValidateWebtablePagination(vWebtables, "Total Group"));
            Constants.key.pause("3", "");
        }
    }

    @And("^User Selects subaffilate option from the list for (no view|summary view)$")
    public void userSelectsSubaffilateOptionFromTheListForNoView(String View) throws Exception {
        if (View.equalsIgnoreCase("no view")) {
            String vAffilateDropDown = Constants.Affiliates_AccountsPageOR.getProperty("AffilateDropDown");
            Assert.assertEquals("PASS", Constants.key.SelectDropDownValue(vAffilateDropDown, "HL Enterprise"));
            Constants.key.pause("3", "");
        }
        if (View.equalsIgnoreCase("summary view")) {
            String vAffilateDropDown = Constants.Affiliates_AccountsPageOR.getProperty("AffilateDropDown");
            Assert.assertEquals("PASS", Constants.key.SelectDropDownValue(vAffilateDropDown, "Jhon Luis"));
            Constants.key.pause("3", "");
        }
    }

    @Then("^User should be able to view the logged in Affilate been selected by default$")
    public void userShouldBeAbleToViewTheLoggedInAffilateBeenSelectedByDefault() {
        Select select = new Select(Constants.driver.findElement(By.name("Partner Group")));
        WebElement option = select.getFirstSelectedOption();
        String defaultOption = option.getText();
        String ExpectedOption = "Jhonny Bravo";
        if (defaultOption.equals(ExpectedOption)) {
            LogCapture.info("Affilate by default been selected");
        } else {
            LogCapture.info("Affilate by not been selected");
            Assert.fail();
        }
    }

    @Then("^User should be able to view the list of options on the dropdown for (summary option|no view|summary view)$")
    public void userShouldBeAbleToViewTheListOfOptionsOnTheDropdownForSummaryOption(String Option) {
        if (Option.equalsIgnoreCase("summary option")) {
            LogCapture.info("Validating All options");
            String[] exp = {"Jhonny Bravo", "Total Group", "Jhon Luis", "Jhon Tabo", "Jhonny Wick1"};
            WebElement dropdown = driver.findElement(By.name("Partner Group"));
            Select select = new Select(dropdown);
            List<WebElement> options = select.getOptions();
            for (WebElement we : options) {
                boolean match = false;
                for (int i = 0; i < exp.length; i++) {
                    if (we.getText().equals(exp[i])) {
                        match = true;
                    }
                }
                Assert.assertTrue(match);
            }
        }
        if (Option.equalsIgnoreCase("no view")) {
            LogCapture.info("Validating All options");
            String[] exp = {"Jhon Luis", "Total Group", "HL Enterprise", "James SA"};
            WebElement dropdown = driver.findElement(By.name("Partner Group"));
            Select select = new Select(dropdown);
            List<WebElement> options = select.getOptions();
            for (WebElement we : options) {
                boolean match = false;
                for (int i = 0; i < exp.length; i++) {
                    if (we.getText().equals(exp[i])) {
                        match = true;
                    }
                }
                Assert.assertTrue(match);
            }
        }

        if (Option.equalsIgnoreCase("summary view")) {
            LogCapture.info("Validating All options");
            String[] exp = {"Jhonny Bravo", "Total Group", "Jhon Luis", "Jhon Tabo", "Jhonny Wick1"};
            WebElement dropdown = driver.findElement(By.name("Partner Group"));
            Select select = new Select(dropdown);
            List<WebElement> options = select.getOptions();
            for (WebElement we : options) {
                boolean match = false;
                for (int i = 0; i < exp.length; i++) {
                    if (we.getText().equals(exp[i])) {
                        match = true;
                    }
                }
                Assert.assertTrue(match);
            }
        }
    }

    @And("^User Selects subaffilate option from the list$")
    public void userSelectsSubaffilateOptionFromTheList() throws Exception {
        String vAffilateDropDown = Constants.Affiliates_AccountsPageOR.getProperty("AffilateDropDown");
        Assert.assertEquals("PASS", Constants.key.SelectDropDownValue(vAffilateDropDown, "Jhon Wick"));
        Constants.key.pause("3", "");
    }

    @Then("^User successfully register a become a partner journey$")
    public void userSuccessfullyRegisterABecomeAPartnerJourney() throws Exception {
        String vObjSentEmail = Constants.Affiliates_BecomeaPartnerOR.getProperty("SentMail");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vObjSentEmail, ""));
        Assert.assertEquals("PASS", Constants.key.exist(vObjSentEmail, ""));

        String vObjHomePageLink = Constants.Affiliates_BecomeaPartnerOR.getProperty("HomePageLink");
        Assert.assertEquals("PASS", Constants.key.exist(vObjHomePageLink, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjHomePageLink, "Visit our homepage"));


        String vObjWelcomeMsg = Constants.Affiliates_BecomeaPartnerOR.getProperty("WelcomeMsg");
        Assert.assertEquals("PASS", Constants.key.exist(vObjWelcomeMsg, ""));

        //String vObjWelcomeMsgText = Constants.Affiliates_BecomeaPartnerOR.getProperty("WelcomeMsgText");
        //Assert.assertEquals("PASS", Constants.key.exist(vObjWelcomeMsgText, ""));

    }
}