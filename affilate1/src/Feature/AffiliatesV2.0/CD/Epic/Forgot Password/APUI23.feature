@Affiliate_InSprint_ForgotPassword_CD @APUI_23_CD @CD
Feature: Affiliate V2.0 Forgot Password for APUI23-CD

  @PhaseAll_CD @PhaseAll @APUI23_TC2_Aff_CD @Affiliates_Sprint8_CD @Acceptence_2_CD @QASprint8_CD
  Scenario Outline: APUI23_TC2_Aff_CD To validate that User Should be notified when Reset Password Journey is been performed
     #Loader is displayed for few milliSsconds and hence could not capture
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User successfully landed on Login page
    Then User should be able to view the ForgetPassword Link
    And User Clicks on Forgot Password button
    Then User Navigates to Reset Password Page
    And User enters Email Address  "<emailAddress>"
    And User Clicks on Reset Password button
    Then User Navigates to Verification Link Page
    Then User Should able to view the Loader with the Email "<emailAddress>" for which the Journey is been performed
    Examples:
      | browser | urlName        | emailAddress        |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName |

  @PhaseAll_CD @PhaseAll @APUI23_TC4_Aff_CD @Affiliates_Sprint8_CD @Acceptence_4_CD @QASprint8_CD
  Scenario Outline: APUI23_TC4_Aff_CD To validate the User should be able to resend the Verification link once
     #Loader is displayed for few milliSsconds and hence could not capture
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User successfully landed on Login page
    Then User should be able to view the ForgetPassword Link
    And User Clicks on Forgot Password button
    Then User Navigates to Reset Password Page
    And User enters Email Address  "<emailAddress>"
    And User Clicks on Reset Password button
    Then User Navigates to Verification Link Page
    Then User Should able to view the Loader with the Email "<emailAddress>" for which the Journey is been performed
    And User Clicks on Resend link
    Then System will display message as Another verification link is been send with loader
    #Then After 10 secs system will navigate to login page
    Examples:
      | browser | urlName        | emailAddress        |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName |

  @PhaseAll_CD @PhaseAll @APUI23_TC5_Aff_CD @Affiliates_Sprint8_CD @Acceptence_4_CD @QASprint8_CD @Regression
  Scenario Outline: APUI23_TC5_Aff_CD To validate the User should be able to resend the Verification link only twice
    #Loader is displayed for few milliSsconds and hence could not capture
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User successfully landed on Login page
    Then User should be able to view the ForgetPassword Link
    And User Clicks on Forgot Password button
    Then User Navigates to Reset Password Page
    And User enters Email Address  "<emailAddress>"
    And User Clicks on Reset Password button
    Then User Navigates to Verification Link Page
    Then User Should able to view the Loader with the Email "<emailAddress>" for which the Journey is been performed
    And User Clicks on Resend link
    Then System will display message as Another verification link is been send with loader
    And User Clicks on Resend link
    Then System will display message as Another verification link is been send with loader
    Then Resend link to be observed as Grayed out
    Examples:
      | browser | urlName        | emailAddress        |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName |

  @PhaseAll_CD @PhaseAll @APUI23_TC6_Aff_CD @Affiliates_Sprint8_CD @Acceptence_4_CD @QASprint8_CD
  Scenario Outline: APUI23_TC6_Aff_CD To validate the User has not used the resend link
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User successfully landed on Login page
    Then User should be able to view the ForgetPassword Link
    And User Clicks on Forgot Password button
    Then User Navigates to Reset Password Page
    And User enters Email Address  "<emailAddress>"
    And User Clicks on Reset Password button
    Then User Navigates to Verification Link Page
    And User is able to view Resend link
    Then User Should able to view the Loader with the Email "<emailAddress>" for which the Journey is been performed
    #Then After 10 secs system will navigate to login page
    Examples:
      | browser | urlName        | emailAddress        |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName |


