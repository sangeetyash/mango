@Affiliate_InSprint_ReferAClient_CD @APUI_249_TORFXOZ @TORFXOZ
Feature: Affiliate V2.0 Refer a client feature for APUI249_TORFXOZ

  @PhaseAll_TORFXOZ @PhaseAll @APUI249_TC1_Aff_TORFXOZ @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI249_TC1_Aff_TORFXOZ To validate System should show the dialing code as +61 for TorFxOz Individual Referals
    Given User launched application through "<browser>"
    And User navigate to Affiliate TorFXOz portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    Then User is able to view Mobile number Country code as +61 by default for TorFXOz
    Examples:
      | browser | urlName             | UserName                 | password                 |Salutation | FirstName | LastName|
      | Chrome  | AffiliateTorFXOzURL | AffiliateTorFXOzUserName | AffiliateTorFXOzPassword |Mr         | Jhon      | Lobo    |


  @PhaseAll_TORFXOZ @PhaseAll @APUI249_TC2_Aff_TORFXOZ @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI249_TC2_Aff_TORFXOZ To validate System should show the dialing code as +61 for TorFxOz Corporate Referals
    Given User launched application through "<browser>"
    And User navigate to Affiliate TorFXOz portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" TradingName "<TradingName>" and Click on Continue
    Then System will navigate to the Contact details Page
    Then User is able to view Mobile number Country code as +61 by default for TorFXOz
    Examples:
      | browser | urlName             | UserName                 | password                 |Salutation | FirstName | LastName|CompanyName      | TradingName|
      | Chrome  | AffiliateTorFXOzURL | AffiliateTorFXOzUserName | AffiliateTorFXOzPassword |Mr         | Jhon      | Lobo    |New Company Ltd. | TorFXOz Traders |



