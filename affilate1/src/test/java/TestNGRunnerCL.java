import com.selenium.utillity.Reusables;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

@CucumberOptions(features = {"src/Feature"},
        glue = {"com.cucumber.stepdefinition"},
/*        format = {"pretty",
                "html:target/site/cucumber-pretty"
        },*/


        
        tags = {"@APUI15_TC1_Aff_CD"},

        plugin= {"pretty","html:target/site/cucumber-pretty","json:target/cucumber-reports/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/ExtentReport.html"},

        //plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Extentreport.html", "json:target/cucumber-reports/cucumber.json"},
        monochrome = true)

public class TestNGRunnerCL extends AbstractTestNGCucumberTests {
//     @AfterClass
//        public static void ReadHtmlFile() throws Throwable{
//                Reusables.ReadHtmlFile();
//        }
}