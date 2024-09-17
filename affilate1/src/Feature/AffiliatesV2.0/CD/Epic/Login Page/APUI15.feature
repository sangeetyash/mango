@Affiliate_InSprint_LoginPage_CD @APUI_15_CD @CD
Feature: Affiliate V2.0 Login Page for APUI15-CD

  @PhaseAll_CD @PhaseAll @APUI15_TC1_Aff_CD @Affiliates_Sprint5_CD @Acceptence_1_CD @QASprint5_CD
  Scenario Outline: TC1_APUI15_AFF_CD_To validate System should be able to view the Password in Obsulte format
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enters Login Email Address "<UserName>" and Password "<password>"
    Then User should be able to view the password in Masked format "<password>"
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI15_TC2_Aff_CD @Affiliates_Sprint5_CD @Acceptence_2_CD @QASprint5_CD
  Scenario Outline: TC2_APUI15_AFF_CD_To validate System should be able to view the Password which is been entered
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enters Login Email Address "<UserName>" and Password "<password>"
    And User clicks and Hold the on Eye button
    Then User should be able to view the password in unMasked format "<password>"
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI15_TC3_Aff_CD @Affiliates_Sprint5_CD @Acceptence_2_CD @QASprint5_CD @Demo @Regression
  Scenario Outline: TC3_APUI15_AFF To validate System should be able to view the Password which is been entered
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enters Login Email Address "<UserName>" and Password "<password>"
    Then User clicks and Hold the on Eye button
    And User should be able to view the password in unMasked format "<password>"
    And User Releases the Mouse Click from Eye button
    Then User should be able to view the password in Masked format "<password>"
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI15_TC4_Aff_CD @Affiliates_Sprint5_CD @Acceptence_2_CD @QASprint5_CD @Smoke
  Scenario Outline: TC4_APUI15_AFF To validate Organization information to be displayed properly
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enters Login Email Address "<UserName>" and Password "<password>"
    And User clicks and Hold the on Eye button
    Then User should be able to view the password in unMasked format "<password>"
    And User Releases the Mouse Click from Eye button
    Then User should be able to view the password in Masked format "<password>"
    And User should view the Organization information Before Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |
