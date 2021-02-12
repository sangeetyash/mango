@Affiliate_InSprint_ReferAClientJourney @Affiliate_InSprint_ReferAClient
Feature: Affiliate V2.0 Refer a client feature Journey

@Refer_a_Client_CD_Org @Affiliates_Sprint3 @Acceptence_1
Scenario Outline:TC1_AFF To Verify that System should Process Refer a Client Journey
  Given User launched application through "<browser>"
  And User navigate to Affiliate CD portal "<urlName>"
  When User enter UserName  "<UserName>" and password "<password>"and click login button
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
  | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | Email                  | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
  | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Tanuj     | Kumar    | tanujkaundal@gmail.com | +91          | 8805116745    | +91          | 2424004312 | Anytime        | 2,000     | Pound Sterling | Euro          | Salary | Testing |

@Refer_a_Client_TORFX_Org @Affiliates_Sprint3 @Acceptence_1
Scenario Outline:TC1_AFF To Verify that System should Process Refer a Client Journey
  Given User launched application through "<browser>"
  And User navigate to Affiliate TorFX portal "<urlName>"
  When User enter UserName  "<UserName>" and password "<password>"and click login button
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
  | browser | urlName           | UserName         | password    | Salutation | FirstName | LastName | Email                  | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
  | Chrome  | AffiliateTorFXURL | AffTorfxUserName | AffPassword | Mr         | Tanuj     | Kumar    | tanujkaundal@gmail.com | +91          | 8805116745    | +91          | 2424004312 | Anytime        | 2,000     | Pound Sterling | Euro          | Salary | Testing |

@Refer_a_Client_TORFXOZ_Org @Affiliates_Sprint3 @Acceptence_1
Scenario Outline:TC1_AFF To Verify that System should Process Refer a Client Journey
  Given User launched application through "<browser>"
  And User navigate to Affiliate TorFXOz portal "<urlName>"
  When User enter UserName  "<UserName>" and password "<password>"and click login button
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
  | browser | urlName             | UserName           | password    | Salutation | FirstName | LastName | Email                  | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
  | Chrome  | AffiliateTorFXOzURL | AffTorFXOzUserName | AffPassword | Mr         | Tanuj     | Kumar    | tanujkaundal@gmail.com | +91          | 8805116745    | +91          | 2424004312 | Anytime        | 2,000     | Pound Sterling | Euro          | Salary | Testing |

