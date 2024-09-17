@Affiliate_InSprint_ResourcesPage_CD @APUI_328_CD @CD
Feature: Affiliate V2.0 Resources Page elements for APUI328_CD

  #Tester needs to Test along with the Backend tester or the Salesforce team
  @PhaseAll_CD @PhaseAll @APUI328_TC1_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI328_TC1_Aff_CD TC1_APUI328_AFF TC1_APUI328_AFF To Verify the filter options to be present for Resources Page
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

    #Tester needs to Confirm the Values of DropDown with Salesforce Team Provided List
    #Tester needs to Test along with the Backend tester or the Salesforce team
  @PhaseAll_CD @PhaseAll @APUI328_TC2_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI328_TC2_Aff_CD TC2_APUI328_AFF TC2_APUI328_AFF TC2_APUI328_AFF To Verify the dropdown values for Catogries
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on Categories field
    Then User Should be able to Verify All values for Categories DropDown

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

    #Tester needs to Confirm the Values of DropDown with Salesforce Team Provided List
    #Tester needs to Test along with the Backend tester or the Salesforce team
  @PhaseAll_CD @PhaseAll @APUI328_TC3_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI328_TC3_Aff_CD TC3_APUI328_AFF TC3_APUI328_AFF To Verify the dropdown values for Industries
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on Industry field
    Then User Should be able to Verify All values for Industry DropDown

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

     #Tester needs to Confirm the Values of DropDown with Salesforce Team Provided List
    #Tester needs to Test along with the Backend tester or the Salesforce team
  @PhaseAll_CD @PhaseAll @APUI328_TC4_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI328_TC4_Aff_CD TC4_APUI328_AFF TC4_APUI328_AFF To Verify the dropdown values for Client Types
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on ClientType field
    Then User Should be able to Verify All values for ClientType DropDown

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

     #Tester needs to Confirm the Values of DropDown with Salesforce Team Provided List
    #Tester needs to Test along with the Backend tester or the Salesforce team
  @PhaseAll_CD @PhaseAll @APUI328_TC5_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI328_TC5_Aff_CD TC5_APUI328_AFF TC5_APUI328_AFF To Verify the dropdown values for Countries
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on Countries field
    Then User Should be able to Verify All values for Countries DropDown
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI328_TC6_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI328_TC6_Aff_CD TC6_APUI328_AFF TC6_APUI328_AFF TC6_APUI328_AFF To Verify Selection is not mandatory for Catogries and Industries DropDown
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on Categories field
    Then User UnSelect Logos option from Categories dropdown
    Then Page Should be refresshed
    And User clicks on Industry field
    Then User Select all the values from Industry
    Then User UnSelect all the values from Industry
    Then Page Should be refresshed

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI328_TC7_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI328_TC7_Aff_CD TC7_APUI328_AFF TC7_APUI328_AFF
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on ClientType field
    Then User UnSelect Personals clients option from ClientType dropdown
    Then Page Should be refresshed
    And User clicks on Countries field
    Then User Select all the values from Country
    Then User UnSelect all the values from Country
    Then Page Should be refresshed

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI328_TC8_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI328_TC8_Aff_CD TC8_APUI328_AFF TC8_APUI328_AFF TC8_APUI328_AFF To Verify User Should be able to add one values in Catogries and Industries dropdown
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on Categories field
    Then User Select Banners option from Categories dropdown
    Then Page Should be refresshed
    And User clicks on Industry field
    Then User Select few the values from Industry
    Then Page Should be refresshed

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI328_TC9_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI328_TC9_Aff_CD TC9_APUI328_AFF TC9_APUI328_AFF To Verify User Should be able to add one values in Catogries and Industries dropdown
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on ClientType field
    Then User Select Corporate clients option from ClientType dropdown
    Then Page Should be refresshed
    And User clicks on Countries field
    Then User Select few the values from Country
    Then Page Should be refresshed

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI328_TC12_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI328_TC12_Aff_CD TC12_APUI328_AFF TC12_APUI328_AFF To Verify User should not be excluded from display if they only meet one of the selection criteria
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on Categories field
    Then User Select Banners option from Categories dropdown
    Then User will be able to view the Banners on the Search Page
    #Then User will be able to view the Categories count as 1
    #Then User will be able to view the ClientType count as 1
    #Then User will be able to view the Industry count as 1
    #Then User will be able to view the Countries count as 1

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI328_TC13_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI328_TC13_Aff_CD TC13_APUI328_AFF TC13_APUI328_AFF To Verify User should be able to view all the details if no filter is been applied
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on Categories field
    Then User Select Banners option from Categories dropdown
    Then User will be able to view the Banners on the Search Page
    Then Page Should be refresshed
    Then System removes all the set filter which were set
    #Then User will be able to view the Banners on the Search Page
    #Then User will be able to view the Categories count as 1
    #Then User will be able to view the Industry count as 1
    #Then User will be able to view the ClientType count as 1
    #Then User will be able to view the Countries count as 1


    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI328_TC14_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI328_TC14_Aff_CD TC14_APUI328_AFF TC14_APUI328_AFF To Verify User should be able to view all the details if no filter is been applied
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on Categories field
    Then User UnSelect Logos option from Categories dropdown
    Then User Select Banners option from Categories dropdown
    And User clicks on Industry field
    Then User Select all the values from Industry
    And User clicks on ClientType field
    Then User Select all the values from ClientType
    Then User will be able to view the Banners on the Search Page
    #Then User will be able to view the Countries count as 1


    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI328_TC15_Aff_CD @Affiliates_Sprint10_CD @Acceptence_7_CD @QASprint10_CD
  Scenario Outline:APUI328_TC15_Aff_CD TC15_APUI328_AFF TC15_APUI328_AFF To Verify User Should by default be able to view the Catogries type as Logo
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on Categories field
    Then User UnSelect Logos option from Categories dropdown
    Then User Select Banners option from Categories dropdown
    And User clicks on Industry field
    Then User Select all the values from Industry
    And User clicks on ClientType field
    Then User Select all the values from ClientType
    Then User will be able to view the Banners on the Search Page
    #Then User will be able to view the Countries count as 1

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI328_TC16_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI328_TC16_Aff_CD TC16_APUI328_AFF TC16_APUI328_AFF To Verify User Should be able to view the Catogries type as Logo and able to search with new filter as well
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on Categories field
    Then User UnSelect Logos option from Categories dropdown
    Then User Select Banners option from Categories dropdown
    And User clicks on Industry field
    Then User Select all the values from Industry
    And User clicks on ClientType field
    Then User Select all the values from ClientType
    Then User will be able to view the Banners on the Search Page
    And User clicks on Categories field
    Then User Select Logos option from Categories dropdown
    Then User will be able to view the Logos on the Search Page
    #Then User will be able to view the Countries count as 1
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  #Tester needs to Test along with the Backend tester or the Salesforce team
  # For Testing purpose user has to Select one record with almost one Catory provided by Salesforce
  # For Testing purpose User takes a Record with below criteria Set
  # Catogries(1--Banner) Industry(8) ClientType(3) Country(1)
  #  Salesforce should have Asset been mapped with the above search criteria
  # Tester need to Create such a Affilate Record which met the above set criteria
  @PhaseAll_CD @PhaseAll @APUI328_TC17_Aff_CD @Affiliates_Sprint10_CD @Acceptence_7_CD @QASprint10_CD
  Scenario Outline:APUI328_TC17_Aff_CD To Verify properties been displayed in Settings page should be replicated as a part of dropdown Values
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Settings tab on dashboard.
    And User will be navigated to the Settings section Page
    Then User notes Your clients details such as Client type
    And User notes Your clients details such as Industries
    Then User notes Your clients details such as Countries
    And User click on Resources tab on dashboard.
    And User will be navigated to the Resources section Page
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    #And User should view the selected Industry section same as Industries on Settings page
    #And User should view the Selected ClientType section same as ClientType on Settings page
    #Then User should view the Selected Country section same as Country on Settings page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  #Tester needs to Test along with the Backend tester or the Salesforce team
  # For Testing purpose user has to Select one record with almost one Catory provided by Salesforce
  # For Testing purpose User takes a Record with below criteria Set
  # Catogries(1--Banner) Industry(8) ClientType(3) Country(1)
  #  Salesforce should have Asset been mapped with the above search criteria
  # Tester need to Create such a Affilate Record which met the above set criteria
  #Assume than number of Document count as 10
  #Selecting Country as Austrlia does not have any data
  @PhaseAll_CD @PhaseAll @APUI328_TC18_Aff_CD @Affiliates_Sprint10_CD @Acceptence_8_CD @QASprint10_CD
  Scenario Outline:APUI328_TC18_Aff_CD To Verify User should get an message as resources not available when no record is been present
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Settings tab on dashboard.
    And User will be navigated to the Settings section Page
    Then User notes Your clients details such as Client type
    And User notes Your clients details such as Industries
    Then User notes Your clients details such as Countries
    And User click on Resources tab on dashboard.
    And User will be navigated to the Resources section Page
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    Then User should be able to view ALL the document count
    And User UnSelect all the values from Country
    And User Select few the values from Country
    #Then User should be able to view message as Resources not available
    #And User should view the selected Industry section same as Industries on Settings page
    #And User should view the Selected ClientType section same as ClientType on Settings page
    #Then User should view the Selected Country section same as Country on Settings page
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  #Tester needs to Test along with the Backend tester or the Salesforce team
  # For Testing purpose user has to Select one record with almost one Catory provided by Salesforce
  # For Testing purpose User takes a Record with below criteria Set
  # Catogries(1--Banner) Industry(8) ClientType(3) Country(1)
  #  Salesforce should have Asset been mapped with the above search criteria
  # Tester need to Create such a Affilate Record which met the above set criteria
  #Assume than number of Document count as 10
  @PhaseAll_CD @PhaseAll @APUI328_TC19_Aff_CD @Affiliates_Sprint10_CD @Acceptence_9_CD @QASprint10_CD
  Scenario Outline:APUI328_TC19_Aff_CD To Verify User should be able to download the document
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Settings tab on dashboard.
    And User will be navigated to the Settings section Page
    Then User notes Your clients details such as Client type
    And User notes Your clients details such as Industries
    Then User notes Your clients details such as Countries
    And User click on Resources tab on dashboard.
    And User will be navigated to the Resources section Page
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on Categories field
    And  User Select Banners option from Categories dropdown
    Then User should be able to view the document count
    And User chooses documnet Banners and Click on View
    Then System will opens a slider with the details of the Banner document been selected
    And User chooses documnet Banners and Click on Download
    #Then Syetem will download the particular document to particular loaction in the system
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  #Tester needs to Test along with the Backend tester or the Salesforce team
  # For Testing purpose user has to Select one record with almost one Catory provided by Salesforce
  # For Testing purpose User takes a Record with below criteria Set
  # Catogries(1) Industry(2) ClientType(1) Country(1)
  #Assume the Search count as 9
  @PhaseAll_CD @PhaseAll @APUI328_TC20_Aff_CD @Affiliates_Sprint10_CD @Acceptence_11_CD @QASprint10_CD
  Scenario Outline:APUI328_TC20_Aff_CD To Verify User should be able to view all 9 documents as a part of search result when Customer Chooses thrumbled option with 9
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    And User will be navigated to the Resources section Page
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on Categories field
    Then  User Select Banners option from Categories dropdown
    And User Clicks on thrumbled view with 9 option
    Then User will be able to view 9 documents in a particular page
    #Then User will be able to view the Categories count as 1

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  #Tester needs to Test along with the Backend tester or the Salesforce team
  # For Testing purpose user has to Select one record with almost one Catory provided by Salesforce
  # For Testing purpose User takes a Record with below criteria Set
  # Catogries(1) Industry(2) ClientType(1) Country(1)
  #Assume the Search count as 20
  @PhaseAll_CD @PhaseAll @APUI328_TC21_Aff_CD @Affiliates_Sprint10_CD @Acceptence_11_CD @QASprint10_CD
  Scenario Outline:APUI328_TC21_Aff_CD To Verify User should be able to view all 20 documents as a part of search result when Customer Chooses thrumbled option with 20
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    And User will be navigated to the Resources section Page
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on Categories field
    Then User Select Banners option from Categories dropdown
    And User Clicks on thrumbled view with 20 option
    Then User will be able to view 20 documents in a particular page
    #Then User will be able to view the Categories count as 1

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  #Tester needs to Test along with the Backend tester or the Salesforce team
  # For Testing purpose user has to Select one record with almost one Catory provided by Salesforce
  # For Testing purpose User takes a Record with below criteria Set
  # Catogries(1) Industry(2) ClientType(1) Country(1)
  #Assume search result is more that 30
  @PhaseAll_CD @PhaseAll @APUI328_TC22_Aff_CD @Affiliates_Sprint10_CD @Acceptence_11_CD @QASprint10_CD
  Scenario Outline:APUI328_TC22_Aff_CD To Verify User should be able to view Load more option in 9 element thrumbled option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    And User will be navigated to the Resources section Page
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on Categories field
    Then  User Select Banners option from Categories dropdown
    And User Clicks on thrumbled view with 9 option
    Then User will be able to view 9 documents in a particular page
    And User click on Load more on Resources.
    Then User will be able to view 9 more documents in a particular page
    #Then User will be able to view the Categories count as 1

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  #Tester needs to Test along with the Backend tester or the Salesforce team
  # For Testing purpose user has to Select one record with almost one Catory provided by Salesforce
  # For Testing purpose User takes a Record with below criteria Set
  # Catogries(1) Industry(2) ClientType(1) Country(1)
  #Assume the Search count as 20
  @PhaseAll_CD @PhaseAll @APUI328_TC23_Aff_CD @Affiliates_Sprint10_CD @Acceptence_11_CD @QASprint10_CD
  Scenario Outline:APUI328_TC23_Aff_CD To Verify User should be able to view Load more option in 20 element thrumbled option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    And User will be navigated to the Resources section Page
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on Categories field
    Then  User Select Banners option from Categories dropdown
    And User Clicks on thrumbled view with 20 option
    Then User will be able to view 20 documents in a particular page
    And User click on Load more on Resources.
    Then User will be able to view 20 more documents in a particular page
    #Then User will be able to view the Categories count as 1

    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI328_TC24_Aff_CD @Affiliates_Sprint10_CD @Acceptence_10_CD @QASprint10_CD
  Scenario Outline:APUI328_TC24_Aff_CD TC24_APUI328_AFF TC24_APUI328_AFF To Verify the Organization details
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    And User will be view filter options on UI as Catogries Industry Client Type and Country
    Then User should view the Organization information After Login in header and fotter sections
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI328_TC25_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI328_TC25_Aff_CD To Verify User should be able to download the document via copying the code
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on Categories field
    Then User Select Banners option from Categories dropdown
    Then User will be able to view the Banners on the Search Page
    And User chooses documnet Banners and Click on View
    And User chooses documnet Banners and Click on Copycode
    #Then User UnSelect Logos option from Categories dropdown
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  # Open New Bug APUI-1010
  @PhaseAll_CD @PhaseAll @APUI328_TC26_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD @Smoke
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
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI328_TC27_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI328_TC27_Aff_CD TC27_APUI328_AFF TC27_APUI328_AFF To Verify User should be able to download the document for Facesheet using download option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on Categories field
    Then User UnSelect Logos option from Categories dropdown
    Then User Select Factsheets option from Categories dropdown
    Then User will be able to view the Factsheets on the Search Page
    And User chooses documnet Factsheets and Click on View
    And User chooses documnet Factsheets and Click on Download
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @Phase_CD @Phase @APUI328_TC28_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI328_TC28_Aff_CD TC28_APUI328_AFF To Verify User should be not able to download the document for leflets
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on Categories field
    Then User UnSelect Logos option from Categories dropdown
    Then User Select Leaflets option from Categories dropdown
    Then User will be able to view the Leaflets on the Search Page
    And User chooses documnet Leaflets and Click on View
    And User chooses documnet Leaflets and Click on DownloadFromDocument
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @Phase_CD @Phase @APUI328_TC29_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI328_TC29_Aff_CD TC29_APUI328_AFF To Verify User should be not able to download the document for leflets
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on Categories field
    Then User UnSelect Logos option from Categories dropdown
    Then User Select Leaflets option from Categories dropdown
    Then User will be able to view the Leaflets on the Search Page
    And User chooses documnet Leaflets and Click on View
    And User chooses documnet Leaflets and Click on PrintFromDocument
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @Phase_CD @Phase @APUI328_TC30_Aff_CD @Affiliates_Sprint10_CD @Acceptence_1_CD @QASprint10_CD
  Scenario Outline:APUI328_TC30_Aff_CD TC30_APUI328_AFF TC30_APUI328_AFF To Verify User should be not able to download the document for facesheet
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on Categories field
    Then User UnSelect Logos option from Categories dropdown
    Then User Select Factsheets option from Categories dropdown
    Then User will be able to view the Factsheets on the Search Page
    And User chooses documnet Factsheets and Click on View
    And User chooses documnet Factsheets and Click on DownloadFromDocument
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @Phase_CD @Phase @APUI328_TC31_Aff_CD @Affiliates_Sprint10_CD @Acceptence_10_CD @QASprint10_CD
  Scenario Outline:APUI328_TC31_Aff_CD To Verify User should be not able to download the document for facesheet
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User clicks on Categories field
    Then User UnSelect Logos option from Categories dropdown
    Then User Select Factsheets option from Categories dropdown
    Then User will be able to view the Factsheets on the Search Page
    And User chooses documnet Factsheets and Click on View
    And User chooses documnet Factsheets and Click on PrintFromDocument
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |

  @PhaseAll_CD @PhaseAll @APUI328_TC32_Aff_CD @Affiliates_Sprint10_CD @Acceptence_10_CD @QASprint10_CD
  Scenario Outline:APUI328_TC32_Aff_CD To Verify User should be able to use affilate traking code option
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User click on Affiliate Tracking Code on Resources.
    Then System will open a slider on right hand side along with the list of tracking codes
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |


  @PhaseAll_CD @PhaseAll @APUI328_TC33_Aff_CD @Affiliates_Sprint10_CD @Acceptence_10_CD @QASprint10_CD
  Scenario Outline:APUI328_TC33_Aff_CD To Verify User should be able to copy affilate traking code
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Resources tab on dashboard.
    Then User will be view filter options on UI as Catogries Industry Client Type and Country
    And User click on Affiliate Tracking Code on Resources.
    Then System will open a slider on right hand side along with the list of tracking codes
    And User click on Copy Code for UK Country And verify CopyCodeMessage is displayed on the top
    Examples:
      | browser | urlName        | UserName            | password    |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |




