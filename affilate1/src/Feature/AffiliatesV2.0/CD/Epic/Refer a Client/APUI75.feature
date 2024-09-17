@Affiliate_InSprint_ReferAClient_CD @APUI_75_CD @CD
Feature: Affiliate V2.0 Refer a client feature for APUI75

  @PhaseAll_CD @PhaseAll @APUI75_TC1_Aff_CD @Affiliates_Sprint6_CD @Acceptence_1_CD @QASprint6_CD
  Scenario Outline:APUI75_TC1_Aff_CD To Verify that the form is available to enter the details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    Then user should be able to view the details required for Corporate fields
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI75_TC2_Aff_CD @Affiliates_Sprint6_CD @Acceptence_1_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun @Regression
  Scenario Outline:TC2_APUI75_AFF To Verify the DropDown options to be available for Corporate referal
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User clicks on RACSalutation field
    Then User Should be able to Verify All values for Salutation DropDown
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI75_TC3_Aff_CD @Affiliates_Sprint6_CD @Acceptence_3_CD @QASprint6_CD @Reruntest
  Scenario Outline:APUI75_TC3_Aff_CD To Verify the FirstName field in Corporate Referal
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User clicks on RACFirstName field
    Then User Should be able to enter any Value in RACFirstName field and validate the same value
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI75_TC4_Aff_CD @Affiliates_Sprint6_CD @Acceptence_3_CD @QASprint6_CD @Reruntest
  Scenario Outline:APUI75_TC4_Aff_CD To Verify the LastName field in Individual Referal
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User clicks on RACLastName field
    Then User Should be able to enter any Value in RACLastName field and validate the same value
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI75_TC5_Aff_CD @Affiliates_Sprint6_CD @Acceptence_3_CD @QASprint6_CD @Reruntest
  Scenario Outline:APUI75_TC5_Aff_CD To Verify the Company field in Corporate Referal
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User clicks on RACCompanyName field
    Then User Should be able to enter any Value in RACCompanyName field and validate the same value
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI75_TC6_Aff_CD @Affiliates_Sprint6_CD @Acceptence_4_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI75_TC6_Aff_CD To Verify the FirstName field in Corporate Referal is Mandatory
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    Then User clicks on RACFirstName field
    Then User Should be able view the Error message for RACFirstName field
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI75_TC7_Aff_CD @Affiliates_Sprint6_CD @Acceptence_4_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI75_TC7_Aff_CD To Verify the LastName field in Corporate Referal is Mandatory
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    Then User clicks on RACLastName field
    Then User Should be able view the Error message for RACLastName field
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI75_TC8_Aff_CD @Affiliates_Sprint6_CD @Acceptence_4_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI75_TC8_Aff_CD To Verify the Company field in Corporate Referal is Mandatory
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    Then User clicks on RACCompanyName field
    Then User Should be able view the Error message for RACCompanyName field
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI75_TC9_Aff_CD @Affiliates_Sprint6_CD @Acceptence_5_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI75_TC9_Aff_CD To Verify the User Should be able to Enter Valid Values in the FirstName field
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User click on Refer a client on dashboard.
    And System should able to view the Refer a client page with two options Individual and Corporate
    Then User Selects Corporate option
    And User clicks on RACTradingName field
    Then User Should NOT get Error message for valid inputs on optional RACTradingName field
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI75_TC10_Aff_CD @Affiliates_Sprint6_CD @Acceptence_6_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC10_APUI75_AFF To Verify the User Should be able to Enter Valid Values in the FirstName field
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User click on Refer a client on dashboard.
    And System should able to view the Refer a client page with two options Individual and Corporate
    Then User Selects Corporate option
    Then User clicks on RACFirstName field
    And User enters more than required characters in RACFirstName field
    Then User Should be able view the Error message for RACFirstName field
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI75_TC11_Aff_CD @Affiliates_Sprint6_CD @Acceptence_6_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun @Reruntest
  Scenario Outline:APUI75_TC11_Aff_CD To Verify the User Should be able to Enter Valid Values in the FirstName field
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User click on Refer a client on dashboard.
    And System should able to view the Refer a client page with two options Individual and Corporate
    Then User Selects Corporate option
    And User clicks on RACFirstName field
    Then User Should be able to enter any Value in RACFirstName field and validate the same value
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI75_TC12_Aff_CD @Affiliates_Sprint6_CD @Acceptence_6_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI75_TC12_Aff_CD To Verify the User Should be able to Enter Valid Values in the LastName field
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User click on Refer a client on dashboard.
    And System should able to view the Refer a client page with two options Individual and Corporate
    Then User Selects Corporate option
    Then User clicks on RACLastName field
    And User enters more than required characters in RACLastName field
    Then User Should be able view the Error message for RACLastName field
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI75_TC13_Aff_CD @Affiliates_Sprint6_CD @Acceptence_6_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun @Reruntest
  Scenario Outline:APUI75_TC13_Aff_CD To Verify the User Should be able to Enter Valid Values in the FirstName field
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User clicks on RACLastName field
    Then User Should be able to enter any Value in RACLastName field and validate the same value
    Then User Should be able view the Error message for RACLastName field
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI75_TC14_Aff_CD @Affiliates_Sprint6_CD @Acceptence_6_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun @Reruntest
  Scenario Outline:APUI75_TC14_Aff_CD To Verify the User Should be able to Enter more number of Character in the CompanyName field
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    Then User clicks on RACCompanyName field
    And User enters more than required characters in RACCompanyName field
    Then User Should be able view the Error message for RACCompanyName field
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI75_TC15_Aff_CD @Affiliates_Sprint6_CD @Acceptence_6_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI75_TC15_Aff_CD To Verify the User Should be able to Enter Valid Values in the CompanyName field
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    Then User clicks on RACCompanyName field
    And User Should be able to enter any Value in RACCompanyName field and validate the same value
    Then User Should be able view the Error message for RACCompanyName field
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI75_TC16_Aff_CD @Affiliates_Sprint6_CD @Acceptence_6_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI75_TC16_Aff_CD To Verify the User Should be able to Enter Valid Values in the FirstName field
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    Then User clicks on RACTradingName field
    And User enters more than required characters in RACTradingName field
    Then User Should be able view the Error message for RACTradingName field
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI75_TC17_Aff_CD @Affiliates_Sprint6_CD @Acceptence_7_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI75_TC17_Aff_CD To Verify the User Should be able to Submit form once details are Valid
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User click on Refer a client on dashboard.
    And System should able to view the Refer a client page with two options Individual and Corporate
    Then User Selects Corporate option
    And User Enters only mandatory Corporate fields Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" and Click on Continue
    Then System will navigate to the Contact details Page
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | CompanyName |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CD Holdings |

  @PhaseAll_CD @PhaseAll @APUI75_TC18_Aff_CD @Affiliates_Sprint6_CD @Acceptence_8_CD @QASprint6_CD
  Scenario Outline:TC18_APUI75_AFF To Verify the User Should be able to Submit form once details are Valid
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User click on Refer a client on dashboard.
    And System should able to view the Refer a client page with two options Individual and Corporate
    Then User Selects Corporate option
    And User Enters only mandatory Corporate fields Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" and Click on Continue
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName | CompanyName |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon      | Lobo     | CD Holdings |
