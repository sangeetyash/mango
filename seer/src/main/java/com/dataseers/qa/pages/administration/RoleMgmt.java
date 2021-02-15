package com.dataseers.qa.pages.administration;

import java.sql.SQLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
import com.dataseers.qa.util.TestUtil;

public class RoleMgmt extends TestBase {
	WebDriverWait wait = new WebDriverWait(d, 10);
	Actions actions = new Actions(d);
	String pwd = prop.getProperty("passWord");
	String roledata = GenerateData.generateRandomString(6).toLowerCase();
	Keyboard keyboard = ((HasInputDevices) d).getKeyboard();
 
	// Administration module
	@CacheLookup
	@FindBy(xpath = "//*[@alt='Administration']")
	WebElement administration;

	// role-management module
	@CacheLookup
	@FindBy(xpath = "//*[@href='/role-management']")
	WebElement roleMgmt;

	// add new role button
	@CacheLookup
	@FindBy(xpath = "//*[@title='Add new role']")
	WebElement addRole;

	// add new role name
	@CacheLookup
	@FindBy(xpath = "//*[@id='add_role_name']")
	WebElement addRoleName;

	// all escalated To list
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-selection__rendered']")
	List<WebElement> escalateToList;

	// escalated to input list
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-select-search__field']")
	List<WebElement> escalateInput;

	// save button
	@CacheLookup
	@FindBy(xpath = "//*[@type='submit']")
	WebElement saveBtn;

	// cancel button
	@CacheLookup
	@FindBy(xpath = "//*[@type='button']")
	WebElement cancelBtn;

	// Edit Button
	@CacheLookup
	@FindBy(xpath = "//*[@class='ant-btn m-r-10 m-t-10 ant-btn-primary']")
	WebElement editBtn;

	// search button of report details page
	@CacheLookup
	@FindBy(xpath = "(//*[@title='Filter menu'])[1]")
	WebElement searchByName;

//	// sort drop-down of role management page
//	@CacheLookup
//	@FindBy(xpath = "(//*[@class='anticon anticon-caret-down ant-table-column-sorter-down off' and @aria-label='icon: caret-down'])[2]")
//	WebElement sortdown;

	// added new role name
	@CacheLookup
	@FindBy(xpath = "(//*[@class='ant-table-column-has-actions ant-table-column-has-filters ant-table-column-has-sorters'])[2]")
	WebElement addedrole;

	// all isdeleted toggles on role management landing page
	@CacheLookup
	@FindBy(xpath = "//*[@role='switch']")
	List<WebElement> isDeletedToggle;

	public RoleMgmt(WebDriver d) {
		PageFactory.initElements(d, this);
	}

	public void administrationPage() {
		try {
			log.info("Cliciking on Administration module");
			wait.until(ExpectedConditions.visibilityOf(administration));
			administration.click();
			log.info("role clicked on to Administration successfully!!!!");
		} catch (Exception e) {
			Assert.fail("Administration module not found!!!!");
		}
	}

	public void roleMgmtPage() {
		try {
			administrationPage();
			log.info("Clicking on role management");
			wait.until(ExpectedConditions.visibilityOf(roleMgmt));
			roleMgmt.click();
			log.info("role is redirected to role management page successfully!!!!");
		} catch (Exception e) {
			Assert.fail("role is Not redirected to role management page!!!!");
		}
	}

	public void addRoleButton() {
		try {
			log.info("Clicking on add role button");
			wait.until(ExpectedConditions.elementToBeClickable(addRole));
			addRole.click();
		} catch (Exception e) {
			Assert.fail("Clicking on add role button failed!!!");
		}
	}

	public void roleName() {
		try {
			log.info("Entering new role name");
//			wait.until(ExpectedConditions.elementToBeClickable(addRoleName));
			addRoleName.sendKeys(roledata);
//			String roledata = addRoleName.getAttribute("value");
//			log.info(roledata);
//			if (roledata.isEmpty()) {
//				log.info("new role name added");
//				addRoleName.sendKeys(roleName);
//			} else {
//				addRoleName.click();
//				addRoleName.sendKeys(Keys.CONTROL + "a", Keys.BACK_SPACE);
//				addRoleName.sendKeys(roleName);
//				log.info("rolename edited");
//			}
		} catch (Exception e) {
			Assert.fail("entering Rolename failed");
		}

	}

	public void expandRoleMenu() {
		try {
			log.info("Expanding all menus on role management page");

			List<WebElement> collapseBtn = d.findElements(By.xpath("//*[@data-icon='plus-square']"));
			for (WebElement collapse : collapseBtn) {
				wait.until(ExpectedConditions.elementToBeClickable(collapse));
				collapse.click();
			}
			// real time messages menu expand button
		} catch (Exception e) {
			Assert.fail("Expanding Role menu failed!!!");
		}
	}

