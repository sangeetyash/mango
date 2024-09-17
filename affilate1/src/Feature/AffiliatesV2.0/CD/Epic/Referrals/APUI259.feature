@Affiliate_InSprint_Referrals_CD @APUI_259_CD @CD
Feature: Affiliate V2.0 Referrals feature for APUI259_CD

  #Tester needs to Check with Datawarehouse team for data
 @APUI259_TC1_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline:APUI259_TC1_Aff_CD To Verify the your Referrals count on Account summary Section to be displayed on Referrals Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should note number of Referrals count on Account Summary Page
    Then User should note number of TradedAccounts count on Account Summary Page
   #More steps left which cant be automates at this moment
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

