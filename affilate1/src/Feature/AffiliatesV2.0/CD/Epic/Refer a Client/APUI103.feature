@Affiliate_InSprint_ReferAClient_CD @APUI_103_CD @CD
Feature: Affiliate V2.0 Refer a client feature for APUI103_CD

  @PhaseAll_CD @PhaseAll @APUI103_TC1_Aff_CD @Affiliates_Sprint3_CD @Acceptence_1_CD
  Scenario Outline:TC1_APUI103_AFF To Verify that user should be able to view Transaction details to be displayed
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    And User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters All Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    Examples:
      |browser |urlName |UserName |password|Salutation|FirstName|LastName|Email|Country_Code|Mobile_Number|LandLineCode|LandLine|BestTimeToCall|
      |Chrome |AffiliateCDURL |AffiliateCDUserName |AffPassword|Mr|Andrew|Kumar|Andrewkaundal@gmail.com|+91|8805116745|+91|2424004312|Anytime|


  @PhaseAll_CD @PhaseAll @APUI103_TC2_Aff_CD @Affiliates_Sprint3_CD @Acceptence_1_CD
  Scenario Outline:TC2_APUI103_AFF Verify that user should be able to view Transaction details to be displayed
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    And User Selects Corporate option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" TradingName "<TradingName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters All Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    Examples:
      |browser |urlName |UserName |password|Salutation|FirstName|LastName|CompanyName|TradingName|Email|Country_Code|Mobile_Number|LandLineCode|LandLine|BestTimeToCall|
      |Chrome |AffiliateCDURL |AffiliateCDUserName |AffPassword|Mr|Andrew|Kumar|BNTSoft|Trade|Andrewkaundal@gmail.com|+91|8805116745|+91|2424004312|Anytime|


  @PhaseAll_CD @PhaseAll @APUI103_TC3_Aff_CD @Affiliates_Sprint3_CD @Acceptence_2_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC3_APUI103_AFF Verify that user should be able to view Transaction details to be displayed
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    And User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters All Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    Then User should be able to display all the fields with dropdown
    Examples:
      |browser |urlName |UserName |password|Salutation|FirstName|LastName|Email|Country_Code|Mobile_Number|LandLineCode|LandLine|BestTimeToCall|
      |Chrome |AffiliateCDURL |AffiliateCDUserName |AffPassword|Mr|Andrew|Kumar|Andrewkaundal@gmail.com|+91|8805116745|+91|2424004312|Anytime|


  @PhaseAll_CD @PhaseAll @APUI103_TC4_Aff_CD @Affiliates_Sprint3_CD @Acceptence_2_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
  Scenario Outline:TC4_APUI103_AFF Verify that user should be able to view Transaction details to be displayed
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    And User Selects Corporate option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" TradingName "<TradingName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters All Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    Then User should be able to display all the fields with dropdown
    Examples:
      |browser |urlName |UserName |password|Salutation|FirstName|LastName|CompanyName|TradingName|Email|Country_Code|Mobile_Number|LandLineCode|LandLine|BestTimeToCall|
      |Chrome |AffiliateCDURL |AffiliateCDUserName |AffPassword|Mr|Andrew|Kumar|BNTSoft|Trade|Andrewkaundal@gmail.com|+91|8805116745|+91|2424004312|Anytime|


  @PhaseAll_CD @PhaseAll @APUI103_TC5_Aff_CD @Affiliates_Sprint3_CD @Acceptence_3_CD
 Scenario Outline:TC5_APUI103_AFF Verify that user should not be allowed to move unless values are been selected
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    And User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters All Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And user try to click on continue without selecting two fields and keep two as blank ESTValue"<EST_Value>" Currency Has"<CurrencyHas>"
    Then User should not be allowed to Click on Continue Button
    Examples:
      |browser |urlName |UserName |password|Salutation|FirstName|LastName|Email|Country_Code|Mobile_Number|LandLineCode|LandLine|BestTimeToCall|EST_Value|CurrencyHas|
      |Chrome |AffiliateCDURL |AffiliateCDUserName |AffPassword|Mr|Andrew|Kumar|Andrewkaundal@gmail.com|+91|8805116745|+91|2424004312|Anytime|2,000  |Pound Sterling|

  @PhaseAll_CD @PhaseAll @APUI103_TC6_Aff_CD @Affiliates_Sprint3_CD @Acceptence_3_CD
 Scenario Outline:TC6_APUI103_AFF Verify that user should not be allowed to move unless values are been selected
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    And User Selects Corporate option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" CompanyName "<CompanyName>" TradingName "<TradingName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters All Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And user try to click on continue without selecting two fields and keep two as blank ESTValue"<EST_Value>" Currency Has"<CurrencyHas>"
    Then User should not be allowed to Click on Continue Button
    Examples:
      |browser |urlName |UserName |password|Salutation|FirstName|LastName|CompanyName|TradingName|Email|Country_Code|Mobile_Number|LandLineCode|LandLine|BestTimeToCall|EST_Value|CurrencyHas|
      |Chrome |AffiliateCDURL |AffiliateCDUserName |AffPassword|Mr|Andrew|Kumar|BNTSoft|Trade|Andrewkaundal@gmail.com|+91|8805116745|+91|2424004312|Anytime|2,000  |Pound Sterling|


  @PhaseAll_CD @PhaseAll @APUI103_TC7_Aff_CD @Affiliates_Sprint3_CD @Acceptence_4_CD @Affiliates_Regression_Suite_CD @Affiliates_RegressionRun
 Scenario Outline:TC7_APUI103_AFF Verify that user should not be allowed to move unless values are been selected
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Refer a client on dashboard.
    And User Selects Individual option
    And User Enters Salutation "<Salutation>" FirstName "<FirstName>" LastName "<LastName>" and Click on Continue
    Then System will navigate to the Contact details Page
    And User Enters All Contact Details Email "<Email>" MobileCountryCode "<Country_Code>" MobileNumber "<Mobile_Number>" LandlineCountryCode"<LandLineCode>" landlineNumber "<LandLine>" and "<BestTimeToCall>" and Click on Continue
    Then System will navigate to the Transaction details Page
    And User should view the Organization information After Login in header and fotter sections
    Examples:
      |browser |urlName |UserName |password|Salutation|FirstName|LastName|Email|Country_Code|Mobile_Number|LandLineCode|LandLine|BestTimeToCall|
      |Chrome |AffiliateCDURL |AffiliateCDUserName |AffPassword|Mr|Andrew|Kumar|Andrewkaundal@gmail.com|+91|8805116745|+91|2424004312|Anytime|

    