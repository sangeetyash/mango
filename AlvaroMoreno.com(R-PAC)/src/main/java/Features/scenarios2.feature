Feature: R-PAC Mango CRM E-Coomerece Feature (Scenario2)

@google
Scenario Outline:  CRM Login Test and logout

Given Navigate user to Login Page "http://demo.guru99.com/test/newtours/" and "chrome"
When start
Then Google Search "sangeet"	
Then Close Browser

Examples:
	| username | password |
	| Test@123.com | User@123 |
	
@LoginValidation
Scenario Outline:  CRM Login Test and logout

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "chrome"
When title of login page
Then user enters "admin@AlvaroMoreno.com" and "Lousie#786"
#Then user enters credentials
#| admin@AlvaroMoreno.com | Lousie#786 |
#Then enters "<username>" and "<password>"
#Then user clicks on login button
Then user clicks on login button 
Then user is on home page	
Then Logout
Then Close Browser

Examples:
	| username | password |
	| Test@123.com | User@123 |
	
	
	@CatalogItem
Scenario Outline: SQL Catalog back n forth

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "firefox"
When title of login page
Then user enters "admin@AlvaroMoreno.com" and "Lousie#786"
Then user clicks on login button
Then user is on home page
Then goto catalog screen and PO selection validation check
Then Plus Add to cart "ALMO_MCM01" and "100"
Then goto checkout page
Then Verify Cart With DB
| Catalog | qty |
| ALMO_MCM01    | 100 |
#Then goto catalog screen and PO selection validation check
#Then Plus Add to cart "ALMO_MCM01" and "50"
#Then goto checkout page
#Then Verify Cart With DB
#| Catalog | qty |
#| ALMO_MCM01     | 100 |
#| ALMO_MCM01    | 50  |
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Verify catalog RPO with DB
| Catalog | qty |
| ALMO_MCM01     | 100 |
#| ALMO_MCM01    | 50  |
Then Print Confirmation and done
Then Goto Report>Order Status
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |	