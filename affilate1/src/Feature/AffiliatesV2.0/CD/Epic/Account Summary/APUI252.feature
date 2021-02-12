@Affiliate_InSprint_AccountSummary_CD @APUI_252_CD @CD
Feature: Affiliate V2.0 Accounts Summary feature for APUI252-CD

  #Tester needs to get the data from datawarehose team
  @PhaseAll_CD @PhaseAll @APUI252_TC1_Aff_CD @Affiliates_Sprint6_CD @Acceptence_4_CD @QASprint6_CD
    @Acceptence_1
  Scenario Outline:TC1_APUI252_AFF To Verify user should be able to get proper count of traded accounts on account summary section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User should note number of TradedAccounts count on Account Summary Page
   #Individual Customer TestData
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

   #Tester needs to get the data from datawarehose team
  @PhaseAll_CD @PhaseAll @APUI252_TC4_Aff_CD @Affiliates_Sprint6_CD @Acceptence_4_CD @QASprint6_CD
    @Acceptence_2
  Scenario Outline:TC4_APUI252_AFF To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User should note number of TradedAccounts count on Account Summary Page
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |