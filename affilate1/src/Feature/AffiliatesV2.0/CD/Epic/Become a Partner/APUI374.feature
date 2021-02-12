@Affiliate_InSprint_BecomeaPartner_CD @APUI_374_CD @CD
Feature: Affiliate V2.0 Become a Partner Page for APUI374-CD
  
  @PhaseAll_CD @PhaseAll @APUI374_TC04_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD
  Scenario Outline: TC04_APUI374_AFF_CD To verify user be able to use skip details for PFX Customer
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
    Then User should be able to view the Bank details which we have entered for PFX
    And User click on Expander on Bank Details.
    Then User should Should see the Confirm button as disabled
    And User clicks on Term field
    Then User should Should see the Confirm button as enabled

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI374_TC05_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD
  Scenario Outline: TC05_APUI374_AFF_CD To verify user be able to use skip details for CFX Customer
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
    Then User should be able to view the Bank details which we have entered for CFX
    And User click on Expander on Bank Details.
    Then User should Should see the Confirm button as disabled
    And User clicks on Term field
    Then User should Should see the Confirm button as enabled

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|

  @PhaseAll_CD @PhaseAll @APUI374_TC46_Aff_CD @Affiliates_Sprint12_CD @Acceptence_14_CD @QASprint12_CD
  Scenario Outline: TC46_APUI374_AFF_CD To verify Account name to be mandatory field if its not been present for PFX customer
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
    Then User will be navigated to Bank Details Page
    And User clicks on AccountName and do not select any Value
    Then System AccountName should turn the input red and Continue button is been Grayed Out
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |


  @PhaseAll_CD @PhaseAll @APUI374_TC47_Aff_CD @Affiliates_Sprint12_CD @Acceptence_14_CD @QASprint12_CD
  Scenario Outline: TC47_APUI374_AFF_CD To verify Account name to be mandatory field if its not been present for CFX customer
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
    Then User will be navigated to Bank Details Page
    And User clicks on AccountName and do not select any Value
    Then System AccountName should turn the input red and Continue button is been Grayed Out
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|


  @PhaseAll_CD @PhaseAll @APUI374_TC48_Aff_CD @Affiliates_Sprint12_CD @Acceptence_14_CD @QASprint12_CD @Regression
  Scenario Outline: TC48_APUI374_AFF_CD To verify the Maxlength in case of Account name for PFX Customers
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName more than 40 characters on Bank details page
    Then System AccountName should turn the input red and Continue button is been Grayed Out
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |


  @PhaseAll_CD @PhaseAll @APUI374_TC49_Aff_CD @Affiliates_Sprint12_CD @Acceptence_14_CD @QASprint12_CD
  Scenario Outline: TC49_APUI374_AFF_CD To verify the Maxlength in case of Account name for CFX Customers
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName more than 40 characters on Bank details page
    Then System AccountName should turn the input red and Continue button is been Grayed Out
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|


  @PhaseAll_CD @PhaseAll @APUI374_TC50_Aff_CD @Affiliates_Sprint12_CD @Acceptence_14_CD @QASprint12_CD
  Scenario Outline: TC50_APUI374_AFF_CD To verify Payment Country to be mandatory field if its not been present for PFX customer
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
    Then User will be navigated to Bank Details Page
    And User clicks on PaymentCountry and do not select any Value
    Then System PaymentCountry should turn the input red and Continue button is been Grayed Out
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |


  @PhaseAll_CD @PhaseAll @APUI374_TC51_Aff_CD @Affiliates_Sprint12_CD @Acceptence_14_CD @QASprint12_CD
  Scenario Outline: TC51_APUI374_AFF_CD To verify Payment Country to be mandatory field if its not been present for CFX customer
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
    Then User will be navigated to Bank Details Page
    And User clicks on PaymentCountry and do not select any Value
    Then System PaymentCountry should turn the input red and Continue button is been Grayed Out
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|

  @PhaseAll_CD @PhaseAll @APUI374_TC52_Aff_CD @Affiliates_Sprint12_CD @Acceptence_14_CD @QASprint12_CD
  Scenario Outline: TC52_APUI374_AFF_CD To verify Payment Currency to be mandatory field if its not been present for PFX customer
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
    Then User will be navigated to Bank Details Page
    And User clicks on PaymentCurrency and do not select any Value
    Then System PaymentCurrency should turn the input red and Continue button is been Grayed Out
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI374_TC53_Aff_CD @Affiliates_Sprint12_CD @Acceptence_14_CD @QASprint12_CD
  Scenario Outline: TC53_APUI374_AFF_CD To verify Payment Currency to be mandatory field if its not been present for CFX customer
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
    Then User will be navigated to Bank Details Page
    And User clicks on PaymentCurrency and do not select any Value
    Then System PaymentCurrency should turn the input red and Continue button is been Grayed Out
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrencyDirect|

  @PhaseAll_CD @PhaseAll @APUI374_TC54_Aff_CD @Affiliates_Sprint12_CD @Acceptence_14_CD @QASprint12_CD
  Scenario Outline: TC54_APUI374_AFF_CD To verify BankName to be mandatory field if its not been present for PFX customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    And User click on Enter Details Manually on Bank Details.
    And User clicks on BankName and do not select any Value
    And User should get error field and textbox should turn red for BankName fields on Bank details
    Then Continue button to be Observed as Grayed Out
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|AccountNumber|SortCode|BankName  |BankAddress   |
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Sam Jeo    |United Kingdom|Pound Sterling |4587459852367|SJU37ED |Bank of UK|UK wall street|

  @PhaseAll_CD @PhaseAll @APUI374_TC55_Aff_CD @Affiliates_Sprint12_CD @Acceptence_14_CD @QASprint12_CD
  Scenario Outline: TC55_APUI374_AFF_CD To verify BankName to be mandatory field if its not been present for CFX customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    And User click on Enter Details Manually on Bank Details.
    And User clicks on BankName and do not select any Value
    And User should get error field and textbox should turn red for BankName fields on Bank details
    Then Continue button to be Observed as Grayed Out
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|AccountNumber|SortCode|BankName  |BankAddress   |
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Sam Jeo    |United Kingdom|Pound Sterling |4587459852367|SJU37ED |Bank of UK|UK wall street|

  @PhaseAll_CD @PhaseAll @APUI374_TC56_Aff_CD @Affiliates_Sprint12_CD @Acceptence_14_CD @QASprint12_CD @Regression
  Scenario Outline:APUI374_TC56_Aff_CD To verify the Maxlength in case of Account name for PFX Customers
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
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" AccountNumber "<AccountNumber>" SortCode "<SortCode>" BankName "<BankName>" BankAddress "<BankAddress>" for BecomeAPartner journey
    And User enters BankName more than 65 characters on Bank details page
    And User should get error field and textbox should turn red for BankName fields on Bank details
    Then Continue button to be Observed as Grayed Out
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|AccountNumber|SortCode|BankName  |BankAddress   |
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Sam Jeo    |United Kingdom|Pound Sterling |4587459852367|SJU37ED |Bank of UK|UK wall street|

  @PhaseAll_CD @PhaseAll @APUI374_TC30_Aff_CD @Affiliates_Sprint12_CD @Acceptence_5_CD @QASprint12_CD
  Scenario Outline: TC30_APUI374_AFF_CD To verify User should be able to use the retrive bank details option for PFX Customers
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    And User provide the AccountNumber "<AccountNumber>" SortCode "<SortCode>"
    Then User will be able to view the Retrive Bank details option as enabled

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|AccountNumber|SortCode|BankName  |BankAddress   |
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Testing    |United Kingdom|Pound Sterling |12345678|401517 |Bank of UK|UK wall street|

  @PhaseAll_CD @PhaseAll @APUI374_TC31_Aff_CD @Affiliates_Sprint12_CD @Acceptence_5_CD @QASprint12_CD
  Scenario Outline: TC31_APUI374_AFF_CD To verify User should be able to use the retrive bank details option for CFX Customers
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    And User provide the AccountNumber "<AccountNumber>" SortCode "<SortCode>"
    Then User will be able to view the Retrive Bank details option as enabled

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|AccountNumber|SortCode|BankName  |BankAddress   |
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Testing    |United Kingdom|Pound Sterling |12345678|401517 |Bank of UK|UK wall street|

  @PhaseAll_CD @PhaseAll @APUI374_TC32_Aff_CD @Affiliates_Sprint12_CD @Acceptence_6_CD @QASprint12_CD
  Scenario Outline: TC32_APUI374_AFF_CD To verify User should be able to view the Bank details post clicking on Retrive Bank Details for PFX Customers
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    And User provide the AccountNumber "<AccountNumber>" SortCode "<SortCode>"
    Then User will be able to view the Retrive Bank details option as enabled
    And User click on Retrive Bank details on Bank Details.
    Then System should display the lookup and matching values against values been entered BankAddress "<BankAddress>" And BankHeadOfficeAddress "<BankHeadOfficeAddress>"

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|AccountNumber|SortCode|BankAddress|BankHeadOfficeAddress|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Testing    |United Kingdom|Pound Sterling |12345678|401517 |HSBC UK BANK PLC|Burnley,United Kingdom |

  @PhaseAll_CD @PhaseAll @APUI374_TC33_Aff_CD @Affiliates_Sprint12_CD @Acceptence_6_CD @QASprint12_CD @Regression
  Scenario Outline: TC33_APUI374_AFF_CD To verify User should be able to view the Bank details post clicking on Retrive Bank Details for CFX Customers
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    And User provide the AccountNumber "<AccountNumber>" SortCode "<SortCode>"
    Then User will be able to view the Retrive Bank details option as enabled
    And User click on Retrive Bank details on Bank Details.
    Then System should display the lookup and matching values against values been entered BankAddress "<BankAddress>" And BankHeadOfficeAddress "<BankHeadOfficeAddress>"

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|AccountNumber|SortCode|BankAddress|BankHeadOfficeAddress|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Testing    |United Kingdom|Pound Sterling |12345678|401517 |HSBC UK BANK PLC|Burnley,United Kingdom |


  @PhaseAll_CD @PhaseAll @APUI374_TC34_Aff_CD @Affiliates_Sprint12_CD @Acceptence_7_CD @QASprint12_CD
  Scenario Outline: TC34_APUI374_AFF_CD To verify its mandatory for user to click on retrive bank details for PFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User will be able to view the Retrive Bank details option as disabled
    Then Continue button to be Observed as Grayed Out
    And User provide the AccountNumber "<AccountNumber>" BSBNumber "<BSBNumber>"
    Then User will be able to view the Retrive Bank details option as enabled
    And User click on Retrive Bank details on Bank Details.
    Then System should display the lookup and matching values against values been entered BankAddress "<BankAddress>" And BankHeadOfficeAddress "<BankHeadOfficeAddress>"
    Then User will be able to view the Continue option as enabled

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|AccountNumber|BSBNumber|BankAddress|BankHeadOfficeAddress|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Testing    |Australia|Pound Sterling |123456789|032929 |Westpac Banking Corporation|Parramatta,Australia |


  @PhaseAll_CD @PhaseAll @APUI374_TC35_Aff_CD @Affiliates_Sprint12_CD @Acceptence_7_CD @QASprint12_CD @Regression
  Scenario Outline: TC35_APUI374_AFF_CD To verify its mandatory for user to click on retrive bank details for CFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User will be able to view the Retrive Bank details option as disabled
    Then Continue button to be Observed as Grayed Out
    And User provide the AccountNumber "<AccountNumber>" BSBNumber "<BSBNumber>"
    Then User will be able to view the Retrive Bank details option as enabled
    And User click on Retrive Bank details on Bank Details.
    Then System should display the lookup and matching values against values been entered BankAddress "<BankAddress>" And BankHeadOfficeAddress "<BankHeadOfficeAddress>"
    Then User will be able to view the Continue option as enabled

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|AccountNumber|BSBNumber|BankAddress|BankHeadOfficeAddress|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Testing    |Australia|Pound Sterling |123456789|032929 |Westpac Banking Corporation|Parramatta,Australia |

  @PhaseAll_CD @PhaseAll @APUI374_TC36_Aff_CD @Affiliates_Sprint12_CD @Acceptence_8_CD @QASprint12_CD
  Scenario Outline: TC36_APUI374_AFF_CD To verify User should not be able to proceed if no match is been found for PFX Customers
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    And User Enters the AccountNumber "<AccountNumber>" and TransitNumber "<InvalidTransitNumber>"
    And User click on Retrive Bank details on Bank Details.
    Then User should open the manual address window to allow user to manually put the address BankAddress "<BankAddress>" and BankHeadOfficeAddress "<BankHeadOfficeAddress>"

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|AccountNumber|InvalidTransitNumber|BankAddress|BankHeadOfficeAddress|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Testing    |Canada|Pound Sterling |12345678|123451205150 |Westpac Banking Corporation|Parramatta,Australia |

  @PhaseAll_CD @PhaseAll @APUI374_TC37_Aff_CD @Affiliates_Sprint12_CD @Acceptence_8_CD @QASprint12_CD @Regression
  Scenario Outline: TC37_APUI374_AFF_CD To verify User should not be able to proceed if no match is been found for CFX Customers
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    And User Enters the AccountNumber "<AccountNumber>" and TransitNumber "<InvalidTransitNumber>"
    And User click on Retrive Bank details on Bank Details.
    Then User should open the manual address window to allow user to manually put the address BankAddress "<BankAddress>" and BankHeadOfficeAddress "<BankHeadOfficeAddress>"

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|AccountNumber|InvalidTransitNumber|BankAddress|BankHeadOfficeAddress|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Testing    |Canada|Pound Sterling |12300321525|5454121200 |Westpac Banking Corporation|Parramatta,Australia |


  @PhaseAll_CD @PhaseAll @APUI374_TC38_Aff_CD @Affiliates_Sprint12_CD @Acceptence_10_CD @QASprint12_CD
  Scenario Outline: TC38_APUI374_AFF_CD To verify user should be able to edit the details which is been retrived as a part of lookup search for PFX customers
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User will be able to view the Retrive Bank details option as disabled
    Then Continue button to be Observed as Grayed Out
    And User provide the AccountNumber "<AccountNumber>" BSBNumber "<BSBNumber>"
    Then User will be able to view the Retrive Bank details option as enabled
    And User click on Retrive Bank details on Bank Details.
    Then System should display the lookup and matching values against values been entered BankAddress "<BankAddress>" And BankHeadOfficeAddress "<BankHeadOfficeAddress>"
    Then User will be able to view the Continue option as enabled
    And User click on Edit address on Bank Details.
    And User update the BankName "<UpdatedBankName>" and BankAddress "<UpdatedBankAddress>"
    Then User should be able to view the updated BankName "<UpdatedBankName1>" and BankAddress "<UpdatedBankAddress1>"

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|AccountNumber|BSBNumber|BankAddress|BankHeadOfficeAddress|UpdatedBankName|UpdatedBankAddress|UpdatedBankName1|UpdatedBankAddress1|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Testing    |Australia|Pound Sterling |123456789|032929 |Westpac Banking Corporation|Parramatta,Australia |Testing|Testing|Westpac Banking CorporationTesting|PARRAMATTA,AUSTRALIATesting|

  @PhaseAll_CD @PhaseAll @APUI374_TC39_Aff_CD @Affiliates_Sprint12_CD @Acceptence_10_CD @QASprint12_CD @Regression
  Scenario Outline: TC39_APUI374_AFF_CD To verify user should be able to edit the details which is been retrived as a part of lookup search for CFX customers
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User will be able to view the Retrive Bank details option as disabled
    Then Continue button to be Observed as Grayed Out
    And User provide the AccountNumber "<AccountNumber>" BSBNumber "<BSBNumber>"
    Then User will be able to view the Retrive Bank details option as enabled
    And User click on Retrive Bank details on Bank Details.
    Then System should display the lookup and matching values against values been entered BankAddress "<BankAddress>" And BankHeadOfficeAddress "<BankHeadOfficeAddress>"
    Then User will be able to view the Continue option as enabled
    And User click on Edit address on Bank Details.
    And User update the BankName "<UpdatedBankName>" and BankAddress "<UpdatedBankAddress>"
    Then User should be able to view the updated BankName "<UpdatedBankName1>" and BankAddress "<UpdatedBankAddress1>"

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|AccountNumber|BSBNumber|BankAddress|BankHeadOfficeAddress|UpdatedBankName|UpdatedBankAddress|UpdatedBankName1|UpdatedBankAddress1|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Testing    |Australia|Pound Sterling |123456789|032929 |Westpac Banking Corporation|Parramatta,Australia |Testing|Testing|Westpac Banking CorporationTesting|PARRAMATTA,AUSTRALIATesting|

  @PhaseAll_CD @PhaseAll @APUI374_TC42_Aff_CD @Affiliates_Sprint12_CD @Acceptence_12_CD @QASprint12_CD
  Scenario Outline: TC42_APUI374_AFF_CD To verify User should not be able to proceed if no match is been found for PFX Customers
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    And User Enters the AccountNumber "<AccountNumber>" and TransitNumber "<InvalidTransitNumber>"
    And User click on Retrive Bank details on Bank Details.
    Then User should open the manual address window to allow user to manually put the address BankAddress "<BankAddress>" and BankHeadOfficeAddress "<BankHeadOfficeAddress>"
    Then User will be able to view the Continue option as enabled
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|AccountNumber|InvalidTransitNumber|BankAddress|BankHeadOfficeAddress|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Testing    |Canada|Pound Sterling |12345678|123451205150 |Westpac Banking Corporation|Parramatta,Australia |

  @PhaseAll_CD @PhaseAll @APUI374_TC43_Aff_CD @Affiliates_Sprint12_CD @Acceptence_12_CD @QASprint12_CD
  Scenario Outline: TC43_APUI374_AFF_CD To verify User should not be able to proceed if no match is been found for CFX Customers
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    And User Enters the AccountNumber "<AccountNumber>" and TransitNumber "<InvalidTransitNumber>"
    And User click on Retrive Bank details on Bank Details.
    Then User should open the manual address window to allow user to manually put the address BankAddress "<BankAddress>" and BankHeadOfficeAddress "<BankHeadOfficeAddress>"
    Then User will be able to view the Continue option as enabled
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|AccountNumber|InvalidTransitNumber|BankAddress|BankHeadOfficeAddress|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Testing    |Canada|Pound Sterling |12300321525|5454121200 |Westpac Banking Corporation|Parramatta,Australia |

  @PhaseAll_CD @PhaseAll @APUI374_TC44_Aff_CD @Affiliates_Sprint12_CD @Acceptence_13_CD @QASprint12_CD
  Scenario Outline: TC44_APUI374_AFF_CD To verify User should be able to view the Bank details post clicking on Retrive Bank Details for PFX Customers
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    And User provide the AccountNumber "<AccountNumber>" SortCode "<SortCode>"
    Then User will be able to view the Retrive Bank details option as enabled
    And User click on Retrive Bank details on Bank Details.
    Then System should display the lookup and matching values against values been entered BankAddress "<BankAddress>" And BankHeadOfficeAddress "<BankHeadOfficeAddress>"
    Then User will be able to view the Continue option as enabled

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|AccountNumber|SortCode|BankAddress|BankHeadOfficeAddress|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Testing    |United Kingdom|Pound Sterling |12345678|401517 |HSBC UK BANK PLC|Burnley,United Kingdom |

  @PhaseAll_CD @PhaseAll @APUI374_TC45_Aff_CD @Affiliates_Sprint12_CD @Acceptence_13_CD @QASprint12_CD
  Scenario Outline: TC45_APUI374_AFF_CD To verify User should be able to view the Bank details post clicking on Retrive Bank Details for CFX Customers
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    And User provide the AccountNumber "<AccountNumber>" SortCode "<SortCode>"
    Then User will be able to view the Retrive Bank details option as enabled
    And User click on Retrive Bank details on Bank Details.
    Then System should display the lookup and matching values against values been entered BankAddress "<BankAddress>" And BankHeadOfficeAddress "<BankHeadOfficeAddress>"
    Then User will be able to view the Continue option as enabled
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|AccountNumber|SortCode|BankAddress|BankHeadOfficeAddress|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Testing    |United Kingdom|Pound Sterling |12345678|401517 |HSBC UK BANK PLC|Burnley,United Kingdom |


  @PhaseAll_CD @PhaseAll @APUI374_TC6_Aff_CD @Affiliates_Sprint12_CD @Acceptence_3_CD @QASprint12_CD
  Scenario Outline:APUI374_TC6_Aff_CD To verify user be able to skip the details for PFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" AccountNumber "<AccountNumber>" SortCode "<SortCode>" BankName "<BankName>" BankAddress "<BankAddress>" for BecomeAPartner journey
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User selects Only One option from client option
    And  User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And  User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And  User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    And User click on Expander on Bank Details.
    Then User is able to view No details added on Bank Details
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|AccountName|PaymentCountry|PaymentCurrency|AccountNumber|SortCode|BankName  |BankAddress   |
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |Sam Jeo    |United Kingdom|Pound Sterling |4587459852367|SJU37ED |Bank of UK|UK wall street|

  @PhaseAll_CD @PhaseAll @APUI374_TC7_Aff_CD @Affiliates_Sprint12_CD @Acceptence_3_CD @QASprint12_CD @Regression
  Scenario Outline:APUI374_TC7_Aff_CD To verify user be able to skip the details for CFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" AccountNumber "<AccountNumber>" SortCode "<SortCode>" BankName "<BankName>" BankAddress "<BankAddress>" for BecomeAPartner journey
    And User click on Skip the step on Create an Account.
    Then User will be navigated to Your Client Detail Page
    And User selects Only One option from client option
    And  User clicks on Industries field
    And User selects Only One option from Industry option
    And User click on Your client Title on Your Clients.
    And  User clicks on CountryForClients field
    And User selects Only One option from Country option
    And User click on Your client Title on Your Clients.
    And  User clicks on Language field
    And User selects Only One option from Language option
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    And User click on Expander on Bank Details.
    Then User is able to view No details added on Bank Details
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|AccountNumber|SortCode|BankName  |BankAddress   |
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Sam Jeo    |United Kingdom|Pound Sterling |4587459852367|SJU37ED |Bank of UK|UK wall street|

  @PhaseAll_CD @PhaseAll @APUI374_TC8_Aff_CD @Affiliates_Sprint12_CD @Acceptence_3_CD @QASprint12_CD
  Scenario Outline:APUI374_TC8_Aff_CD To verify user be able to view error messages for PFX Customer
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
    Then User will be navigated to Bank Details Page
    And User only clicks on AccountName PaymentCountry PaymentCurrency for BecomeAPartner journey
    Then User should get error field and textbox should turn red for AccountName PaymentCountry PaymentCurrency fields
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI374_TC9_Aff_CD @Affiliates_Sprint12_CD @Acceptence_3_CD @QASprint12_CD
  Scenario Outline:APUI374_TC9_Aff_CD To verify user be able to view error messages for CFX Customer
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
    Then User will be navigated to Bank Details Page
    And User only clicks on AccountName PaymentCountry PaymentCurrency for BecomeAPartner journey
    Then User should get error field and textbox should turn red for AccountName PaymentCountry PaymentCurrency fields
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|

