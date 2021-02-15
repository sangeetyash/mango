@Affiliate_InSprint_RegisterACustomer_CD @APUI_24_CD @CD
Feature: Affiliate V2.0 Register a Customer feature for APUI24-CD

  @PhaseAll_CD @PhaseAll @APUI24_TC1_Aff_CD @Affiliates_Sprint13_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline: APUI24_TC1_Aff_CD To validate System should able to Perform Single Registration
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>"
    And User click on Continue Button on Register a customer.
    Then System will navigate to the Address details Page
    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |Accountant               |

  @PhaseAll_CD @PhaseAll @APUI24_TC2_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline: APUI24_TC2_Aff_CD To validate User should be able to view the country drop down for Joint Registration
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

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Email1|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |      ABC|Banker                |


  @PhaseAll_CD @PhaseAll @APUI24_TC3_Aff_CD @Affiliates_Sprint13_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline: APUI24_TC3_Aff_CD To validate System should able to view Drop Down Options properly for Country
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
    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear    |    ABC             | +91          | 9000004587    |Banker    |

  @PhaseAll_CD @PhaseAll @APUI24_TC4_Aff_CD @Affiliates_Sprint13_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline: APUI24_TC4_Aff_CD To validate System should able to view Drop Down Options properly for Country
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    #And User clicks on MobilePhone_CountryCode field
    #Then User Should be able to Verify All values for MobilePhone_CountryCode DropDown
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI24_TC5_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline: APUI24_TC5_Aff_CD To validate System should able to view Drop Down Options properly for Country Code for joint Signups
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

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Email1|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +351          | 9000004587    |      ABC|Accountant|


  @PhaseAll_CD @PhaseAll @APUI24_TC6_Aff_CD @Affiliates_Sprint13_CD @Acceptence_2_CD @QASprint13_CD
  Scenario Outline: APUI24_TC6_Aff_CD To validate System should able to view Drop Down Options properly for Country Code for joint Signups
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
    Then User Should be able to Verify All values for JointCountry DropDown
    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |Accountant               |

  @PhaseAll_CD @PhaseAll @APUI24_TC7_Aff_CD @Affiliates_Sprint13_CD @Acceptence_3_CD @QASprint13_CD
  Scenario Outline: APUI24_TC7_Aff_CD  To validate error to be Observed when User does not enter any value in the single registration options
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User just click on FirstName "<FirstName>" LastName "<LastName>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" but does not select any value
    Then User tries to Clicks on Continue Button but it is Disabled-Grayed Out

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |      Email         | Country_Code | Mobile_Number |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |       |     | |           |    |


  @PhaseAll_CD @PhaseAll @APUI24_TC8_Aff_CD @Affiliates_Sprint13_CD @Acceptence_3_CD @QASprint13_CD
  Scenario Outline: APUI24_TC8_Aff_CD  To validate error to be Observed when User does not enter any value in the joint registration options
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User just click on FirstName "<FirstName>" LastName "<LastName>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" but does not select any value
    Then User tries to Clicks on Continue Button but it is Disabled-Grayed Out
    And System will Give error message as Please Enter Valid Inputs for All

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |      Email         | Country_Code | Mobile_Number |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |       |     | |           |    |

  @PhaseAll_CD @PhaseAll @APUI24_TC9_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint13_CD
  Scenario Outline: APUI24_TC9_Aff_CD To validate max limit for FirstName and Last Name for Single Registration
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    Then User will be navigated to the Register a customer Page
    And User enters more than required characters in RegCustFirstName field
    And User enters more than required characters in RegCustLastName field
    Then System should display error message for Not Entering Required Personal Customer details
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI24_TC10_Aff_CD @Affiliates_Sprint13_CD @Acceptence_3_CD @QASprint13_CD
  Scenario Outline: APUI24_TC10_Aff_CD To validate min limit for mobile number
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>"
    And System will Give error message as Please Enter Valid Inputs for Mobile

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004   |


  @PhaseAll_CD @PhaseAll @APUI24_TC11_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint13_CD
  Scenario Outline: APUI24_TC11_Aff_CD To validate max limit for mobile number
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>"
    And System will Give error message as Please Enter Valid Inputs for Mobile

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 900000409867546   |


  @PhaseAll_CD @PhaseAll @APUI24_TC12_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint13_CD
  Scenario Outline: APUI24_TC12_Aff_CD  To validate max limit for FirstName and Last Name for Joint Registration
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
    And User click on the JointFirstName enter the name more than 40 characters
    And User click on the JointLastName enter the name more than 40 characters
    Then System will Give error message as Please Enter Valid Inputs for FirstAndLastName
    Then User tries to Clicks on Continue Button but it is Disabled-Grayed Out
    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |Accountant               |

  @PhaseAll_CD @PhaseAll @APUI24_TC13_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint13_CD
  Scenario Outline: APUI24_TC13_Aff_CD To validate min Length validation for mobile number for Joint Registration
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
    And User click on the JointMobileNumber enter the name Less Than 8 characters
    Then System will Give error message as Please Enter Valid Inputs for Mobile
    Then User tries to Clicks on Continue Button but it is Disabled-Grayed Out
    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |Accountant               |


  @PhaseAll_CD @PhaseAll @APUI24_TC14_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint13_CD
  Scenario Outline: APUI24_TC14_Aff_CD  To validate max Length validation for mobile number for Joint Registration
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
    And User click on the JointMobileNumber enter the name Less than 16 characters
    Then System will Give error message as Please Enter Valid Inputs for Mobile
    Then User tries to Clicks on Continue Button but it is Disabled-Grayed Out
    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |Accountant               |

  @PhaseAll_CD @PhaseAll @APUI24_TC15_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint13_CD
  Scenario Outline: APUI24_TC15_Aff_CD To validate 1st part of Email Should give error for Single RegistrationTo validate 1st part of Email Should give error for Single Registration
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>"
    And User click on the Email enter the name more than 64 characters
    Then System will Give error message as Please Enter Valid Inputs for Email
    Then User tries to Clicks on Continue Button but it is Disabled-Grayed Out
    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     | | +91          | 9000004587    |

  @PhaseAll_CD @PhaseAll @APUI24_TC16_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint13_CD
  Scenario Outline: APUI24_TC16_Aff_CD To validate 2nt part of Email Should give error for Single Registration with minimum length
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>"
    Then System will Give error message as Please Enter Valid Inputs for Email
    Then User tries to Clicks on Continue Button but it is Disabled-Grayed Out
    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |jhonlobo@g.com | +91          | 9000004587    |Accountant    |

  @PhaseAll_CD @PhaseAll @APUI24_TC17_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint13_CD
  Scenario Outline: APUI24_TC17_Aff_CD To validate 2nt part of Email Should give error for Registration with maximum length
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User click on the Email enter the name more than 160 characters
    Then System will Give error message as Please Enter Valid Inputs for Email
    Then User tries to Clicks on Continue Button but it is Disabled-Grayed Out

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     | | +91          | 9000004587    |

  @PhaseAll_CD @PhaseAll @APUI24_TC18_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint13_CD
  Scenario Outline: APUI24_TC18_Aff_CD To validate 3rd part of Email Should give error for  Registration with maximum length
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    And User click on the Email enter the name more than 24 characters
    Then System will Give error message as Please Enter Valid Inputs for Email
    Then User tries to Clicks on Continue Button but it is Disabled-Grayed Out

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |jhonlobo@gmail.com | +91          | 9000004587    |

  @PhaseAll_CD @PhaseAll @APUI24_TC19_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint13_CD
  Scenario Outline: APUI24_TC19_Aff_CD To validate 1st part of Email Should give error for Joint Registration
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
    And User click on the JointEmail enter the name more than 64 characters
    Then System will Give error message as Please Enter Valid Inputs for Email
    Then User tries to Clicks on Continue Button but it is Disabled-Grayed Out

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |Accountant               |



  @PhaseAll_CD @PhaseAll @APUI24_TC20_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint13_CD
  Scenario Outline: APUI24_TC20_Aff_CD To validate 2nt part of Email Should give error for Joint Registration with minimum length
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
    And User click on the JointEmail enter the name Only one characters
    Then System will Give error message as Please Enter Valid Inputs for Email
    Then User tries to Clicks on Continue Button but it is Disabled-Grayed Out
    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |Accountant               |

  @PhaseAll_CD @PhaseAll @APUI24_TC21_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint13_CD
  Scenario Outline: APUI24_TC21_Aff_CD To validate 2nt part of Email Should give error for Joint Registration with maximum length
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
    And User click on the JointEmail enter the name more than 160 characters
    Then System will Give error message as Please Enter Valid Inputs for Email
    Then User tries to Clicks on Continue Button but it is Disabled-Grayed Out

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |Accountant               |

  @PhaseAll_CD @PhaseAll @APUI24_TC22_Aff_CD @Affiliates_Sprint13_CD @Acceptence_4_CD @QASprint13_CD
  Scenario Outline: APUI24_TC22_Aff_CD To validate 3rd part of Email Should give error for Joint Registration with maximum length
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
    And User click on the JointEmail enter the name more than 24 characters
    Then System will Give error message as Please Enter Valid Inputs for Email
    Then User tries to Clicks on Continue Button but it is Disabled-Grayed Out

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC | +91          | 9000004587    |Accountant               |

  @PhaseAll_CD @PhaseAll @APUI24_TC23_Aff_CD @Affiliates_Sprint13_CD @Acceptence_5_CD @QASprint13_CD
  Scenario Outline: APUI23_TC1_Aff_CD To Verify the User Should be able to view the Organzation details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User Clicks on Register a Customer
    Then User will be navigated to the Register a customer Page
    Then User should view the Organization information After Login in header and fotter sections

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |jhonlobo@gmail.com | +91          | 9000004587    |


