@Affiliate_InSprint_GlobalPage_CD @APUI_68_CD @CD
Feature: Affiliate V2.0 Global page elements for APUI68-CD

  @PhaseAll_CD @PhaseAll @APUI68_TC1_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI68_TC1_Aff_CD To Verify that User should be able to view the Create a Registration button on Dashboard
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    And User will be navigated to the Register a customer Page
    Then User is able to view Customer details for Registering a Customer
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI68_TC2_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI68_TC2_Aff_CD To Verify that User should be able to view the Create a Registration button on Account Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Account tab on dashboard.
    And User is able to view the Account Summary Section
    And User Clicks on Register a Customer
    And User will be navigated to the Register a customer Page
    Then User is able to view Customer details for Registering a Customer
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI68_TC3_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI68_TC3_Aff_CD To Verify that User should be able to view the Create a Registration button on Refer a Client Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should display the refer new client Page
    And User Clicks on Register a Customer
    And User will be navigated to the Register a customer Page
    Then User is able to view Customer details for Registering a Customer
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI68_TC4_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI68_TC4_Aff_CD To Verify that User should be able to view the Create a Registration button on Resources Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be navigated to the Resources section Page
    And User Clicks on Register a Customer
    And User will be navigated to the Register a customer Page
    Then User is able to view Customer details for Registering a Customer
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI68_TC5_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI68_TC5_Aff_CD To Verify that User should be able to view the Create a Registration button on Referrals Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User Clicks on Register a Customer
    And User will be navigated to the Register a customer Page
    Then User is able to view Customer details for Registering a Customer
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI68_TC6_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI68_TC6_Aff_CD To Verify that User should be able to view the Create a Registration button on Commsions Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Commission tab on dashboard.
    Then User will be navigated to the Commission section Page
    And User Clicks on Register a Customer
    And User will be navigated to the Register a customer Page
    Then User is able to view Customer details for Registering a Customer
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI68_TC7_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI68_TC7_Aff_CD To Verify that User should be able to view the Create a Registration button on Settings Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Settings tab on dashboard.
    Then User will be navigated to the Settings section Page
    And User Clicks on Register a Customer
    And User will be navigated to the Register a customer Page
    Then User is able to view Customer details for Registering a Customer
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI68_TC8_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI68_TC8_Aff_CD To Verify that User should be able to view the Create a Registration button when User Clicks on contact tab
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Contact button on dashboard.
    Then User is able to view and Note the Contact details for Affiliates manager
    And USer clicks to minimize Affiliate Manager Contact details
    And User Clicks on Register a Customer
    And User will be navigated to the Register a customer Page
    Then User is able to view Customer details for Registering a Customer
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI68_TC9_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI68_TC9_Aff_CD To Verify that User should be able to view the Create a Registration button when User Clicks on Notification Bell Icon tab
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Notification Bell Icon button on dashboard.
    Then User will be navigated to the Notification section Page
    And User Clicks on Register a Customer
    And User will be navigated to the Register a customer Page
    Then User is able to view Customer details for Registering a Customer
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI68_TC10_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI68_TC10_Aff_CD To Verify that User should be able to view the Create a Registration button when User Clicks on Personal Deatils
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view Profile Link icon
    And User clicks on the Profile icon
    And User clicks on the Personal details button for Profile link navigation
    Then User will be navigated to the Settings section Page
    And User Clicks on Register a Customer
    And User will be navigated to the Register a customer Page
    Then User is able to view Customer details for Registering a Customer
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI68_TC11_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI68_TC11_Aff_CD To Verify that User should be able to view the Create a Registration button when User Clicks on Bank Deatils
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view Profile Link icon
    And User clicks on the Profile icon
    Then User clicks on the Bank details button for Profile link navigation
    And User is able to view Your Bank details section
    Then User closes Bank details section
    And User Clicks on Register a Customer
    And User will be navigated to the Register a customer Page
    Then User is able to view Customer details for Registering a Customer
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI68_TC12_Aff_CD @Affiliates_Sprint13_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline:APUI68_TC12_Aff_CD To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    And User will be navigated to the Register a customer Page
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


