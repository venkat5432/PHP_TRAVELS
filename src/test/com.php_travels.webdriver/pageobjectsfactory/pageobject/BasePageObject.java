package pageobjectsfactory.pageobject;

import common.WebDriverProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

/**
 * Created by rave7003 on 16-07-2017.
 */
public class BasePageObject {

    WebDriverProvider webDriverProvider;
    WebDriver driver;
    //CommonSeleniumActions actions=new CommonSeleniumActions(driver);


    public BasePageObject() {
        webDriverProvider=new WebDriverProvider();
        webDriverProvider.initDriver();
        driver=webDriverProvider.returnDriver();
        PageFactory.initElements(driver, this);
    }


    public void waitTillElementPresent(By element)
    {

        WebElement myDynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(element));
    }

    public void closeBrowser() {
        driver.close();
    }
}