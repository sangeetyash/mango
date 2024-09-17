@Affiliate_InSprint_Referrals_CD @APUI_268_CD @CD
Feature: Affiliate V2.0 Referrals feature for APUI268_CD

   #Tester needs to Check with Datawarehouse team for data
  #Tester need to make sure to use proper views are been allocated
  @PhaseAll_CD @PhaseAll @APUI268_TC1_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @QASprint14_CD
  Scenario Outline:APUI268_TC1_Aff_CD To Verify the Graph on UI when Customer is having Summary view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User validate graph is present on UI and by default Referrals Registration Trade graph is shown
    Then User will be able to view 12 months on X axis and values on Y axis
    Examples:
      |browser |    urlName     |      UserName          |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS| AffPassword |

  #Tester needs to Check with Datawarehouse team for data
  #Tester need to make sure to use proper views are been allocated
  @PhaseAll_CD @PhaseAll @APUI268_TC2_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @QASprint14_CD
  Scenario Outline:APUI268_TC2_Aff_CD To Verify the Graph on UI when Customer is having No view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User validate graph is present on UI and by default Referrals Registration Trade graph is shown
    Then User will be able to view 12 months on X axis and values on Y axis
    Examples:
      |browser |    urlName     |      UserName          |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDN| AffPassword |


  #Tester needs to Check with Datawarehouse team for data
  #Tester need to make sure to use proper views are been allocated
  @PhaseAll_CD @PhaseAll @APUI268_TC3_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @QASprint14_CD
  Scenario Outline:APUI268_TC3_Aff_CD To Verify the Graph on UI when Customer is having detailed view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User validate graph is present on UI and by default Referrals Registration Trade graph is shown
    Then User will be able to view 12 months on X axis and values on Y axis
    Examples:
      |browser |    urlName     |      UserName          |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDD| AffPassword |

  #Tester needs to Check with Datawarehouse team for data
  #Tester need to make sure to use proper views are been allocated
  @PhaseAll_CD @PhaseAll @APUI268_TC18_Aff_CD @Affiliates_Sprint14_CD @Acceptence_7_CD @QASprint14_CD
  Scenario Outline:APUI268_TC18_Aff_CD To Verify the Organizations details on Referalls section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User validate graph is present on UI and by default Referrals Registration Trade graph is shown
    And User will be able to view 12 months on X axis and values on Y axis
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      |browser |    urlName     |      UserName          |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDD| AffPassword |

