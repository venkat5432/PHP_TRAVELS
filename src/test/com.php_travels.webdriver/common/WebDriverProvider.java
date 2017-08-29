package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



import org.openqa.selenium.ie.InternetExplorerDriver;


public class WebDriverProvider {

    WebDriver driver;


    public void initDriver () {
        PropertyReader prop = new PropertyReader(Configurations.config_file);
        String browser = prop.getValue("browser");
        try {
            if (browser.equalsIgnoreCase("FF")) {
                System.setProperty("webdriver.gecko.driver", "resources/geckodriver_Firefox/geckodriver.exe");
                driver = new FirefoxDriver();
            }

            //  C:\Custom_Softwares\chromedriver_win32\chromedriver.exe
            if (browser.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "resources/chromedriver/chromedriver.exe");
                driver = new ChromeDriver();
            }

            if (browser.equalsIgnoreCase("IE")) {
                System.setProperty("webdriver.ie.driver", "resources/IEDriverServer/IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            }
            if (browser.equalsIgnoreCase("Edge")) {
                System.setProperty("webdriver.edge.driver", "resources/Edgedriver/MicrosoftWebDriver.exe");
                driver = new EdgeDriver();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        public WebDriver returnDriver()
    {
        return driver;
    }


}