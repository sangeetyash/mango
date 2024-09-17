@Affiliate_InSprint_SettingsPage_CD @APUI_49_CD @CD
Feature: Affiliate V2.0 Settings Page elements for APUI49_CD

  @PhaseAll_CD @PhaseAll @APUI49_TC9_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI49_TC9_Aff_CD TC9_APUI49_AFF To validate fields to be grayed out for PFX Customers
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Settings tab on dashboard.
    And User Verify the Settings Page within section Company Details is Disabled
    And User Verify the Settings Page within section Personal Details is Disabled
    Then User Verify the Settings Page within section Contact Detail Email is Disabled
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI49_TC10_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI49_TC10_Aff_CD TC10_APUI49_AFF TC10_APUI49_AFF To validate fields to be grayed out for CFX Customers
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Settings tab on dashboard.
    And User Verify the Settings Page within section Company Details is Disabled
    And User Verify the Settings Page within section Personal Details is Disabled
    Then User Verify the Settings Page within section Contact Detail Email is Disabled
    Examples:
      | browser | urlName        | UserName                | password        |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_CFX | AffPassword_CFX |

  @PhaseAll_CD @PhaseAll @APUI49_TC13_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI49_TC13_Aff_CD TC13_APUI49_AFF TC13_APUI49_AFF To validate system should untick the opt me out option when user select any value from Email preference for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Settings tab on dashboard.
    Then User should be able to view the option as enabled and Check
    And User now Select a value on "<EmailList>" preference list
    Then User should be able to view the option as enabled and UnCheck
    Examples:
      | browser | urlName        | UserName                | password        |  EmailList              |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName     | AffPassword     |  Daily update           |

  @PhaseAll_CD @PhaseAll @APUI49_TC15_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI49_TC15_Aff_CD TC15_APUI49_AFF TC15_APUI49_AFF To validate system should untick the opt me out option when user select any value from Email preference for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Settings tab on dashboard.
    Then User should be able to view the option as enabled and Check
    And User now Select a value on "<EmailList>" preference list
    Then User should be able to view the option as enabled and UnCheck
    Examples:
      | browser | urlName        | UserName                    | password            |  EmailList              |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_CFX     | AffPassword_CFX     |  Daily update           |

  @PhaseAll_CD @PhaseAll @APUI49_TC21_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI49_TC21_Aff_CD To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Settings tab on dashboard.
    Then Verify the Header Section for Settings page
    Examples:
      | browser | urlName        | UserName                | password            |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName     | AffPassword         |

  @Phase_CD @Phase @APUI49_TC23_Aff_CD @Affiliates_Sprint10_CD @Acceptence_4_CD @QASprint11_CD
  Scenario Outline:APUI49_TC23_Aff_CD To validate System should give error when Mobile number is not present
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And  User click on Settings tab on dashboard.
    Then User will be navigated to the Settings section Page
    And  User Verify the Settings Page within section Company Details is Disabled
    And  User Verify the Settings Page within section Personal Details is Disabled
    Then User Verify the Settings Page within section Contact Detail Email is Disabled
    Then User observes proper values for MobileNumber and Address field
    And  User Deletes the MobileNumber field on Settings page
    Then User will observe error message and error icon for MobileNumber textbox
    Examples:
      | browser | urlName        | UserName                | password            |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName     | AffPassword         |


  @Phase_CD @Phase @APUI49_TC24_Aff_CD @Affiliates_Sprint10_CD @Acceptence_4_CD @QASprint11_CD
  Scenario Outline:APUI49_TC24_Aff_CD To validate System should give error for minimum mobile number length
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And  User click on Settings tab on dashboard.
    Then User will be navigated to the Settings section Page
    And  User Verify the Settings Page within section Company Details is Disabled
    And  User Verify the Settings Page within section Personal Details is Disabled
    Then User Verify the Settings Page within section Contact Detail Email is Disabled
    Then User observes proper values for MobileNumber and Address field
    And  User Deletes the MobileNumber field on Settings page
    And User enters MobileNumber of 7 digits
    Then User will observe error message and error icon for MobileNumber textbox
    Examples:
      | browser | urlName        | UserName                | password            |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName     | AffPassword         |


  @Phase_CD @Phase @APUI49_TC25_Aff_CD @Affiliates_Sprint10_CD @Acceptence_4_CD @QASprint11_CD
  Scenario Outline:APUI49_TC25_Aff_CD To validate System should give error for maximum mobile number length
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And  User click on Settings tab on dashboard.
    Then User will be navigated to the Settings section Page
    And  User Verify the Settings Page within section Company Details is Disabled
    And  User Verify the Settings Page within section Personal Details is Disabled
    Then User Verify the Settings Page within section Contact Detail Email is Disabled
    Then User observes proper values for MobileNumber and Address field
    And  User Deletes the MobileNumber field on Settings page
    And User enters MobileNumber of 15 digits
    Then User will observe error message and error icon for MobileNumber textbox
    Examples:
      | browser | urlName        | UserName                | password            |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName     | AffPassword         |


  @Phase_CD @Phase @APUI49_TC26_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline: APUI49_TC26_Aff_CD To validate System should give error when address is not correct
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And  User click on Settings tab on dashboard.
    Then User will be navigated to the Settings section Page
    And  User Verify the Settings Page within section Company Details is Disabled
    And  User Verify the Settings Page within section Personal Details is Disabled
    Then User Verify the Settings Page within section Contact Detail Email is Disabled
    Then User observes proper values for MobileNumber and Address field
    And  User click on Edit address on Settings page.
    And  User Deletes All Address field on Settings page
    Then User will observe error message and error icon for All Address textbox
    Examples:
      | browser | urlName        | UserName                | password            |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName     | AffPassword         |


  @Phase_CD @Phase @APUI49_TC27_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline: APUI49_TC27_Aff_CD To validate System should give error when address line 1 is beyond limit
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And  User click on Settings tab on dashboard.
    Then User will be navigated to the Settings section Page
    And  User Verify the Settings Page within section Company Details is Disabled
    And  User Verify the Settings Page within section Personal Details is Disabled
    Then User Verify the Settings Page within section Contact Detail Email is Disabled
    Then User observes proper values for MobileNumber and Address field
    And  User click on Edit address on Settings page.
    And  User Deletes All Address field on Settings page
    And Enters the Address line 1 more than 255 characters
    Then User will observe error message and error icon for Address Line 1 textbox
    Examples:
      | browser | urlName        | UserName                | password            |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName     | AffPassword         |


  @Phase_CD @Phase @APUI49_TC28_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline: APUI49_TC28_Aff_CD To validate System should give error when city is beyond limit
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And  User click on Settings tab on dashboard.
    Then User will be navigated to the Settings section Page
    And  User Verify the Settings Page within section Company Details is Disabled
    And  User Verify the Settings Page within section Personal Details is Disabled
    Then User Verify the Settings Page within section Contact Detail Email is Disabled
    Then User observes proper values for MobileNumber and Address field
    And  User click on Edit address on Settings page.
    And  User Deletes All Address field on Settings page
    And Enters the City more than 40 characters
    Then User will observe error message and error icon for Town/City textbox
    Examples:
      | browser | urlName        | UserName                | password            |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName     | AffPassword         |


  @Phase_CD @Phase @APUI49_TC29_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline:APUI49_TC29_Aff_CD To validate System should give error when state is beyond limit
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And  User click on Settings tab on dashboard.
    Then User will be navigated to the Settings section Page
    And  User Verify the Settings Page within section Company Details is Disabled
    And  User Verify the Settings Page within section Personal Details is Disabled
    Then User Verify the Settings Page within section Contact Detail Email is Disabled
    Then User observes proper values for MobileNumber and Address field
    And  User click on Edit address on Settings page.
    And  User Deletes All Address field on Settings page
    And Enters the State more than 80 characters
    Then User will observe error message and error icon for State textbox
    Examples:
      | browser | urlName        | UserName                | password            |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName     | AffPassword         |


  @Phase_CD @Phase @APUI49_TC30_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline: APUI49_TC30_Aff_CD To validate System should give error when postcode is beyond limit
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And  User click on Settings tab on dashboard.
    Then User will be navigated to the Settings section Page
    And  User Verify the Settings Page within section Company Details is Disabled
    And  User Verify the Settings Page within section Personal Details is Disabled
    Then User Verify the Settings Page within section Contact Detail Email is Disabled
    Then User observes proper values for MobileNumber and Address field
    And  User click on Edit address on Settings page.
    And  User Deletes All Address field on Settings page
    And Enters the Postcode more than 20 characters
    Then User will observe error message and error icon for Postcode textbox
    Examples:
      | browser | urlName        | UserName                | password            |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName     | AffPassword         |

  @Phase_CD @Phase @APUI49_TC31_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline: APUI49_TC31_Aff_CD To validate System should Update the address successfully
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And  User click on Settings tab on dashboard.
    Then User will be navigated to the Settings section Page
    And  User Verify the Settings Page within section Company Details is Disabled
    And  User Verify the Settings Page within section Personal Details is Disabled
    Then User Verify the Settings Page within section Contact Detail Email is Disabled
    Then User observes proper values for MobileNumber and Address field
    And  User click on Edit address on Settings page.
    And  User Deletes All Address field on Settings page
    And User Updates All Address fields AddressLine1 "<AddressLine1>" City "<City>" State "<State>" Postcode "<Postcode>" Country "<Country>" on Settings page
    And User click on Save changes on Settings page.
    And User is able to view Success Message for updating details on Settings page
    And  User click on Referrals tab on dashboard.
    And  User click on Settings tab on dashboard.
    Then User should be able to view the Updated All Address details
    Examples:
      | browser | urlName        | UserName                | password            |  AddressLine1   |     City     |    State   |  Postcode |   Country    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_TestBusinessUser     | AffPassword         | 24 Louis Street |United States | New Jersey | 2400145   |   France     |


#Failing due to New bug -- I have raised to tanuj on mail APUI-1008
  @Phase_CD @Phase @APUI49_TC32_Aff_CD @Affiliates_Sprint10_CD @Acceptence_4_CD @QASprint11_CD @Smoke
  Scenario Outline:APUI49_TC32_Aff_CD To validate System should Update the mobile number successfully
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And  User click on Settings tab on dashboard.
    Then User will be navigated to the Settings section Page
    And  User Verify the Settings Page within section Company Details is Disabled
    And  User Verify the Settings Page within section Personal Details is Disabled
    Then User Verify the Settings Page within section Contact Detail Email is Disabled
    Then User observes proper values for MobileNumber and Address field
    And  User Deletes the MobileNumber field on Settings page
    And User enters MobileNumber of 8 digits
    And User click on Save changes on Settings page.
    And User is able to view Success Message for updating details on Settings page
    Then User should be able to view the newly updated MobileNumber
    Examples:
      | browser | urlName        | UserName                | password            |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_TestBusinessUser     | AffPassword         |

