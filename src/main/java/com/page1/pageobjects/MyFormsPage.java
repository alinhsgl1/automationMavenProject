package com.page1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyFormsPage extends BasePage{
	
	@FindBy(css = "#ePlyHeader_SearchLink")
	WebElement searchAll;
	
	public MyFormsPage(WebDriver driver) {
		super(driver);
		
	}
	
	//Actions
	public void openSearchAll() {
		click(searchAll);
	}

}