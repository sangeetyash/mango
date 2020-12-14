Feature: R-PACMango.com CRM E-Coomerece Feature Main Finish..


@loginlogout
Scenario Outline:  CRM Login Test and logout

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
#Then user enters "Test@123.com" and "User@123"
Then user enters credentials
| Test@123.com | User@123 |
#Then enters "<username>" and "<password>"
Then user clicks on login button
Then user is on home page	
Then Logout
Then Close Browser
#
Examples:
	| username | password |
	| Test@123.com | User@123 |
		
@catalogorder1
Scenario Outline: Login ,order catalog item and logout


Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then goto catalog screen and PO selection validation check
Then Plus Add to cart "SSW" and "100"
Then goto checkout page
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Print Confirmation and done
Then Logout
Then Close Browser
	
Examples:
| Item | Qty | 
| SSW | 100  |
| SSW | 200  |
@regression
Scenario Outline: Login ,PO, Select PO item , AddToCart, Confirm order, Print Order and logout

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then Search Release PO page with CPO ID "8027" 
Then Search supplier ID "6752"
#Then click on PO "6140" and select overage "3"
Then click on PO "8027" and select all
Then Addtocart
Then goto checkout page
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date 
Then Confirm Order
Then Print Confirmation and done
Then Goto Report>Order Status
Then Search for PO "8027" 
# Search for PO "6107" and Check Status "Processing"
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
	

@testcase5
Scenario Outline: select 2 to 3 SKU and click on cart button then go to add to cart screen click on CPO, remove previews SKU and select new SKU also added previews .

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then Search Release PO page with CPO ID "8R00" 
Then Search supplier ID "1573"
#Then click on PO "6140" and select overage "3"
Then click on PO "8R00" and select all
Then Addtocart
Then goto checkout page
Then Click on CPO "8R00"
Then Select PO items based on EAN and click addtocart
| 8445306232014 | 8445306232069 | 8445306231994	|
Then goto checkout page
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Print Confirmation and done
Then Goto Report>Order Status
Then Search for PO "8R00" 
# Search for PO "6107" and Check Status "Processing"
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
	
@testcase6
Scenario Outline: select 2 to 3 SKU and click on cart button then go to add to cart screen click on CPO, remove previews SKU and select new SKU also added previews .

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then Search Release PO page with CPO ID "8016" 
Then Search supplier ID "6737"
#Then click on PO "6140" and select overage "3"
Then click on PO "8016"
Then Select PO items based on EAN and click addtocart
| 8445306466365 | 8445306466389 |
#Then Addtocart
Then goto checkout page
Then Click on CPO "8016"
Then Deselect all 
Then Select PO items based on EAN and click addtocart
| 8445306466488 | 8445306466341 | 8445306466457	|
Then goto checkout page
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Print Confirmation and done
Then Goto Report>Order Status
Then Search for PO "8016" 
# Search for PO "6107" and Check Status "Processing"
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
	
@testcase7
Scenario Outline: add same CPO but different vendor ID in same shopping cart

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then Search Release PO page with CPO ID "7R05" 
Then Search supplier ID "1044"
#Then click on PO "7R00" and select overage "3"
Then click on PO "7R05"
Then Select all
Then AddToCart
Then Search Release PO page with CPO ID "7R05" 
Then Search supplier ID "1496"
#Then click on PO "7R00" and select overage "3"
Then click on PO "7R05"
Then Select all
Then AddToCart
Then goto checkout page
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Print Confirmation and done
Then Goto Report>Order Status
Then Search for PO "7R05" 
# Search for PO "6107" and Check Status "Processing"
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
		
@testcase8
Scenario Outline: add same CPO but different vendor ID in same shopping cart

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then Search Release PO page with CPO ID "8016" 
Then Search supplier ID "6737"
#Then click on PO "7R00" and select overage "3"
Then click on PO "7R05"
Then Select all
Then AddToCart
Then Search Release PO page with CPO ID "8014" 
Then Search supplier ID "6737"
#Then click on PO "7R00" and select overage "3"
Then click on PO "7R05"
Then Select all
Then AddToCart
Then goto checkout page
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Print Confirmation and done
Then Goto Report>Order Status
Then Search for PO "8014"
Then Search for PO "8016"
# Search for PO "6107" and Check Status "Processing"
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
		
@testcase12
Scenario Outline: catalog and normal order in shopping cart check back forth operations

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then goto catalog screen and PO selection validation check
Then Plus Add to cart "SSW" and "100"
Then Search Release PO page with CPO ID "6267" 
Then Search supplier ID "2001"
#Then click on PO "7R00" and select overage "3"
Then click on PO "6267"
Then Select all
Then AddToCart
Then goto checkout page
Then Click on CPO "6267"
Then goto checkout page
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Print Confirmation and done
Then Goto Report>Order Status
Then Search for PO "6267" 
# Search for PO "6107" and Check Status "Processing"
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
		
@testcase13
Scenario Outline: Confirm order with double click

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then Search Release PO page with CPO ID "7043" 
Then Search supplier ID "6551"
#Then click on PO "7R00" and select overage "3"
Then click on PO "7043"
Then Select all
Then AddToCart
Then goto checkout page
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order with double click
Then Print Confirmation and done
Then Goto Report>Order Status
Then Search for PO "7043" 
# Search for PO "6107" and Check Status "Processing"
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
	
	
@testcase14
Scenario Outline: double click on add to cart button

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then Search Release PO page with CPO ID "7043" 
Then Search supplier ID "6551"
#Then click on PO "6267" and select overage "3"
Then click on PO "7043"
Then Select all
Then Addtocart with double click
Then goto checkout page
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Print Confirmation and done
Then Goto Report>Order Status
Then Search for PO "7043" 	
# Search for PO "6107" and Check Status "Processing"
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
	
	
@testcase16
Scenario Outline: select 2 to 3 SKU and click on cart button then go to add to cart screen click on CPO, remove previews SKU and select new SKU also added previews .

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then Search Release PO page with CPO ID "8R00" 
Then Search supplier ID "5846"
#Then click on PO "6140" and select overage "3"
Then click on PO "8R00"
Then Deselect all 					
Then Addtocart
Then goto checkout page
Then Click on CPO "8R00"
Then Deselect all 
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |
| 8445306232229	|	100 |
| 8445306232229	|	110 |
| 8445306232236	|	120 |
Then Addtocart
Then goto checkout page
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Print Confirmation and done
Then Goto Report>Order Status
Then Search for PO "8R00" 	
# Search for PO "6107" and Check Status "Processing"
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
		
@testcase17
Scenario Outline: select 2 to 3 SKU and click on cart button then go to add to cart screen click on CPO, remove previews SKU and select new SKU also added previews .

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then Search Release PO page with CPO ID "7R17" 
Then Search supplier ID "1572"
#Then click on PO "6140" and select overage "3"
Then click on PO "7R17"
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |	
| 8445306233844 | 3500 |		
| 8445306235336 | 6500 |		
Then Addtocart
Then goto checkout page
Then Click on CPO "7R17"
Then Deselect all 
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |
| 8445306235350	|	5000 |
| 8445306233837	|	2000 |
Then Addtocart
Then goto checkout page
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Print Confirmation and done
Then Goto Report>Order Status
Then Search for PO "7R17" 
# Search for PO "6107" and Check Status "Processing"
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
		
@testcase18
Scenario Outline: Select SKU then go to shopping cart click on CPO,select overage check calculate properly or not and click on add to cart button.

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then Search Release PO page with CPO ID "7R00" 
Then Search supplier ID "5995"
Then click on PO "7R00"
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |	
| 8445306234681	| 450 |
| 8445306234704	| 250 |
| 8445306234674	| 180 |
Then Select overage "3"
Then Addtocart
Then goto checkout page
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Print Confirmation and done
Then Goto Report>Order Status
Then Search for PO "7R00" 
# Search for PO "6107" and Check Status "Processing"
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
		
@testcase19
Scenario Outline: Normal and show confirm order in shopping cart check back forth operations also change qty both orders

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then Search Release PO page with CPO ID "7R06" 
Then Search supplier ID "5811"
#Then click on PO "6140" and select overage "3"
Then click on PO "7R06"
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |	
| 8445306231598 | 2700 |					
Then Addtocart
Then Show confirm orders 
Then With Confirm orders,Search Release PO page with CPO ID "7R53" 
Then Search supplier ID "6593"
Then click on PO "7R53"
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |
| 9900010141179	|	1000 |
Then Addtocart
Then goto checkout page
Then Click on CPO "7R06"
Then Deselect all 
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |
| 9900010138827	|	1400 |
Then Addtocart
Then goto checkout page
Then Click on CPO "7R53"
Then Deselect all 
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |
| 8445306296788	|	1250 |
Then Addtocart
Then goto checkout page
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Print Confirmation and done
Then Goto Report>Order Status
Then Search for PO "7R53" 
Then Search for PO "7R06" 
# Search for PO "6107" and Check Status "Processing"
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
			