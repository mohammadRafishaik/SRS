package com.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class Leaveapply extends Utility  {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		
		
		WebDriver driver=new FirefoxDriver();
		Leaveapply obj=new Leaveapply();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.testingmasters.com/hrm/");
		
	Utility.screenshot("Rafi2");
//		driver.findElement(By.id("txtUsername")).sendKeys("user02");
//		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
//		driver.findElement(By.id("btnLogin")).click();
//		
//		Thread.sleep(3000);
//		
//		//Mpouse over action(Element)
//		WebElement mouseover=driver.findElement(By.id("menu_leave_viewLeaveModule"));
//	///	create object for action class
//		Actions act=new Actions(driver);
//		act.moveToElement(mouseover).build().perform();
//		
//	
//		driver.findElement(By.id("menu_leave_applyLeave")).click();
//		
//		//How to handle drop down by using selenium webdriver
//
//		WebElement dropdownelement=driver.findElement(By.id("applyleave_txtLeaveType"));
//		Select obj=new Select(dropdownelement);
//		Thread.sleep(3000);
//
//	//	obj.selectByVisibleText("Annual Leave");
////		obj.selectByValue("1");
//		obj.selectByIndex(2);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
