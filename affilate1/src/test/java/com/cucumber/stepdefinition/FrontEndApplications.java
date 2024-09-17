package com.cucumber.stepdefinition;

import com.selenium.utillity.Constants;
//import com.utilities.Log;
//import com.sun.org.apache.bcel.internal.Const;
import com.selenium.utillity.Reusables;
import com.utility.LogCapture;

import com.selenium.utillity.Constants;
//import com.utilities.Log;
import com.utility.LogCapture;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
/*import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;*/
import org.openqa.selenium.By;
import org.testng.Assert;



public class FrontEndApplications {

    @Given("^User launched application through \"([^\"]*)\"$")
    public void userLaunchedApplicationThrough(String data) throws Throwable {
        LogCapture.info(data + " Application is launching....");
        Assert.assertTrue(Constants.key.openBrowser("", data));
    }

    /*@And("^User navigate to FCG portal \"([^\"]*)\"$")
    public void userNavigateToFCGPortal(String vUrl) throws Throwable {
        LogCapture.info("FCG Portal is loading....");
        String url = Constants.CONFIG.getProperty(vUrl);
        Assert.assertEquals("PASS", Constants.key.navigate("", url));
    }*/

    @When("^I enter UserName \"([^\"]*)\" password \"([^\"]*)\" and click login button$")
    public void iEnterUserNamePasswordAndClickLoginButton(String userName, String password) throws Throwable {

        String vUserName = Constants.CONFIG.getProperty(userName);
        String vPassword = Constants.CONFIG.getProperty(password);
        String vObjUser = Constants.FCGloginPageOR.getProperty("FCG_Username");
        String vObjPass = Constants.FCGloginPageOR.getProperty("FCG_Password");
        LogCapture.info("User Name " + vUserName + ", Password " + password + " is validated ....");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjUser, vUserName));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPass, vPassword));
        String vObjLoginButton = Constants.FCGloginPageOR.getProperty("LoginButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjLoginButton, ""));
    }

    @Then("^I landed on Dashboard page successfully$")
    public void iLandedOnDashboardPageSuccessfully() throws Exception {
        LogCapture.info("Dashboard loading ......");
        Constants.key.pause("2", "");
        String vobjectDashboard = Constants.FCG_DashboardOR.getProperty("DashboardORText");
        Assert.assertEquals("PASS", Constants.key.verifyText(vobjectDashboard, "Check the exchange rate"));
    }

    @Then("^error message is displayed on Login page$")
    public void errorMessageIsDisplayedOnLognPage() throws Exception {
        String vExpected = "Either your email or your password is incorrect. Please re-enter your correct credentials. If you are not registered with us already, please click here to register with us.";
        String vErrorObj = Constants.FCGloginPageOR.getProperty("ErrorMessageLogin");
        LogCapture.info("Validating error message...");
        Assert.assertEquals("PASS", Constants.key.verifyText(vErrorObj, vExpected));
    }

    @When("^I enter UserName \"([^\"]*)\" incorrect password \"([^\"]*)\" and click login button$")
    public void iEnterUserNameIncorrectPasswordAndClickLoginButton(String usernName, String inPassword) throws Throwable {
        LogCapture.info("Validating incorrect credentials.......");
        String vUserName = Constants.CONFIG.getProperty(usernName);
        String vObjUser = Constants.FCGloginPageOR.getProperty("FCG_Username");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjUser, vUserName));
        String vObjPass = Constants.FCGloginPageOR.getProperty("FCG_Password");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPass, inPassword));
        String vObjLoginButton = Constants.FCGloginPageOR.getProperty("LoginButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjLoginButton, ""));


    }

    @And("^User Select buying currency\"([^\"]*)\" from I intend to buy drop down\\.$")
    public void userSelectBuyingCurrencyFromIIntendToBuyDropDown(String buyValue) throws Throwable {
        LogCapture.info("Selecting Buying Currency..." + buyValue);
        String vIntentBuyDroDownClick = Constants.FCG_NewRateAlertOR.getProperty("IntentToBuyDDclick");
        Assert.assertEquals("PASS", Constants.key.pause("2", ""));
        Assert.assertEquals("PASS", Constants.key.click(vIntentBuyDroDownClick, ""));
        String vIntentBuyDroDownaddValue = Constants.FCG_NewRateAlertOR.getProperty("IntendToBuySearchAdd");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vIntentBuyDroDownaddValue, buyValue));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vIntentBuyDroDownaddValue, "enter"));
        //Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke("", "enter"));

    }

    @Then("^User click on Create new Rate Alert option on dashboard\\.$")
    public void userClickOnCreateNewRateAlertOptionOnDashboard() throws Exception {
        LogCapture.info("Clicking New rate Alert option .......");
        String vNewRateAlert = Constants.FCG_DashboardOR.getProperty("CrNewRateButton");
        Assert.assertEquals("PASS", Constants.key.pause("2", ""));
        Assert.assertEquals("PASS", Constants.key.click(vNewRateAlert, ""));
    }

    @And("^Select selling currency\"([^\"]*)\" from I intend to sell drop down\\.$")
    public void selectSellingCurrencyFromIIntendToSellDropDown(String sellValue) throws Throwable {

        LogCapture.info("Selecting selling Currency..." + sellValue);
        String vIntentSellDroDownClick = Constants.FCG_NewRateAlertOR.getProperty("vIntentSellDroDownClick");
        Assert.assertEquals("PASS", Constants.key.pause("2", ""));
        Assert.assertEquals("PASS", Constants.key.click(vIntentSellDroDownClick, ""));
        String vIntentSellDroDownaddValue = Constants.FCG_NewRateAlertOR.getProperty("IntendToSellSearchAdd");
        Assert.assertEquals("PASS", Constants.key.pause("2", ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vIntentSellDroDownaddValue, sellValue));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vIntentSellDroDownaddValue, "enter"));
        //Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke("", "enter"));
    }

    @When("^User enter the amount\"([^\"]*)\" to buy and click on Get Rate button$")
    public void userEnterTheAmountToyBuyAndClickOnGetRateButton(String buyAmount) throws Throwable {
        LogCapture.info("Entering the amount to buy .....");
        String vBuyInputObject = Constants.FCG_NewRateAlertOR.getProperty("BuyInputText");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vBuyInputObject, buyAmount));
        String vGetRateButtonObj = Constants.FCG_NewRateAlertOR.getProperty("GetRateButton");
        Assert.assertEquals("PASS", Constants.key.click(vGetRateButtonObj, ""));


    }

    @Then("^Current Rate is populated successfully$")
    public void currentRateIsPopulatedSuccessfully() throws Exception {
        LogCapture.info("Checking for current rate ....");
        String vCurrentRateValue = Constants.FCG_NewRateAlertOR.getProperty("CurrentRateValue");
        Assert.assertEquals("PASS", Constants.key.exist(vCurrentRateValue, ""));


    }

    @Then("^User enter the Target Rate and click on (Continue|Update target rate) button$")
    public void userEnterTheTargetRateAndClickOnContinueButton(String button) throws Throwable {
        LogCapture.info("Target Rate validation.....");
        String vTargetRate = Constants.FCG_NewRateAlertOR.getProperty("TargetRateValue");
        String vCurrentRateValue = Constants.FCG_NewRateAlertOR.getProperty("CurrentRateValue");
        Assert.assertEquals("PASS", Constants.key.pause("5", ""));
        String vCurrentRateValNum = Constants.driver.findElement(By.xpath(vCurrentRateValue)).getAttribute("value");
        double d = Double.parseDouble(vCurrentRateValNum);
        double vDoubleCurrRate = ((10 * d / 100) + d);
        String vTargetValueCalculated = Double.toString(vDoubleCurrRate);
        Assert.assertEquals("PASS", Constants.key.pause("5", ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vTargetRate, vTargetValueCalculated));
        Assert.assertEquals("PASS", Constants.key.pause("2", ""));
        if (button.equals("Continue")) {
            LogCapture.info("User clicking " + button + " button...");
            Assert.assertEquals("PASS", Constants.key.click(Constants.FCG_NewRateAlertOR.getProperty("ContinueButton"), ""));
        } else if (button.equals("Update target rate")) {
            LogCapture.info("User clicking " + button + " button...");
            Assert.assertEquals("PASS", Constants.key.click(Constants.FCG_NewRateAlertOR.getProperty("UpdateTargetRate"), ""));
        }


    }

    @And("^Pay this much less amount is displayed successfully$")
    public void payThisMuchLessAmountIsDisplayedSuccessfully() throws Exception {
        LogCapture.info("Check for Pay this much less field.......");
        String vPaylessObj = Constants.FCG_NewRateAlertOR.getProperty("PayThisMuchLessField");
        Assert.assertEquals("PASS", Constants.key.exist(vPaylessObj, ""));
    }

    @When("^User select Alert me via \"([^\"]*)\" drop down and click on Create alert button$")
    public void userSelectAlertMeViaDropDownAndClickOnCreateAlertButton(String arg0) throws Throwable {
        LogCapture.info("Setting Alert options and creating Alert Button......");
        String vAlertMeDD = Constants.FCG_NewRateAlertOR.getProperty("AlertMeViaDDclick");
        Assert.assertEquals("PASS", Constants.key.click(vAlertMeDD, ""));
        String vAlertMeVal = Constants.FCG_NewRateAlertOR.getProperty("AlertMeViaDDAdd");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vAlertMeVal, arg0));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vAlertMeVal, "enter"));
        //Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke("", "enter"));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.click(Constants.FCG_NewRateAlertOR.getProperty("CreateAlertButton"), ""));

    }

    @Then("^success message of (adding alert|edit alert|delete alert) is displayed$")
    public void successMessageOfAddingAlertIsDisplayed(String message) throws Exception {
        //LogCapture.info("Checking "+message+" success message.....");
        Constants.key.pause("2", "");
        if (message.equals("adding alert")) {
            LogCapture.info("Checking " + message + " success message.....");
            String vRateSuccessObj = Constants.FCG_NewRateAlertOR.getProperty("RateAlertSuccessfullyMsg");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vRateSuccessObj, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vRateSuccessObj, "Thanks, your rate alert has been added successfully."));
        } else if (message.equals("edit alert")) {
            LogCapture.info("Checking " + message + " success message.....");
            String vRateAlertUpdateMessage = Constants.FCG_NewRateAlertOR.getProperty("RateAlertUpdateMessage");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vRateAlertUpdateMessage, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vRateAlertUpdateMessage, "Thanks, your rate alert has been updated successfully."));
        } else if (message.equals("delete alert")) {
            LogCapture.info("Checking " + message + " success message.....");
            String vDeleteSuccessMessage = Constants.FCG_NewRateAlertOR.getProperty("DeleteSuccessMessage");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vDeleteSuccessMessage, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vDeleteSuccessMessage, "Thanks, you have successfully deleted this Rate Alert."));
        }

    }

    @Then("^User clicks on Top up your wallet section$")
    public void user_clicks_on_Top_up_your_wallet_section() throws Throwable {
        LogCapture.info("Selecting Top Up Wallet section......");
        String vObjTopUpWalletLink = Constants.FCG_TopupWalletOR.getProperty("TopUpWalletLink");
        Assert.assertEquals("PASS", Constants.key.click(vObjTopUpWalletLink, ""));
        Constants.key.pause("2", "");

    }

    @When("^User selects Payment currency \"(.*?)\" Select wallet \"(.*?)\"$")
    public void user_selects_Payment_currency_Select_wallet(String payCurrency, String selectWallet) throws Throwable {
        LogCapture.info("Selecting Payment Curreny and Wallet......");
        String vObjPaymentCurrency = Constants.FCG_TopupWalletOR.getProperty("PaymentCurrency");
        Assert.assertEquals("PASS", Constants.key.click(vObjPaymentCurrency, ""));
        String vObjPaySearchCurrency = Constants.FCG_TopupWalletOR.getProperty("PayCurrencySearch");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPaySearchCurrency, payCurrency));
        Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke("", "enter"));
        String vObjSelectWallet = Constants.FCG_TopupWalletOR.getProperty("SelectWallet");
        Assert.assertEquals("PASS", Constants.key.click(vObjSelectWallet, ""));
        String vObjBuySearchCurrency = Constants.FCG_TopupWalletOR.getProperty("BuyCurrencySearch");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjBuySearchCurrency, selectWallet));
        Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke("", "enter"));

    }

    @When("^User enters Payment currecy Amount \"(.*?)\" and clicks countinue button$")
    public void user_enters_Payment_currecy_Amount_and_clicks_countinue_button(String payAmount) throws Throwable {
        LogCapture.info("Entering Payment Currency and clicking continue button....");
        String vObjPayCurrencyAMT = Constants.FCG_TopupWalletOR.getProperty("PaymentCurrencyAMT");
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPayCurrencyAMT, payAmount));
        Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke("", "enter"));
        Constants.key.pause("2", "");
        String vObjButtonBuyCur1 = Constants.FCG_TopupWalletOR.getProperty("ButtonBuyCur1");
        Assert.assertEquals("PASS", Constants.key.click(vObjButtonBuyCur1, ""));

    }

    @When("^User selects Payment method \"(.*?)\" and clicks countinue button$")
    public void user_selects_Payment_method_and_clicks_countinue_button(String payMethod) throws Throwable {
        LogCapture.info("Select payment method and click Continue....");
        String vObjPaymentMethod = Constants.FCG_TopupWalletOR.getProperty("PaymentMethod");
        Assert.assertEquals("PASS", Constants.key.click(vObjPaymentMethod, ""));
        String vObjFromBalance = Constants.FCG_TopupWalletOR.getProperty("FromBalance");
        Assert.assertEquals("PASS", Constants.key.click(vObjFromBalance, ""));
        String vObjButtonBuyCur2 = Constants.FCG_TopupWalletOR.getProperty("ButtonBuyCur2");
        Assert.assertEquals("PASS", Constants.key.click(vObjButtonBuyCur2, ""));
        Constants.key.pause("2", "");

    }

    @When("^User clicks on Confirm button after validating details entered$")
    public void user_clicks_on_Confirm_button_after_validating_details_entered() throws Throwable {
        LogCapture.info("Confirming validations.....");
        //String vObjConfirmYourPurchase = Constants.FCG_DashboardOR.getProperty("ConfirmYourPurchase");
        //Assert.assertEquals("PASS",Constants.key.verifyText(vObjConfirmYourPurchase,"Confirm your purchase"));
        String vObjButtonPurchaseConfirmation = Constants.FCG_TopupWalletOR.getProperty("ButtonPurchaseConfirmation");
        Assert.assertEquals("PASS", Constants.key.click(vObjButtonPurchaseConfirmation, ""));
        Constants.key.pause("2", "");

    }

    @Then("^User should sucessfully be able to top up wallet and click on Back to dashboard link$")
    public void user_should_sucessfully_be_able_to_top_up_wallet_and_click_on_Back_to_dashboard_link() throws Throwable {
        LogCapture.info("Top Up Wallet validation...");
        String vObjSuccessfullTopUpMSG = Constants.FCG_TopupWalletOR.getProperty("SuccessfullTopUpMSG");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjSuccessfullTopUpMSG, "Top-up details"));
        String vObjLinkBackToDashboard = Constants.FCG_TopupWalletOR.getProperty("LinkBackToDashboard");
        Assert.assertEquals("PASS", Constants.key.click(vObjLinkBackToDashboard, ""));

    }

    @Then("^User click on Transfer section$")
    public void user_click_on_Transfer_section() throws Throwable {
        LogCapture.info("Transfer Section verification.......");
        String vObjTransferLink = Constants.FCG_MakeTransferOR.getProperty("TransferLink");
        Assert.assertEquals("PASS", Constants.key.click(vObjTransferLink, ""));

    }


    @Then("^User clicks on Select link for relevant benificiary$")
    public void user_clicks_on_Select_link_for_relevant_benificiary() throws Throwable {
        LogCapture.info("Adding Benificiary......");
        String vObjSelectRecipient = Constants.FCG_MakeTransferOR.getProperty("SelectRecipient");
        Assert.assertEquals("PASS", Constants.key.click(vObjSelectRecipient, ""));

    }

    @When("^User selects you Pay \"(.*?)\" Amount \"(.*?)\"$")
    public void user_selects_you_Pay_Amount(String youPay, String amount) throws Throwable {
        LogCapture.info("Amount selection......");
        String vObjYouPay = Constants.FCG_MakeTransferOR.getProperty("YouPay");
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.click(vObjYouPay, ""));

        String vObjYouPaySearch = Constants.FCG_MakeTransferOR.getProperty("YouPaySearch");
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjYouPaySearch, youPay));
        Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke("", "enter"));

        String vObjSellInput = Constants.FCG_MakeTransferOR.getProperty("SellInput");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjSellInput, amount));
        Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke("", "enter"));

    }

    @When("^User selects Reason for this transfer \"(.*?)\" enters Recipient reference \"(.*?)\"$")
    public void user_selects_Reason_for_this_transfer_enters_Recipient_reference(String reason, String reference) throws Throwable {
        LogCapture.info("Reason for transfer and references.....");
        String vObjReasonForTransfer = Constants.FCG_MakeTransferOR.getProperty("ReasonForTransfer");
        Assert.assertEquals("PASS", Constants.key.click(vObjReasonForTransfer, ""));

        String vObjReasonForTransferSearch = Constants.FCG_MakeTransferOR.getProperty("ReasonForTransferSearch");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjReasonForTransferSearch, reason));
        Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke("", "enter"));

        String vObjRecipientReference = Constants.FCG_MakeTransferOR.getProperty("RecipientReference");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjRecipientReference, reference));

        String vObjButtonContinue = Constants.FCG_MakeTransferOR.getProperty("ButtonContinue");
        Assert.assertEquals("PASS", Constants.key.click(vObjButtonContinue, ""));

    }

    @When("^User selects Payment method \"(.*?)\" and clicks on Continue button$")
    public void user_selects_Payment_method_and_clicks_on_Continue_button(String arg1) throws Throwable {
        LogCapture.info("Selecting Payment method.....");
        String vObjPaymentMethod = Constants.FCG_MakeTransferOR.getProperty("PaymentMethod");
        Assert.assertEquals("PASS", Constants.key.click(vObjPaymentMethod, ""));
        String vObjFromBalance = Constants.FCG_MakeTransferOR.getProperty("FromBalance");
        Assert.assertEquals("PASS", Constants.key.click(vObjFromBalance, ""));
        String vObjButtonContinuetoSubmit = Constants.FCG_MakeTransferOR.getProperty("ButtonContinuetoSubmit");
        Assert.assertEquals("PASS", Constants.key.click(vObjButtonContinuetoSubmit, ""));


    }

    @When("^User clicks on Confirm button after validating details entered for transfer$")
    public void user_clicks_on_Confirm_button_after_validating_details_entered_for_transfer() throws Throwable {
        LogCapture.info("Confirming post validations.....");
        String vObjConfirmButton = Constants.FCG_MakeTransferOR.getProperty("ConfirmButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjConfirmButton, ""));

    }

    @Then("^User should sucessfully be able make a transfer and click on Back to dashboard link$")
    public void user_should_sucessfully_be_able_make_a_transfer_and_click_on_Back_to_dashboard_link() throws Throwable {
        LogCapture.info("Transfer success Validation.....");
        String vObjLinkBackToDashboard = Constants.FCG_MakeTransferOR.getProperty("LinkBackToDashboard");
        Assert.assertEquals("PASS", Constants.key.click(vObjLinkBackToDashboard, ""));


    }

    @And("^User navigate to (FCG|TORFX|TORFXOZ|RAMSDEN|TMO) portal \"([^\"]*)\"$")
    public void user_navigate_to_TORFX_portal(String application, String vUrl) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        if (application.equals("TORFX")) {
            LogCapture.info("Portal is loading....");
            String url = Constants.CONFIG.getProperty(vUrl);
            Assert.assertEquals("PASS", Constants.key.navigate("", url));
        } else if (application.equals("FCG")) {
            LogCapture.info("Portal is loading....");
            String url = Constants.CONFIG.getProperty(vUrl);
            Assert.assertEquals("PASS", Constants.key.navigate("", url));
        } else if (application.equals("TORFXOZ")) {
            LogCapture.info("Portal is loading....");
            String url = Constants.CONFIG.getProperty(vUrl);
            Assert.assertEquals("PASS", Constants.key.navigate("", url));
        } else if (application.equals("RAMSDEN")) {
            LogCapture.info("Portal is loading....");
            String url = Constants.CONFIG.getProperty(vUrl);
            Assert.assertEquals("PASS", Constants.key.navigate("", url));
        } else if (application.equals("TMO")) {
            LogCapture.info("Portal is loading....");
            String url = Constants.CONFIG.getProperty(vUrl);
            Assert.assertEquals("PASS", Constants.key.navigate("", url));
        } else
            LogCapture.info("Organization not found");
    }


    @When("^User enter UserName \"([^\"]*)\" password \"([^\"]*)\" and click login button$")
    public void userEnterUserNamePasswordAndClickLoginButton(String userName, String password) throws Throwable {
        String vUserName = Constants.CONFIG.getProperty(userName);
        String vPassword = Constants.CONFIG.getProperty(password);
        String vObjUser = Constants.FCGloginPageOR.getProperty("FCG_Username");
        String vObjPass = Constants.FCGloginPageOR.getProperty("FCG_Password");
        LogCapture.info("User Name " + vUserName + ", Password " + password + " is validated ....");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjUser, vUserName));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPass, vPassword));
        String vObjLoginButton = Constants.FCGloginPageOR.getProperty("LoginButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjLoginButton, ""));

    }

    @Then("^User landed on Dashboard page successfully$")
    public void userLandedOnDashboardPageSuccessfully() throws Exception {
        LogCapture.info("Dashboard loading ......");
        Constants.key.pause("2", "");
        String vobjectDashboard = Constants.FCG_DashboardOR.getProperty("DashboardORText");
        Assert.assertEquals("PASS", Constants.key.verifyText(vobjectDashboard, "Check the exchange rate"));
    }

    @When("^User enter UserName \"([^\"]*)\" incorrect password \"([^\"]*)\" and click login button$")
    public void userEnterUserNameIncorrectPasswordAndClickLoginButton(String usernName, String inPassword) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        LogCapture.info("Validating incorrect credentials.......");
        String vUserName = Constants.CONFIG.getProperty(usernName);
        String vObjUser = Constants.FCGloginPageOR.getProperty("FCG_Username");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjUser, vUserName));
        String vObjPass = Constants.FCGloginPageOR.getProperty("FCG_Password");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPass, inPassword));
        String vObjLoginButton = Constants.FCGloginPageOR.getProperty("LoginButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjLoginButton, ""));
    }

    @And("^User click on Transfer now button on Dashboard$")
    public void userClickOnTransferNowButtonOnDashboard() throws Exception {
        LogCapture.info("User Clicking on Transfer now button on dashboard...");
        String vTransfNow = Constants.FCG_DashboardOR.getProperty("TransferNowButton");
        Assert.assertEquals("PASS", Constants.key.click(vTransfNow, ""));

    }

    @Then("^User is navigated to Transfer Section with recipients displayed$")
    public void userIsNavigatedToTransferSectionWithRecipientsDisplayed() throws Exception {
        LogCapture.info("Navigating to Transfer section with list of receipents displayed...");
        String vTH = Constants.FCG_MakeTransferOR.getProperty("TransferPageHeader");
        Assert.assertEquals("PASS", Constants.key.verifyText(vTH, "Transfer"));
        String vReceipentCheck = Constants.FCG_MakeTransferOR.getProperty("ReceipentListFirst");
        Assert.assertEquals("PASS", Constants.key.exist(vReceipentCheck, ""));


    }


    @And("^User Selects the Sell Currency \"([^\"]*)\" and Buy Currency \"([^\"]*)\"$")
    public void userSelectsTheSellCurrencyAndBuyCurrency(String vYouPayCr, String vRecipientCr) throws Throwable {
        LogCapture.info("User is selecting Sell & Buy currency.....");
        String vYouPayObj = Constants.FCG_DashboardOR.getProperty("YouPayCurrencyDD");
        Assert.assertEquals("PASS", Constants.key.click(vYouPayObj, ""));
        String vCrInputBox = Constants.FCG_DashboardOR.getProperty("CurrencyInput");
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vCrInputBox, vYouPayCr));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCrInputBox, "enter"));
        Constants.key.pause("2", "");
        String vRecipientObj = Constants.FCG_DashboardOR.getProperty("RecipientCurrencyDD");
        Assert.assertEquals("PASS", Constants.key.click(vRecipientObj, ""));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vCrInputBox, vRecipientCr));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCrInputBox, "enter"));


    }

    @And("^Enter the Amount\"([^\"]*)\" in YouPay Amount textbox$")
    public void enterTheAmountInYouPayAmountTextbox(String amount) throws Throwable {
        LogCapture.info("User is Entering Amount in you pay amount textbox...");
        String vYouPayAmountObj = Constants.FCG_DashboardOR.getProperty("YouPayInputBox");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vYouPayAmountObj, amount));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vYouPayAmountObj, "tab"));
        Constants.key.pause("2", "");
    }

    @Then("^User checks the Exchange Rates$")
    public void userChecksTheExchangeRates() throws Exception {
        LogCapture.info("Exchange Rate is checked...");
        String vExchangeRateObj = Constants.FCG_DashboardOR.getProperty("ExchangeRate");
        Assert.assertEquals("PASS", Constants.key.exist(vExchangeRateObj, ""));

    }

    @Then("^User is navigated to Transfer Page with Add a Recipent Option$")
    public void userIsNavigatedToTransferPageWithAddARecipentOption() throws Exception {
        LogCapture.info("User is navigated to Transfer Page with Add a Recipent Option.....");
        String vAddRecipientButtonObj = Constants.FCG_DashboardOR.getProperty("AddRecipientButton");
        Assert.assertEquals("PASS", Constants.key.verifyText(vAddRecipientButtonObj, "Add recipient"));
    }

    @And("^User Clicks on (Create new Rate Alert|Transfer|Top up your wallet|Our Bank Details|Add recipient|Add GBP|Send GBP|Bank Details|Profile Management|Logout|Profile DropDown|save) Button$")
    public void userClicksOnCreateNewRateAlertButton(String button) throws Exception {
        if (button.equals("Create new Rate Alert")) {
            LogCapture.info("User clicking " + button + " button...");
            String vNewRateAlertButton = Constants.FCG_DashboardOR.getProperty("CrNewRateButton");
            Assert.assertEquals("PASS", Constants.key.click(vNewRateAlertButton, ""));
        } else if (button.equals("Transfer")) {
            LogCapture.info("User clicking " + button + " button...");
            String vTransferButton = Constants.FCG_DashboardOR.getProperty("TransferButton");
            Assert.assertEquals("PASS", Constants.key.click(vTransferButton, ""));
        } else if (button.equals("Top up your wallet")) {
            LogCapture.info("User clicking " + button + " button...");
            String vTopUpButton = Constants.FCG_DashboardOR.getProperty("TopUpButton");
            Assert.assertEquals("PASS", Constants.key.click(vTopUpButton, ""));
        } else if (button.equals("Our Bank Details")) {
            LogCapture.info("User clicking " + button + " button...");
            String vOurBankDetailButton = Constants.FCG_DashboardOR.getProperty("OurBankDetailsButton");
            Assert.assertEquals("PASS", Constants.key.click(vOurBankDetailButton, ""));
        } else if (button.equals("Add recipient")) {
            LogCapture.info("User clicking " + button + " button...");
            String vAddRecipientButton = Constants.FCG_DashboardOR.getProperty("AdRicpButton");
            Assert.assertEquals("PASS", Constants.key.click(vAddRecipientButton, ""));
        } else if (button.equals("Add GBP")) {
            LogCapture.info("User clicking " + button + " button...");
            String vAddGBPButton = Constants.FCG_DashboardOR.getProperty("AddGBP");
            Assert.assertEquals("PASS", Constants.key.click(vAddGBPButton, ""));
        } else if (button.equals("Send GBP")) {
            LogCapture.info("User clicking " + button + " button...");
            String vSendGBP = Constants.FCG_DashboardOR.getProperty("SendGBP");
            Assert.assertEquals("PASS", Constants.key.click(vSendGBP, ""));
        } else if (button.equals("Bank Details")) {
            LogCapture.info("User clicking " + button + " button...");
            String vBankDetails = Constants.FCG_DashboardOR.getProperty("BankDetails");
            Assert.assertEquals("PASS", Constants.key.click(vBankDetails, ""));
        } else if (button.equals("Profile Management")) {
            LogCapture.info("User clicking " + button + " button...");
            String vProfileManagementButton = Constants.FCG_DashboardOR.getProperty("ProfileManagementButton");
            Assert.assertEquals("PASS", Constants.key.click(vProfileManagementButton, ""));
        } else if (button.equals("Logout")) {
            LogCapture.info("User clicking " + button + " button...");
            String vLogoutButton = Constants.FCG_DashboardOR.getProperty("LogoutButton");
            Assert.assertEquals("PASS", Constants.key.click(vLogoutButton, ""));
        } else if (button.equals("Profile DropDown")) {
            LogCapture.info("User clicking " + button + " button...");
            String vUserDD = Constants.FCG_DashboardOR.getProperty("UserDD");
            Assert.assertEquals("PASS", Constants.key.click(vUserDD, ""));
        } else if (button.equals("save")) {
            LogCapture.info("User clicking " + button + " button...");
            String vSaveButton = Constants.FCG_ProfileManagementOR.getProperty("SaveButton");
            Assert.assertEquals("PASS", Constants.key.click(vSaveButton, ""));
        }

    }

    @Then("^User is navigated to (New Rate Alert|Make Transfer|Top up Wallet|Our Bank Account Details|Add your recipient|Top up wallet|Transfer|Your transfer details|getPersonalDetails|Delete Pop Up) Page$")
    public void userIsNavigatedToNewRateAlertPage(String page) throws Exception {
        if (page.equals("New Rate Alert")) {
            LogCapture.info("User navigating to " + page + " page...");
            String vNewRateALertTitle = Constants.FCG_DashboardOR.getProperty("NewrateAlertTitle");
            Assert.assertEquals("PASS", Constants.key.verifyText(vNewRateALertTitle, "New rate alert"));
        } else if (page.equals("Make Transfer")) {
            LogCapture.info("User navigating to " + page + " page...");
            String vMakeTransferHeader = Constants.FCG_DashboardOR.getProperty("TransferPageHeading");
            Assert.assertEquals("PASS", Constants.key.verifyText(vMakeTransferHeader, "Transfer"));
        } else if (page.equals("Top up Wallet")) {
            LogCapture.info("User navigating to " + page + " page...");
            String vTopUpWalletPgHeader = Constants.FCG_DashboardOR.getProperty("TopUpWalletHeader");
            Assert.assertEquals("PASS", Constants.key.verifyText(vTopUpWalletPgHeader, "Top up wallet"));
        } else if (page.equals("Our Bank Account Details")) {
            LogCapture.info("User navigating to " + page + " page...");
            String vOBAD = Constants.FCG_DashboardOR.getProperty("OurBankAccountDetailsHeader");
            Assert.assertEquals("PASS", Constants.key.verifyText(vOBAD, "Our Bank Account Details"));
        } else if (page.equals("Add your recipient")) {
            LogCapture.info("User navigating to " + page + " page...");
            String vAUR = Constants.FCG_DashboardOR.getProperty("AddYourRecipientPage");
            Assert.assertEquals("PASS", Constants.key.verifyText(vAUR, "Add your recipient"));
        } else if (page.equals("Top up wallet")) {
            LogCapture.info("User navigating to " + page + " page...");
            String vBuyCr = Constants.FCG_DashboardOR.getProperty("TopUpWalletPage");
            Assert.assertEquals("PASS", Constants.key.verifyText(vBuyCr, "Top up wallet"));
        } else if (page.equals("Transfer")) {
            LogCapture.info("User navigating to " + page + " page...");
            String vTH = Constants.FCG_DashboardOR.getProperty("TransferPageHeader");
            Assert.assertEquals("PASS", Constants.key.verifyText(vTH, "Transfer"));
        } else if (page.equals("Your transfer details")) {
            LogCapture.info("User navigating to " + page + " page...");
            String vYTDSendNote = Constants.FCG_DashboardOR.getProperty("YTDSendNote");
            Assert.assertEquals("PASS", Constants.key.verifyText(vYTDSendNote, "How much do you need to send?"));
        } else if (page.equals("getPersonalDetails")) {
            LogCapture.info("User navigating to " + page + " page...");
            String vProfileManagementPageHeader = Constants.FCG_DashboardOR.getProperty("ProfileManagementPageHeader");
            Assert.assertEquals("PASS", Constants.key.verifyText(vProfileManagementPageHeader, "Profile management"));
        } else if (page.equals("Delete Pop Up")) {
            LogCapture.info("User navigating to " + page + " page...");
            String vDeletePopUpTitle = Constants.FCG_NewRateAlertOR.getProperty("DeletePopUpTitle");
            Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vDeletePopUpTitle, ""));
            Assert.assertEquals("PASS", Constants.key.verifyText(vDeletePopUpTitle, "Do you want to delete this rate alert?"));
        }
    }

    @And("^User clicks on GBP currency under user wallets section$")
    public void userClicksOnGBPCurrencyUnderUserWalletsSection() throws Exception {
        LogCapture.info("User clicks on GBP currency under user wallets section...");
        String GBPCrDD = Constants.FCG_DashboardOR.getProperty("GBPCurrencySDD");
        Assert.assertEquals("PASS", Constants.key.click(GBPCrDD, ""));
    }

    @Then("^User should be able to view the Customer Bank details$")
    public void userShouldBeAbleToViewTheCustomerBankDetails() throws Exception {
        LogCapture.info("Validating Customer Bank details section...");
        LogCapture.info("Validating Bank Account Details Text....");
        Constants.key.pause("2", "");
        String vBankAccountDetailText = Constants.FCG_DashboardOR.getProperty("BankAccountDetailsText");
        Assert.assertEquals("PASS", Constants.key.verifyText(vBankAccountDetailText, "GBP bank account details"));

        LogCapture.info("Validating Account Name Text and Value.....");
        String vAccountNameText = Constants.FCG_DashboardOR.getProperty("AccountNameText");
        String vAccountNameValue = Constants.FCG_DashboardOR.getProperty("AccountNameValue");
        Assert.assertEquals("PASS", Constants.key.verifyText(vAccountNameText, "Account name"));
        Assert.assertEquals("PASS", Constants.key.exist(vAccountNameValue, ""));

        LogCapture.info("Validating Bank Name Text and Value.....");
        String vBankNameText = Constants.FCG_DashboardOR.getProperty("BankNameText");
        String vBankNameValue = Constants.FCG_DashboardOR.getProperty("BankNameValue");
        Assert.assertEquals("PASS", Constants.key.verifyText(vBankNameText, "Bank name"));
        Assert.assertEquals("PASS", Constants.key.exist(vBankNameValue, ""));

        LogCapture.info("Validating Sort Code Name Text and Value.....");
        String vSortCodeName = Constants.FCG_DashboardOR.getProperty("SortCodeName");
        String vSortCodeValue = Constants.FCG_DashboardOR.getProperty("SortCodeValue");
        Assert.assertEquals("PASS", Constants.key.verifyText(vSortCodeName, "Sort code"));
        Assert.assertEquals("PASS", Constants.key.exist(vSortCodeValue, ""));

        LogCapture.info("Validating AccountIBN Number Name Text and Value.....");
        String vAccountIbnNumberText = Constants.FCG_DashboardOR.getProperty("AccountIbnNumberText");
        String vAccountIbnNumberVal = Constants.FCG_DashboardOR.getProperty("AccountIbnNumberVal");
        Assert.assertEquals("PASS", Constants.key.verifyText(vAccountIbnNumberText, "Account/IBAN no."));
        Assert.assertEquals("PASS", Constants.key.exist(vAccountIbnNumberVal, ""));

        LogCapture.info("Validating IBAN Name Text and Value.....");
        String vIBANText = Constants.FCG_DashboardOR.getProperty("IBANText");
        String vIBANValue = Constants.FCG_DashboardOR.getProperty("IBANValue");
        Assert.assertEquals("PASS", Constants.key.verifyText(vIBANText, "IBAN"));
        Assert.assertEquals("PASS", Constants.key.exist(vIBANValue, ""));

        LogCapture.info("Validating SWIFT CODE Name Text and Value.....");
        String vSWIFTCodeText = Constants.FCG_DashboardOR.getProperty("SWIFTCodeText");
        String vSWIFTCodeValue = Constants.FCG_DashboardOR.getProperty("SWIFTCodeValue");
        Assert.assertEquals("PASS", Constants.key.verifyText(vSWIFTCodeText, "SWIFT code"));
        Assert.assertEquals("PASS", Constants.key.exist(vSWIFTCodeValue, ""));

        LogCapture.info("Validating Reference Name Text and Value.....");
        String vReferenceText = Constants.FCG_DashboardOR.getProperty("ReferenceText");
        String vReferenceValue = Constants.FCG_DashboardOR.getProperty("ReferenceValue");
        Assert.assertEquals("PASS", Constants.key.verifyText(vReferenceText, "Reference"));
        Assert.assertEquals("PASS", Constants.key.exist(vReferenceValue, ""));

    }

    @And("^User Clicks on Transfer Button in Your Recipient section$")
    public void userClicksOnTransferButtonInYourRecipientSection() throws Exception {
        LogCapture.info("User clicking on Transfer Button in Your Recipient section... ");
        String vYourRecipientTransfer = Constants.FCG_DashboardOR.getProperty("YourRecipientTransfer");
        Assert.assertEquals("PASS", Constants.key.click(vYourRecipientTransfer, ""));
        Constants.key.click("2", "");


    }

    @Then("^User is navigated back to the Login Page$")
    public void userIsNavigatedBackToTheLoginPage() throws Exception {
        String vLoginPageHeader = Constants.FCG_DashboardOR.getProperty("LoginPageHeader");
        Assert.assertEquals("PASS", Constants.key.verifyText(vLoginPageHeader, "Welcome to Foremost Currency Group"));


    }

    @When("^User enter UserName \"([^\"]*)\" incorrect password four times \"([^\"]*)\" and click login button$")
    public void user_enter_UserName_incorrect_password_five_times_and_click_login_button(String usernName, String inPassword) throws Throwable {
        LogCapture.info("Validating incorrect credentials.......");
        int attempts = 1;
        while (attempts < 5) {
            //  for(int i=0;i<5;i++) {
            System.out.println("Loop" + attempts);
            String vUserName = Constants.CONFIG.getProperty(usernName);
            String vObjUser = Constants.FCGloginPageOR.getProperty("FCG_Username");
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjUser, vUserName));

            String vObjPass = Constants.FCGloginPageOR.getProperty("FCG_Password");
            Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPass, inPassword));

            String vObjLoginButton = Constants.FCGloginPageOR.getProperty("LoginButton");
            Assert.assertEquals("PASS", Constants.key.click(vObjLoginButton, ""));
            LogCapture.info("Loop......");
            Constants.key.pause("5", "");
            attempts++;
        }
        LogCapture.info("Validating error message...");

  /*  String vExpected = "As you've entered incorrect login details multiple times, you'll need to reset your password to continue.";
    String vErrorObj = Constants.FCGloginPageOR.getProperty("FCG_ResetError");
    Constants.key.pause("2", "");
    Assert.assertEquals("PASS", Constants.key.verifyText(vErrorObj, vExpected));
*/
        String vCloseButton = Constants.FCGloginPageOR.getProperty("FCG_CloseButton");
        Assert.assertEquals("PASS", Constants.key.click(vCloseButton, ""));
        LogCapture.info("Logs......");


        String vUserName = Constants.CONFIG.getProperty(usernName);
        String vObjUser = Constants.FCGloginPageOR.getProperty("FCG_Username");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjUser, vUserName));

        String vObjPass = Constants.FCGloginPageOR.getProperty("FCG_Password");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPass, inPassword));

        String vObjLoginButton = Constants.FCGloginPageOR.getProperty("LoginButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjLoginButton, ""));
        LogCapture.info("Loop......");
    }

    @Then("^error message is displayed on Login page as account has been blocked$")
    public void error_message_is_displayed_on_Login_page_as_account_has_been_blocked() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        LogCapture.info("Validating error message...");
        String vExpected = "Your account has been locked due to multiple unsuccessful log in attempts";
        String vErrorObj = Constants.FCGloginPageOR.getProperty("FCG_LockedUser");
        LogCapture.info("Validating error message...");
        Assert.assertEquals("PASS", Constants.key.verifyText(vErrorObj, vExpected));

    }


    @And("^User Click on (Account details) tab$")
    public void userClickOnAccountDetailsTab(String tab) throws Exception {
        if (tab.equals("Account details")) {
            LogCapture.info("User clicking " + tab + " tab...");
            String vAccountDetailsTab = Constants.FCG_ProfileManagementOR.getProperty("AccountDetailsTab");
            Assert.assertEquals("PASS", Constants.key.click(vAccountDetailsTab, ""));
        }

    }


    @Then("^User should be able to view the message \"([^\"]*)\" with application phone number \"([^\"]*)\" in it$")
    public void userShouldBeAbleToViewTheMessageWithApplicationPhoneNumberInIt(String message, String phone) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //String vExpectedMessage = message + " " + phone+".";
        String message1 = "If you need to update your email address please give us a call";
        String message2 = "on ";
        String vExpectedMessage = message1 + "\n" + message2 + phone + ".";
        String vLoginDetailTextMsg1 = Constants.FCG_ProfileManagementOR.getProperty("LoginDetailTextMsg1");
        Assert.assertEquals("PASS", Constants.key.verifyInnerText(vLoginDetailTextMsg1, vExpectedMessage));
    }

    @Then("^User should be able to view the message with application phone number \"([^\"]*)\" in it and email address should be grayedout$")
    public void userShouldBeAbleToViewTheMessageWithApplicationPhoneNumberInItAndEmailAddressShouldBeGrayedout(String phone) throws Throwable {
        LogCapture.info("User verifying message with " + phone);
        String message1 = "If you need to update your email address please give us a call";
        String message2 = "on ";
        String vExpectedMessage = message1 + "\n" + message2 + phone + ".";
        String vLoginDetailTextMsg1 = Constants.FCG_ProfileManagementOR.getProperty("LoginDetailTextMsg1");
        Assert.assertEquals("PASS", Constants.key.verifyInnerText(vLoginDetailTextMsg1, vExpectedMessage));
        LogCapture.info("User verifying if email address is greyed out or not...");
        String vemailAddress = Constants.FCG_ProfileManagementOR.getProperty("emailAddress");
        Assert.assertEquals("PASS", Constants.key.verifyElementProperties(vemailAddress, "readonly"));
    }

    @Then("^User should not be able to view Switch to Joint button$")
    public void userShouldNotBeAbleToViewSwitchToJointButton() throws Exception {
        LogCapture.info("Checking Switch to join button non existence...");
        String vswitchToJoinAccount = Constants.FCG_ProfileManagementOR.getProperty("switchToJoinAccount");
        Assert.assertEquals("PASS", Constants.key.notexist(vswitchToJoinAccount, ""));
    }

    @And("^User Updates the answer for first Security Question first answer \"([^\"]*)\" second answer \"([^\"]*)\"$")
    public void userUpdatesTheAnswerForFirstSecurityQuestionFirstAnswerSecondAnswer(String firstAns, String secoundAns) throws Throwable {
        LogCapture.info("Updating Answers to First & Second question....");
        String vSecurityQue1Ans = Constants.FCG_ProfileManagementOR.getProperty("SecurityQue1Ans");
        String vSecurityQue2Ans = Constants.FCG_ProfileManagementOR.getProperty("SecurityQue2Ans");
        Assert.assertEquals("PASS", Constants.key.clearText(vSecurityQue1Ans));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vSecurityQue1Ans, firstAns));
        Assert.assertEquals("PASS", Constants.key.clearText(vSecurityQue2Ans));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vSecurityQue2Ans, secoundAns));
    }

    @When("^User re-enters password \"([^\"]*)\" and clicks on submit button$")
    public void userReEntersPasswordAndClicksOnSubmitButton(String password) throws Throwable {
        LogCapture.info("User re-enters password....");
        String vPassword = Constants.CONFIG.getProperty(password);
        String vPasswordTextBox = Constants.FCG_ProfileManagementOR.getProperty("PasswordTextBox");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vPasswordTextBox, vPassword));
        LogCapture.info("User clicking submit button....");
        String vVerifyPasswordButton = Constants.FCG_ProfileManagementOR.getProperty("VerifyPasswordButton");
        Assert.assertEquals("PASS", Constants.key.click(vVerifyPasswordButton, ""));
    }

    @Then("^User should get success message$")
    public void userShouldGetSuccessMessage() throws Exception {
        LogCapture.info("User Validating Success Message....");
        String vSuccessMessage = Constants.FCG_ProfileManagementOR.getProperty("SuccessMessage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vSuccessMessage, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vSuccessMessage, "Your changes have been saved."));
    }

    @And("^User Click on (Switch to joint|) hyper link$")
    public void userClickOnSwitchToJointHyperLink(String hyperlink) throws Exception {
        if (hyperlink.equals("Switch to joint")) {
            LogCapture.info("User clicking to " + hyperlink + " hyperlink...");
            String vswitchToJoinAccount = Constants.FCG_ProfileManagementOR.getProperty("switchToJoinAccount");
            Assert.assertEquals("PASS", Constants.key.click(vswitchToJoinAccount, ""));
        }

    }

    @Then("^User should navigate to  Invite someone to a joint account Window$")
    public void userShouldNavigateToInviteSomeoneToAJointAccountWindow() throws Exception {
        LogCapture.info("User verifying --Invite someone to a joint account Window-- header..");
        String vMessageInviteFormText = Constants.FCG_ProfileManagementOR.getProperty("MessageInviteFormText");
        Assert.assertEquals("PASS", Constants.key.verifyText(vMessageInviteFormText, "Invite someone to a joint account"));
    }

    @And("^User enters the first name \"([^\"]*)\" last name \"([^\"]*)\" mobile number \"([^\"]*)\" \"([^\"]*)\" dateofbirth Day\"([^\"]*)\" Month\"([^\"]*)\" year\"([^\"]*)\" emailAddress\"([^\"]*)\"$")
    public void userEntersTheFirstNameLastNameMobileNumberDateofbirthDayMonthYearEmailAddress(String fname, String lname, String countryCode, String mobileNo, String day, String month, String year, String secondaryEmailAddress) throws Throwable {
        LogCapture.info("User entering first name....");
        String vFN = Constants.FCG_ProfileManagementOR.getProperty("FN");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vFN, fname));
        LogCapture.info("User entering last name....");
        String vLN = Constants.FCG_ProfileManagementOR.getProperty("LN");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vLN, lname));

        LogCapture.info("User entering country code.....");
        String vCountryDD = Constants.FCG_ProfileManagementOR.getProperty("CountryDD");
        Assert.assertEquals("PASS", Constants.key.click(vCountryDD, ""));
        String vCountrySearchText = Constants.FCG_ProfileManagementOR.getProperty("CountrySearchText");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vCountrySearchText, countryCode));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountrySearchText, "enter"));

        LogCapture.info("User entering mobile number.....");
        String vNumber = Constants.FCG_ProfileManagementOR.getProperty("Number");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vNumber, mobileNo));

        LogCapture.info("User entering Day .....");
        String vDayDropDown = Constants.FCG_ProfileManagementOR.getProperty("DayDropDown");
        Assert.assertEquals("PASS", Constants.key.click(vDayDropDown, ""));
        String vcommonSearchTextBx = Constants.FCG_ProfileManagementOR.getProperty("commonSearchTextBx");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vcommonSearchTextBx, day));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vcommonSearchTextBx, "enter"));

        LogCapture.info("User entering Month .....");
        String vMonthDropDown = Constants.FCG_ProfileManagementOR.getProperty("MonthDropDown");
        Assert.assertEquals("PASS", Constants.key.click(vMonthDropDown, ""));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vcommonSearchTextBx, month));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vcommonSearchTextBx, "enter"));

        LogCapture.info("User entering Year .....");
        String vYearDropDown = Constants.FCG_ProfileManagementOR.getProperty("YearDropDown");
        Assert.assertEquals("PASS", Constants.key.click(vYearDropDown, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vcommonSearchTextBx, year));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vcommonSearchTextBx, "enter"));

        LogCapture.info("User entering email Address....");
        String vEmailAddressTextBox = Constants.FCG_ProfileManagementOR.getProperty("EmailAddressTextBox");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vEmailAddressTextBox, secondaryEmailAddress));


    }

    @And("^User ticks the Checkbox to use same address details of primary contact$")
    public void userTicksTheCheckboxToUseSameAddressDetailsOfPrimaryContact() throws Exception {
        LogCapture.info("User ticks the Checkbox to use same address details of primary contact..");
        String vContactDetailsCheckBox = Constants.FCG_ProfileManagementOR.getProperty("ContactDetailsCheckBox");
        Assert.assertEquals("PASS", Constants.key.click(vContactDetailsCheckBox, ""));


    }

    @And("^User click on save button$")
    public void userClickOnSaveButton() throws Exception {
        LogCapture.info("User Clicks on save button...");
        String vSendInviteSendButton = Constants.FCG_ProfileManagementOR.getProperty("SendInviteSendButton");
        String vVerifyPasswordButton = Constants.FCG_ProfileManagementOR.getProperty("VerifyPasswordButton");
        Assert.assertEquals("PASS", Constants.key.click(vSendInviteSendButton, ""));

        /*Assert.assertEquals("PASS", Constants.key.pause("3", ""));
        String vProfileManagementIDpasswordTextBox = Constants.FCG_ProfileManagementOR.getProperty("ProfileManagementIDpasswordTextBox");

        Assert.assertEquals("PASS", Constants.key.writeInInput(vProfileManagementIDpasswordTextBox, ""));
        Assert.assertEquals("PASS", Constants.key.click(vVerifyPasswordButton, ""));*/
    }

    @Then("^User should get invite success message$")
    public void userShouldGetInviteSuccessMessage() throws Exception {
        LogCapture.info("User Validating Success Message....");
        String vInviteSuccessMessage = Constants.FCG_ProfileManagementOR.getProperty("InviteSuccessMessage");
        Assert.assertEquals("PASS", Constants.key.VisibleConditionWait(vInviteSuccessMessage, ""));
        Assert.assertEquals("PASS", Constants.key.verifyText(vInviteSuccessMessage, "Thanks, your invite has been sent."));
    }

    @And("^User click on save button on invite page$")
    public void userClickOnSaveButtonOnInvitePage() throws Exception {
        LogCapture.info("User clicks on save button on invite page...");
        String vSendInviteSendButton = Constants.FCG_ProfileManagementOR.getProperty("SendInviteSendButton");
        Assert.assertEquals("PASS", Constants.key.click(vSendInviteSendButton, ""));


    }

    @And("^User enters the first name \"([^\"]*)\" last name \"([^\"]*)\" mobile number \"([^\"]*)\" \"([^\"]*)\" dateofbirth Day\"([^\"]*)\" Month\"([^\"]*)\" year\"([^\"]*)\" emailAddress\"$")
    public void userEntersTheFirstNameLastNameMobileNumberDateofbirthDayMonthYearEmailAddress(String fname, String lname, String countryCode, String mobileNo, String day, String month, String year) throws Throwable {

        LogCapture.info("User entering first name....");
        String vFN = Constants.FCG_ProfileManagementOR.getProperty("FN");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vFN, fname));
        LogCapture.info("User entering last name....");
        String vLN = Constants.FCG_ProfileManagementOR.getProperty("LN");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vLN, lname));

        LogCapture.info("User entering country code.....");
        String vCountryDD = Constants.FCG_ProfileManagementOR.getProperty("CountryDD");
        Assert.assertEquals("PASS", Constants.key.click(vCountryDD, ""));
        String vCountrySearchText = Constants.FCG_ProfileManagementOR.getProperty("CountrySearchText");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vCountrySearchText, countryCode));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vCountrySearchText, "enter"));

        LogCapture.info("User entering mobile number.....");
        String vNumber = Constants.FCG_ProfileManagementOR.getProperty("Number");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vNumber, mobileNo));

        LogCapture.info("User entering Day .....");
        String vDayDropDown = Constants.FCG_ProfileManagementOR.getProperty("DayDropDown");
        Assert.assertEquals("PASS", Constants.key.click(vDayDropDown, ""));
        String vcommonSearchTextBx = Constants.FCG_ProfileManagementOR.getProperty("commonSearchTextBx");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vcommonSearchTextBx, day));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vcommonSearchTextBx, "enter"));

        LogCapture.info("User entering Month .....");
        String vMonthDropDown = Constants.FCG_ProfileManagementOR.getProperty("MonthDropDown");
        Assert.assertEquals("PASS", Constants.key.click(vMonthDropDown, ""));
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vcommonSearchTextBx, month));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vcommonSearchTextBx, "enter"));

        LogCapture.info("User entering Year .....");
        String vYearDropDown = Constants.FCG_ProfileManagementOR.getProperty("YearDropDown");
        Assert.assertEquals("PASS", Constants.key.click(vYearDropDown, ""));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vcommonSearchTextBx, year));
        Assert.assertEquals("PASS", Constants.key.KeyboardAction(vcommonSearchTextBx, "enter"));

        LogCapture.info("User entering email Address....");
        String vEmailAddressTextBox = Constants.FCG_ProfileManagementOR.getProperty("EmailAddressTextBox");
        Assert.assertEquals("PASS", Constants.key.UniqueEmail_ID(vEmailAddressTextBox, ""));


    }

    @And("^User Clicks (edit|deleteX|Confirm) Button on Rate Alert Page$")
    public void userClicksEditButtonOnRateAlertPage(String button) throws Exception {
        if (button.equals("edit")) {
            LogCapture.info("User clicking " + button + " button...");
            String vEditRateAlert = Constants.FCG_NewRateAlertOR.getProperty("EditRateAlert");
            Assert.assertEquals("PASS", Constants.key.click(vEditRateAlert, ""));
        } else if (button.equals("deleteX")) {
            LogCapture.info("User clicking " + button + " button...");
            String vDeleteRateAlert = Constants.FCG_NewRateAlertOR.getProperty("DeleteRateAlert");
            Assert.assertEquals("PASS", Constants.key.click(vDeleteRateAlert, ""));
        } else if (button.equals("Confirm")) {
            LogCapture.info("User clicking " + button + " button...");
            String vDeleteConfirm = Constants.FCG_NewRateAlertOR.getProperty("DeleteConfirm");
            Assert.assertEquals("PASS", Constants.key.click(vDeleteConfirm, ""));
        }

    }

    @And("^User updates the amount \"([^\"]*)\" and click on update amounts button$")
    public void userUpdatesTheAmountAndClickOnUpdateAmountsButton(String updateBuyAmount) throws Throwable {
        LogCapture.info("Entering the update amount to buy .....");
        Constants.key.pause("10", "");
        String vBuyInputObject = Constants.FCG_NewRateAlertOR.getProperty("BuyInputText");
        Assert.assertEquals("PASS", Constants.key.click(vBuyInputObject, ""));
        Constants.key.pause("5", "");
        Assert.assertEquals("PASS",Constants.key.KeyboardAction(vBuyInputObject,"selectall"));
        Constants.key.pause("3", "");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vBuyInputObject, updateBuyAmount));
        Constants.key.pause("3", "");
        String vUpdateAmounts = Constants.FCG_NewRateAlertOR.getProperty("UpdateAmounts");
        Assert.assertEquals("PASS", Constants.key.click(vUpdateAmounts, ""));

    }

    @When("^User Clicks on Update Button$")
    public void userClicksOnUpdateButton() throws Exception {
        LogCapture.info("User clicking on update button .....");
        String vUpdateButton = Constants.FCG_NewRateAlertOR.getProperty("UpdateButton");
        Assert.assertEquals("PASS", Constants.key.click(vUpdateButton, ""));
    }
    @And("^Clicks on SignUp Button$")
    public void clicks_on_SignUp_Button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        LogCapture.info("Portal is loading....");
        String vObjSignUpButton = Constants.FCGloginPageOR.getProperty("FCG_SignUp_Button");
        Assert.assertEquals("PASS", Constants.key.click(vObjSignUpButton, ""));
    }
    @And("^User Selects personal option and Click on Next$")
    public void user_Selects_personal_option_and_Click_on_Next() throws Throwable {
        LogCapture.info("Registration in Processs....");
        Constants.key.pause("2", "");
        String vPersonalRadioButton = Constants.FCGSignUp.getProperty("PersonalRadioButton");
        Assert.assertEquals("PASS", Constants.key.click(vPersonalRadioButton, ""));
        String vNext_Button = Constants.FCGSignUp.getProperty("Next_Button");
        Assert.assertEquals("PASS", Constants.key.click(vNext_Button, ""));
    }
    @When("^User enter UserName \"([^\"]*)\" and password of other organization user \"([^\"]*)\" and Next button$")
    public void user_enter_UserName_and_password_of_other_organization_user_and_Next_button(String userName, String password) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        String vUserName = Constants.CONFIG.getProperty(userName);
        String vPassword = Constants.CONFIG.getProperty(password);
        String vObjSignUp_EmailID = Constants.FCGSignUp.getProperty("SignUp_EmailID");
        String vObjSignUp_Password = Constants.FCGSignUp.getProperty("SignUp_Password");
        LogCapture.info("User Name " + vUserName + ", Password " + password + " is validated ....");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjSignUp_EmailID, vUserName));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjSignUp_Password, vPassword));
        String vVerify_Button = Constants.FCGSignUp.getProperty("Verify_Button");
        Assert.assertEquals("PASS", Constants.key.click(vVerify_Button, ""));
        LogCapture.info("Registration in Processs....");
    }
    @Then("^User enter second contact UserName \"([^\"]*)\" and password of other organization user \"([^\"]*)\" and Next login button$")
    public void user_enter_second_contact_UserName_and_password_of_other_organization_user_and_Next_login_button(String userName, String password) throws Throwable {
        String vUserName = Constants.CONFIG.getProperty(userName);
        String vPassword = Constants.CONFIG.getProperty(password);
        String vObjSignUp_EmailID = Constants.FCGSignUp.getProperty("SignUp_EmailID");
        String vObjSignUp_Password = Constants.FCGSignUp.getProperty("SignUp_Password");
        LogCapture.info("User Name " + vUserName + ", Password " + password + " is validated ....");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjSignUp_EmailID, vUserName));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjSignUp_Password, vPassword));
        String vVerify_Button = Constants.FCGSignUp.getProperty("Verify_Button");
        Assert.assertEquals("PASS", Constants.key.click(vVerify_Button, ""));
        LogCapture.info("Registration in Processs....");
    }
    @Then("^User Should see (TMO error|TORFX error|RAMSDEN error|TORFXOZ error) message as you have been Already registered\\.$")
    public void user_Should_see_tmo_error_message_as_you_have_been_Already_registerted (String error) throws Throwable {
        // Write code here that turns the phrase above into concrete actionse
        if(error.equals("TMO error")){
            LogCapture.info(" In Processs....");
            Constants.key.pause("2", "");
            String vDetailsPage = Constants.FCGloginPageOR.getProperty("TMO_Error_Message_for_Whitelebel");
            Assert.assertEquals("PASS", Constants.key.verifyText(vDetailsPage, "Thanks. As you're already registered with the TorFX currency transfer service, we're just redirecting you there"));
        } else if(error.equals("TORFX error")){
            LogCapture.info(" In Processs....");
            Constants.key.pause("2", "");
            String vDetailsPage = Constants.FCGloginPageOR.getProperty("Ramsden_Error_Message");
            Assert.assertEquals("PASS", Constants.key.verifyText(vDetailsPage, "Thanks. As you're already registered with the Ramsdens currency transfer service, we're just redirecting you there"));
        }else if(error.equals("RAMSDEN error")){
            LogCapture.info(" In Processs....");
            Constants.key.pause("2", "");
            String vDetailsPage = Constants.FCGloginPageOR.getProperty("TorFXError_Message");
            Assert.assertEquals("PASS", Constants.key.verifyText(vDetailsPage, "Thanks. As you're already registered with the TorFx currency transfer service, we're just redirecting you there"));
        }
        else if(error.equals("TORFXOZ error")){
            // Write code here that turns the phrase above into concrete actions
            LogCapture.info(" In Processs....");
            Constants.key.pause("2", "");
            String vDetailsPage = Constants.FCGloginPageOR.getProperty("TorFXOzError_Message");
            Assert.assertEquals("PASS", Constants.key.verifyText(vDetailsPage, "Thanks. As you're already registered with the TravelMoneyOz currency transfer service, we're just redirecting you there"));
        }else
            LogCapture.info("No Error Found");
    }
    @Then("^User Clicks on Close popup button$")
    public void user_Clicks_on_Close_popup_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // Write code here that turns the phrase above into concrete actions
        LogCapture.info("Close the PopUp...................");
        String vObjPayeeButton = Constants.FCGloginPageOR.getProperty("TMO_Close");
        Assert.assertEquals("PASS", Constants.key.click(vObjPayeeButton, ""));
    }

}

