@Affiliate_InSprint_CommissionPage_CD @APUI_255_CD @CD
Feature: Affiliate V2.0 Commission feature for APUI255-CD

  #Assume there are no new traded accounts
  @PhaseAll_CD @PhaseAll @APUI255_TC10_Aff_CD @Affiliates_Sprint14_CD @Acceptence_3_CD @QASprint14_CD
  Scenario Outline:APUI255_TC10_Aff_CD To Verify blank values to be Observed when fields for your commission statements when generated option is been selected
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    And User should NOT observe the Statement Month under Your Commission Statement
    Then User will be able to view Zero amount Balance Gen Last Month and Gen Last Qtr
    Examples:
      |browser |    urlName     |      UserName                 |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_NewUser   | AffPassword |

  #Tester needs to capture all the headers in secondlast option
  @PhaseAll_CD @PhaseAll @APUI255_TC18_Aff_CD @Affiliates_Sprint14_CD @Acceptence_5_CD @QASprint14_CD
  Scenario Outline:APUI255_TC18_Aff_CD To Verify the header when tier 1 is been Selected for Generated Commissions
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    And USer observe Your Commission Statement on Commissions page in bold
    Then User Observe the value of Statement Month under Your Commission Statement in bold letter
    Then User will be able to view the previous month of paid date into Statement month
    And User Observe the FirstTier options of the statement which is been Selected
    And User Validates the Transaction Headers of FirstTier
    Then User will Validate Date ClientID/DealNumber UID Turnover CurrencyPair Profit Commission and Paid column present
    #Not adding below line as it will be covered into another test case of this story
    #Then User will validate that the tier1 fields should be of the same month which is been selected in been by default selected
     Examples:
      |browser |    urlName     |      UserName         |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName   | AffPassword |

  #Tester needs to capture all the headers in secondlast option
  @PhaseAll_CD @PhaseAll @APUI255_TC19_Aff_CD @Affiliates_Sprint14_CD @Acceptence_5_CD @QASprint14_CD
  Scenario Outline:APUI255_TC19_Aff_CD To Verify the header when tier 1 is been Selected for Paid Commissions
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    And USer observe Your Commission Statement on Commissions page in bold
    Then User Observe the value of Statement Month under Your Commission Statement in bold letter
    Then User will be able to view the previous month of paid date into Statement month
    And User Observe the FirstTier options of the statement which is been Selected
    And User Validates the Transaction Headers of FirstTier
    Then User will Validate Date ClientID/DealNumber UID Turnover CurrencyPair Profit Commission and Paid column present
    #Not adding below line as it will be covered into another test case of this story
    #Then User will validate that the tier1 fields should be of the same month which is been selected in been by default selected

    Examples:
      |browser |    urlName     |      UserName         |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName   | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI255_TC7_Aff_CD @Affiliates_Sprint15_CD @Acceptence_2_CD
  Scenario Outline:APUI255_TC7_Aff_CD To Verify Paid Date under Your Commission Statement month section when user first opens the commissions page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    And USer observe Your Commission Statement on Commissions page in bold
    Then User Observe the value of Statement Month under Your Commission Statement in bold letter
    Then User will be able to view the previous month of paid date into Statement month
    Then User will be able to view the fifth day of next month along with year

     Examples:
      |browser |    urlName     |      UserName         |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName   | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI255_TC12_Aff_CD @Affiliates_Sprint14_CD @Acceptence_5_CD @QASprint14_CD
  Scenario Outline:APUI255_TC12_Aff_CD To Verify the tier1 should be as per the month been selected for Genertated commission
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    And USer observe Your Commission Statement on Commissions page in bold
    Then User Observe the value of Statement Month under Your Commission Statement in bold letter
    And User Observe the FirstTier options of the statement which is been Selected
    Then User will validate the tier1 Date field record should be match with the paid date
    Examples:
      |browser |    urlName     |      UserName         |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_TestBusinessUser   | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI255_TC13_Aff_CD @Affiliates_Sprint14_CD @Acceptence_4_CD @QASprint14_CD @Smoke
  Scenario Outline:APUI255_TC13_Aff_CD To Verify the tier1 should be as per the month been selected for Paid commission
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    And USer observe Your Commission Statement on Commissions page in bold
    Then User Observe the value of Statement Month under Your Commission Statement in bold letter
    And User Observe the FirstTier options of the statement which is been Selected
    Then User will validate the tier1 Date field record should be match with the paid date
    Examples:
      |browser |    urlName     |      UserName         |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_TestBusinessUser   | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI255_TC14_Aff_CD @Affiliates_Sprint15_CD @Acceptence_4_CD
  Scenario Outline:APUI255_TC14_Aff_CD To Verify the header when tier 1 is been Selected for Generated Commissions
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    And USer observe Your Commission Statement on Commissions page in bold
    Then User Observe the value of Statement Month under Your Commission Statement in bold letter
    And User Observe the FirstTier options of the statement which is been Selected
      Examples:
      |browser |    urlName     |      UserName         |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_TestBusinessUser   | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI255_TC15_Aff_CD @Affiliates_Sprint15_CD @Acceptence_4_CD
  Scenario Outline:APUI255_TC15_Aff_CD To Verify the values for tier1 Paid Section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    And USer observe Your Commission Statement on Commissions page in bold
    Then User Observe the value of Statement Month under Your Commission Statement in bold letter
    And User Observe the FirstTier options of the statement which is been Selected
    Examples:
      |browser |    urlName     |      UserName                          |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_TestBusinessUser   | AffPassword |

  #Awaiting to resolve APUI-851
  @Phase_CD @Phase @APUI255_TC21_Aff_CD @Affiliates_Sprint14_CD @Acceptence_6_CD @QASprint14_CD
  Scenario Outline:APUI255_TC21_Aff_CD To Verify the Help feature to be available for tier1 Generated Section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    And USer observe Your Commission Statement on Commissions page in bold
    Then User Observe the value of Statement Month under Your Commission Statement in bold letter
    And User Observe the FirstTier options of the statement which is been Selected
    And User Validates the Transaction Headers of FirstTier
    Then User will Validate Date ClientID/DealNumber UID Turnover CurrencyPair Profit Commission and Paid column present
    Then User Should be able to view the question mark on Date Deal Number Turnover and Profit section

    Examples:
      |browser |    urlName     |      UserName                          |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_TestBusinessUser   | AffPassword |

   #Awaiting to resolve APUI-851
  @Phase_CD @Phase @APUI255_TC22_Aff_CD @Affiliates_Sprint15_CD @Acceptence_6_CD
  Scenario Outline:APUI255_TC22_Aff_CD To Verify the Help feature to be available for tier1 Paid Section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    And USer observe Your Commission Statement on Commissions page in bold
    Then User Observe the value of Statement Month under Your Commission Statement in bold letter
    And User Observe the FirstTier options of the statement which is been Selected
    And User Validates the Transaction Headers of FirstTier
    Then User will Validate Date ClientID/DealNumber UID Turnover CurrencyPair Profit Commission and Paid column present
    Then User Should be able to view the question mark on Date Deal Number Turnover and Profit section

    Examples:
      |browser |    urlName     |      UserName                          |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_TestBusinessUser   | AffPassword |

