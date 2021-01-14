package pageObjects;

//import java.awt.List;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.DataTable;

public class LoginUserPassword 
{
	 WebDriver driver;
	 
		 public LoginUserPassword(WebDriver driver)
		 {
			 this.driver = driver;
			 PageFactory.initElements(driver, this);
		 }
		 
		 public void navigateTo_LoginUserPassword(String url) throws InterruptedException 
		 {
			 driver.get(url);
			 getWait(5000);
		 }
	 
		 public void title_LoginUserPassword()
		 {
			 String title = driver.getTitle(); 
			 System.out.println("title of page is " +title);
		 }
	 
		 public void usernamepassword_LoginUserPassword(String user, String pwd) throws InterruptedException
		 {
			//username
			 driver.findElement(By.id("username")).sendKeys(user);
			 getWait(5000);
			 //btnsignIn
			 WebElement signin=driver.findElement(By.id("btnsignIn"));
			 signin.click();
			 getWait(5000);
			 //passwd
			 driver.findElement(By.id("passwd")).sendKeys(pwd);
			 getWait(5000);
			 //*[@id="btnsignIn"]
			 //class="btn-primary"
			 WebElement submit=driver.findElement(By.id("btnsignIn"));
			 getWait(5000);
			 submit.click();
		 }
		 
		 public void logout() throws InterruptedException
		 {
			 getWait(5000);
			 WebElement username=driver.findElement(By.className("user-name"));
			 username.click();
			 getWait(5000);
			// WebElement button = driver.find_element_by_xpath("//a/u[data-trackable='sign-in')]")
			 driver.findElement(By.linkText("Logout")).click();		 
			 getWait(5000);
		 }
		 
	    public void getOrderStutus() throws InterruptedException
		{
			 WebElement reports = driver.findElement(By.className("Reports"));
			 reports.click();
			 getWait(4000); 
			 // *[@id="Catalog Items"] 
			 WebElement orderstatus = driver.findElement(By.linkText("Order Status")); 
			 orderstatus.click();
			 getWait(3000);	
		}
		
		public void getSearch() throws InterruptedException
		{
			//*[@id="tblMangoOrderStatus_length"]/span[2]/span/span
			WebElement search = driver.findElement(By.xpath(".//*[@id='tblMangoOrderStatus_length']/span[2]/span/span"));
			search.click();
		    getWait(3000);
		}
		
		public void usercredentials(DataTable usercredentials) throws Throwable 
		{
		    List<List<String>> rows = (List<List<String>>) usercredentials.asLists(String.class);
		    driver.findElement(By.id("username")).sendKeys(rows.get(0).get(0));
		    WebElement signin=driver.findElement(By.id("btnsignIn"));
			signin.click();
			getWait(5000);
		    driver.findElement(By.id("passwd")).sendKeys(rows.get(0).get(1));
		    getWait(5000);
			 //*[@id="btnsignIn"]
			 //class="btn-primary"
			 WebElement submit=driver.findElement(By.id("btnsignIn"));
			 getWait(5000);
			 submit.click();
		   // driver.findElement(By.id("login")).click();
		}
	 
		 public void getWait(int a) throws InterruptedException
		 {
			 Thread.sleep(a);
		 }
	
		 public void selectBrowser(String browserType) throws InterruptedException
			{
				if(browserType.equalsIgnoreCase("chrome"))
				 {
			     
			     Thread.sleep(2000);
				 System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver1.exe"); 
				 driver = new ChromeDriver();
				 }
				 else if(browserType.equalsIgnoreCase("firefox"))
				 {
					 System.setProperty("webdriver.gecko.driver","Drivers\\geckodriver.exe"); 
					  driver = new FirefoxDriver();
				 }
				 else
				 {			  
					 System.out.println("Invalid unsupported browser");
				 }
				  driver.manage().window().maximize();
				  driver.manage().deleteAllCookies();

			}
		 public void loginValidation(DataTable usercredentials) throws Throwable 
		 {
			 //http://devalvaromoreno.r-pac.com/Dashboard/LandingPage
			 String pwdURL="http://devrtrac.r-pac.com/Login/Password";
			 String homeURL="http://devalvaromoreno.r-pac.com/Dashboard/LandingPage";
			 String initURL="http://devrtrac.r-pac.com/";
			 String user,pwd,currentURL="";
			 int i=0;
			 try 
			 {
				 List<Map<String, String>> list = usercredentials.asMaps(String.class, String.class);
				 int col=list.size();
				 //int row=list.get(0).size();
			     //System.out.println("col" + col);
				 
				 for(int k=0; k<list.size(); k++)
					{	
					 	//System.out.println("K->"+k);
					 	//System.out.println(list.get(k).get("User"));
			    		//System.out.println(list.get(k).get("Password"));
					}
					
				 
			    	for(int k=0; k<list.size(); k++)
						{		
			    					getWait(2000);
			    					driver.get(initURL);
			    					currentURL="";
			    					user="";
			    					pwd ="";
			    					i=k+1;
						    		System.out.println("Iteration : "+i);
						    		System.out.println("User ID -> "+list.get(k).get("User"));
						    		System.out.println("Password -> "+list.get(k).get("Password"));
						    		
							    	user=(list.get(k).get("User"));
							    	pwd=(list.get(k).get("Password"));
							    	
									getWait(2000);
									WebElement email=null;
									email=driver.findElement(By.id("username"));
									email.sendKeys(user);
									
								    WebElement signin=driver.findElement(By.id("btnsignIn"));
									signin.click();
									getWait(2000);
									
									currentURL="";
									currentURL=driver.getCurrentUrl();
								

									if ( currentURL.equalsIgnoreCase(pwdURL) )
									{	
										//System.out.println("Current URL-> "+currentURL);
										//System.out.println("password URL-> "+pwdURL);
										
										WebElement pawds=null;
										pawds=driver.findElement(By.id("passwd"));
										pawds.sendKeys(pwd);
									    getWait(2000);
	
										WebElement submit=driver.findElement(By.id("btnsignIn"));
									    getWait(2000);
										submit.click();
										getWait(2000);
										
										currentURL="";
										currentURL=driver.getCurrentUrl();
											 //System.out.println("Current URL-> "+currentURL);
		
											 if (currentURL.equalsIgnoreCase(pwdURL) || currentURL.equalsIgnoreCase(initURL))
												 {
												 	//System.out.println("K->"+k);
												 	//System.out.println("Current URL-> "+currentURL+"\n");
													System.out.println("Result : Wrong password-> "+"( " +user+" / " +pwd+" )"+"\n");
													continue;
												 }
											 else if (currentURL.equalsIgnoreCase(homeURL) )
												 {
												 	 //System.out.println("K->"+k);
													 //System.out.println("Current URL-> "+currentURL+"\n");
													 System.out.println("Result : Success"+"( " +user+" / " +pwd+" )"+"\n");
													 break;
												 }	
										}
										
									
										else if(currentURL != pwdURL || currentURL.equalsIgnoreCase(initURL) )
										
										{
											//System.out.println("K->"+k);
											//System.out.println("Current URL-> "+currentURL);
											//System.out.println("password URL-> "+pwdURL);
											//System.out.println("init URL-> "+initURL);
											System.out.println("Result : Wrong user id-> "+"( " +user+" / " +pwd+" )"+"\n");
											continue;
										}
									
						}
			 }
			 catch(Exception e)
			 {
				 System.out.println("Exception ->"+e);
			 }
		 }
}
