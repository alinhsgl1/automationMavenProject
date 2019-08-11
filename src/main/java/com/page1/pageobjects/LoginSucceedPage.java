package com.page1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSucceedPage extends BasePage{

	
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
	
	public LoginSucceedPage(WebDriver driver) {
		super(driver);
		//forgotPasswordLink = driver.findElement(By.cssSelector("#body_ForgotPasswordButton"));
		//PageFactory.initElements(driver, this);
	}


		
		//Actions
		
		public void loginSucced (String username, String password) {
			fillText(weUserName, username);
			fillText(wePassword, password);
			click(btnSubmit);
		}
		
		public String getMessage() {
			
			//message = driver.findElement(By.cssSelector("#body_Message"));
			return message.getText();
		}

	}


