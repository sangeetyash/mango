@Affiliate_InSprint_ReferAClient_CD @APUI_102_CD @CD
Feature: Affiliate V2.0 Refer a client feature for APUI102_CD

  @PhaseAll_CD @PhaseAll @APUI102_TC1_Aff_CD @Affiliates_Sprint4_CD @Acceptence_1_CD @Regression
  Scenario Outline:APUI102_TC1_Aff_CD To Verify that user should be able to view Individual details filled during reference with all mandotary and optional fields
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
    And User should be able to view ALL Individual details such as Salutation "<Salutation>" FirstName"<FirstName>" LastName"<LastName>" Email"<Email>" Country_Code"<Country_Code>" Mobile_Number "<Mobile_Number>" LandLineCode "<LandLineCode>" LandLine "<LandLine>" EST_Value "<EST_Value>" Reason "<Reason>" on Confirm page which are been entered
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email             | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     |jhonlobo@gmail.com | +91          | 9000004587    | +91          | 2424004312 | Anytime        | Under 2,000 | Pound Sterling | Euro          | — |


  @PhaseAll_CD @PhaseAll @APUI102_TC2_Aff_CD @Affiliates_Sprint4_CD @Acceptence_1_CD
  Scenario Outline:APUI102_TC2_Aff_CD To Verify that user should be able to view Corporate details filled during reference with all mandotary and Optional fields
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
    And User should be able to view ALL Corporate details such as Salutation "<Salutation>" FirstName"<FirstName>" LastName"<LastName>" CompanyName "<CompanyName>" TradingName "<TradingName>" Email "<Email>" Country_Code "<Country_Code>" Mobile_Number "<Mobile_Number>" LandLineCode "<LandLineCode>" LandLine "<LandLine>" EST_Value "<EST_Value>" Reason "<Reason>" on Confirm page which are been entered
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | CompanyName | TradingName | Email             | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CD Holdings | CD Traders  |jhonlobo@gmail.com | +91          | 9000004587    | +91          | 2424004312 | Anytime        | Under 2,000 | Pound Sterling | Euro          | — |


  @PhaseAll_CD @PhaseAll @APUI102_TC3_Aff_CD @Affiliates_Sprint4_CD @Acceptence_1_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI102_TC3_Aff_CD To Verify that user should be able to view Individual details filled during reference with only mandotary fields
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User should be able to view all Individual Mandatory the details such as Salutation "<Salutation>" FirstName"<FirstName>" LastName"<LastName>" Email "<Email>" Country_Code "<Country_Code>" Mobile_Number "<Mobile_Number>" LandLineCode "<LandLineCode>" EST_Value "<EST_Value>" Reason "<Reason>" on Confirm page which are been entered
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email             | Country_Code | Mobile_Number | LandLineCode |  EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     |jhonlobo@gmail.com | +91          | 9000004587    | —            |  —           | Pound Sterling | Euro          | —      |

  @PhaseAll_CD @PhaseAll @APUI102_TC4_Aff_CD @Affiliates_Sprint4_CD @Acceptence_1_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun @Regression
  Scenario Outline:APUI102_TC4_Aff_CD To Verify that user should be able to view Corporate details filled during reference with only mandotary fields
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User Enters only mandatory Corporate fields Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User should be able to view all Corporate Mandatory details such as Salutation "<Salutation>" FirstName"<FirstName>" LastName"<LastName>" CompanyName"<CompanyName>" Email "<Email>" Country_Code "<Country_Code>" Mobile_Number "<Mobile_Number>" LandLineCode "<LandLineCode>" EST_Value "<EST_Value>" Reason "<Reason>" on Confirm page which are been entered
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | CompanyName | Email             | Country_Code | Mobile_Number | LandLineCode |  EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CD Holdings |jhonlobo@gmail.com | +91          | 9000004587    | —          |  — | Pound Sterling | Euro          | — |

  @PhaseAll_CD @PhaseAll @APUI102_TC5_Aff_CD @Affiliates_Sprint4_CD @Acceptence_2_CD
  Scenario Outline:APUI102_TC5_Aff_CD To Verify that user should be allowed to enter text in Text area
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User Enters only mandatory Individual fields Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User enters the proper data Message "<Message>" in text area
    Then User is able to view previously entered text Message "<Message>" into text area properly
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email             | Country_Code | Mobile_Number | LandLineCode |  EST_Value   | CurrencyHas    | Currency_Want | Reason |Message|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     |jhonlobo@gmail.com | +91          | 9000004587    | —          |  — | Pound Sterling | Euro          | — | $Hey!! This is Test%Message...|


  @PhaseAll_CD @PhaseAll @APUI102_TC6_Aff_CD @Affiliates_Sprint5_CD @Acceptence_2_CD @QASprint5_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun @Regression
  Scenario Outline:APUI102_TC6_Aff_CD To Verify that user should be allowed to enter text more than 32760 Characters
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User try to enters text morethan 32760 character in text area
    Then System displays error message for entering over number of characters into text box
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email             | Country_Code | Mobile_Number | LandLineCode |  EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     |jhonlobo@gmail.com | +91          | 9000004587    | —          |  — | Pound Sterling            | EUR           | — |

  @PhaseAll_CD @PhaseAll @APUI102_TC7_Aff_CD @Affiliates_Sprint5_CD @Acceptence_2_CD @QASprint5_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI102_TC7_Aff_CD To Verify that text should be saved when Spaces are been entered
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User try to enters text Spaces&Text 32760 character in text area
    Then User should be abe to view entered spaces into textbox
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email             | Country_Code | Mobile_Number | LandLineCode |  EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     |jhonlobo@gmail.com | +91          | 9000004587    | —          |  — | Pound Sterling            | EUR           | — |


  @PhaseAll_CD @PhaseAll @APUI102_TC8_Aff_CD @Affiliates_Sprint4_CD @Acceptence_2_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI102_TC8_Aff_CD To Verify that user should be allowed to enter text in Text area
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User Enters only mandatory Corporate fields Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User enters the proper data Message "<Message>" in text area
    Then User is able to view previously entered text Message "<Message>" into text area properly
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | CompanyName | Email             | Country_Code | Mobile_Number | LandLineCode |  EST_Value   | CurrencyHas    | Currency_Want | Reason |Message|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CD Holdings |jhonlobo@gmail.com | +91          | 9000004587    | —          |  — | Pound Sterling | Euro          | — | $Hey!! This is Test%Message...|

  @PhaseAll_CD @PhaseAll @APUI102_TC9_Aff_CD @Affiliates_Sprint5_CD @Acceptence_2_CD @QASprint5_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun @Regression
  Scenario Outline:APUI102_TC9_Aff_CD To Verify that user should be allowed to enter text more than 32760 Characters
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User Enters only mandatory Corporate fields Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User try to enters text morethan 32760 character in text area
    Then System displays error message for entering over number of characters into text box
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | CompanyName | Email             | Country_Code | Mobile_Number | LandLineCode |  EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CD Holdings |jhonlobo@gmail.com | +91          | 9000004587    | —          |  — | Pound Sterling            | EUR           | — |

  @PhaseAll_CD @PhaseAll @APUI102_TC10_Aff_CD @Affiliates_Sprint5_CD @Acceptence_2_CD @QASprint5_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI102_TC10_Aff_CD To Verify that text should be saved when Spaces are been entered
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User Enters only mandatory Corporate fields Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User try to enters text Spaces&Text 32760 character in text area
    Then User should be abe to view entered spaces into textbox
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | CompanyName | Email             | Country_Code | Mobile_Number | LandLineCode |  EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CD Holdings |jhonlobo@gmail.com | +91          | 9000004587    | —          |  — | Pound Sterling            | EUR           |— |


  @PhaseAll_CD @PhaseAll @APUI102_TC11_Aff_CD @Affiliates_Sprint4_CD @Acceptence_3_CD
  Scenario Outline:APUI102_TC11_Aff_CD To Verify that user should be allowed to tick on do not wish to confirm checkbox
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User should be able to view CommissionOptOut Checkbox is unselected
    And User clicks on CommissionOptOut Checkbox
    Then User should be able to view CommissionOptOut Checkbox is selected
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email             | Country_Code | Mobile_Number | LandLineCode |  EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     |jhonlobo@gmail.com | +91          | 9000004587    | —          |  — | Pound Sterling | Euro          | — |


  @PhaseAll_CD @PhaseAll @APUI102_TC12_Aff_CD @Affiliates_Sprint4_CD @Acceptence_3_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI102_TC12_Aff_CD To Verify that user should be allowed to unselect the do not wish to confirm checkbox
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User should be able to view CommissionOptOut Checkbox is unselected
    And User clicks on CommissionOptOut Checkbox
    Then User should be able to view CommissionOptOut Checkbox is selected
    And User clicks on CommissionOptOut Checkbox
    Then User should be able to view CommissionOptOut Checkbox is unselected
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email             | Country_Code | Mobile_Number | LandLineCode |  EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     |jhonlobo@gmail.com | +91          | 9000004587    | +91          |  Under 2,000 | Pound Sterling | Euro          | Salary |

  @PhaseAll_CD @PhaseAll @APUI102_TC13_Aff_CD @Affiliates_Sprint4_CD @Acceptence_3_CD
  Scenario Outline:APUI102_TC13_Aff_CD To Verify that user should be allowed to tick on do not wish to confirm checkbox
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User Enters only mandatory Corporate fields Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User should be able to view CommissionOptOut Checkbox is unselected
    And User clicks on CommissionOptOut Checkbox
    Then User should be able to view CommissionOptOut Checkbox is selected
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | CompanyName | Email             | Country_Code | Mobile_Number | LandLineCode |  EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CD Holdings |jhonlobo@gmail.com | +91          | 9000004587    | +91          |  Under 2,000 | Pound Sterling | Euro          | Salary |

  @PhaseAll_CD @PhaseAll @APUI102_TC14_Aff_CD @Affiliates_Sprint4_CD @Acceptence_3_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun @Regression
  Scenario Outline:APUI102_TC14_Aff_CD To Verify that user should be allowed to unselect the do not wish to confirm checkbox
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User Enters only mandatory Corporate fields Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User should be able to view CommissionOptOut Checkbox is unselected
    And User clicks on CommissionOptOut Checkbox
    Then User should be able to view CommissionOptOut Checkbox is selected
    And User clicks on CommissionOptOut Checkbox
    Then User should be able to view CommissionOptOut Checkbox is unselected
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | CompanyName | Email             | Country_Code | Mobile_Number | LandLineCode |  EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CD Holdings |jhonlobo@gmail.com | +91          | 9000004587    | +91          |  Under 2,000 | Pound Sterling | Euro          | Salary |

  @PhaseAll_CD @PhaseAll @APUI102_TC15_Aff_CD @Affiliates_Sprint4_CD @Acceptence_4_CD
  Scenario Outline:APUI102_TC15_Aff_CD To Verify that user should be allowed to tick on Agreement Checkbox
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User Enters only mandatory Individual fields Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User should be able to view Agreement Checkbox is unselected
    And User clicks on Agreement Checkbox
    Then User should be able to view Agreement Checkbox is selected
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email             | Country_Code | Mobile_Number | LandLineCode |  EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     |jhonlobo@gmail.com | +91          | 9000004587    | +91          |  Under 2,000 | Pound Sterling | Euro          | Salary |

  @PhaseAll_CD @PhaseAll @APUI102_TC16_Aff_CD @Affiliates_Sprint4_CD @Acceptence_4_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun @Regression
  Scenario Outline:APUI102_TC16_Aff_CD To Verify that user should be allowed to unselect Aggrement checkbox
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User Enters only mandatory Individual fields Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User should be able to view Agreement Checkbox is unselected
    And User clicks on Agreement Checkbox
    Then User should be able to view Agreement Checkbox is selected
    And User clicks on Agreement Checkbox
    Then User should be able to view Agreement Checkbox is unselected
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email             | Country_Code | Mobile_Number | LandLineCode |  EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     |jhonlobo@gmail.com | +91          | 9000004587    | +91          |  Under 2,000 | Pound Sterling | Euro          | Salary |

  @PhaseAll_CD @PhaseAll @APUI102_TC17_Aff_CD @Affiliates_Sprint4_CD @Acceptence_4_CD
  Scenario Outline:APUI102_TC17_Aff_CD To Verify that user should be allowed to tick on Aggrement Check box
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User Enters only mandatory Corporate fields Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User should be able to view Agreement Checkbox is unselected
    And User clicks on Agreement Checkbox
    Then User should be able to view Agreement Checkbox is selected
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | CompanyName | Email             | Country_Code | Mobile_Number | LandLineCode |  EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CD Holdings |jhonlobo@gmail.com | +91          | 9000004587    | +91          |  Under 2,000 | Pound Sterling | Euro          | Salary |

  @PhaseAll_CD @PhaseAll @APUI102_TC18_Aff_CD @Affiliates_Sprint4_CD @Acceptence_4_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI102_TC18_Aff_CD To Verify that user should be allowed to unselect Aggrement checkbox
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User Enters only mandatory Corporate fields Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User should be able to view Agreement Checkbox is unselected
    And User clicks on Agreement Checkbox
    Then User should be able to view Agreement Checkbox is selected
    And User clicks on Agreement Checkbox
    Then User should be able to view Agreement Checkbox is unselected
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | CompanyName | Email             | Country_Code | Mobile_Number | LandLineCode |  EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CD Holdings |jhonlobo@gmail.com | +91          | 9000004587    | +91          |  Under 2,000 | Pound Sterling | Euro          | Salary |


  @PhaseAll_CD @PhaseAll @APUI102_TC19_Aff_CD @Affiliates_Sprint4_CD @Acceptence_5_CD
  Scenario Outline:APUI102_TC19_Aff_CD To Verify that user should be allowed use the Back Button on Confirmation Screen
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User Clicks on Back Button
    Then System will navigate back to the Transaction details Page
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email             | Country_Code | Mobile_Number | LandLineCode |  EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     |jhonlobo@gmail.com | +91          | 9000004587    | +91          |  Under 2,000 | Pound Sterling | Euro          | Salary |

  @PhaseAll_CD @PhaseAll @APUI102_TC20_Aff_CD @Affiliates_Sprint4_CD @Acceptence_5_CD
  Scenario Outline:APUI102_TC20_Aff_CD To Verify that user should be allowed use the Back Button on Confirmation Screen
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User Enters only mandatory Corporate fields Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User Clicks on Back Button
    Then System will navigate back to the Transaction details Page
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | CompanyName | Email             | Country_Code | Mobile_Number | LandLineCode |  EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CD Holdings |jhonlobo@gmail.com | +91          | 9000004587    | +91          |  Under 2,000 | Pound Sterling | Euro          | Salary |

  @PhaseAll_CD @PhaseAll @APUI102_TC21_Aff_CD @Affiliates_Sprint4_CD @Acceptence_6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI102_TC21_Aff_CD To Verify that user should be able to view the Updated details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User Clicks on Back Button
    Then System will navigate back to the Transaction details Page
    And User updates Transaction Details New_EST_Value "<New_EST_Value>" New_Reason "<New_Reason>" as per Requirement and click on Continue
    Then User should be able to view the Newly Updated details Salutation "<Salutation>" FirstName"<FirstName>" LastName"<LastName>" Email"<Email>" Country_Code"<Country_Code>" Mobile_Number "<Mobile_Number>" LandLineCode "<LandLineCode>" New_EST_Value "<New_EST_Value>" New_Reason "<New_Reason>" on Confirmation page
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email             | Country_Code | Mobile_Number | LandLineCode |  EST_Value   | CurrencyHas    | Currency_Want | Reason | New_EST_Value    | New_Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     |jhonlobo@gmail.com | +91          | 9000004587    | +91          |  Under 2,000 | Pound Sterling | Euro          | Salary |    2,000 - 5,000 | Pensions   |

  @PhaseAll_CD @PhaseAll @APUI102_TC22_Aff_CD @Affiliates_Sprint4_CD @Acceptence_6_CD
  Scenario Outline:APUI102_TC22_Aff_CD To Verify that user should be able to view the same details when no change is been done
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User should be able to view all Individual Mandatory the details such as Salutation "<Salutation>" FirstName"<FirstName>" LastName"<LastName>" Email "<Email>" Country_Code "<Country_Code>" Mobile_Number "<Mobile_Number>" LandLineCode "<LandLineCode>" EST_Value "<EST_Value>" Reason "<Reason>" on Confirm page which are been entered
    And User Clicks on Back Button
    Then System will navigate back to the Transaction details Page
    And User Clicks on Continue Button
    Then User should be able to view all Individual Mandatory the details such as Salutation "<Salutation>" FirstName"<FirstName>" LastName"<LastName>" Email "<Email>" Country_Code "<Country_Code>" Mobile_Number "<Mobile_Number>" LandLineCode "<LandLineCode>" EST_Value "<EST_Value>" Reason "<Reason>" on Confirm page which are been entered
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email             | Country_Code | Mobile_Number | LandLineCode |  EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     |jhonlobo@gmail.com | +91          | 9000004587    | —          | — | Pound Sterling | Euro          | — |

  @PhaseAll_CD @PhaseAll @APUI102_TC23_Aff_CD @Affiliates_Sprint4_CD @Acceptence_6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI102_TC23_Aff_CD To Verify that user should be able to view the Updated details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User Enters only mandatory Corporate fields Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User Clicks on Back Button
    Then System will navigate back to the Transaction details Page
    And User updates Transaction Details New_EST_Value "<New_EST_Value>" New_Reason "<New_Reason>" as per Requirement and click on Continue
    Then User should be able to view the Newly Updated details Salutation "<Salutation>" FirstName"<FirstName>" LastName"<LastName>" Email"<Email>" Country_Code"<Country_Code>" Mobile_Number "<Mobile_Number>" LandLineCode "<LandLineCode>" New_EST_Value "<New_EST_Value>" New_Reason "<New_Reason>" on Confirmation page
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | CompanyName | Email             | Country_Code | Mobile_Number |   EST_Value   | CurrencyHas    | Currency_Want | Reason |New_EST_Value     | New_Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CD Holdings |jhonlobo@gmail.com | +91          | 9000004587    |   — | Pound Sterling | Euro          | — | 2,000 - 5,000    | —   |

  @PhaseAll_CD @PhaseAll @APUI102_TC24_Aff_CD @Affiliates_Sprint4_CD @Acceptence_6_CD
  Scenario Outline:APUI102_TC24_Aff_CD To Verify that user should be able to view the same details when no change is been done
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User Enters only mandatory Corporate fields Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User Clicks on Back Button
    Then System will navigate back to the Transaction details Page
    And User Clicks on Continue Button
    Then User should be able to view all Corporate Mandatory details such as Salutation "<Salutation>" FirstName"<FirstName>" LastName"<LastName>" CompanyName"<CompanyName>" Email "<Email>" Country_Code "<Country_Code>" Mobile_Number "<Mobile_Number>" LandLineCode "<LandLineCode>" EST_Value "<EST_Value>" Reason "<Reason>" on Confirm page which are been entered
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | CompanyName |  Email             | Country_Code | Mobile_Number | LandLineCode |   EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CD Holdings | jhonlobo@gmail.com | +91          | 9000004587    | —          |   — | Pound Sterling | Euro          | — |

  @PhaseAll_CD @PhaseAll @APUI102_TC25_Aff_CD @Affiliates_Sprint4_CD @Acceptence_7_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI102_TC25_Aff_CD To Verify that user should be able to view the same details along with organization
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User Enters only mandatory Corporate fields Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    And System will Navigate to the Confirmation Page
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | CompanyName |  Email             | Country_Code | Mobile_Number | LandLineCode |   EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CD Holdings | jhonlobo@gmail.com | +91          | 9000004587    | +91          | Under 2,000 | Pound Sterling | Euro          | Salary |

  @PhaseAll_CD @PhaseAll @APUI102_TC26_Aff_CD @Affiliates_Sprint9_CD @Acceptence_7_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI102_TC26_Aff_CD To Verify that user should not be allowed to move further until he selects the Agreement Option for Individual referrals
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User enters the proper data Message "<Message>" in text area
    And User clicks on CommissionOptOut Checkbox
    Then User should be able to view CommissionOptOut Checkbox is selected
    And User should be able to view Agreement Checkbox is unselected
    Then User Observe that Submit Button is disabled for Refer a client journey
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email             | Country_Code | Mobile_Number | LandLineCode |  EST_Value   | CurrencyHas    | Currency_Want | Reason |Message    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     |jhonlobo@gmail.com | +91          | 9000004587    | +91          |  Under 2,000 | Pound Sterling | Euro          | Salary |Thank you  |


  @PhaseAll_CD @PhaseAll @APUI102_TC27_Aff_CD @Affiliates_Sprint9_CD @Acceptence_7_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI102_TC27_Aff_CD To Verify that user should not be allowed to move further until he selects the Agreement Option for Corporate referrals
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" TradingName "<TradingName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Mandatory Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects Mandatory Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User enters the proper data Message "<Message>" in text area
    And User clicks on CommissionOptOut Checkbox
    Then User should be able to view CommissionOptOut Checkbox is selected
    And User should be able to view Agreement Checkbox is unselected
    Then User Observe that Submit Button is disabled for Refer a client journey
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | CompanyName | TradingName | Email             | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value   | CurrencyHas    | Currency_Want | Reason |Message   |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CD Holdings | CD Traders  |jhonlobo@gmail.com | +91          | 9000004587    | +91          | 2424004312 | Anytime        | Under 2,000 | Pound Sterling | Euro          | Salary |Thank you |


  @PhaseAll_CD @PhaseAll @APUI102_TC28_Aff_CD @Affiliates_Sprint9_CD @Acceptence_4_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI102_TC28_Aff_CD To Verify that user should be allowed to check Validation on moving back to previous pages
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
    And User should be able to view ALL Individual details such as Salutation "<Salutation>" FirstName"<FirstName>" LastName"<LastName>" Email"<Email>" Country_Code"<Country_Code>" Mobile_Number "<Mobile_Number>" LandLineCode "<LandLineCode>" LandLine "<LandLine>" EST_Value "<EST_Value>" Reason "<Reason>" on Confirm page which are been entered
    And User Clicks on Back Button
    Then System will navigate back to the Transaction details Page
    And User deletes Optional field values on Transaction details page
    Then Continue button should be enable
    And User Clicks on Back Button
    Then System will navigate back to the Contact details Page
    And User deletes Optional field values on Contact details Page
    Then Continue button should be enable
    And User Clicks on Back Button
    Then System will navigate back to the Personal details Page
    Then Continue button should be enable
    And User goes directly to Confirmation Page for Refer A Client
    And User Clicks on Back Button
    Then System will navigate back to the Transaction details Page
    And User deletes Mandatory field values on Transaction details page with error messages and Continue button disable
    And User Clicks on Back Button
    Then System will navigate back to the Contact details Page
    And User deletes Mandatory field values on Contact details Page with error messages and Continue button disable
    And User Clicks on Back Button
    Then System will navigate back to the Personal details Page
    And User deletes Mandatory Individual field values on Personal details Page with error messages and Continue button disable
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email             | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     |jhonlobo@gmail.com | +91          | 9000004587    | +91          | 2424004312 | Anytime        | Under 2,000 | Pound Sterling | Euro          | — |



  @PhaseAll_CD @PhaseAll @APUI102_TC29_Aff_CD @Affiliates_Sprint9_CD @Acceptence_4_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun @Regression
  Scenario Outline:APUI102_TC29_Aff_CD To Verify that user should be allowed to check Validation on moving back to previous pages
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
    And User should be able to view ALL Corporate details such as Salutation "<Salutation>" FirstName"<FirstName>" LastName"<LastName>" CompanyName "<CompanyName>" TradingName "<TradingName>" Email "<Email>" Country_Code "<Country_Code>" Mobile_Number "<Mobile_Number>" LandLineCode "<LandLineCode>" LandLine "<LandLine>" EST_Value "<EST_Value>" Reason "<Reason>" on Confirm page which are been entered
    And User Clicks on Back Button
    Then System will navigate back to the Transaction details Page
    And User deletes Optional field values on Transaction details page
    Then Continue button should be enable
    And User Clicks on Back Button
    Then System will navigate back to the Contact details Page
    And User deletes Optional field values on Contact details Page
    Then Continue button should be enable
    And User Clicks on Back Button
    Then System will navigate back to the Personal details Page
    And User deletes optional Corporate field values on Personal details Page
    Then Continue button should be enable
    And User goes directly to Confirmation Page for Refer A Client
    And User Clicks on Back Button
    Then System will navigate back to the Transaction details Page
    And User deletes Mandatory field values on Transaction details page with error messages and Continue button disable
    And User Clicks on Back Button
    Then System will navigate back to the Contact details Page
    And User deletes Mandatory field values on Contact details Page with error messages and Continue button disable
    And User Clicks on Back Button
    Then System will navigate back to the Personal details Page
    And User deletes Mandatory Corporate field values on Personal details Page with error messages and Continue button disable
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | CompanyName | TradingName | Email             | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value   | CurrencyHas    | Currency_Want | Reason |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CD Holdings | CD Traders  |jhonlobo@gmail.com | +91          | 9000004587    | +91          | 2424004312 | Anytime        | Under 2,000 | Pound Sterling | Euro          | — |

  @PhaseAll_CD @PhaseAll @APUI102_TC30_Aff_CD @Affiliates_Sprint9_CD @Acceptence_4_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI102_TC30_Aff_CD To Verify that user should be able to user proper Email ID for Individual Referrals
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Email "<Email>" on Contact details page
    Then User Should be able to view the error on Contact details page and Continue button as disabled
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email             |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     |jhonlobgmail.com |

  @PhaseAll_CD @PhaseAll @APUI102_TC31_Aff_CD @Affiliates_Sprint9_CD @Acceptence_4_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI102_TC31_Aff_CD To Verify that user should be able to user proper Email ID for Corporate Referrals
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" TradingName "<TradingName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters Email "<Email>" on Contact details page
    Then User Should be able to view the error on Contact details page and Continue button as disabled
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | CompanyName | TradingName | Email           |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     |CD Holdings  | CD Traders  |jhonlobgmai.com |

  #Min Length is 8 and Max is 14
  @PhaseAll_CD @PhaseAll @APUI102_TC32_Aff_CD @Affiliates_Sprint9_CD @Acceptence_4_CD
  Scenario Outline:APUI102_TC32_Aff_CD To Verify that user should be able to use boundary values for Mobile number and Landline Number
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    Then User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    And System will navigate to the Contact details Page
    And User Enters All Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>"
    Then User Enters the seven digit numbers on both Mobile number and Landline number
    And User Should be able to view the error and Continue button as disabled for both Mobile number and Landline number
    And User Enters the fifteen digit numbers on both Mobile number and Landline number
    Then User Should be able to view the error and Continue button as disabled for both Mobile number and Landline number
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName |  Email             | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | jhonlobo@gmail.com | +91          | 9000004587    | +91          | 2424004312 | Anytime        |

#Min Length is 8 and Max is 14
  @PhaseAll_CD @PhaseAll @APUI102_TC33_Aff_CD @Affiliates_Sprint9_CD @Acceptence_4_CD @Regression
  Scenario Outline:APUI102_TC33_Aff_CD To Verify that user should be able to use boundary values for Mobile number and Landline Number
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" TradingName "<TradingName>" and Click on Continue
    And System will navigate to the Contact details Page
    And User Enters All Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>"
    Then User Enters the seven digit numbers on both Mobile number and Landline number
    And User Should be able to view the error and Continue button as disabled for both Mobile number and Landline number
    And User Enters the fifteen digit numbers on both Mobile number and Landline number
    Then User Should be able to view the error and Continue button as disabled for both Mobile number and Landline number
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | CompanyName | TradingName | Email             | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CD Holdings | CD Traders  |jhonlobo@gmail.com | +91          | 9000004587    | +91          | 2424004312 | Anytime        |

