package testcases;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Initialize {

	
	private WebDriver driver;
	
	Properties prop=new Properties();
	
	
	public WebDriver browserinit() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\rave7003\\workspace\\Selenium_Tests_PHP_Travels\\config.properties");
		prop.load(fis);
		String browser=prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("FF") )
		{
			System.setProperty("webdriver.gecko.driver","C:\\Custom_Softwares\\geckodriver-v0.17.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver();
			driver.get("https://www.google.co.in");
		}
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Custom_Softwares\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("https://www.yahoo.co.in");
		}
		
		/*
		System.setProperty("webdriver.ie.driver", "C:\\Custom_Softwares\\IEDriverServer_Win32_3.4.0\\IEDriverServer.exe");
		 driver=new InternetExplorerDriver();
		driver.get("https://www.google.co.in");
	

		System.setProperty("webdriverl.edge.driver", "C:\\Custom_Softwares\\Edgedriver\\Microsoft.exe");
		 driver=new EdgeDriver();
		driver.get("https://www.google.co.in");
*/	
		return driver;
	}
}
