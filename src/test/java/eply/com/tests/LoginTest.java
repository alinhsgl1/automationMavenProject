package eply.com.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.page1.pageobjects.LoginPage;





public class LoginTest extends BaseTest{
	//WebDriver driver;
    private String sTestCaseName;
    private int iTestCaseRow;
    
    
	@Test(dataProvider = "getDataFromExcel", description = "use incorrect login information")
	public void loginFailed(String username, String password) throws InterruptedException {
		driver.get("https://events.eply.com/login/index.aspx");
		
		LoginPage loginPage = new LoginPage(driver);
		Thread.sleep(3000);
		loginPage.loginFailed(username, password);
		
		String expected = "Sorry, either your username or password was incorrect.";
		String actual = loginPage.getErrorMessage();
		Assert.assertEquals(actual, expected);
		
	}
	
	/*
	 * @Test(priority = 1) public void loginSucceed() {
	 * driver.get("https://events.eply.com/login/index.aspx");
	 * 
	 * LoginPage loginPage = new LoginPage(driver); loginPage.loginSucced("alina",
	 * "123456");
	 * 
	 * String expected = "Sorry, either your username or password was incorrect.";
	 * String actual = loginPage.getErrorMessage(); Assert.assertEquals(actual,
	 * expected); }
	 */
	
	@DataProvider
	public Object[][] getData(){
	       Object[][] myData = {
				{"user1", "1231"},
				{"user2", "1232"},
				{"user3", "1233"},
				{"user4", "1234"},
				{"user5", "1235"},
				{"user6", "1236"},
				{"user7", "1237"},
				{"user8", "1238"},
				{"user9", "1239"},
				{"user10", "12310"},
				{"user11", "12311"},
				
		};
		return myData;
	}
	
	
	
	/*
	 * @DataProvider() public Object[][] getDataFromExcel() throws Exception{
	 * Excel.setExcelFile(
	 * "H:/MyProjects/SeleniumProject/SeleniumPOMStep01/src/eply/com/input.xlsx",
	 * "Sheet1"); sTestCaseName = this.toString(); sTestCaseName =
	 * Excel.getTestCaseName(this.toString()); iTestCaseRow =
	 * Excel.getRowContains(sTestCaseName,0); Object[][] testObjArray =
	 * Excel.getTableArray(
	 * "H:/MyProjects/SeleniumProject/SeleniumPOMStep01/src/eply/com/input.xlsx",
	 * "Sheet1",iTestCaseRow); return (testObjArray); }
	 */
	
}


