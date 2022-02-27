package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class MyAccountPage extends TestBase {
	
	@FindBy(xpath="//div[contains(text(),'My Account')]")
	WebElement account;
	
	@FindBy(xpath="//input[@class='_3704LK']")
	WebElement searchBox;
	
	@FindBy(xpath="//button[@type='submit']//*[name()='svg']")
	WebElement svgEnter;
	
	@FindBy(xpath="//a[normalize-space()='Bluetooth Headphones']")
	WebElement bluetoothPhones;
		
	@FindBy(xpath="//div[contains(text(),'Electronics')]")
	WebElement electronics;
	
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean accountVisibility() {
		return account.isDisplayed();
	}
	
	public boolean searchBoxVisibility() {
		return searchBox.isDisplayed();		
	}
	
	public SearchPage searchProduct() {
		searchBox.sendKeys("Mobiles");
		svgEnter.click();
		
		return new SearchPage();
	}
	
	public HeadphonesPage electronicsTabTest() {
		Actions action = new Actions(driver);
		action.moveToElement(electronics).build().perform();
		bluetoothPhones.click();
		
		return new HeadphonesPage();
	}
	
	
	
	
	

}
