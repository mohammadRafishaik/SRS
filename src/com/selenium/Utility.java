package com.selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class Utility {
static WebDriver driver;
public static String filepath="C:\\Users\\TT089\\eclipse-workspace\\Selenium\\Screenshots";
	public static void screenshot(String name) throws IOException {
		// TODO Auto-generated method stub

		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File f=ts.getScreenshotAs(OutputType.FILE);
//			File location=new File("C:\\\\Users\\\\TT089\\\\eclipse-workspace\\\\Selenium\\\\Screenshots"+name+".png");
			FileUtils.copyFile(f, new File("C:\\\\Users\\\\TT089\\\\eclipse-workspace\\\\Selenium\\\\Screenshots"+name+".png"));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
