package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MyAccountPage;
import com.crm.qa.util.TestUtil;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class MyAccountTest extends TestBase {
	LoginPage loginPage;
	MyAccountPage myAccountPage;
	
	public MyAccountTest() {
		super();	
	}

	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		myAccountPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	@Description("Verify visible account")
	@Epic("EP001")
	@Feature("Account visibility")
	@Story("Story is: account visible")
	@Step("To search accont visible")
	@Severity(SeverityLevel.NORMAL)
	public void accountVisibilityTest() {
		boolean flag = myAccountPage.accountVisibility();
		TestUtil.captureScreenshot(driver, "failure");
		Assert.assertTrue(flag);
	}
	
	@Test
	@Description("Verify search")
	@Epic("EP001")
	@Feature("search")
	@Story("Story is: search")
	@Step("To search search")
	@Severity(SeverityLevel.NORMAL)
	public void verifySearchBoxTest() {
		boolean flag1 = myAccountPage.searchBoxVisibility();
		Assert.assertTrue(flag1);
		
	}
	
	@Test
	@Description("Verify product")
	@Epic("EP001")
	@Feature("product")
	@Story("Story is: product")
	@Step("To search product")
	@Severity(SeverityLevel.NORMAL)
	public void validateSearchProductTest() {
		myAccountPage.searchProduct();
	}
	
	
}
