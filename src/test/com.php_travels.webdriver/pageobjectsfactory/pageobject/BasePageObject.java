package pageobjectsfactory.pageobject;

import common.CommonSeleniumActions;
import common.WebDriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

/**
 * Created by rave7003 on 16-07-2017.
 */
public class BasePageObject {

    WebDriverProvider webDriverProvider=new WebDriverProvider();
    WebDriver driver=webDriverProvider.getDriver();
    CommonSeleniumActions actions=new CommonSeleniumActions(driver);


    public BasePageObject() {
        PageFactory.initElements(driver, this);
    }





}