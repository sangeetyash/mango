@Affiliate_InSprint_Referrals_CD @APUI_270_CD @CD
Feature: Affiliate V2.0 Referrals feature for APUI270_CD


  @PhaseAll_CD @PhaseAll @APUI270_TC13_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline:APUI270_TC13_Aff_CD To Verify the user should be able to view the Current month by default been selected when having no view set
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should be able to view Referrals Registration and Trades section on UI
    And By default Referrals option should be selected
    And User is able to view Month dropdown on Referrals page
    Then User will be able to view latest month by default been selected for Month dropdown on Referrals page
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDN | AffPassword |

#Assume Jan/Feb/March 2020 have got the data
  # Tested in middle of Nov 2020
  #Assume June/July/August 2020 does not have any data
  #Day1 scenario
  @PhaseAll_CD @PhaseAll @APUI270_TC16_Aff_CD @Affiliates_Sprint14_CD @Acceptence_5_CD @QASprint14_CD
  Scenario Outline:APUI270_TC16_Aff_CD To Verify the user should be able to view completed months with summary view been set
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should be able to view Referrals Registration and Trades section on UI
    And By default Referrals option should be selected
    And User is able to view Month dropdown on Referrals page
    Then User will be able to view latest month by default been selected for Month dropdown on Referrals page
    And User click on Month Dropdown on Referrals page.
    Then User should be able to view Completed months in Month dropdown on Referrals page
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI270_TC21_Aff_CD @Affiliates_Sprint12_CD @Acceptence_6_CD @QASprint12_CD @P1
  Scenario Outline:APUI270_TC21_Aff_CD To Verify user should not be able to view download option when data is not been available for no view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should NOT be able to view the download button on Referrals section
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WON | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI270_TC23_Aff_CD @Affiliates_Sprint12_CD @Acceptence_6_CD @QASprint12_CD @P1
  Scenario Outline:APUI270_TC23_Aff_CD To Verify user should be able to download PDF document with no view
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
    #Below step cannot be run on headless run
    #Then System should upload the Selected file
    Examples:
      |browser |    urlName     |      UserName                        |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WD_For_DownloadBtn | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI270_TC25_Aff_CD @Affiliates_Sprint12_CD @Acceptence_6_CD @QASprint12_CD @P1
  Scenario Outline:APUI270_TC25_Aff_CD To Verify user should be able to upload XLSX document with no view
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
     #Below step cannot be run on headless run
    #Then System should upload the Selected file
    Examples:
      |browser |    urlName     |      UserName                        |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WD_For_DownloadBtn | AffPassword |


