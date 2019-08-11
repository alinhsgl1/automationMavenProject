package eply.com.tests;

import org.testng.annotations.Test;

import com.page1.pageobjects.TasksPage;



public class TasksTest  extends BaseTest{
	
	@Test
	public void taskPage() throws InterruptedException {
		
		
		driver.get("http://www.mytinytodo.net/demo/");
		
		TasksPage tasksPage = new TasksPage(driver);
		tasksPage.addSimpleTask("My new task");
		
		//driver.quit();
	}

}
