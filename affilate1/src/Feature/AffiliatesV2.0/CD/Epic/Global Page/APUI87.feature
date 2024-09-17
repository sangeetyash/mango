@Affiliate_InSprint_GlobalPage_CD @APUI_87_CD @CD
Feature: Affiliate V2.0 Global page elements for APUI87_CD

  #Tester Needs to Contact Affilate Dev team to Check for the Pages which have been Descoped
  @PhaseAll_CD @PhaseAll @APUI87_TC1_Aff_CD @Affiliates_Sprint9_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI87_TC1_Aff_CD To Verify the Page if user try to access a page that is unavailable
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Enter path for page not developed Appending the Base URL
    Then System will show Error Message as Page is missing for Invalid Base URL with Back to Accounts button on page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI87_TC2_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI87_TC2_Aff_CD To Verify the Page if user updates the value from invalid to valid
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Enter any Invalid Path Appending the Base URL
    Then System will show Error Message as Page is missing for Invalid Base URL with Back to Accounts button on page
    And User Enter Valid cd URL for Account page
    Then System should display the Account Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI87_TC3_Aff_CD @Affiliates_Sprint10_CD @Acceptence_2_CD @QASprint10_CD
  Scenario Outline:APUI87_TC3_Aff_CD To Verify the Page if user try to access a URL that does not exist
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Enter any Invalid URL Appending the Base URL
    Then System will show Error Message as Site not reachable
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @Phase_CD @Phase @APUI87_TC4_Aff_CD @Affiliates_Sprint10_CD @Acceptence_2_CD @QASprint10_CD
  Scenario Outline:APUI87_TC4_Aff_CD To Verify the Page if user updates the Url from Incorrect to correct
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Enter any Invalid URL Appending the Base URL
    Then System will show Error Message as Site not reachable
    And User Enter Valid cd URL for Account page
    Then User will be navigated to the Affiliates Login Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI87_TC5_Aff_CD @Affiliates_Sprint10_CD @Acceptence_3_CD @QASprint10_CD
  Scenario Outline:APUI87_TC5_Aff_CD To Verify the User should be able to navigate back to account page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Enter any Invalid Path Appending the Base URL
    Then System will show Error Message as Page is missing for Invalid Base URL with Back to Accounts button on page
    Then User Clicks on Back to Account button on Missing Page error
    Then System should display the Account Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  #Tester Needs to Contact Affilate Dev team to Check for the Pages which have been Descoped
  @PhaseAll_CD @PhaseAll @APUI87_TC6_Aff_CD @Affiliates_Sprint10_CD @Acceptence_4_CD @QASprint10_CD
  Scenario Outline:APUI87_TC6_Aff_CD To Verify the User Should be view the Organization details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Enter any Invalid Path Appending the Base URL
    And System will show Error Message as Page is missing for Invalid Base URL with Back to Accounts button on page
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI87_TC7_Aff_CD @Affiliates_Sprint10_CD @Acceptence_2_CD @QASprint10_CD
  Scenario Outline:APUI87_TC7_Aff_CD To Verify the Page if user updates the Valid Url from one organization to other
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Enter other organization URL Appending the Base URL
    Then User will be navigated to the Affiliates Login Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |
