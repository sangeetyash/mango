@Affiliate_InSprint_Referrals_CD @APUI_273_CD @CD
Feature: Affiliate V2.0 Referrals feature for APUI273_CD

  #Tester needs to Check with Datawarehouse team for data
  @PhaseAll_CD @PhaseAll @APUI273_TC2_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint12_CD @P1
  Scenario Outline:APUI273_TC2_Aff_CD To Verify the user should be able to view Referrals options when user is been provided with detailed view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view Referrals Registration and Trades section enable on UI
    And By default Referrals option should be selected
    Then User validate UID Type and Date columns for Referrals
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDD | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI273_TC3_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint12_CD @P1
  Scenario Outline:APUI273_TC3_Aff_CD To Verify the user should be able to view Registration options when user is been provided with detailed view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view Referrals Registration and Trades section enable on UI
    And By default Referrals option should be selected
    And User click on Registration tab on Referrals Page
    Then User validate UID Type CustomerID and Date Registered columns for Registrations
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDD | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI273_TC4_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint12_CD @P1
  Scenario Outline:APUI273_TC4_Aff_CD To Verify the user should be able to view Trade options when user is been provided with detailed view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view Referrals Registration and Trades section enable on UI
    And By default Referrals option should be selected
    And User click on Trades tab on Referrals Page
    Then User validate UID Type CustomerID Sold Bought TurnOver Profit Commission and Closed Date columns for Trades
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDD | AffPassword |

#Tester needs to Check with Datawarehouse team for data
  @PhaseAll_CD @PhaseAll @APUI273_TC1_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @QASprint14_CD
  Scenario Outline:APUI273_TC1_Aff_CD To Verify the user should be able to view table when user has detailed view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should be able to view Referrals Registration and Trades section enable on UI
    Then By default Referrals option should be selected
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDD | AffPassword |

#Assume Jan/Feb/March 2020 have got the data
  # Tested in middle of Nov 2020
  #Assume June/July/August 2020 does not have any data
  @PhaseAll_CD @PhaseAll @APUI273_TC8_Aff_CD @Affiliates_Sprint14_CD @Acceptence_5_CD @QASprint14_CD
  Scenario Outline:APUI273_TC8_Aff_CD To Verify the user should be able to view completed months with detailed view been set
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should be able to view Referrals Registration and Trades section enable on UI
    And User is able to view Month dropdown on Referrals page
    Then User "<UserName>" will be able to view latest month for which record is present by default been selected
    And User click on Month Dropdown on Referrals page.
    Then User "<UserName>" will be able to view the Completed months in the dropdown
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDD | AffPassword |

    #Assume Jan/Feb/March 2020 have got the data
  # Tested in middle of Nov 2020
  #Assume June/July/August 2020 does not have any data
  @PhaseAll_CD @PhaseAll @APUI273_TC9_Aff_CD @Affiliates_Sprint14_CD @Acceptence_5_CD @QASprint14_CD
  Scenario Outline:APUI273_TC9_Aff_CD To Verify the user should be able to view latest months with detailed view been set
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should be able to view Referrals Registration and Trades section enable on UI
    And User is able to view Month dropdown on Referrals page
    Then User "<UserName>" will be able to view latest month for which record is present by default been selected
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDD | AffPassword |

      #Assume Jan/Feb/March 2020 have got the data
  # Tested in middle of Nov 2020
  #Assume June/July/August 2020 does not have any data
  @PhaseAll_CD @PhaseAll @APUI273_TC10_Aff_CD @Affiliates_Sprint14_CD @Acceptence_5_CD @QASprint14_CD
  Scenario Outline:APUI273_TC10_Aff_CD To Verify the user should not be able to view months which does not have data with detailed view been set
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should be able to view Referrals Registration and Trades section enable on UI
    And User is able to view Month dropdown on Referrals page
    Then User "<UserName>" will be able to view latest month for which record is present by default been selected
    And User click on Month Dropdown on Referrals page.
    Then User "<UserName>" will be NOT able to view the Completed months in the dropdown for which data is NOT present
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDD | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI273_TC11_Aff_CD @Affiliates_Sprint14_CD @Acceptence_6_CD @QASprint14_CD
  Scenario Outline:APUI273_TC11_Aff_CD To Verify user should not be able to view download option when data is not been available for detailed view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should NOT be able to view the download button on Referrals section
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WOD | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI273_TC12_Aff_CD @Affiliates_Sprint14_CD @Acceptence_6_CD @QASprint14_CD
  Scenario Outline:APUI273_TC12_Aff_CD To Verify user should be able to upload PDF document with detailed view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    Then User should be able to view the download button on Referrals section
    And User click on Download button on Referrals Page
    Then User able to view PDF and XLSX option for downloading Referrals
    And User click on PDF Download button on Referrals Page
    #need to automate below step def
    #Then System should download the Selected file
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDD | AffPassword |

    #Tester needs to Check with Datawarehouse team for data
  @PhaseAll_CD @PhaseAll @APUI273_TC25_Aff_CD @Affiliates_Sprint14_CD @Acceptence_12_CD @QASprint14_CD
  Scenario Outline:APUI273_TC25_Aff_CD To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should be able to view Referrals Registration and Trades section enable on UI
    Then By default Referrals option should be selected
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDD | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI273_TC13_Aff_CD @Affiliates_Sprint14_CD @Acceptence_6_CD @QASprint14_CD
  Scenario Outline:APUI273_TC13_Aff_CD To Verify user should be able to upload XLSX document with detailed view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    Then User should be able to view the download button on Referrals section
    And User click on Download button on Referrals Page
    Then User able to view PDF and XLSX option for downloading Referrals
    And User click on XLSX Download button on Referrals Page
    #need to automate below step def
    #Then System should download the Selected file
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDD | AffPassword |

  #Tester needs to Check with Datawarehouse team for data
