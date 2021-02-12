@Affiliate_InSprint_LoginPage_CD @APUI_35_CD @CD
Feature: Affiliate V2.0 Login Page for APUI35-CD

  @PhaseAll_CD @PhaseAll @APUI35_TC1_Aff_CD @Affiliates_Sprint8_CD @Acceptence_1_CD @QASprint8_CD
  Scenario Outline: APUI35_TC1_Aff_CD To validate System should be able to view the Registration page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User clicks on Become a partner button on Login page
    Then User should be navigate to Affiliates Registration Page
    Examples:
      | browser | urlName        |
      | Chrome  | AffiliateCDURL |

  @PhaseAll_CD @PhaseAll @APUI35_TC2_Aff_CD @Affiliates_Sprint8_CD @Acceptence_2_CD @QASprint8_CD
  Scenario Outline: APUI35_TC2_Aff_CD To validate the affilate portal is been accessible for Individual Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User clicks on Become a partner button on Login page
    Then User should be navigate to Affiliates Registration Page
    Then User should be able to view An Individual option on Affiliates Registration Page
    Examples:
      | browser | urlName        |
      | Chrome  | AffiliateCDURL |

  @PhaseAll_CD @PhaseAll @APUI35_TC3_Aff_CD @Affiliates_Sprint8_CD @Acceptence_2_CD @QASprint8_CD @Regression
  Scenario Outline: APUI35_TC3_Aff_CD To validate the affilate portal is been accessible for Corporate Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User clicks on Become a partner button on Login page
    Then User should be navigate to Affiliates Registration Page
    Then User should be able to view Corporate option on Affiliates Registration Page
    Examples:
      | browser | urlName        |
      | Chrome  | AffiliateCDURL |

  @PhaseAll_CD @PhaseAll @APUI35_TC4_Aff_CD @Affiliates_Sprint8_CD @Acceptence_3_CD @QASprint8_CD
  Scenario Outline: APUI35_TC4_Aff_CD To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User clicks on Become a partner button on Login page
    Then User should be navigate to Affiliates Registration Page
    Then User should view the Organization information Before Login in header and fotter sections
    Examples:
      | browser | urlName        |
      | Chrome  | AffiliateCDURL |
