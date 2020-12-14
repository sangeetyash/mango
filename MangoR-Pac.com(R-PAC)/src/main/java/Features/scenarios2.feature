Feature: R-PACMango.com CRM E-Coomerece Feature Main Finish..

	
@testcase55
Scenario Outline: SQL Catalog back n forth

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then goto catalog screen and PO selection validation check
Then Plus Add to cart "SSW" and "100"
Then goto checkout page
Then Verify Cart With DB
| Catalog | qty |
| SSW     | 100 |
Then goto catalog screen and PO selection validation check
Then Plus Add to cart "SSW" and "50"
Then goto checkout page
Then Verify Cart With DB
| Catalog | qty |
| SSW     | 100 |
| SSW     | 50  |
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Verify catalog RPO with DB
| Catalog | qty |
| SSW     | 100 |
| SSW     | 50  |
Then Print Confirmation and done
Then Goto Report>Order Status
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
	
	
@testcase56
Scenario Outline: select 2 to 3 SKU and click on cart button then go to add to cart screen click on CPO, remove previews SKU and select new SKU also added previews .

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then Search Release PO page with CPO ID "8016"
Then Search supplier ID "6737"
Then click on PO "8016"
Then Select PO items based on EAN and click addtocart
| 8445306466396 | 8445306466402	 |
Then goto checkout page
Then Verify POData EAN with DB
| 8445306466396 | 8445306466402	 |
Then Click on CPO "8016"
Then Deselect all
Then Select PO items based on EAN and click addtocart
| 8445306466440 | 8445306466402 | 8445306466365	 |
Then goto checkout page
Then Verify POData EAN with DB
| 8445306466440 | 8445306466402 | 8445306466365	 |
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Verify EAN RPO with db
| 8445306466440 | 8445306466402 | 8445306466365	 |
Then Print Confirmation and done
Then Goto Report>Order Status
Then Search for PO "8016"
Then Logout
Then Close Browser

Examples:
| items | udateitems |
| 1111  | 2222  |



@testcase57
Scenario Outline: add same CPO but different vendor ID in same shopping cart

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then Search Release PO page with CPO ID "7014" 
Then Search supplier ID "1569"
#Then click on PO "7R00" and select overage "3"
Then click on PO "7014"
Then Select all
Then AddToCart
Then Search Release PO page with CPO ID "7014" 
Then Search supplier ID "5384"
#Then click on PO "7R00" and select overage "3"
Then click on PO "7014"
Then Select all
Then AddToCart
Then goto checkout page
Then Verify All PO data with db
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Verify All RPO data with db
Then Print Confirmation and done
Then Goto Report>Order Status
Then Search for PO "7014" 
# Search for PO "6107" and Check Status "Processing"
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
	|sghhsg| askdh|
		
@testcase58
Scenario Outline: add same vendor ID but different CPO ID in same shopping cart

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then Search Release PO page with CPO ID "7705" 
Then Search supplier ID "1521"
#Then click on PO "7R00" and select overage "3"
Then click on PO "7705"
Then Select all
Then AddToCart
Then Search Release PO page with CPO ID "7036" 
Then Search supplier ID "1521"
#Then click on PO "7R00" and select overage "3"
Then click on PO "7036"
Then Select all
Then AddToCart
Then goto checkout page
Then Verify All PO data with db
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Verify All RPO data with db
Then Print Confirmation and done
Then Goto Report>Order Status
#Then Search for PO "7036" 
#Then Search for PO "7705" 
# Search for PO "6107" and Check Status "Processing"
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
		
@testcase116
Scenario Outline: select 2 to 3 SKU and click on cart button then go to add to cart screen click on CPO, remove previews SKU and select new SKU also added previews .

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then Search Release PO page with CPO ID "8R00" 
Then Search supplier ID "1267"
#Then click on PO "6140" and select overage "3"
Then click on PO "8R00"
Then Deselect all 					
Then Addtocart
Then goto checkout page
Then Verify All PO data with db
Then Click on CPO "8R00"
Then Deselect all 
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |
| 8445306385765 |	15 |
| 8445306385796	|	22 |
| 8445306385802	|	18 |
Then Addtocart
Then goto checkout page
Then Verify EAN and qty with DB
| EAN           | qty  |
| 8445306385765 |	15 |
| 8445306385796	|	22 |
| 8445306385802	|	18 |
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Verify EAN and RPO with db
| EAN           | qty  |
| 8445306385765 |	15 |
| 8445306385796	|	22 |
| 8445306385802	|	18 |
Then Print Confirmation and done
Then Goto Report>Order Status
Then Search for PO "8R00" 	
# Search for PO "6107" and Check Status "Processing"
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
	
	@testcase117
Scenario Outline: select 2 to 3 SKU and click on cart button then go to add to cart screen click on CPO, remove previews SKU and select new SKU also added previews .

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then Search Release PO page with CPO ID "7R01" 
Then Search supplier ID "6140"
#Then click on PO "6140" and select overage "3"
Then click on PO "7R01"
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |	
| 8445306234780 | 240 |		
| 8445306234810 | 215 |		
Then Addtocart
Then goto checkout page
Then Verify EAN and qty with DB
| EAN           | qty  |	
| 8445306234780 | 240 |		
| 8445306234810 | 215 |
Then Click on CPO "7R01"
Then Deselect all 
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |
| 8445306234780	|	235 |
| 8445306234803	|	455 |
Then Addtocart
Then goto checkout page
Then Verify EAN and qty with DB
| EAN           | qty  |
| 8445306234780	|	235 |
| 8445306234803	|	455 |
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Verify EAN and RPO with db
| EAN           | qty  |
| 8445306234780	|	235 |
| 8445306234803	|	455 |
Then Print Confirmation and done
Then Goto Report>Order Status
Then Search for PO "7R01" 
# Search for PO "6107" and Check Status "Processing"
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
		
		
@testcase118
Scenario Outline: Select SKU then go to shopping cart click on CPO,select overage check calculate properly or not and click on add to cart button.

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then Search Release PO page with CPO ID "7R03" 
Then Search supplier ID "1268"
Then click on PO "7R03"
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |	
| 8445306235381	| 42  |
| 8445306235718	| 180  |
| 8445306235688	| 95  |
Then Select overage "3"
Then Addtocart
Then goto checkout page
Then Verify EAN and qty with DB
| EAN           | qty  |	
| 8445306235381	| 42  |
| 8445306235718	| 180  |
| 8445306235688	| 95  |
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order	
Then Verify EAN and RPO with db
| EAN           | qty  |	
| 8445306235671	| 10  |
| 8445306235701	| 155  |
| 8445306235671	| 16  |
Then Print Confirmation and done
Then Goto Report>Order Status
Then Search for PO "7R02" 
# Search for PO "6107" and Check Status "Processing"
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
	
@testcase119
Scenario Outline: Normal and show confirm order in shopping cart check back forth operations also change qty both orders

Given Navigate user to Login Page "http://devrtrac.r-pac.com/" and "Chrome"
When title of login page
Then user enters "Test@123.com" and "User@123"
Then user clicks on login button
Then user is on home page
Then Search Release PO page with CPO ID "7R05" 
Then Search supplier ID "5583"
#Then click on PO "6140" and select overage "3"
Then click on PO "7R05"
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |	
| 8445306387233 | 28 |					
Then Addtocart
Then Show confirm orders 
Then With Confirm orders,Search Release PO page with CPO ID "8020" 
Then Search supplier ID "1471"
Then click on PO "8020"
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |
| 8445306619426	|	1090 |
Then Addtocart
Then goto checkout page
Then Verify All PO data with db
Then Click on CPO "7R05"
Then Deselect all 
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |	
| 8445306386885 | 19 |	
Then Addtocart
Then goto checkout page
Then Verify All PO data with db
Then Click on CPO "8020"
Then Deselect all 
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |
| 8445306619402	|	2300 |
Then Addtocart
Then goto checkout page
Then Verify All PO data with db
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Verify All RPO data with db
Then Print Confirmation and done
Then Goto Report>Order Status
#Then Search for PO "7R53" 
#Then Search for PO "7R06" 
# Search for PO "6107" and Check Status "Processing"
Then Logout
Then Close Browser	

Examples:
	| items | udateitems | 
	| 1111  | 2222  |
	
		
		