@Affiliate_InSprint_RegisterACustomer_CD @APUI_34_CD @CD
Feature: Affiliate V2.0 Register a Customer feature for APUI34-CD

  @PhaseAll_CD @PhaseAll @APUI34_TC2_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline: APUI34_TC2_Aff_CD To validate User should be able to view the country drop down for Joint Registration
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>"
    And User click on Continue Button on Register a customer.
    Then System will navigate to the Address details Page
    And User clicks on RequireJointAccount field
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email1>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>" for JointAccount
    And User clicks on JointCountry field
    Then User Should be able to Verify All values for JointCountry DropDown

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Email1|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |      ABC|Accountant            |

  @PhaseAll_CD @PhaseAll @APUI34_TC3_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline: APUI34_TC3_Aff_CD To validate address drop down should not be displayed until country is been Selected for Single Registration
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>"
    And User click on Continue Button on Register a customer.
    Then System will navigate to the Address details Page
    And User clicks on Country field
    And User does not Select any Country from Country DropDown for Single
    Then User should not be able to view address details "<Address>" and options in dropdown for Single

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Email1|Address|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |      ABC|A|Accountant                  |

  @PhaseAll_CD @PhaseAll @APUI34_TC4_Aff_CD @Affiliates_Sprint13_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline: APUI34_TC4_Aff_CD To validate address drop down should not be displayed until country is been Selected for Joint Registration
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>"
    And User click on Continue Button on Register a customer.
    Then System will navigate to the Address details Page
    And User clicks on RequireJointAccount field
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email1>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>" for JointAccount
    And User clicks on JointCountry field
    And User does not Select any Country from Country DropDown for Joint
    Then User should not be able to view address details "<Address>" and options in dropdown for Joint

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Email1|Address|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |      ABC|A|Accountant                  |

  @PhaseAll_CD @PhaseAll @APUI34_TC5_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline: APUI34_TC5_Aff_CD  To validate address to be displayed as per the Country been selected for Single Registration
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>"
    And User click on Continue Button on Register a customer.
    Then System will navigate to the Address details Page
    And User clicks on Country field
    And User Select Country "<Country>" from Country DropDown for Single Registration
    And User should be able to view address details "<Address>" and options in dropdown for Single

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Email1|Country|Address|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |      ABC|United Kingdom |A|Accountant          |


  @PhaseAll_CD @PhaseAll @APUI34_TC6_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline: APUI34_TC6_Aff_CD  To validate address to be viped out when Country is been deleted
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>"
    And User click on Continue Button on Register a customer.
    Then System will navigate to the Address details Page
    And User clicks on Country field
    And User Select Country "<Country>" from Country DropDown for Single Registration
    #And User Delete Country "<Country>"
    #And User should not be able to view address details "<Address>" and options in dropdown for Single

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Email1|Country|Address|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |      ABC|United Kingdom|A|Accountant           |

  @PhaseAll_CD @PhaseAll @APUI34_TC7_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline: APUI34_TC7_Aff_CD   To validate address to be displayed as per the Country been selected for Joint Registration
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>"
    And User click on Continue Button on Register a customer.
    Then System will navigate to the Address details Page
    And User clicks on RequireJointAccount field
    And User clicks on JointCountry field
    And User Select Country "<Country>" from Country DropDown for Joint Registration
    And User should be able to view address details "<Address>" and options in dropdown for Joint

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Email1|Country|Address|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |      ABC|United Kingdom|A|Accountant           |

  @PhaseAll_CD @PhaseAll @APUI34_TC8_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint13_CD
  Scenario Outline: APUI34_TC8_Aff_CD  To validate address to be viped out when Country is been deleted for Joint Registration
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>"
    And User click on Continue Button on Register a customer.
    Then System will navigate to the Address details Page
    And User clicks on RequireJointAccount field
    And User clicks on JointCountry field
    And User Select Country "<Country>" from Country DropDown for Joint Registration
    And User should be able to view address details "<Address>" and options in dropdown for Joint
    #And User Delete any Country "<Country>"
    #And User should not be able to view address details "<Address>" and options in dropdown for Joint

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Email1|Country|Address|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |      ABC|United Kingdom|A|Accountant           |

  @PhaseAll_CD @PhaseAll @APUI34_TC9_Aff_CD @Affiliates_Sprint13_CD @Acceptence_3_CD @QASprint13_CD
  Scenario Outline: APUI34_TC9_Aff_CD  To validate address to be displayed as per the Country been selected for Single Registration
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>"
    And User click on Continue Button on Register a customer.
    Then System will navigate to the Address details Page
    And User clicks on Country field
    And User Select Country "<Country>" from Country DropDown for Single Registration
    And User should be able to view address details "<Address>" and options in dropdown for Single
    And User will get an error message enter address manually
    Then User should be allowed to enter the details manually

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Email1|Country|Address|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |      ABC|Spain|A|Accountant                    |

  @PhaseAll_CD @PhaseAll @APUI34_TC10_Aff_CD @Affiliates_Sprint13_CD @Acceptence_3_CD @QASprint13_CD
  Scenario Outline: APUI34_TC10_Aff_CD  To validate address to be displayed as per the Country been selected for Joint Registration
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>"
    And User click on Continue Button on Register a customer.
    Then System will navigate to the Address details Page
    And User clicks on RequireJointAccount field
    And User clicks on JointCountry field
    And User Select Country "<Country>" from Country DropDown for Joint Registration
    And User should be able to view address details "<Address>" and options in dropdown for Joint
    And User will get an error message enter address manually
    Then User should be allowed to enter the details manually

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Email1|Country|Address|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |      john.smith@gmail.com|Spain|A|Accountant   |

  @PhaseAll_CD @PhaseAll @APUI34_TC11_Aff_CD @Affiliates_Sprint13_CD @Acceptence_3_CD @QASprint13_CD
  Scenario Outline: APUI34_TC11_Aff_CD  To validate address to be displayed as per the Country been selected for Single Registration
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>"
    And User click on Continue Button on Register a customer.
    Then System will navigate to the Address details Page
    And User click on Enter Details Manually on Register a customer.
    Then User should be allowed to enter the details manually

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Email1|Country|Address|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |      john.smith@gmail.com|Spain|A|Accountant   |

  @PhaseAll_CD @PhaseAll @APUI34_TC12_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint13_CD
  Scenario Outline: APUI34_TC12_Aff_CD  To validate address to be displayed as per the Country been selected for Joint Registration
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>"
    And User click on Continue Button on Register a customer.
    Then System will navigate to the Address details Page
    And User clicks on RequireJointAccount field
    And User click on Enter Details Manually for Joint on Register a customer.
    Then User should be allowed to enter the details manually

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Email1|Country|Address|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |      john.smith@gmail.com|Spain|A|Accountant   |

  @PhaseAll_CD @PhaseAll @APUI34_TC13_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline: APUI34_TC13_Aff_CD  To validate user should not be able to proceed until valid country is been selected from dropdown
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>"
    And User click on Continue Button on Register a customer.
    Then System will navigate to the Address details Page
    And User clicks on Country field
    And User Select Country "<Country>" from Country DropDown for Single Registration

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Email1|Country|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |      john.smith@gmail.com|United State of America|Accountant|

  @PhaseAll_CD @PhaseAll @APUI34_TC14_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint13_CD
  Scenario Outline: APUI34_TC14_Aff_CD  To validate user should not be able to proceed until valid country is been selected from dropdown for Joint Registration
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>"
    And User click on Continue Button on Register a customer.
    Then System will navigate to the Address details Page
    And User clicks on RequireJointAccount field
    And User clicks on JointCountry field
    And User Select Country "<Country>" from Country DropDown for Joint Registration

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Email1|Country|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |      john.smith@gmail.com|United State of America|Accountant|

  @PhaseAll_CD @PhaseAll @APUI34_TC15_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint13_CD
  Scenario Outline: APUI34_TC15_Aff_CD To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>"
    And User click on Continue Button on Register a customer.
    Then System will navigate to the Address details Page
    And User clicks on Country field
    Then User Should be able to Verify All values for Country DropDown
    Then User should view the Organization information After Login in header and fotter sections

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |Accountant               |
