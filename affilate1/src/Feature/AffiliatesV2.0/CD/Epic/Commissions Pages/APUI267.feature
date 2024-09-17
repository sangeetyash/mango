@Affiliate_InSprint_CommissionPage_CD @APUI_267_CD @CD
Feature: Affiliate V2.0 Commission feature for APUI267-CD

  @PhaseAll_CD @PhaseAll @APUI267_TC4_Aff_CD @Affiliates_Sprint2_CD @Acceptence_1_CD @QASprint12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC4_APUI267_AFF To Verify the previous month to be displayed on commission header section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    Then User will observe the previous month in statement month in commission header section

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI267_TC9_Aff_CD @Affiliates_Sprint2_CD @Acceptence_1_CD @QASprint12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC9_APUI267_AFF  To Verify To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    Then User should view the Organization information After Login in header and fotter sections

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI267_TC4_Aff_CD @Affiliates_Sprint2_CD @Acceptence_1_CD @QASprint12_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC4_APUI267_AFF To Verify the previous month to be displayed on commission header section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    Then User will observe the previous month in statement month in commission header section

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI267_TC1_Aff_CD @Affiliates_Sprint15_CD @Acceptence_1_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC1_APUI267_AFF To Verify the new commissions to ge generated on commissions page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    Then User verify the Last Commision amount which is been generated last quater

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |
  @PhaseAll_CD @PhaseAll @APUI267_TC3_Aff_CD @Affiliates_Sprint15_CD @Acceptence_1_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC3_APUI267_AFF To Verify the new commissions to ge generated on commissions page
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
      | browser | urlName        | UserName                | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI267_TC5_Aff_CD @Affiliates_Sprint15_CD @Acceptence_3_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC5_APUI267_AFF To Verify the tester should be able to select single month from dropdown
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And User click on Month Dropdown on Commission page.

    Examples:
      | browser | urlName        | UserName                | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_TestBusinessUser | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI267_TC7_Aff_CD @Affiliates_Sprint15_CD @Acceptence_3_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC7_APUI267_AFF To Verify the tester should be able to select multiple month from dropdown
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Generated Radio Button
    And User click on Month Dropdown on Commission page.
    Then User should be able to View multiple values from the list
    Examples:
      | browser | urlName        | UserName                | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_TestBusinessUser | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI267_TC8_Aff_CD @Affiliates_Sprint15_CD @Acceptence_4_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC8_APUI267_AFF To Verify the tester should be able to select multiple statements for the same month from dropdown
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    And User click on Month Dropdown on Commission page.
    Then User should be able to View multiple values from the list


    Examples:
      | browser | urlName        | UserName                | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_TestBusinessUser | AffPassword |



