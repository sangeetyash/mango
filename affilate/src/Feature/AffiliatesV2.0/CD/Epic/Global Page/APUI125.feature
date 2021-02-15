@Affiliate_InSprint_GlobalPage_CD @APUI_125_CD @CD
Feature: Affiliate V2.0 Global page elements for APUI125_CD

  @PhaseAll_CD @PhaseAll @APUI125_TC1_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI125_TC1_Aff_CD To verify User should be able view the Send Registration Link Button on Dashboard
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User should be able to view Send Registration Link Button

    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |

  @PhaseAll_CD @PhaseAll @APUI125_TC2_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI125_TC2_Aff_CD  To verify User should be able view the Send Registration Link Button on Account Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User should be able to view Send Registration Link Button

    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |

  @PhaseAll_CD @PhaseAll @APUI125_TC3_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI125_TC3_Aff_CD To verify User should be able view the Send Registration Link Button on Refer a client Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should display the refer new client Page
    Then User should be able to view Send Registration Link Button

    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |

  @PhaseAll_CD @PhaseAll @APUI125_TC23_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint9_CD
  Scenario Outline:APUI125_TC23_Aff_CD  To verify User should be able to perform journey with both option been enabled
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Both Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<EmailId>" and MobileNumber "<MobileNumber>"
    Then Verify User is able to view Enable the Generate button
    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |  MobileNumber      | Mobile  |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |  8098094123        | 123     |

  @PhaseAll_CD @PhaseAll @APUI125_TC25_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint9_CD
  Scenario Outline:APUI125_TC25_Aff_CD  To verify User should be able to perform journey with both option been enabled
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Both Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<EmailId>" and MobileNumber "<MobileNumber>"
    And User clicks on CountrySRL field
    Then User Should be able to Verify All values for Country DropDown
    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |  MobileNumber      | Mobile  |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |  8098094123        | 123     |

  @PhaseAll_CD @PhaseAll @APUI125_TC26_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint9_CD
  Scenario Outline:APUI125_TC26_Aff_CD  To verify User should be able to perform journey with both option been enabled
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Both Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<EmailId>" and MobileNumber "<MobileNumber>"
    Then User should be able to view the default country code based on the Organization been selected
    Then Verify User is able to view Enable the Generate button
    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |  MobileNumber      | Mobile  |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |  8098094123        | 123     |

  @PhaseAll_CD @PhaseAll @APUI125_TC27_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint9_CD
  Scenario Outline:APUI125_TC27_Aff_CD   To verify the default country code to be present for Customer when only mobile number option is been selected
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects SMS Checkbox for send registration link
    Then Verify User is able to view Disable the Generate button
    #Then User should be able to view the default country code based on the Organization been selected

    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |  MobileNumber      | Mobile  |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |  8098094123        | 123     |

  @PhaseAll_CD @PhaseAll @APUI125_TC28_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint9_CD
  Scenario Outline:APUI125_TC28_Aff_CD  To verify Organizations details to be displayed while performing the journey
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User should view the Organization information After Login in header and fotter sections
    And User click on Send registration link on dashboard.

      Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |  MobileNumber      | Mobile  |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |  8098094123        | 123     |


  @PhaseAll_CD @PhaseAll @APUI125_TC4_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI125_TC4_Aff_CD To verify User should be able view the Send Registration Link Button on Resources Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be navigated to the Resources section Page
    Then User should be able to view Send Registration Link Button

    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |

  @PhaseAll_CD @PhaseAll @APUI125_TC5_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI125_TC5_Aff_CD To verify User should be able view Send Registration Link Button on Referals Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view Send Registration Link Button

    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |

  @PhaseAll_CD @PhaseAll @APUI125_TC6_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI125_TC6_Aff_CD To verify User should be able view the Send Registration Link Button on Settings Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Settings tab on dashboard.
    Then User will be navigated to the Settings section Page
    Then User should be able to view Send Registration Link Button

    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |

  @PhaseAll_CD @PhaseAll @APUI125_TC7_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI125_TC7_Aff_CD  To verify User should be able view the Send Registration Link Button on Register a Customer Journey
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    Then User should be able to view Send Registration Link Button

    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |

  @PhaseAll_CD @PhaseAll @APUI125_TC8_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI125_TC8_Aff_CD  To verify User should be able view the Send Registration Link Button on Notification Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Notification Bell Icon button on dashboard.
    Then User will be navigated to the Notification section Page
    Then User should be able to view Send Registration Link Button

    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |

  @PhaseAll_CD @PhaseAll @APUI125_TC29_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI125_TC9_Aff_CD  To verify User should be able view the Send Registration Link Button on Commission Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Commission tab on dashboard.
    Then User will be navigated to the Commission section Page
    Then User should be able to view Send Registration Link Button

    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |

  @PhaseAll_CD @PhaseAll @APUI125_TC10_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline:APUI125_TC10_Aff_CD To verify the Registration link is been send to specific Mobile number
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects SMS Checkbox for send registration link
    When User enter the Name "<Name>" and MobileNumber "<MobileNumber>"
    Then Verify User is able to view Enable the Generate button

    Examples:
      | browser | urlName        | UserName            | password    |  Name        |  MobileNumber    |  Mobile |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  |  8890123422      |  422    |

  @PhaseAll_CD @PhaseAll @APUI125_TC13_Aff_CD @Affiliates_Sprint14_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline:APUI125_TC13_Aff_CD To verify the Validation for Mobile number when no input is been provided
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects SMS Checkbox for send registration link
    When User enter the Name "<Name>" and MobileNumber "<MobileNumber>"
    Then Verify User is able to view Disable the Generate button
    Examples:
      | browser | urlName        | UserName            | password    |  Name         | MobileNumber  |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | BNT           |               |


  @PhaseAll_CD @PhaseAll @APUI125_TC15_Aff_CD @Affiliates_Sprint14_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline:APUI125_TC15_Aff_CD To verify the Registration link is been send to specific email id
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Email Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<EmailId>"
    Then Verify User is able to view Enable the Generate button
    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |

  @PhaseAll_CD @PhaseAll @APUI125_TC16_Aff_CD @Affiliates_Sprint14_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline:APUI125_TC16_Aff_CD To verify User should be able to view the error when details not been provided
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Email Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<EmailId>"
    Then Verify User is able to view Disable the Generate button
    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  |    |

  @PhaseAll_CD @PhaseAll @APUI125_TC17_Aff_CD @Affiliates_Sprint14_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline:APUI125_TC17_Aff_CD To verify User should be able to view the error when first part of Email has got the minimum length
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Email Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<EmailId>"
    Then Verify User is able to view Disable the Generate button
    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  |  @mailinator.com  |


  @PhaseAll_CD @PhaseAll @APUI125_TC18_Aff_CD @Affiliates_Sprint14_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline:APUI125_TC18_Aff_CD  To verify User should be able to view the error when first part of Email has got the maximum length
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Email Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<EmailId>"
    And User click on the EmailSRL enter the name more than 64 characters
    Then Verify User is able to view Disable the Generate button

    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  |    |

  @PhaseAll_CD @PhaseAll @APUI125_TC19_Aff_CD @Affiliates_Sprint14_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline:APUI125_TC19_Aff_CD To verify User should be able to view the error when second part of Email has got the minimum length
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Email Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<EmailId>"
    And User click on the EmailSRL enter the name Only one characters
    Then Verify User is able to view Disable the Generate button

    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  |    |

  @PhaseAll_CD @PhaseAll @APUI125_TC20_Aff_CD @Affiliates_Sprint14_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline:APUI125_TC20_Aff_CD  To verify User should be able to view the error when second part of Email has got the maximum length
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Email Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<EmailId>"
    And User click on the EmailSRL enter the name more than 160 characters
    Then Verify User is able to view Disable the Generate button

    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  |    |

  @PhaseAll_CD @PhaseAll @APUI125_TC21_Aff_CD @Affiliates_Sprint14_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline:APUI125_TC21_Aff_CD  To verify User should be able to view the error when third part of Email has got the minimum length
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Email Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<EmailId>"
    Then Verify User is able to view Disable the Generate button
    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | Sathya@mailinator  |

  @PhaseAll_CD @PhaseAll @APUI125_TC22_Aff_CD @Affiliates_Sprint14_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline:APUI125_TC22_Aff_CD To verify User should be able to view the error when third part of Email has got the maximum length
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Email Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<EmailId>"
    And User click on the EmailSRL enter the name more than 24 characters
    Then Verify User is able to view Disable the Generate button

    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  |    |





















