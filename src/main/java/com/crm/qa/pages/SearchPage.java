package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class SearchPage extends TestBase {
	
	@FindBy(xpath="//span[@class='_2i7N3j']")
	WebElement sortBy;
	
	@FindBy(xpath="//div[@class='_10UF8M _3LsR0e']")
	WebElement relevance;
	
	@FindBy(xpath="//div[normalize-space()='realme C25_Y (Glacier Blue, 128 GB)']")
	WebElement productSelect;
	
	public SearchPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean checkSortBy() {
		return sortBy.isDisplayed();
	}
	
	public boolean checkRelevance() {
		return relevance.isSelected();
	}
	
	public ProductsPage clickOnProduct() {
		productSelect.click();
		
		return new ProductsPage();
	}

}