#Below are Some examples we can validate
# Steve John: Group Affilate : 10 Records(Including all 3 modules)
# John Middleton : Sub Affilate : 10 Records(Including all 3 modules)
#PFX Account : Sub Affilate : 10 Records(Including all 3 modules)
  @Phase_CD @Phase @APUI273_TC5_Aff_CD @Affiliates_Sprint12_CD @Acceptence_3_CD @QASprint12_CD @Smoke
  Scenario Outline:TC5_APUI273_AFF To Verify the Group User should display the sum of all records when having detailed view option
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

  @PhaseAll_CD @PhaseAll @APUI273_TC6_Aff_CD @Affiliates_Sprint12_CD @Acceptence_3_CD @QASprint12_CD
    @Acceptence_3
  Scenario Outline:TC6_APUI273_AFF To Verify the SubAffilate User should display the records when having detailed view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view the  Steve John Group Affilate been selected by default
    And User click on the Affilate Group DropDown
    Then User should be able to view the list of options on the dropdown
    And User Selects the subaffilate option from the list
    And User clicks on Registration tab
    And User clicks on Trades tab
    Then user should be able to get a total count in Trades section
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_Detailed | AffPassword |

     #Assume that the Customer is having 20 Referrals 10 Registrations and 5 Trades
  @PhaseAll_CD @PhaseAll @APUI273_TC21_Aff_CD @Affiliates_Sprint12_CD @Acceptence_10_CD @QASprint12_CD
    @Acceptence_10
  Scenario Outline:TC21_APUI273_AFF To verify the user should be able to view correct data for the Trades with customer having detailed view set
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User clicks on Trades tab
    Then user should be able to get a total count in Trades section
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_Detailed | AffPassword |
  #Assume that the Customer is having 20 Referrals 10 Registrations and 5 Trades
  @PhaseAll_CD @PhaseAll @APUI273_TC23_Aff_CD @Affiliates_Sprint12_CD @Acceptence_11_CD @QASprint12_CD
    @Acceptence_11
  Scenario Outline:TC23_APUI273_AFF To verify the user should be able to view proper pagination with 10 records for Customer having detailed view set for Refferals option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view Referalls records
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_Detailed | AffPassword |


#Assume that the Customer is having 20 Referrals 10 Registrations and 5 Trades
  @PhaseAll_CD @PhaseAll @APUI273_TC24_Aff_CD @Affiliates_Sprint12_CD @Acceptence_3_CD @QASprint12_CD
    @Acceptence_9
  Scenario Outline:TC24_APUI273_AFF To verify the user should be able to view correct data for the Registration with customer having detailed view set
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User clicks on Registration tab
    Then User should be able to view Registration records
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_Detailed | AffPassword |

  #Manul Team needs to look into the downloaded the file
  @PhaseAll_CD @PhaseAll @APUI273_TC12_Aff_CD @Affiliates_Sprint12_CD @Acceptence_11_CD @QASprint12_CD
    @Acceptence_6
  Scenario Outline:TC12_APUI273_AFF To Verify user should be able to upload PDF document with detailed view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User click on Download option
    Then User will be able to get two download option xlsx and pdf
    And User click on PDF Download button on Referrals Page
     #Below step cannot be run on headless run
    #Then System should upload the Selected file
    Examples:
      |browser |urlName |UserName |password|
      |Chrome |AffilateUrl |UserName |Password|

    #Manul Team needs to look into the downloaded the file
  @PhaseAll_CD @PhaseAll @APUI273_TC13_Aff_CD @Affiliates_Sprint12_CD @Acceptence_11_CD @QASprint12_CD
    @Acceptence_6
  Scenario Outline:TC13_APUI273_AFF To Verify user should be able to upload XLSX document with detailed view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User click on Download option
    Then User will be able to get two download option xlsx and pdf
    And User click on XLSX Download button on Referrals Page
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_Detailed | AffPassword |