package eply.com.tests;

import org.testng.annotations.Test;

import com.page1.pageobjects.ForgotPasswordPage;
import com.page1.pageobjects.LoginPage;



	
public class ForgotPasswordTest extends BaseTest {
	@Test
	public void forgotPasswordTest(){
		driver.get("https://events.eply.com/login/index.aspx");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("alina", "12345");
		
		ForgotPasswordPage forgotPasswordPage =  new ForgotPasswordPage(driver);
		forgotPasswordPage.forgotPassword("alinhsgl@gmail.com");
		
		String massage = forgotPasswordPage.getMessage();
		if(massage.toLowerCase().contains("sorry, either your username o")) {
			System.out.println("The test succeed");
		}
		else {
			System.out.println("The text faild");
		}
	}
}


