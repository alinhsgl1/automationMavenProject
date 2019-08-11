package com.page1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginFailedPage extends BasePage{
	
	@FindBy(css = "#body_ForgotPasswordButton")
	WebElement forgotPasswordLink;
	
	@FindBy(css = "#body_Username")
	WebElement weUserName;
	
	@FindBy(css = "#body_Password")
	WebElement wePassword;
	
	@FindBy(css = "#body_SubmitButton")
	WebElement btnSubmit;
	
	@FindBy(css = "#body_ErrorMessage")
	WebElement message;
	
	
	public LoginFailedPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	
		
		//Actions
		
		public void loginFailed (String username, String password) {
			fillText(weUserName, username);
			fillText(wePassword, password);
			click(btnSubmit);
		}
		
		public String getMessage() {
			
			//message = driver.findElement(By.cssSelector("#body_Message"));
			return message.getText();
		}

	}

