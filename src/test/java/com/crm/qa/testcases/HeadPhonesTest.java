package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HeadphonesPage;
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

public class HeadPhonesTest extends TestBase {
	
	LoginPage loginPage;
	MyAccountPage myAccountPage;
	HeadphonesPage headphones;

	public HeadPhonesTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		myAccountPage = new MyAccountPage();
		headphones = new HeadphonesPage();
        myAccountPage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		headphones =  myAccountPage.electronicsTabTest();
	}
	
	@Test
	@Description("Verify Headphones")
	@Epic("EP001")
	@Feature("Headphones")
	@Story("Story is: HeadPhones")
	@Step("To search headphones")
	@Severity(SeverityLevel.NORMAL)
	public void verifyHeadPhonesTest() {
		boolean flag = headphones.verifyHeadphones();
		Assert.assertTrue(flag);
	}
	
}
