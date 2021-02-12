@Affiliate_InSprint_BecomeaPartner_CD @APUI_369_CD @CD
Feature: Affiliate V2.0 Become a Partner Page for APUI369-CD

  @PhaseAll_CD @PhaseAll @APUI369_TC1_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline: TC1_APUI369_AFF_CD To Verify that user should be able to fill the Personal details for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User enters An Individual the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |

  @PhaseAll_CD @PhaseAll @APUI369_TC2_Aff_CD @Affiliates_Sprint11_CD @Acceptence_1_CD @QASprint11_CD
  Scenario Outline: TC2_APUI369_AFF_CD To Verify that user should be able to fill the Personal details for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User enters A Company the personal details Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CountryCode "<CountryCode>" MobileNumber "<MobileNumber>" Country "<Country>" Address "<Address>" CompanyName "<CompanyName>" TradingName "<TradingName>"
    And Verify the Address to be populated properly And Verify the Details
    Then User should be able to view the inputs are been properly mapped and Back to Login and Continue button to be enabled

    Examples:
      |browser |urlName        |Salutation |FirstName|LastName|CountryCode|MobileNumber|Country            |Address|CompanyName|TradingName|
      |Chrome  |AffiliateCDURL |Mr         |Testing  |Jones   |+91        |8805116745  |United Kingdom     |A      |BNT         |Currencies Direct|

  @PhaseAll_CD @PhaseAll @APUI369_TC5_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD
  Scenario Outline: TC5_APUI369_AFF_CD To Verify that user should be able to view list of addresses based on the country been selected for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User selects the Country"<Country>" and address"<Address>"
    Then User Should be able to view the list of address based on the Selected Country United Kingdom with Edit Option
    Examples:
      | browser | urlName        |  Country           | Address |
      | Chrome  | AffiliateCDURL |  United Kingdom    | A       |

  @PhaseAll_CD @PhaseAll @APUI369_TC6_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD
  Scenario Outline: TC6_APUI369_AFF_CD To Verify that user should be able to view list of addresses based on the country been selected for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User selects the Country"<Country>" and address"<Address>"
    Then User Should be able to view the list of address based on the Selected Country United Kingdom with Edit Option
    Examples:
      | browser | urlName        |  Country           | Address |
      | Chrome  | AffiliateCDURL |  United Kingdom    | A       |


  @PhaseAll_CD @PhaseAll @APUI369_TC7_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD
  Scenario Outline: TC7_APUI369_AFF_CD To Verify that user should be able to view list of addresses when Customer updates the country for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User selects the Country"<Country>" and address"<Address>"
    Then User Should be able to view the list of address based on the Selected Country United Kingdom Without Edit Option
    And User Deletes the Country been Selected and updates it to other Country "<Update Country>" And "<Address>"
    Then User Should be able to view the list of address based on the Selected Country Austrilia Without Edit Option
    Examples:
      | browser | urlName        |  Country           | Address | Update Country|
      | Chrome  | AffiliateCDURL |  United Kingdom    | B       | Australia      |


  @PhaseAll_CD @PhaseAll @APUI369_TC8_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD
  Scenario Outline: TC8_APUI369_AFF_CD To Verify that user should be able to view list of addresses when Customer updates the country for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User selects the Country"<Country>" and address"<Address>"
    Then User Should be able to view the list of address based on the Selected Country United Kingdom Without Edit Option
    And User Deletes the Country been Selected and updates it to other Country "<Update Country>" And "<Address>"
    Then User Should be able to view the list of address based on the Selected Country Austrilia Without Edit Option
    Examples:
      | browser | urlName        |  Country           | Address | Update Country  |
      | Chrome  | AffiliateCDURL |  United Kingdom    | B       | Australia       |


  @PhaseAll_CD @PhaseAll @APUI369_TC11_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD
  Scenario Outline: TC11_APUI369_AFF_CD To Verify that user should be able to enter address manually if it does not found any match for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User selects the Country"<Country>" and address"<Address>"
    Then User will get an error message enter address manually
    Examples:
      | browser | urlName        |  Country                | Address           |
      | Chrome  | AffiliateCDURL |  Australia              | A                  |


  @PhaseAll_CD @PhaseAll @APUI369_TC12_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD
  Scenario Outline: TC12_APUI369_AFF_CD To Verify that user should be able to enter address manually if it does not found any match for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User selects the Country"<Country>" and address"<Address>"
    Then User will get an error message enter address manually
    Examples:
      | browser | urlName        |  Country                | Address            |
      | Chrome  | AffiliateCDURL |  Australia              | A                  |

  @PhaseAll_CD @PhaseAll @APUI369_TC13_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD
  Scenario Outline: TC13_APUI369_AFF_CD To Verify that user should be able to view correct Salutation values for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User clicks on RACSalutation field
    Then User Should be able to Verify All values for Salutation DropDown

    Examples:
      | browser | urlName        |
      | Chrome  | AffiliateCDURL |

  @PhaseAll_CD @PhaseAll @APUI369_TC14_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD
  Scenario Outline: TC14_APUI369_AFF_CD To Verify that user should be able to view correct Salutation values for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User clicks on RACSalutation field
    Then User Should be able to Verify All values for Salutation DropDown

    Examples:
      | browser | urlName        |
      | Chrome  | AffiliateCDURL |

    #Manul Tester Needs to look into it
  @APUI369_TC15_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD
  Scenario Outline: TC15_APUI369_AFF_CD To Verify that user should be able to view correct Country values for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User clicks on Country field
    Then User Should be able to Verify All values for Country DropDown

    Examples:
      | browser | urlName        |
      | Chrome  | AffiliateCDURL |


  @APUI369_TC16_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD @Regression
  Scenario Outline: TC16_APUI369_AFF_CD To Verify that user should be able to view correct Country values for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User clicks on Country field
    Then User Should be able to Verify All values for Country DropDown

    Examples:
      | browser | urlName        |
      | Chrome  | AffiliateCDURL |


  @APUI369_TC17_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD
  Scenario Outline: TC17_APUI369_AFF_CD To Verify that user should be able to view correct Mobile Country Code values for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User clicks on CountryCodeMobile field
    Then User Should be able to Verify All values for CountryCodeMobile DropDown

    Examples:
      | browser | urlName        |
      | Chrome  | AffiliateCDURL |


  @APUI369_TC18_Aff_CD @Affiliates_Sprint11_CD @Acceptence_3_CD @QASprint11_CD @Regression
  Scenario Outline: TC18_APUI369_AFF_CD To Verify that user should be able to view correct Mobile Country Code values for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User clicks on CountryCodeMobile field
    Then User Should be able to Verify All values for CountryCodeMobile DropDown

    Examples:
      | browser | urlName        |
      | Chrome  | AffiliateCDURL |

  @PhaseAll_CD @PhaseAll @APUI369_TC19_Aff_CD @Affiliates_Sprint11_CD @Acceptence_8_CD @QASprint11_CD
  Scenario Outline: TC19_APUI369_AFF_CD To Verify that Salutation field is mandatory for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User clicks on Salutation and do not select any Value
    Then System Salutation should turn the input red and Continue button is been Grayed Out
    Examples:
      | browser | urlName        |
      | Chrome  | AffiliateCDURL |


  @PhaseAll_CD @PhaseAll @APUI369_TC20_Aff_CD @Affiliates_Sprint11_CD @Acceptence_8_CD @QASprint11_CD
  Scenario Outline: TC20_APUI369_AFF_CD To Verify that Validation is mandatory when user deletes the Salutation for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User clicks on Salutation and select any Value from Dropdown "<Salutation>"
    And User Deletes Salutation which is been Selected
    Then System Salutation should turn the input red and Continue button is been Grayed Out
    Examples:
      | browser | urlName        |  Salutation  |
      | Chrome  | AffiliateCDURL |  Mr          |

  @PhaseAll_CD @PhaseAll @APUI369_TC21_Aff_CD @Affiliates_Sprint11_CD @Acceptence_8_CD @QASprint11_CD
  Scenario Outline: TC21_APUI369_AFF_CD To Verify that Salutation field is mandatory for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User clicks on Salutation and do not select any Value
    Then System Salutation should turn the input red and Continue button is been Grayed Out
    Examples:
      | browser | urlName        |
      | Chrome  | AffiliateCDURL |

  @PhaseAll_CD @PhaseAll @APUI369_TC22_Aff_CD @Affiliates_Sprint11_CD @Acceptence_8_CD @QASprint11_CD
  Scenario Outline: TC22_APUI369_AFF_CD To Verify that Validation is mandatory when user deletes the Salutation for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User clicks on Salutation and select any Value from Dropdown "<Salutation>"
    And User Deletes Salutation which is been Selected
    Then System Salutation should turn the input red and Continue button is been Grayed Out
    Examples:
      | browser | urlName        |  Salutation  |
      | Chrome  | AffiliateCDURL |  Mr          |

  @PhaseAll_CD @PhaseAll @APUI369_TC23_Aff_CD @Affiliates_Sprint11_CD @Acceptence_8_CD @QASprint11_CD
  Scenario Outline: TC23_APUI369_AFF_CD To Verify that FirstName field is mandatory for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User clicks on Salutation and select any Value from Dropdown "<Salutation>"
    And User clicks on FirstName and do not select any Value
    Then System FirstName should turn the input red and Continue button is been Grayed Out
    Examples:
      | browser | urlName        |  Salutation  |
      | Chrome  | AffiliateCDURL |  Mr          |

  @PhaseAll_CD @PhaseAll @APUI369_TC24_Aff_CD @Affiliates_Sprint11_CD @Acceptence_8_CD @QASprint11_CD @Regression
  Scenario Outline: TC24_APUI369_AFF_CD To Verify that FirstName Maximum length for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User clicks on Salutation and select any Value from Dropdown "<Salutation>"
    And User click on the FirstName enter the name more than 40 characters
    Then System FirstName should turn the input red and Continue button is been Grayed Out
    Examples:
      | browser | urlName        |  Salutation  |
      | Chrome  | AffiliateCDURL |  Mr          |

  @PhaseAll_CD @PhaseAll @APUI369_TC25_Aff_CD @Affiliates_Sprint11_CD @Acceptence_8_CD @QASprint11_CD
  Scenario Outline: TC25_APUI369_AFF_CD To Verify that FirstName field is mandatory for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User clicks on Salutation and select any Value from Dropdown "<Salutation>"
    And User clicks on FirstName and do not select any Value
    Then System FirstName should turn the input red and Continue button is been Grayed Out
    Examples:
      | browser | urlName        |  Salutation  |
      | Chrome  | AffiliateCDURL |  Mr          |

  @PhaseAll_CD @PhaseAll @APUI369_TC26_Aff_CD @Affiliates_Sprint11_CD @Acceptence_8_CD @QASprint11_CD @Regression
  Scenario Outline: TC26_APUI369_AFF_CD To Verify that FirstName Maximum length for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User clicks on Salutation and select any Value from Dropdown "<Salutation>"
    And User click on the FirstName enter the name more than 40 characters
    Then System FirstName should turn the input red and Continue button is been Grayed Out
    Examples:
      | browser | urlName        |  Salutation  |
      | Chrome  | AffiliateCDURL |  Mr          |

  @PhaseAll_CD @PhaseAll @APUI369_TC27_Aff_CD @Affiliates_Sprint11_CD @Acceptence_8_CD @QASprint11_CD
  Scenario Outline: TC27_APUI369_AFF_CD To Verify that LastName field is mandatory for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User clicks on Salutation and select any Value from Dropdown "<Salutation>"
    And User clicks on LastName and do not select any Value
    Then System LastName should turn the input red and Continue button is been Grayed Out
    Examples:
      | browser | urlName        |  Salutation  |
      | Chrome  | AffiliateCDURL |  Mr          |

  @PhaseAll_CD @PhaseAll @APUI369_TC28_Aff_CD @Affiliates_Sprint11_CD @Acceptence_8_CD @QASprint11_CD @Regression
  Scenario Outline: TC28_APUI369_AFF_CD To Verify that LastName Maximum length for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User clicks on Salutation and select any Value from Dropdown "<Salutation>"
    And User click on the LastName enter the name more than 40 characters
    Then System LastName should turn the input red and Continue button is been Grayed Out
    Examples:
      | browser | urlName        |  Salutation  |
      | Chrome  | AffiliateCDURL |  Mr          |

  @PhaseAll_CD @PhaseAll @APUI369_TC29_Aff_CD @Affiliates_Sprint11_CD @Acceptence_8_CD @QASprint11_CD
  Scenario Outline: TC29_APUI369_AFF_CD To Verify that LastName field is mandatory for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User clicks on Salutation and select any Value from Dropdown "<Salutation>"
    And User clicks on LastName and do not select any Value
    Then System LastName should turn the input red and Continue button is been Grayed Out
    Examples:
      | browser | urlName        |  Salutation  |
      | Chrome  | AffiliateCDURL |  Mr          |

  @PhaseAll_CD @PhaseAll @APUI369_TC30_Aff_CD @Affiliates_Sprint11_CD @Acceptence_8_CD @QASprint11_CD @Regression
  Scenario Outline: TC30_APUI369_AFF_CD To Verify that LastName Maximum length for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User clicks on Salutation and select any Value from Dropdown "<Salutation>"
    And User click on the LastName enter the name more than 40 characters
    Then System LastName should turn the input red and Continue button is been Grayed Out
    Examples:
      | browser | urlName        |  Salutation  |
      | Chrome  | AffiliateCDURL |  Mr          |

  @PhaseAll_CD @PhaseAll @APUI369_TC31_Aff_CD @Affiliates_Sprint11_CD @Acceptence_8_CD @QASprint11_CD
  Scenario Outline: TC31_APUI369_AFF_CD To Verify that CompanyName field is mandatory for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User clicks on Salutation and select any Value from Dropdown "<Salutation>"
    And User clicks on CompanyName and do not select any Value
    Then System CompanyName should turn the input red and Continue button is been Grayed Out
    Examples:
      | browser | urlName        |  Salutation  |
      | Chrome  | AffiliateCDURL |  Mr          |

  @PhaseAll_CD @PhaseAll @APUI369_TC32_Aff_CD @Affiliates_Sprint11_CD @Acceptence_8_CD @QASprint11_CD @Regression
  Scenario Outline: TC32_APUI369_AFF_CD To Verify that CompanyNmae Maximum length for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User clicks on Salutation and select any Value from Dropdown "<Salutation>"
    And User click on the CompanyName enter the name more than 50 characters
    Then System CompanyName should turn the input red and Continue button is been Grayed Out
    Examples:
      | browser | urlName        |  Salutation  |
      | Chrome  | AffiliateCDURL |  Mr          |

  @PhaseAll_CD @PhaseAll @APUI369_TC33_Aff_CD @Affiliates_Sprint11_CD @Acceptence_8_CD @QASprint11_CD @Regression
  Scenario Outline: TC33_APUI369_AFF_CD To Verify that TradingName Maximum length for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User clicks on Salutation and select any Value from Dropdown "<Salutation>"
    And User click on the TradingName enter the name more than 100 characters
    Then System TradingName should turn the input red and Continue button is been Grayed Out
    Examples:
      | browser | urlName        |  Salutation  |
      | Chrome  | AffiliateCDURL |  Mr          |

  @PhaseAll_CD @PhaseAll @APUI369_TC35_Aff_CD @Affiliates_Sprint11_CD @Acceptence_8_CD @QASprint11_CD
  Scenario Outline: TC35_APUI369_AFF_CD To Verify that user should be able to move back to login page for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User click on Back to Login on Create an Account.
    Then User will land on the Login Page
    Examples:
      | browser | urlName        |
      | Chrome  | AffiliateCDURL |

  @PhaseAll_CD @PhaseAll @APUI369_TC36_Aff_CD @Affiliates_Sprint11_CD @Acceptence_8_CD @QASprint11_CD
  Scenario Outline: TC36_APUI369_AFF_CD To Verify that user should be able to move back to login page for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User click on Back to Login on Create an Account.
    Then User will land on the Login Page
    Examples:
      | browser | urlName        |
      | Chrome  | AffiliateCDURL |


  @PhaseAll_CD @PhaseAll @APUI369_TC37_Aff_CD @Affiliates_Sprint11_CD @Acceptence_8_CD @QASprint11_CD
  Scenario Outline: TC37_APUI369_AFF_CD To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    Then User should view the Organization information Before Login in header and fotter sections
    Examples:
      | browser | urlName        |
      | Chrome  | AffiliateCDURL |


  @PhaseAll_CD @PhaseAll @APUI369_TC38_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint12_CD
  Scenario Outline:APUI369_TC38_Aff_CD To validate System should give error for Minimum mobile number length for Corporate Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    And User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User clicks on CountryCodeMobile field
    And User enters CountryCode "<CountryCode>" on Become a partner page
    And User enters MobileNumber of 7 digits
    Then System MobileNumber should turn the input red and Continue button is been Grayed Out
    Examples:
      |browser |   urlName     |CountryCode|
      |Chrome  |AffiliateCDURL |+91        |
      |Chrome  |AffiliateCDURL |+1         |
      |Chrome  |AffiliateCDURL |+852       |

  @PhaseAll_CD @PhaseAll @APUI369_TC39_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint12_CD @Regression
  Scenario Outline:APUI369_TC39_Aff_CD To validate System should give error for Minimum mobile number length for Personal option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    Then User will will be able to view Personal radio button as bydefault selection
    And User Selects the Personal option
    And User clicks on CountryCodeMobile field
    And User enters CountryCode "<CountryCode>" on Become a partner page
    And User enters MobileNumber of 7 digits
    Then System MobileNumber should turn the input red and Continue button is been Grayed Out
    Examples:
      |browser |   urlName     |CountryCode|
      |Chrome  |AffiliateCDURL |+47        |
      |Chrome  |AffiliateCDURL |+1         |
      |Chrome  |AffiliateCDURL |+501       |

  @PhaseAll_CD @PhaseAll @APUI369_TC40_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint12_CD @Regression
  Scenario Outline:APUI369_TC40_Aff_CD To validate System should give error when no number is been entered for Corporate Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    And User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User clicks on CountryCodeMobile field
    And User enters CountryCode "<CountryCode>" on Become a partner page
    And User enters MobileNumber of 0 digits
    Then System MobileNumber should turn the input red and Continue button is been Grayed Out
    Examples:
      |browser |   urlName     |CountryCode|
      |Chrome  |AffiliateCDURL |+34        |
      |Chrome  |AffiliateCDURL |+1         |
      |Chrome  |AffiliateCDURL |+353       |


  @PhaseAll_CD @PhaseAll @APUI369_TC41_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint12_CD @Regression
  Scenario Outline: APUI369_TC41_Aff_CD To validate System should give error for Maximum mobile number length for Corporate Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    And User will will be able to view Personal radio button as bydefault selection
    And User Selects the Corporate option
    And User clicks on CountryCodeMobile field
    And User enters CountryCode "<CountryCode>" on Become a partner page
    And User enters MobileNumber of 15 digits
    Then System MobileNumber should turn the input red and Continue button is been Grayed Out
    Examples:
      |browser |   urlName     |CountryCode|
      |Chrome  |AffiliateCDURL |+34        |
      |Chrome  |AffiliateCDURL |+1         |
      |Chrome  |AffiliateCDURL |+353       |

  @PhaseAll_CD @PhaseAll @APUI369_TC42_Aff_CD @Affiliates_Sprint12_CD @Acceptence_2_CD @QASprint12_CD
  Scenario Outline: APUI369_TC42_Aff_CD To validate System should give error for Maximum mobile number length for Personal option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    And User click on Become a Partner on Login.
    Then User will be Navigated to become a partner page
    And User will will be able to view Personal radio button as bydefault selection
    And User Selects the Personal option
    And User clicks on CountryCodeMobile field
    And User enters CountryCode "<CountryCode>" on Become a partner page
    And User enters MobileNumber of 15 digits
    Then System MobileNumber should turn the input red and Continue button is been Grayed Out
    Examples:
      |browser |   urlName     |CountryCode|
      |Chrome  |AffiliateCDURL |+34        |
      |Chrome  |AffiliateCDURL |+1         |
      |Chrome  |AffiliateCDURL |+353       |



