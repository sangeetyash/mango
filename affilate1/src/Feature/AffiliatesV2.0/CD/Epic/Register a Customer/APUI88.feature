@Affiliate_InSprint_RegisterACustomer_CD @APUI_88_CD @CD
Feature: Affiliate V2.0 Register a Customer feature for APUI88_CD


  @PhaseAll_CD @PhaseAll @APUI88_TC1_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @QASprint14_CD
  Scenario Outline:APUI88_TC1_Aff_CD To Verify that the Registration details to be Observed onto confiration Screen for Single Registration
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
    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName | DateOfBirth |      Email        | Country_Code | Mobile_Number |Country       |                          Address                         |Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |    ABC            | +91          | 9000004587    |United Kingdom| A, Selborne Mansions, Bradford, West Yorkshire, BD9 4NP  |Accountant|

  @PhaseAll_CD @PhaseAll @APUI88_TC2_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @QASprint14_CD
  Scenario Outline:APUI88_TC2_Aff_CD To Verify that the Registration details to be Observed onto confiration Screen for Joint Registration
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
    And User clicks on RequireJointAccount field
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email1>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>" for JointAccount
    And User Select Country "<Country>" from Country DropDown for Joint Registration
    And User should be able to view address details "<Address>" and options in dropdown for Joint
    Then User selects DateOfBirth "<Date>" for Joint Registration
    And User notes Joint selected DateOfBirth for Register a customer
    And User click on Continue Button on Register a customer.
    Then User is navigated on Confirmation Page for Register a customer
    #Then User validates the Single Registration details FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Country "<Country>" address details "<Address>" on Confirmation page
    #Then User validates the Joint Registration details FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email1>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Country "<Country>" address details "<Address>" on Confirmation page
    Examples:

      | browser | urlName        | UserName            | password    | FirstName | LastName | DateOfBirth |      Email        | Country_Code | Mobile_Number |Country       |                          Address                         |Email1|Date|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |ABC                | +91          | 9000004587    |United Kingdom| A, Selborne Mansions, Bradford, West Yorkshire, BD9 4NP  |ABC   |5   |Accountant|

  @PhaseAll_CD @PhaseAll @APUI88_TC3_Aff_CD @Affiliates_Sprint14_CD @Acceptence_2_CD @QASprint14_CD
  Scenario Outline:APUI88_TC3_Aff_CD To Verify user should be able to click on the confirmation Checkbox on UI for Single Registration
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
    And User is navigated on Confirmation Page for Register a customer
    ##And User validates the Single Registration details FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Country "<Country>" address details "<Address>" on Confirmation page
    Then User clicks on Partner Confirmation checkbox field
    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName | DateOfBirth |      Email        | Country_Code | Mobile_Number |Country       |                          Address                         |Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |     ABC           | +91          | 9000004587    |United Kingdom| A, Selborne Mansions, Bradford, West Yorkshire, BD9 4NP  |Accountant|


  @PhaseAll_CD @PhaseAll @APUI88_TC4_Aff_CD @Affiliates_Sprint14_CD @Acceptence_2_CD @QASprint14_CD
  Scenario Outline:APUI88_TC4_Aff_CD To Verify user should be able to click on the confirmation Checkbox on UI for Joint Registration
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
    And User clicks on RequireJointAccount field
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email1>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>" for JointAccount
    And User Select Country "<Country>" from Country DropDown for Joint Registration
    And User should be able to view address details "<Address>" and options in dropdown for Joint
    Then User selects DateOfBirth "<Date>" for Joint Registration
    And User notes Joint selected DateOfBirth for Register a customer
    And User click on Continue Button on Register a customer.
    And User is navigated on Confirmation Page for Register a customer
    #And User validates the Single Registration details FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Country "<Country>" address details "<Address>" on Confirmation page
    #And User validates the Joint Registration details FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email1>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Country "<Country>" address details "<Address>" on Confirmation page
    Then User clicks on Partner Confirmation checkbox field
    Examples:

      | browser | urlName        | UserName            | password    | FirstName | LastName | DateOfBirth |      Email        | Country_Code | Mobile_Number |Country       |                          Address                         |Email1|Date|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |      ABC          | +91          | 9000004587    |United Kingdom| A, Selborne Mansions, Bradford, West Yorkshire, BD9 4NP  |ABC   |5   |Accountant|

  @PhaseAll_CD @PhaseAll @APUI88_TC5_Aff_CD @Affiliates_Sprint14_CD @Acceptence_3_CD @QASprint14_CD
  Scenario Outline:APUI88_TC5_Aff_CD To Verify user should not be allowed to move further until checkbox is been selected for Single registration
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
    And User is navigated on Confirmation Page for Register a customer
    #And User validates the Single Registration details FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Country "<Country>" address details "<Address>" on Confirmation page
    Then User tries to Clicks on Confirm Button but it is Disabled-Grayed Out for Register a customer
    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName | DateOfBirth |      Email        | Country_Code | Mobile_Number |Country       |                          Address                         |Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |   ABC             | +91          | 9000004587    |United Kingdom| A, Selborne Mansions, Bradford, West Yorkshire, BD9 4NP  |Accountant|


  @PhaseAll_CD @PhaseAll @APUI88_TC6_Aff_CD @Affiliates_Sprint14_CD @Acceptence_3_CD @QASprint14_CD
  Scenario Outline:APUI88_TC6_Aff_CD To Verify user should not be allowed to move further until checkbox is been selected for Joint registration
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
    And User clicks on RequireJointAccount field
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email1>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>" for JointAccount
    And User Select Country "<Country>" from Country DropDown for Joint Registration
    And User should be able to view address details "<Address>" and options in dropdown for Joint
    Then User selects DateOfBirth "<Date>" for Joint Registration
    And User notes Joint selected DateOfBirth for Register a customer
    And User click on Continue Button on Register a customer.
    Then User is navigated on Confirmation Page for Register a customer
    #Then User validates the Single Registration details FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Country "<Country>" address details "<Address>" on Confirmation page
    #Then User validates the Joint Registration details FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Country "<Country>" address details "<Address>" on Confirmation page
    Then User tries to Clicks on Confirm Button but it is Disabled-Grayed Out for Register a customer
    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName | DateOfBirth |      Email        | Country_Code | Mobile_Number |Country       |                          Address                         |Date|Email1|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |   ABC             | +91          | 9000004587    |United Kingdom| A, Selborne Mansions, Bradford, West Yorkshire, BD9 4NP  |5   |ABC   |Accountant|

  #As Disscussed the Acceptence 4 will not be applicable
  @PhaseAll_CD @PhaseAll @APUI88_TC7_Aff_CD @Affiliates_Sprint14_CD @Acceptence_5_CD @QASprint14_CD
  Scenario Outline:APUI88_TC7_Aff_CD To Verify user should be allowed to update the Personal fields for Single registration using Back button
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
    And User is navigated on Confirmation Page for Register a customer
    #And User validates the Single Registration details FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Country "<Country>" address details "<Address>" on Confirmation page
    Then User Clicks on Back Button
    And User Clicks on Back Button
    And User will be navigated to the Personal details page of Register a customer
    And User Re-Enters ALL Personal & Contact Details for Registration UpdatedFirstName "<UpdatedFirstName>" UpdatedLastName "<UpdatedLastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" UpdatedCountryCode_Mobile "<UpdatedCountry_Code>" UpdatedMobileNumber "<UpdatedMobile_Number>"
    And User notes Single selected DateOfBirth for Register a customer
    And User click on Continue Button on Register a customer.
    Then System will navigate to the Address details Page
    And User click on Continue Button on Register a customer.
    And User is navigated on Confirmation Page for Register a customer
    #Then User validates the Updated Single Registration details UpdatedFirstName "<UpdatedFirstName>" UpdatedLastName "<UpdatedLastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" UpdatedCountryCode_Mobile "<UpdatedCountry_Code>" UpdatedMobileNumber "<UpdatedMobile_Number>" Country "<Country>" address details "<Address>" on Confirmation page
    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName | DateOfBirth |      Email        | Country_Code | Mobile_Number |Country       |                          Address                         |UpdatedFirstName|UpdatedLastName|UpdatedCountry_Code|UpdatedMobile_Number|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |    ABC            | +91          | 9000004587    |United Kingdom| A, Selborne Mansions, Bradford, West Yorkshire, BD9 4NP  |Tio             |Loy            |+84                |5874569855          |Accountant|

  @PhaseAll_CD @PhaseAll @APUI88_TC8_Aff_CD @Affiliates_Sprint14_CD @Acceptence_5_CD @QASprint14_CD
  Scenario Outline:APUI88_TC8_Aff_CD To Verify user should be allowed to update the address details for Single registration using Back button
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
    And User is navigated on Confirmation Page for Register a customer
    #And User validates the Single Registration details FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Country "<Country>" address details "<Address>" on Confirmation page
    And User clicks on Partner Confirmation checkbox field
    Then User Clicks on Back Button
    Then System will navigate to the Address details Page
    And User Updates all the Address details "<UpdatedCountry>" "<UpdatedAddress>" for Single Registration
    And User click on Continue Button on Register a customer.
    And User is navigated on Confirmation Page for Register a customer
    #Then User Validates Updated Address details "<UpdatedCountry>" "<UpdatedAddress>" for Single Registration
    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName | DateOfBirth |      Email        | Country_Code | Mobile_Number |Country       |                          Address                         |UpdatedCountry|UpdatedAddress |Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |    ABC            | +91          | 9000004587    |France        | A, Selborne Mansions, Bradford, West Yorkshire, BD9 4NP  |India         |Tamba Kunta Road Mumbai, Maharashtra, 400002            |Accountant|


  @PhaseAll_CD @PhaseAll @APUI88_TC9_Aff_CD @Affiliates_Sprint14_CD @Acceptence_5_CD @QASprint14_CD
  Scenario Outline:APUI88_TC9_Aff_CD To Verify user should be allowed to update the Personal fields for joint registration using Back button
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
    And User clicks on RequireJointAccount field
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>" for JointAccount
    And User Select Country "<Country>" from Country DropDown for Joint Registration
    And User should be able to view address details "<Address>" and options in dropdown for Joint
    Then User selects DateOfBirth "<Date>" for Joint Registration
    And User notes Joint selected DateOfBirth for Register a customer
    And User click on Continue Button on Register a customer.
    Then User is navigated on Confirmation Page for Register a customer
    #Then User validates the Single Registration details FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Country "<Country>" address details "<Address>" on Confirmation page
    #Then User validates the Joint Registration details FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Country "<Country>" address details "<Address>" on Confirmation page
    And User clicks on Partner Confirmation checkbox field
    Then User Clicks on Back Button
    Then User Clicks on Back Button
    And User will be navigated to the Personal details page of Register a customer
    And User Re-Enters ALL Personal & Contact Details for Registration UpdatedFirstName "<UpdatedFirstName>" UpdatedLastName "<UpdatedLastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<UpdatedEmail>" UpdatedCountryCode_Mobile "<UpdatedCountry_Code>" UpdatedMobileNumber "<UpdatedMobile_Number>"
    And User notes Single selected DateOfBirth for Register a customer
    And User click on Continue Button on Register a customer.
    Then System will navigate to the Address details Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<UpdatedJointFirstName>" LastName "<UpdatedJointLastName>" DateOfBirth "<Date>" EmailAddress "<UpdatedJointEmail1>" CountryCode_Mobile "<UpdatedJointCountry_Code>" MobileNumber "<UpdatedJointMobile_Number>" Occupation "<Occupation>" for JointAccount
    And User Select Country "<UpdatedJointCountry>" from Country DropDown for Joint Registration
    And User should be able to view address details "<UpdatedJointAddress>" and options in dropdown for Joint
    Then User selects DateOfBirth "<UpdatedDate>" for Joint Registration
    And User notes Joint selected DateOfBirth for Register a customer
    And User click on Continue Button on Register a customer.
    And User is navigated on Confirmation Page for Register a customer
    #Then User validates the Joint Registration details FirstName "<UpdatedJointFirstName>" LastName "<UpdatedJointLastName>" DateOfBirth "<UpdatedDate>" EmailAddress "<UpdatedJointEmail1>" CountryCode_Mobile "<UpdatedJointCountry_Code>" MobileNumber "<UpdatedJointMobile_Number>" Country "<UpdatedJointCountry>" address details "<UpdatedJointAddress>" on Confirmation page
    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName | DateOfBirth |      Email        | Country_Code | Mobile_Number |Country       |                          Address                       |Date|UpdatedDate|UpdatedFirstName|UpdatedLastName|UpdatedEmail|UpdatedCountry_Code|UpdatedMobile_Number|UpdatedJointFirstName|UpdatedJointLastName|UpdatedJointEmail1|UpdatedJointCountry_Code|UpdatedJointMobile_Number|UpdatedJointCountry|UpdatedJointAddress|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |   ABC             | +91          | 9000004587    |United Kingdom|A, Selborne Mansions, Bradford, West Yorkshire, BD9 4NP |5   |6          |Jolly           |Tabo           |   ABC         |+34                |516165165           |Lion                 |Lalu                |                  |+34                     |62619849894              |India              |Tamba Kunta Road, Mumbai, Maharashtra, 400002|Accountant|

  @PhaseAll_CD @PhaseAll @APUI88_TC10_Aff_CD @Affiliates_Sprint14_CD @Acceptence_5_CD @QASprint14_CD
  Scenario Outline:APUI88_TC10_Aff_CD To Verify user should be allowed to update the address fields for joint registration using Back button
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
    And User clicks on RequireJointAccount field
    And User Enters ALL Personal & Contact Details for Registration FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Occupation "<Occupation>" for JointAccount
    And User Select Country "<Country>" from Country DropDown for Joint Registration
    And User should be able to view address details "<Address>" and options in dropdown for Joint
    Then User selects DateOfBirth "<Date>" for Joint Registration
    And User notes Joint selected DateOfBirth for Register a customer
    And User click on Continue Button on Register a customer.
    Then User is navigated on Confirmation Page for Register a customer
    #Then User validates the Single Registration details FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Country "<Country>" address details "<Address>" on Confirmation page
    #Then User validates the Joint Registration details FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Country "<Country>" address details "<Address>" on Confirmation page
    And User clicks on Partner Confirmation checkbox field
    Then User Clicks on Back Button
    Then User Clicks on Back Button
    And User will be navigated to the Personal details page of Register a customer
    And User Re-Enters ALL Personal & Contact Details for Registration UpdatedFirstName "<UpdatedFirstName>" UpdatedLastName "<UpdatedLastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<UpdatedEmail>" UpdatedCountryCode_Mobile "<UpdatedCountry_Code>" UpdatedMobileNumber "<UpdatedMobile_Number>"
    And User notes Single selected DateOfBirth for Register a customer
    And User click on Continue Button on Register a customer.
    Then System will navigate to the Address details Page
    And User Enters ALL Personal & Contact Details for Registration FirstName "<UpdatedJointFirstName>" LastName "<UpdatedJointLastName>" DateOfBirth "<Date>" EmailAddress "<UpdatedJointEmail1>" CountryCode_Mobile "<UpdatedJointCountry_Code>" MobileNumber "<UpdatedJointMobile_Number>" Occupation "<Occupation>" for JointAccount
    And User Select Country "<UpdatedJointCountry>" from Country DropDown for Joint Registration
    And User should be able to view address details "<UpdatedJointAddress>" and options in dropdown for Joint
    Then User selects DateOfBirth "<UpdatedDate>" for Joint Registration
    And User notes Joint selected DateOfBirth for Register a customer
    And User click on Continue Button on Register a customer.
    And User is navigated on Confirmation Page for Register a customer
    #Then User validates the Joint Registration details FirstName "<UpdatedJointFirstName>" LastName "<UpdatedJointLastName>" DateOfBirth "<UpdatedDate>" EmailAddress "<UpdatedJointEmail1>" CountryCode_Mobile "<UpdatedJointCountry_Code>" MobileNumber "<UpdatedJointMobile_Number>" Country "<UpdatedJointCountry>" address details "<UpdatedJointAddress>" on Confirmation page
    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName | DateOfBirth |      Email        | Country_Code | Mobile_Number |Country       |                          Address                       |Date|UpdatedDate|UpdatedFirstName|UpdatedLastName|UpdatedEmail|UpdatedCountry_Code|UpdatedMobile_Number|UpdatedJointFirstName|UpdatedJointLastName|UpdatedJointEmail1|UpdatedJointCountry_Code|UpdatedJointMobile_Number|UpdatedJointCountry|UpdatedJointAddress|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |   ABC             | +91          | 9000004587    |United Kingdom|A, Selborne Mansions, Bradford, West Yorkshire, BD9 4NP |5   |6          |Jolly           |Tabo           |  ABC          |+34                |516165165           |Lion                 |Lalu                |                  |+34                     |62619849894              |India              |Tamba Kunta Road, Mumbai, Maharashtra, 400002|Accountant|


  @PhaseAll_CD @PhaseAll @APUI88_TC13_Aff_CD @Affiliates_Sprint14_CD @Acceptence_7_CD @QASprint14_CD
  Scenario Outline:APUI88_TC13_Aff_CD To Verify the User Should be able to view the Organzation details
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
    #And User validates the Single Registration details FirstName "<FirstName>" LastName "<LastName>" DateOfBirth "<DateOfBirth>" EmailAddress "<Email>" CountryCode_Mobile "<Country_Code>" MobileNumber "<Mobile_Number>" Country "<Country>" address details "<Address>" on Confirmation page
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName | DateOfBirth |      Email        | Country_Code | Mobile_Number |Country       |                          Address                         |Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |    ABC            | +91          | 9000004587    |United Kingdom| A, Selborne Mansions, Bradford, West Yorkshire, BD9 4NP  |Accountant|
