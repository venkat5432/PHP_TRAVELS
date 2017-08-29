package pageobjectsfactory.pageobject;

import common.UrlHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import testcases.Login_Tests;

/**
 * Created by rave7003 on 16-07-2017.
 */
public class SupplierLoginPage  extends BasePageObject{



    private  static final By supplierWelcomeMsg=By.xpath("//span[text()='Dashboard']") ;
    @FindBy(name="email")
    private WebElement userNameInput;
    @FindBy(name="password")
    private WebElement passwordInput;
    @FindBy(xpath = "//button/span[text()='Login']")
    private WebElement submitButton;



    public void openLoginPage() {
        driver.get(UrlHolder.supplierBackEndLoginUrl);
    }

    public void login(String userId, String password) {
        userNameInput.sendKeys(userId);
        passwordInput.sendKeys(password);
        submitButton.click();

    }

    public void verifyLoginPage() {
        Assert.assertEquals(driver.getTitle(),"Supplier Login");
    }

    public void verifyUserLoggedIn() {
        waitTillElementPresent(supplierWelcomeMsg);

        System.out.print("assertions passed");

    }
}
