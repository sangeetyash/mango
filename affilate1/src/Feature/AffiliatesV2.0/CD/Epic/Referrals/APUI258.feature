@Affiliate_InSprint_Referrals_CD @APUI_258_CD @CD
Feature: Affiliate V2.0 Referrals feature for APUI258_CD

  @PhaseAll_CD @PhaseAll @APUI258_TC1_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline:APUI258_TC1_Aff_CD To Verify the Referals option under summary view for Customer who has provided with summary view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    Then User validate CustomerName Type and Date columns for Referrals
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI258_TC2_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline:APUI258_TC2_Aff_CD To Verify the Registration option under summary view for Customer who has provided with summary view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    And User click on Registration tab on Referrals Page
    Then User validate CustomerName Type and Date Registered columns for Registrations
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI258_TC3_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline:APUI258_TC3_Aff_CD To Verify the Trade option under summary view for Customer who has provided with summary view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    And User click on Trades tab on Referrals Page
    Then User validate CustomerName Type and Commission Closed Date columns for Trades
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI258_TC4_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline:APUI258_TC4_Aff_CD To Verify the Referals option under summary view for Customer who has provided with no view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    And User click on Referrals tab on Referrals Page
    Then User validate CustomerName Type and Date columns for Referrals
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDN | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI258_TC5_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline:APUI258_TC5_Aff_CD To Verify the Registration option under summary view for Customer who has provided with no view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    And User click on Registration tab on Referrals Page
    Then User validate CustomerName Type and Date Registered columns for Registrations
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDN | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI258_TC6_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline:APUI258_TC6_Aff_CD To Verify the Trade option under summary view for Customer who has provided with summary no view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    And User click on Trades tab on Referrals Page
    Then User validate CustomerName Type and Closed Date columns for Trades
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDN | AffPassword |

  #Tester needs to take data who does not have any refferals
  @PhaseAll_CD @PhaseAll @APUI258_TC7_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline:APUI258_TC7_Aff_CD To Verify the download option to be missing when no record is been present on Referalls Section with Summary view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should NOT be able to view the download button on Referrals section
    Then User should NOT be able to view any sections on Settings page
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WOS | AffPassword |

    #Tester needs to take data who does not have any refferals
  @PhaseAll_CD @PhaseAll @APUI258_TC8_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline:APUI258_TC8_Aff_CD To Verify the download option to be missing when no record is been present on Registration Section with Summary view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should NOT be able to view the download button on Referrals section
    Then User should NOT be able to view any sections on Settings page
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WOS | AffPassword |

 #Tester needs to take data who does not have any refferals
  @PhaseAll_CD @PhaseAll @APUI258_TC9_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline:APUI258_TC9_Aff_CD To Verify the download option to be missing when no record is been present on Trade Section with Summary view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should NOT be able to view the download button on Referrals section
    Then User should NOT be able to view any sections on Settings page
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WOS | AffPassword |

  #Tester needs to take data who does not have any refferals
  @PhaseAll_CD @PhaseAll @APUI258_TC10_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline:APUI258_TC10_Aff_CD To Verify the download option to be missing when no record is been present on Referalls Section with No view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should NOT be able to view the download button on Referrals section
    Then User should NOT be able to view any sections on Settings page
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WON | AffPassword |

     #Tester needs to take data who does not have any refferals
  @PhaseAll_CD @PhaseAll @APUI258_TC11_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline:APUI258_TC11_Aff_CD To Verify the download option to be missing when no record is been present on Registration Section with No view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should NOT be able to view the download button on Referrals section
    Then User should NOT be able to view any sections on Settings page
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WON | AffPassword |

  #Tester needs to take data who does not have any refferals
  @PhaseAll_CD @PhaseAll @APUI258_TC12_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline:APUI258_TC12_Aff_CD To Verify the download option to be missing when no record is been present on Trade Section with No view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User should NOT be able to view the download button on Referrals section
    Then User should NOT be able to view any sections on Settings page
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WON | AffPassword |

  #Tester needs to take data who does have any refferals
  @PhaseAll_CD @PhaseAll @APUI258_TC13_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline:APUI258_TC13_Aff_CD To Verify the download option to be present on Referrals Section with Summary view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    Then User should be able to view the download button on Referrals section
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |


  #Tester needs to take data who does have any refferals
  @PhaseAll_CD @PhaseAll @APUI258_TC14_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline:APUI258_TC14_Aff_CD To Verify the download option to be present on Registration Section with Summary view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    And User click on Registration tab on Referrals Page
    Then User should be able to view the download button on Referrals section
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |

     #Tester needs to take data who does have any refferals
  @PhaseAll_CD @PhaseAll @APUI258_TC15_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline:APUI258_TC15_Aff_CD To Verify the download option to be present on Trade Section with Summary view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    And User click on Trades tab on Referrals Page
    Then User should be able to view the download button on Referrals section
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |


  #Tester needs to take data who does have any refferals
  @PhaseAll_CD @PhaseAll @APUI258_TC16_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline:APUI258_TC16_Aff_CD To Verify the download option to be  present on Referalls Section with No view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    And User click on Referrals tab on Referrals Page
    Then User should be able to view the download button on Referrals section
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDN | AffPassword |

  #Tester needs to take data who does have any refferals
  @PhaseAll_CD @PhaseAll @APUI258_TC17_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline:APUI258_TC17_Aff_CD To Verify the download option to be present on Registration Section with No view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    And User click on Registration tab on Referrals Page
    Then User should be able to view the download button on Referrals section
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDN | AffPassword |

  #Tester needs to take data who does have any refferals
  @PhaseAll_CD @PhaseAll @APUI258_TC18_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline:APUI258_TC18_Aff_CD To Verify the download option to be present on Trade Section with No view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    And User click on Trades tab on Referrals Page
    Then User should be able to view the download button on Referrals section
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDN | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI258_TC19_Aff_CD @Affiliates_Sprint11_CD @Acceptence_2_CD @QASprint11_CD
  Scenario Outline:APUI258_TC19_Aff_CD To Verify the Referals option under detailed view for Customer who has provided with detailed view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    Then User validate UID Type and Date columns for Referrals
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDD | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI258_TC20_Aff_CD @Affiliates_Sprint11_CD @Acceptence_2_CD @QASprint11_CD
  Scenario Outline:APUI258_TC20_Aff_CD To Verify the Registration option under detailed view for Customer who has provided with detailed view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    And User click on Registration tab on Referrals Page
    Then User validate UID Type CustomerID and Date Registered columns for Registrations
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDD | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI258_TC21_Aff_CD @Affiliates_Sprint11_CD @Acceptence_2_CD @QASprint11_CD
  Scenario Outline:APUI258_TC21_Aff_CD To Verify the Trade option under detailed view for Customer who has provided with detailed option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And By default Referrals option should be selected
    And User click on Trades tab on Referrals Page
    Then User validate UID Type CustomerID Sold Bought TurnOver Profit Commission and Closed Date columns for Trades
    Examples:
      |browser |    urlName     |      UserName       |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDD | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI258_TC22_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD
  Scenario Outline:APUI258_TC22_Aff_CD To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User validate CustomerName Type and Date columns for Referrals
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDURL | AffiliateCDUserName_WDS | AffPassword |