#Tester needs to Check with Datawarehouse team for data
  @PhaseAll_CD @PhaseAll @APUI270_TC1_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI270_TC1_Aff_CD To Verify the user should be able to view table when user has summary view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    And User will be navigated to the Referrals section Page
    Then User should be able to view Referrals Registration and Trades section enable on UI
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI270_TC2_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI270_TC2_Aff_CD To Verify the user should be able to view table when user has no view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    And User will be navigated to the Referrals section Page
    Then User should be able to view Referrals Registration and Trades section enable on UI
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDN | AffPassword |

    #Tester needs to Check with Datawarehouse team for data
  @PhaseAll_CD @PhaseAll @APUI270_TC3_Aff_CD @Affiliates_Sprint13_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline:APUI270_TC3_Aff_CD To Verify the user should be able to view Referrals options when user is been provided with Summary view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view Referrals Registration and Trades section enable on UI
    And By default Referrals option should be selected
    And User click on Registration tab on Referrals Page
    Then User validate CustomerName Type and Date Registered columns for Registrations
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI270_TC4_Aff_CD @Affiliates_Sprint13_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline:APUI270_TC4_Aff_CD To Verify the user should be able to view Registration options when user is been provided with Summary view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view Referrals Registration and Trades section enable on UI
    And By default Referrals option should be selected
    And User click on Registration tab on Referrals Page
    Then User validate CustomerName Type and Date Registered columns for Registrations
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI270_TC5_Aff_CD @Affiliates_Sprint13_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline:APUI270_TC5_Aff_CD To Verify the user should be able to view Trade options when user is been provided with Summary view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view Referrals Registration and Trades section enable on UI
    And By default Referrals option should be selected
    And User click on Trades tab on Referrals Page
    Then User validate CustomerName Type and Commission Closed Date columns for Trades
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

  #Tester needs to Check with Datawarehouse team for data
  @PhaseAll_CD @PhaseAll @APUI270_TC6_Aff_CD @Affiliates_Sprint13_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline:APUI270_TC6_Aff_CD To Verify the user should be able to view Referrals options when user is been provided with No view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view Referrals Registration and Trades section enable on UI
    And By default Referrals option should be selected
    And User click on Registration tab on Referrals Page
    Then User validate CustomerName Type and Date Registered columns for Registrations
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDN | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI270_TC7_Aff_CD @Affiliates_Sprint13_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline:APUI270_TC7_Aff_CD To Verify the user should be able to view Registration options when user is been provided with No view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view Referrals Registration and Trades section enable on UI
    And By default Referrals option should be selected
    And User click on Registration tab on Referrals Page
    Then User validate CustomerName Type and Date Registered columns for Registrations
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDN | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI270_TC8_Aff_CD @Affiliates_Sprint13_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline:APUI270_TC8_Aff_CD To Verify the user should be able to view Trade options when user is been provided with No view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view Referrals Registration and Trades section enable on UI
    And By default Referrals option should be selected
    And User click on Trades tab on Referrals Page
    Then User validate CustomerName Type and Closed Date columns for Trades
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDN | AffPassword |

    #Tester needs to Check with Datawarehouse team for data
  @PhaseAll_CD @PhaseAll @APUI270_TC47_Aff_CD @Affiliates_Sprint13_CD @Acceptence_12_CD @QASprint13_CD
  Scenario Outline:APUI270_TC47_Aff_CD To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view Referrals Registration and Trades section enable on UI
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDN | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI270_TC14_Aff_CD @Affiliates_Sprint14_CD @Acceptence_4_CD @QASprint14_CD
  Scenario Outline:APUI270_TC14_Aff_CD To Verify the user should be able to view the Current month by default been selected when having summary view set
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should be able to view Referrals Registration and Trades section on UI
    And By default Referrals option should be selected
    And User is able to view Month dropdown on Referrals page
    Then User will be able to view latest month by default been selected for Month dropdown on Referrals page
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

