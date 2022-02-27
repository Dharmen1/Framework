package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HeadphonesPage extends TestBase {
	
	@FindBy(xpath="//h1[@class='_10Ermr']")
	WebElement headPhones;
	
	public HeadphonesPage() {
		PageFactory.initElements(driver, this);
	}

	public boolean verifyHeadphones() {
		// TODO Auto-generated method stub
		return headPhones.isDisplayed();
	}

	

	
}
