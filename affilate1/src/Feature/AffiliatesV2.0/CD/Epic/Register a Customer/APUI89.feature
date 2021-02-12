@Affiliate_InSprint_RegisterACustomer_CD @APUI_89_CD @CD
Feature: Affiliate V2.0 Register a Customer feature for APUI89_CD

  #All Mandatory values are Unique #New CR Changes APUI-977
  @Phase_CD @Phase @APUI89_TC6_Aff_CD @Affiliates_Sprint14_CD @Acceptence_6_CD @QASprint14_CD @Smoke
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
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |    ABC           | +91          | 8098094332  |United Kingdom| A, Selborne Mansions, Bradford, West Yorkshire, BD9 4NP  |Accountant   |

  @Phase_CD @Phase @APUI89_TC7_Aff_CD @Affiliates_Sprint14_CD @Acceptence_3_CD @QASprint14_CD
  Scenario Outline:APUI89_TC7_Aff_CD To Verify that the User Should be able to view the completed percentage on UI
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
      | Chrome  | AffiliateCDURL | AffiliateCDUserName_WDD | AffPassword |  Abc    |  Abc    | MaxYear     |  ABC                  | +91          | 9000004587    |United Kingdom| A, Selborne Mansions, Bradford, West Yorkshire, BD9 4NP  |Accountant|

  @Phase_CD @Phase @APUI89_TC8_Aff_CD @Affiliates_Sprint14_CD @Acceptence_4_CD @QASprint14_CD
  Scenario Outline:APUI89_TC8_Aff_CD To Verify that the User Should be able to get a response in less than 90 seconds
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
    And User clicks on Skip the step on Identity documents page
    Then User should be able to get success response in less than 90 seconds
    Then User should be able to view the Successful Registration Page
    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName | DateOfBirth |      Email        | Country_Code | Mobile_Number |Country       |                          Address                         |Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |  ABC                 | +91          | 9000004587    |United Kingdom| A, Selborne Mansions, Bradford, West Yorkshire, BD9 4NP  |Accountant|
