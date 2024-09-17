@Affiliate_InSprint_BecomeaPartner_CD @APUI_450_CD @CD
Feature: Affiliate V2.0 Become a Partner Page for APUI450-CD

  @PhaseAll_CD @PhaseAll @APUI450_TC1_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD
  Scenario Outline: TC1_APUI450_AFF_CD To Verify USA country to be removed for PFX Customers
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User go to Country Option and try to search Country "<Country>"
    Then System will not show any result
    Examples:
      | browser | urlName        |  Country      |
      | Chrome  | AffiliateCDURL |  United States of America    |

  @PhaseAll_CD @PhaseAll @APUI450_TC2_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint12_CD
  Scenario Outline: TC2_APUI450_AFF_CD To Verify USA country to be removed for CFX Customers
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User go to Country Option and try to search Country "<Country>"
    Then System will not show any result
    Examples:
      | browser | urlName                 |  Country      |
      | Chrome  | AffiliateCDURL |  United States of America    |

  @PhaseAll_CD @PhaseAll @APUI450_TC3_Aff_CD @Affiliates_Sprint12_CD @Acceptence_3_CD @QASprint12_CD @Regression
  Scenario Outline: TC3_APUI450_AFF_CD To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User go to Country Option and try to search Country "<Country>"
    Then System will not show any result
    Then User should view the Organization information Before Login in header and fotter sections
    Examples:
      | browser | urlName        |  Country      |
      | Chrome  | AffiliateCDURL |  United States of America    |