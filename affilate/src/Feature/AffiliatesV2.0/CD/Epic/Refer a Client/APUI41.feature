@Affiliate_InSprint_ReferAClient_CD @APUI_41_CD @CD
Feature: Affiliate V2.0 Refer a client feature for APUI41

  @PhaseAll_CD @PhaseAll @APUI41_TC1_Aff_CD @Affiliates_Sprint5_CD @Acceptence_1_CD @QASprint5_CD @JenkinsWaitTest
  Scenario Outline:Verify that user is able to view correct details in Refer a client Journey
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    Then User Should be able to select only one option from Individual or Company
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI41_TC2_Aff_CD @Affiliates_Sprint5_CD @Acceptence_1_CD @QASprint5_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:Verify that user is able to view correct details in Refer a client Journey
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Should be able to select only one option from Individual or Company
    Then User Refresh the whole session and remains on the same Page Refer a Client
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @APUI41_TC3_Aff_CD @Affiliates_Sprint5_CD @Acceptence_2_CD @QASprint5_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:Verify that user is able to view correct details in Refer a client Journey
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

  @PhaseAll_CD @PhaseAll @APUI41_TC4_Aff_CD @Affiliates_Sprint5_CD @Acceptence_2_CD @QASprint5_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:Verify that user is able to view correct details in Refer a client Journey
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User click on Refer a client on dashboard.
    And User Selects Individual option
    Then user should be able to view the details required for Individual fields
    And User Clicks on Account button at the Left hand side Pane
    Then System should display the Account Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI41_TC5_Aff_CD @Affiliates_Sprint5_CD @Acceptence_2_CD @QASprint5_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:Verify that user is able to view correct details in Refer a client Journey
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    Then user should be able to view the details required for Individual fields
    And User try to Click on Continue button but Continue button is Disabled as no values were entered for Individual
    Then System should display error message for Not Entering Required Personal Individual details
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI41_TC6_Aff_CD @Affiliates_Sprint5_CD @Acceptence_3_CD @QASprint5_CD
  Scenario Outline:Verify that user is able to view correct details in Refer a client Journey
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    Then User Should be able to select only one option from Individual or Company
    And User Selects Corporate option
    Then user should be able to view the details required for Corporate fields
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI41_TC7_Aff_CD @Affiliates_Sprint5_CD @Acceptence_3_CD @QASprint5_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:Verify that user is able to view correct details in Refer a client Journey
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    Then User Should be able to select only one option from Individual or Company
    And User Selects Corporate option
    Then user should be able to view the details required for Corporate fields
    Then User Clicks on Account button at the Left hand side Pane
    And System should display the Account Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI41_TC8_Aff_CD @Affiliates_Sprint5_CD @Acceptence_3_CD @QASprint5_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:Verify that user is able to view correct details in Refer a client Journey
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    Then user should be able to view the details required for Corporate fields
    And User try to Click on Continue button but Continue button is Disabled as no values were entered for Corporate
    Then System should display error message for Not Entering Required Personal Corporate details
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI41_TC9_Aff_CD @Affiliates_Sprint5_CD @Acceptence_3_CD @QASprint5_CD
  Scenario Outline:Verify that user is able to view correct details in Refer a client Journey
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    Then user should be able to view the details required for Corporate fields
    Then User Refresh the whole session and remains on the same Page Refer a Client
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI41_TC10_Aff_CD @Affiliates_Sprint5_CD @Acceptence_4_CD @QASprint5_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI41_TC10_Aff_CD Verify that user is able to view correct details in Refer a client Journey when User Logs in with particular Orgainization User
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI41_TC11_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD
  Scenario Outline: APUI41_TC11_Aff_CD Verify that user is able to view correct details in Refer a client Journey once he refereshes the whole browser
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
