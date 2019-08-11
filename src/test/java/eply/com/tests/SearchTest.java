package eply.com.tests;
import org.testng.annotations.Test;

import com.page1.pageobjects.LoginPage;
import com.page1.pageobjects.MyFormsPage;
import com.page1.pageobjects.SearchPage;





public class SearchTest extends BaseTest{

	
	@Test(priority = 1)
	public void login() throws InterruptedException {
		
		driver.get("https://www.eply.com/Login/index.aspx?Logout=True");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("gal2@informup.com", "a1234567");
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 2)
	public void searh () {
		
		MyFormsPage myForms = new MyFormsPage(driver);
		myForms.openSearchAll();
		
		SearchPage searchPage = new SearchPage(driver);
		searchPage.search("gal", "m", "automation.co.il", "gal@gmail.com");
	}

}
