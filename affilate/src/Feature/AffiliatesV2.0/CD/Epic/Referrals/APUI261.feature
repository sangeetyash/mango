@Affiliate_InSprint_Referrals_CD @APUI_261_CD @CD
Feature: Affiliate V2.0 Referrals feature for APUI261_CD


#Tester needs to Check with Datawarehouse team for data
  #Account is been assigned as a group affilate
  #Below step def is covered in TC14
#Then User validate the Account Summary Section
  @PhaseAll_CD @PhaseAll @APUI261_TC1_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD @P1
  Scenario Outline:APUI261_TC1_Aff_CD To Verify the user should be able to view the Group Account in dropdown
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User click on Affiliates Group DropDown on Referrals Page
    Then User should be able to view the Total Group option in the Affiliates Group dropdown
    Examples:
      |browser |    urlName     |      UserName                       |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WD_For_DownloadBtn| AffPassword |


    #Tester needs to Check with Datawarehouse team for data
  #Below are Some examples we can validate
  # Steve John: Group Affilate
  # John Middleton : Sub Affilate
  #PFX Account : Sub Affilate
  @PhaseAll_CD @PhaseAll @APUI261_TC3_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint12_CD @P1
  Scenario Outline:APUI261_TC3_Aff_CD To Verify the user should be able to view the Group Account in dropdown
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view Main user been selected by default in Affiliate Group dropdown
    And User click on Affiliates Group DropDown on Referrals Page
    Then User should be able to view the list of options in the Affiliates Group dropdown
    Examples:
      |browser |    urlName     |      UserName                       |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WD_For_DownloadBtn| AffPassword |


    #Tester needs to Check with Datawarehouse team for data
  #Account is been assigned as a group affilate
  @PhaseAll_CD @PhaseAll @APUI261_TC13_Aff_CD @Affiliates_Sprint13_CD @Acceptence_6_CD @QASprint13_CD @P1
  Scenario Outline:APUI261_TC13_Aff_CD To Verify the Organizations details on Referrals section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should be able to view Main user been selected by default in Affiliate Group dropdown
    And User click on Affiliates Group DropDown on Referrals Page
    And User should be able to view the Total Group option in the Affiliates Group dropdown
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      |browser |    urlName     |      UserName                         |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WD_For_DownloadBtn| AffPassword |

    #Tester needs to Check with Datawarehouse team for data
  #Account is not been assigned under any Affilate
  @PhaseAll_CD @PhaseAll @APUI261_TC2_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @QASprint14_CD
  Scenario Outline:APUI261_TC2_Aff_CD To Verify the user should not be able to view the dropdown option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should NOT be able to view any Affilate DropDown on Referrals page
    Examples:
      |browser |    urlName     |      UserName       |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  #Tester needs to Check with Datawarehouse team for data
  #Below are Some examples we can validate
  # Steve John: Group Affilate : 10 Records
  # John Middleton : Sub Affilate : 10 Records
  #PFX Account : Sub Affilate : 10 Records
  #Other Affilate which is not in DropDown : 10 Records
  @PhaseAll_CD @PhaseAll @APUI261_TC4_Aff_CD @Affiliates_Sprint14_CD @Acceptence_3_CD @QASprint14_CD
  Scenario Outline:APUI261_TC4_Aff_CD To Verify the Group User should display the sum of all records when having no view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view Main user been selected by default in Affiliate Group dropdown
    And User note count of records for Referrals Registration Trades for Main user
    And User click on Affiliates Group DropDown on Referrals Page
    Then User should be able to view the list of options in the Affiliates Group dropdown
    Then User Selects Jhon Wick option from the list of options in the Affiliates Group dropdown
    And User note count of records for Referrals Registration Trades for User1
    And User click on Affiliates Group DropDown on Referrals Page
    And User Selects Total Group option from the list of options in the Affiliates Group dropdown
    And User note count of records for Referrals Registration Trades for Total Group
    Then System will display Total Group count equals to sum of all Affiliates count
    Examples:
      |browser |    urlName     |      UserName                         |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WD_For_DownloadBtn| AffPassword |

#Tester needs to Check with Datawarehouse team for data
#Below are Some examples we can validate
# Steve John: Group Affilate : 10 Records
# John Middleton : Sub Affilate : 10 Records
#PFX Account : Sub Affilate : 10 Records
  #Other Affilate which is not in DropDown : 10 Records
  @PhaseAll_CD @PhaseAll @APUI261_TC5_Aff_CD @Affiliates_Sprint12_CD @Acceptence_3_CD @QASprint12_CD
    @Acceptence_3
  Scenario Outline:TC5_APUI261_AFF To Verify the Group User should display the sum of all records when having Summary view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view the summary view user been Affilate been selected by default
    And User click on the Affilate Group DropDown
    Then User should be able to view the list of options on the dropdown for summary view
    And User Selects the Total Group option from the list
    Then System will display a total of records which is sum of all affilates
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_SummaryView | AffPassword |
      #Tester needs to Check with Datawarehouse team for data
