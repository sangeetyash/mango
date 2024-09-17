package com.cucumber.stepdefinition;

import com.selenium.utillity.Constants;
//import com.utilities.Log;
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
import org.testng.Assert;

/*import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.testng.Assert;*/

public class AltasStepDefination {
    @And("^User navigate to (Atlas|Saleforce) Application \"([^\"]*)\"$")
    public void userNavigateToAtlasApplication(String page, String vUrl) throws Exception {
        if (page.equals("Atlas")) {
            LogCapture.info("Atlas Portal is loading....");
            String url = Constants.CONFIG.getProperty(vUrl);
            Assert.assertEquals("PASS", Constants.key.navigate("", url));
        } else if (page.equals("Salesforce")) {
            //Line of code
        }
    }

        /*else if(page.equals("Titan")){
            LogCapture.info("Titan Applicatiion is loading....");
            String url = Constants.CONFIG.getProperty(vUrl);
            Assert.assertEquals("PASS", Constants.key.navigate("", url));

        }*/


    @When("^User enter UserName \"([^\"]*)\" password \"([^\"]*)\" and click log In button on Altas Application$")
    public void userEnterUserNamePasswordAndClickLogInButtonOnAltasApplication(String userName, String password) throws Exception {
        String vUserName = Constants.CONFIG.getProperty(userName);
        String vPassword = Constants.CONFIG.getProperty(password);
        String vObjUser = Constants.AtlasloginOR.getProperty("Atlas_Username");
        String vObjPass = Constants.AtlasloginOR.getProperty("Atlas_Password");
        LogCapture.info( "User Name " + vUserName + ", Password "+ password + " is validated ....");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjUser, vUserName));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPass, vPassword));
        String vObjLoginButton = Constants.AtlasloginOR.getProperty("Atlas_LoginButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjLoginButton, ""));
}

    @Then("^User successfully landed on Atlas Dashboard page$")
    public void userSuccessfullyLandedOnAtlasDashboardPage() throws Exception {
        LogCapture.info("Dashboard loading ......");
        Constants.key.pause("2", "");
        String vobjectDashboard = Constants.AtlasDashboardOR.getProperty("Atlas_Dashboard");
        Assert.assertEquals("PASS", Constants.key.verifyText(vobjectDashboard, "ATLAS"));
    }

    @Given("^User launched application through \"([^\"]*)\" browser$")
    public void userLaunchedApplicationThroughBrowser(String data) throws Throwable {
        LogCapture.info(data+" Application is launching....");
        //Assert.assertTrue(Constants.key.openBrowser("", data));
        Assert.assertTrue(Constants.key.openBrowser("", data));
    }

    @And("^User navigates to  Payment_In Report from Dashboard$")
    public void userNavigatesToPayment_InReportFromDashboard() throws Exception {
        LogCapture.info("User is selecting Payment In hyperlink from dashboard..");
        String vtabView =Constants.AtlasDashboardOR.getProperty("Atlas_SelectTabView");
        String vPaymentinTab=Constants.AtlasDashboardOR.getProperty("Atlas_PaymentInTab");
        Assert.assertEquals("PASS", Constants.key.pause("2", ""));
        Assert.assertEquals("PASS", Constants.key.click(vtabView, ""));
        Assert.assertEquals("PASS", Constants.key.pause("2", ""));
        Assert.assertEquals("PASS", Constants.key.click(vPaymentinTab,""));
    }

    @When("^User click on filter criteria$")
    public void userClickOnFilterCriteria() throws Exception {
        String vFilterButton=Constants.AtlasPaymentInQueueOR.getProperty("Atlas_selectFirstRecordAtlas_filter");
        Assert.assertEquals("PASS", Constants.key.pause("2", ""));
        Assert.assertEquals("PASS", Constants.key.click(vFilterButton,""));
    }

    @And("^User enters valid customer number\"([^\"]*)\" in keyword section$")
    public void userEntersValidCustomerNumberInKeywordSection(String vCustomerCareNo) throws Throwable {
        String vKeyword=Constants.AtlasPaymentInQueueOR.getProperty("Atlas_enterSearchCriteriaKeyword");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vKeyword,vCustomerCareNo));

    }

    @And("^User Click on  a record for which Payment  is in HOLD status to navigate to details page$")
    public void userClickOnARecordForWhichPaymentIsInHOLDStatusToNavigateToDetailsPage() throws Exception {
        String vclickFirst = Constants.AtlasPaymentInQueueOR.getProperty("Atlas_selectFirstRecord");
        Assert.assertEquals("PASS", Constants.key.pause("2", ""));
        Assert.assertEquals("PASS", Constants.key.click(vclickFirst,""));
    }

    @Then("^User Lock the Record$")
    public void userLockTheRecord() throws Exception {
        String vLockObj = Constants.AtlasPaymentInQueueOR.getProperty("Atlas_LockToggle");
        Assert.assertEquals("PASS", Constants.key.click(vLockObj,""));
    }

    @And("^Mark the Payment In Status as CLEAR with comments$")
    public void markThePaymentInStatusAsCLEARWithComments() throws Exception {
        String vClearButton = Constants.AtlasPaymentInQueueOR.getProperty("Atlas_UpdateStatusClear");
        String vTextInput = Constants.AtlasPaymentInQueueOR.getProperty("Atlas_CommentsTextInput");
        Assert.assertEquals("PASS", Constants.key.click(vClearButton,""));
        Constants.key.pause("1","");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vTextInput,"Payment In Test flow for clear-POC2"));

    }

    @When("^User Click on Apply/Apply & Unlock$")
    public void userClickOnApplyApplyUnlock() throws Exception {
        String vApplyButton = Constants.AtlasPaymentInQueueOR.getProperty("Atlas_ApplyButton");
        Assert.assertEquals("PASS", Constants.key.click(vApplyButton,""));
    }

    @Then("^Payment In Status to be Observed as CLEAR wth success message$")
    public void paymentInStatusToBeObservedAsCLEARWthSuccessMessage() throws Exception {
        String vPaymentCompStatus = Constants.AtlasPaymentInQueueOR.getProperty("Atlas_paymentComplianceStatus");
        String vSuccessMessage = Constants.AtlasPaymentInQueueOR.getProperty("Atlas_ComplianceStatusSuccessMessage");
        Constants.key.pause("2","");
        Assert.assertEquals("PASS", Constants.key.verifyText(vPaymentCompStatus,"CLEAR"));
        Assert.assertEquals("PASS", Constants.key.verifyText(vSuccessMessage,"Updated successfully"));
    }

    @And("^User navigates to  Payment_Out Report from Dashboard$")
    public void userNavigatesToPayment_OutReportFromDashboard() throws Exception {
        LogCapture.info("User is selecting Payment Out hyperlink from dashboard..");
        String vtabView =Constants.AtlasDashboardOR.getProperty("Atlas_SelectTabView");
        String vPaymentOutTab=Constants.AtlasDashboardOR.getProperty("Atlas_PaymentOutTab");
        Assert.assertEquals("PASS", Constants.key.pause("2", ""));
        Assert.assertEquals("PASS", Constants.key.click(vtabView, ""));
        Assert.assertEquals("PASS", Constants.key.pause("2", ""));
        Assert.assertEquals("PASS", Constants.key.click(vPaymentOutTab,""));
    }

    @And("^User select the SANCTION STATUS as PASS$")
    public void userSelectTheSANCTIONSTATUSAsPASS() throws Exception {
        LogCapture.info("Selecting Santion as PASS....");
        String vSanctionStatusPass =Constants.AtlasPaymentOutQueueOR.getProperty("Atlas_SanctionPass");
        Assert.assertEquals("PASS", Constants.key.pause("2", ""));
        Assert.assertEquals("PASS", Constants.key.click(vSanctionStatusPass, ""));
    }

    @And("^user hits Enter on Keyboard$")
    public void userHitsEnterOnKeyboard() throws Exception {
        Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke("","enter"));
    }

    @When("^User Click on Apply/Apply & Unlock on Payment Out$")
    public void userClickOnApplyApplyUnlockOnPaymentOut() throws Exception {
        String vApplyButtonPayOut = Constants.AtlasPaymentOutQueueOR.getProperty("Atlas_ApplyPayOutButton");
        Assert.assertEquals("PASS", Constants.key.click(vApplyButtonPayOut,""));
    }

    @And("^Mark the Payment In Status as REJECT with comments$")
    public void markThePaymentInStatusAsREJECTWithComments() throws Exception {
        String vRejectButton = Constants.AtlasPaymentInQueueOR.getProperty("Atlas_RejectStatus");
        String vTextInput = Constants.AtlasPaymentInQueueOR.getProperty("Atlas_CommentsTextInput");
        Assert.assertEquals("PASS", Constants.key.click(vRejectButton,""));
        Constants.key.pause("1","");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vTextInput,"Payment In Test flow for reject-POC2"));
    }

    @And("^User selects reason\"([^\"]*)\" from drop down$")
    public void userSelectsReasonFromDropDown(String reason) throws Throwable {
        String vArrowDDClick = Constants.AtlasPaymentInQueueOR.getProperty("Atlas_ReasonArrowDropDown");
        String vReasonContainer = Constants.AtlasPaymentInQueueOR.getProperty("Atlas_AllReasonContainer");
        Assert.assertEquals("PASS", Constants.key.click(vArrowDDClick,""));
        Constants.key.pause("1","");
        Assert.assertEquals("PASS", Constants.key.AltasRejectDropDown(vReasonContainer,reason));
    }

    @Then("^Payment In Status to be Observed as REJECT wth success message$")
    public void paymentInStatusToBeObservedAsREJECTWthSuccessMessage() throws Exception {
        String vPaymentCompStatus = Constants.AtlasPaymentInQueueOR.getProperty("Atlas_paymentComplianceStatus");
        String vSuccessMessage = Constants.AtlasPaymentInQueueOR.getProperty("Atlas_ComplianceStatusSuccessMessage");
        Constants.key.pause("2","");
        Assert.assertEquals("PASS", Constants.key.verifyText(vPaymentCompStatus,"REJECT"));
        Assert.assertEquals("PASS", Constants.key.verifyText(vSuccessMessage,"Updated successfully"));
    }

    @And("^User clicks on Logout button to logoff application$")
    public void userClicksOnLogoutButtonToLogoffApplication() throws Exception {
        String vLogOut = Constants.AtlasDashboardOR.getProperty("Atlas_LogOut");
        Assert.assertEquals("PASS", Constants.key.click(vLogOut,""));
    }

    @Then("^Payment Out Status to be Observed as REJECT wth success message$")
    public void paymentOutStatusToBeObservedAsREJECTWthSuccessMessage() throws Exception {
        String vPaymentCompStatus = Constants.AtlasPaymentInQueueOR.getProperty("Atlas_paymentComplianceStatus");
        String vSuccessMessage = Constants.AtlasPaymentInQueueOR.getProperty("Atlas_ComplianceStatusSuccessMessage");
        Constants.key.pause("2","");
        Assert.assertEquals("PASS", Constants.key.verifyText(vPaymentCompStatus,"REJECT"));
        Assert.assertEquals("PASS", Constants.key.verifyText(vSuccessMessage,"Updated successfully"));
    }

    @Then("^Payment Out Status to be Observed as ClEAR wth success message$")
    public void paymentOutStatusToBeObservedAsClEARWthSuccessMessage() throws Exception {
        String vPaymentCompStatus = Constants.AtlasPaymentInQueueOR.getProperty("Atlas_paymentComplianceStatus");
        String vSuccessMessage = Constants.AtlasPaymentInQueueOR.getProperty("Atlas_ComplianceStatusSuccessMessage");
        Constants.key.pause("2","");
        Assert.assertEquals("PASS", Constants.key.verifyText(vPaymentCompStatus,"CLEAR"));
        Assert.assertEquals("PASS", Constants.key.verifyText(vSuccessMessage,"Updated successfully"));
    }

}
