@Affiliate_InSprint_ReferAClient_CD @APUI_74_CD @CD
Feature: Affiliate V2.0 Refer a client feature for APUI74_CD

  @PhaseAll_CD @PhaseAll @APUI74_TC1_Aff_CD @Affiliates_Sprint5_CD @Acceptence_1_CD @QASprint5_CD
  Scenario Outline:APUI74_TC1_Aff_CD To Verify that the form is available to enter the details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    Then user should be able to view the details required for Individual fields
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI74_TC2_Aff_CD @Affiliates_Sprint6_CD @Acceptence_2_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI74_TC2_Aff_CD To Verify the DropDown options to be available for Individual referal
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User clicks on RACSalutation field
    Then User Should be able to Verify All values for Salutation DropDown
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI74_TC3_Aff_CD @Affiliates_Sprint5_CD @Acceptence_3_CD @QASprint5_CD
  Scenario Outline:APUI74_TC3_Aff_CD To Verify the FirstName field in Individual Referal
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User clicks on RACFirstName field
    Then User Should be able to enter any Value in RACFirstName field and validate the same value
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI74_TC4_Aff_CD @Affiliates_Sprint5_CD @Acceptence_3_CD @QASprint6_CD
  Scenario Outline:APUI74_TC4_Aff_CD To Verify the LastName field in Individual Referal
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User clicks on RACLastName field
    Then User Should be able to enter any Value in RACLastName field and validate the same value
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI74_TC5_Aff_CD @Affiliates_Sprint5_CD @Acceptence_4_CD @QASprint5_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI74_TC5_Aff_CD To Verify the User Should be able to Enter Valid Values in the FirstName field
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    Then User clicks on RACFirstName field
    And User enters more than required characters in RACFirstName field
    Then User Should be able view the Error message for RACFirstName field
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI74_TC6_Aff_CD @Affiliates_Sprint5_CD @Acceptence_4_CD @QASprint5_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI74_TC6_Aff_CD To Verify the FirstName field in Individual Referal
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User clicks on RACFirstName field
    Then User Should be able to enter any Value in RACFirstName field and validate the same value
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI74_TC7_Aff_CD @Affiliates_Sprint5_CD @Acceptence_4_CD @QASprint5_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI74_TC7_Aff_CD To Verify the User Should be able to Enter Valid Values in the FirstName field
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    Then User clicks on RACFirstName field
    And User enters more than required characters in RACLastName field
    Then User Should be able view the Error message for RACLastName field
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI74_TC8_Aff_CD @Affiliates_Sprint5_CD @Acceptence_4_CD @QASprint6_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun @Regression
  Scenario Outline:APUI74_TC8_Aff_CD To Verify the LastName field in Individual Referal
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User clicks on RACLastName field
    Then User Should be able to enter any Value in RACLastName field and validate the same value
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI74_TC9_Aff_CD @Affiliates_Sprint5_CD @Acceptence_5_CD @QASprint5_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI74_TC9_Aff_CD To Verify the User Should be able to Submit form once details are Valid
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon     | Lobo       |

  @PhaseAll_CD @PhaseAll @APUI74_TC10_Aff_CD @Affiliates_Sprint5_CD @Acceptence_6_CD @QASprint5_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:APUI74_TC10_Aff_CD To Verify the User Should be able to validate header & footer on Refer a Client - Personal details page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User click on Refer a client on dashboard.
    And System should able to view the Refer a client page with two options Individual and Corporate
    And User should view the Organization information After Login in header and fotter sections
    Then User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    | Salutation | FirstName | LastName |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | Mr         | Jhon     | Lobo       |