#Assume Jan/Feb/March 2020 have got the data
  # Tested in middle of Nov 2020
  #Assume June/July/August 2020 does not have any data
  @PhaseAll_CD @PhaseAll @APUI270_TC15_Aff_CD @Affiliates_Sprint14_CD @Acceptence_5_CD @QASprint14_CD
  Scenario Outline:APUI270_TC15_Aff_CD To Verify the user should be able to view completed months with no view been set
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should be able to view Referrals Registration and Trades section on UI
    And By default Referrals option should be selected
    And User is able to view Month dropdown on Referrals page
    Then User will be able to view latest month by default been selected for Month dropdown on Referrals page
    And User click on Month Dropdown on Referrals page.
    Then User should be able to view Completed months in Month dropdown on Referrals page
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDN | AffPassword |

    #Assume Jan/Feb/March 2020 have got the data
  # Tested in middle of Nov 2020
  #Assume June/July/August 2020 does not have any data
  @PhaseAll_CD @PhaseAll @APUI270_TC17_Aff_CD @Affiliates_Sprint14_CD @Acceptence_5_CD @QASprint14_CD
  Scenario Outline:APUI270_TC17_Aff_CD To Verify the user should be able to view current months with no view been set
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should be able to view Referrals Registration and Trades section on UI
    And By default Referrals option should be selected
    And User is able to view Month dropdown on Referrals page
    Then User will be able to view latest month by default been selected for Month dropdown on Referrals page
    And User click on Month Dropdown on Referrals page.
    Then User should be able to view Completed and latest months in Month dropdown on Referrals page
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDN | AffPassword |

    #Assume Jan/Feb/March 2020 have got the data
  # Tested in middle of Nov 2020
  #Assume June/July/August 2020 does not have any data
  @PhaseAll_CD @PhaseAll @APUI270_TC18_Aff_CD @Affiliates_Sprint14_CD @Acceptence_5_CD @QASprint14_CD
  Scenario Outline:APUI270_TC18_Aff_CD To Verify the user should be able to view current months with summary view been set
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should be able to view Referrals Registration and Trades section on UI
    And By default Referrals option should be selected
    And User is able to view Month dropdown on Referrals page
    Then User will be able to view latest month by default been selected for Month dropdown on Referrals page
    And User click on Month Dropdown on Referrals page.
    Then User should be able to view Completed and latest months in Month dropdown on Referrals page
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

  #Assume Jan/Feb/March 2020 have got the data
  # Tested in middle of Nov 2020
  #Assume June/July/August 2020 does not have any data
  @PhaseAll_CD @PhaseAll @APUI270_TC19_Aff_CD @Affiliates_Sprint14_CD @Acceptence_5_CD @QASprint14_CD
  Scenario Outline:APUI270_TC19_Aff_CD To Verify the user should not be able to view months which does not have data with no view been set
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should be able to view Referrals Registration and Trades section on UI
    And By default Referrals option should be selected
    And User is able to view Month dropdown on Referrals page
    Then User will be able to view latest month by default been selected for Month dropdown on Referrals page
    And User click on Month Dropdown on Referrals page.
    Then User should be NOT able to view months in Month dropdown for which data is not present on Referrals page
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDN | AffPassword |

    #Assume Jan/Feb/March 2020 have got the data
  # Tested in middle of Nov 2020
  #Assume June/July/August 2020 does not have any data
  @PhaseAll_CD @PhaseAll @APUI270_TC20_Aff_CD @Affiliates_Sprint14_CD @Acceptence_5_CD @QASprint14_CD
  Scenario Outline:APUI270_TC20_Aff_CD To Verify the user should not be able to view months which does not have data with summary view been set
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should be able to view Referrals Registration and Trades section on UI
    And By default Referrals option should be selected
    And User is able to view Month dropdown on Referrals page
    Then User will be able to view latest month by default been selected for Month dropdown on Referrals page
    And User click on Month Dropdown on Referrals page.
    Then User should be NOT able to view months in Month dropdown for which data is not present on Referrals page
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI270_TC22_Aff_CD @Affiliates_Sprint14_CD @Acceptence_6_CD @QASprint14_CD
  Scenario Outline:APUI270_TC22_Aff_CD To Verify user should not be able to view download option when data is not been available for summary view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should NOT be able to view the download button on Referrals section
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WOS | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI270_TC24_Aff_CD @Affiliates_Sprint15_CD @Acceptence_6_CD @QASprint15_CD
  Scenario Outline:APUI270_TC24_Aff_CD To Verify user should be able to upload PDF document with summary view
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
    #Below step cannot be run on headless run
    #Then System should upload the Selected file
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI270_TC26_Aff_CD @Affiliates_Sprint15_CD @Acceptence_6_CD @QASprint15_CD
  Scenario Outline:APUI270_TC26_Aff_CD To Verify user should be able to upload XLSX document with summary view
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
    #Below step cannot be run on headless run
    #Then System should upload the Selected file
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI270_TC31_Aff_CD @Affiliates_Sprint15_CD @Acceptence_8_CD
  Scenario Outline:APUI270_TC31_Aff_CD To verify the user should be able to view correct data for the Referrals with customer having No view set
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    Then User should be able to view respective records for Referrals

    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDN | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI270_TC32_Aff_CD @Affiliates_Sprint15_CD @Acceptence_8_CD
  Scenario Outline:APUI270_TC32_Aff_CD To verify the user should be able to view correct data for the Referrals with customer having summary view set
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    Then User should be able to view respective records for Referrals

    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI270_TC35_Aff_CD @Affiliates_Sprint15_CD @Acceptence_9_CD
  Scenario Outline:APUI270_TC35_Aff_CD To verify the user should be able to view correct data for the Registration with customer having No view set
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    And User click on Registration tab on Referrals Page
    Then User should be able to view respective records for Registration

    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDN | AffPassword |

         #Tester needs to Check with Datawarehouse team for data
#Below are Some examples we can validate
# Steve John: Group Affilate : 10 Records(Including all 3 modules)
# John Middleton : Sub Affilate : 10 Records(Including all 3 modules)
#PFX Account : Sub Affilate : 10 Records(Including all 3 modules)
  @PhaseAll_CD @PhaseAll @APUI270_TC9_Aff_CD @Affiliates_Sprint13_CD @Acceptence_12_CD @QASprint13_CD
    @Acceptence_3
  Scenario Outline:TC9_APUI270_AFF To Verify the Group User should display the sum of all records when having no view option
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
# Steve John: Group Affilate : 10 Records(Including all 3 modules)
# John Middleton : Sub Affilate : 10 Records(Including all 3 modules)
#PFX Account : Sub Affilate : 10 Records(Including all 3 modules)
  @PhaseAll_CD @PhaseAll @APUI270_TC10_Aff_CD @Affiliates_Sprint13_CD @Acceptence_12_CD @QASprint13_CD
    @Acceptence_3
  Scenario Outline:TC10_APUI270_AFF To Verify the Group User should display the sum of all records when having Summary view option
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
    And User clicks on Registration tab
    And User clicks on Trades tab
    Then System will display a total of records which is sum of all affilates
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_SummaryView | AffPassword |
      #Tester needs to Check with Datawarehouse team for data
#Below are Some examples we can validate
# Steve John: Group Affilate : 10 Records(Including all 3 modules)
# John Middleton : Sub Affilate : 10 Records(Including all 3 modules)
#PFX Account : Sub Affilate : 10 Records(Including all 3 modules)
  @PhaseAll_CD @PhaseAll @APUI270_TC11_Aff_CD @Affiliates_Sprint13_CD @Acceptence_12_CD @QASprint13_CD
    @Acceptence_3
  Scenario Outline:TC11_APUI270_AFF  To Verify the SubAffilate User should display the records when having No view option
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
    And User clicks on Registration tab
    And User clicks on Trades tab
    Then System will display a total of records which is sum of all affilates
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_NoView | AffPassword |
  @PhaseAll_CD @PhaseAll @APUI270_TC12_Aff_CD @Affiliates_Sprint12_CD @Acceptence_3_CD @QASprint12_CD
    @Acceptence_3
  Scenario Outline:TC12_APUI270_AFF To Verify the SubAffilate User should display the records when having summary view option
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
    And User clicks on Registration tab
    And User clicks on Trades tab
    Then user should be able to get a total count in Trades section
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_SummaryView | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI270_TC43_Aff_CD @Affiliates_Sprint15_CD @Acceptence_11_CD
  Scenario Outline:APUI270_TC43_Aff_CD To verify the user should be able to view proper pagination with 10 records for Customer having no view set for Refferals option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    And User confirms that system should only display 10 records in one page

    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_NoView | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI270_TC44_Aff_CD @Affiliates_Sprint15_CD @Acceptence_11_CD
  Scenario Outline:APUI270_TC44_Aff_CD To verify the user should be able to view proper pagination with 10 records for Customer having summary view set for Refferals option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    And User confirms that system should only display 10 records in one page

    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_SummaryView | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI270_TC45_Aff_CD @Affiliates_Sprint15_CD @Acceptence_11_CD
  Scenario Outline:APUI270_TC45_Aff_CD To Verify the user should be able to view Referrals options when user is been provided with Summary view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view Referrals Registration and Trades section enable on UI
    And By default Referrals option should be selected
    And User click on Registration tab on Referrals Page
    And User confirms that system should only display 10 records in one page
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_NoView | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI270_TC46_Aff_CD @Affiliates_Sprint15_CD @Acceptence_11_CD @Smoke
  Scenario Outline:APUI270_TC46_Aff_CD To Verify the user should be able to view Referrals options when user is been provided with Summary view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view Referrals Registration and Trades section enable on UI
    And By default Referrals option should be selected
    And User click on Registration tab on Referrals Page
    #And User confirms that system should only display 10 records in one page
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_SummaryView | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI270_TC36_Aff_CD @Affiliates_Sprint15_CD @Acceptence_9_CD
  Scenario Outline:APUI270_TC36_Aff_CD To verify the user should be able to view correct data for the Registration with customer having summary view set
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    And User click on Registration tab on Referrals Page
    Then User should be able to view respective records for Registration

    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI270_TC39_Aff_CD @Affiliates_Sprint15_CD @Acceptence_9_CD
  Scenario Outline:APUI270_TC39_Aff_CD To verify the user should be able to view correct data for the Trades with customer having No view set
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    And User click on Trades tab on Referrals Page
    Then User should be able to view respective records for Trades

    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDN | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI270_TC40_Aff_CD @Affiliates_Sprint15_CD @Acceptence_9_CD
  Scenario Outline:APUI270_TC40_Aff_CD To verify the user should be able to view correct data for the Trades with customer having Summary set
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    And User click on Trades tab on Referrals Page
    Then User should be able to view respective records for Trades

    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |


