@Affiliate_InSprint_GlobalPage_CD @APUI_85_CD @CD
Feature: Affiliate V2.0 Global page elements for APUI85-CD

   @PhaseAll_CD @PhaseAll @APUI85_TC1_Aff_CD @Affiliates_Sprint8_CD @Acceptence_1_CD @QASprint8_CD
  Scenario Outline:APUI85_TC1_Aff_CD To verify User should be able view the profile link icon on Dashboard
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    Then User should be able to view Profile Link icon
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

   @PhaseAll_CD @PhaseAll @APUI85_TC2_Aff_CD @Affiliates_Sprint8_CD @Acceptence_1_CD @QASprint8_CD
  Scenario Outline:APUI85_TC2_Aff_CD To verify User should be able view the profile link icon on Account Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Account tab on dashboard.
    And System should display the Account Page
    Then User should be able to view Profile Link icon
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

   @PhaseAll_CD @PhaseAll @APUI85_TC3_Aff_CD @Affiliates_Sprint8_CD @Acceptence_1_CD @QASprint8_CD
  Scenario Outline:APUI85_TC3_Aff_CD To verify User should be able view the profile link icon on Refer a client Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    And System should display the refer new client Page
    Then User should be able to view Profile Link icon
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

   @PhaseAll_CD @PhaseAll @APUI85_TC4_Aff_CD @Affiliates_Sprint8_CD @Acceptence_1_CD @QASprint8_CD
  Scenario Outline:TC4_APUI85_AFF To verify User should be able view the profile link icon on Resources Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    And User will be navigated to the Resources section Page
    Then User should be able to view Profile Link icon
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

   @PhaseAll_CD @PhaseAll @APUI85_TC5_Aff_CD @Affiliates_Sprint8_CD @Acceptence_1_CD @QASprint8_CD
  Scenario Outline:APUI85_TC5_Aff_CD To verify User should be able view the profile link icon on Referals Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Referrals tab on dashboard.
    And User will be navigated to the Referrals section Page
    Then User should be able to view Profile Link icon
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

   @PhaseAll_CD @PhaseAll @APUI85_TC6_Aff_CD @Affiliates_Sprint8_CD @Acceptence_1_CD @QASprint8_CD
  Scenario Outline:APUI85_TC6_Aff_CD To verify User should be able view the profile link icon on Settings Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Settings tab on dashboard.
    And User will be navigated to the Settings section Page
    Then User should be able to view Profile Link icon
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI85_TC7_Aff_CD @Affiliates_Sprint8_CD @Acceptence_1_CD @QASprint8_CD @Reruntest
  Scenario Outline:APUI85_TC7_Aff_CD To verify User should be able view the profile link icon on Register a Customer Journey
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    And User will be navigated to the Register a customer Page
    Then User should be able to view Profile Link icon
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

   @PhaseAll_CD @PhaseAll @APUI85_TC8_Aff_CD @Affiliates_Sprint8_CD @Acceptence_1_CD @QASprint8_CD
  Scenario Outline:APUI85_TC8_Aff_CD To verify User should be able view the profile link icon on Notification Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Notification Bell Icon button on dashboard.
    And User will be navigated to the Notification section Page
    Then User should be able to view Profile Link icon
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

   @PhaseAll_CD @PhaseAll @APUI85_TC9_Aff_CD @Affiliates_Sprint8_CD @Acceptence_1_CD @QASprint8_CD
  Scenario Outline:APUI85_TC9_Aff_CD To verify User should be able view the profile link icon on Commission Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Commission tab on dashboard.
    And User will be navigated to the Commission section Page
    Then User should be able to view Profile Link icon
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

#Accepetence 2 is been Depriciated
   @PhaseAll_CD @PhaseAll @APUI85_TC10_Aff_CD @Affiliates_Sprint8_CD @Acceptence_3_CD @QASprint8_CD
  Scenario Outline:APUI85_TC10_Aff_CD To verify User should be able view the customer details post clicking on profile link for PFX customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view Profile Link icon
    And User clicks on the Profile icon
    Then User will be able to view CustomerFullName "<CustomerFullName>" and AccountNumber "<CustomerAccountNumber>" on Profile section
    Examples:
      | browser | urlName        | UserName            | password    |      CustomerFullName       |    CustomerAccountNumber          |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | AffiliateCDCustomerFullName |  AffiliateCDCustomerAccountNumber |

  @PhaseAll_CD @PhaseAll @APUI85_TC11_Aff_CD @Affiliates_Sprint8_CD @Acceptence_3_CD @QASprint8_CD
  Scenario Outline:APUI85_TC11_Aff_CD To verify User should be able view the customer details post clicking on profile link for CFX customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view Profile Link icon
    And User clicks on the Profile icon
    Then User will be able to view CustomerFullName "<CustomerFullName>" AccountNumber "<CustomerAccountNumber>" and TradingName "<TradingName>" on Profile section
    Examples:
      | browser | urlName        | UserName                | password        |      CustomerFullName           |    CustomerAccountNumber              |        TradingName         |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_CFX | AffPassword_CFX | AffiliateCDCustomerFullName_CFX |  AffiliateCDCustomerAccountNumber_CFX | AffiliateCDTradingName_CFX |

   @PhaseAll_CD @PhaseAll @APUI85_TC12_Aff_CD @Affiliates_Sprint8_CD @Acceptence_4_CD @QASprint8_CD
  Scenario Outline:TC12_APUI85_AFF To verify User should land on Settings Page post clicking on Profile details for PFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view Profile Link icon
    And User clicks on the Profile icon
    Then User will be able to view CustomerFullName "<CustomerFullName>" and AccountNumber "<CustomerAccountNumber>" on Profile section
    And User clicks on the Personal details button for Profile link navigation
    Then User will be navigated to the Settings section Page
    Examples:
      | browser | urlName        | UserName            | password    |      CustomerFullName       |    CustomerAccountNumber          |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword | AffiliateCDCustomerFullName |  AffiliateCDCustomerAccountNumber |

  @PhaseAll_CD @PhaseAll @APUI85_TC13_Aff_CD @Affiliates_Sprint8_CD @Acceptence_4_CD @QASprint8_CD
  Scenario Outline:APUI85_TC13_Aff_CD To verify User should land on Settings Page post clicking on Profile details for CFX Customer
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view Profile Link icon
    And User clicks on the Profile icon
    Then User will be able to view CustomerFullName "<CustomerFullName>" AccountNumber "<CustomerAccountNumber>" and TradingName "<TradingName>" on Profile section
    And User clicks on the Personal details button for Profile link navigation
    Then User will be navigated to the Settings section Page
    Examples:
      | browser | urlName        | UserName                | password        |      CustomerFullName           |    CustomerAccountNumber              |        TradingName         |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_CFX | AffPassword_CFX | AffiliateCDCustomerFullName_CFX |  AffiliateCDCustomerAccountNumber_CFX | AffiliateCDTradingName_CFX |

    #Customer has got 2 banks addes for different currencies
  @Phase_CD @Phase @APUI85_TC15_Aff_CD @Affiliates_Sprint10_CD @Acceptence_5_CD @QASprint10_CD
  Scenario Outline:APUI85_TC15_Aff_CD To verify User should view the bank details on UI
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Affiliate Manager Contact button on dashboard.
    Then User is able to view and Note the Contact details for Affiliates manager
    Then User click on AnyElement to close the Affiliates Manager Contact details section on dashboard.
    And User should be able to view Profile Link icon
    Then User clicks on the Profile icon
    And User will be able to view CustomerFullName "<CustomerFullName>" AccountNumber "<CustomerAccountNumber>" and TradingName "<TradingName>" on Profile section
    Then User clicks on the Bank details button for Profile link navigation
    And User is able to view Your Bank details section
    Then System will show the bank details for that particular TWO bank including all the bank details with "<ExpectedAccountName1>" "<CurrencyCountryName1>" "<BankName1>" "<CurrencyCountryCode1>" "<CurrencyCountryCodeValue1>" "<AccountNumber1>" "<SWIFTcode1>" "<Reference1>" "<ExpectedAccountName2>" "<CurrencyCountryName2>" "<BankName2>" "<CurrencyCountryCode2>" "<CurrencyCountryCodeValue2>" "<AccountNumber2>" "<SWIFTcode2>" "<Reference2>" in expanded format
    Examples:
      | browser | urlName        | UserName                | password        | CustomerFullName               |    CustomerAccountNumber              |        TradingName         |ExpectedAccountName1 |CurrencyCountryName1|BankName1   |CurrencyCountryCode1|CurrencyCountryCodeValue1|AccountNumber1                   |SWIFTcode1  |Reference1|ExpectedAccountName2|CurrencyCountryName2|BankName2                     |CurrencyCountryCode2|CurrencyCountryCodeValue2|AccountNumber2|SWIFTcode2  |Reference2|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_CFX | AffPassword_CFX |AffiliateCDCustomerFullName_CFX |  AffiliateCDCustomerAccountNumber_CFX | AffiliateCDTradingName_CFX |Mme Duvivier Laurence|european-union      |LA POSTE    |Sort code           | 0                       | FR0720041010123785317R03306     |PSSTFRPPSCE |   0      |12345678            |united-kingdom      |1st National Bank - Sea Point | Sort code          |      0                  |    12345678  |       0    |  0       |

    #Customer has got 2 banks addes for different currencies
  @Phase_CD @Phase @APUI85_TC16_Aff_CD @Affiliates_Sprint8_CD @Acceptence_6_CD @QASprint8_CD @Smoke
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
    And User is able to view Your Bank details section
    #And System will show the bank details for that particular TWO bank including all the bank details with "<ExpectedAccountName1>" "<CurrencyCountryName1>" "<BankName1>" "<CurrencyCountryCode1>" "<CurrencyCountryCodeValue1>" "<AccountNumber1>" "<SWIFTcode1>" "<Reference1>" "<ExpectedAccountName2>" "<CurrencyCountryName2>" "<BankName2>" "<CurrencyCountryCode2>" "<CurrencyCountryCodeValue2>" "<AccountNumber2>" "<SWIFTcode2>" "<Reference2>" in expanded format
    #Then User is able to view the Partnership manager email along with phone number on Available Bank available
    Examples:
      | browser | urlName        | UserName            | password    |ExpectedAccountName1 |CurrencyCountryName1|BankName1   |CurrencyCountryCode1|CurrencyCountryCodeValue1|AccountNumber1                   |SWIFTcode1  |Reference1|ExpectedAccountName2|CurrencyCountryName2|BankName2                     |CurrencyCountryCode2|CurrencyCountryCodeValue2|AccountNumber2|SWIFTcode2  |Reference2|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |Mme Duvivier Laurence|european-union      |LA POSTE    |Sort code           | 0                       | FR0720041010123785317R03306     |PSSTFRPPSCE |   0      |12345678            |united-kingdom      |1st National Bank - Sea Point | Sort code          |      0                  |    12345678  |       0    |  0       |

  #Customer has got only one bank added
  @Phase_CD @Phase @APUI85_TC17_Aff_CD @Affiliates_Sprint10_CD @Acceptence_7_CD @QASprint10_CD
  Scenario Outline:APUI85_TC17_Aff_CD To verify user should be able to view the account manager information on UI
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Affiliate Manager Contact button on dashboard.
    Then User is able to view and Note the Contact details for Affiliates manager
    Then User click on AnyElement to close the Affiliates Manager Contact details section on dashboard.
    And User should be able to view Profile Link icon
    And User clicks on the Profile icon
    And User clicks on the Bank details button for Profile link navigation
    Then User is able to view Your Bank details section
    And System will show the bank details for that particular ONE bank including all the bank details with "<ExpectedAccountName1>" "<CurrencyCountryName1>" "<BankName1>" "<CurrencyCountryCode1>" "<CurrencyCountryCodeValue1>" "<AccountNumber1>" "<SWIFTcode1>" "<Reference1>" "<ExpectedAccountName2>" "<CurrencyCountryName2>" "<BankName2>" "<CurrencyCountryCode2>" "<CurrencyCountryCodeValue2>" "<AccountNumber2>" "<SWIFTcode2>" "<Reference2>" in expanded format
    Then User is able to view the Partnership manager email along with phone number on Available Bank available
    Examples:
      | browser | urlName        | UserName            | password    |ExpectedAccountName1|CurrencyCountryName1|BankName1           |CurrencyCountryCode1|CurrencyCountryCodeValue1|AccountNumber1|SWIFTcode1  |Reference1|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |   DC               |united-kingdom      |Bank of Scotland plc|Sort code           | 111111                  | 35887781     |HLFXGB21G95 |   0      |

  #Customer has got no bank added
  @Phase_CD @Phase @APUI85_TC18_Aff_CD @Affiliates_Sprint10_CD @Acceptence_8_CD @QASprint10_CD
  Scenario Outline:APUI85_TC18_Aff_CD To verify user be able to view proper message when no bank details are present
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
    Then System will show the generic message as No Bank available
    Examples:
      | browser | urlName        | UserName                       | password                                |
      | Chrome  | AffiliateCDURL | AffiliateNoNotificationUser_CD | AffiliateNoNotificationUser_CD_Password |

  #Customer has got no bank added
  @PhaseAll_CD @PhaseAll @APUI85_TC19_Aff_CD @Affiliates_Sprint10_CD @Acceptence_8_CD @QASprint10_CD
  Scenario Outline:APUI85_TC19_Aff_CD To verify user be able to view the account manager information on UI when customer does not have any bank
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
    And System will show the generic message as No Bank available
    Then User is able to view the Partnership manager email along with phone number on No Bank available
    Examples:
      | browser | urlName        | UserName                       | password                                |
      | Chrome  | AffiliateCDURL | AffiliateNoNotificationUser_CD | AffiliateNoNotificationUser_CD_Password |

  @PhaseAll_CD @PhaseAll @APUI85_TC20_Aff_CD @Affiliates_Sprint10_CD @Acceptence_9_CD @QASprint10_CD
  Scenario Outline:APUI85_TC20_Aff_CD To verify user be able to Use the Logout feature
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view Profile Link icon
    Then User clicks on the Profile icon
    And User clicks on the Logout button for Profile link navigation
    Then User is logged out of the system with generic message as LOGGED OUT
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI85_TC22_Aff_CD @Affiliates_Sprint10_CD @Acceptence_11_CD @QASprint10_CD
  Scenario Outline:APUI85_TC22_Aff_CD To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User should be able to view Profile Link icon
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

