@Affiliate_InSprint_AccessRolesAndPermissions_CD @APUI_51_CD @CD
Feature: Affiliate V2.0 Access, Roles And Permissions feature for APUI51-CD

  #Acceptence 1 and 2 will be covered jointly in this
  @PhaseAll_CD @PhaseAll @APUI51_TC1_Aff_CD @Affiliates_Sprint8_CD @Acceptence_1_CD @QASprint8_CD
  Scenario Outline: APUI51_TC1_Aff_CD To validate System should be able to login with only one email ID
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

#Acceptence 3 and 4 will be covered jointly in this
#Take a User of some other organization
  @PhaseAll_CD @PhaseAll @APUI51_TC2_Aff_CD @Affiliates_Sprint8_CD @Acceptence_3_CD @QASprint8_CD
  Scenario Outline: APUI51_TC2_Aff_CD To validate System should not be allowed to use with user of other organization
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then System should display error message as Invalid Credentials
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | NonAffiliateUserName | AffPassword |

    #Acceptence 3 and 4 will be covered jointly in this
    #Take an Email for which user is not present in affilates- Use TorFx or TORFxOz user for CD portal
  @PhaseAll_CD @PhaseAll @APUI51_TC3_Aff_CD @Affiliates_Sprint8_CD @Acceptence_3_CD @QASprint8_CD @Regression
  Scenario Outline: APUI51_TC3_Aff_CD To validate System should not be allowed to use with user of other organization
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then System should display error message as Invalid Credentials
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffTorfxUserName    | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI51_TC4_Aff_CD @Affiliates_Sprint8_CD @Acceptence_5_CD @QASprint8_CD @Smoke @Regression
  Scenario Outline: APUI51_TC4_Aff_CD To validate System should have access to all pages
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Account tab on dashboard.
    Then System should display the Account Page
    And User click on Refer a client on dashboard.
    Then System should display the refer new client Page
    And User click on Resources tab on dashboard.
    Then User will be navigated to the Resources section Page
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    And User click on Settings tab on dashboard.
    Then User will be navigated to the Settings section Page
    And User click on Commission tab on dashboard.
    Then User will be navigated to the Commission section Page
    Then User Clicks on Register a Customer
    And User will be navigated to the Register a customer Page
    Then User should be able to view Profile Link icon
    And User clicks on the Profile icon
    Then User will be able to view CustomerFullName "<CustomerFullName>" and AccountNumber "<CustomerAccountNumber>" on Profile section
    Examples:
      | browser | urlName        | UserName            | password    |      CustomerFullName       |    CustomerAccountNumber          |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | AffiliateCDCustomerFullName |  AffiliateCDCustomerAccountNumber |

  @PhaseAll_CD @PhaseAll @APUI51_TC5_Aff_CD @Affiliates_Sprint8_CD @Acceptence_6_CD @QASprint8_CD
  Scenario Outline: APUI51_TC5_Aff_CD To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |
