@Affiliate_InSprint_NotificationPage_CD @APUI_142_CD @CD
Feature: Affiliate V2.0 Notification page feature for APUI142-CD

  #Tester needs to Contact the Backend team inorder to get the Data
  @PhaseAll_CD @PhaseAll @APUI142_TC1_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI142_TC1_Aff_CD To Verify User should be able to view the Notifications as per date been Selected for Registration Notifications
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    And User click on Notification Bell Icon button on dashboard.
    Then User will be navigated to the Notification section Page
    Then User Observe the list of Registration related notifications on UI along with the date
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI142_TC2_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI142_TC2_Aff_CD To Verify User should be able to view the Notifications as per date been Selected for Traded Notifications
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    And User click on Notification Bell Icon button on dashboard.
    Then User will be navigated to the Notification section Page
    Then User Observe the list of Trading related notifications on UI along with the date
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI142_TC3_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI142_TC3_Aff_CD To Verify User should be able to view the Notifications as per date been Selected for Commissions Statement Notifications
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    And User click on Notification Bell Icon button on dashboard.
    Then User will be navigated to the Notification section Page
    Then User Observe the list of commission statement related notifications on UI along with the date
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI142_TC4_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI142_TC4_Aff_CD To Verify User should be able to view the Notifications as per date been Selected for Commissions Paid Notifications
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    And User click on Notification Bell Icon button on dashboard.
    Then User will be navigated to the Notification section Page
    Then User Observe the list of commission paid related notifications on UI along with the date
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI142_TC5_Aff_CD @Affiliates_Sprint10_CD @Acceptence_2_CD @QASprint10_CD @Smoke
  Scenario Outline:APUI142_TC5_Aff_CD To Verify User should be able to view the new Notifications at the the top
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    And User click on Notification Bell Icon button on dashboard.
    Then User will be navigated to the Notification section Page
    And User observe the list of Notifications on UI
    Then User should be able to view the new records at the top as per date in descending order
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


#User needs to identify number of unread notifications e.g.: 10 Read and 5 UnRead messages
  @PhaseAll_CD @PhaseAll @APUI142_TC6_Aff_CD @Affiliates_Sprint7_CD @Acceptence_3_CD @QASprint7_CD
  Scenario Outline:APUI142_TC6_Aff_CD To Verify User should be able to observe the unread messages
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    Then User notes the Number of unread notifications on bell icon
    And User click on Notification Bell Icon button on dashboard.
    Then User will be navigated to the Notification section Page
    And User observe the list of Notifications on UI
    Then User should be able to view the number of unread notification messages as not selected or read
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  #Need to push data for testing for 10 Read and 5 UnRead messages
  @PhaseAll_CD @PhaseAll @APUI142_TC7_Aff_CD @Affiliates_Sprint8_CD @Acceptence_3_CD @QASprint8_CD
  Scenario Outline:APUI142_TC7_Aff_CD To Verify User should be able to observe the read messages
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User should be able to view the Notification bell icon on UI
    Then User notes the Number of unread notifications on bell icon
    And User click on Notification Bell Icon button on dashboard.
    Then User will be navigated to the Notification section Page
    And User observe the list of Notifications on UI
    Then User should be able to view the Number of read messages as selected
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  #Need to push data from backend from testing
  @PhaseAll_CD @PhaseAll @APUI142_TC8_Aff_CD @Affiliates_Sprint10_CD @Acceptence_4_CD @QASprint10_CD
  Scenario Outline:APUI142_TC8_Aff_CD To Verify User should be able to view the new messages as been unread
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    Then User notes the Number of unread notifications on bell icon
    And User click on Notification Bell Icon button on dashboard.
    Then User will be navigated to the Notification section Page
    And User observe the list of Notifications on UI
    Then User should be able to view the number of unread notification messages as not selected or read
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  #Need to push data from backend from testing NA
  @APUI142_TC9_Aff_CD @Affiliates_Sprint10_CD @Acceptence_5_CD @QASprint10_CD
  Scenario Outline:APUI142_TC9_Aff_CD To verfify user should be able to mark the message as read
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    Then User notes the Number of unread notifications on bell icon
    And User click on Notification Bell Icon button on dashboard.
    Then User will be navigated to the Notification section Page
    And User observe the list of Notifications on UI
    And User should be able to view the number of unread notification messages as not selected or read
    Then User clicks on any of the Unread notification record
    And User Clicks on Back button of Browser
    Then User will be navigated to the Notification section Page
    Then System should mark previously clicked notification messages as read
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

   #Need to push data from backend from testing
  @PhaseAll_CD @PhaseAll @APUI142_TC10_Aff_CD @Affiliates_Sprint10_CD @Acceptence_6_CD @QASprint10_CD
  Scenario Outline:APUI142_TC10_Aff_CD To verfify user should be able to navigate to Referals page when User opens the Registration Notification
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    Then User notes the Number of unread notifications on bell icon
    And User click on Notification Bell Icon button on dashboard.
    Then User will be navigated to the Notification section Page
    And User observe the list of Notifications on UI
    And User should be able to view the number of unread notification messages as not selected or read
    Then User clicks on the Unread Registration related notification and navigates to Referrals section Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  #Need to push data from backend from testing
  @PhaseAll_CD @PhaseAll @APUI142_TC11_Aff_CD @Affiliates_Sprint10_CD @Acceptence_6_CD @QASprint10_CD
  Scenario Outline:APUI142_TC11_Aff_CD To verfify user should be able to navigate to Referals page when User opens the Traded Notification
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    Then User notes the Number of unread notifications on bell icon
    And User click on Notification Bell Icon button on dashboard.
    Then User will be navigated to the Notification section Page
    And User observe the list of Notifications on UI
    And User should be able to view the number of unread notification messages as not selected or read
    Then User clicks on the Unread Trading related notification and navigates to Referrals section Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  #Need to push data from backend from testing
  @PhaseAll_CD @PhaseAll @APUI142_TC12_Aff_CD @Affiliates_Sprint10_CD @Acceptence_6_CD @QASprint10_CD
  Scenario Outline:APUI142_TC12_Aff_CD To verfify user should be able to navigate to Commission page when User opens the Commission Statement Notification
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    Then User notes the Number of unread notifications on bell icon
    And User click on Notification Bell Icon button on dashboard.
    Then User will be navigated to the Notification section Page
    And User observe the list of Notifications on UI
    And User should be able to view the number of unread notification messages as not selected or read
    Then User clicks on the Unread commission statement related notification and navigates to Commission section Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  #Need to push data from backend from testing
  @PhaseAll_CD @PhaseAll @APUI142_TC13_Aff_CD @Affiliates_Sprint10_CD @Acceptence_6_CD @QASprint10_CD
  Scenario Outline:APUI142_TC13_Aff_CD To verfify user should be able to navigate to Commission page when User opens the Commission Paid Notification
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    Then User notes the Number of unread notifications on bell icon
    And User click on Notification Bell Icon button on dashboard.
    Then User will be navigated to the Notification section Page
    And User observe the list of Notifications on UI
    And User should be able to view the number of unread notification messages as not selected or read
    Then User clicks on the Unread commission paid related notification and navigates to Commission section Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  #Need to push data from backend from testing
  @PhaseAll_CD @PhaseAll @APUI142_TC16_Aff_CD @Affiliates_Sprint10_CD @Acceptence_8_CD @QASprint10_CD
  Scenario Outline:APUI142_TC16_Aff_CD To verfify user should be able to view the older notifications
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User should be able to view the Notification bell icon on UI
    And User click on Notification Bell Icon button on dashboard.
    Then User will be navigated to the Notification section Page
    And User observe the list of Notifications on UI
    Then User should be able to view the Page Numbers at the bottom of Notifications Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  #Need to push data from backend from testing
  @PhaseAll_CD @PhaseAll @APUI142_TC18_Aff_CD @Affiliates_Sprint10_CD @Acceptence_10_CD @QASprint10_CD
  Scenario Outline:APUI142_TC18_Aff_CD To verify user should only be able to view only 15 notifications
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User should be able to view the Notification bell icon on UI
    And User click on Notification Bell Icon button on dashboard.
    Then User will be navigated to the Notification section Page
    And User observe the list of Notifications on UI
    Then User should be able to view only 15 notifications on one page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  #Need to push data from backend from testing
  @PhaseAll_CD @PhaseAll @APUI142_TC19_Aff_CD @Affiliates_Sprint10_CD @Acceptence_11_CD @QASprint10_CD
  Scenario Outline:APUI142_TC19_Aff_CD To Verify the User Should be able to view the Organzation detai
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    And User click on Notification Bell Icon button on dashboard.
    Then User will be navigated to the Notification section Page
    And User observe the list of Notifications on UI
    And User should be able to view only 15 notifications on one page
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


#Need to push data from backend from testing
#Tester need to take account on which no notifications as available
  @PhaseAll_CD @PhaseAll @APUI142_TC20_Aff_CD @Affiliates_Sprint11_CD @Acceptence_7_CD @QASprint11_CD
  Scenario Outline:APUI142_TC20_Aff_CD To verfify user should be able to view mark all read button as disabled
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then User should be able to view the Notification bell icon on UI
    And User click on Notification Bell Icon button on dashboard.
    And User will be navigated to the Notification section Page
    Then User should be able to view read all button as disabled
    Examples:
      | browser | urlName        | UserName                                  | password                          |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_MarkAllReadBtnDisable | AffPassword_MarkAllReadBtnDisable |
