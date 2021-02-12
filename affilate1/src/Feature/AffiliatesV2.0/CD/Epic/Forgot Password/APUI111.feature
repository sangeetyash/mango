@Affiliate_InSprint_ForgotPassword_CD @APUI_111_CD @CD
Feature: Affiliate V2.0 Forgot Password for APUI111-CD

  @PhaseAll_CD @PhaseAll @APUI111_TC1_Aff_CD @Affiliates_Sprint8_CD @Acceptence_1_CD @QASprint8_CD @Smoke @Regression
  Scenario Outline:APUI111_TC1_Aff_CD To Verify that Verification Link is been generated when Reset Password Journey is been Performed
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User successfully landed on Login page
    Then User should be able to view the ForgetPassword Link
    And User Clicks on Forgot Password button
    Then User Navigates to Reset Password Page
    And User enters Email Address  "<emailAddress>"
    Then User Clicks on Reset Password button
    And User Navigates to Verification Link Page
    Then User should able to view the Success message for Forgot Password - Verification link sent to an email "<emailAddress>"
    Examples:
      | browser | urlName        | emailAddress        |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName |

  @PhaseAll_CD @PhaseAll @APUI111_TC2_Aff_CD @Affiliates_Sprint8_CD @Acceptence_1_CD @QASprint8_CD
  Scenario Outline:TC2_APUI111_AFF To Verify that Verification Link should not be generated when User Enters the Email ID of other Organization User
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User successfully landed on Login page
    Then User should be able to view the ForgetPassword Link
    And User Clicks on Forgot Password button
    Then User Navigates to Reset Password Page
    And User enters Email Address  "<emailAddress>"
    Then User Clicks on Reset Password button
    Then System should display error message as AccountDoesNotExist
    Examples:
      | browser | urlName        | emailAddress        |
      | Chrome  | AffiliateCDURL | AffTorFXOzUserName |

  @PhaseAll_CD @PhaseAll @APUI111_TC3_Aff_CD @Affiliates_Sprint8_CD @Acceptence_1_CD @QASprint8_CD
  Scenario Outline:APUI111_TC3_Aff_CD To Verify that Verification Link should not be generated when User Enters InValid value for Email Address
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User successfully landed on Login page
    Then User should be able to view the ForgetPassword Link
    And User Clicks on Forgot Password button
    Then User Navigates to Reset Password Page
    And User enters Email Address  "<emailAddress>"
    And User Clicks on ResetYourPasswordHeaderScreen button
    Then System should display error message as PleasePassCorrectValues
    Examples:
      | browser | urlName        | emailAddress        |
      | Chrome  | AffiliateCDURL | InvalidValueUsername|