	public void rolePermissions(String role) {
		try {

			log.info("Selecting new role permission as:" + role);
			List<WebElement> permissions = d.findElements(By.xpath("//*[ text()='" + role + "']"));

			for (WebElement permit : permissions) {
				wait.until(ExpectedConditions.elementToBeClickable(permit));
				permit.click();
			}
			actions.sendKeys(Keys.PAGE_UP);
		} catch (

		Exception e) {
			Assert.fail("Adding new role failed");
		}
	}

	public void escalateToDropdowns(String escalateTo) {
		try {

			log.info("Selecting alerts dropdown EscalateTo as:" + escalateTo);
			wait.until(ExpectedConditions.elementToBeClickable(escalateToList.get(0)));
			escalateToList.get(0).click();
			escalateInput.get(0).sendKeys(escalateTo);

			wait.until(ExpectedConditions.elementToBeClickable(escalateToList.get(1)));
			escalateToList.get(1).click();
			escalateInput.get(1).sendKeys(escalateTo);

		} catch (

		Exception e) {
			Assert.fail("Failed to select escalateTo dropdowns");
		}
	}

	public void hideToggles() {
		try {

			// all disabled hide toggles(hide empty reports,size etc.) list
			List<WebElement> hideToggle = d.findElements(By.xpath("//*[@role='switch']"));

			log.info("Turning on all disabled toggles on role management page");
			for (int i = 0; i < hideToggle.size(); i++) {
				if (hideToggle.get(i).isEnabled()) {
					wait.until(ExpectedConditions.elementToBeClickable(hideToggle.get(i)));
					hideToggle.get(i).click();
				} else {
					log.info("all toggles are enabled already");
				}
			}
		} catch (Exception e) {
			Assert.fail("Hide toggles selection failed");

		}
	}

	public void saveRole() {
		try {
			log.info("Clicking on save button");
			saveBtn.click();

			log.info("Clicked on save button successfully!!!!");

			d.findElement(By.xpath("//*[@title='Reset filter']")).click();
		} catch (Exception e) {
			Assert.fail("Save new role scenario failed");

		}
	}

	public void verifyRole(String verifyData) {
		try {

			log.info("Verifying that new role has been added!!!!");
			String newrole = addedrole.getText();

			if (newrole.contentEquals(verifyData)) {

				log.info("Newly added role is displayed in a role list: " + newrole);
			}

			else {
				log.info("Newly added role is not displayed in a role list: " + newrole);
				Assert.fail("Failed to verify added or updated role button");
			}
		} catch (Exception e) {
			Assert.fail("Failed to verify added or updated role button");
		}
	}

	public void searchRole(String searchData) {
		try {
			wait.until(ExpectedConditions.elementToBeClickable(searchByName));
			JavascriptExecutor executor = (JavascriptExecutor) d;
			executor.executeScript("arguments[0].click();", searchByName);

			WebElement searchbox = d.findElement(By.xpath("//*[@placeholder='Search name']"));
			wait.until(ExpectedConditions.elementToBeClickable(searchbox));
			actions.sendKeys(searchbox, searchData).perform();

			WebElement searchBtn = d
					.findElement(By.xpath("(//*[@type='button' and @class='ant-btn ant-btn-primary ant-btn-sm'])[1]"));
			wait.until(ExpectedConditions.elementToBeClickable(searchBtn));
			searchBtn.click();
		} catch (Exception e) {
			Assert.fail("Search Role failed");
		}
	}

	public void editRole(String editRoleName) {
		try {

			log.info("Clicking on one existing role");
			d.findElement(By.xpath("//*[text()='" + editRoleName + "']")).click();

			wait.until(ExpectedConditions.elementToBeClickable(editBtn));
			editBtn.click();

		} catch (Exception e) {
			Assert.fail("Edit role scenario failed");
		}
	}

	public void cancelRole() {
		try {
			log.info("Clicking on cancel button");
			cancelBtn.click();
			searchRole(roledata);
			String newrole = addedrole.getText();

			if (newrole.contentEquals(roledata)) {
				Assert.fail("After clicking on cancel button new role has been added");
			}

			else {
				log.info("After clicking on cancel button new role has not been added");
			}

		} catch (Exception e) {
			Assert.fail("cancel button scenario failed");
		}
	}

	public void isDeleted() {
		try {
			wait.until(ExpectedConditions.visibilityOfAllElements(isDeletedToggle));

			log.info("Clicking on isdeleted toggle");
			isDeletedToggle.get(0).click();
			log.info("opted isdeleted as active for newly added role");

		} catch (Exception e) {
			Assert.fail("failed to opt isdeleted as active for newly added role");
		}
	}

//	public void deleteRoledb(String deleteROle) throws SQLException {
//		String deleteQuery = "DELETE FROM roles WHERE name='" + deleteROle + "'";
//		TestUtil.deleteQuerykeydb(deleteQuery);
//
//	}
}