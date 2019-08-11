package eply.com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "H:/MyProjects/SeleniumProject/SeleniumDrivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
		//WebDriverWait wait = new WebDriverWait(driver, 15); wait.until(ExpectedConditions.elementToBeClickable(By.id("userName")));
	}
	
	@AfterClass
	public void tearDrown() {
		driver.quit();
	}

}
