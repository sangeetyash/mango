@Affiliate_InSprint_ReferAClient_CD @APUI_106_CD @CD
Feature: Affiliate V2.0 Refer a client feature for APUI106

  @PhaseAll_CD @PhaseAll @APUI106_TC1_Aff_CD @Affiliates_Sprint5_CD @Acceptence_1_CD @QASprint5_CD
  Scenario Outline:APUI106_TC1_Aff_CD Verify that System should display the Radio Buttons
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI106_TC2_Aff_CD @Affiliates_Sprint5_CD @Acceptence_2_CD @QASprint5_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI106_TC2_Aff_CD Verify Details should be displayed as per the option individual
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    Then user should be able to view the details required for Individual fields
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI106_TC3_Aff_CD @Affiliates_Sprint5_CD @Acceptence_3_CD @QASprint5_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI106_TC3_Aff_CD Verify Details should be displayed as per the option corporate
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    Then user should be able to view the details required for Corporate fields
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI106_TC4_Aff_CD @Affiliates_Sprint5_CD @Acceptence_4_CD @QASprint5_CD
  Scenario Outline:APUI106_TC4_Aff_CD Verify Details should be displayed as per the Organization
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    Then user should be able to view the details required for Individual fields
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI106_TC5_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD @Regression
  Scenario Outline:APUI106_TC5_Aff_CD Verify that user is able to view correct details in Refer a client Journey once he refereshes the whole browser
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    Then user should be able to view the details required for Corporate fields
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And User Refresh the whole session and remains on the same Page Refer a Client
    Then Individual option is been selected by default
    Examples:
      | browser | urlName        | UserName            | password    |Salutation | FirstName | LastName | CompanyName | TradingName|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |Mr         | Andrew    | Kumar    | BNTSoft     | Trade       |
