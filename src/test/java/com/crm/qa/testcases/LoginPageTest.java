package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MyAccountPage;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class LoginPageTest extends TestBase{
	MyAccountPage myAccountPage;
	LoginPage loginPage;

	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority=1)
	@Description("Verify page title")
	@Epic("EP001")
	@Feature("Headphones")
	@Story("Story is: page title")
	@Step("To search page title")
	@Severity(SeverityLevel.NORMAL)
	public void loginPageTitletest() {
		String title = loginPage.validatePageTitle();
		Assert.assertEquals(title, "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");

	}
	
	@Test(priority=2)
	@Description("Verify logo")
	@Epic("EP001")
	@Feature("Logo")
	@Story("Story is: logo")
	@Step("To search logo")
	@Severity(SeverityLevel.NORMAL)
	public void flipkartLogo() {
		boolean flag = loginPage.validateLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	@Description("Verify search")
	@Epic("EP001")
	@Feature("Search")
	@Story("Story is: search")
	@Step("To search search")
	@Severity(SeverityLevel.NORMAL)
	public void searchBoxTest() {
		boolean flag1 = loginPage.validateSearchBox();
		Assert.assertTrue(flag1);
	}	
	
	@Test(priority=4)
	@Description("Verify Login")
	@Epic("EP001")
	@Feature("Login")
	@Story("Story is: Login")
	@Step("To search Login")
	@Severity(SeverityLevel.BLOCKER)
	public void userLoginTest() {
		myAccountPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
}	
	
