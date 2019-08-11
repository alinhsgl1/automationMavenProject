package eply.com.tests;

import org.testng.annotations.Test;

import com.page1.pageobjects.NewTaskPage;
import com.page1.pageobjects.TasksPage;



public class AddNewTaskTest extends BaseTest{
	
	@Test
	public void taskPage1 () throws InterruptedException {
		
		
		driver.get("http://www.mytinytodo.net/demo/");
		
		TasksPage tasksPage = new TasksPage(driver);
		tasksPage.addSimpleTask("My new task");
		
		
		NewTaskPage newTaskPage = new NewTaskPage(driver);

		
		newTaskPage.addNew1Task("9/5/18", "My new task", "Here you can  write your note", "automation");
		
		//driver.quit();
	}

}
