@Affiliate_InSprint_BecomeaPartner_CD @APUI_372_CD @CD
Feature: Affiliate V2.0 Become a Partner Page for APUI372-CD

  @PhaseAll_CD @PhaseAll @APUI372_TC1_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD @Regression
  Scenario Outline: TC1_APUI372_AFF_CD To verify user should be able to select single options from client sections for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User enters An Individual the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User selects Only One option from client option
    Then User should be able to view the Single option been selected on client

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI372_TC2_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline: TC2_APUI372_AFF_CD To verify user should be able to select multiple options from client sections for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User enters An Individual the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User selects Multiple option from client option
    Then User should be able to view the Multiple option been selected on client

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI372_TC3_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline: TC3_APUI372_AFF_CD To verify user should be able to select single options from client sections for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User enters A Company the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User selects Only One option from client option
    Then User should be able to view the Single option been selected on client

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|


  @PhaseAll_CD @PhaseAll @APUI372_TC4_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD @Regression
  Scenario Outline: TC4_APUI372_AFF_CD To verify user should be able to select single options from client sections for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User enters A Company the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User selects Multiple option from client option
    Then User should be able to view the Multiple option been selected on client

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|

  @PhaseAll_CD @PhaseAll @APUI372_TC5_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline: TC5_APUI372_AFF_CD To verify user should be able to select single options from Industry sections for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User enters An Individual the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User selects Only One option from client option
    And  User clicks on Industries field
    And User selects Only One option from Industry option
    Then User should be able to view the Single option been selected on Industry

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI372_TC6_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD @Regression
  Scenario Outline: TC6_APUI372_AFF_CD To verify user should be able to select multiple options from Industry sections for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User enters An Individual the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User selects Only One option from client option
    And  User clicks on Industries field
    And User selects Multiple option from Industry option
    Then User should be able to view the Multiple option been selected on Industry

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI372_TC7_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline: TC7_APUI372_AFF_CD To verify user should be able to select single options from Industry sections for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User enters A Company the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User selects Only One option from client option
    And  User clicks on Industries field
    And User selects Only One option from Industry option
    Then User should be able to view the Single option been selected on Industry

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|

  @PhaseAll_CD @PhaseAll @APUI372_TC8_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline: TC8_APUI372_AFF_CD To verify user should be able to select multiple options from Industry sections for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User enters A Company the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User selects Only One option from client option
    And  User clicks on Industries field
    And User selects Multiple option from Industry option
    Then User should be able to view the Multiple option been selected on Industry

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|

  @PhaseAll_CD @PhaseAll @APUI372_TC9_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD
  Scenario Outline: TC9_APUI372_AFF_CD To verify user should be able to select single options from Country sections for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User enters An Individual the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User selects Only One option from client option
    And  User clicks on CountryForClients field
    And User selects Only One option from Country option
    Then User should be able to view the Single option been selected on Country

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI372_TC10_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD
  Scenario Outline: TC10_APUI372_AFF_CD To verify user should be able to select multiple options from Country sections for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User enters An Individual the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User selects Only One option from client option
    And  User clicks on CountryForClients field
    And User selects Multiple option from Country option
    Then User should be able to view the Multiple option been selected on Country

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI372_TC11_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD
  Scenario Outline: TC11_APUI372_AFF_CD To verify user should be able to select single options from Country sections for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User enters A Company the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User selects Only One option from client option
    And  User clicks on CountryForClients field
    And User selects Only One option from Country option
    Then User should be able to view the Single option been selected on Country

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|

  @PhaseAll_CD @PhaseAll @APUI372_TC12_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD
  Scenario Outline: TC12_APUI372_AFF_CD To verify user should be able to select multiple options from Country sections for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User enters A Company the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User selects Only One option from client option
    And  User clicks on CountryForClients field
    And User selects Multiple option from Country option
    Then User should be able to view the Multiple option been selected on Country

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|

  @PhaseAll_CD @PhaseAll @APUI372_TC13_Aff_CD @Affiliates_Sprint11_CD @Acceptence_4_CD @QASprint11_CD
  Scenario Outline: TC13_APUI372_AFF_CD To verify user should be able to select single options from Language sections for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User enters An Individual the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User selects Only One option from client option
    And  User clicks on Language field
    And User selects Only One option from Language option
    Then User should be able to view the Single option been selected on Language

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI372_TC14_Aff_CD @Affiliates_Sprint11_CD @Acceptence_4_CD @QASprint11_CD @Regression
  Scenario Outline: TC14_APUI372_AFF_CD To verify user should be able to select Multiple options from Language sections for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User enters An Individual the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User selects Only One option from client option
    And  User clicks on Language field
    And User selects Multiple option from Language option
    Then User should be able to view the Multiple option been selected on Language

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI372_TC15_Aff_CD @Affiliates_Sprint11_CD @Acceptence_4_CD @QASprint11_CD
  Scenario Outline: TC15_APUI372_AFF_CD To verify user should be able to select single options from Language sections for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User enters A Company the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User selects Only One option from client option
    And  User clicks on Language field
    And User selects Only One option from Language option
    Then User should be able to view the Single option been selected on Language

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyNmae|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|

  @PhaseAll_CD @PhaseAll @APUI372_TC16_Aff_CD @Affiliates_Sprint11_CD @Acceptence_4_CD @QASprint11_CD
  Scenario Outline: TC16_APUI372_AFF_CD To verify user should be able to select Multiple options from Language sections for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User enters A Company the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User selects Only One option from client option
    And  User clicks on Language field
    And User selects Multiple option from Language option
    Then User should be able to view the Multiple option been selected on Language

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|

  @PhaseAll_CD @PhaseAll @APUI372_TC17_Aff_CD @Affiliates_Sprint11_CD @Acceptence_5_CD @QASprint11_CD
  Scenario Outline: TC17_APUI372_AFF_CD To verify continue button to be grayed out when tick option is not been selected for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User enters An Individual the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User does not select any client options
    Then Continue button to be Observed as Grayed Out

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI372_TC18_Aff_CD @Affiliates_Sprint11_CD @Acceptence_5_CD @QASprint11_CD
  Scenario Outline: TC18_APUI372_AFF_CD To verify continue button to be grayed out when tick option is not been selected for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User enters A Company the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User does not select any client options
    Then Continue button to be Observed as Grayed Out

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|

  @PhaseAll_CD @PhaseAll @APUI372_TC19_Aff_CD @Affiliates_Sprint12_CD @Acceptence_7_CD @QASprint12_CD
  Scenario Outline: TC19_APUI372_AFF_CD To verify continue button to be grayed out when Industry option is not been selected for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User enters An Individual the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User does not select any Industry options
    Then Continue button to be Observed as Grayed Out

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI372_TC20_Aff_CD @Affiliates_Sprint12_CD @Acceptence_7_CD @QASprint12_CD
  Scenario Outline: TC20_APUI372_AFF_CD To verify continue button to be grayed out when Language option is not been selected for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User enters A Company the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User does not select any Language options
    Then Continue button to be Observed as Grayed Out

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|

  @PhaseAll_CD @PhaseAll @APUI372_TC21_Aff_CD @Affiliates_Sprint12_CD @Acceptence_7_CD @QASprint12_CD
  Scenario Outline: TC21_APUI372_AFF_CD To verify continue button to be grayed out when Country option is not been selected for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User enters An Individual the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User does not select any Country options
    Then Continue button to be Observed as Grayed Out

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI372_TC22_Aff_CD @Affiliates_Sprint12_CD @Acceptence_7_CD @QASprint12_CD @Regression
  Scenario Outline: TC22_APUI372_AFF_CD To Verify user should be able to use back button for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User enters A Company the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User click on Back on Create an Account.
    Then User will be navigated to Bank Details Page

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|

  @PhaseAll_CD @PhaseAll @APUI372_TC23_Aff_CD @Affiliates_Sprint12_CD @Acceptence_7_CD @QASprint12_CD
  Scenario Outline: TC23_APUI372_AFF_CD To verify continue button to be grayed out when Country option is not been selected for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User enters An Individual the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    Then User should view the Organization information Before Login in header and fotter sections

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |


















