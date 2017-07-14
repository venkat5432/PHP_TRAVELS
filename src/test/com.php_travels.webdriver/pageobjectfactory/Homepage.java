package pageobjectfactory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import testcases.Initialize;

public class Homepage {

	WebDriver driver;
	
	private String logindirecturl="http://phptravels.com/demo/";
	public Homepage() throws IOException
	{
		Initialize obj=new Initialize();
		driver=obj.browserinit();
	}

	public void load()
	{
		driver.get(logindirecturl);
		
	}

	
	
	
	
	
	
	
}