#Tester needs to test this for every country based on the Payment Matrix
  @PhaseAll_CD @PhaseAll @APUI374_TC10_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline:APUI374_TC10_Aff_CD To verify User should be able to view the Sort Code combination for PFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User is able to view Account number Sort code combination depending upon selected PaymentCountry and PaymentCurreny
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|AccountName|PaymentCountry|PaymentCurrency|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |Sam Jeo    |United Kingdom|Pound Sterling |

#Tester needs to test this for every country based on the Payment Matrix
  @PhaseAll_CD @PhaseAll @APUI374_TC11_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD @Regression
  Scenario Outline:APUI374_TC11_Aff_CD To verify User should be able to view the Sort Code combination for CFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User is able to view Account number Sort code combination depending upon selected PaymentCountry and PaymentCurreny
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Sam Jeo    |United Kingdom|Pound Sterling |

#Tester needs to test this for every country based on the Payment Matrix
  @PhaseAll_CD @PhaseAll @APUI374_TC12_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline:APUI374_TC12_Aff_CD To verify User should be able to view BSB number Swift code combination for PFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User is able to view Account number BSB number SWIFT code combination depending upon selected PaymentCountry and PaymentCurreny
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|AccountName|PaymentCountry|PaymentCurrency|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |Sam Jeo    |Australia     |Pound Sterling |

    #Tester needs to test this for every country based on the Payment Matrix
  @PhaseAll_CD @PhaseAll @APUI374_TC13_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD @Regression
  Scenario Outline:APUI374_TC13_Aff_CD To verify User should be able to view BSB number Swift code combination for CFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User is able to view Account number BSB number SWIFT code combination depending upon selected PaymentCountry and PaymentCurreny
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Sam Jeo    |Australia     |Pound Sterling |

