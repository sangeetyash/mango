@Affiliate_InSprint_AccountSummary_CD @APUI_151_CD @CD
Feature: Affiliate V2.0 Accounts Summary feature for APUI151-CD

  @PhaseAll_CD @PhaseAll @APUI151_TC1_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC1_APUI151_AFF To Verify the currency on Account Page Commission Section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    Then User will be able to view the currency in the amount section

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI151_TC2_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC2_APUI151_AFF To Verify the current month date on Account Page Commission Section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    Then User will be able to view the Current month date in Commission section

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI151_TC3_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun @Smoke
  Scenario Outline:TC3_APUI151_AFF To Verify the future month date on Account Page Commission Section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    Then User will be able to view the Future month date in Commission section

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI151_TC4_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint14_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC4_APUI151_AFF To Verify details when no commision is been for that month
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    Then User will be able to view Zero amount
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI151_TC6_Aff_CD @Affiliates_Sprint14_CD @Acceptence_3_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC6_APUI151_AFF To Verify the Commission Amount received last time
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    And Use Clicks on Paid Radio Button
    Then User verify the Last Commision which is been paid last time

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI151_TC8_Aff_CD @Affiliates_Sprint14_CD @Acceptence_4_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC8_APUI151_AFF Then User verify the Last Commision amount  which is been generated last month
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    Then User verify the Last Commision amount which is been generated last month
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_TestBusinessUser | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI151_TC5_Aff_CD @Affiliates_Sprint12_CD @Acceptence_3_CD @QASprint12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC5_APUI151_AFF TC5_APUI151_AFF To Verify the Commission Amount needs to be Paid till next Month
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    Then User verify the Commision Balance on the UI which is yet to be paid
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI151_TC10_Aff_CD @Affiliates_Sprint12_CD @Acceptence_3_CD @QASprint12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC10_APUI151_AFF To Verify the Commission Amount Generated in Last Quater
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    Then User verify the Last Commision amount which is been generated last quater
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI151_TC11_Aff_CD @Affiliates_Sprint12_CD @Acceptence_5_CD @QASprint12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC11_APUI151_AFF To Verify the Commission Percentage difference for last year
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    Then User verify the Last Commision Quarter percentage difference for last year
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI151_TC20_Aff_CD @Affiliates_Sprint12_CD @Acceptence_9_CD @QASprint12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC20_APUI151_AFF To Verify the Commission Percentage difference for last year
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    And Use Clicks on Generated Radio Button
    Then User will be able to view the list of months in X Axis and Commsion Count in Y axis
    Then User will be able to view the two years as Select option
    And User DeSelects both the Years
    Then User will be able to view blank graph
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  #Acceptence 13 will be Covered in 12
  @PhaseAll_CD @PhaseAll @APUI151_TC24_Aff_CD @Affiliates_Sprint14_CD @Acceptence_15_CD @QASprint14_CD
  Scenario Outline:APUI151_TC24_Aff_CD To Verify the View details details to be displayed on Commission Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    And User clicks on view details button for Commission section on Dashboard
    Then User will be navigated to the Commission section Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI151_TC9_Aff_CD @Affiliates_Sprint14_CD @Acceptence_4_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC9_APUI151_AFF To Verify the Commission Percentage difference for last year
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    Then User verify the Last Commision percentage difference for last year
    Examples:
      | browser | urlName        | UserName                             | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_TestBusinessUser | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI151_TC12_Aff_CD @Affiliates_Sprint14_CD @Acceptence_6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC12_APUI151_AFF To Verify the Commission Amount Generated in the Span of Last Month
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    Then User will be able to view Zero amount
    Then User verify the Last Commision Month percentage difference for last year
    Examples:
      | browser | urlName        | UserName                     | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName          | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI151_TC13_Aff_CD @Affiliates_Sprint14_CD @Acceptence_6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC13_APUI151_AFF To Verify the Commission Amount Generated in the Span of Last Month
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    Then User will be able to view Zero amount
    Then User verify the Last Commision Quarter percentage difference for last year
    Examples:
      | browser | urlName        | UserName                     | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName          | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI151_TC14_Aff_CD @Affiliates_Sprint14_CD @Acceptence_7_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC14_APUI151_AFF To Verify User Should be able to view Balance tooltip
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    And User hovers the Mouse on the Question mark near the Balance tag
    Then User Should able to see the details explaing the Details of Balance tag
    Examples:
      | browser | urlName        | UserName                                      | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_TestBusinessUser          | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI151_TC15_Aff_CD @Affiliates_Sprint14_CD @Acceptence_7_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC15_APUI151_AFF To Verify User Should be able to view Generate Last Month tooltip
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    And User hovers the Mouse on the Question mark near the Generated Last Month
    Then User Should able to see the details explaing the Details of Generated Last Month
    Examples:
      | browser | urlName        | UserName                     | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName          | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI151_TC16_Aff_CD @Affiliates_Sprint14_CD @Acceptence_7_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC16_APUI151_AFF To Verify User Should be able to view Generate Last Quater tooltip
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    And User hovers the Mouse on the Question mark near the Generated Last Quarter
    Then User Should able to see the details explaing the Details of Generated Last Quarter
    Examples:
      | browser | urlName        | UserName                     | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName          | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI151_TC17_Aff_CD @Affiliates_Sprint14_CD @Acceptence_8_CD  @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC17_APUI151_AFF To Verify the Graph X and Y Axis of Generated Graph
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    And Use Clicks on Generated Radio Button
    Then User will be able to view the list of months in X Axis and Commsion Count in Y axis
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI151_TC18_Aff_CD @Affiliates_Sprint14_CD @Acceptence_9_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC18_APUI151_AFF To Verify the Graph lines on the Graph been generated for both the years
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    And Use Clicks on Generated Radio Button
    Then User will be able to view the list of months in X Axis and Commsion Count in Y axis
    Then User will be able to view the two years as Select option
    Then User will be able to view Both Year graph
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI151_TC19_Aff_CD @Affiliates_Sprint14_CD @Acceptence_9_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC19_APUI151_AFF To Verify the Graph lines on the Graph been generated for a single year
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    And Use Clicks on Generated Radio Button
    Then User will be able to view the list of months in X Axis and Commsion Count in Y axis
    Then User will be able to view the two years as Select option
    And User DeSelects Current the Years
    Then User will be able to view Last Year graph

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

    # The Date in this Story is been Dependent on the DataWhereHouse so Manual Team needs look into it
  @PhaseAll_CD @PhaseAll @APUI151_TC21_Aff_CD @Affiliates_Sprint14_CD @Acceptence_9_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC21_APUI151_AFF To Verify the details to be displayed when user hovers mouse over a specific month
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    And Use Clicks on Generated Radio Button
    Then User will be able to view the list of months in X Axis and Commsion Count in Y axis
    Then User will be able to view the two years as Select option
    And User DeSelects Current the Years
    Then User will be able to view Last Year graph
    Then User will be able to see the Commison count with the year along with Month

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

    # The Date in this Story is been Dependent on the DataWhereHouse so Manual Team needs look into it
  @PhaseAll_CD @PhaseAll @APUI151_TC22_Aff_CD @Affiliates_Sprint14_CD @Acceptence_12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC22_APUI151_AFF To Verify the details to be displayed when user hovers mouse over a specific month for 2 years
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    And Use Clicks on Generated Radio Button
    Then User will be able to view the list of months in X Axis and Commsion Count in Y axis
    Then User will be able to view the two years as Select option
    Then User will be able to view Both Year graph
    Then User will be able to see the Commison count with the year along with Month

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

# The Date in this Story is been Dependent on the DataWhereHouse so Manual Team needs look into it
  @PhaseAll_CD @PhaseAll @APUI151_TC23_Aff_CD @Affiliates_Sprint14_CD @Acceptence_9_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC23_APUI151_AFF To Verify the details to be displayed when user hovers mouse over future months
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    And Use Clicks on Generated Radio Button
    Then User will be able to view the list of months in X Axis and Commsion Count in Y axis
    Then User will be able to view the two years as Select option
    And User DeSelects Last the Years
    Then User will be able to view Current Year graph
    Then User will be able to see the Commison count with the year along with Month

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI151_TC25_Aff_CD @Affiliates_Sprint14_CD @Acceptence_9_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC25_APUI151_AFF To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    And Use Clicks on Generated Radio Button
    Then User will be able to view the list of months in X Axis and Commsion Count in Y axis
    Then User will be able to view the two years as Select option
    And User DeSelects Last the Years
    Then User will be able to view Current Year graph
    Then User will be able to see the Commison count with the year along with Month
    Then User should view the Organization information After Login in header and fotter sections

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

