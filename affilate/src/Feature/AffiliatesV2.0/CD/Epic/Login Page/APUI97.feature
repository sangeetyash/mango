@Affiliate_InSprint_LoginPage_CD @APUI_97_CD @CD
Feature: Affiliate V2.0 Login Page for APUI97-CD

  @PhaseAll_CD @PhaseAll @APUI97_TC1_Aff_CD @Affiliates_Sprint8_CD @Acceptence_1_CD @QASprint8_CD
  Scenario Outline: APUI97_TC1_Aff_CD To validate System should land on Account Page post login
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI97_TC2_Aff_CD @Affiliates_Sprint8_CD @Acceptence_2_CD @QASprint8_CD
  Scenario Outline: APUI97_TC2_Aff_CD To validate System should be in session if they navigate to refer page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should display the refer new client Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI97_TC3_Aff_CD @Affiliates_Sprint8_CD @Acceptence_2_CD @QASprint8_CD
  Scenario Outline: APUI97_TC3_Aff_CD To validate System should be in session if they navigate to resources page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be navigated to the Resources section Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI97_TC4_Aff_CD @Affiliates_Sprint8_CD @Acceptence_2_CD @QASprint8_CD
  Scenario Outline: APUI97_TC4_Aff_CD To validate System should be in session if they navigate to commissions page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Commission tab on dashboard.
    Then User will be navigated to the Commission section Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI97_TC7_Aff_CD @Affiliates_Sprint8_CD @Acceptence_2_CD @QASprint8_CD
  Scenario Outline: APUI97_TC7_Aff_CD To validate System should be in session if they navigate to settings page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Settings tab on dashboard.
    Then User will be navigated to the Settings section Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  #Tester Should give the Path which is Outside the login Scope
  @PhaseAll_CD @PhaseAll @APUI97_TC9_Aff_CD @Affiliates_Sprint8_CD @Acceptence_3_CD @QASprint8_CD @Regression
  Scenario Outline: APUI97_TC9_Aff_CD To validate System should display Page missing error page when invalid path is been appended in Base URL
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Enter any Invalid Path Appending the Base URL
    Then System will show Error Message as Page is missing for Invalid Base URL
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI97_TC10_Aff_CD @Affiliates_Sprint8_CD @Acceptence_1_CD @QASprint8_CD
  Scenario Outline: APUI97_TC10_Aff_CD To validate User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |
