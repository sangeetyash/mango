@Affiliate_InSprint_AccountSummary_CD @APUI_152_CD @CD
Feature: Affiliate V2.0 Accounts Page for APUI152-CD

  # The Date in this Story is been Dependent on the DataWhereHouse so automation result may change due to this
  @PhaseAll_CD @PhaseAll @APUI152_TC1_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @QASprint14_CD
Scenario Outline:TC1_APUI152_AFF To Verify the Annual Summary table to be displayed
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User Should be landed on the Account Page
    And User is able to view the Annual Summary Section
    Then User will be able to view Annual Summary table with Month Referals Registrations Traded Accounts along with Commission generated and paid amounts
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

#Assume tester is testing on Sept2020
  @PhaseAll_CD @PhaseAll @APUI152_TC2_Aff_CD @Affiliates_Sprint14_CD @Acceptence_2_CD @QASprint14_CD
  Scenario Outline:TC2_APUI152_AFF To Verify the Annual Summary table to be displayed for last 12 months
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User Should be landed on the Account Page
    And User is able to view the Annual Summary Section
    Then User will be able to view Annual Summary table with Month Referals Registrations Traded Accounts along with Commission generated and paid amounts
    Then User will be able to view the data for last twelve months
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

    #Assume tester is testing Report for Feb2020
  @PhaseAll_CD @PhaseAll @APUI152_TC3_Aff_CD @Affiliates_Sprint14_CD @Acceptence_3_CD @QASprint14_CD
  Scenario Outline:TC3_APUI152_AFF To Verify the Annual Summary table display the number of referals
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User Should be landed on the Account Page
    And User is able to view the Annual Summary Section
    Then User will be able to view Annual Summary table with Month Referals Registrations Traded Accounts along with Commission generated and paid amounts
    Then User will be able to view the data for last twelve months
    And User verifies the Referals in Annual Summary
    Then User should be able to get the total number of refral count in particular month
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

        #Assume tester is testing Report for Feb2020
  @PhaseAll_CD @PhaseAll @APUI152_TC4_Aff_CD @Affiliates_Sprint14_CD @Acceptence_4_CD @QASprint14_CD
  Scenario Outline:TC4_APUI152_AFF To Verify the Annual Summary table display the number of registrations
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User Should be landed on the Account Page
    And User is able to view the Annual Summary Section
    Then User will be able to view Annual Summary table with Month Referals Registrations Traded Accounts along with Commission generated and paid amounts
    Then User will be able to view the data for last twelve months
    And User verifies the Registrations in Annual Summary
    Then User should be able to get the total number of Registration count in particular month
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

        #Assume tester is testing Report for Feb2020
  @PhaseAll_CD @PhaseAll @APUI152_TC5_Aff_CD @Affiliates_Sprint14_CD @Acceptence_5_CD @QASprint14_CD
  Scenario Outline:TC5_APUI152_AFF To Verify the Annual Summary table display the number of traded accounts
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User Should be landed on the Account Page
    And User is able to view the Annual Summary Section
    Then User will be able to view Annual Summary table with Month Referals Registrations Traded Accounts along with Commission generated and paid amounts
    Then User will be able to view the data for last twelve months
    And User verifies the Traded Accounts in Annual Summary
    Then User should be able to get the total number of Traded Accounts count in particular month
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

        #Assume tester is testing Report for Feb2020
  @PhaseAll_CD @PhaseAll @APUI152_TC6_Aff_CD @Affiliates_Sprint14_CD @Acceptence_6_CD @QASprint14_CD
  Scenario Outline:TC6_APUI152_AFF To Verify the Annual Summary table display the sum of Commissions when paid option is been selected
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User Should be landed on the Account Page
    And User is able to view the Annual Summary Section
    Then User will be able to view Annual Summary table with Month Referals Registrations Traded Accounts along with Commission generated and paid amounts
    And User Selects the Paid option
    Then User will be able to view the data for last twelve months
    And User verifies the  Commission in Annual Summary
    Then User should be able to get the paid commission amount
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

        #Assume tester is testing Report for Feb2020
  @PhaseAll_CD @PhaseAll @APUI152_TC7_Aff_CD @Affiliates_Sprint14_CD @Acceptence_7_CD @QASprint14_CD
  Scenario Outline:TC7_APUI152_AFF To Verify the Annual Summary table display the sum of Commissions when generated option is been selected
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User Should be landed on the Account Page
    And User is able to view the Annual Summary Section
    Then User will be able to view Annual Summary table with Month Referals Registrations Traded Accounts along with Commission generated and paid amounts
    And User Selects the Generated option
    Then User will be able to view the data for last twelve months
    And User verifies the  Commission in Annual Summary
    Then User should be able to get the paid commission amount
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI152_TC8_Aff_CD @Affiliates_Sprint14_CD @Acceptence_8_CD @QASprint14_CD
  Scenario Outline:TC8_APUI152_AFF To Verify the Annual Summary table to be displayed with proper headers
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User Should be landed on the Account Page
    And User is able to view the Annual Summary Section
    Then User will be able to view Annual Summary table with Month Referals Registrations Traded Accounts along with Commission generated and paid amounts
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

#APUI-801 raised
  @Phase_CD @Phase @APUI152_TC9_Aff_CD @Affiliates_Sprint14_CD @Acceptence_9_CD @QASprint14_CD
  Scenario Outline:TC9_APUI152_AFF To Verify the Annual Summary option should have a Help feature in Commission Option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User Should be landed on the Account Page
    And User is able to view the Annual Summary Section
    Then User will be able to view Annual Summary table with Month Referals Registrations Traded Accounts along with Commission generated and paid amounts
    Then User mouse hovers or clicks on the Question Mark option
    Then User will be able to get more details about the commission section field
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI152_TC10_Aff_CD @Affiliates_Sprint14_CD @Acceptence_10_CD @QASprint14_CD
  Scenario Outline:TC10_APUI152_AFF To Verify the download option to be displayed under account summary section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User Should be landed on the Account Page
    And User is able to view the Annual Summary Section
    Then User will be able to view Annual Summary table with Month Referals Registrations Traded Accounts along with Commission generated and paid amounts
    And User click on Download option
    Then User will be able to get two download option xlsx and pdf
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI152_TC13_Aff_CD @Affiliates_Sprint14_CD @Acceptence_12_CD @QASprint14_CD
  Scenario Outline:TC13_APUI152_AFF To Verify error message to be observed when data is not been pushed from data wharehouse
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User Should be landed on the Account Page
    And User is able to view the Annual Summary Section
    Then User will be able to view Annual Summary table with Month Referals Registrations Traded Accounts along with Commission generated and paid amounts
    Then User will be able to see zero values as no data available
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDNewUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI152_TC14_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @QASprint14_CD
  Scenario Outline:TC14_APUI152_AFF To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User Should be landed on the Account Page
    And User is able to view the Annual Summary Section
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

