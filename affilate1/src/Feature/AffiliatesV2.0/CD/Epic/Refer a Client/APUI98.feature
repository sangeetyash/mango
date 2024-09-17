@Affiliate_InSprint_ReferAClient_CD @APUI_98_CD @CD
Feature: Affiliate V2.0 Refer a client feature for APUI98-CD

  @PhaseAll_CD @PhaseAll @APUI98_TC1_Aff_CD @Affiliates_Sprint7_CD @Acceptence_1_CD @QASprint7_CD
  Scenario Outline:APUI98_TC1_Aff_CD Verify that user should redirect to account page post clicking on Click here option for Individual referals
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
    And User clicks on the Click here option on Refer a client Confirmation page
    Then System should display the Account Page
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email              | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon     | Lobo       |jhonlobo@gmail.com | +91          | 9000004587    | +91          | 2424004312 | Anytime        | Under 2,000     | Pound Sterling | Euro          | Salary | Testing |

  @PhaseAll_CD @PhaseAll @APUI98_TC2_Aff_CD @Affiliates_Sprint7_CD @Acceptence_1_CD @QASprint7_CD
  Scenario Outline:APUI98_TC2_Aff_CD Verify that user should redirect to account page post clicking on Click here option for Corporate referals
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
    And User clicks on the Click here option on Refer a client Confirmation page
    Then System should display the Account Page
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName |   CompanyName    | TradingName|Email                  | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CurrenciesDirect | CD Traders |jhonlobo@gmail.com     | +91          | 9000004587    | +91          | 2424004312 | Anytime        | 2,000     | Pound Sterling | Euro          | Salary | Testing |

  @Phase_CD @Phase @APUI98_TC3_Aff_CD @Affiliates_Sprint7_CD @Acceptence_2_CD @QASprint7_CD
  Scenario Outline:APUI98_TC3_Aff_CD Verify that user should able to view Refer new client button on Confirmation Page for Individual referals
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    And User Selects Individual option
    Then User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    And System will navigate to the Contact details Page
    Then User Enters All Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    And System will navigate to the Transaction details Page
    Then User Selects All Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    And System will Navigate to the Confirmation Page
    Then User enters some value in TextArea "<Message>" and Select the Checkboxes and Click on Confirm
    And System will Navigate to Confirmation Message Page
    Then User Should be able to view the Refer a new Client Button
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email              | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon     | Lobo       |jhonlobo@gmail.com | +91          | 9000004587    | +91          | 2424004312 | Anytime        | Under 2,000     | Pound Sterling | Euro          | Salary | Testing |

  @PhaseAll_CD @PhaseAll @APUI98_TC4_Aff_CD @Affiliates_Sprint7_CD @Acceptence_2_CD @QASprint7_CD
  Scenario Outline:APUI98_TC4_Aff_CD Verify that user should able to view Refer new client button on Confirmation Page for Corporate referals
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    And User Selects Corporate option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" TradingName "<TradingName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters All Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects All Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User enters some value in TextArea "<Message>" and Select the Checkboxes and Click on Confirm
    Then System will Navigate to Confirmation Message Page
    Then User Should be able to view the Refer a new Client Button
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName |   CompanyName    | TradingName|Email                  | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CurrenciesDirect | CD Traders |jhonlobo@gmail.com     | +91          | 9000004587    | +91          | 2424004312 | Anytime        | 2,000     | Pound Sterling | Euro          | Salary | Testing |

  @Phase_CD @Phase @APUI98_TC5_Aff_CD @Affiliates_Sprint7_CD @Acceptence_2_CD @QASprint7_CD
  Scenario Outline:APUI98_TC5_Aff_CD validate User Should be able to view the Organzation details
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
    And System will Navigate to Confirmation Message Page
    Then User clicks on the Click here option on Refer a client Confirmation page
    And System should display the Account Page
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email              | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon     | Lobo       |jhonlobo@gmail.com | +91          | 9000004587    | +91          | 2424004312 | Anytime        | Under 2,000     | Pound Sterling | Euro          | Salary | Testing |