#Below are Some examples we can validate
# Steve John: Group Affilate : 10 Records
# John Middleton : Sub Affilate : 10 Records
#PFX Account : Sub Affilate : 10 Records
  #Other Affilate which is not in DropDown : 10 Records
  @PhaseAll_CD @PhaseAll @APUI261_TC6_Aff_CD @Affiliates_Sprint12_CD @Acceptence_3_CD @QASprint12_CD
    @Acceptence_3
  Scenario Outline:TC6_APUI261_AFF To Verify the Group User should display the sum of all records when having detailed view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view the  Steve John Group Affilate been selected by default
    And User click on the Affilate Group DropDown
    Then User should be able to view the list of options on the dropdown
    And User Selects the Total Group option from the list
    Then System will display a total of records which is sum of all affilates
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_Detailed | AffPassword |
      #Tester needs to Check with Datawarehouse team for data
#Below are Some examples we can validate
# Steve John: Group Affilate : 10 Records
# John Middleton : Sub Affilate : 10 Records
#PFX Account : Sub Affilate : 10 Records
  @PhaseAll_CD @PhaseAll @APUI261_TC7_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
    @Acceptence_4
  Scenario Outline:TC7_APUI261_AFF To Verify the Group User should display the  when having no view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view the No view user been Affilate been selected by default
    And User click on the Affilate Group DropDown
    Then User should be able to view the list of options on the dropdown for no view
    And User Selects the Total Group option from the list
    And User clicks on Registration tab
    And User clicks on Trades tab
    Then System will display a total of records which is sum of all affilates
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_NoView | AffPassword |
      #Tester needs to Check with Datawarehouse team for data
#Below are Some examples we can validate
# Steve John: Group Affilate : 10 Records
# John Middleton : Sub Affilate : 10 Records
#PFX Account : Sub Affilate : 10 Records
  @PhaseAll_CD @PhaseAll @APUI261_TC8_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
    @Acceptence_4
  Scenario Outline:TC8_APUI261_AFF To Verify the Group User should display the sum of all records when having Summary view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view the summary view user been Affilate been selected by default
    And User click on the Affilate Group DropDown
    Then User should be able to view the list of options on the dropdown for summary view
    And User Selects the Total Group option from the list
    Then System will display a total of records which is sum of all affilates
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_SummaryView | AffPassword |
      #Tester needs to Check with Datawarehouse team for data
#Below are Some examples we can validate
# Steve John: Group Affilate : 10 Records
# John Middleton : Sub Affilate : 10 Records
#PFX Account : Sub Affilate : 10 Records
  @PhaseAll_CD @PhaseAll @APUI261_TC9_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
    @Acceptence_4
  Scenario Outline:TC9_APUI261_AFF To Verify the Group User should display the sum of all records when having detailed view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view the  Steve John Group Affilate been selected by default
    And User click on the Affilate Group DropDown
    Then User should be able to view the list of options on the dropdown
    And User Selects the Total Group option from the list
    Then System will display a total of records which is sum of all affilates
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_Detailed | AffPassword |
      #Tester needs to Check with Datawarehouse team for data
#Below are Some examples we can validate
# Steve John: Group Affilate : 10 Records
# John Middleton : Sub Affilate : 10 Records
#PFX Account : Sub Affilate : 10 Records
  @PhaseAll_CD @PhaseAll @APUI261_TC10_Aff_CD @Affiliates_Sprint12_CD @Acceptence_5_CD @QASprint12_CD
    @Acceptence_5
  Scenario Outline:TC10_APUI261_AFF To Verify the Sub Affilate count when it has got no view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view the No view user been Affilate been selected by default
    And User click on the Affilate Group DropDown
    Then User should be able to view the list of options on the dropdown for no view
    And User Selects the Total Group option from the list
    And User Selects subaffilate option from the list for no view
    Then System will display a total of records which is sum of all affilates
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_NoView | AffPassword |
  @PhaseAll_CD @PhaseAll @APUI261_TC11_Aff_CD @Affiliates_Sprint12_CD @Acceptence_5_CD @QASprint12_CD
    @Acceptence_5
  Scenario Outline:TC11_APUI261_AFF To Verify the SubAffilate User should display the records when having summary view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view the logged in Affilate been selected by default
    And User click on the Affilate Group DropDown
    Then User should be able to view the list of options on the dropdown for summary option
    And User Selects subaffilate option from the list for summary view
    Then System will display a total of records which is sum of all affilates
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_SummaryView | AffPassword |
  @Phase_CD @Phase @APUI261_TC12_Aff_CD @Affiliates_Sprint12_CD @Acceptence_5_CD @QASprint12_CD
    @Acceptence_5
  Scenario Outline:TC12_APUI261_AFF To Verify the SubAffilate User should display the records when having detailed view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view the  Steve John Group Affilate been selected by default
    And User click on the Affilate Group DropDown
    Then User should be able to view the list of options on the dropdown
    And User Selects subaffilate option from the list
    Then System will display a total of records which is sum of all affilates
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_Detailed | AffPassword |






