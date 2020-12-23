package MyRunner;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import gherkin.formatter.Reporter;

@CucumberOptions
	  (
        features = {"src/main/java/Features/"},
        
        glue = {"stepDefinitions"},
        
        	//tags = {"~@Ignore"},
        	//tags = {"@loginlogout,@regression"},
            //tags = {"@loginlogout,@regression,@deleteitemfromcart"},
            //@loginlogout,@catalogorder1,@regression,@cartdelete,@editorder,@pocheckout,@releasepo
        		//@loginlogout,@catalogorder1,@regression,@testcase5,@testcase6,@testcase7,@testcase8,@testcase12,@testcase13,@testcase14

        //tags = {"@loginlogout,@catalogorder1,@regression,@testcase5,@testcase6,"
        //	+ "@testcase7,@testcase8,@testcase12,@testcase13,@testcase14,"
       // + "@testcase19,@testcase18,@testcase17,@testcase16"},
        tags = {"@testcaseA006"},

        format = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        		},
        
       plugin = "json:target/cucumber-reports/CucumberTestReport.json"
        //plugin =  "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
        // plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
    	//monochrome = true
        
		)

public class TestRunner
{
    private TestNGCucumberRunner testNGCucumberRunner;
 
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception 
    {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
 
    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) 
    {
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
    }
 
    @DataProvider
    public Object[][] features() 
    {	
        return testNGCucumberRunner.provideFeatures();
    }
 
    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception 
    {
		//Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
		//Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));

    	testNGCucumberRunner.finish();
    }
}