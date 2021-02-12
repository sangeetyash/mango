@Affiliate_InSprint_CommissionPage_CD @APUI_236_CD @CD
Feature: Affiliate V2.0 Commission feature for APUI236-CD


  @PhaseAll_CD @PhaseAll @APUI236_TC2_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC2_APUI236_AFF TC2_APUI236_AFF To Verify the date on Commission Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC6_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC6_APUI236_AFF To Verify the date on Commission Page when Paid Option is been selected
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    Then User will be able to view the fifth day of next month along with year

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI236_TC10_Aff_CD @Affiliates_Sprint12_CD @Acceptence_3_CD @QASprint12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC10_APUI236_AFF To Verify the Balance amount on Commission Page for Paid option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    Then User will be able to view the fifth day of next month along with year
    Then User verify the Commision Balance on the UI which is yet to be paid

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC16_Aff_CD @Affiliates_Sprint12_CD @Acceptence_3_CD @QASprint12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC16_APUI236_AFF To Verify and compare the last quater generated commissions with the same quater in last yearn
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    Then User verify the Last Commision amount which is been generated last quater
    Then User verify the Last Commision Quarter percentage difference for last year

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC18_Aff_CD @Affiliates_Sprint12_CD @Acceptence_3_CD @QASprint12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC18_APUI236_AFF  To Verify and compare the last month paid commissions with the same month in last year
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    Then User will be able to view the Summary report for Commission section
    Then User verify the Last Commision Month For Paid percentage difference for last year

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC27_Aff_CD @Affiliates_Sprint12_CD @Acceptence_3_CD @QASprint12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC27_APUI236_AFF To Verify the Graph options present for Generated section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    Then User will be able to view the list of months in X Axis and Commsion Count in Y axis
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC28_Aff_CD @Affiliates_Sprint12_CD @Acceptence_3_CD @QASprint12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC28_APUI236_AFF To Verify the year radio button graph for Generated section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    Then User will be able to view the two years as Select option

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI236_TC48_Aff_CD @Affiliates_Sprint12_CD @Acceptence_15_CD @QASprint12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC48_APUI236_AFF To Verify graph to be Observed for Previous year generated section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    Then User will be able to view the two years as Select option
    And User DeSelects Current the Years
    Then User will be able to view Last Year graph
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC1_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC1_APUI236_AFF To Verify the amount tag on Commission Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    Then User will be able to view Zero amount

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC3_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC3_APUI236_AFF To Verify the amount tag on Commission Page when Generated Option is been selected
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    Then User will be able to view Zero amount

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC4_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC4_APUI236_AFF To Verify the date on Commission Page when Generated Option is been selected
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    Then User will be able to view the fifth day of next month along with year

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC5_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC5_APUI236_AFF To Verify the Balance amount on Commission Page for Paid option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    Then User verify the Commision Balance on the UI which is yet to be paid

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC7_Aff_CD @Affiliates_Sprint14_CD @Acceptence_2_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC7_APUI236_AFF To Verify the message to be present when no commission is been generated for a Specific month
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    Then User will be able to view Zero amount
    Then User will be able to view message as no commission is been generated

    Examples:
      | browser | urlName        | UserName                   | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_TestBusinessUser | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC8_Aff_CD @Affiliates_Sprint14_CD @Acceptence_2_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC8_APUI236_AFF To Verify the message to be present when no commission is been paid for a Specific month
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    Then User will be able to view Zero amount
    Then User will be able to view message as no commission is been generated

    Examples:
      | browser | urlName        | UserName                   | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_NoCommissionUser | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC9_Aff_CD @Affiliates_Sprint14_CD @Acceptence_2_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC9_APUI236_AFF To Verify the Balance amount on Commission Page for Generated option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    Then User will be able to view the Balance Amount in Bold letters

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC11_Aff_CD @Affiliates_Sprint14_CD @Acceptence_2_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC11_APUI236_AFF To Verify the Last paid Balance amount on Commission Page for Generated option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    Then User will be able to view the Balance Amount in Bold letters

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC12_Aff_CD @Affiliates_Sprint14_CD @Acceptence_2_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC12_APUI236_AFF To Verify the Last paid Balance amount on Commission Page for Paid option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    Then User will be able to view Zero amount
    Then User will be able to view the Balance Amount in Bold letters

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC13_Aff_CD @Affiliates_Sprint14_CD @Acceptence_2_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC13_APUI236_AFF To Verify the Commission generated in the Last month
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    Then User will be able to view the commission Generated in the last month in Bold letters

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC14_Aff_CD @Affiliates_Sprint14_CD @Acceptence_4_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC14_APUI236_AFF To Verify and compare the last month generated commissions with the same month in last year
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    Then User will be able to view the commission Generated in the last month in Bold letters
    Then User verify the Last Commision Month percentage difference for last year

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC15_Aff_CD @Affiliates_Sprint14_CD @Acceptence_5_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC15_APUI236_AFF To Verify the Commission generated in the Last Quater
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    Then User will be able to view the commission Generated in the last Quater in Bold letters

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC17_Aff_CD @Affiliates_Sprint14_CD @Acceptence_2_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC17_APUI236_AFF  To Verify the Commission Paid in the Last month
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    Then User will be able to view the commission Paid in the last month in Bold letters

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC19_Aff_CD @Affiliates_Sprint14_CD @Acceptence_7_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC19_APUI236_AFF To Verify the Commission Paid in the Last Quater
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    Then User will be able to view the commission Paid in the last Quater in Bold letters

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC20_Aff_CD @Affiliates_Sprint14_CD @Acceptence_7_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC20_APUI236_AFF To Verify and compare the last quater Paid commissions with the same quater in last year
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    Then User verify the Last Commision Quarter For Paid percentage difference for last year

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC21_Aff_CD @Affiliates_Sprint14_CD @Acceptence_7_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC21_APUI236_AFF To Verify the question mark tag under balance section in generated Section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    And User hovers the Mouse on the Question mark near the Balance tag
    Then User Should able to see the details explaing the Details of Balance tag

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC22_Aff_CD @Affiliates_Sprint14_CD @Acceptence_9_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC22_APUI236_AFF To Verify the question mark tag under generated last month section in generated option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    And User hovers the Mouse on the Question mark near the Generated Last Month
    Then User Should able to see the details explaing the Details of Generated Last Month
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC23_Aff_CD @Affiliates_Sprint14_CD @Acceptence_9_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC23_APUI236_AFF To Verify the question mark tag under generated last Quater section in generated option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    And User hovers the Mouse on the Question mark near the Generated Last Quarter
    Then User Should able to see the details explaing the Details of Generated Last Quarter
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC24_Aff_CD @Affiliates_Sprint14_CD @Acceptence_9_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC24_APUI236_AFF To Verify the question mark tag under balance section in Paid Section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    And User hovers the Mouse on the Question mark near the Balance tag
    Then User Should able to see the details explaing the Details of Balance tag

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

  @Phase_CD @Phase @APUI236_TC25_Aff_CD @Affiliates_Sprint14_CD @Acceptence_9_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC25_APUI236_AFF To Verify the question mark tag under Paid last month section in Paid option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    And User hovers the Mouse on the Question mark near the Paid Last Month
    Then User Should able to see the details explaing the Details of Paid Last Month
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

  @Phase_CD @Phase @APUI236_TC26_Aff_CD @Affiliates_Sprint14_CD @Acceptence_9_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC26_APUI236_AFF To Verify the question mark tag under Paid last month section in Paid option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    And User hovers the Mouse on the Question mark near the Paid Last Quarter
    Then User Should able to see the details explaing the Details of Paid Last Quarter
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC29_Aff_CD @Affiliates_Sprint14_CD @Acceptence_6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC29_APUI236_AFF To Verify the graph on UI for previous year for Generated section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    Then User will be able to view the list of months in X Axis and Commsion Count in Y axis
    Then User will be able to view the two years as Select option
    And User DeSelects Current the Years
    Then User will be able to view Last Year graph
    Then User should be able to view single line graph on UI for all 12 months

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC30_Aff_CD @Affiliates_Sprint14_CD @Acceptence_10_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC30_APUI236_AFF To Verify the graph on UI for previous year for Generated section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    Then User will be able to view the list of months in X Axis and Commsion Count in Y axis
    Then User will be able to view the two years as Select option
    And User DeSelects Last the Years
    Then User will be able to view Current Year graph
    Then User should be able to view single line graph on UI for all 12 months

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC31_Aff_CD @Affiliates_Sprint14_CD @Acceptence_11_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC31_APUI236_AFF To Verify the graph on UI for both years for Generated section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    Then User will be able to view the two years as Select option
    Then User should be able to view single line graph on UI for all 12 months

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC32_Aff_CD @Affiliates_Sprint14_CD @Acceptence_6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC32_APUI236_AFF To Verify the Graph options present for Paid section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    Then User will be able to view the two years as Select option for Paid
    Then User will be able to view the list of months in X Axis and Commsion Count in Y axis
    And User DeSelects Paid Current the Years
    Then User should be able to view single line graph on UI for all 12 months
  #hen User will be able to view Last Year graph

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC33_Aff_CD @Affiliates_Sprint14_CD @Acceptence_6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC33_APUI236_AFF To Verify the year radio button graph for Paid section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    Then User will be able to view the two years as Select option for Paid
    Then User should be able to view single line graph on UI for all 12 months

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC34_Aff_CD @Affiliates_Sprint14_CD @Acceptence_6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC34_APUI236_AFF To Verify the graph on UI for previous year for Paid
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    Then User will be able to view the two years as Select option for Paid
    Then User will be able to view the list of months in X Axis and Commsion Count in Y axis
    And User DeSelects Paid Current the Years
    Then User should be able to view single line graph on UI for all 12 months
    #Then User will be able to view Last Year graph

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC35_Aff_CD @Affiliates_Sprint14_CD @Acceptence_10_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC35_APUI236_AFF To Verify the graph on UI for previous year for Paid section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    Then User will be able to view the two years as Select option for Paid
    Then User will be able to view the list of months in X Axis and Commsion Count in Y axis
    And User DeSelects Paid Last the Years
    Then User will be able to view Current Year graph
    Then User should be able to view single line graph on UI for all 12 months

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC36_Aff_CD @Affiliates_Sprint14_CD @Acceptence_11_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC36_APUI236_AFF To Verify the graph on UI for both years for Paid
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    Then User will be able to view the two years as Select option for Paid
    Then User should be able to view single line graph on UI for all 12 months

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC37_Aff_CD @Affiliates_Sprint14_CD @Acceptence_11_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC37_APUI236_AFF To Verify the toggle button for generated Section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    Then User will be able to view the two years as Select option

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC46_Aff_CD @Affiliates_Sprint14_CD @Acceptence_11_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC46_APUI236_AFF To Verify the toggle button for paid Section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    Then User will be able to view the two years as Select option for Paid

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC47_Aff_CD @Affiliates_Sprint15_CD @Acceptence_14_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC47_APUI236_AFF To Verify the toggle button for generated Section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    Then User will be able to view the two years as Select option

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI236_TC49_Aff_CD @Affiliates_Sprint15_CD @Acceptence_15_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC49_APUI236_AFF To Verify graph to be Observed for Previous year Paid section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section


    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |
