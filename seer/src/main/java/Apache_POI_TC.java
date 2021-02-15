import java.util.concurrent.TimeUnit;
 
 import org.openqa.selenium.WebDriver;
 
 import org.openqa.selenium.firefox.FirefoxDriver;
 
 import com.dataseers.qa.pages.*;
 
 import com.dataseers.qa.util.Constant;
 
 // Import Package utility.*
 
 import com.dataseers.qa.util.ExcelUtils;
 
 import com.dataseers.qa.pages.LoginPage;

 
public class Apache_POI_TC {

	private static WebDriver d = null;
	 
	 public static void main(String[] args) throws Exception {
	 
	        //This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method
	 
	        ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData,"Sheet1");
	 
	        d = new FirefoxDriver();
	 
	        d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	        d.get(Constant.URL);
	 
	        System.out.println("Login Successfully, now it is the time to Log Off buddy.");
	 
//	        Home_Page.lnk_LogOut(d).click(); 
	 
	        d.quit();
	 
	        //This is to send the PASS value to the Excel sheet in the result column.
	 
	        ExcelUtils.setCellData("Pass", 1, 3);
	 
	 }
	 
	 }

