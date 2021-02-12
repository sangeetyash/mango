@Affiliate_InSprint_GlobalPage_CD @APUI_125_CD @CD
Feature: Affiliate V2.0 Global page elements for APUI125_CD

  @PhaseAll_CD @PhaseAll @APUI125_TC1_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD
  Scenario Outline:APUI125_TC1_Aff_CD To verify Customer should get valid mobile while performing Send Registration link journey with both options been selected
    Given User launched application through "<browser>"
    And User navigate to Affiliate CD portal "<urlName>"
    When User enter UserName  "<UserName>" and password "<password>"and click login button
    Then User is navigated to Dashboard
    And User click on Send registration link on dashboard.
    And User Selects Both Checkbox for send registration link
    When User enter the Name "<Name>" and EmailID "<EmailId>" and MobileNumber "<MobileNumber>"
    And User click on Generate Button on RefferalURLGenerator.
    Then success message to be displayed with Email "<EmailId>" And Mobile "<Mobile>" which is been entered
    Examples:
      | browser | urlName        | UserName            | password    |  Name        | EmailId                |  MobileNumber      | Mobile  |
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |  8098094123        | 123     |

  @PhaseAll_CD @PhaseAll @APUI125_TC9_Aff_CD @Affiliates_Sprint13_CD @Acceptence_1_CD @QASprint13_CD @Smoke
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
      | Chrome  | AffiliateCDURL | AffiliateCDUserName | AffPassword |  John Smith  | John.Smith@gmail.com   |  8098094123        | 123     |

