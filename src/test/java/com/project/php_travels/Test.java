package com.project.php_travels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	
	
	@org.testng.annotations.Test
	public void test()
	{
		System.setProperty("webdriver.gecko.driver","C:\\Custom_Softwares\\geckodriver-v0.17.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
	}
}
