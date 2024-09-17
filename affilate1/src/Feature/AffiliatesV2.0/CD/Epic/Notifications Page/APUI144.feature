@Affiliate_InSprint_NotificationPage_CD @APUI_144_CD @CD
Feature: Affiliate V2.0 Notification page feature for APUI144_CD

 #Tester needs to Contact the Backend team inorder to get the Data
  #Tester has got the data ready from datawarehouse team
  @PhaseAll_CD @PhaseAll @APUI144_TC1_Aff_CD @Affiliates_Sprint7_CD @Acceptence_1_CD @QASprint7_CD
  Scenario Outline:APUI144_TC1_Aff_CD To Verify User should be able to view registration related notifications
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    And User click on Notification Bell Icon button on dashboard.
    Then User Observe the list of Registration related notifications on UI along with the date
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  #Tester has got the data ready from datawarehouse team
  @PhaseAll_CD @PhaseAll @APUI144_TC2_Aff_CD @Affiliates_Sprint7_CD @Acceptence_1_CD @QASprint7_CD
  Scenario Outline:APUI144_TC2_Aff_CD To Verify User should be able to view trading related notifications
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    And User click on Notification Bell Icon button on dashboard.
    Then User Observe the list of Trading related notifications on UI along with the date
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  #Tester has got the data ready from datawarehouse team
  @PhaseAll_CD @PhaseAll @APUI144_TC3_Aff_CD @Affiliates_Sprint7_CD @Acceptence_1_CD @QASprint7_CD
  Scenario Outline:APUI144_TC3_Aff_CD To Verify User should be able to view commission statement related notifications
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    And User click on Notification Bell Icon button on dashboard.
    Then User Observe the list of commission statement related notifications on UI along with the date
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  #Tester has got the data ready from datawarehouse team
  @PhaseAll_CD @PhaseAll @APUI144_TC4_Aff_CD @Affiliates_Sprint7_CD @Acceptence_1_CD @QASprint7_CD
  Scenario Outline:APUI144_TC4_Aff_CD To Verify User should be able to view commission paid related notifications
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    And User click on Notification Bell Icon button on dashboard.
    Then User Observe the list of commission paid related notifications on UI along with the date
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI144_TC18_Aff_CD @Affiliates_Sprint7_CD @Acceptence_10_CD @QASprint7_CD
  Scenario Outline:APUI144_TC18_Aff_CD To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    Then User click on Notification Bell Icon button on dashboard.
    And User Observe the list of Registration related notifications on UI along with the date
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  #Tester needs to Contact the Backend team inorder to get the Data
  #Tester has got the data ready from datawarehouse team
  @PhaseAll_CD @PhaseAll @APUI144_TC19_Aff_CD @Affiliates_Sprint7_CD @Acceptence_3_CD @QASprint7_CD
  Scenario Outline:APUI144_TC19_Aff_CD To Verify User should be able to view the correct content for Registration notifications
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    Then User click on Notification Bell Icon button on dashboard.
    And User Observe the list of Registration related notifications on UI along with the date
    Then User should be to view the proper subject line for the Registered notification which is been specified earlier
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  #Tester has got the data ready from datawarehouse team
  @PhaseAll_CD @PhaseAll @APUI144_TC20_Aff_CD @Affiliates_Sprint7_CD @Acceptence_5_CD @QASprint7_CD
  Scenario Outline:TC20_APUI144_AFF To Verify User should be able to view the correct content for trading related notifications
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    Then User click on Notification Bell Icon button on dashboard.
    And User Observe the list of Trading related notifications on UI along with the date
    Then User should be to view the proper subject line for the Trading notification which is been specified earlier
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  #Tester has got the data ready from datawarehouse team
  @PhaseAll_CD @PhaseAll @APUI144_TC21_Aff_CD @Affiliates_Sprint7_CD @Acceptence_7_CD @QASprint7_CD
  Scenario Outline:APUI144_TC21_Aff_CD To Verify User should be able to view the correct content for commission statement related notifications
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    Then User click on Notification Bell Icon button on dashboard.
    Then User Observe the list of commission statement related notifications on UI along with the date
    Then User should be to view the proper subject line for the commission statement notification which is been specified earlier
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  #Tester has got the data ready from datawarehouse team
  @PhaseAll_CD @PhaseAll @APUI144_TC22_Aff_CD @Affiliates_Sprint7_CD @Acceptence_1_CD @QASprint7_CD
  Scenario Outline:APUI144_TC22_Aff_CD To Verify User should be able to view commission paid related notifications
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    Then User click on Notification Bell Icon button on dashboard.
    And User Observe the list of commission paid related notifications on UI along with the date
    Then User should be to view the proper subject line for the commission paid notification which is been specified earlier
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |
