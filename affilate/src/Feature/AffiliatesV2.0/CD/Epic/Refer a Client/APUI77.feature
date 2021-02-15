@Affiliate_InSprint_ReferAClient_CD @APUI_77_CD @CD
Feature: Affiliate V2.0 Refer a client feature for APUI77_CD

  @PhaseAll_CD @PhaseAll @APUI77_TC1_Aff_CD @Affiliates_Sprint6_CD @Acceptence_1_CD @QASprint6_CD @Demo @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline: APUI77_TC1_Aff_CD To validate Refer a Client Individual Details are filled properly
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
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email              | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon     | Lobo       | jhonlobo@gmail.com | +91          | 9000004587    | +91          | 2424004312 | Anytime        | 2,000     | Pound Sterling | Euro          | Salary | Testing |

  @PhaseAll_CD @PhaseAll @APUI77_TC2_Aff_CD @Affiliates_Sprint6_CD @Acceptence_1_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline: APUI77_TC2_Aff_CD To validate Refer a Client Corporate Details are filled properly
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
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName |   CompanyName    | TradingName|Email                  | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CurrenciesDirect | CD Traders |jhonlobo@gmail.com     | +91          | 9000004587    | +91          | 2424004312 | Anytime        | 2,000     | Pound Sterling | Euro          | Salary | Testing |

  @PhaseAll_CD @PhaseAll @APUI77_TC3_Aff_CD @Affiliates_Sprint6_CD @Acceptence_2_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun @Regression
  Scenario Outline: TC3_APUI77_AFF To validate Mobile Number Country Code to be dislplayed
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User clicks on MobilePhone_CountryCode field
    Then User Should be able to Verify All values for MobilePhone_CountryCode DropDown
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     |

  @PhaseAll_CD @PhaseAll @APUI77_TC4_Aff_CD @Affiliates_Sprint6_CD @Acceptence_2_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline: APUI77_TC4_Aff_CD To validate Phone Number Country Code to be dislplayed
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User clicks on Landline_CountryCode field
    Then User Should be able to Verify All values for Landline_CountryCode DropDown
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     |

  @PhaseAll_CD @PhaseAll @APUI77_TC5_Aff_CD @Affiliates_Sprint6_CD @Acceptence_2_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline: APUI77_TC5_Aff_CD To validate Phone Number Country Code to be dislplayed
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" TradingName "<TradingName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User clicks on BestTimeToCall field
    Then User Should be able to Verify All values for BestTimeToCall DropDown
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName |   CompanyName    | TradingName|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CurrenciesDirect | CD Traders |

  @PhaseAll_CD @PhaseAll @APUI77_TC6_Aff_CD @Affiliates_Sprint6_CD @Acceptence_3_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline: APUI77_TC6_Aff_CD To validate user Should allow us to enter numbers in the details page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    Then User Should be able to enter numeric Value in RACFirstName field and validate the same value
    Then User Should be able to enter numeric Value in RACLastName field and validate the same value
    Then System should NOT display error message for Not Entering Required Personal Individual details
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI77_TC7_Aff_CD @Affiliates_Sprint6_CD @Acceptence_3_CD @QASprint6_CD @Demo8 @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun @Regression
  Scenario Outline: APUI77_TC7_Aff_CD To validate the Character limit been set for the Refer a Client
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    Then User selects value for Salutation "<Salutation>" dropdown
    And User enters more than required characters in RACFirstName field
    And User enters more than required characters in RACLastName field
    And User enters more than required characters in RACCompanyName field
    And User enters more than required characters in RACTradingName field
    Then System should display error message for Not Entering Required Personal Corporate details
    Examples:
      | browser | urlName        | UserName            | password    | Salutation |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         |
    #Acceptence Point 4 is been covered in 3"

  @PhaseAll_CD @PhaseAll @APUI77_TC8_Aff_CD @Affiliates_Sprint6_CD @Acceptence_5_CD @QASprint6_CD
  Scenario Outline: APUI77_TC8_Aff_CD To Verify the User Should be able to view the Organzation details
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
    And User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email              | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon     | Lobo       |jhonlobo@gmail.com | +91          | 9000004587    | +91          | 2424004312 | Anytime        | 2,000     | Pound Sterling | Euro          | Salary | Testing |
