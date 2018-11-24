package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowsersExecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TT089\\Downloads\\Browser drivers\\chromedriver.exe");
//		
//		WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.ie.driver", "C:\\Users\\TT089\\Downloads\\tezst2\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		driver.get("http://www.testingmasters.com/hrm/");
		
		driver.findElement(By.xpath(".//*[@id='divUsername']")).sendKeys("sdfgsfg");
		
		
		
	//	driver.findElement(By.id("txtUsername")).sendKeys("User02");
	
		
	}

}