#Awaiting to resolve APUI-968 - Resolved
  @PhaseAll_CD @PhaseAll @APUI255_TC24_Aff_CD @Affiliates_Sprint15_CD @Acceptence_7_CD
  Scenario Outline:APUI255_TC24_Aff_CD Verify the system should display ony 10 records to be displayed in tier1 generated section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    And USer observe Your Commission Statement on Commissions page in bold
    Then User Observe the value of Statement Month under Your Commission Statement in bold letter
    And User Observe the FirstTier options of the statement which is been Selected
    And User Validates the Transaction Headers of FirstTier
    Then User will Validate Date ClientID/DealNumber UID Turnover CurrencyPair Profit Commission and Paid column present
    And User confirms that system should only display 10 records in one page
    And User clicks on forward option And User will be able to view next page records

    Examples:
      |browser |    urlName     |      UserName                          |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_TestBusinessUser   | AffPassword |

#Awaiting to resolve APUI-968 - Resolved
  @PhaseAll_CD @PhaseAll @APUI255_TC25_Aff_CD @Affiliates_Sprint15_CD @Acceptence_7_CD
  Scenario Outline:APUI255_TC25_Aff_CD To Verify the system should display ony 10 records to be displayed in tier1 paid section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    And USer observe Your Commission Statement on Commissions page in bold
    Then User Observe the value of Statement Month under Your Commission Statement in bold letter
    And User Observe the FirstTier options of the statement which is been Selected
    And User Validates the Transaction Headers of FirstTier
    Then User will Validate Date ClientID/DealNumber UID Turnover CurrencyPair Profit Commission and Paid column present
    And User confirms that system should only display 10 records in one page
    And User clicks on forward option And User will be able to view next page records

    Examples:
      |browser |    urlName     |      UserName                          |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_TestBusinessUser   | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI255_TC27_Aff_CD @Affiliates_Sprint15_CD @Acceptence_7_CD
  Scenario Outline:APUI255_TC27_Aff_CD To Verify the download option to be displayed for tier1 Generted commission statement
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    And USer observe Your Commission Statement on Commissions page in bold
    Then User Observe the value of Statement Month under Your Commission Statement in bold letter
    And User Observe the FirstTier options of the statement which is been Selected
    And User click on Download option
    Then User will be able to get two download option xlsx and pdf
    Examples:
      |browser |    urlName     |      UserName                          |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_TestBusinessUser   | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI255_TC28_Aff_CD @Affiliates_Sprint15_CD @Acceptence_7_CD
  Scenario Outline:APUI255_TC28_Aff_CD To Verify the download option to be displayed for tier1 paid commission statement
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    And USer observe Your Commission Statement on Commissions page in bold
    Then User Observe the value of Statement Month under Your Commission Statement in bold letter
    And User Observe the FirstTier options of the statement which is been Selected
    And User click on Download option
    Then User will be able to get two download option xlsx and pdf
    Examples:
      |browser |    urlName     |      UserName                          |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_TestBusinessUser   | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI255_TC36_Aff_CD @Affiliates_Sprint15_CD @Acceptence_11_CD
  Scenario Outline:APUI255_TC36_Aff_CD To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    And USer observe Your Commission Statement on Commissions page in bold
    Then User Observe the value of Statement Month under Your Commission Statement in bold letter
    And User Observe the FirstTier options of the statement which is been Selected
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      |browser |    urlName     |      UserName                          |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_TestBusinessUser   | AffPassword |












