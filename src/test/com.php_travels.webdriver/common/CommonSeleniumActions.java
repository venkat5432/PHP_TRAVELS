package common;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonSeleniumActions {

    WebDriver driver;
    public CommonSeleniumActions(WebDriver driver)
    {
        this.driver=driver;
    }
public void waitTillElementPresent(By element)
    {

        WebElement myDynamicElement = (new WebDriverWait(driver, 10))
                .until(ExpectedConditions.presenceOfElementLocated(element));
    }

}
