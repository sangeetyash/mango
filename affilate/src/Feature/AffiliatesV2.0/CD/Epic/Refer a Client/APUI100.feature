@Affiliate_InSprint_ReferAClient_CD @APUI_100_CD @CD
Feature: Affiliate V2.0 Refer a client feature for APUI100_CD


  @PhaseAll_CD @PhaseAll @APUI100_TC1_Aff_CD @Affiliates_Sprint3_CD @Acceptence_1_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun @PhaseAll_CD @PhaseAll
  Scenario Outline: TC1_APUI100_AFF To validate System should navigate to Account Page once timer gets over for Individual Referal
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters All Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects All Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User enters some value in TextArea "<Message>" and Select the Checkboxes and Click on Confirm
    Then System will Navigate to Confirmation Message Page
    Then After 10 secs system will navigate back to the Account Page
    Examples:
      | browser | urlName         | UserName             | password         | Salutation | FirstName | LastName | Email                   | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
      | Chrome  | AffiliateCDURL  | AffiliateCDUserName  | AffPassword      | Mr         | Andrew1    | Kumar1    | Andrewkaundal1@gmail.com | +91          | 8805116745    | +91          | 2424004312 | Anytime        | 2,000     | Pound Sterling | Euro          | Salary | Testing |


  @PhaseAll_CD @PhaseAll @APUI100_TC2_Aff_CD @Affiliates_Sprint3_CD @Acceptence_1_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun @PhaseAll_CD @PhaseAll @Smoke
  Scenario Outline: TC2_APUI100_AFF To validate System should navigate to Account Page once timer gets over for Corporate Referal
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" TradingName "<TradingName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters All Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects All Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User enters some value in TextArea "<Message>" and Select the Checkboxes and Click on Confirm
    Then System will Navigate to Confirmation Message Page
    Then After 10 secs system will navigate back to the Account Page
    Examples:
      | browser | urlName         | UserName             | password         | Salutation | FirstName | LastName | CompanyName | TradingName | Email                   | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Andrew2    | Kumar2    | BNTSoft     | Trade       | Andrewkaundal2@gmail.com | +91          | 8805116745    | +91          | 2424004312 | Anytime        | 2,000     | Pound Sterling | Euro          | — | Testing |

  @PhaseAll_CD @PhaseAll @APUI100_TC3_Aff_CD @Affiliates_Sprint3_CD @Acceptence_2_CD @PhaseAll_CD @PhaseAll
  Scenario Outline: TC3_APUI100_AFF To Validate System should display the time on UI
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters All Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects All Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User enters some value in TextArea "<Message>" and Select the Checkboxes and Click on Confirm
    Then System will Navigate to Confirmation Message Page
    Then user should be able to view the timer on UI
    Then After 10 secs system will navigate back to the Account Page
    Examples:
      | browser | urlName         | UserName             | password         | Salutation | FirstName | LastName | Email                   | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Andrew3    | Kumar3    | Andrewkaundal3@gmail.com | +91          | 8805116745    | +91          | 2424004312 | Anytime        | 2,000     | Pound Sterling | Euro          | Salary | Testing |

  @PhaseAll_CD @PhaseAll @APUI100_TC4_Aff_CD @Affiliates_Sprint3_CD @Acceptence_3_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun @PhaseAll_CD @PhaseAll @Regression
  Scenario Outline: TC4_APUI100_AFF To Validate System should able to view the header and footer deatils in Timer Option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" TradingName "<TradingName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters All Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects All Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User enters some value in TextArea "<Message>" and Select the Checkboxes and Click on Confirm
    Then System will Navigate to Confirmation Message Page
    Then user should be able to view the timer on UI
    Examples:
      | browser | urlName         | UserName             | password         | Salutation | FirstName | LastName | CompanyName | TradingName | Email                   | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Andrew4   | Kumar4    | BNTSoft     | Trade       | Andrewkaundal4@gmail.com | +91          | 8805116745    | +91          | 2424004312 | Anytime        | 2,000     | Pound Sterling | Euro          | — | Testing |

  @PhaseAll_CD @PhaseAll @APUI100_TC6_Aff_CD @Affiliates_Sprint3_CD @Acceptence_3_CD @PhaseAll_CD @PhaseAll @Reruntest @Regression
  Scenario Outline: APUI100_TC6_Aff_CD To Validate System should able to view the header and footer deatils in Timer Option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    Then user should be able to view the details required for Individual fields
    And User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters All Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects All Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User enters some value in TextArea "<Message>" and Select the Checkboxes and Click on Confirm
    Then System will Navigate to Confirmation Message Page
    Then user should be able to view the timer on UI
    Then After 10 secs system will navigate back to the Account Page
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName         | UserName             | password         | Salutation | FirstName | LastName | Email                   | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Andrew5    | Kumar5    | Andrewkaundal5@gmail.com | +91          | 8805116745    | +91          | 2424004312 | Anytime        | 2,000     | Pound Sterling | Euro          | Salary | Testing |

    
    
 
       