@Affiliate_InSprint_GlobalPage_CD @APUI_72_CD @CD
Feature: Affiliate V2.0 Global page elements for APUI72_CD

  @PhaseAll_CD @PhaseAll @APUI72_TC1_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI72_TC1_Aff_CD TC1_APUI72_AFF To Verify user should be able to view the logout option in dropdown when hes on Dashboard
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC2_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI72_TC2_Aff_CD TC2_APUI72_AFF To Verify user should be able to view the logout option in dropdown when hes on Refer a Client Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC3_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI72_TC3_Aff_CD To Verify user should be able to view the logout option in dropdown when hes on Registration Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    And User will be navigated to the Register a customer Page
    And User click on Profile Management button on dashboard.
    Then User will be able to view the Logout option in the dropdown
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC4_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI72_TC4_Aff_CD TC4_APUI72_AFF TC4_APUI72_AFF To Verify user should be able to view the logout option in dropdown when hes on Resources Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC5_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI72_TC5_Aff_CD TC5_APUI72_AFF TC5_APUI72_AFF To Verify user should be able to view the logout option in dropdown when hes on Referals Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC6_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI72_TC6_Aff_CD TC6_APUI72_AFF TC6_APUI72_AFF To Verify user should be able to view the logout option in dropdown when hes on Commissions Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Commission tab on dashboard.
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC7_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI72_TC7_Aff_CD TC7_APUI72_AFF TC7_APUI72_AFF To Verify user should be able to view the logout option in dropdown when hes on Settings Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Settings tab on dashboard.
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC8_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI72_TC8_Aff_CD TC8_APUI72_AFF TC8_APUI72_AFF TC8_APUI72_AFF To Verify user should be able to view the logout option in dropdown when hes on Notification Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Notification Bell Icon button on dashboard.
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC9_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD @Smoke
  Scenario Outline:APUI72_TC9_Aff_CD TC9_APUI72_AFF To Verify user should be able to view the logout message when he logs out from Dashboard
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    And User click on Logout on Profile Link.
    Then Verify User logged out successfully from Account Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC10_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI72_TC10_Aff_CD TC10_APUI72_AFF To Verify user should be able to view the logout option in dropdown when hes on Refer a Client Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    And User click on Logout on Profile Link.
    Then Verify User logged out successfully from Account Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC11_Aff_CD @Affiliates_Sprint13_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline:APUI72_TC11_Aff_CD To Verify user should be able to view the logout message when he logs out from Registration Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    And User will be navigated to the Register a customer Page
    And User click on Profile Management button on dashboard.
    Then User will be able to view the Logout option in the dropdown
    And User click on Logout on Profile Link.
    Then Verify User logged out successfully from Account Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC12_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI72_TC12_Aff_CD TC12_APUI72_AFF TC12_APUI72_AFF To Verify user should be able to view the logout message when he logs out from Resources Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    And User click on Logout on Profile Link.
    Then Verify User logged out successfully from Account Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC13_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI72_TC13_Aff_CD TC13_APUI72_AFF TC13_APUI72_AFF To Verify user should be able to view the logout message when he logs out from Referals Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    And User click on Logout on Profile Link.
    Then Verify User logged out successfully from Account Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC14_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI72_TC14_Aff_CD TC14_APUI72_AFF TC14_APUI72_AFF To Verify user should be able to view the logout message when he logs out from Commissions Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Commission tab on dashboard.
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    And User click on Logout on Profile Link.
    Then Verify User logged out successfully from Account Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC15_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI72_TC15_Aff_CD TC15_APUI72_AFF TC15_APUI72_AFF To Verify user should be able to view the logout message when he logs out from Settings Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Settings tab on dashboard.
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    And User click on Logout on Profile Link.
    Then Verify User logged out successfully from Account Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC16_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI72_TC16_Aff_CD TC16_APUI72_AFF TC16_APUI72_AFF To Verify user should be able to view the logout message when he logs out from Notification Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Notification Bell Icon button on dashboard.
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    And User click on Logout on Profile Link.
    Then Verify User logged out successfully from Account Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC17_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI72_TC17_Aff_CD TC17_APUI72_AFF To Verify user should be able to land on login page when user logs out from Dashboard page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    And User click on Logout on Profile Link.
    Then Verify User logged out successfully from Account Page
    Then User will land on the Login Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC18_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI72_TC18_Aff_CD TC18_APUI72_AFF To Verify user should be able to land on login page when user logs out from Refer a Client page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    And User click on Logout on Profile Link.
    Then Verify User logged out successfully from Account Page
    Then User will land on the Login Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC20_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI72_TC20_Aff_CD TC20_APUI72_AFF To Verify user should be able to land on login page when user logs out from Resources page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    And User click on Logout on Profile Link.
    Then Verify User logged out successfully from Account Page
    Then User will land on the Login Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC21_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI72_TC21_Aff_CD TC21_APUI72_AFF TC21_APUI72_AFF To Verify user should be able to land on login page when user logs out from Referals page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    And User click on Logout on Profile Link.
    Then Verify User logged out successfully from Account Page
    Then User will land on the Login Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC22_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI72_TC22_Aff_CD TC22_APUI72_AFF TC22_APUI72_AFF To Verify user should be able to land on login page when user logs out from Commissions page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Commission tab on dashboard.
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    And User click on Logout on Profile Link.
    Then Verify User logged out successfully from Account Page
    Then User will land on the Login Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC23_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI72_TC23_Aff_CD TC23_APUI72_AFF TC23_APUI72_AFF To Verify user should be able to land on login page when user logs out from Settings Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Settings tab on dashboard.
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    And User click on Logout on Profile Link.
    Then Verify User logged out successfully from Account Page
    Then User will land on the Login Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC24_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI72_TC24_Aff_CD TC24_APUI72_AFF TC24_APUI72_AFF To Verify user should be able to land on login page when user logs out from Notification pagem Notification Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Notification Bell Icon button on dashboard.
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    And User click on Logout on Profile Link.
    Then Verify User logged out successfully from Account Page
    Then User will land on the Login Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC25_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI72_TC25_Aff_CD TC25_APUI72_AFF To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    And User click on Logout on Profile Link.
    Then Verify User logged out successfully from Account Page
    Then User will land on the Login Page

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI72_TC19_Aff_CD @Affiliates_Sprint13_CD @Acceptence_3_CD @QASprint13_CD
  Scenario Outline:APUI72_TC19_Aff_CD To Verify user should be able to land on login page when user logs out from Registration page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    And User will be navigated to the Register a customer Page
    And User click on Profile Management button on dashboard.
    Then User will be able to view the Logout option in the dropdown
    And User click on Logout on Profile Link.
    And User will land on the Login Page
    Then Verify User logged out successfully from Account Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |



