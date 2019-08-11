package com.page1.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends BasePage{
	
	@FindBy(css = "#body_ForgotPasswordButton")
	WebElement forgotPasswordLink;

	@FindBy(css = "#body_Username")
	WebElement weUserName;
	
	@FindBy(css = "#body_Password")
	WebElement wePassword;
	
	@FindBy(css = "#body_SubmitButton")
	WebElement btnSubmit;
	
	@FindBy(css = "#body_ErrorMessage")
	WebElement errorMessage;
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		//forgotPasswordLink = driver.findElement(By.cssSelector("#body_ForgotPasswordButton"));
		//PageFactory.initElements(factory, page);
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(btnSubmit));
	}

	
	//Actions
	
	public void login (String username, String password) {
		fillText(weUserName, username);
		fillText(wePassword, password);
		click(btnSubmit);
	}
	
	public void loginFailed (String username, String password) {
		fillText(weUserName, username);
		fillText(wePassword, password);
		click(btnSubmit);
	}
	
	public void loginSucced (String username, String password) {
		fillText(weUserName, username);
		fillText(wePassword, password);
		click(btnSubmit);
	}


	public String getMessage() {
		
		//message = driver.findElement(By.cssSelector("#body_Message"));
		return errorMessage.getText();
	}
	
	public String getErrorMessage() {
		return getText(errorMessage);
	}
}

