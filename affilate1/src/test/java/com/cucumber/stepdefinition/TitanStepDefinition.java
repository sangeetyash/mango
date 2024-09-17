package com.cucumber.stepdefinition;

import com.selenium.utillity.Constants;

import com.utility.LogCapture;
/*import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;*/
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.selenium.utillity.Constants;
//import com.utilities.Log;
import com.utility.LogCapture;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.testng.Assert;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;


public class TitanStepDefinition {

    /*@Given("^User launched application through \"(.*?)\"$")
    public void user_launched_application_through(String data) throws Throwable {
        LogCapture.info(data+" Application is launching....");
        Assert.assertTrue(Constants.key.openBrowser("", data));

    }*/

    @Given("^User navigate to Titan Application \"(.*?)\"$")
    public void user_navigate_to_Titan_Application(String vUrl) throws Throwable {
        LogCapture.info("Titan Applicatiion is loading....");
        String url = Constants.CONFIG.getProperty(vUrl);
        Assert.assertEquals("PASS", Constants.key.navigate("", url));
    }

    @When("^User enter UserName \"(.*?)\" password \"(.*?)\" and click log In button$")
    public void user_enter_UserName_password_and_click_log_In_button(String userName, String password) throws Throwable {
        String vUserName = Constants.CONFIG.getProperty(userName);
        String vPassword = Constants.CONFIG.getProperty(password);
        String vObjUser = Constants.TitanLoginOR.getProperty("Titan_Username");
        String vObjPass = Constants.TitanLoginOR.getProperty("Titan_Password");
        LogCapture.info( "User Name " + vUserName + ", Password "+ password + " is validated ....");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjUser, vUserName));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPass, vPassword));
        String vObjLoginButton = Constants.TitanLoginOR.getProperty("LogInButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjLoginButton, ""));
    }

    @When("^User enter UserName \"(.*?)\" Incorrect password \"(.*?)\" and click log In button$")
    public void user_enter_UserName_Incorrect_password_and_click_log_In_button(String usernName, String inPassword) throws Throwable {
        LogCapture.info("Validating incorrect credentials.......");
        String vUserName = Constants.CONFIG.getProperty(usernName);
        String vObjUser = Constants.TitanLoginOR.getProperty("Titan_Username");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjUser, vUserName));
        String vObjPass = Constants.TitanLoginOR.getProperty("Titan_Password");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPass, inPassword));
        String vObjLoginButton = Constants.TitanLoginOR.getProperty("LogInButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjLoginButton, ""));
    }

    @Then("^User successfully landed on Titan Dashboard page$")
    public void user_successfully_landed_on_Titan_Dashboard_page() throws Throwable {
        LogCapture.info("Dashboard loading ......");
        Constants.key.pause("2", "");
        String vobjectDashboard = Constants.TitanLoginOR.getProperty("DashboardPage");
        Assert.assertEquals("PASS", Constants.key.verifyText(vobjectDashboard, "Dashboard"));
        LogCapture.info("Dashboard loaded successfully");
    }

    @Then("^User clicks on Logout button and successfully logout from application$")
    public void user_clicks_on_Logout_button_and_successfully_logout_from_application() throws Throwable {
        String vObjLogOutLink = Constants.TitanLoginOR.getProperty("LogOutLink");
        Assert.assertEquals("PASS", Constants.key.click(vObjLogOutLink, ""));

    }

    @Then("^User should get error and should not be able to login in to Titan$")
    public void user_should_get_error_and_should_not_be_able_to_login_in_to_Titan() throws Throwable {
        String vObjInvalidLoginError = Constants.TitanLoginOR.getProperty("InvalidLoginError");
        LogCapture.info("Validating error message...");
        Assert.assertEquals("PASS", Constants.key.verifyText(vObjInvalidLoginError,"Invalid username or password."));
    }

    @Then("^User clicks on Customers option under Titan$")
    public void user_clicks_on_Customers_option_under_Titan() throws Throwable {
        String vObjTitanMenu = Constants.CreateFxTicketOR.getProperty("TitanMenu");
        Assert.assertEquals("PASS", Constants.key.click(vObjTitanMenu, ""));
        String vObjCustomers = Constants.CreateFxTicketOR.getProperty("Customers");
        LogCapture.info("Opening Customer detail page");
        Assert.assertEquals("PASS",Constants.key.click(vObjCustomers, ""));
    }

    @Then("^User clicks on Filter option$")
    public void user_clicks_on_Filter_option() throws Throwable {
        String vObjFilter = Constants.CreateFxTicketOR.getProperty("Filter");
        LogCapture.info("Opening Filter section");
        Constants.key.pause("2","");
        Assert.assertEquals("PASS", Constants.key.click(vObjFilter, ""));
        Constants.key.pause("2","");

    }

    @Then("^User enters client number \"(.*?)\" and hits Enter key$")
    public void user_enters_client_number_and_hits_Enter_key(String clientNumber) throws Throwable {
        String vOjbKeyword = Constants.CreateFxTicketOR.getProperty("Keyword");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vOjbKeyword,clientNumber));
        LogCapture.info("Searching for Client number" + clientNumber);
        Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke("","enter"));
        Constants.key.pause("4","");
        }

    @Then("^User clicks on client number link to navigate to customer detail page$")
    public void user_clicks_on_client_number_link_to_navigate_to_customer_detail_page() throws Throwable {
        String vObjClientDetailLink = Constants.CreateFxTicketOR.getProperty("ClientDetailLink");
        Assert.assertEquals("PASS", Constants.key.click(vObjClientDetailLink, ""));
        Constants.key.pause("2","");

    }

    @And("^User clicks on FX button$")
    public void user_clicks_on_fx_button() throws Throwable {
        String vObjFxbutton = Constants.CreateFxTicketOR.getProperty("Fxbutton");
        Assert.assertEquals("PASS", Constants.key.click(vObjFxbutton, ""));

    }

    @Then("^User selects Instructed by \"(.*?)\" Deal type SPOT purpose of payment \"(.*?)\" and clicks Next$")
    public void user_selects_Instructed_by_Deal_type_spot_purpose_of_payment_and_clicks_Next(String instructedBy, String purposeOfPayment) throws Throwable {
        String vObjInstructedBy = Constants.CreateFxTicketOR.getProperty("InstructedBy");
        //Assert.assertEquals("PASS", Constants.key.click(vObjInstructedBy, ""));

        String vObjInstructedBySearch = Constants.CreateFxTicketOR.getProperty("InstructedBySearch");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjInstructedBySearch, instructedBy));
        Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke(vObjInstructedBySearch,"down"));
        Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke("","enter"));

        String vObjDealType = Constants.CreateFxTicketOR.getProperty("DealType");
        Assert.assertEquals("PASS", Constants.key.click(vObjDealType, ""));

        String vObjPurposeOfPayment = Constants.CreateFxTicketOR.getProperty("PurposeOfPayment");
        Assert.assertEquals("PASS", Constants.key.click(vObjPurposeOfPayment, ""));

        String vObjPurposeOfPaymentSearch = Constants.CreateFxTicketOR.getProperty("PurposeOfPaymentSearch");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPurposeOfPaymentSearch, purposeOfPayment));
        Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke(vObjPurposeOfPaymentSearch,"down"));
        Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke("","enter"));

        String vObjNext1Button = Constants.CreateFxTicketOR.getProperty("Next1Button");
        Assert.assertEquals("PASS", Constants.key.click(vObjNext1Button, ""));

    }

    @Then("^User selects Selling Currency \"(.*?)\" Buying currency \"(.*?)\" Selling amount \"(.*?)\"and clicks on Fetch rates button$")
    public void user_selects_Selling_Currency_Buying_currency_Selling_amount_and_clicks_on_Fetch_rates_button(String selling, String buying, String sellingAmount) throws Throwable {
        String vObjSellingCurrency = Constants.CreateFxTicketOR.getProperty("SellingCurrency");
        //Assert.assertEquals("PASS", Constants.key.click(vObjSellingCurrency, ""));

        Constants.key.pause("2","");
        String vObjSellingCurrencySearch = Constants.CreateFxTicketOR.getProperty("SellingCurrencySearch");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjSellingCurrencySearch, selling));
        Constants.key.pause("2","");
        Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke(vObjSellingCurrencySearch,"down"));
        Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke("","enter"));

        String vObjBuyingCurrency = Constants.CreateFxTicketOR.getProperty("BuyingCurrency");
        Assert.assertEquals("PASS", Constants.key.click(vObjBuyingCurrency, ""));

        String vObjBuyingCurrencySearch = Constants.CreateFxTicketOR.getProperty("BuyingCurrencySearch");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjBuyingCurrencySearch, buying));
        Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke(vObjBuyingCurrencySearch,"down"));
        Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke("","enter"));

        String vObjSellingAmount = Constants.CreateFxTicketOR.getProperty("SellingAmount");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjSellingAmount, sellingAmount));

        String vObjFetchRates = Constants.CreateFxTicketOR.getProperty("FetchRates");
        Assert.assertEquals("PASS", Constants.key.click(vObjFetchRates, ""));
        Constants.key.pause("4","");

    }

    @Then("^User clicks on Next button$")
    public void user_clicks_on_Next_button() throws Throwable {
        String vObjNext2Button = Constants.CreateFxTicketOR.getProperty("Next2Button");
        Assert.assertEquals("PASS", Constants.key.click(vObjNext2Button, ""));
        Constants.key.pause("4","");

    }

    @Then("^User selects method Bank$")
    public void user_selects_method_bank() throws Throwable {
        String vObjPaymentMethodBank = Constants.CreateFxTicketOR.getProperty("PaymentMethodBank");
        Assert.assertEquals("PASS", Constants.key.click(vObjPaymentMethodBank, ""));
    }

    @Then("^User clicks on Add Credit button$")
    public void user_clicks_on_add_credit_button () throws Throwable {
        String vObjAddCreditButton = Constants.CreateFxTicketOR.getProperty("AddCreditButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjAddCreditButton, ""));
        Constants.key.pause("4","");

    }

    @Then("^User clicks on Skip button$")
    public void user_clicks_on_Skip_button() throws Throwable {
        String vObjSkipButton = Constants.CreateFxTicketOR.getProperty("SkipButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjSkipButton, ""));
        Constants.key.pause("2","");

    }

    @Then("^User clicks on Yes button for popup$")
    public void user_clicks_on_Yes_button_for_popup() throws Throwable {
        String vObjYesSkipButton = Constants.CreateFxTicketOR.getProperty("YesSkipButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjYesSkipButton, ""));
        Constants.key.pause("2","");
    }

    @Then("^user clicks on Submit button$")
    public void user_clicks_on_Submit_button() throws Throwable {
        String vObjSubmitButton = Constants.CreateFxTicketOR.getProperty("SubmitButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjSubmitButton,""));
        Constants.key.pause("10","");
    }

    @Then("^User successfully creates FX ticket and clicks on Close Slip button$")
    public void user_successfully_creates_fc_ticket_and_clicks_on_Close_Slip_button() throws Throwable {
        String vObjCloseFxSlipButton = Constants.CreateFxTicketOR.getProperty("CloseFxSlipButton");
       // Constants.key.pause("2","");

        Assert.assertEquals("PASS",Constants.key.VisibleConditionWait(vObjCloseFxSlipButton,""));
        Assert.assertEquals("PASS", Constants.key.click(vObjCloseFxSlipButton, ""));
        Constants.key.pause("2","");
    }

    @Then("^User clicks on customer number link to navigate to customer detail page$")
    public void user_clicks_on_customer_number_link_to_navigate_to_customer_detail_page() throws Throwable {
        Constants.key.pause("2","");
        String vObjCustomerDetailLink = Constants.CreateFxTicketOR.getProperty("CustomerDetailLink");
        Assert.assertEquals("PASS", Constants.key.click(vObjCustomerDetailLink, ""));
        Constants.key.pause("2","");

    }

    @Then("^User selects method Card selects card \"(.*?)\" enters CVV \"(.*?)\"$")
    public void user_selects_method_Card_selects_card_enters_CVV(String selectCard, String cvv) throws Throwable {
        String vObjPaymentMethodCard = Constants.CreateFxTicketOR.getProperty("PaymentMethodCard");
        Assert.assertEquals("PASS", Constants.key.click(vObjPaymentMethodCard, ""));

        String vObjSelectCard = Constants.CreateFxTicketOR.getProperty("SelectCard");
        Assert.assertEquals("PASS", Constants.key.click(vObjSelectCard, ""));

        String vObjSelectCardSearch = Constants.CreateFxTicketOR.getProperty("SelectCardSearch");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjSelectCardSearch, selectCard));
        Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke(vObjSelectCardSearch,"down"));
        Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke("","enter"));

        String vObjCardCvv = Constants.CreateFxTicketOR.getProperty("CardCvv");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjCardCvv, cvv));

    }


    @Then("^User clicks on client number\"([^\"]*)\" link to navigate to customer detail page$")
    public void userClicksOnClientNumberLinkToNavigateToCustomerDetailPage(String clientNumber) throws Throwable {
        Constants.key.pause("2","");
        String vclientNumberXpath = "//*[contains(text(),'" + clientNumber + "')]";
        //String vObjCustomerDetailLink = Constants.CreateFxTicketOR.getProperty("CustomerDetailLink");
        Assert.assertEquals("PASS", Constants.key.click(vclientNumberXpath, ""));
        Constants.key.pause("2","");
    }


}
