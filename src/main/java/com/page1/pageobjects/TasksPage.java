package com.page1.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TasksPage extends BasePage {
	
	WebElement simpleTaskField;
	WebElement btnAddTask;
	
	public TasksPage(WebDriver driver) {
		super(driver);
		simpleTaskField = driver.findElement(By.cssSelector("#task"));
		btnAddTask = driver.findElement(By.cssSelector("#newtask_adv"));
	}
	
	public void addSimpleTask (String task) throws InterruptedException {
		fillText(simpleTaskField, task);
		//Thread.sleep(3000);
		click(btnAddTask);
		//Thread.sleep(3000);
	}

}