#Tester needs to test this for every country based on the Payment Matrix
  @PhaseAll_CD @PhaseAll @APUI374_TC14_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline:APUI374_TC14_Aff_CD To verify User should be able to view Transit number Swift code combination for PFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User is able to view Account number SWIFT code Transit number combination depending upon selected PaymentCountry and PaymentCurreny
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|AccountName|PaymentCountry|PaymentCurrency|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |Sam Jeo    |Canada        |Pound Sterling |

    #Tester needs to test this for every country based on the Payment Matrix
  @PhaseAll_CD @PhaseAll @APUI374_TC15_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline:APUI374_TC15_Aff_CD To verify User should be able to view Transit number Swift code combination for CFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User is able to view Account number SWIFT code Transit number combination depending upon selected PaymentCountry and PaymentCurreny
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Sam Jeo    |Canada        |Pound Sterling |

    #Tester needs to test this for every country based on the Payment Matrix
  @PhaseAll_CD @PhaseAll @APUI374_TC16_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline:APUI374_TC16_Aff_CD To verify User should be able to view Branch Code Swift code combination for PFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User is able to view Account number SWIFT code Branch code combination depending upon selected PaymentCountry and PaymentCurreny
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|AccountName|PaymentCountry|PaymentCurrency|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |Sam Jeo    |South Africa  |Pound Sterling |

