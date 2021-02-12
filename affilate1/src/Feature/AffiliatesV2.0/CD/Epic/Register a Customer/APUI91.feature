@Affiliate_InSprint_RegisterACustomer_CD @APUI_91_CD @CD
Feature: Affiliate V2.0 Register a Customer feature for APUI91-CD

  @Phase_CD @Phase @APUI91_TC1_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline: APUI91_TC1_Aff_CD To Verify that the System asks for POI Documents while performing Registration
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
    And User click on Continue Button on Register a customer.
    And User click on PartnerConfirm on Register a customer.
    And User click on Confirmation on Register a customer.
    Then User will land on Document Upload Page
    Then User will be able to see the POI Document upload frame

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Email1|Country|Address|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |jhonlobo12@gmail.com | +91          | 9000004587    |      john.smith@gmail.com|United Kingdom|a|Accountant|

  @Phase_CD @Phase @APUI91_TC2_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline: APUI91_TC2_Aff_CD To Verify that the System asks for POA Documents while performing Registration
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
    And User click on Continue Button on Register a customer.
    And User click on PartnerConfirm on Register a customer.
    And User click on Confirmation on Register a customer.
    Then User will land on Document Upload Page
    Then User will be able to see the POA Document upload frame

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Email1|Country|Address|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |jhonlobo12@gmail.com | +91          | 9000004587    |      john.smith@gmail.com|United Kingdom|a|Accountant|

  @Phase_CD @Phase @APUI91_TC3_Aff_CD @Affiliates_Sprint14_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline: APUI91_TC3_Aff_CD To Verify that the System asks for POI+POA Documents while performing Registration
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
    And User click on Continue Button on Register a customer.
    And User click on PartnerConfirm on Register a customer.
    And User click on Confirmation on Register a customer.
    Then User will land on Document Upload Page
    Then User will be able to see the POIplusPOA Document upload frame

    Examples:
      | browser | urlName        | UserName            | password    | FirstName | LastName |DateOfBirth |      Email         | Country_Code | Mobile_Number |Email1|Country|Address|Occupation|
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  Jhon     | Lobo     | MaxYear     |jhonlobo12@gmail.com | +91          | 9000004587    |      john.smith@gmail.com|United Kingdom|a|Accountant|


