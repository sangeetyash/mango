package pageObjects;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
//import pageObjects.Wait;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;

public class ReleasePO {

	WebDriver driver;

//*[@id="tblPOMango"]/tbody/tr[1]/td[7]
	public ReleasePO(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void getPOScreen() throws InterruptedException {
		WebElement username = driver.findElement(By.className("Order"));
		username.click();
		getWait(4000);
		// *[@id="Release"]
		WebElement releasePO = driver.findElement(By.linkText("Release PO"));
		releasePO.click();
		getWait(3000);
		// *[@id="cssmenu"]/ul/li[2]/ul/li[4]
		// *[@id="Release"]
		// WebElement releasePO =driver.findElements(By.xpath("//*[@id="Release"]"));
		// WebElement releasePO=driver.findElement(By.className("Release"));
	}
	
	public void getInPlantPrintingbyPO() throws InterruptedException {
		WebElement username = driver.findElement(By.className("Order"));
		username.click();
		getWait(4000);
		// *[@id="Release"]
		WebElement releasePO = driver.findElement(By.linkText("In-Plant Printing by PO"));
		releasePO.click();
		getWait(3000);
		// *[@id="cssmenu"]/ul/li[2]/ul/li[4]
		// *[@id="Release"]
		// WebElement releasePO =driver.findElements(By.xpath("//*[@id="Release"]"));
		// WebElement releasePO=driver.findElement(By.className("Release"));
	}


	public void getrecords(String i) throws InterruptedException {
		// name=tblServiceBureauOrder_length
		Actions a = new Actions(driver);
		WebElement mainmenu = driver.findElement(By.xpath(".//*[@name='tblServiceBureauOrder_length']"));
		getWait(3000);
		a.moveToElement(mainmenu).build().perform();
		a.click();
		getWait(3000);
		// *[@id="tblServiceBureauOrder_length"]/label/select
		Select norecords = new Select(driver.findElement(By.name("tblServiceBureauOrder_length")));
		norecords.selectByValue(i);
		getWait(3000);
	}

	public void get100records() throws InterruptedException 
	{
		// name=tblServiceBureauOrder_length
		Actions a = new Actions(driver);
		WebElement mainmenu = driver.findElement(By.xpath(".//*[@name='tblServiceBureauOrder_length']"));
		getWait(3000);
		a.moveToElement(mainmenu).build().perform();
		a.click();
		getWait(3000);
		
		// *[@id="tblServiceBureauOrder_length"]/label/select
		Select norecords = new Select(driver.findElement(By.name("tblServiceBureauOrder_length")));
		norecords.selectByValue("100");
		getWait(3000);
	}

	public void selectFilter() throws InterruptedException {// *[@id="idIsShowChecked"]
															// *[@id="idIsShowChecked"]
															// class=btn btn-default btn-sm
															// *[@id="tblServiceBureauOrder_length"]/span[2]/span/a
															// *[@id="tblServiceBureauOrder_length"]/span[2]
															// *[@id="tblServiceBureauOrder_length"]/span[2]/span
															// *[@id="tblServiceBureauOrder_length"]/span[2]/span/a
															// *[@id="tblServiceBureauOrder_length"]/span[2]/span/a
		driver.findElement(By.className("btn btn-default btn-sm")).click();
		// driver.findElement(By.xpath(".//*[@id='tblServiceBureauOrder_length']/span[2]/span/a']")).click();
		// wait(1000);
	}

	public void searchCPO(String cpo) throws InterruptedException {
		// *[@id="searchId0"]
		WebElement seaech = driver.findElement(By.id("searchId0"));
		seaech.sendKeys(cpo);
		seaech.sendKeys(Keys.ENTER);
		// driver.findElement(By.id("searchId0")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		// driver.findElement(By.id("searchId0")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

		// *[@id="tblServiceBureauOrder"]/tbody/tr/td[1]/span/a
	}

	public void clickONPO(String PO) throws InterruptedException

	{

		//System.out.println("PO" + PO);
		driver.findElement(By.linkText(PO)).click();
		Thread.sleep(3000);

	}
	
	public void selectCOOContent(String COO,String gar,DataTable dtn) throws InterruptedException
	{
		//*[@id="ALMO_CLX01"]
		WebElement create = driver.findElement(By.xpath(".//*[@id='ALMO_CLX01']"));
		if(create.isDisplayed())
		{
			
			//ddlGarmentPart1
			//ddlFabComPart10
			//ddlPER10
			
	    	System.out.println("Create Button found");

			create.click();
			getWait(1500);

			Select COOSelect = new Select(driver.findElement(By.name("COOId")));
			System.out.println("COOSelect" + COO);
			COOSelect.selectByVisibleText(COO);
			getWait(1500);
			
			Select garSelect = new Select(driver.findElement(By.id("ddlGarmentPart1")));
			System.out.println("garSelect" + gar);
			garSelect.selectByVisibleText(gar);
			getWait(1500);
			
			List<Map<String, String>> list = dtn.asMaps(String.class, String.class);
		    int col=list.size();
		    int row=list.get(0).size();
		   
			/*
			 * int index = 0; for (WebElement option : dropDown.getOptions()) { if
			 * (option.getText().equalsIgnoreCase(fieldValue)) break; index++; }
			 * dropDown.selectByIndex(index);
			 */
	    	//System.out.println("col" + col);
	    	for(int i=0; i<list.size(); i++) 
	    	
	    	{
	    		
	   	    	String FabricComponentstr=(list.get(i).get("FabricComponent"));
		    	
		    	String Percentagestr=(list.get(i).get("Percentage"));
		    	
		    	Select ddlFabComPart10Select = new Select(driver.findElement(By.id("ddlFabComPart10")));
				System.out.println("ddlFabComPart10Select" + FabricComponentstr);
				ddlFabComPart10Select.selectByVisibleText(FabricComponentstr);
				getWait(1500);
				
				
				WebElement percent=driver.findElement(By.id("ddlPER10"));
				System.out.println("ddlPER10" + Percentagestr);
				percent.sendKeys(Percentagestr);
				getWait(1500);
				
			
	    	}
		}
		else 
		{
	    	System.out.println("Create Button not found");

		}
		
		
	}

	
	public void selectCareCode(DataTable dtnc) throws InterruptedException
	{
		List<Map<String, String>> list = dtnc.asMaps(String.class, String.class);
	    int col=list.size();
	    int row=list.get(0).size();
	   
		/*
		 * int index = 0; for (WebElement option : dropDown.getOptions()) { if
		 * (option.getText().equalsIgnoreCase(fieldValue)) break; index++; }
		 * dropDown.selectByIndex(index);
		 */
    	//System.out.println("col" + col);
    	for(int i=0; i<list.size(); i++) 
    	
    	{
    		
   	    	String Washstr=(list.get(i).get("Wash"));
	    	
	    	String Bleachstr=(list.get(i).get("Bleach"));
	    	
	    	String Ironingstr=(list.get(i).get("Ironing"));
	    	
	    	String DryCleaningstr=(list.get(i).get("DryCleaning"));

	    	String DryWiringstr=(list.get(i).get("DryWiring"));
	    	
	    	Select WashSelect = new Select(driver.findElement(By.name("WashId")));
			System.out.println("Wash" + Washstr);
			WashSelect.selectByVisibleText(Washstr);
			getWait(1500);

			Select BleachSelect = new Select(driver.findElement(By.name("BleachId")));
			System.out.println("BleachSelect" + Bleachstr);
			BleachSelect.selectByVisibleText(Bleachstr);
			getWait(1500);

			Select IroningSelect = new Select(driver.findElement(By.name("IronId")));
			System.out.println("IroningSelect" + Ironingstr);
			IroningSelect.selectByVisibleText(Ironingstr);
			getWait(1500);

			Select DryCleaningSelect = new Select(driver.findElement(By.name("DryCleanId")));
			System.out.println("DryCleaningSelect" + DryCleaningstr);
			DryCleaningSelect.selectByVisibleText(DryCleaningstr);
			getWait(1500);

			Select DryWiringSelect = new Select(driver.findElement(By.name("DryId")));
			System.out.println("DryWiringSelect" + DryWiringstr);
			DryWiringSelect.selectByVisibleText(DryWiringstr);
			getWait(1500);
    	} 	
	    	 
	}
	public void searchSupplier(String suppiler_id) throws InterruptedException {
		WebElement seaech1 = driver.findElement(By.id("searchId1"));
		seaech1.sendKeys(suppiler_id);
		seaech1.sendKeys(Keys.ENTER);
		// driver.findElement(By.id("searchId0")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);

	}

	public void showConfirmed() throws InterruptedException {
		// wait(2000);
		// *[@id="idIsShowChecked"]
		driver.findElement(By.id("idIsShowChecked")).click();
		Thread.sleep(1000);
	}

	public void selectOverage(String ove) throws InterruptedException {
		/*
		 * Actions a1= new Actions(driver); //*[@id="ddlOverage"] WebElement
		 * overage=driver.findElement(By.xpath(".//*[@name='Overage']")); getWait(1000);
		 * a1.moveToElement(overage).build().perform(); a1.click();
		 */
		getWait(3000);

		// *[@id="tblServiceBureauOrder_length"]/label/select

		Select over = new Select(driver.findElement(By.name("Overage")));
		//System.out.println("Overage" + over);
		for (int i = 1; i < 6; i++) {
			String a = Integer.toString(i);
			over.selectByValue(a);
			getWait(3000);
		}
		over.selectByValue(ove);
		getWait(3000);

	}

	public void selectAllItems() {
		// *[@id="selectAll"]
		WebElement allIems = driver.findElement(By.id("selectAll"));
		allIems.click();

	}
	
	public void clickonCPO(String CPO) throws InterruptedException
	{
		WebElement filter = driver.findElement(By.xpath("//div[@id='tblServiceBureauOrder_wrapper']/span[2]/span/a"));
		filter.click();
		WebElement searchPO=driver.findElement(By.id("searchId1"));
		searchPO.clear();
		//getWait(300);
		searchPO.sendKeys(CPO);
		searchPO.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		List<WebElement> itemsfiler1 = driver.findElements(By.xpath("//div[@id='dataTableContainer']/table/tbody/tr"));
		int trnofilter1 = itemsfiler1.size() + 1;
		//System.out.println("itemvise" + trnofilter1);
		
		for (int v = 1; v < 2; v++)
			{
			//System.out.println("inside");
				WebElement check = driver.findElement(By.xpath("//table[@id='tblServiceBureauOrder']/tbody/tr[" + v + "]/td[2]/span/a"));
				check.click();
			}
				getWait(5000);
				//selectAllItems();
				//*[@id="tblServiceBureauOrder"]/tbody/tr[1]/td[2]/span/a
	}
	//*[@id="tblServiceBureauOrder"]/tbody/tr[1]/td[2]/span/a
	/*
	 * public void itemvise() { System.out.println("itemvise");
	 * 
	 * HashMap<String,String> map1=new HashMap<String,String>();
	 * HashMap<String,String> map2=new HashMap<String,String>();
	 * 
	 * List<WebElement> itemsfiler=driver.findElements(By.xpath(
	 * "//table[@id='tblMangoOrderItemWise']/tbody/tr")); int
	 * trnofilter=itemsfiler.size()+1; System.out.println("itemvise" + trnofilter);
	 * for(int s=1 ; s < trnofilter ; s++ ) { WebElement
	 * icode=driver.findElement(By.xpath(
	 * "//table[@id='tblMangoOrderItemWise']/tbody/tr["+s+"]/td[1]")); WebElement
	 * iorgqty=driver.findElement(By.xpath(
	 * "//table[@id='tblMangoOrderItemWise']/tbody/tr["+s+"]/td[2]")); WebElement
	 * iordgqty=driver.findElement(By.xpath(
	 * "//table[@id='tblMangoOrderItemWise']/tbody/tr["+s+"]/td[3]"));
	 * System.out.println("("+icode.getText()+" , "+iorgqty.getText()+" , "+iordgqty
	 * .getText()+")");
	 * 
	 * map1.put(icode.getText(), iorgqty.getText()); map2.put(icode.getText(),
	 * iordgqty.getText()); // [@id="tblMangoOrderItemWise"]/tbody/tr[1]/td[1] }
	 * 
	 * 
	 * for( Entry<String, String> entry : map1.entrySet() ) { System.out.println(
	 * entry.getKey() + " => " + entry.getValue() ); } for( Entry<String, String>
	 * entry : map2.entrySet() ) { System.out.println( entry.getKey() + " => " +
	 * entry.getValue() ); }
	 * 
	 * }
	 */

	public void checkoverageCalculation() throws InterruptedException

	{

		//System.out.println("itemvise");

		HashMap<String, String> map11 = new HashMap<String, String>();
		HashMap<String, String> map21 = new HashMap<String, String>();
		HashMap<String, String> map3 = new HashMap<String, String>();
		HashMap<String, String> map4 = new HashMap<String, String>();

		List<WebElement> itemsfiler = driver.findElements(By.xpath("//table[@id='tblMangoOrderItemWise']/tbody/tr"));
		int trnofilter = itemsfiler.size() + 1;
		//System.out.println("itemvise" + trnofilter);
		for (int s = 1; s < trnofilter; s++)

		{
			WebElement icode = driver
					.findElement(By.xpath("//table[@id='tblMangoOrderItemWise']/tbody/tr[" + s + "]/td[1]"));
			WebElement iorgqty = driver
					.findElement(By.xpath("//table[@id='tblMangoOrderItemWise']/tbody/tr[" + s + "]/td[2]"));
			WebElement iordgqty = driver
					.findElement(By.xpath("//table[@id='tblMangoOrderItemWise']/tbody/tr[" + s + "]/td[3]"));
			String itemcode = icode.getText();
			String itemoriginalrqty = iorgqty.getText();
			String itemorderqty = iordgqty.getText();
			// System.out.println("("+icode.getText()+" , "+iorgqty.getText()+" ,
			// "+iordgqty.getText()+")");

			// String iorgqtyi=Integer.parseInt(iorgqty.getText());
			// String iordgqtyi=Integer.parseInt(iordgqty.getText());

			Thread.sleep(50);
			map11.put(itemcode, itemoriginalrqty);
			map21.put(itemcode, itemorderqty);

			// [@id="tblMangoOrderItemWise"]/tbody/tr[1]/td[1]
		}

		for (Entry<String, String> entry : map11.entrySet()) {
			System.out.println("Map1 -> " + entry.getKey() + " => " + entry.getValue());
		}

		for (Entry<String, String> entry : map21.entrySet()) {
			System.out.println("Map2 -> " + entry.getKey() + " => " + entry.getValue());
		}

		System.out.println("checkoverageCalculation");

		List<WebElement> items = driver.findElements(By.xpath("//div[@id='dataTableContainer']/table/tbody/tr"));
		int trno = items.size() + 1;

		int a = 0, b = 0;
		String c = "", d = "";
		//System.out.println("Size tr ->" + trno);
		for (int r = 1; r < trno; r++) {
			// driver.navigate().to(URL);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			// ((JavascriptExecutor) driver)
			// .executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(50);
			// *[@id="tblPOMango"]/tbody/tr[1]/td[5]
			WebElement check = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[1]"));
			check.click();
			WebElement PON = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[2]"));
			WebElement supplier = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[3]"));
			WebElement format = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[4]"));
			WebElement itemCode = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[5]"));
			WebElement EAN = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[6]"));
			WebElement OGqty = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[7]"));
			int orgqty = Integer.parseInt(OGqty.getText());
			WebElement orderqty = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[8]"));
			int orqty = Integer.parseInt(orderqty.getText());
			// System.out.println("("+PON.getText()+" , "+supplier.getText()+" ,
			// "+format.getText()+" , " +itemCode.getText()+" , "+EAN.getText()+" , "
			// +OGqty.getText()+" , "+orderqty.getText()+")");
			// if(check.isSelected()==true)
			String icode = itemCode.getText();
			/*
			 * if(check.isSelected()==false) { System.out.println("selected");
			 * 
			 * a=orgqty; b=orqty; c=String.valueOf(a); d=String.valueOf(b);
			 * 
			 * Thread.sleep(50); System.out.println("itemcode->"+icode +"original qty-> "+
			 * c); map3.put(icode, c); Thread.sleep(50);
			 * System.out.println("itemcode->"+icode +"Order qty-> "+ d); map4.put(icode,d);
			 * }
			 */
		}

		/*
		 * for (Entry<String, String> entry : map3.entrySet()) { //
		 * System.out.println("MAP3->"+ entry.getKey() + " => " + entry.getValue() ); }
		 * 
		 * for (Entry<String, String> entry : map4.entrySet()) { //
		 * System.out.println("MAP4->"+ entry.getKey() + " => " +entry.getValue() ); }
		  */
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, 0)"); 
		
	}
	
	public void selectPOEAN(DataTable dtEAN)throws InterruptedException
	{

		List<WebElement> items = driver.findElements(By.xpath("//div[@id='dataTableContainer']/table/tbody/tr"));
		int trno = items.size() + 1;
		
		int a = 0, b = 0;
		String c = "", d = "";
		//System.out.println("Size tr ->" + trno);
		for (int r = 1; r < trno; r++) {
			// driver.navigate().to(URL);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			// ((JavascriptExecutor) driver)
			// .executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(50);
			// *[@id="tblPOMango"]/tbody/tr[1]/td[5]
			
			WebElement PON = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[2]"));
			WebElement supplier = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[3]"));
			WebElement format = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[4]"));
			WebElement itemCode = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[5]"));
			WebElement EAN = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[6]"));
			WebElement OGqty = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[7]"));
			//*[@id="txtOrderQty_152553"]
			//*[@id="tblPOMango"]/tbody/tr[1]/td[8]
			int orgqty = Integer.parseInt(OGqty.getText());
			WebElement orderqty = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[8]"));
			int orqty = Integer.parseInt(orderqty.getText());
			// System.out.println("("+PON.getText()+" , "+supplier.getText()+" ,
			// "+format.getText()+" , " +itemCode.getText()+" , "+EAN.getText()+" , "
			// +OGqty.getText()+" , "+orderqty.getText()+")");
			// if(check.isSelected()==true)
			String icode = itemCode.getText();
			
		    List<List<String>> rows = dtEAN.asLists(String.class);
		    int len=rows.get(0).size();
	    	//System.out.println("len" + len);

		    for(int aa=0 ; aa < len; aa++)
		    {
		    	String EANN=EAN.getText();
		    	//System.out.println("EANN" + EANN);
		    	String EANC=(rows.get(0).get(aa));
		    	//System.out.println("EANC" + EANC);

		    	if (EANN.equalsIgnoreCase(EANC))
		    	{
			    	//System.out.println("Inside");

		    		WebElement check = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[1]"));
					check.click();
				
		    	}
		    }
			
			/*
			 * if(check.isSelected()==false) { System.out.println("selected");
			 * 
			 * a=orgqty; b=orqty; c=String.valueOf(a); d=String.valueOf(b);
			 * 
			 * Thread.sleep(50); System.out.println("itemcode->"+icode +"original qty-> "+
			 * c); map3.put(icode, c); Thread.sleep(50);
			 * System.out.println("itemcode->"+icode +"Order qty-> "+ d); map4.put(icode,d);
			 * }
			 */
		}

		/*
		 * for (Entry<String, String> entry : map3.entrySet()) { //
		 * System.out.println("MAP3->"+ entry.getKey() + " => " + entry.getValue() ); }
		 * 
		 * for (Entry<String, String> entry : map4.entrySet()) { //
		 * System.out.println("MAP4->"+ entry.getKey() + " => " +entry.getValue() ); }
		  */
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, 0)"); 
		
		
	}
	
	public void deselectSelectPOEAN(DataTable dtEANA)throws InterruptedException
	{
		selectAllItems();
		List<WebElement> items = driver.findElements(By.xpath("//div[@id='dataTableContainer']/table/tbody/tr"));
		int trno = items.size() + 1;
		selectAllItems();

		int a = 0, b = 0;
		String c = "", d = "";
		//System.out.println("Size tr ->" + trno);
		for (int r = 1; r < trno; r++) {
			// driver.navigate().to(URL);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			// ((JavascriptExecutor) driver)
			// .executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(50);
			// *[@id="tblPOMango"]/tbody/tr[1]/td[5]
			
			WebElement PON = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[2]"));
			WebElement supplier = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[3]"));
			WebElement format = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[4]"));
			WebElement itemCode = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[5]"));
			WebElement EAN = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[6]"));
			WebElement OGqty = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[7]"));
			int orgqty = Integer.parseInt(OGqty.getText());
			WebElement orderqty = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[8]"));
			int orqty = Integer.parseInt(orderqty.getText());
			// System.out.println("("+PON.getText()+" , "+supplier.getText()+" ,
			// "+format.getText()+" , " +itemCode.getText()+" , "+EAN.getText()+" , "
			// +OGqty.getText()+" , "+orderqty.getText()+")");
			// if(check.isSelected()==true)
			String icode = itemCode.getText();
			
		    List<List<String>> rows = dtEANA.asLists(String.class);
		    int len=rows.get(0).size();
	    	//System.out.println("len" + len);

		    for(int aa=0 ; aa < len; aa++)
		    {
		    	String EANN=EAN.getText();
		    	//System.out.println("EANN" + EANN);
		    	String EANC=(rows.get(0).get(aa));
		    	//System.out.println("EANC" + EANC);

		    	if (EANN.equalsIgnoreCase(EANC))
		    	{
			    	//System.out.println("Inside");

		    		WebElement check = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[1]"));
					check.click();	
		    	}
		    }
			
			/*
			 * if(check.isSelected()==false) { System.out.println("selected");
			 * 
			 * a=orgqty; b=orqty; c=String.valueOf(a); d=String.valueOf(b);
			 * 
			 * Thread.sleep(50); System.out.println("itemcode->"+icode +"original qty-> "+
			 * c); map3.put(icode, c); Thread.sleep(50);
			 * System.out.println("itemcode->"+icode +"Order qty-> "+ d); map4.put(icode,d);
			 * }
			 */
		}

		/*
		 * for (Entry<String, String> entry : map3.entrySet()) { //
		 * System.out.println("MAP3->"+ entry.getKey() + " => " + entry.getValue() ); }
		 * 
		 * for (Entry<String, String> entry : map4.entrySet()) { //
		 * System.out.println("MAP4->"+ entry.getKey() + " => " +entry.getValue() ); }
		  */
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, 0)"); 
		
	}

	public void selectPOEANEditOqty(DataTable dtEANAEditqty)throws InterruptedException
	{

		List<WebElement> items = driver.findElements(By.xpath("//div[@id='dataTableContainer']/table/tbody/tr"));
		int trno = items.size() + 1;
		
		int a = 0, b = 0;
		String c = "", d = "";
		//System.out.println("Size tr ->" + trno);
		for (int r = 1; r < trno; r++) {
			// driver.navigate().to(URL);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			// ((JavascriptExecutor) driver)
			// .executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(50);
			// *[@id="tblPOMango"]/tbody/tr[1]/td[5]
			//*[@id="tblPODetails"]/tbody/tr[1]/td[1]
			//*[@id="tblPODetails"]/tbody/tr[1]/td[1]
			WebElement vendorID = driver.findElement(By.xpath("//table[@id='tblPODetails']/tbody/tr[" + r + "]/td[1]"));
			WebElement itemCode = driver.findElement(By.xpath("//table[@id='tblPODetails']/tbody/tr[" + r + "]/td[2]"));
			WebElement OGqty = driver.findElement(By.xpath("//table[@id='tblPODetails']/tbody/tr[" + r + "]/td[3]"));
			WebElement orderqty = driver.findElement(By.xpath("//table[@id='tblPODetails']/tbody/tr[" + r + "]/td[4]/input"));
			WebElement EAN = driver.findElement(By.xpath("//table[@id='tblPODetails']/tbody/tr[" + r + "]/td[5]"));
			orderqty.clear();
			orderqty.sendKeys("0");
			//WebElement EAN = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[6]"));
			//WebElement supplier = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[3]"));
			//WebElement format = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[4]"));
			
			//int orqty = Integer.parseInt(orderqty.getText());
			// System.out.println("("+PON.getText()+" , "+supplier.getText()+" ,
			// "+format.getText()+" , " +itemCode.getText()+" , "+EAN.getText()+" , "
			// +OGqty.getText()+" , "+orderqty.getText()+")");
			// if(check.isSelected()==true)
			//String vendorCode = itemCode.getText();

			List<Map<String, String>> list = dtEANAEditqty.asMaps(String.class, String.class);
		    int col=list.size();
		    int row=list.get(0).size();

	    	//System.out.println("col" + col);
	    	for(int i=0; i<list.size(); i++) 
	    	
	    	{
	    		
	    		
	    		String EANN=EAN.getText();
		    	String EANC=(list.get(i).get("EAN"));
		    	
				String itemsCode = itemCode.getText();
		    	String itemCodeC=(list.get(i).get("ItemCode"));
		    	
				
				//String ordqtyC = (list.get(i).get("ItemCode"));
		    	String corqtyC=(list.get(i).get("qty"));
		    	
		    	 
		    	//System.out.println("Customer order qty" + corqty);
		    	

		    	if (EANN.equalsIgnoreCase(EANC) && itemsCode.equalsIgnoreCase(itemCodeC))
		    	{
		    		System.out.println("Customer ItemCode->" +list.get(i).get("ItemCode"));
		    		System.out.println("Customer EAN->" +list.get(i).get("EAN"));
		    		System.out.println("Customer order qty->" +list.get(i).get("qty"));

		    		//WebElement check = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[1]"));
					//check.click();
			    	
		    		 orderqty=null;	
					 orderqty = driver.findElement(By.xpath("//table[@id='tblPODetails']/tbody/tr[" + r + "]/td[4]/input"));
					 
					 Actions actions = new Actions(driver);
					 actions.moveToElement(orderqty);
					 actions.perform();
					 orderqty.clear();
					 //wait(1500);
					 orderqty.sendKeys(corqtyC);
					//*[@id="heading"]
					//*[@id="spnPODetails"]
					 js.executeScript("window.scrollTo(0, 0)"); 
		    	}
	    	}
	    	 //JavascriptExecutor js = (JavascriptExecutor) driver;
			 	
		}

		
		
		
		
	}
	
	public void deselectSelectPOEANEditQty(DataTable dtEANAEditqty)throws InterruptedException
	{
		selectAllItems();
		List<WebElement> items = driver.findElements(By.xpath("//div[@id='dataTableContainer']/table/tbody/tr"));
		int trno = items.size() + 1;
		selectAllItems();

		int a = 0, b = 0;
		String c = "", d = "";
		//System.out.println("Size tr ->" + trno);
		for (int r = 1; r < trno; r++) {
			// driver.navigate().to(URL);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			// ((JavascriptExecutor) driver)
			// .executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(50);
			// *[@id="tblPOMango"]/tbody/tr[1]/td[5]
			
			WebElement PON = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[2]"));
			WebElement supplier = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[3]"));
			WebElement format = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[4]"));
			WebElement itemCode = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[5]"));
			WebElement EAN = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[6]"));
			WebElement OGqty = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[7]"));
			int orgqty = Integer.parseInt(OGqty.getText());
			WebElement orderqty = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[8]/input"));
			int orqty = Integer.parseInt(orderqty.getText());
			// System.out.println("("+PON.getText()+" , "+supplier.getText()+" ,
			// "+format.getText()+" , " +itemCode.getText()+" , "+EAN.getText()+" , "
			// +OGqty.getText()+" , "+orderqty.getText()+")");
			// if(check.isSelected()==true)
			String icode = itemCode.getText();
			
			List<Map<String, String>> list = dtEANAEditqty.asMaps(String.class, String.class);
		    int col=list.get(0).size();
		    int row=list.get(0).size();

	    	//System.out.println("col" + col);
	    	for(int i=0; i<list.size(); i++) {
	    		//System.out.println(list.get(i).get(0));
	    		//System.out.println(list.get(i).get(1));
	    		
	    		String EANN=EAN.getText();
		    	//System.out.println("EANN" + EANN);
		    	String EANC=(list.get(i).get(0));
		    	//System.out.println("EANC" + EANC);
		    	String corqty=(list.get(i).get(1));
		    	//System.out.println("Customer order qty" + corqty);


		    	if (EANN.equalsIgnoreCase(EANC))
		    	{
			    	//System.out.println("Inside");

		    		WebElement check = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[1]"));
					check.click();	
					WebElement orderqtyn = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[8]/input"));
					orderqtyn.clear();
					orderqtyn.sendKeys(corqty);
					
		    	}
	    	}
			/*
			 * for(int aa=0 ; aa < col; aa++) { String EANN=EAN.getText();
			 * System.out.println("EANN" + EANN); String EANC=(rows.get(0).get(aa));
			 * System.out.println("EANC" + EANC);
			 * 
			 * if (EANN.equalsIgnoreCase(EANC)) { System.out.println("Inside");
			 * 
			 * WebElement check =
			 * driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r +
			 * "]/td[1]")); check.click();
			 * 
			 * } }
			 */
			
			/*
			 * if(check.isSelected()==false) { System.out.println("selected");
			 * 
			 * a=orgqty; b=orqty; c=String.valueOf(a); d=String.valueOf(b);
			 * 
			 * Thread.sleep(50); System.out.println("itemcode->"+icode +"original qty-> "+
			 * c); map3.put(icode, c); Thread.sleep(50);
			 * System.out.println("itemcode->"+icode +"Order qty-> "+ d); map4.put(icode,d);
			 * }
			 */
		}

		/*
		 * for (Entry<String, String> entry : map3.entrySet()) { //
		 * System.out.println("MAP3->"+ entry.getKey() + " => " + entry.getValue() ); }
		 * 
		 * for (Entry<String, String> entry : map4.entrySet()) { //
		 * System.out.println("MAP4->"+ entry.getKey() + " => " +entry.getValue() ); }
		  */
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0, 0)"); 
		
	}

	public void addToCartsucess() throws InterruptedException 
	{
		// *[@id="smartAlertScrollArea"]
		// *[@id="smartAlertButtons"]/div
		//*[@id="smartAlertButtons"]/div
		WebElement ok = driver.findElement(By.xpath(".//*[@id='smartAlertButtons']/div"));
		getWait(3000);
		// WebElement ok=driver.findElement(By.className("smartAlertButton
		// smartAlertActive"));
		ok.click();
	}
	public void qtyAlert() throws InterruptedException 
	{
		// *[@id="smartAlertScrollArea"]
		// *[@id="smartAlertButtons"]/div
		//*[@id="smartAlertButtons"]/div
		WebElement ok = driver.findElement(By.xpath(".//*[@id='smartAlertButtons']/div"));
		getWait(3000);
		// WebElement ok=driver.findElement(By.className("smartAlertButton
		// smartAlertActive"));
		ok.click();
	}
	public void addToCart() throws InterruptedException 
	{
		getWait(3000);
		// *[@id="btnAddtoCart"]
		WebElement addToCart = driver.findElement(By.id("btnAddtoCart"));
		addToCart.click();
		getWait(3000);
		//System.out.println("^addtocart");

	}
	
	public String submit() throws InterruptedException
	{
		String rpoListString="";
		getWait(3000);
		// *[@id="btnAddtoCart"]
		WebElement addToCart = driver.findElement(By.id("btnAddtoCart"));
		addToCart.click();
		getWait(3000);
		
		WebElement rpomsgelement=driver.findElement(By.xpath(".//*[@id='smartAlertScrollArea']"));
		String success=rpomsgelement.getText();
		rpoListString=success.substring(37);
		System.out.println("RPO No. ->"+rpoListString);
		//*[@id="smartAlertScrollArea"]
		
		addToCartsucess();
		
		return rpoListString;
	}
	
	//*[@id="smartAlertScrollArea"]
	//smartAlertButton smartAlertActive
	//*[@id="smartAlertButtons"]

	public void addToCartWithDoubleClick() throws InterruptedException 
	{
		getWait(3000);
		// *[@id="btnAddtoCart"]
		Actions actions = new Actions(driver);
		WebElement elementLocator = driver.findElement(By.id("btnAddtoCart"));
		actions.doubleClick(elementLocator).perform();
		getWait(5000);
		System.out.println("^addtocart with double click");

	}
	
	public void getWait(int a) throws InterruptedException 
	{
		Thread.sleep(a);
	}
	
	public String[][] newq() throws InterruptedException
	{
		String[][] newArr=new  String[50][50];
		
		List<WebElement> items = driver.findElements(By.xpath("//div[@id='dataTableContainer']/table/tbody/tr"));
		int trno = items.size() + 1;
	
		//System.out.println("Size tr ->" + trno);
		for (int r = 1; r < trno; r++)
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
			Thread.sleep(50);
			WebElement check = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[1]"));
		//	WebElement PON = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[2]"));
		//	WebElement supplier = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[3]"));
		//	WebElement format = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[4]"));
			WebElement itemCode = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[5]"));
			WebElement EAN = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[6]"));
			WebElement OGqty = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[7]"));
			//int orgqty = Integer.parseInt(OGqty.getText());
			WebElement orderqty = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[8]"));
			//int orqty = Integer.parseInt(orderqty.getText());
			
			String icode = itemCode.getText();
			//System.out.println("itemCode ->"+icode);

			String sEAN=EAN.getText();
			//System.out.println("EAN ->"+sEAN);
			String sOqty=OGqty.getText();
			//System.out.println("Original qty ->"+sOqty);
			String sOrqty=orderqty.getText();
			//System.out.println("Order qty ->"+sOrqty);
			//System.out.println("Before check ->"+check.isSelected());
			//*[@id="selectAll"]
			//WebElement selectall=driver.findElement(By.xpath("//*[@id='selectAll'"));
			
			if (check.isSelected()==false)
			{
				//System.out.println("check ->"+r);

				newArr[r-1][0]=icode;
				newArr[r-1][1]=sEAN;
				newArr[r-1][2]=sOqty;
				newArr[r-1][3]=sOrqty;

			}
			
			//System.out.println("Array length in printArry->"+newArr.length);

		}
		//System.out.println("Array length in ->"+newArr.length);

		return newArr; 	
	}
	
	public void printArry() throws InterruptedException
	{
		String[][] newArra=newq();
		//System.out.println("Array length in printArry->"+newArra.length);
		for (int i = 0; i < newArra.length; i++) 
		{	  
            // Loop through all elements of current row 
            for (int j = 0; j < newArra[i].length; j++) 
            {
            	if(newArra[i][j]!=null)
            	{
                System.out.print(newArra[i][j]+"\r"); 
            	}
                //System.out.print("\n"); 
            }
		}    
	}
	
	public String[][] arryEAN(DataTable dte) throws InterruptedException
	{
		
		String[][] newArrEAN=new String[50][50];

		List<WebElement> items = driver.findElements(By.xpath("//div[@id='dataTableContainer']/table/tbody/tr"));
		int trno = items.size() + 1;
	
			
			//System.out.println("Size tr ->" + trno);
			for (int r = 1; r < trno; r++) {
				// driver.navigate().to(URL);
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			
				Thread.sleep(50);
			
				//WebElement PON = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[2]"));
				//WebElement supplier = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[3]"));
				//WebElement format = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[4]"));
				WebElement itemCode = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[5]"));
				WebElement EAN = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[6]"));
				WebElement OGqty = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[7]"));
				
				WebElement orderqty = driver.findElement(By.xpath("//table[@id='tblPOMango']/tbody/tr[" + r + "]/td[8]"));
				
			    List<List<String>> rows = dte.asLists(String.class);
			    int len=rows.get(0).size();
		    	//System.out.println("len" + len);
		
			    for(int aa=0 ; aa < len; aa++)
			    {
			    	String EANN=EAN.getText();
			    	//System.out.println("EANN" + EANN);
			    	String EANC=(rows.get(0).get(aa));
			    	//System.out.println("EANC" + EANC);
		
			    	if (EANN.equalsIgnoreCase(EANC))
			    	{
			    		String icode = itemCode.getText();
						//System.out.println("itemCode ->"+icode);

						String sEAN=EAN.getText();
						//System.out.println("EAN ->"+sEAN);
						String sOqty=OGqty.getText();
						//System.out.println("Original qty ->"+sOqty);
						String sOrqty=orderqty.getText();
						//System.out.println("Order qty ->"+sOrqty);
						
						newArrEAN[r-1][0]=icode;
						newArrEAN[r-1][1]=sEAN;
						newArrEAN[r-1][2]=sOqty;
						newArrEAN[r-1][3]=sOrqty;					
			    	}
			    }
				
				
			}
		
			
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollTo(0, 0)"); 
			
	return newArrEAN;
		
	}
	
	public void printArryEAN(DataTable dte) throws InterruptedException
	{
		String[][] newArraean=arryEAN(dte);
		//System.out.println("Array length in printArry->"+newArraean.length);
		for (int i = 0; i < newArraean.length; i++) 
		{	 
			
            // Loop through all elements of current row 
            for (int j = 0; j < newArraean[i].length; j++) 
            {
            	int d=((newArraean[i].length )- 1);
            	if(newArraean[i][j]!=null)
            	{
               // System.out.print(newArraean[i][j]+" , ");
                if (j == d) { //System.out.print("\n"); }
            	}
				/*
				 * if (j == d) { System.out.print("\n"); }
				 */
            }
		}    
	}
	}
}