#Tester needs to test this for every country based on the Payment Matrix
  @PhaseAll_CD @PhaseAll @APUI374_TC17_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline:APUI374_TC17_Aff_CD To verify User should be able to view Branch Code Swift code combination for CFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User is able to view Account number SWIFT code Branch code combination depending upon selected PaymentCountry and PaymentCurreny
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Sam Jeo    |South Africa  |Pound Sterling |

#Tester needs to test this for every country based on the Payment Matrix
  @PhaseAll_CD @PhaseAll @APUI374_TC18_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline:APUI374_TC18_Aff_CD To verify User should not be able to view USA country for PFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User should not be able to view the option in PaymentCountry dropdown
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|AccountName|PaymentCountry|PaymentCurrency|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |Sam Jeo    |USA           |Pound Sterling |

    #Tester needs to test this for every country based on the Payment Matrix
  @PhaseAll_CD @PhaseAll @APUI374_TC19_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline:APUI374_TC19_Aff_CD To verify User should not be able to view USA country for CFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User should not be able to view the option in PaymentCountry dropdown
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Sam Jeo    |USA           |Pound Sterling |

    #Tester needs to test this for every country based on the Payment Matrix
  @PhaseAll_CD @PhaseAll @APUI374_TC20_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline:APUI374_TC20_Aff_CD To verify User should be able to view IFSC Code Swift code combination for PFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User is able to view Account number SWIFT code IFSC code combination depending upon selected PaymentCountry and PaymentCurreny
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|AccountName|PaymentCountry|PaymentCurrency|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |Sam Jeo    |India         |Pound Sterling |

#Tester needs to test this for every country based on the Payment Matrix
  @PhaseAll_CD @PhaseAll @APUI374_TC21_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline:APUI374_TC21_Aff_CD To verify User should be able to view IFSC Code Swift code combination for CFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User is able to view Account number SWIFT code IFSC code combination depending upon selected PaymentCountry and PaymentCurreny
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Sam Jeo    |India         |Pound Sterling |

#Tester needs to test this for every country based on the Payment Matrix
  @PhaseAll_CD @PhaseAll @APUI374_TC22_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline:APUI374_TC22_Aff_CD To verify User should be able to view CNAPS Code Swift code combination for PFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User is able to view Account number SWIFT code CNAPS code combination depending upon selected PaymentCountry and PaymentCurreny
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|AccountName|PaymentCountry|PaymentCurrency|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |Sam Jeo    |China         |Pound Sterling |

#Tester needs to test this for every country based on the Payment Matrix
  @PhaseAll_CD @PhaseAll @APUI374_TC23_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline:APUI374_TC23_Aff_CD To verify User should be able to view CNAPS Code Swift code combination for CFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User is able to view Account number SWIFT code CNAPS code combination depending upon selected PaymentCountry and PaymentCurreny
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Sam Jeo    |China         |Pound Sterling |

#Tester needs to test this for every country based on the Payment Matrix
  @PhaseAll_CD @PhaseAll @APUI374_TC24_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline:APUI374_TC24_Aff_CD To verify User should be able to view IBAN Swift code combination for PFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User is able to view SWIFT code IBAN combination depending upon selected PaymentCountry and PaymentCurreny
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|AccountName|PaymentCountry|PaymentCurrency|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |Sam Jeo    |Qatar         |Pound Sterling |


#Tester needs to test this for every country based on the Payment Matrix
  @PhaseAll_CD @PhaseAll @APUI374_TC25_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline:APUI374_TC25_Aff_CD To verify User should be able to IBAN Swift code combination for CFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User is able to view SWIFT code IBAN combination depending upon selected PaymentCountry and PaymentCurreny
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Sam Jeo    |Qatar         |Pound Sterling |

#Tester needs to test this for every country based on the Payment Matrix
  @PhaseAll_CD @PhaseAll @APUI374_TC26_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD @Regression
  Scenario Outline:APUI374_TC26_Aff_CD To verify User should be able to view IBAN  for PFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User is able to view IBAN combination depending upon selected PaymentCountry and PaymentCurreny
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|AccountName|PaymentCountry|PaymentCurrency|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |Sam Jeo    |Poland        |Pound Sterling |

#Tester needs to test this for every country based on the Payment Matrix
  @PhaseAll_CD @PhaseAll @APUI374_TC27_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline:APUI374_TC27_Aff_CD To verify User should be able to IBAN for CFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User is able to view IBAN combination depending upon selected PaymentCountry and PaymentCurreny
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Sam Jeo    |Poland        |Pound Sterling |

    #Tester needs to test this for every country based on the Payment Matrix
  @PhaseAll_CD @PhaseAll @APUI374_TC28_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline:APUI374_TC28_Aff_CD To verify User should be able to view Default combination for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User enters An Individual the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Login detail Page
    Then User will be able to view Email ID Password options along with password criteria and disbaled Continue and back button as enabled
    And User enters Valid value in NewEmailAddress
    And User enters Valid value in NewRandomPassword
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User is able to view Account number SWIFT code combination depending upon selected PaymentCountry and PaymentCurreny
    #And Verify the Address to be populated properly And Verify the Details
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|AccountName|PaymentCountry              |PaymentCurrency|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |Sam Jeo    | British Virgin Islands     |Pound Sterling |

#Tester needs to test this for every country based on the Payment Matrix
  @PhaseAll_CD @PhaseAll @APUI374_TC29_Aff_CD @Affiliates_Sprint12_CD @Acceptence_4_CD @QASprint12_CD
  Scenario Outline:APUI374_TC29_Aff_CD To verify User should be able to view Default combination for CFX Customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" for BecomeAPartner journey
    Then User is able to view Account number SWIFT code combination depending upon selected PaymentCountry and PaymentCurreny
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry              |PaymentCurrency|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Sam Jeo    |British Virgin Islands      |Pound Sterling |

  @PhaseAll_CD @PhaseAll @APUI374_TC57_Aff_CD @Affiliates_Sprint12_CD @Acceptence_14_CD @QASprint12_CD
  Scenario Outline:APUI374_TC57_Aff_CD To verify the Maxlength in case of Account name for CFX Customers
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
    And User click on Your client Title on Your Clients.
    And User click on Continue Button on Create an Account.
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" AccountNumber "<AccountNumber>" SortCode "<SortCode>" BankName "<BankName>" BankAddress "<BankAddress>" for BecomeAPartner journey
    And User enters BankName more than 65 characters on Bank details page
    And User should get error field and textbox should turn red for BankName fields on Bank details
    Then Continue button to be Observed as Grayed Out
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|AccountNumber|SortCode|BankName  |BankAddress   |
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Sam Jeo    |United Kingdom|Pound Sterling |4587459852367|SJU37ED |Bank of UK|UK wall street|

  @PhaseAll_CD @PhaseAll @APUI374_TC58_Aff_CD @Affiliates_Sprint12_CD @Acceptence_14_CD @QASprint12_CD
  Scenario Outline:APUI374_TC58_Aff_CD To verify BankAddress to be mandatory field if its not been present for PFX customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" AccountNumber "<AccountNumber>" SortCode "<SortCode>" BankName "<BankName>" BankAddress "<BankAddress>" for BecomeAPartner journey
    And User click on Your client Title on Your Clients.
    And User enters BankAddress No characters on Bank details page
    And User click on Your client Title on Your Clients.
    And User should get error field and textbox should turn red for BankAddress fields on Bank details
    Then Continue button to be Observed as Grayed Out
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|AccountName|PaymentCountry|PaymentCurrency|AccountNumber|SortCode|BankName  |BankAddress   |
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |Sam Jeo    |United Kingdom|Pound Sterling |4587459852367|SJU37ED |Bank of UK|UK wall street|

  @PhaseAll_CD @PhaseAll @APUI374_TC59_Aff_CD @Affiliates_Sprint12_CD @Acceptence_14_CD @QASprint12_CD
  Scenario Outline:APUI374_TC59_Aff_CD To verify BankAddress to be mandatory field if its not been present for CFX customer
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" AccountNumber "<AccountNumber>" SortCode "<SortCode>" BankName "<BankName>" BankAddress "<BankAddress>" for BecomeAPartner journey
    And User click on Your client Title on Your Clients.
    And User enters BankAddress No characters on Bank details page
    And User click on Your client Title on Your Clients.
    And User should get error field and textbox should turn red for BankAddress fields on Bank details
    Then Continue button to be Observed as Grayed Out
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|AccountNumber|SortCode|BankName  |BankAddress   |
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Sam Jeo    |United Kingdom|Pound Sterling |4587459852367|SJU37ED |Bank of UK|UK wall street|

  @PhaseAll_CD @PhaseAll @APUI374_TC60_Aff_CD @Affiliates_Sprint12_CD @Acceptence_14_CD @QASprint12_CD @Regression
  Scenario Outline:APUI374_TC60_Aff_CD To verify the Maxlength in case of BankAddress for PFX Customers
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" AccountNumber "<AccountNumber>" SortCode "<SortCode>" BankName "<BankName>" BankAddress "<BankAddress>" for BecomeAPartner journey
    And User enters BankAddress more than 65 characters on Bank details page
    And User should get error field and textbox should turn red for BankAddress fields on Bank details
    Then Continue button to be Observed as Grayed Out
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|AccountName|PaymentCountry|PaymentCurrency|AccountNumber|SortCode|BankName  |BankAddress   |
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |Sam Jeo    |United Kingdom|Pound Sterling |4587459852367|SJU37ED |Bank of UK|UK wall street|

  @PhaseAll_CD @PhaseAll @APUI374_TC61_Aff_CD @Affiliates_Sprint12_CD @Acceptence_14_CD @QASprint12_CD
  Scenario Outline:APUI374_TC61_Aff_CD To verify the Maxlength in case of BankAddress for CFX Customers
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
    Then User will be navigated to Bank Details Page
    And User enters AccountName "<AccountName>" PaymentCountry "<PaymentCountry>" PaymentCurrency "<PaymentCurrency>" AccountNumber "<AccountNumber>" SortCode "<SortCode>" BankName "<BankName>" BankAddress "<BankAddress>" for BecomeAPartner journey
    And User enters BankAddress more than 65 characters on Bank details page
    And User should get error field and textbox should turn red for BankAddress fields on Bank details
    Then Continue button to be Observed as Grayed Out
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |AccountName|PaymentCountry|PaymentCurrency|AccountNumber|SortCode|BankName  |BankAddress   |
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|Sam Jeo    |United Kingdom|Pound Sterling |4587459852367|SJU37ED |Bank of UK|UK wall street|

#Acceptence 15 is been covered in Acceptence 14

  @PhaseAll_CD @PhaseAll @APUI374_TC62_Aff_CD @Affiliates_Sprint12_CD @Acceptence_16_CD @QASprint12_CD
  Scenario Outline:APUI374_TC62_Aff_CD To verify that user should be able to use the back button for PFX Customers
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
    Then User will be navigated to Bank Details Page
    And User click on Back on Create an Account.
    Then User will be navigated to Login detail Page
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI374_TC63_Aff_CD @Affiliates_Sprint12_CD @Acceptence_16_CD @QASprint12_CD
  Scenario Outline:APUI374_TC63_Aff_CD To verify that user should be able to use the back button for CFX Customers
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
    Then User will be navigated to Bank Details Page
    And User click on Back on Create an Account.
    Then User will be navigated to Login detail Page
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName     |
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|

  @PhaseAll_CD @PhaseAll @APUI374_TC64_Aff_CD @Affiliates_Sprint12_CD @Acceptence_17_CD @QASprint12_CD
  Scenario Outline:APUI374_TC64_Aff_CD To Verify the User Should be able to view the Organzation details
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
    Then User will be navigated to Bank Details Page
    And User click on Back on Create an Account.
    Then User will be navigated to Login detail Page
    Then User should view the Organization information Before Login in header and fotter sections
    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Tio      |Jones   |+91        |8805116745  |United Kingdom     |A      |

