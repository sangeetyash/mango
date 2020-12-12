package pageObjects;

public class sample {

	/*
	 * package testcases;
	 * 
	 * 
	 * import org.apache.commons.lang3.StringUtils; import
	 * org.testng.annotations.Test; import java.awt.Robot; import
	 * org.openqa.selenium.Point; import org.testng.annotations.Parameters; import
	 * org.testng.annotations.DataProvider; import
	 * org.testng.annotations.BeforeTest; import java.util.concurrent.TimeUnit;
	 * import org.openqa.selenium.By; import org.openqa.selenium.WebDriver; import
	 * org.openqa.selenium.WebElement; import
	 * org.openqa.selenium.chrome.ChromeDriver; import
	 * org.openqa.selenium.chrome.ChromeOptions; import
	 * org.openqa.selenium.firefox.FirefoxDriver; import
	 * org.openqa.selenium.firefox.FirefoxProfile; import
	 * org.openqa.selenium.firefox.internal.ProfilesIni; import
	 * org.openqa.selenium.ie.InternetExplorerDriver; import
	 * org.openqa.selenium.interactions.Actions; import
	 * org.openqa.selenium.opera.OperaDriver; import
	 * org.openqa.selenium.remote.DesiredCapabilities; import
	 * org.openqa.selenium.remote.RemoteWebDriver; import
	 * org.openqa.selenium.support.ui.Select; import
	 * org.testng.annotations.AfterTest; import java.io.File; import
	 * java.io.FileInputStream; import java.io.FileNotFoundException; import
	 * java.io.IOException; import java.io.InputStream; import java.util.ArrayList;
	 * import java.util.Arrays; import java.util.List; import java.util.Properties;
	 * 
	 * 
	 * 
	 * //import org..selenium.Keys; //import
	 * org.openqa.selenium.interactions.Action; //import java.awt.event.InputEvent;
	 * //import com.gargoylesoftware.htmlunit.util.StringUtils; //import
	 * com.gargoylesoftware.htmlunit.util.StringUtils; import
	 * org.openqa.selenium.Keys; import com.google.common.collect.Table; import
	 * javax.swing.GroupLayout.Alignment;
	 * 
	 * 
	 * public class NewSuite { public WebDriver driver; public String
	 * URL,loginURL,restroURL,checkoutURL,logoutURL,host,username,elementString,
	 * password=""; int test=0; int logout,elementfound=0; int i,n,t=0; int alert=0;
	 * int ycor,xcor=0; String baseUrl = "https://www.scootsy.com"; String
	 * expectedTitle =
	 * "Online Shopping and Food Delivery from Best Restaurants in Mumbai | Scootsy"
	 * ; String actualTitle,VenderID = ""; WebElement addressLoc; String
	 * favorite="";
	 * 
	 * //@Test(dataProvider = "LoginCredentials")
	 * 
	 * @Test
	 * 
	 * @Parameters({"UserId","Password","Restaurant","Item"}) public void
	 * EndToEndFlow(String UserId, String Password,String Restaurant,String Item)
	 * throws Exception
	 * 
	 * { driver.get("https://www.scootsy.com");
	 * //driver.manage().window().maximize();
	 * 
	 * driver.findElement(By.linkText("Login")).click();
	 * driver.switchTo().frame("fancybox-frame");
	 * 
	 * String str=Item; ArrayList<String> aList= new
	 * ArrayList<String>(Arrays.asList(str.split(",")));
	 * 
	 * for(int i=0;i<aList.size();i++) { System.out.println(" Item Number"+ i+1
	 * +"-->"+aList.get(i).trim()); }
	 * 
	 * try { WebElement userID= driver.findElement(By.id("login_email"));
	 * userID.clear();
	 * 
	 * wait(500);
	 * 
	 * userID.sendKeys(UserId); System.out.println("Email ID or Mobile Number=" +
	 * UserId);
	 * 
	 * wait(500);
	 * 
	 * WebElement password=
	 * driver.findElement(By.xpath("//input[@id='login_password']"));
	 * password.clear();
	 * 
	 * wait(500);
	 * 
	 * password.sendKeys(Password); System.out.println("Password=" + Password);
	 * 
	 * WebElement element2 =driver.findElement(By.id("loginBtn")); element2.click();
	 * 
	 * wait(1000);
	 * 
	 * driver.switchTo().defaultContent();
	 * 
	 * 
	 * 
	 * driver.findElement(By.className("transition")).click(); WebElement
	 * el3=driver.findElement(By.xpath(
	 * "/html/body/section/section[1]/div/ul[2]/li[1]")); el3.click();
	 * 
	 * System.out.println("el3"+el3);
	 * 
	 * 
	 * 
	 * searchVendorPlaceOrder(Restaurant,Item); wait(500); }
	 * 
	 * catch(Exception e) { System.out.println("EndToEndFlow Exception --> " + e); }
	 * wait(500);
	 * 
	 * }
	 * 
	 * @DataProvider public Object[][] LoginCredentials()
	 * 
	 * { Object[][] Cred = new Object[6][2];
	 * 
	 * Cred[0][0] = "dummy"; Cred[0][1] = "dummy1";
	 * 
	 * Cred[1][0] = "truptim.koli@gmail.com"; Cred[1][1] = "dummy";
	 * 
	 * Cred[2][0] = ""; Cred[2][1] = "";
	 * 
	 * Cred[3][0] = "truptim.koli@gmail.com"; Cred[3][1] = "";
	 * 
	 * Cred[4][0] = "truptim.koli32@gmail.com"; Cred[4][1] = "dummy";
	 * 
	 * Cred[5][0] = "sangeet@scootsy.com"; Cred[5][1] = "sangeet@123";
	 * 
	 * return Cred; }
	 * 
	 * public void readPropertiesFile()
	 * 
	 * { InputStream is = null; Properties prop = null; try { prop = new
	 * Properties(); is = new FileInputStream(new
	 * File("D:\\Sangeet Data\\appium\\work space\\HybridFrameWork\\cloud.properties"
	 * )); prop.load(is);
	 * 
	 * System.out.println("db.mainurl: "+prop.getProperty("db.mainURL"));
	 * URL=prop.getProperty("mainURL");
	 * 
	 * System.out.println("db.loginURL: "+prop.getProperty("db.loginURL"));
	 * loginURL=prop.getProperty("db.loginURL");
	 * 
	 * System.out.println("db.host: "+prop.getProperty("db.host"));
	 * host=prop.getProperty("db.host");
	 * 
	 * System.out.println("db.user: "+prop.getProperty("db.user"));
	 * username=prop.getProperty("db.user");
	 * 
	 * System.out.println("db.password: "+prop.getProperty("db.password"));
	 * password=prop.getProperty("db.password");
	 * 
	 * System.out.println("db.retrolistingURL: "+prop.getProperty(
	 * "db.retrolistingURL")); restroURL=prop.getProperty("db.retrolistingURL");
	 * 
	 * System.out.println("db.checkoutURL: "+prop.getProperty("db.checkoutURL"));
	 * checkoutURL=prop.getProperty("db.checkoutURL");
	 * 
	 * System.out.println("db.logoutURL: "+prop.getProperty("db.logoutURL"));
	 * logoutURL=prop.getProperty("db.logoutURL"); }
	 * 
	 * catch (FileNotFoundException e) {
	 * System.out.println("readPropertiesFile FileNotFoundException ->"+e); }
	 * 
	 * catch (IOException e) {
	 * System.out.println("readPropertiesFile IOException ->"+e); } }
	 * 
	 * @BeforeTest
	 * 
	 * @Parameters({"browser"}) public void beforeTest(String browser) throws
	 * Exception {
	 * 
	 * System.out.println("in befo	reTest"); readPropertiesFile();
	 * 
	 * if(browser.equalsIgnoreCase("firefox")) { //ProfilesIni profile = new
	 * ProfilesIni(); //FirefoxProfile myprofile = profile.getProfile("QAProfile");
	 * System.out.println("Executing TestCases in Browser :->" +browser);
	 * System.setProperty(
	 * "webdriver.gecko.driver","D:\\Sangeet Data\\appium\\SeleniumBrowser\\geckodriver1.exe"
	 * ); //myprofile.setPreference("dom.webnotifications.enabled", true); //driver
	 * = new FirefoxDriver(myprofile); driver = new FirefoxDriver();
	 * driver.manage().window().maximize();
	 * 
	 * 
	 * }
	 * 
	 * else if(browser.equalsIgnoreCase("chrome"))
	 * 
	 * { System.out.println("Executing TestCases in Browser :->" +browser);
	 * System.setProperty(
	 * "webdriver.chrome.driver","D:\\Sangeet Data\\appium\\chromedriver_win32\\chromedriver1.exe"
	 * ); ChromeOptions options = new ChromeOptions();
	 * options.addArguments("disable-infobars"); driver = new ChromeDriver(options);
	 * }
	 * 
	 * else if(browser.equalsIgnoreCase("ie"))
	 * 
	 * { System.out.println("Executing TestCases in Browser :->" +browser);
	 * System.setProperty(
	 * "webdriver.ie.driver","D:\\Sangeet Data\\appium\\IEDriverServer_x64_3.14.0 (1)\\IEDriverServer.exe"
	 * ); //System.setProperty("webdriver.ie.driver",
	 * "D:\\Sangeet Data\\appium\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	 * DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
	 * capabilities.setCapability
	 * (InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true
	 * ); driver = new InternetExplorerDriver();
	 * //driver.manage().window().maximize(); }
	 * 
	 * else if(browser.equalsIgnoreCase("opera"))
	 * 
	 * { System.out.println("Executing TestCases in Browser :->" +browser);
	 * System.setProperty(
	 * "webdriver.opera.driver","D:\\Sangeet Data\\appium\\operadriver_win32\\operadriver_win32\\operadriver.exe"
	 * ); DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
	 * capabilities.setCapability
	 * (InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true
	 * ); driver = new OperaDriver(); }
	 * 
	 * else if(browser.equalsIgnoreCase("safari"))
	 * 
	 * { System.out.println("Executing TestCases in Browser :->" +browser); }
	 * 
	 * else
	 * 
	 * { throw new Exception("Browser is not correct"); }
	 * 
	 * driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 * 
	 * }
	 * 
	 * @AfterTest public void afterTest() throws Exception
	 * 
	 * { System.out.println("in afterTest"); wait(500); //driver.get(logoutURL);
	 * //wait(500)(1000); //driver.quit(); }
	 * 
	 * public void wait(int i) throws InterruptedException
	 * 
	 * { Thread.sleep(i); }
	 * 
	 * 
	 * public void searchVendorPlaceOrder(String vendorName,String itemName) throws
	 * InterruptedException
	 * 
	 * { try { System.out.println("retro URL=" + restroURL);
	 * 
	 * driver.get("https://www.scootsy.com/restaurants/mumbai/"); //
	 * driver.get("https://www.scootsy.com/restaurants/mumbai/"); wait(1000);
	 * 
	 * Select oSelect = new Select(driver.findElement(By.id("featureFilters")));
	 * 
	 * //Select oSelect = new Select(driver.findElement(By.id("sort_by")));
	 * 
	 * oSelect.selectByVisibleText("Popularity"); wait(5000);
	 * oSelect.selectByVisibleText("All"); wait(5000);
	 * 
	 * //oSelect.selectByVisibleText("Newly Added"); //wait(5000);
	 * oSelect.selectByVisibleText("Healthy"); wait(5000);
	 * 
	 * getFilterData(); currentLocation();
	 * 
	 * //dynamicLocation("Lower Parel"); //System.out.println("Vendor Name=" +
	 * vendorName); //System.out.println("Item Name=" + itemName);
	 * 
	 * 
	 * wait(500); WebElement
	 * chkVeg=driver.findElement(By.xpath("//*[@title='Only Veg']"));
	 * 
	 * chkVeg.click(); wait(500);
	 * 
	 * chkVeg.click(); wait(500);
	 * 
	 * chkVeg.click(); wait(500);
	 * 
	 * chkVeg.click(); wait(500);
	 * 
	 * WebElement txtVendorSearch =driver.findElement(By.id("search"));
	 * txtVendorSearch.sendKeys(vendorName); wait(500);
	 * 
	 * 
	 * WebElement searchvendor=driver.findElement(By.xpath("//*[@title='" +
	 * vendorName + "']"));
	 * 
	 * 
	 * String xpath=getXPathn(searchvendor); CommandLineTable resto=new
	 * CommandLineTable(); resto.setShowVerticalLines(true);
	 * resto.setHeaders("Vendor ID","Vendor Name","Open/Closed","Delivery Time"
	 * ,"Item Name","isFavourite","Vendor URL"); //{ //li[@id="vendor_3112"]/div[1]
	 * String xpath1=xpath.substring(xpath.lastIndexOf("=") + 1,
	 * xpath.lastIndexOf("/")); //System.out.println("vendor xpath1->"+xpath1 );
	 * 
	 * String new12=xpath1.substring(1, xpath1.length() - 2);
	 * //System.out.println("vendor new12->"+new12 ); VenderID=new12.substring(7);
	 * //System.out.println("Vendor ID->"+VenderID); wait(500); //}
	 * 
	 * searchvendor.click(); alert=1;
	 * if(driver.findElements(By.tagName("iframe")).size() != 0 )
	 * 
	 * { System.out.println("Pre-order iFrame is present" );
	 * 
	 * driver.switchTo().frame("fancybox-frame"); wait(2000); String
	 * s1=driver.findElement(By.xpath("//section[@class='outlets']/h1")).getText();
	 * String
	 * s2=driver.findElement(By.xpath("//section[@class='outlets']/p")).getText();
	 * String s3=s1+" "+s2;
	 * 
	 * String s3=s1.concat(s2); System.out.println(s3);
	 * 
	 * 
	 * CommandLineTable preorderalret=new CommandLineTable();
	 * preorderalret.setShowVerticalLines(true); preorderalret.
	 * setHeaders("Restaurant is close now. Next availble time slot as below");
	 * preorderalret.addRow(s3); preorderalret.print();
	 * 
	 * 
	 * //PRE-ORDER FOR TODAY for earliest delivery starting 08:30 PM
	 * 
	 * System.out.println(
	 * "-----------------------------------------------------------");
	 * System.out.println(s3); System.out.println(
	 * "-----------------------------------------------------------");
	 * 
	 * List<WebElement>
	 * tablealer=driver.findElement(By.xpath("//section[@class='outlets']/p"));
	 * for(WebElement cellAlert : tablealer) {
	 * System.out.println("Alert->"+cellAlert.getText()); }
	 * 
	 * 
	 * driver.findElement(By.linkText("OK")).click();
	 * driver.switchTo().defaultContent(); wait(500); } else {
	 * System.out.println("Pre-order iFrame is not present"); }
	 * 
	 * //*[@id="open_close_id"] String
	 * openclose=driver.findElement(By.xpath("//*[@id='open_close_id']")).getText();
	 * String Time=driver.findElement(By.xpath("//*[@title='Time']")).getText();
	 * Time=Time.substring(2); //System.out.println("Open or Close -> "+openclose);
	 * //System.out.println("Delibery Time -> "+Time); //*[@id="open_hor_id"]/a
	 * WebElement fav=driver.findElement(By.xpath("//*[@id='fav_"+VenderID+"']"));
	 * 
	 * System.out.println("Class name fav-->> "+fav.getAttribute("class")); String
	 * ch=fav.getAttribute("class").trim(); if(ch.equals("btSt2 fav active")) {
	 * System.out.println("Class name fav-->> "+ch+"true");
	 * favorite="Vendor in Favourite list"; } else {
	 * System.out.println("Class name fav-->> "+ch+"false");
	 * favorite="Vendor not in Favourite list"; }
	 * 
	 * System.out.println("favorite-->>"+favorite);
	 * 
	 * wait(500);
	 * 
	 * 
	 * String currentURL = driver.getCurrentUrl();
	 * //System.out.println("vendor url ->"+currentURL);
	 * resto.addRow(VenderID,vendorName,openclose,Time,itemName,favorite,currentURL)
	 * ; resto.print();
	 * 
	 * WebElement chkItemVeg=driver.findElement(By.xpath("//*[@title='Veg']"));
	 * WebElement
	 * chkItemNonveg=driver.findElement(By.xpath("//*[@title='Non Veg']"));
	 * 
	 * wait(500);
	 * 
	 * chkItemVeg.click(); wait(500);
	 * 
	 * chkItemVeg.click(); wait(500);
	 * 
	 * chkItemNonveg.click(); wait(500);
	 * 
	 * chkItemNonveg.click(); wait(500);
	 * 
	 * WebElement txtItemSearch =driver.findElement(By.id("search")); String
	 * str=itemName;
	 * 
	 * ArrayList<String> pList= new
	 * ArrayList<String>(Arrays.asList(str.split(",")));
	 * System.out.println("pList Size  ->>"+pList.size());
	 * 
	 * for(int s=0;s<pList.size();s++) {
	 * System.out.println("Searching for Item  ->>"+pList.get(s).trim());
	 * txtItemSearch.sendKeys(pList.get(s).trim()); wait(1000);
	 * txtItemSearch.clear(); //driver.navigate().refresh(); }
	 * driver.navigate().refresh(); wait(1000); //driver.close();
	 * 
	 * ArrayList<String> aList= new
	 * ArrayList<String>(Arrays.asList(str.split(",")));
	 * System.out.println("aList Size  ->>"+aList.size());
	 * 
	 * for(int z=0;z<aList.size();z++) { CommandLineTable restoitemSearch=new
	 * CommandLineTable(); restoitemSearch.setShowVerticalLines(true);
	 * restoitemSearch.setHeaders("Vendor ID","Vendor Name"
	 * ,"Open/Closed","Delivery Time","Searching Item Name");
	 * System.out.println("Item Number Iteration ->> "+ z+1); String
	 * itemNe=aList.get(z).trim();
	 * System.out.println("Searching for Item Name ->> "+itemNe);
	 * restoitemSearch.addRow(VenderID,vendorName,openclose,Time,itemNe);
	 * restoitemSearch.print(); searchItem(itemNe); }
	 * 
	 * System.out.println("Out of Item add loop ->>"); placeOrder();
	 * 
	 * }
	 * 
	 * catch(Exception e)
	 * 
	 * { System.out.println("searchVendorPlaceOrder Exception"+e); }
	 * 
	 * }
	 * 
	 * public void placeOrder()
	 * 
	 * { try {
	 * //driver.findElement(By.xpath("//a[@onclick='details_order();']")).click();
	 * 
	 * driver.get(checkoutURL);
	 * 
	 * //VendroItem.print();
	 * 
	 * selectDeliverySlot();
	 * 
	 * wait(1000);
	 * 
	 * String current1=driver.getCurrentUrl(); System.out.println("On "+current1+
	 * " page");
	 * 
	 * 
	 * if((current1.equals("https://scootsy.com/checkout")) ||
	 * (current1.equals("https://beta.scootsy.com/checkout"))) {
	 * System.out.println("On https://www.scootsy.com/checkout page");
	 * specialInstructionAdd("Add my Order Special Instructions for Order");
	 * wait(1000); WebElement
	 * checkout1=driver.findElement(By.xpath("//button[@class='btn_style2']"));
	 * checkout1.click(); } else { System.out.
	 * println("Something went wrong on https://www.scootsy.com/checkout page");
	 * driver.close(); }
	 * 
	 * wait(1000);
	 * 
	 * String current2=driver.getCurrentUrl(); System.out.println("On "+current2+
	 * " page");
	 * 
	 * if((current2.equals("https://scootsy.com/myaddress")) ||
	 * (current2.equals("https://beta.scootsy.com/myaddress"))) {
	 * System.out.println("On https://www.scootsy.com/myaddress page");
	 * getAddresses(); WebElement
	 * checkout2=driver.findElement(By.xpath("//*[@class='btn_style2']"));
	 * checkout2.click(); } else { System.out.
	 * println("Something went wrong on https://scootsy.com/myaddress page");
	 * driver.close(); }
	 * 
	 * wait(3000);
	 * 
	 * String current3=driver.getCurrentUrl(); System.out.println("On "+current1+
	 * " page");
	 * 
	 * if((current3.equals("https://scootsy.com/payment")) ||
	 * (current3.equals("https://scootsy.com/payment"))) {
	 * driver.findElement(By.xpath("//a[@class='placeOrder']")).click(); wait(2000);
	 * getOrderDetails(); wait(1000); } else { System.out.
	 * println("Something went wrong on https://www.scootsy.com/payment page");
	 * driver.close(); }
	 * 
	 * } catch(Exception e) { System.out.println("Exception in placeOrder-->> "+ e);
	 * } }
	 * 
	 * public void searchItem(String itemName)
	 * 
	 * { try
	 * 
	 * 
	 * { List<WebElement> listElementLinkCheck
	 * =driver.findElements(By.xpath("//div[@id='itemTableData']/table/tbody/tr"));
	 * System.out.println("List Item Count -->>" +listElementLinkCheck.size());
	 * CommandLineTable VendroItem = new CommandLineTable();
	 * VendroItem.setShowVerticalLines(true);
	 * 
	 * VendroItem.setHeaders("tr attributes ID","a tag attributes ID","Size");
	 * 
	 * int m=1;
	 * 
	 * for(WebElement element : listElementLinkCheck ) {
	 * //0.System.out.println("****" + m + "****"); String sr = Integer.toString(m);
	 * //1. // System.out.println("tr attributes ID->"+element.getAttribute("id"));
	 * //String ID=element.getAttribute("id"); String
	 * trID=element.getAttribute("id"); String atag=trID.substring(5); //2.
	 * //System.out.println("a tag attributes ID->"+atag);
	 * 
	 * List<WebElement> tableCells= element.findElements(By.xpath("td"));
	 * 
	 * // 2.System.out.println("Size = "+tableCells.size()); String Size =
	 * Integer.toString(tableCells.size());
	 * 
	 * 
	 * VendroItem.addRow(sr,element.getAttribute("id"),atag,Size);
	 * 
	 * int i=1; String itemnametxtx=""; for(WebElement cell : tableCells) {
	 * //WebElement divDesc=(WebElement)
	 * cell.findElements(By.xpath("//div[@class='discription']")); List<WebElement>
	 * divDesc1=cell.findElements(By.xpath("div")); String flag=""; String
	 * descITEM=""; if(divDesc1.size() != 0) { for(WebElement cell2 : divDesc1) {
	 * descITEM=cell2.getText();
	 * //System.out.println("ITEM Description -->"+descITEM); flag="1"; } } else {
	 * flag="0"; }
	 * 
	 * //else //{ if(flag.equals("1")) {
	 * 
	 * itemnametxtx=cell.getText(); itemnametxtx=itemnametxtx.replace(descITEM,
	 * "").trim(); System.out.println("Vendor Item Description -->"+itemnametxtx);
	 * 
	 * } else {
	 * 
	 * itemnametxtx=cell.getText(); } //} itemnametxtx=cell.getText();
	 * 
	 * boolean isFound = itemnametxtx.equals(itemName);
	 * 
	 * if(isFound==true) {
	 * 
	 * elementString=itemnametxtx; if(driver.findElements(By.tagName("a")).size() !=
	 * 0 ) {
	 * 
	 * 
	 * System.out.println("a tag found --> " +
	 * driver.findElements(By.tagName("a")).size()); WebElement e25 =
	 * driver.findElement(By.xpath("//div/div/table/tbody/tr["+m+
	 * "]/td[@class='pluseminusbutton']/a")); WebElement e25 =
	 * driver.findElement(By.xpath(
	 * "//div[@id='itemTableData']/table/tbody/tr/td[4]/a/img"));
	 * div[@id='itemTableData']/table/tbody/tr/td[@class='pluseminusbutton']/a]
	 * e25.click();
	 * 
	 * 
	 * //3. //System.out.println("Plus sign found. i=" + i + ",cell->"
	 * +cell+",text ->" +itemnametxtx+", cell loaction"+cell.getLocation());
	 * 
	 * driver.findElement(By.xpath("//a[@onclick='add_products_to_bags(" + atag +
	 * ");']")).click();
	 * 
	 * //delete_item_from_bags(456487,"cart",456487);updateCartCountminus(456487);
	 * //wait(500);
	 * //driver.findElement(By.xpath("//a[@onclick='delete_item_from_bags(" + atag +
	 * ",\"cart\"," + atag + ");updateCartCountminus(" + atag + ");']")).click();
	 * //html/body/section/div[3]/div[2]/table/tbody/tr[2]/td/button } t=i;
	 * elementfound=elementfound+1;
	 * 
	 * //html/body/section/section[5]/section[2]/div/div[2]/table[1]/tbody/tr[18]/td
	 * [4]/a/img //System.out.println("a tag class name" +
	 * driver.findElements(By.tagName("a")).getClass());
	 * 
	 * }
	 * 
	 * else { //System.out.println("Plus sign not found"); } i=i+1; }
	 * 
	 * 
	 * System.out.println("  *************  "); System.out.println(+ i
	 * +" --> Attrbite for that element-->  " + element.getTagName() );
	 * System.out.println("  *************  "); System.out.println(+ i
	 * +" --> Element inside li -->  " + element.getText());
	 * System.out.println("  *************  "); i++;
	 * 
	 * m=m+1; } // VendroItem.print();
	 * 
	 * int j=i-1;
	 * 
	 * //4. // System.out.println("-Actual Number of elements = " + j);
	 * 
	 * //5. //System.out.println("-Expected Number of elements = " +
	 * listElementLinkCheck.size());
	 * 
	 * System.out.println("Element found status -->"+elementfound+
	 * ", Elemnet String-->" + elementString + ","+ t);
	 * 
	 * 
	 * driver.findElement(By.linkText("ORDER NOW")).click();
	 * driver.findElement(By.xpath("//div[@class='arrow']")).click();
	 * driver.findElement(By.xpath("//a[@onclick='details_order();']")).click();
	 * wait(500); driver.findElement(By.linkText("Order Now")).click(); wait(500);
	 * driver.findElement(By.xpath("//input[@class='add']")).click();
	 * driver.findElement(By.xpath("//input[@class='add']")).click(); wait(500);
	 * driver.findElement(By.xpath("//input[@class='minus1']")).click();
	 * driver.findElement(By.xpath("//input[@class='add']")).click();
	 * driver.findElement(By.xpath("//input[@class='minus1']")).click();
	 * 
	 * } catch(Exception e)
	 * 
	 * { System.out.println("SearchItem Exception --> "+e); }
	 * 
	 * }
	 * 
	 * public void getOrderDetails() throws InterruptedException
	 * 
	 * { System.out.println("******Order Details******");
	 * 
	 * CommandLineTable orderdetails1=new CommandLineTable();
	 * orderdetails1.setShowVerticalLines(true);
	 * orderdetails1.setHeaders("Order Restraurant","Order Total Value"
	 * ,"Order Status","Mode of Payment");
	 * 
	 * String
	 * Order_Restraurant=driver.findElement(By.xpath("//span[@class='lefthed']")).
	 * getText(); String Order_Total_Value=driver.findElement(By.
	 * xpath("//span[@class='rigthed rsordr']")).getText(); String
	 * Order_Status=driver.findElement(By.xpath("//div[@class='ordrcnf']")).getText(
	 * ); String
	 * Pay=driver.findElement(By.xpath("//div[@class='trkncont']")).getText();
	 * orderdetails1.addRow(Order_Restraurant,Order_Total_Value,Order_Status,Pay);
	 * orderdetails1.print();
	 * 
	 * //wait(500);
	 * 
	 * List<WebElement> orderlistElementLinkCheck
	 * =driver.findElements(By.xpath("//div[@class='ordrcofirm']/table/tbody/tr"));
	 * for(WebElement celltr : orderlistElementLinkCheck) {
	 * System.out.println(celltr.getText()); List<WebElement>
	 * orderlistElementLinkChecktd =driver.findElements(By.xpath("td"));
	 * for(WebElement celltd : orderlistElementLinkChecktd) {
	 * System.out.println(":"+celltd.getText()); System.out.println(""); } }
	 * 
	 * System.out.println(""); System.out.println("******+++++*+++++******");
	 * System.out.println("******+++++*+++++******"); System.out.println("");
	 * List<WebElement> orderdetailstrtwo
	 * =driver.findElements(By.xpath("//div[@class='col1']/table/tbody/tr"));
	 * for(WebElement celltr2 : orderdetailstrtwo) {
	 * System.out.println(":"+celltr2.getText()); List<WebElement> orderdetailstdtwo
	 * =driver.findElements(By.xpath("td")); for(WebElement celltd2 :
	 * orderdetailstdtwo) { System.out.println(":"+celltd2.getText()); } }
	 * 
	 * List<WebElement> orderdetailstrthree
	 * =driver.findElements(By.xpath("//table[@class='subtlt']/tbody/tr"));
	 * for(WebElement celltr3 : orderdetailstrthree) {
	 * System.out.println(":"+celltr3.getText()); List<WebElement>
	 * orderdetailstdthree =driver.findElements(By.xpath("td")); for(WebElement
	 * celltd3 : orderdetailstdthree) { System.out.println(":"+celltd3.getText()); }
	 * } System.out.println(""); System.out.println("******+++++*+++++******");
	 * System.out.println("******+++++*+++++******"); System.out.println("");
	 * 
	 * }
	 * 
	 * public void currentLocation() throws InterruptedException
	 * 
	 * { try { wait(1000);
	 * driver.findElement(By.xpath("//li[@class='locSelect transition']")).click();
	 * 
	 * if(driver.findElements(By.tagName("iframe")).size() != 0 ) {
	 * System.out.println("Current Location iFrame is present" );
	 * 
	 * driver.switchTo().frame("fancybox-frame");
	 * driver.findElement(By.xpath("//a[@class='locBtn']")).click();
	 * 
	 * //driver.findElement(By.linkText("Use Current Location")).click();
	 * 
	 * wait(500); driver.findElement(By.xpath("//a[@class='showRest']")).click();
	 * 
	 * //driver.findElement(By.linkText("Show Restaurants")).click(); //wait(500);
	 * 
	 * driver.switchTo().defaultContent(); wait(500); } else {
	 * System.out.println("Location iFrame is not present"); } }
	 * 
	 * catch(Exception e)
	 * 
	 * { System.out.println("currentLocation Exception --> "+e); }
	 * 
	 * }
	 * 
	 * public void dynamicLocation(String loc) throws InterruptedException
	 * 
	 * { try {
	 * driver.findElement(By.xpath("//li[@class='locSelect transition']")).click();
	 * System.out.println("In dynamicLocation funcion --> "+loc);
	 * 
	 * wait(500);
	 * 
	 * if(driver.findElements(By.tagName("iframe")).size() != 0 ) {
	 * System.out.println("Dynamic Location iFrame is present" );
	 * 
	 * driver.switchTo().frame("fancybox-frame"); WebElement
	 * streetAddress=driver.findElement(By.xpath("//input[@id='google_ship_street']"
	 * ));
	 * 
	 * streetAddress.sendKeys(loc);
	 * 
	 * List<WebElement> googleAddressList
	 * =driver.findElements(By.xpath("//body/div[5]/div")); int y=0;
	 * 
	 * System.out.println("googleAddressList size-->"+googleAddressList.size());
	 * for(WebElement address : googleAddressList) { y=y+1;
	 * 
	 * String loactionxtx=address.getText(); System.out.println(y+". Tag Name-> " +
	 * address.getTagName() ); System.out.println("Tag Name-> " + address.getText()
	 * );
	 * 
	 * boolean isLocation =
	 * loactionxtx.equals("Lower ParelMumbai, Maharashtra, India");
	 * 
	 * 
	 * if(isLocation==true) { addressLoc=address; Point
	 * pointl=address.getLocation(); xcor=pointl.getX(); ycor=pointl.getY();
	 * System.out.println(+y+". Element->"+ addressLoc.toString() +
	 * ", XCordinate ->" +xcor+", YCordinate ->"+ycor);
	 * 
	 * //wait(500);
	 * 
	 * Robot robot = new Robot(); robot.delay(1500);
	 * 
	 * 
	 * robot.mouseMove(addressLoc.getLocation().getX(),
	 * addressLoc.getLocation().getY());
	 * robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // press left click
	 * robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // release left click
	 * robot.delay(1500); address.click();
	 * System.out.println(+y+". Success with --> "+loc + "Tag Name" +
	 * address.getText()); break;
	 * 
	 * 
	 * 
	 * }
	 * 
	 * // break; }
	 * 
	 * Actions action = new Actions(driver);
	 * 
	 * action.moveToElement(addressLoc, xcor, ycor).click() .build() .perform();
	 * wait(500); driver.switchTo().defaultContent();
	 * 
	 * 
	 * 
	 * Actions builder = new Actions(driver);
	 * 
	 * Action seriesOfActions = (Action) builder
	 * .keyDown(streetAddress,Keys.ARROW_DOWN) .click() .build();
	 * 
	 * seriesOfActions.perform(); wait(500);
	 * driver.findElement(By.xpath("//a[@class='showRest']")).click()
	 * 
	 * 
	 * 
	 * } else { System.out.println(" Dynamic Location iFrame is not present" ); }
	 * 
	 * } catch(Exception e) {
	 * System.out.println("dynamicLocation Exception --> "+e); }
	 * 
	 * }
	 * 
	 * public void specialInstructionAdd(String instruction) throws
	 * InterruptedException
	 * 
	 * { try { String instru=""; String curent5=""; instru=instruction;
	 * curent5=driver.getCurrentUrl(); //
	 * if(curent5=="https://www.scootsy.com/checkout")
	 * 
	 * // { driver.findElement(By.
	 * xpath("//a[@class='clearfix inst_linkshw showhide_link2']")).click();
	 * //WebElement
	 * intr=driver.findElement(By.xpath("//textarea[@class='additional_inc_3112']"))
	 * ; wait(500);
	 * driver.findElement(By.xpath("//div[@class='codcp clearfix']//textarea")).
	 * clear(); wait(500);
	 * driver.findElement(By.xpath("//div[@class='codcp clearfix']//textarea")).
	 * sendKeys(instru);
	 * 
	 * wait(100); //System.out.println("Special Instruction for Order -> " +instru);
	 * driver.findElement(By.xpath("//input[@class='showhidbtn']")).click();
	 * wait(100);
	 * 
	 * driver.findElement(By.
	 * xpath("//a[@class='clearfix inst_linkshw showhide_link2']")).click();
	 * wait(500);
	 * driver.findElement(By.xpath("//div[@class='codcp clearfix']//textarea")).
	 * clear(); wait(500);
	 * driver.findElement(By.xpath("//div[@class='codcp clearfix']//textarea")).
	 * sendKeys(instru); wait(500);
	 * 
	 * System.out.println("Special intsruction->"+driver.findElement(By.
	 * xpath("//div[@class='codcp clearfix']//textarea")).getText()+"-->");
	 * 
	 * wait(100); //System.out.println("Special Instruction for Order -> " +instru);
	 * driver.findElement(By.xpath("//input[@class='showhidbtn']")).click();
	 * wait(100); // } else { System.out.
	 * println("Something went wrong while adding special instruction on https://scootsy.com/checkout page -> "
	 * +instru); } } catch(Exception e) { System.out.
	 * println("Something went wrong while adding special instruction on https://scootsy.com/checkout page Exception -> "
	 * ); } }
	 * 
	 * public void selectDeliverySlot() throws InterruptedException
	 * 
	 * {
	 * 
	 * driver.findElement(By.
	 * xpath("//a[@class='clearfix deli_linkshw showhide_link1']")).click();
	 * System.out.println("Vendor ID->"+VenderID); String Status="Available";
	 * 
	 * 
	 * CommandLineTable st = new CommandLineTable(); st.setShowVerticalLines(true);
	 * //if false (default) then no vertical lines are shown st.setHeaders("one",
	 * "two", "three");//optional - if not used then there will be no header and
	 * horizontal lines st.addRow("super", "broccoli", "flexible");
	 * st.addRow("assumption", "announcement", "reflection"); st.addRow("logic",
	 * "pleasant", "wild"); st.print(); wait(10000);
	 * 
	 * 
	 * 
	 * CommandLineTable today = new CommandLineTable();
	 * today.setShowVerticalLines(true);
	 * driver.findElement(By.xpath("//a[@id='achor_"+VenderID+"_0']")).click();
	 * 
	 * List<WebElement> todayTimeSlot
	 * =driver.findElements(By.xpath("//ul[@id='ul_main_cont_"+ VenderID +"_0']"));
	 * //List<WebElement> todayTimeSlot
	 * =driver.findElements(By.xpath("//ul[@id='ul_main_cont_"+ VenderID +"_0']"));
	 * today.setHeaders("Today's Time Slots");
	 * 
	 * 
	 * for(WebElement todaySlot : todayTimeSlot) {
	 * //System.out.println("TimessSlot->"+todaySlot.getText());
	 * today.addRow(Status+" -> "+todaySlot.getText()); }
	 * 
	 * //ul[@id="ul_main_cont_2958_0"] today.print();
	 * 
	 * 
	 * CommandLineTable tomm = new CommandLineTable();
	 * tomm.setShowVerticalLines(true);
	 * driver.findElement(By.xpath("//a[@id='achor_"+VenderID+"_1']")).click();
	 * 
	 * tomm.setHeaders("TOMORROW's Time Slots"); List<WebElement> todayTommSlot
	 * =driver.findElements(By.xpath("//ul[@id='ul_main_cont_"+ VenderID +"_1']"));
	 * 
	 * for(WebElement tommSlot : todayTommSlot) {
	 * //System.out.println("TimessSlot->"+todaySlot.getText());
	 * tomm.addRow(Status+" -> "+tommSlot.getText()); }
	 * 
	 * //ul[@id="ul_main_cont_2958_1"] tomm.print();
	 * 
	 * CommandLineTable dayafter = new CommandLineTable();
	 * dayafter.setShowVerticalLines(true);
	 * driver.findElement(By.xpath("//a[@id='achor_"+VenderID+"_2']")).click();
	 * 
	 * dayafter.setHeaders("DayAfter Time Slots"); List<WebElement> dayafterSlot
	 * =driver.findElements(By.xpath("//ul[@id='ul_main_cont_"+ VenderID +"_2']"));
	 * 
	 * for(WebElement dayafterslot : dayafterSlot) {
	 * //System.out.println("TimessSlot->"+todaySlot.getText());
	 * dayafter.addRow(Status+" -> "+dayafterslot.getText()); }
	 * 
	 * //ul[@id="ul_main_cont_2958_2"] dayafter.print();
	 * 
	 * driver.findElement(By.
	 * xpath("//a[@class='deli_linkshw closebtn showhide_link1']")).click();
	 * 
	 * }
	 * 
	 * public String getXPath(WebElement webElement)
	 * 
	 * { String jscript = "function getPathTo(node) {" + "  var stack = [];" +
	 * "  while(node.parentNode !== null) {" + "    stack.unshift(node.tagName);" +
	 * "    node = node.parentNode;" + "  }" + "  return stack.join('/');" + "}" +
	 * "return getPathTo(arguments[0]);"; return (String) ((RemoteWebDriver)
	 * driver).executeScript(jscript, webElement); }
	 * 
	 * public String getXPathn(WebElement element)
	 * 
	 * { return (String) ((RemoteWebDriver) driver).executeScript(
	 * "getXPath=function(node)" + "{" + "if (node.id !== '')" + "{" +
	 * "return '//' + node.tagName.toLowerCase() + '[@id=\"' + node.id + '\"]'" +
	 * "}" +
	 * 
	 * "if (node === document.body)" + "{" + "return node.tagName.toLowerCase()" +
	 * "}" +
	 * 
	 * "var nodeCount = 0;" + "var childNodes = node.parentNode.childNodes;" +
	 * 
	 * "for (var i=0; i<childNodes.length; i++)" + "{" +
	 * "var currentNode = childNodes[i];" +
	 * 
	 * "if (currentNode === node)" +
	 * "{return getXPath(node.parentNode) + '/' + node.tagName.toLowerCase()	+ '[' + (nodeCount+1) + ']'"
	 * + "}" +
	 * 
	 * "if (currentNode.nodeType === 1 && " +
	 * "currentNode.tagName.toLowerCase() === node.tagName.toLowerCase())" + "{" +
	 * "nodeCount++" + "}" + "}" + "};" +
	 * 
	 * "return getXPath(arguments[0]);", element); }
	 * 
	 * public void getFilterData() throws InterruptedException {
	 * 
	 * try { driver.findElement(By.xpath("//a[@title='Filter']")).click();
	 * List<WebElement> filterList
	 * =driver.findElements(By.xpath("//section[@class='refineTags']/a"));
	 * wait(1000);
	 * System.out.println("Available Number of Filters for Restaurants Listing -->>"
	 * +filterList.size()); CommandLineTable retrofilter=new CommandLineTable();
	 * retrofilter.setShowVerticalLines(true);
	 * retrofilter.setHeaders("Restaurants Listing Filters");
	 * 
	 * for(WebElement filter : filterList ) { retrofilter.addRow(filter.getText());
	 * }
	 * 
	 * retrofilter.print(); wait(100);
	 * driver.findElement(By.xpath("//a[@title='Filter']")).click(); }
	 * 
	 * catch(Exception e) {
	 * System.out.println("Exception in getFilterData() Method " +e); } }
	 * 
	 * public void getAddresses()throws InterruptedException { try {
	 * List<WebElement> addressList
	 * =driver.findElements(By.xpath("//div[@class='col1']")); int t=0;
	 * 
	 * CommandLineTable addressTable=new CommandLineTable();
	 * addressTable.setShowVerticalLines(true);
	 * addressTable.setHeaders("Sr. No.","Mobile Number"
	 * ,"                        Address Details                          ");
	 * 
	 * 
	 * for(WebElement addressbyaddressList : addressList ) { List<WebElement>
	 * addressListm =addressbyaddressList.findElements(By.
	 * xpath("//div[@class='addbox bordr selcted']")); for(WebElement
	 * addressbyaddressListn : addressListm ) { t=t+1; String a=Integer.toString(t);
	 * String
	 * mobileNumber=StringUtils.substringBetween(addressbyaddressListn.getText(),
	 * "(", ")"); String shippingAddresses=(addressbyaddressListn.getText()); String
	 * shippingAddresse=shippingAddresses.substring(0,
	 * shippingAddresses.lastIndexOf("Deliver Here"));
	 * shippingAddresse=shippingAddresse.replace("\n"," "); String addressa =
	 * shippingAddresse.substring(shippingAddresse.lastIndexOf(")") + 1,
	 * shippingAddresse.length());
	 * 
	 * addressTable.addRow(a,mobileNumber,addressa); } } addressTable.print(); }
	 * catch(Exception e) { System.out.println("Exception in getAddresses() Method "
	 * +e); } }
	 * 
	 * }
	 */

}
