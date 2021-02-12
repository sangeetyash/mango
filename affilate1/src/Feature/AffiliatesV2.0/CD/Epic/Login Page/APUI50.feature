@Affiliate_InSprint_LoginPage_CD @APUI_50_CD @CD
Feature: Affiliate V2.0 Login Page for APUI50-CD

  @PhaseAll_CD @PhaseAll @APUI50_TC1_Aff_CD @Affiliates_Sprint8_CD @Acceptence_1_CD @QASprint8_CD
  Scenario Outline: APUI50_TC1_Aff_CD To validate System should be able to login with Existing Password
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI50_TC3_Aff_CD @Affiliates_Sprint8_CD @Acceptence_1_CD @QASprint8_CD @Regression
  Scenario Outline: APUI50_TC3_Aff_CD To validate System should Restrict the Existing User who does not met the Password criteria
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then System should display error message as Invalid Credentials
    Examples:
      | browser | urlName        | UserName            | password                 |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | CriteriaNotMetPassword   |

  @PhaseAll_CD @PhaseAll @APUI50_TC7_Aff_CD @Affiliates_Sprint8_CD @Acceptence__CD @QASprint8_CD
  Scenario Outline: APUI50_TC7_Aff_CD To validate System should all the Organization related details properly
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |
