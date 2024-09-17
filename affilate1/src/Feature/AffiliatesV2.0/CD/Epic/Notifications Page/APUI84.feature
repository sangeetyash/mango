@Affiliate_InSprint_NotificationPage_CD @APUI_84_CD @CD
Feature: Affiliate V2.0 Notification page feature for APUI84-CD

  #Tester needs to Contact the Backend team inorder to get the Data
  @PhaseAll_CD @PhaseAll @APUI84_TC1_Aff_CD @Affiliates_Sprint7_CD @Acceptence_1_CD @QASprint7_CD
  Scenario Outline:APUI84_TC1_Aff_CD To Verify that User should be able to view the Notification bell on Dashboard
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User should be able to view the Notification bell icon on UI
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI84_TC2_Aff_CD @Affiliates_Sprint7_CD @Acceptence_1_CD @QASprint7_CD
  Scenario Outline:APUI84_TC2_Aff_CD To Verify that User should be able to view the Notification bell on Account Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Account tab on dashboard.
    Then System should display the Account Page
    Then User should be able to view the Notification bell icon on UI
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI84_TC3_Aff_CD @Affiliates_Sprint7_CD @Acceptence_1_CD @QASprint7_CD
  Scenario Outline:APUI84_TC3_Aff_CD To Verify that User should be able to view the Notification bell on Refer a Client Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    And System should display the refer new client Page
    Then User should be able to view the Notification bell icon on UI
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI84_TC4_Aff_CD @Affiliates_Sprint7_CD @Acceptence_1_CD @QASprint7_CD
  Scenario Outline:APUI84_TC4_Aff_CD To Verify that User should be able to view the Notification bell on Resources Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    And User will be navigated to the Resources section Page
    Then User should be able to view the Notification bell icon on UI
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI84_TC5_Aff_CD @Affiliates_Sprint7_CD @Acceptence_1_CD @QASprint7_CD
  Scenario Outline:APUI84_TC5_Aff_CD To Verify that User should be able to view Notification bell on Referals Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view the Notification bell icon on UI
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI84_TC6_Aff_CD @Affiliates_Sprint7_CD @Acceptence_1_CD @QASprint7_CD
  Scenario Outline:APUI84_TC6_Aff_CD To Verify that User should be able to view the Notification bell on Commsions Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Commission tab on dashboard.
    Then User will be navigated to the Commission section Page
    Then User should be able to view the Notification bell icon on UI
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI84_TC7_Aff_CD @Affiliates_Sprint7_CD @Acceptence_1_CD @QASprint7_CD
  Scenario Outline:APUI84_TC7_Aff_CD To Verify that User should be able to view the Notification bell on Settings Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Settings tab on dashboard.
    Then User will be navigated to the Settings section Page
    Then User should be able to view the Notification bell icon on UI
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI84_TC8_Aff_CD @Affiliates_Sprint7_CD @Acceptence_1_CD @QASprint7_CD
  Scenario Outline:APUI84_TC8_Aff_CD To Verify that User should be able to view the Notification bell on contact tab
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Contact button on dashboard.
    Then User should be able to view the Notification bell icon on UI
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI84_TC9_Aff_CD @Affiliates_Sprint7_CD @Acceptence_1_CD @QASprint7_CD @Reruntest
  Scenario Outline:APUI84_TC9_Aff_CD To Verify that User should be able to view the Notification bell on Personal detail tab
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Profile Management button on dashboard.
    And Click on Personal Detail Section under Profile management
    Then User will be navigated to the Settings section Page
    Then User should be able to view the Notification bell icon on UI
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI84_TC10_Aff_CD @Affiliates_Sprint7_CD @Acceptence_1_CD @QASprint7_CD @Reruntest
  Scenario Outline:APUI84_TC10_Aff_CD To Verify that User should not be able to view the Notification bell on Bank detail page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Profile Management button on dashboard.
    Then Click on Bank Detail Section under Profile management
    And System should display Your Bank details Notification frame on UI
    Then User should be able to view the Notification bell icon on UI
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI84_TC11_Aff_CD @Affiliates_Sprint7_CD @Acceptence_1_CD @QASprint7_CD
  Scenario Outline:APUI84_TC11_Aff_CD To Verify that User should be able to view the Notification Bell Icon tab
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Notification Bell Icon button on dashboard.
    Then User will be navigated to the Notification section Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI84_TC16_Aff_CD @Affiliates_Sprint7_CD @Acceptence_2_CD @QASprint7_CD
  Scenario Outline: APUI84_TC16_Aff_CD To Verify that User should be able to view the List of Notifications on Notification Page when data is been present
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    Then User click on Notification Bell Icon button on dashboard.
    And User will be navigated to the Notification section Page
    Then User should be able to view the list of Notifications
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @Phase_CD @Phase @APUI84_TC17_Aff_CD @Affiliates_Sprint7_CD @Acceptence_2_CD @QASprint7_CD
  Scenario Outline:APUI84_TC17_Aff_CD To Verify that User should be able to view the message on Notification Page when data is not been present
   Given User launched application through "<browser>"
   And User navigate to Affiliate CD portal "<urlName>"
   When User enter UserName  "<UserName>" and password "<password>"and click login button
   Then User is navigated to Dashboard
   And User should be able to view the Notification bell icon on UI
   And User click on Notification Bell Icon button on dashboard.
  Then User should be able to view the message as No Notification is been present
   Examples:
     | browser | urlName        | UserName                       | password                                |
     | Chrome  | AffiliateCDURL | AffiliateNoNotificationUser_CD | AffiliateNoNotificationUser_CD_Password |

  #test cases for tags APUI84_TC18_Aff_CD APUI84_TC19_Aff_CD APUI84_TC20_Aff_CD covered one stepDef
  @PhaseAll_CD @PhaseAll @APUI84_TC18_Aff_CD @Affiliates_Sprint7_CD @Acceptence_3_CD @QASprint7_CD
  Scenario Outline: APUI84_TC18_Aff_CD To Verify that User should be able to view the Notification count when data is less than 9, with 0, with 9+
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    Then User should be able to view the Number of unread notifications on bell icon
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI84_TC19_Aff_CD @Affiliates_Sprint7_CD @Acceptence_3_CD @QASprint7_CD
  Scenario Outline: APUI84_TC19_Aff_CD To Verify that User should be able to view the Notification count when data is less than 9, with 0, with 9+
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    Then User should be able to view the Number of unread notifications on bell icon
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI84_TC20_Aff_CD @Affiliates_Sprint7_CD @Acceptence_3_CD @QASprint7_CD
  Scenario Outline: APUI84_TC20_Aff_CD To Verify that User should be able to view the Notification count when data is less than 9, with 0, with 9+
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    Then User should be able to view the Number of unread notifications on bell icon
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI84_TC21_Aff_CD @Affiliates_Sprint7_CD @Acceptence_5_CD @QASprint7_CD @Reruntest
  Scenario Outline:APUI84_TC21_Aff_CD To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    And User should be able to view the Notification bell icon on UI
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


