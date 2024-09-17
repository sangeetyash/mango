@Affiliate_InSprint_LoginPage_CD @APUI_53_CD @CD
Feature: Affiliate V2.0 Login Page for APUI53-CD

  @PhaseAll_CD @PhaseAll @APUI53_TC1_Aff_CD @Affiliates_Sprint5_CD @Acceptence_1_CD @QASprint5_CD
  Scenario Outline:APUI53_TC1_Aff_CD To Verify that User Should be able to view the Forget Password Link on Login Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User successfully landed on Login page
    Then User should be able to view the ForgetPassword Link
    Examples:
      | browser | urlName        |
      | Chrome  | AffiliateCDURL |

  @PhaseAll_CD @PhaseAll @APUI53_TC2_Aff_CD @Affiliates_Sprint5_CD @Acceptence_2_CD @QASprint5_CD
  Scenario Outline:APUI53_TC2_Aff_CD To Verify the user should be navigated to Forget password page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User successfully landed on Login page
    Then User should be able to view the ForgetPassword Link
    And User Clicks on Forgot Password button
    Then User Navigates to Reset Password Page
    Examples:
      | browser | urlName        |
      | Chrome  | AffiliateCDURL |

  @PhaseAll_CD @PhaseAll @APUI53_TC3_Aff_CD @Affiliates_Sprint5_CD @Acceptence_3_CD @QASprint5_CD @Regression
  Scenario Outline:APUI53_TC3_Aff_CD To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User successfully landed on Login page
    Then User should be able to view the ForgetPassword Link
    And User Clicks on Forgot Password button
    Then User Navigates to Reset Password Page
    And User should view the Organization information Before Login in header and fotter sections
    Examples:
      | browser | urlName        |
      | Chrome  | AffiliateCDURL |
