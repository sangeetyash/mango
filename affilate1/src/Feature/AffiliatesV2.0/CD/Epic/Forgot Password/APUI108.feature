@Affiliate_InSprint_ForgotPassword_CD @APUI_108_CD @CD
Feature: Affiliate V2.0 Forgot Password APUI-108_CD

  @PhaseAll_CD @PhaseAll @APUI108_TC1_Aff_CD @Affiliates_Sprint5_CD @Acceptence_1_CD @QASprint5_CD
  Scenario Outline:TC1_APUI108_AFF_CD_To Verify that User should be able to Perform the Reset Password Journey
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User Clicks on Forgot Password button
    Then User Navigates to Reset Password Page
    And User enters Email Address  "<emailAddress>"
    And User Clicks on Reset Password button
    Then User Navigates to Verification Link Page
    Examples:
      | browser | urlName        | emailAddress        |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName |

  @PhaseAll_CD @PhaseAll @APUI108_TC2_Aff_CD @Affiliates_Sprint5_CD @Acceptence_1_CD @QASprint5_CD
  Scenario Outline:TC2_APUI108_AFF To Verify that User should be able to Perform the Reset Password Journey with Migrated User
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User Clicks on Forgot Password button
    Then User Navigates to Reset Password Page
    And User enters Email Address  "<emailAddress>"
    And User Clicks on Reset Password button
    Then User Navigates to Verification Link Page
    Examples:
      | browser | urlName        | emailAddress                |
      | Chrome  | AffiliateCDURL |AffiliateMigratedUserName_CD |

  @PhaseAll_CD @PhaseAll @APUI108_TC3_Aff_CD @Affiliates_Sprint5_CD @Acceptence_2_CD @QASprint5_CD @Regression
  Scenario Outline:TC3_APUI108_AFF To  Verify the System behaviour when spaces are been Passed
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User Clicks on Forgot Password button
    Then User Navigates to Reset Password Page
    And User enters Email Address  "<emailAddress>"
    And User Clicks on ResetYourPasswordHeaderScreen button
    Then System should display error message as PleasePassCorrectValues
    Examples:
      | browser | urlName        | emailAddress      |
      | Chrome  | AffiliateCDURL |  EmailIdWithSpaces |

  @PhaseAll_CD @PhaseAll @APUI108_TC4_Aff_CD @Affiliates_Sprint5_CD @Acceptence_2_CD @QASprint5_CD
  Scenario Outline:TC4_APUI108_AFF To  Verify the System behaviour when InValid Email ID is been Passed
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User Clicks on Forgot Password button
    Then User Navigates to Reset Password Page
    And User enters Email Address  "<emailAddress>"
    When User Clicks on Reset Password button
    Then System should display error message as AccountDoesNotExist
    Examples:
      | browser | urlName        | emailAddress         |
      | Chrome  | AffiliateCDURL | NonAffiliateUserName |


  @PhaseAll_CD @PhaseAll @APUI108_TC5_Aff_CD @Affiliates_Sprint5_CD @Acceptence_2_CD @QASprint5_CD
  Scenario Outline:TC5_APUI108_AFF To  Verify the System behaviour when InValid Domain name or values are been Passed
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User Clicks on Forgot Password button
    Then User Navigates to Reset Password Page
    And User enters Email Address  "<emailAddress>"
    When User Clicks on ResetYourPasswordHeaderScreen button
    Then System should display error message as PleasePassCorrectValues
    Examples:
      | browser | urlName        | emailAddress|
      | Chrome  | AffiliateCDURL | InvalidDomainUsername|

  @PhaseAll_CD @PhaseAll @APUI108_TC6_Aff_CD @Affiliates_Sprint5_CD @Acceptence_2_CD @QASprint5_CD @Regression
  Scenario Outline:TC6_APUI108_AFF To  Verify the System behaviour when Email_ID of other Organization or Brand is been Passed
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User Clicks on Forgot Password button
    Then User Navigates to Reset Password Page
    And User enters Email Address  "<emailAddress>"
    When User Clicks on Reset Password button
    Then System should display error message as AccountDoesNotExist
    Examples:
      | browser | urlName        | emailAddress       |
      | Chrome  | AffiliateCDURL | AffTorFXOzUserName |


  @PhaseAll_CD @PhaseAll @APUI108_TC7_Aff_CD @Affiliates_Sprint5_CD @Acceptence_3_CD @QASprint5_CD
  Scenario Outline:TC7_APUI108_AFF To Verify that user is able to view correct Organization baseed details while Performing reset opertaion
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User Clicks on Forgot Password button
    Then User Navigates to Reset Password Page
    And User enters Email Address  "<emailAddress>"
    When User Clicks on Reset Password button
    Then User Navigates to Verification Link Page
    And User should view the Organization information Before Login in header and fotter sections
    Examples:
      | browser | urlName        | emailAddress        |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName |

  @PhaseAll_CD @PhaseAll @APUI108_TC8_Aff_CD @Affiliates_Sprint5_CD @Acceptence_2_CD @QASprint5_CD @Regression
  Scenario Outline:APUI108_TC8_Aff_CD To  Verify the System behaviour when Cliks on Email address but No details are been Passed
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User Clicks on Forgot Password button
    Then User Navigates to Reset Password Page
    And User Clicks on Email Address field
    And User Clicks on ResetYourPasswordHeaderScreen button
    Then System should display error message as PleasePassCorrectValues
    Examples:
      | browser | urlName        |
      | Chrome  | AffiliateCDURL |