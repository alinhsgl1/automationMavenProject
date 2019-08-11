package com.page1.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;


public class NewTaskPage  extends BasePage{

	WebElement wePriority;
	WebElement weDate;
	WebElement weTask;
	WebElement weNote;
	WebElement weTags;
	WebElement btnSave;
	
	
	public NewTaskPage(WebDriver driver) {
		super(driver);
		wePriority= driver.findElement(By.xpath("//select[@name='prio']"));
		weDate = driver.findElement(By.cssSelector("#duedate"));
	    weTask = driver.findElement(By.xpath("//div[@class='form-row']//input[@name='task']"));
	    weNote = driver.findElement(By.xpath("//textarea[@name='note']"));
	    weTags = driver.findElement(By.cssSelector("#edittags"));
		btnSave = driver.findElement(By.xpath("//div[8]//input[1]"));
	}
	
	public void  addNew1Task(String date, String task, String note, String tags) throws InterruptedException {
		Select selectPriority = new Select(wePriority);
		selectPriority.selectByVisibleText("+1");
		fillText(weDate, date);
		fillText(weTask, task);
		fillText(weNote, note);
		fillText(weTags, tags);
		
		Thread.sleep(3000);
		
		click(btnSave);
	}
	

}
