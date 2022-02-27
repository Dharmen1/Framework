package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath = "//img[@title='Flipkart']")
	WebElement flipkart;
	
	@FindBy(xpath = "//input[@name='q']")
	WebElement search;
	
	@FindBy(xpath = "//a[contains(text(),'Login')]")
	WebElement login;
	
	@FindBy(xpath = "//input[@class='_2IX_2- VJZDxU']")
	WebElement username;
	
	@FindBy(xpath = "//input[@class='_2IX_2- _3mctLh VJZDxU']")
	WebElement password;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	WebElement loginbutton;	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
	    return flipkart.isDisplayed();	
	}
	
	public boolean validateSearchBox() {
		return search.isDisplayed();
	}
	
	public void clickOnLogin() {
		login.click();
	}
	
	public MyAccountPage login(String un, String pwd) {		
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
		
		return new MyAccountPage();
		
	}
		
}
