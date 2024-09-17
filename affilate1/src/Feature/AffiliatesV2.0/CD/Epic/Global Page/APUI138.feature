@Affiliate_InSprint_GlobalPage_CD @APUI_138_CD @CD
Feature: Affiliate V2.0 Global page elements for APUI138_CD

  @PhaseAll_CD @PhaseAll @APUI138_TC1_Aff_CD @Affiliates_Sprint9_CD @Acceptence_1_CD @QASprint9_CD
  Scenario Outline:APUI138_TC1_Aff_CD To verify the Registration link is been send to specific email id
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Email Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<EmailId>"
    And User click on Generate Button on RefferalURLGenerator.
    Then success message to be displayed with EmailId "<EmailId>" which is been entered
    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |

  @PhaseAll_CD @PhaseAll @APUI138_TC2_Aff_CD @Affiliates_Sprint9_CD @Acceptence_1_CD @QASprint9_CD
  Scenario Outline:APUI138_TC2_Aff_CD To verify the error message to be displayed when user enters invalid value in emailID option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Email Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<InvalidEmailId>"
    Then Verify User is able to view Disable the Generate button
    Examples:
      | browser | urlName        | UserName            | password    |  Name        |  InvalidEmailId  |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  |  Smith.com       |

  @PhaseAll_CD @PhaseAll @APUI138_TC3_Aff_CD @Affiliates_Sprint9_CD @Acceptence_1_CD @QASprint9_CD
  Scenario Outline:APUI138_TC3_Aff_CD To verify the genearte button to be enabled when user enters valid input
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Email Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<InvalidEmailId>"
    Then Verify User is able to view Disable the Generate button
    When User enter the Name "<Name>" and EmailID "<EmailId>"
    Then Verify User is able to view Enable the Generate button
    Examples:
      | browser | urlName        | UserName            | password    |  Name        |  InvalidEmailId  |  EmailId              |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  |  Smith.com       |  John.Smith@gmail.com |

  @PhaseAll_CD @PhaseAll @APUI138_TC4_Aff_CD @Affiliates_Sprint9_CD @Acceptence_1_CD @QASprint9_CD
  Scenario Outline:APUI138_TC4_Aff_CD To verify the Registration link is been send to specific Mobile number
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects SMS Checkbox for send registration link
    When User enter the Name "<Name>" and MobileNumber "<MobileNumber>"
    And User click on Generate Button on RefferalURLGenerator.
    Then success message to be displayed with Mobile "<Mobile>" which is been entered
    Examples:
      | browser | urlName        | UserName            | password    |  Name        |  MobileNumber    |  Mobile |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  |  8890123422      |  422    |

  @PhaseAll_CD @PhaseAll @APUI138_TC5_Aff_CD @Affiliates_Sprint9_CD @Acceptence_1_CD @QASprint9_CD
  Scenario Outline:APUI138_TC5_Aff_CD To verify the error message to be displayed when user enters invalid value in Mobile option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects SMS Checkbox for send registration link
    When User enter the Name "<Name>" and MobileNumber "<InvalidMobileNumberLessThan8Digit>"
    Then Verify User is able to view Disable the Generate button
    Examples:
      | browser | urlName        | UserName            | password    |  Name        |  InvalidMobileNumberLessThan8Digit    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  |  8890123                              |

  @PhaseAll_CD @PhaseAll @APUI138_TC6_Aff_CD @Affiliates_Sprint9_CD @Acceptence_1_CD @QASprint9_CD
  Scenario Outline:APUI138_TC6_Aff_CD To verify the error message to be displayed when user enters invalid value in Mobile option with max length
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects SMS Checkbox for send registration link
    When User enter the Name "<Name>" and MobileNumber "<InvalidMobileNumberGreaterThan14Digit>"
    Then Verify User is able to view Disable the Generate button
    Examples:
      | browser | urlName        | UserName            | password    |  Name        |  InvalidMobileNumberGreaterThan14Digit   |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  |  889012378067341                          |

  @PhaseAll_CD @PhaseAll @APUI138_TC7_Aff_CD @Affiliates_Sprint9_CD @Acceptence_1_CD @QASprint9_CD
  Scenario Outline:APUI138_TC7_Aff_CD To verify the Registration link is been send to specific email id and Phone number
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Both Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<EmailId>" and MobileNumber "<MobileNumber>"
    And User click on Generate Button on RefferalURLGenerator.
    Then success message to be displayed with Email "<EmailId>" And Mobile "<Mobile>" which is been entered
    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |  MobileNumber      | Mobile  |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |  8098094123        | 123     |

  @PhaseAll_CD @PhaseAll @APUI138_TC8_Aff_CD @Affiliates_Sprint9_CD @Acceptence_1_CD @QASprint9_CD
  Scenario Outline:APUI138_TC8_Aff_CD To verify the error message to be displayed when user enters invalid value in emailID and mobile option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Both Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<InValidEmailId>" and MobileNumber "<InValidMobileNumber>"
    Then Verify User is able to view Disable the Generate button
    Examples:
      | browser | urlName        | UserName            | password    |  Name        | InValidEmailId         |  InValidMobileNumber  |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith#gmail.com   |  809809               |

  @PhaseAll_CD @PhaseAll @APUI138_TC9_Aff_CD @Affiliates_Sprint9_CD @Acceptence_1_CD @QASprint9_CD
  Scenario Outline:APUI138_TC9_Aff_CD To verify the error message to be displayed when user enters invalid value in emailID option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Both Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<InValidEmailId>" and MobileNumber "<MobileNumber>"
    Then Verify User is able to view Disable the Generate button
    Examples:
      | browser | urlName        | UserName            | password    |  Name        | InValidEmailId         |  MobileNumber  |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith$gmail.com   |  809809981     |

  @PhaseAll_CD @PhaseAll @APUI138_TC10_Aff_CD @Affiliates_Sprint9_CD @Acceptence_1_CD @QASprint9_CD
  Scenario Outline:APUI138_TC10_Aff_CD To verify the error message to be displayed when user enters invalid value in mobile option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Both Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<EmailId>" and MobileNumber "<InValidMobileNumber>"
    Then Verify User is able to view Disable the Generate button
    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |  InValidMobileNumber  |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |  8099981              |

  @PhaseAll_CD @PhaseAll @APUI138_TC11_Aff_CD @Affiliates_Sprint9_CD @Acceptence_1_CD @QASprint9_CD
  Scenario Outline:APUI138_TC11_Aff_CD TC11_APUI138_AFF To verify the Close button feature
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Both Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<EmailId>" and MobileNumber "<MobileNumber>"
    And User click on Generate Button on RefferalURLGenerator.
    Then success message to be displayed with Email "<EmailId>" And Mobile "<Mobile>" which is been entered
    And User click on Close Button on RefferalURLGenerator.
    Then User will land back on Account Page
    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |  MobileNumber      | Mobile  |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |  8098094123        | 123     |

  @PhaseAll_CD @PhaseAll @APUI138_TC12_Aff_CD @Affiliates_Sprint9_CD @Acceptence_1_CD @QASprint9_CD
  Scenario Outline:APUI138_TC12_Aff_CD TC12_APUI138_AFF TC12_APUI138_AFF To verify the Send registration Link feature
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Both Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<EmailId>" and MobileNumber "<MobileNumber>"
    And User click on Generate Button on RefferalURLGenerator.
    Then success message to be displayed with Email "<EmailId>" And Mobile "<Mobile>" which is been entered
    And User click on Send new link on RefferalURLGenerator.
    Then User will land back on Send Registration Link Page
    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |  MobileNumber      | Mobile  |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |  8098094123        | 123     |

  @PhaseAll_CD @PhaseAll @APUI138_TC13_Aff_CD @Affiliates_Sprint9_CD @Acceptence_1_CD @QASprint9_CD
  Scenario Outline:APUI138_TC13_Aff_CD TC13_APUI138_AFF To Verify that user is able to view correct details while Perform Reset Password Journey for particular Orgainization User
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Both Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<EmailId>" and MobileNumber "<MobileNumber>"
    And User click on Generate Button on RefferalURLGenerator.
    Then success message to be displayed with Email "<EmailId>" And Mobile "<Mobile>" which is been entered
    And User click on Close Button on RefferalURLGenerator.
    Then User will land back on Account Page
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |  MobileNumber      | Mobile  |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |  8098094123        | 123     |

  @PhaseAll_CD @PhaseAll @APUI138_TC14_Aff_CD @Affiliates_Sprint9_CD @Acceptence_1_CD @QASprint9_CD
  Scenario Outline:APUI138_TC14_Aff_CD To verify Generate Button is disable when user enters invalid value in Mobile option(Min,Max,AlphaNumeric,Alphabets)
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects SMS Checkbox for send registration link
    When User enter the Max Count Of MobileNumber
    Then Verify User is able to view Disable the Generate button
    When User enter the Min Count Of MobileNumber
    Then Verify User is able to view Disable the Generate button
    When User enter the Alphabets Count Of MobileNumber
    Then Verify User is able to view Disable the Generate button
    When User enter the Alphanumeric Count Of MobileNumber
    Then Verify User is able to view Disable the Generate button
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI138_TC15_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI138_TC15_Aff_CD To verify the Error Message to be displayed and Generate button to be grayed out when Email option is been selected without entering name
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Email Checkbox for send registration link
    When User enter the Name "<WithoutName>" and EmailID "<EmailId>"
    Then Verify User is able to view Disable the Generate button
    Examples:
      | browser | urlName        | UserName            | password    |  WithoutName        | EmailId                |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |                     | John.Smith@gmail.com   |

  @Phase_CD @Phase @APUI138_TC16_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI138_TC16_Aff_CD To verify the Error Message to be displayed and Generate button to be grayed out when Email option is been selected with invalidlengthName
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Email Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<EmailId>"
    When User enter the Alphabets Count Of Name
    Then Verify User is able to view Disable the Generate button
    Examples:
      | browser | urlName        | UserName            | password    |  Name  | EmailId                      |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |        |  John.Smith@gmail.com        |

  @PhaseAll_CD @PhaseAll @APUI138_TC17_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI138_TC17_Aff_CD To verify the Error Message to be displayed and Generate button to be grayed out when Mobile option is been selected without entering name
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects SMS Checkbox for send registration link
    When User enter the Name "<WithoutName>" and MobileNumber "<MobileNumber>"
    Then Verify User is able to view Disable the Generate button
    Examples:
      | browser | urlName        | UserName            | password    |  WithoutName        | MobileNumber           |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |                     | 8067895432             |

  @Phase_CD @Phase @APUI138_TC18_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI138_TC18_Aff_CD To verify the Error Message to be displayed and Generate button to be grayed out when Mobile option is been selected with invalidlengthName
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects SMS Checkbox for send registration link
    When User enter the Name "<Name>" and MobileNumber "<MobileNumber>"
    When User enter the Alphabets Count Of Name
    Then Verify User is able to view Disable the Generate button
    Examples:
      | browser | urlName        | UserName            | password    |  Name  | MobileNumber  |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |        | 6754327891    |

  @PhaseAll_CD @PhaseAll @APUI138_TC19_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI138_TC19_Aff_CD To verify the Error Message to be displayed and Generate button to be grayed out when Email and Mobile option is been selected without entering name
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Both Checkbox for send registration link
    When User enter the Name "<WithoutName>" and EmailID "<EmailId>" and MobileNumber "<MobileNumber>"
    Then Verify User is able to view Disable the Generate button
    Examples:
      | browser | urlName        | UserName            | password    |  WithoutName        | EmailId                | MobileNumber  |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |                     | John.Smith@gmail.com   | 987654323456  |

  @Phase_CD @Phase @APUI138_TC20_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI138_TC20_Aff_CD To verify the Error Message to be displayed and Generate button to be grayed out when Email and Mobile option is been selected with invalidlengthName
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Both Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<EmailId>" and MobileNumber "<MobileNumber>"
    When User enter the Alphabets Count Of Name
    Then Verify User is able to view Disable the Generate button
    Examples:
      | browser | urlName        | UserName            | password        |  Name        | EmailId                | MobileNumber  |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword     |              | John.Smith@gmail.com   | 987654323456  |

