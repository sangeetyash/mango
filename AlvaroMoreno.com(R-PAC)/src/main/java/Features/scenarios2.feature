Feature: R-PAC Mango CRM E-Coomerece Feature 


@LoginLogoutValidation
Scenario Outline:  CRM Login Test and logout

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
#Then user enters "Test@123.com" and "User@123"
Then user enters credentials
| admin@AlvaroMoreno.com | Lousie#786 |
#Then enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page	
Then Logout
Then Close Browser

Examples:
	| username | password |
	| Test@123.com | User@123 |
		