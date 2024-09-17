package com.cucumber.stepdefinition;

import com.selenium.utillity.Constants;
//import com.utilities.Log;
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

/*import com.utility.LogCapture;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.testng.Assert;*/

public class SFStepDefinition {

    @Given("^User launched SF application through \"(.*?)\"$")
    public void user_launched_SF_application_through(String data) throws Throwable {
        LogCapture.info(data + " Application is launching....");
        Assert.assertTrue(Constants.key.openBrowser("", data));
    }

    @Given("^User navigate to SF Application \"(.*?)\"$")
    public void user_navigate_to_SF_Application(String vUrl) throws Throwable {
        LogCapture.info("Sales Force Applicatiion is loading....");
        String url = Constants.CONFIG.getProperty(vUrl);
        Assert.assertEquals("PASS", Constants.key.navigate("", url));

    }

    @When("^User enter SF UserName \"(.*?)\" password \"(.*?)\" and click log In button$")
    public void user_enter_SF_UserName_password_and_click_log_In_button(String userName, String password) throws Throwable {
        String vUserName = Constants.CONFIG.getProperty(userName);
        String vPassword = Constants.CONFIG.getProperty(password);
        String vObjUser = Constants.SFLoginOR.getProperty("SFUserName");
        String vObjPass = Constants.SFLoginOR.getProperty("SFPassword");
        LogCapture.info("User Name " + vUserName + ", Password " + password + " is validated ....");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjUser, vUserName));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPass, vPassword));
        String vObjLoginButton = Constants.SFLoginOR.getProperty("SFLonInButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjLoginButton, ""));
        Constants.key.pause("2", "");

    }

    @Then("^User successfully landed on SF Home page$")
    public void user_successfully_landed_on_SF_Home_page() throws Throwable {
        LogCapture.info("Home page loading ......");
        Constants.key.pause("2", "");
        String vObjectHome = Constants.SFLoginOR.getProperty("ProfileButton");
        Assert.assertEquals("PASS", Constants.key.exist(vObjectHome, ""));
        LogCapture.info("Home page loaded successfully");

    }

    @When("^User enter SF UserName \"(.*?)\" incorrect password \"(.*?)\" and click log In button$")
    public void user_enter_SF_UserName_incorrect_password_and_click_log_In_button(String usernName, String inPassword) throws Throwable {
        LogCapture.info("Validating incorrect credentials.......");
        String vUserName = Constants.CONFIG.getProperty(usernName);
        String vObjUser = Constants.SFLoginOR.getProperty("SFUserName");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjUser, vUserName));
        String vObjPass = Constants.SFLoginOR.getProperty("SFPassword");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjPass, inPassword));
        String vObjLoginButton = Constants.SFLoginOR.getProperty("SFLonInButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjLoginButton, ""));
    }

    @Then("^error message is displayed on SF Login page$")
    public void error_message_is_displayed_on_SF_Login_page() throws Throwable {
        String vExpected = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
        String vErrorObj = Constants.SFLoginOR.getProperty("ErrorMessage");
        LogCapture.info("Validating error message...");
        Assert.assertEquals("PASS", Constants.key.verifyText(vErrorObj, vExpected));
    }

    @Then("^User clicks on Logout link under profile and successfully logout from application$")
    public void user_clicks_on_Logout_link_under_profile_and_successfully_logout_from_application() throws Throwable {
        Constants.key.pause("2","");
        String vObjProfileButton = Constants.SFLoginOR.getProperty("ProfileButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjProfileButton, ""));
        String vObjSFLogOutLink = Constants.SFLoginOR.getProperty("SFLogOutLink");
        Assert.assertEquals("PASS", Constants.key.click(vObjSFLogOutLink, ""));
    }

    @When("^User clicks on Lead Tab and then on New Lead$")
    public void user_clicks_on_Lead_Tab_and_then_on_New_Lead() throws Throwable {
        String vObjLeadTab = Constants.LeadGenerationOR.getProperty("LeadTab");
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.click(vObjLeadTab, ""));
        String vObjNewLead = Constants.LeadGenerationOR.getProperty("NewLead");
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.click(vObjNewLead, ""));
    }

    @When("^User select record type as CD and clicks on Next button$")
    public void user_select_record_type_as_CD_and_clicks_on_Next_button() throws Throwable {
        String vObjNextButton = Constants.LeadGenerationOR.getProperty("NextButton");
        Constants.key.pause("5", "");
        Assert.assertEquals("PASS", Constants.key.click(vObjNextButton, ""));
        Constants.key.isAlertPresent();
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.isAlertPresent());
        Constants.key.pause("2", "");
        Assert.assertEquals("PASS", Constants.key.isAlertPresent());
        Constants.key.pause("2", "");
    }

    @When("^User enter Lead Information \"(.*?)\" \"(.*?)\" \"(.*?)\" \"(.*?)\"$")
    public void user_enter_Lead_Information(String accountname, String firstname, String lastname, String email) throws Throwable {
        String vObjAccountName = Constants.LeadGenerationOR.getProperty("AccountName");
        Constants.key.pause("4", "");
        Assert.assertEquals("PASS", Constants.key.clearText(vObjAccountName));
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjAccountName, accountname));

        String vObjFirstName = Constants.LeadGenerationOR.getProperty("FirstName");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjFirstName, firstname));

        String vObjLastName = Constants.LeadGenerationOR.getProperty("LastName");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjLastName, lastname));

        String vObjEmail = Constants.LeadGenerationOR.getProperty("Email");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjEmail, email));

    }

    @When("^User enters source information \"(.*?)\" \"(.*?)\" and clicks on Save button$")
    public void user_enters_source_information_and_clicks_on_Save_button(String sourcelookup, String branchname) throws Throwable {
        String vObjSourceLookUp = Constants.LeadGenerationOR.getProperty("SourceLookUp");
        Assert.assertEquals("PASS", Constants.key.writeInInput(vObjSourceLookUp, sourcelookup));
        Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke(vObjSourceLookUp, "down"));
        Assert.assertEquals("PASS", Constants.key.sendkeyboardStroke("", "enter"));

        //String vObjBranchName = Constants.LeadGenerationOR.getProperty("BranchName");
        String vObjBranchName = Constants.LeadGenerationOR.getProperty("BranchNameDDclick");
        //div[8]/div/ul/li[*]/a[@title='Portugal']
        //String DynamicbranchName= "//div[8]/div/ul/li[*]/a[@title='"+branchname+"']";
        //String vxpath = "//a[contains(text(),'Italy')]";
        String DynamicbranchName = "//a[contains(text(),'" + branchname + "')]";
        //a[contains(text(),'Moorgate HO')]

        Assert.assertEquals("PASS", Constants.key.SfLeadDD(vObjBranchName, DynamicbranchName));

        String vObjSaveLeadButton = Constants.LeadGenerationOR.getProperty("SaveLeadButton");
        Assert.assertEquals("PASS", Constants.key.click(vObjSaveLeadButton, ""));
    }

    @Then("^User should be able successfully generate Lead$")
    public void user_should_be_able_successfully_generate_Lead() throws Throwable {

        Assert.assertEquals("PASS", Constants.key.VerifyTitle("", ""));
    }


    @Then("^User should be able successfully generate Lead\"([^\"]*)\"\"([^\"]*)\"$")
    public void userShouldBeAbleSuccessfullyGenerateLead(String firstname, String lastname) throws Throwable {
        Constants.key.pause("3","");
        Assert.assertEquals("PASS", Constants.key.VerifyTitle("", "Lightning Experience | Salesforce"));

    }
}
