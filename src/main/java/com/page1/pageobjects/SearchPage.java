package com.page1.pageobjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

	@FindBy(css = "#FirstName")
	WebElement firstName;
	
	@FindBy(css = "#LastName")
	WebElement lastName;
	
	@FindBy(css = "#Company")
	WebElement companyName;
	
	@FindBy(css = "#Email")
	WebElement email;
	
	@FindBy(css = "#SearchButton")
	WebElement btnSearch;

	public SearchPage(WebDriver driver) {
		super(driver);
		
	}

	//Actions
	
	public void search(String firstName,String lastName,String companyName,String email) {
		fillText(this.firstName, firstName);
		fillText(this.lastName, lastName);
		fillText(this.companyName, companyName);
		fillText(this.email, email);
		
		click(btnSearch);
	}

	
}
