Feature: R-PACMango.com CRM E-Coomerece Feature Main Finish..
	
@testcaseA004
Scenario Outline: SQL Catalog back n forth

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "chrome"
When title of login page
Then Login validation check
| User                   | Password   |
|		                 |		      |
| sadsd 				 | 100        |
| admin@AlvaroMoreno.com |            |
| admin@AlvaroMoreno.com | asdasdsd   |
| admin@AlvaroMoreno.com | Lousie#786 |
#Then user enters credentials
#| admin@AlvaroMoreno.com | Lousie#786 |
#Then user enters "admin@AlvaroMoreno.com" and "Lousie#786"
Then user clicks on login button
Then user is on home page
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
	
	
	
@testcaseA005
Scenario Outline: SQL Catalog back n forth

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "admin@AlvaroMoreno.com" and "Lousie#786"
Then user clicks on login button
Then user is on home page
Then goto catalog screen and PO selection validation check
Then Plus Add to cart "ALMO_MCM01" and "100"
Then goto checkout page
Then Verify Cart With DB
| Catalog | qty |
| ALMO_MCM01 | 100 |
Then goto catalog screen and PO selection validation check
Then Plus Add to cart "ALMO_MCM01" and "50"
Then goto checkout page
Then Verify Cart With DB
| Catalog | qty |
| ALMO_MCM01 | 100 |
| ALMO_MCM01 | 50  |
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Verify catalog RPO with DB
| Catalog | qty |
| ALMO_MCM01 | 100 |
| ALMO_MCM01 | 50  |
Then Print Confirmation and done
Then Goto Report>Order Status
#Then Goto Report>Order Status->Cancel Order
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
	
		
@testcaseA006
Scenario Outline: Normal PO order

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "admin@AlvaroMoreno.com" and "Lousie#786"
Then user clicks on login button
Then user is on home page
Then Search Release PO page with CPO ID "2020_797"
Then Search Vendor ID "001024"
Then click on PO "2020_797"
Then AddToCart
Then goto checkout page
Then Verify All PO data with db
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Verify All RPO data with db
Then Print Confirmation and done
#Then Goto Report>Order Status
Then Goto Report>Order Status->Cancel Order
#Then Search for PO "8016"
Then Logout
Then Close Browser

Examples:
| items | udateitems |
| 1111  | 2222  |

@testcaseA007
Scenario Outline: Show confirm order in shopping cart check back forth operations also change qty both orders

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then Show confirm orders 
Then Search Release PO page with CPO ID "2020_797"
Then Search Vendor ID "001024"	
Then click on PO "2020_797"
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |
| 8445306619426	|	1090 |		
Then Addtocart
Then Show confirm orders 
Then Search Release PO page with CPO ID "2020_797"
Then Search Vendor ID "001024"
Then click on PO "8020"
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |
| 8445306619426	|	1090 |
Then Addtocart
Then goto checkout page
Then Verify All PO data with db
Then Click on CPO "7R05"
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |	
| 8445306386885 | 19 |	
Then Addtocart
Then goto checkout page
Then Verify All PO data with db
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Verify All RPO data with db
Then Print Confirmation and done
Then Goto Report>Order Status
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
	

@testcaseA008
Scenario Outline: Normal and show confirm order in shopping cart check back forth operations also change qty both orders

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then Search Release PO page with CPO ID "7R05" 
Then Search Vendor ID "001024"
Then click on PO "7R05"				
Then Addtocart
Then Show confirm orders 
Then With Confirm orders,Search Release PO page with CPO ID "8020" 
Then Search Vendor ID "001024"
Then click on PO "8020"
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |
| 8445306619426	|	1090 |
Then Addtocart
Then goto checkout page
Then Verify All PO data with db
Then Click on CPO "7R05"
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |	
| 8445306386885 | 19 |	
Then Addtocart
Then goto checkout page
Then Verify All PO data with db
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Verify All RPO data with db
Then Print Confirmation and done
Then Goto Report>Order Status
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
	
		
	