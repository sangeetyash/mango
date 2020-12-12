Feature: R-PAC Mango CRM E-Coomerece Feature 


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
#dsds
#dsds
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
Then Search Release PO page with CPO ID "8004"
Then Search supplier ID "6117"
Then click on PO "8004"
Then Select PO items based on EAN and click addtocart
| 8445306251169 | 8445306399090	 |
Then goto checkout page
Then Verify POData EAN with DB
| 8445306251169 | 8445306399090	 |
Then Click on CPO "8004"
Then Deselect all
Then Select PO items based on EAN and click addtocart
| 8445306399083 | 8445306251169 | 8445306399090	 |
Then goto checkout page
Then Verify POData EAN with DB
| 8445306399083 | 8445306251169 | 8445306399090	 |
Then Select Bill To,Ship To,selct Production location Vendor PO, Requird Shipment Date  
Then Confirm Order
Then Verify EAN RPO with db
| 8445306399083 | 8445306251169 | 8445306399090	 |
Then Print Confirmation and done
Then Goto Report>Order Status
Then Search for PO "8004"
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
Then Search Release PO page with CPO ID "7R07" 
Then Search supplier ID "5583"
#Then click on PO "6140" and select overage "3"
Then click on PO "7R07"
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |	
| 8445306387295 | 68 |					
Then Addtocart
Then Show confirm orders 
Then With Confirm orders,Search Release PO page with CPO ID "8R03" 
Then Search supplier ID "1156"
Then click on PO "8R03"
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |
| 8445306385420	|	5090 |
Then Addtocart
Then goto checkout page
Then Verify All PO data with db
Then Click on CPO "7R07"
Then Deselect all 
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |	
| 8445306386908 | 19 |	
Then Addtocart
Then goto checkout page
Then Verify All PO data with db
Then Click on CPO "8R03"
Then Deselect all 
Then Select PO items based on EAN plus edit order qty
| EAN           | qty  |
| 9900010144248	|	5300 |
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
	
		
		