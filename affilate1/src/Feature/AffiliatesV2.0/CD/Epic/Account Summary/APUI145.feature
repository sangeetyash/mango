@Affiliate_InSprint_AccountSummary_CD @APUI_145_CD @CD
Feature: Affiliate V2.0 Accounts Summary feature for APUI145-CD

  @PhaseAll_CD @PhaseAll @APUI145_TC4_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC4_APUI145_AFF To Verify the Referal Count been displayed on Account Page for Corporate Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User should note number of Referrals count on Account Summary Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI145_TC10_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI145_TC10_Aff_CD To Verify the Registered Count been displayed on Account Page for Corporate Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User should note number of Registration count on Account Summary Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI145_TC18_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI145_TC18_Aff_CD To Verify the Traded Accounts Count been displayed on Account Page for Individual Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User should note number of TradedAccounts count on Account Summary Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI145_TC1_Aff_CD @Affiliates_Sprint6_CD @Acceptence_1_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI145_TC1_Aff_CD To Verify that Account Summary Section to be displayed on the top of Account Page for Individual & Corporate Registered User
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_CFX | AffPassword_CFX |

    #TC2 covered in TC1

  @PhaseAll_CD @PhaseAll @APUI145_TC3_Aff_CD @Affiliates_Sprint6_CD @Acceptence_2_CD @QASprint6_CD @Demo8 @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC3_APUI145_AFF To Verify the Referal Count been displayed on Account Page for Individual & Corporate Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User should note number of Referrals count on Account Summary Page
    Examples:
      | browser | urlName        | UserName                          | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName               | AffPassword |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_CFX           | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI145_TC5_Aff_CD @Affiliates_Sprint6_CD @Acceptence_2_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI145_TC5_Aff_CD To Verify the Referal Count been displayed on Account Page for Individual Customer when Individual Referal is been done
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User should note number of Referrals count on Account Summary Page
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
    And User is able to view the Account Summary Section
    Then User should be able to view updated number of Referrals count on Account Summary Page
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName |Email                  | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon     | Lobo   |jhonlobo@gmail.com | +91          | 9000004587    | +91          | 2424004312 | Anytime        | 2,000     | Pound Sterling | Euro          | Salary | Testing |

  @PhaseAll_CD @PhaseAll @APUI145_TC6_Aff_CD @Affiliates_Sprint6_CD @Acceptence_2_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC6_APUI145_AFF To Verify the Referal Count been displayed on Account Page for Individual Customer when Corporate Referal is been done
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User should note number of Referrals count on Account Summary Page
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    Then User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" TradingName "<TradingName>" and Click on Continue
    And System will navigate to the Contact details Page
    Then User Enters All Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    And System will navigate to the Transaction details Page
    Then User Selects All Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    And System will Navigate to the Confirmation Page
    Then User enters some value in TextArea "<Message>" and Select the Checkboxes and Click on Confirm
    And System will Navigate to Confirmation Message Page
    Then After 10 secs system will navigate back to the Account Page
    And User is able to view the Account Summary Section
    #Then User should be able to view updated number of Referrals count on Account Summary Page
    #Need to check once Referrals counts integration is done
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | CompanyName       | TradingName |       Email        | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      |   Lobo   |  CurrenciesDirect |  CD Traders | jhonlobo@gmail.com | +91          |    9000004587 | +91          | 2424004312 | Anytime        | 2,000     | Pound Sterling | Euro          | Salary | Testing |

  @PhaseAll_CD @PhaseAll @APUI145_TC9_Aff_CD @Affiliates_Sprint6_CD @Acceptence_3_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI145_TC9_Aff_CD To Verify the Registered Count been displayed on Account Page for Individual Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User should note number of Registration count on Account Summary Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI145_TC17_Aff_CD @Affiliates_Sprint6_CD @Acceptence_4_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI145_TC17_Aff_CD To Verify the Traded Accounts Count been displayed on Account Page for Individual Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User should note number of TradedAccounts count on Account Summary Page
   #Individual Customer TestData
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI145_TC21_Aff_CD @Affiliates_Sprint6_CD @Acceptence_6_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI145_TC21_Aff_CD To Verify that user is able to view correct Organization based details on Account Summary Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

