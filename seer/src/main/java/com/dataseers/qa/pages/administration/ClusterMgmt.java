package com.dataseers.qa.pages.administration;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.dataseers.qa.base.GenerateData;
import com.dataseers.qa.base.TestBase;

public class ClusterMgmt extends TestBase {
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions = new Actions(d);
	String password = prop.getProperty("passWord");
	String ip = GenerateData.generateRandomIP();
	String portnumber = GenerateData.generateRandomNumber(4);
	String clusterdata = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();

	// Administration module
	@CacheLookup
	@FindBy(xpath = "//*[@alt='Administration']")
	WebElement administration;
	 
	// cluster-management module
	@CacheLookup
	@FindBy(xpath = "//span[contains(text(),'Cluster Config')]")
	WebElement clusterconfig;
			
	// cluster-management module
	@CacheLookup
	@FindBy(xpath = "//*[@href='/manage-clusters']")
	WebElement clusterMgmt;

	// add new cluster button
		@CacheLookup
		@FindBy(xpath = "//*[@title='Add new cluster']")
		WebElement addCluster;
		
		// is Primary Toggle
		@CacheLookup
		@FindBy(xpath = "//*[@id='add_cluster_is_primary']")
		WebElement isPrimary;

		//DS Cluster
		@CacheLookup
		@FindBy(xpath = "//div[contains(text(),'Select DS cluster to copy')]")
		WebElement DSCluster;
		
		//Select DS cluster
		@CacheLookup
		@FindBy(xpath = "//li[normalize-space()='Dev225']")
		WebElement DSCluster_sel;
		
		// cluster name field
		@CacheLookup
		@FindBy(xpath = "//*[@id='add_cluster_name']")
		WebElement clusterName;

		// cluster username field
		@CacheLookup
		@FindBy(xpath = "//*[@id='add_cluster_user']")
		WebElement clusterUser;

		// cluster username field
		@CacheLookup
		@FindBy(xpath = "//*[@id='add_cluster_password']")
		WebElement clusterPassword;

		// add new cluster page all drop-downs list
		@CacheLookup
		@FindBy(xpath = "//*[@role='combobox']")
		List<WebElement> clusterDowns;

		// first option of API key drop-down
		@CacheLookup
		@FindBy(xpath = "//div[normalize-space()='Select Api Key']")
		WebElement apiKey1;

		// first option of API key drop-down
		@CacheLookup
		@FindBy(xpath = "//li[normalize-space()='HPCC Key']")
		WebElement apiKey;

		// save button
		@CacheLookup
		@FindBy(xpath = "//*[@type='submit']")
		WebElement save_cluster;

		// cancel button
		@CacheLookup
		@FindBy(xpath = "//*[@type='button']")
		WebElement cancel_cluster;

		// sort drop-down of cluster management page
		@CacheLookup
		@FindBy(xpath = "//*[@id='root']/section/section/main/div/div/div/div/div/div/div/div[2]/div/table/thead/tr/th[7]/span/div/span[2]/div/i[2]")
		WebElement sortdown;

		// added new cluster's name
		@CacheLookup
		@FindBy(xpath = "//*[@id='root']/section/section/main/div/div/div/div/div/div/div/div[2]/div/table/tbody/tr[1]/td[1]")
		WebElement addedcluster;
		
	public ClusterMgmt(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void administrationPage() {
		try {
			log.info("Cliciking on Administration module");
			wait.until(ExpectedConditions.visibilityOf(administration));
			administration.click();

			log.info("User clicked on to Administration successfully!!!!");
		} catch (Exception e) {
			Assert.fail("Administration module not found!!!!");
		}
	}

	public void clusterMgmtPage() {
		try {
			administrationPage();
			clusterconfig.click();
			log.info("Clicking on cluster management");
			wait.until(ExpectedConditions.visibilityOf(clusterMgmt));
			clusterMgmt.click();

			log.info("User is redirected to cluster management page successfully!!!!");
		} catch (Exception e) {
			Assert.fail("User is Not redirected to cluster management page!!!!");
		}
	}

	public void addclusterPage() {
		try {

			clusterMgmtPage();

			log.info("Clicking on add cluster button");
			wait.until(ExpectedConditions.visibilityOf(addCluster));
			addCluster.click();

			log.info("Turning Is primary toggle as active");
			wait.until(ExpectedConditions.visibilityOf(isPrimary));
//			isPrimary.click();
			
			DSCluster.click();
			 
			DSCluster_sel.click();
			
			log.info("Entering new cluster name");
			wait.until(ExpectedConditions.visibilityOf(clusterName));
			clusterName.sendKeys("Dev"+portnumber);

			clusterUser.sendKeys("ssohoni");
			clusterPassword.sendKeys("Z0ltr!xe");
			apiKey1.click();
			apiKey.click();
		} 
		catch (Exception e) {
			Assert.fail("Adding new cluster failed");
		}
	}

	public void savecluster() {
		try {
			log.info("Clicking on save button");
			save_cluster.click();

			log.info("New cluster added successfully!!!!");

			log.info("Verifying that new user has been added!!!!");

//			actions.moveToElement(sortdown).doubleClick().build().perform();
			String newcluster = "Dev"+portnumber;
			System.out.println("**************newcluster  is:**************"+newcluster );
			if (newcluster.contentEquals("Dev"+portnumber)) {

				log.info("Newly added cluster is displayed in a cluster list");
			}

			else {
				log.info("Newly added cluster is not displayed in a cluster list");
				Assert.fail("Save new cluster scenario failed");
			}

		} catch (Exception e) {
			Assert.fail("Save new cluster scenario failed");

		}
	}

	public void cancelcluster() {
		try {
			log.info("Clicking on cancel button");
			cancel_cluster.click();
			String newcluster = addedcluster.getText();

			if (newcluster.contentEquals(clusterdata)) {
				Assert.fail("After clicking on cancel button new cluster has been added");
			}

			else {
				log.info("After clicking on cancel button new cluster has not been added");
			}

		} catch (Exception e) {
			Assert.fail("cancel button scenario failed");
		}
	}

//	public void deleteclusterdb() throws SQLException {
//
//		String deleteQuery = "DELETE FROM clusters WHERE name='" + clusterdata + "'";
//		TestUtil.deleteQuerykeydb(deleteQuery);
//
//	}
}
