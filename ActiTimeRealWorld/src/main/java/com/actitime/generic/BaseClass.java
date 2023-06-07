package com.actitime.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	}
	@BeforeTest
	public void openBrowser() {
		driver=new ChromeDriver();
		
	}

	
	
}
