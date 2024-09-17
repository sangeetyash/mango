@Affiliate_InSprint_AccountSummary_CD @APUI_253_CD @CD
Feature: Affiliate V2.0 Accounts Summary feature for APUI253-CD

@PhaseAll_CD @PhaseAll @APUI253_TC5_Aff_CD @Affiliates_Sprint12_CD @Acceptence_3_CD @QASprint12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
Scenario Outline:TC5_APUI253_AFF To Verify the User Should be able to view the Organzation details
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