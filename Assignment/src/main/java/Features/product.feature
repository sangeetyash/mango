Feature: R-PACMango.com CRM E-Coomerece Feature Main Finish..
	
	
@testcaseA003
Scenario Outline: Add Product with validations

Given Navigate user to Login Page "https://sangeet-koli.herokuapp.com/admin" and "chrome"
When title of login page
Then Login validation check
| User                   | Password   |
| admin@example.com      | passwasa	  |
| admin@example.com      | password	  |
Then user clicks on login button
Then user is on home page
Then Goto Product Screen
Then Add Product and Validations
| Title                  | SKU   	  | Description                      |
|		                 |		      |                                  |
|	abc	         		 | anc	      |   acn                            |
|	product9331	         | p023341	      |   product23341 p123341 Description    |
Then Logout
Then Close Browser	
#Then user enters credentials
#| admin@AlvaroMoreno.com | Lousie#786 |
#Then user enters "admin@AlvaroMoreno.com" and "Lousie#786"

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
	
@testcaseA004
Scenario Outline: Edit Product with validations

Given Navigate user to Login Page "https://sangeet-koli.herokuapp.com/admin" and "chrome"
When title of login page
Then Login validation check
| User                   | Password   |
| admin@example.com      | password	  |
Then user clicks on login button
Then user is on home page
#Then Goto Product Screen
Then Goto product Listing and Edit Product "product9331"
Then Edit Data
| Title                  | SKU   	  | Description                      |
|	product2949	         | p09241      |   product233241 p1233124  Description    |
Then Logout
Then Close Browser	
#Then user enters credentials
#| admin@AlvaroMoreno.com | Lousie#786 |
#Then user enters "admin@AlvaroMoreno.com" and "Lousie#786"

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
	
	@testcaseA005
Scenario Outline: Edit Product with validations

Given Navigate user to Login Page "https://sangeet-koli.herokuapp.com/admin" and "chrome"
When title of login page
Then Login validation check
| User                   | Password   |
| admin@example.com      | password	  |
Then user clicks on login button
Then user is on home page
#Then Goto Product Screen
Then Goto product Listing and Delete Product "product2949"
Then Logout
Then Close Browser	
#Then user enters credentials
#| admin@AlvaroMoreno.com | Lousie#786 |
#Then user enters "admin@AlvaroMoreno.com" and "Lousie#786"

Examples:
	| items | udateitems | 
	| 1111  | 2222  |