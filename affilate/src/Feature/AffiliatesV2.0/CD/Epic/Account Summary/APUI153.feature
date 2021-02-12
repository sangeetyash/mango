@Affiliate_InSprint_AccountSummary_CD @APUI_153_CD @CD
Feature: Affiliate V2.0 Accounts Page feature for APUI153-CD

  @PhaseAll_CD @PhaseAll @APUI153_TC1_Aff_CD @Affiliates_Sprint7_CD @Acceptence_1_CD @QASprint7_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI153_TC1_Aff_CD To Verify that Account Page should be displayed by default when Logged in with Individual Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI153_TC3_Aff_CD @Affiliates_Sprint7_CD @Acceptence_1_CD @QASprint7_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI153_TC3_Aff_CD To Verify that Account Page should be displayed automatically once Refer a Client Journey is been Performed for Individual
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
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
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email              | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon     | Lobo       |jhonlobo@gmail.com | +91          | 9000004587    | +91          | 6556561516 | Anytime        | 2,000     | Pound Sterling | Euro          | Salary | Testing |

  #Developers help will be needed in this case
  @PhaseAll_CD @PhaseAll @APUI153_TC7_Aff_CD @Affiliates_Sprint7_CD @Acceptence_2_CD @QASprint7_CD @Regression_Suite
  Scenario Outline:APUI153_TC7_Aff_CD To Verify that Page Not found error message to be displayed on UI for page not devloped yet
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Enter any Invalid Path Appending the Base URL
    Then System will show Error Message as Page is missing for Invalid Base URL
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI153_TC2_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI153_TC2_Aff_CD To Verify that Account Page should be displayed by default when Logged in with Corporate Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Examples:
      | browser | urlName        | UserName                | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_CFX | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI153_TC4_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI153_TC4_Aff_CD To Verify that Account Page should be displayed once Refer a Client Journey is been Performed for Individual
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters All Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects All Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User enters some value in TextArea "<Message>" and Select the Checkboxes and Click on Confirm
    Then System will Navigate to Confirmation Message Page
    And User Clicks on Back to Account button
    Then System should display the Account Page
    Examples:
      | browser | urlName        | UserName                | password    | Salutation | FirstName | LastName | Email                  | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_CFX | AffPassword | Mr         | Jhon     | Lobo      | jhonlobo@gmail.com     | +91          | 9000004587    | +91          | 2424004312 | Anytime        | 2,000     | Pound Sterling | Euro          | Salary | Testing |

  @PhaseAll_CD @PhaseAll @APUI153_TC5_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD @Regression_Suite
  Scenario Outline:APUI153_TC5_Aff_CD To Verify that Account Page should be displayed automatically once Refer a Client Journey is been Performed for Corporate
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
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
      | browser | urlName        | UserName                | password    | Salutation | FirstName | LastName | CompanyName |TradingName|Email                  | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_CFX | AffPassword | Mr         | Jhon     | Lobo   |  CurrenciesDirect | CD Traders |jhonlobo@gmail.com | +91          | 9000004587    | +91          | 2424004312 | Anytime        | 2,000     | Pound Sterling | Euro          | Salary | Testing |

  @PhaseAll_CD @PhaseAll @APUI153_TC6_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD @Regression_Suite
  Scenario Outline:APUI153_TC6_Aff_CD To Verify that Account Page should be displayed once Refer a Client Journey is been Performed for Corporate
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
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
    And User Clicks on Back to Account button
    Then System should display the Account Page
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | CompanyName |TradingName|Email                  | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon     | Lobo   |  CurrenciesDirect | CD Traders |jhonlobo@gmail.com | +91          | 9000004587    | +91          | 2424004312 | Anytime        | Under 2,000     | Pound Sterling | Euro          | Salary | Testing |


  @PhaseAll_CD @PhaseAll @APUI153_TC9_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint13_CD @Regression_Suite
  Scenario Outline:APUI153_TC9_Aff_CD To Validate System should able to view the header and footer deatils in Timer Option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then System should display the Account Page
    And User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |
