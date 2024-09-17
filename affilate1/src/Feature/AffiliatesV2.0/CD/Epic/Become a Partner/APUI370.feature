@Affiliate_InSprint_BecomeaPartner_CD @APUI_370_CD @CD
Feature: Affiliate V2.0 Become a Partner Page for APUI370-CD

  @PhaseAll_CD @PhaseAll @APUI370_TC1_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline: TC1_APUI370_AFF_CD To Verify that user should be able to use the valid Login details for PFX customers
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
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI370_TC2_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline: TC2_APUI370_AFF_CD To Verify that user should be able to use the valid Login details for CFX customers
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

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT         |Currencies Direct|

  @PhaseAll_CD @PhaseAll @APUI370_TC3_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline: TC3_APUI370_AFF_CD To Verify that error message to be displayed when user did not anything in Email Option for PFX customer
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
    And User clicks on EmailAddress and do not select any Value
    Then System EmailAddress should turn the input red and Continue button is been Grayed Out

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI370_TC4_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline: TC4_APUI370_AFF_CD To Verify that error message to be displayed when user enters invalid value in Email Option for PFX customer
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
    And User enters invalid value in email "<InValidEmail>"
    Then System EmailAddress should turn the input red and Continue button is been Grayed Out

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|InValidEmail|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |tanuj.kgmail.com|

  @PhaseAll_CD @PhaseAll @APUI370_TC5_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline: TC5_APUI370_AFF_CD To Verify that error message to be displayed when user did not anything in Email Option for PFX customer
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
    And User clicks on EmailAddress and do not select any Value
    Then System EmailAddress should turn the input red and Continue button is been Grayed Out

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|InValidEmail|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT         |Currencies Direct|tanuj.kgmail.com     |


  @PhaseAll_CD @PhaseAll @APUI370_TC6_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline: TC6_APUI370_AFF_CD To Verify that error message to be displayed when user enters invalid value in Email Option for CFX customer
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
    And User enters invalid value in email "<InValidEmail>"
    Then System EmailAddress should turn the input red and Continue button is been Grayed Out

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|InValidEmail|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT         |Currencies Direct|tanuj.kgmail.com     |

  @PhaseAll_CD @PhaseAll @APUI370_TC7_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD @Regression
  Scenario Outline: TC7_APUI370_AFF_CD To Verify that Password field should meet minimum security standard for atleast 10 characters for PFX Customer
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
    And User enters Valid value in email "<ValidEmail>"
    And User click on the Password enter the name Minimum 10 characters
    Then User should be able to view the at least 10 characters option in green
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|ValidEmail|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |John.Smith@gmail.com     |

  @PhaseAll_CD @PhaseAll @APUI370_TC8_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD @Regression
  Scenario Outline: TC8_APUI370_AFF_CD  To Verify that Password field should meet minimum security standard for less than 16 characters for PFX Customer
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
    And User enters Valid value in email "<ValidEmail>"
    And User click on the Password enter the name Less than 16 characters
    Then User should be able to view the less than 16 characters option in green
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|ValidEmail|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |John.Smith@gmail.com     |

  @PhaseAll_CD @PhaseAll @APUI370_TC9_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD @Regression
  Scenario Outline: TC9_APUI370_AFF_CD  To Verify that Password field should meet minimum security standard for at least a lower character for PFX Customer
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
    And User enters Valid value in email "<ValidEmail>"
    And User click on the Password enter the name a lower case characters
    Then User should be able to view the a lower case characters option in green
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|ValidEmail|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |John.Smith@gmail.com     |

  @PhaseAll_CD @PhaseAll @APUI370_TC10_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD @Regression
  Scenario Outline: TC10_APUI370_AFF_CD  To Verify that Password field should meet minimum security standard for at least a upper character for PFX Customer
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
    And User enters Valid value in email "<ValidEmail>"
    And User click on the Password enter the name a upper case characters
    Then User should be able to view the a upper case characters option in green
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|ValidEmail|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |John.Smith@gmail.com     |

  @PhaseAll_CD @PhaseAll @APUI370_TC11_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD @Regression
  Scenario Outline: TC11_APUI370_AFF_CD  To Verify that Password field should meet minimum security standard for at least one number character for PFX Customer
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
    And User enters Valid value in email "<ValidEmail>"
    And User click on the Password enter the name atleast 1 number characters
    Then User should be able to view the atleast 1 number characters option in green
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|ValidEmail|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |John.Smith@gmail.com     |

  @PhaseAll_CD @PhaseAll @APUI370_TC12_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD @Regression
  Scenario Outline: TC12_APUI370_AFF_CD  To Verify that Password field should meet minimum security standard for at least Special character for PFX Customer
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
    And User enters Valid value in email "<ValidEmail>"
    And User click on the Password enter the name atleast 1 number And Special characters
    Then User should be able to view the atleast 1 number and special characters option in green
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|ValidEmail|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |John.Smith@gmail.com     |

  @PhaseAll_CD @PhaseAll @APUI370_TC13_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline: TC13_APUI370_AFF_CD To Verify that Password field should meet minimum security standard for atleast 10 characters for CFX Customer
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
    And User enters Valid value in email "<ValidEmail>"
    And User click on the Password enter the name Minimum 10 characters
    Then User should be able to view the at least 10 characters option in green
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|ValidEmail|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT         |Currencies Direct|John.Smith@gmail.com |

  @PhaseAll_CD @PhaseAll @APUI370_TC14_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD
  Scenario Outline: TC14_APUI370_AFF_CD  To Verify that Password field should meet minimum security standard for less than 16 characters for CFX Customer
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
    And User enters Valid value in email "<ValidEmail>"
    And User click on the Password enter the name Less than 16 characters
    Then User should be able to view the less than 16 characters option in green
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|ValidEmail|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT         |Currencies Direct|John.Smith@gmail.com    |

  @PhaseAll_CD @PhaseAll @APUI370_TC15_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD
  Scenario Outline: TC15_APUI370_AFF_CD  To Verify that Password field should meet minimum security standard for at least a lower character for CFX Customer
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
    And User enters Valid value in email "<ValidEmail>"
    And User click on the Password enter the name a lower case characters
    Then User should be able to view the a lower case characters option in green
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|ValidEmail|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT         |Currencies Direct|John.Smith@gmail.com    |

  @PhaseAll_CD @PhaseAll @APUI370_TC16_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD
  Scenario Outline: TC16_APUI370_AFF_CD  To Verify that Password field should meet minimum security standard for at least a upper character for CFX Customer
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
    And User enters Valid value in email "<ValidEmail>"
    And User click on the Password enter the name a upper case characters
    Then User should be able to view the a upper case characters option in green
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|ValidEmail|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT         |Currencies Direct|John.Smith@gmail.com     |

  @PhaseAll_CD @PhaseAll @APUI370_TC17_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD
  Scenario Outline: TC17_APUI370_AFF_CD  To Verify that Password field should meet minimum security standard for at least one number character for CFX Customer
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
    And User enters Valid value in email "<ValidEmail>"
    And User click on the Password enter the name atleast 1 number characters
    Then User should be able to view the atleast 1 number characters option in green
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|ValidEmail|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT         |Currencies Direct|John.Smith@gmail.com     |

  @PhaseAll_CD @PhaseAll @APUI370_TC18_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD
  Scenario Outline: TC18_APUI370_AFF_CD  To Verify that Password field should meet minimum security standard for at least Special character for CFX Customer
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
    And User enters Valid value in email "<ValidEmail>"
    And User click on the Password enter the name atleast 1 number And Special characters
    Then User should be able to view the atleast 1 number and special characters option in green
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|ValidEmail|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT         |Currencies Direct|John.Smith@gmail.com     |

  @PhaseAll_CD @PhaseAll @APUI370_TC21_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline: TC21_APUI370_AFF_CD TC21_APUI370_AFF To Verify continue button to be disabled when password is not metting for PFX Customer
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
    And User enters Valid value in email "<ValidEmail>"
    And User enters invalid value in password "<InvalidPassword>"
    Then System Password should turn the input red and Continue button is been Grayed Out

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|ValidEmail|InvalidPassword|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |tanuj.k@gmail.com|Password12|

  @PhaseAll_CD @PhaseAll @APUI370_TC22_Aff_CD @Affiliates_Sprint11_CD @Acceptence_4_CD @QASprint11_CD
  Scenario Outline: TC22_APUI370_AFF_CD To Verify continue button to be disabled when password is not metting for CFX Customer
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
    And User enters Valid value in email "<ValidEmail>"
    And User enters invalid value in password "<InvalidPassword>"
    Then System Password should turn the input red and Continue button is been Grayed Out

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|ValidEmail|InvalidPassword|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |tanuj.k@gmail.com|Password12|BNT         |Currencies Direct|

  @PhaseAll_CD @PhaseAll @APUI370_TC23_Aff_CD @Affiliates_Sprint11_CD @Acceptence_4_CD @QASprint11_CD
  Scenario Outline: TC23_APUI370_AFF_CD To Verify user should be able to use back button for PFX Customer
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
    And User click on Back on Create an Account.
    Then User will will be able to view Personal radio button as bydefault selection
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI370_TC24_Aff_CD @Affiliates_Sprint11_CD @Acceptence_4_CD @QASprint11_CD
  Scenario Outline: TC24_APUI370_AFF_CD To Verify user should be able to use back button for CFX Customer
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
    And User click on Back on Create an Account.
    Then User will will be able to view Personal radio button as bydefault selection
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT         |Currencies Direct|

  @PhaseAll_CD @PhaseAll @APUI370_TC25_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD @Regression
  Scenario Outline: TC25_APUI370_AFF_CD To Verify user should get error message when he uses the same details for PFX Customer
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
    And User enters Valid value in email "<AlreadyExistEmail>"
    And User enters Valid value in password "<ValidPassword>"
    And User click on Continue Button on Create an Account.
    Then User will get an error message enter Account Already Exist
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|AlreadyExistEmail|ValidPassword|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |tanuj.kaundal@bnt-soft.com|  Password@12 |

  @PhaseAll_CD @PhaseAll @APUI370_TC26_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD @Regression
  Scenario Outline: TC26_APUI370_AFF_CD To Verify user should get error message when he uses the same details for CFX Customer
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
    And User enters Valid value in email "<AlreadyExistEmail>"
    And User enters Valid value in password "<ValidPassword>"
    And User click on Continue Button on Create an Account.
    Then User will get an error message enter Account Already Exist

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|AlreadyExistEmail|ValidPassword|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |tanuj.kaundal@bnt-soft.com|  Password@12 |BNT         |Currencies Direct|

  @PhaseAll_CD @PhaseAll @APUI370_TC27_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline: TC27_APUI370_AFF_CD To Verify the User Should be able to view the Organzation details
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
    Then User should view the Organization information Before Login in header and fotter sections

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |









