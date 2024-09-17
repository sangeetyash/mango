@Affiliate_Smoke_Prod_CD
Feature: Smoke Suite for Prod CD Organization

  @PhaseAll1_CD @PhaseAll1 @APUI51_TC4_Aff_CD @Affiliates_Sprint8_CD @Acceptence_5_CD @QASprint8_CD @Smoke1 @Regression
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
      | Chrome  | AffiliateCDProdURL | AffiliateCDProdUserName | AffProdPassword | AffiliateCDProdCustomerFullName |  AffiliateCDProdCustomerAccountNumber |

  @PhaseAll1_CD @PhaseAll1 @APUI151_TC3_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun @Smoke1
  Scenario Outline:TC3_APUI151_AFF To Verify the future month date on Account Page Commission Section
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    Then User is able to view the Commission section on Dashboard
    Then User will be able to view the Future month date in Commission section

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDProdURL | AffiliateCDProdUserName | AffProdPassword |


  @PhaseAll1_CD @PhaseAll1 @APUI379_TC20_Aff_CD @Affiliates_Sprint12_CD @Acceptence_1_CD @QASprint12_CD @Smoke1
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
      |Chrome  |AffiliateCDProdURL |Mr         |Prod_AffiliateUserAutoTesting  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT        |CurrenciesDirect|


  @PhaseAll1_CD @PhaseAll1 @APUI237_TC12_Aff_CD @Affiliates_Sprint15_CD @Acceptence_4_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun @Smoke1
  Scenario Outline:TC12_APUI237_AFF To Verify the Commission breakdown when generated option is been selected
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    And Use Clicks on Generated Radio Button
    #Then User will be able to view the Summary report for Commission section
    #And USer observe Your Commission Statement on Commissions page in bold
    #Then User Observe the value of Statement Month under Your Commission Statement in bold letter
    #And User Observe the commission payment breakdown options of the statement which is been Selected
    #Then User will display the Client name and commission generated by him

    Examples:
      | browser | urlName        | UserName                              | password    |
      | Chrome  | AffiliateCDProdURL | AffiliateCDProdUserName | AffProdPassword |


  @PhaseAll1_CD @PhaseAll1 @APUI255_TC13_Aff_CD @Affiliates_Sprint14_CD @Acceptence_4_CD @QASprint14_CD @Smoke1
  Scenario Outline:APUI255_TC13_Aff_CD To Verify the tier1 should be as per the month been selected for Paid commission
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User is able to view the Account Summary Section
    And User click on Commission tab on dashboard.
    Then User will be able to view the Summary report for Commission section
    And Use Clicks on Paid Radio Button
    #And USer observe Your Commission Statement on Commissions page in bold
    #Then User Observe the value of Statement Month under Your Commission Statement in bold letter
    #And User Observe the FirstTier options of the statement which is been Selected
    #Then User will validate the tier1 Date field record should be match with the paid date
    Examples:
      |browser |    urlName     |      UserName         |  password   |
      |Chrome  | AffiliateCDProdURL | AffiliateCDProdUserName   | AffProdPassword |

  @PhaseAll1_CD @PhaseAll1 @APUI111_TC1_Aff_CD @Affiliates_Sprint8_CD @Acceptence_1_CD @QASprint8_CD @Smoke1 @Regression
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
      | Chrome  | AffiliateCDProdURL | AffiliateCDProdUserName |


  @PhaseAll1_CD @PhaseAll1 @APUI125_TC9_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD @Smoke1
  Scenario Outline:APUI125_TC9_Aff_CD  To verify Organizations details to be displayed while performing the journey
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Both Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<EmailId>" and MobileNumber "<MobileNumber>"
    And User click on Generate Button on RefferalURLGenerator.
    Then success message to be displayed with Email "<EmailId>" And Mobile "<Mobile>" which is been entered
    And User click on Close Button on RefferalURLGenerator.
    Then User will land back on Account Page
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |  MobileNumber      | Mobile  |
      | Chrome  | AffiliateCDProdURL | AffiliateCDProdUserName | AffProdPassword |  Tanuj Kaundal  | tanuj.kaundal@bnt-soft.com   |  9786339706        | 123     |

#Customer has got 2 banks addes for different currencies
  @Phase_CD @Phase @APUI85_TC16_Aff_CD_16 @Affiliates_Sprint8_CD @Acceptence_6_CD @QASprint8_CD @Smoke1
  Scenario Outline:APUI85_TC16_Aff_CD To verify user should be able to view the account manager information on UI
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Affiliate Manager Contact button on dashboard.
    Then User is able to view and Note the Contact details for Affiliates manager
    Then User click on AnyElement to close the Affiliates Manager Contact details section on dashboard.
    And User should be able to view Profile Link icon
    Then User clicks on the Profile icon
    And User clicks on the Bank details button for Profile link navigation
    #And User is able to view Your Bank details section
    #And System will show the generic message as No Bank available
    #And System will show the bank details for that particular TWO bank including all the bank details with "<ExpectedAccountName1>" "<CurrencyCountryName1>" "<BankName1>" "<CurrencyCountryCode1>" "<CurrencyCountryCodeValue1>" "<AccountNumber1>" "<SWIFTcode1>" "<Reference1>" "<ExpectedAccountName2>" "<CurrencyCountryName2>" "<BankName2>" "<CurrencyCountryCode2>" "<CurrencyCountryCodeValue2>" "<AccountNumber2>" "<SWIFTcode2>" "<Reference2>" in expanded format
    #Then User is able to view the Partnership manager email along with phone number on Available Bank available
    Examples:
      | browser | urlName        | UserName            | password    |ExpectedAccountName1 |CurrencyCountryName1|BankName1   |CurrencyCountryCode1|CurrencyCountryCodeValue1|AccountNumber1                   |SWIFTcode1  |Reference1|ExpectedAccountName2|CurrencyCountryName2|BankName2                     |CurrencyCountryCode2|CurrencyCountryCodeValue2|AccountNumber2|SWIFTcode2  |Reference2|
      | Chrome  | AffiliateCDProdURL | AffiliateCDProdUserName | AffProdPassword |Mme Duvivier Laurence|european-union      |LA POSTE    |Sort code           | 0                       | FR0720041010123785317R03306     |PSSTFRPPSCE |   0      |12345678            |united-kingdom      |1st National Bank - Sea Point | Sort code          |      0                  |    12345678  |       0    |  0       |

  @PhaseAll1_CD @PhaseAll1 @APUI15_TC4_Aff_CD @Affiliates_Sprint5_CD @Acceptence_2_CD @QASprint5_CD @Smoke1
  Scenario Outline: TC4_APUI15_AFF To validate Organization information to be displayed properly
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enters Login Email Address "<UserName>" and Password "<password>"
    And User clicks and Hold the on Eye button
    Then User should be able to view the password in unMasked format "<password>"
    And User Releases the Mouse Click from Eye button
    Then User should be able to view the password in Masked format "<password>"
    And User should view the Organization information Before Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDProdURL | AffiliateCDProdUserName | AffProdPassword |

  @PhaseAll1_CD @PhaseAll1 @APUI142_TC5_Aff_CD @Affiliates_Sprint10_CD @Acceptence_2_CD @QASprint10_CD @Smoke1
  Scenario Outline:APUI142_TC5_Aff_CD To Verify User should be able to view the new Notifications at the the top
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view the Notification bell icon on UI
    And User click on Notification Bell Icon button on dashboard.
    #Then User will be navigated to the Notification section Page
    #And User observe the list of Notifications on UI
    #Then User should be able to view the new records at the top as per date in descending order
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDProdURL | AffiliateCDProdUserName | AffProdPassword |

  @PhaseAll1_CD @PhaseAll1 @APUI100_TC2_Aff_CD_TC2 @Affiliates_Sprint3_CD @Acceptence_1_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun @PhaseAll1_CD @PhaseAll1 @Smoke1
  Scenario Outline: TC2_APUI100_AFF To validate System should navigate to Account Page once timer gets over for Corporate Referal
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    Then System should able to view the Refer a client page with two options Individual and Corporate
    And User Selects Corporate option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" TradingName "<TradingName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters All Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User Selects All Transaction details Estimation Value "<EST_Value>" Currency has "<CurrencyHas>" Currency_want "<Currency_Want>" Reason "<Reason>" and Click on Continue
    Then System will Navigate to the Confirmation Page
    And User enters some value in TextArea "<Message>" and Select the Checkboxes and Click on Confirm
    Then System will Navigate to Confirmation Message Page
    Then After 10 secs system will navigate back to the Account Page
    Examples:
      | browser | urlName         | UserName             | password         | Salutation | FirstName | LastName | CompanyName | TradingName | Email                   | Country_Code | Mobile_Number | LandLineCode | LandLine   | BestTimeToCall | EST_Value | CurrencyHas    | Currency_Want | Reason | Message |
      | Chrome  | AffiliateCDProdURL | AffiliateCDProdUserName | AffProdPassword | Mr         | Tanuj    | Kaundal    | BNTSoft     | Trade       | tanuj.kaundal@bnt-soft.com | +91          |9786339706    | +91          | 2424004312 | Anytime        | 2,000     | Pound Sterling | Euro          | — | Testing |

  @PhaseAll1_CD @PhaseAll1 @APUI270_TC46_Aff_CD_TC46 @Affiliates_Sprint15_CD @Acceptence_11_CD @Smoke1
  Scenario Outline:APUI270_TC46_Aff_CD To Verify the user should be able to view Referrals options when user is been provided with Summary view
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    Then User should be able to view Referrals Registration and Trades section enable on UI
    And By default Referrals option should be selected
    And User click on Registration tab on Referrals Page
    And User click on Referrals tab on Referrals Page
    And User click on Trades tab on Referrals Page
    #And User confirms that system should only display 10 records in one page
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDProdURL | AffiliateCDProdUserName | AffProdPassword |

   #Tester needs to Check with Datawarehouse team for data
#Below are Some examples we can validate
# Steve John: Group Affilate : 10 Records(Including all 3 modules)
# John Middleton : Sub Affilate : 10 Records(Including all 3 modules)
#PFX Account : Sub Affilate : 10 Records(Including all 3 modules)
  @Phase_CD @Phase @APUI273_TC5_Aff_CD_TC5 @Affiliates_Sprint12_CD @Acceptence_3_CD @QASprint12_CD @Smoke1
  Scenario Outline:TC5_APUI273_AFF To Verify the Group User should display the sum of all records when having detailed view option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    Then User will be navigated to the Referrals section Page
    #Then User should be able to view the  Steve John Group Affilate been selected by default
    #And User click on the Affilate Group DropDown
    #Then User should be able to view the list of options on the dropdown
    #And User Selects the Total Group option from the list
    #Then System will display a total of records which is sum of all affilates
    Examples:
      |browser |    urlName     |      UserName           |  password   |
      |Chrome  | AffiliateCDProdURL | AffiliateCDProdUserName | AffProdPassword |

     #All Mandatory values are Unique #New CR Changes APUI-977
  @Phase_CD @Phase @APUI89_TC6_Aff_CD @Affiliates_Sprint14_CD @Acceptence_6_CD @QASprint14_CD @Smoke1
  Scenario Outline:APUI89_TC6_Aff_CD To Verify that the User Should be able to recognise that the registration detail are being processed
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>"
    And User notes Single selected DateOfBirth for Register a customer
    And User click on Continue Button on Register a customer.
    Then System will navigate to the Address details Page
    And User clicks on Country field
    And User Select Country "<Country>" from Country DropDown for Single Registration
    And User should be able to view address details "<Address>" and options in dropdown for Single
    And User click on Continue Button on Register a customer.
    Then User is navigated on Confirmation Page for Register a customer
    #Then User validates the Single Registration details FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Country "<Country>" address details "<Address>" on Confirmation page
    And User clicks on Partner Confirmation checkbox field
    And User click on Confirmation on Register a customer.
    Then User will be able to view the Rocket animation on UI
    Then User Should be able to see the Progress bar stating the completed percentage
    Then User has to wait for few more seconds to wait for the next page to be displayed
    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName | DateOfBirth |      Email        | Country_Code | Mobile_Number |Country       |                          Address                         |Occupation|
      | Chrome  | AffiliateCDProdURL | AffiliateCDProdUserName | AffProdPassword |  Jhon     | Lobo     | MaxYear     |    ABC           | +91          | 8098094332  |United Kingdom| A, Selborne Mansions, Bradford, West Yorkshire, BD9 4NP  |Accountant   |

  #Open New Bug APUI-1010
  @PhaseAll1_CD @PhaseAll1 @APUI328_TC26_Aff_CD_TC26 @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD @Smoke1
  Scenario Outline:APUI328_TC26_Aff_CD TC26_APUI328_AFF TC26_APUI328_AFF To Verify User should be able to download the document for leflets and Browsers using download option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And  User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And  User clicks on Categories field
    #Then User UnSelect Logos option from Categories dropdown
    Then User Select Leaflets option from Categories dropdown
    Then User will be able to view the Leaflets on the Search Page
    #And  User chooses documnet Leaflets and Click on View
    #And  User chooses documnet Leaflets and Click on Download
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDProdURL | AffiliateCDProdUserName | AffProdPassword |
    
    #Failing due to New bug -- I have raised to tanuj on mail APUI-1008
  @Phase_CD @Phase @APUI49_TC32_Aff_CD_TC32 @Affiliates_Sprint10_CD @Acceptence_4_CD @QASprint11_CD @Smoke1
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
      | Chrome  | AffiliateCDProdURL | AffiliateCDProdUserName     | AffProdPassword         |

  @PhaseAll_CD @PhaseAll @APUI72_TC9_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD @Smoke1
  Scenario Outline:APUI72_TC9_Aff_CD TC9_APUI72_AFF To Verify user should be able to view the logout message when he logs out from Dashboard
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Profile Link on dashboard.
    Then User will be able to view the Logout option in the dropdown
    And User click on Logout on Profile Link.
    Then Verify User logged out successfully from Account Page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDProdURL | AffiliateCDProdUserName | AffProdPassword |