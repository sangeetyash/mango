Feature: R-PACMango.com CRM E-Coomerece Feature Main Finish..
	
	
@testcaseA003
Scenario Outline: Login Validations

Given Navigate user to Login Page "http://google.com/" and "chrome"
When title of login page
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
	
	
@testcaseA004
Scenario Outline: Login Validations

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "chrome"
When title of login page
Then Login validation check
| User                   | Password   |
|		                 |		      |
| sadsd 				 | 100        |
| User@alvaromorono.com |            |
| User@alvaromorono.com | asdasdsd   |
| User@alvaromorono.com | User@123 |
Then user clicks on login button
Then user is on home page
Then Logout
Then Close Browser	
#Then user enters credentials
#| admin@AlvaroMoreno.com | Lousie#786 |
#Then user enters "admin@AlvaroMoreno.com" and "Lousie#786"

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
	