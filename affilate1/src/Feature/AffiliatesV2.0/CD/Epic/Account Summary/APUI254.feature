@Affiliate_InSprint_AccountSummary_CD @APUI_254_CD @CD
Feature: Affiliate V2.0 Accounts Summary feature for APUI254-CD

  @PhaseAll_CD @PhaseAll @APUI254_TC3_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC3_APUI254_AFF To Verify System should view the year in number format instead of text for both years
   Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    Then User will be able to view the two years as Select option
    Then User should be able to view the both years in number format in place of text format

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI254_TC1_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @QASprint14_CD
  Scenario Outline:APUI254_TC1_Aff_CD To Verify System should view the year in number format instead of text for previous year
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    Then User will be able to view the two years as Select option
    And User Selects the Previous year option
    Then User should be able to view the previous year in number format in place of text format
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI254_TC2_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @QASprint14_CD
  Scenario Outline:TC2_APUI254_AFF To Verify System should view the year in number format instead of text for previous year
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    Then User will be able to view the two years as Select option
    And User Selects the Current year option
    Then User should be able to view the current year in number format in place of text format
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI254_TC6_Aff_CD @Affiliates_Sprint14_CD @Acceptence_4_CD @QASprint14_CD
  Scenario Outline:TC6_APUI254_AFF To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    Then User will be able to view the two years as Select option
    Then User should be able to view the both years in number format in place of text format
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |