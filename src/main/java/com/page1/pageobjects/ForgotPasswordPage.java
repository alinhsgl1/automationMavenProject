package com.page1.pageobjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgotPasswordPage extends BasePage{
	@FindBy(css = "#body_Username")
	WebElement username;
	
	@FindBy(css = "#body_SubmitButton")
	WebElement submit;
	
	@FindBy(css = "#body_ErrorMessage")
	WebElement message;
	
	public ForgotPasswordPage(WebDriver driver) {
		super(driver);
		//username = driver.findElement(By.cssSelector("#body_Username"));
		//submit = driver.findElement(By.cssSelector("#body_SubmitButton"));
		//message = driver.findElement(By.cssSelector("#body_Message"));
	}
	
	public void forgotPassword(String user) {	
		fillText(username, user);
		click(submit);
		
	}

	public String getMessage() {
		
		//message = driver.findElement(By.cssSelector("#body_Message"));
		return message.getText();
	}


	
	
}
