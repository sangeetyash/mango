@Affiliate_InSprint_CommissionPage_CD @APUI_234_CD @CD
Feature: Affiliate V2.0 Commission feature for APUI234-CD

  #User is provided with Commission type as None from Salesforce - It will Fail Due to Test Data
  @PhaseAll_CD @PhaseAll @APUI234_TC1_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC1_APUI234_AFF To Verify System should not be able to view the Commission option on side bar when commission flag is been set as None on Salesforce
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User should not be able to view the Commission tab as view is been set none at the Salesforce side

    Examples:
      | browser | urlName        | UserName                | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_WDN | AffPassword |

    #User is provided with Commission type as Summary from Salesforce
  @PhaseAll_CD @PhaseAll @APUI234_TC3_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC3_APUI234_AFF To Verify System should be able to view summary report for the commission
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

     #User is provided with Commission type as deatiled from Salesforce
  @PhaseAll_CD @PhaseAll @APUI234_TC5_Aff_CD @Affiliates_Sprint12_CD @Acceptence_3_CD @QASprint12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC5_APUI234_AFF To Verify System should be able to view summary report for the commission
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Detail report for Commission section

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_WDD | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI234_TC7_Aff_CD @Affiliates_Sprint14_CD @Acceptence_4_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC7_APUI234_AFF To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User should not be able to view the Commission tab as view is been set none at the Salesforce side
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName                | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_WDN | AffPassword |
