@Affiliate_InSprint_BecomeaPartner_CD @APUI_379_CD @CD
Feature: Affiliate V2.0 Become a Partner Page for APUI379-CD

  @PhaseAll_CD @PhaseAll @APUI379_TC1_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD
  Scenario Outline: TC1_APUI379_AFF_CD To Verify user should able to view the personal details for PFX customer on Confirmation page
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
  And User clicks on Industries field
  And User selects Only One option from Industry option
  And User click on Your client Title on Your Clients.
  And User clicks on CountryForClients field
  And User selects Only One option from Country option
  And User click on Your client Title on Your Clients.
  And User clicks on Language field
  And User selects Only One option from Language option
  And User click on Your client Title on Your Clients.
  And User click on Continue Button on Create an Account.
  Then User should view the expander feature defaults to the Personal details summary being open with details being entered for PFX

  Examples:
  |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
  |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |


  @PhaseAll_CD @PhaseAll @APUI379_TC2_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD
  Scenario Outline: TC2_APUI379_AFF_CD To Verify user should able to view the personal details for CFX customer on Confirmation page
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for CFX

    Examples:
    |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
    |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|

  @PhaseAll_CD @PhaseAll @APUI379_TC3_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD
  Scenario Outline: TC3_APUI379_AFF_CD To Verify user should able to view the Login details for PFX customer on Confirmation page
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for PFX
    And User click on Expander on Login Details.
    Then User should be able to view the Login details which we have entered for PFX

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |


  @PhaseAll_CD @PhaseAll @APUI379_TC4_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD @Regression
  Scenario Outline: TC4_APUI379_AFF_CD To Verify user should able to view the Login details for CFX customer on Confirmation page
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for CFX
    And User click on Expander on Login Details.
    Then User should be able to view the Login details which we have entered for CFX

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|

    #APUI-958 - Defect ID Country And Clients
  @Phase_CD @Phase @APUI379_TC5_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD @Regression
  Scenario Outline: TC5_APUI379_AFF_CD To Verify user should able to view the Bank details for PFX customer on Confirmation page
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
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" AccountNumber "<AccountNumber>" SortCode "<SortCode>" BankName "<BankName>" BankAddress "<BankAddress>" for BecomeAPartner journey
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User selects Only One option from client option
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for PFX
    And User click on Expander on Bank Details.
    Then User should be able to view the correct Bank details which we have entered for PFX

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|AccountName|PaymentCountry|PaymentCurrency|AccountNumber|SortCode|BankName  |BankAddress   |
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |Sam Jeo    |United Kingdom|Pound Sterling |4587459852367|SJU37ED |Bank of UK|UK wall street|

    #APUI-958 - Defect ID Country And Clients
  @Phase_CD @Phase @APUI379_TC6_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD
  Scenario Outline: TC6_APUI379_AFF_CD To Verify user should able to view the Bank details for CFX customer on Confirmation page
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
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" AccountNumber "<AccountNumber>" SortCode "<SortCode>" BankName "<BankName>" BankAddress "<BankAddress>" for BecomeAPartner journey
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User selects Only One option from client option
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for CFX
    And User click on Expander on Bank Details.
    Then User should be able to view the correct Bank details which we have entered for CFX

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|AccountName|PaymentCountry|PaymentCurrency|AccountNumber|SortCode|BankName  |BankAddress   |CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |Sam Jeo    |United Kingdom|Pound Sterling |4587459852367|SJU37ED |Bank of UK|UK wall street|BNT        |CurrenciesDirect|

    #APUI-892 - Defect ID Country And Clients
  @PhaseAll_CD @PhaseAll @APUI379_TC7_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD
  Scenario Outline: TC7_APUI379_AFF_CD To Verify user should able to view the Your Client details for PFX customer on Confirmation page
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for PFX
    And User click on Expander on Your Clients.
    Then User should be able to view the Your Clients which we have entered for PFX

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

    #APUI-892 - Defect ID Country And Clients
  @PhaseAll_CD @PhaseAll @APUI379_TC8_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD @Regression
  Scenario Outline: TC8_APUI379_AFF_CD To Verify user should able to view the Your Client details for CFX customer on Confirmation page
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for CFX
    And User click on Expander on Your Clients.
    Then User should be able to view the Your Clients which we have entered for CFX

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|

  @PhaseAll_CD @PhaseAll @APUI379_TC9_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint12_CD
  Scenario Outline: TC9_APUI379_AFF_CD To Verify user should able to able to close the expander of Personal details for PFX Customers
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for PFX
    And User click on Expander on Personal Details.

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI379_TC10_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint12_CD
  Scenario Outline: TC10_APUI379_AFF_CD To Verify user should able to able to close the expander of Personal details for CFX Customers
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for CFX
    And User click on Expander on Personal Details.

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|

  @PhaseAll_CD @PhaseAll @APUI379_TC11_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint12_CD
  Scenario Outline: TC11_APUI379_AFF_CD To Verify user should able to able to close the expander of Bank details for PFX Customers
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for PFX
    And User click on Expander on Bank Details.
    And User click on Expander on Bank Details.

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |


  @PhaseAll_CD @PhaseAll @APUI379_TC12_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint12_CD
  Scenario Outline: TC12_APUI379_AFF_CD To Verify user should able to able to close the expander of Bank details for CFX Customers
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for CFX
    And User click on Expander on Bank Details.
    And User click on Expander on Bank Details.

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|

  @PhaseAll_CD @PhaseAll @APUI379_TC14_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint12_CD
  Scenario Outline: TC14_APUI379_AFF_CD To Verify user should able to use edit personal details for CFX customer on Confirmation page
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for PFX
    And User click on Edit Button on Personal Details.
    And User will be navigated to Personal Details for PFX Page

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI379_TC15_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint12_CD
  Scenario Outline: TC15_APUI379_AFF_CD To Verify user should able to use edit Login details for PFX customer on Confirmation page
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for PFX
    And User click on Expander on Login Details.
    And User click on Edit Button on Login Details.
    And User will be navigated to Login detail Page

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI379_TC16_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint12_CD
  Scenario Outline: TC16_APUI379_AFF_CD To Verify user should able to use edit Bank details for PFX customer on Confirmation page
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for PFX
    And User click on Expander on Bank Details.
    And User click on Edit Button on Bank Details.
    And User will be navigated to Bank Details Page

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI379_TC17_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint12_CD @Regression
  Scenario Outline: TC17_APUI379_AFF_CD To Verify user should able to use add details details for CFX customer on Confirmation page
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for CFX
    And User click on Expander on Bank Details.
    And User click on Add Details Button on Bank Details.
    And User will be navigated to Bank Details Page

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|

  @PhaseAll_CD @PhaseAll @APUI379_TC18_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint12_CD
  Scenario Outline: TC18_APUI379_AFF_CD To Verify user should able to use edit Your Clients for PFX customer on Confirmation page
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for PFX
    And User click on Expander on Bank Details.
    And User click on Edit Button on Bank Details.
    And User will be navigated to Bank Details Page

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI379_TC19_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD
  Scenario Outline: TC19_APUI379_AFF_CD To To Verify user should able to use the tick option for PFX Customer
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for PFX
    And User clicks on Term field
    Then User should Should see the Confirm button as enabled
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI379_TC20_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD @Smoke
  Scenario Outline: TC20_APUI379_AFF_CD To To Verify user should able to use the tick option for CFX Customer
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for CFX
    And User clicks on Term field
    Then User should Should see the Confirm button as enabled
    And User Click on Confirm button
    Then User successfully register a become a partner journey

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|


  @PhaseAll_CD @PhaseAll @APUI379_TC21_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD
  Scenario Outline: TC21_APUI379_AFF_CD TC21_APUI379_AFF To Verify user should able to view term and Condition
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for PFX
    And User clicks on Term field
    Then User should Should see the Confirm button as enabled
    And User clicks on TermsAndConditions field
    And User will be navigated to TermsAndConditions Page

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI379_TC22_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD
  Scenario Outline: TC22_APUI379_AFF_CD To Verify user should able to view term and Condition
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for PFX
    And User clicks on Term field
    Then User should Should see the Confirm button as enabled
    And User clicks on TermsAndConditions field
    And User will be navigated to TermsAndConditions with Different tab Page

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI379_TC23_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD @Regression
  Scenario Outline: TC23_APUI379_AFF_CD To Verify user should able to view privacy and policy options on Term and Condition
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for PFX
    And User clicks on Term field
    Then User should Should see the Confirm button as enabled
    And User clicks on TermsAndConditions field
    And User will be navigated to TermsAndConditions Page
    And User will be navigated to TermsAndConditions with Different tab Page
    Then User should be able to view the Privacy and Policy Section on UI

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI379_TC24_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD
  Scenario Outline: TC24_APUI379_AFF_CD To Verify user should able not be able to procced until tick box is enabled for CFX Customer
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for CFX
    And User clicks on Term field
    Then User should Should see the Confirm button as enabled

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|

  @PhaseAll_CD @PhaseAll @APUI379_TC25_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD
  Scenario Outline: TC25_APUI379_AFF_CD To Verify user should be able to Use back button
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for PFX
    And User clicks on Term field
    Then User should Should see the Confirm button as enabled
    And User click on Back on Create an Account.
    And User will be navigated to Your Client Detail Page

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI379_TC26_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD
  Scenario Outline: TC26_APUI379_AFF_CD To Verify the User Should be able to view the Organzation details
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
    And User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User should view the expander feature defaults to the Personal details summary being open with details being entered for PFX
    And User clicks on Term field
    Then User should Should see the Confirm button as enabled
    And User click on Back on Create an Account.
    And User will be navigated to Your Client Detail Page
    Then User should view the Organization information Before Login in header and fotter sections


    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |






