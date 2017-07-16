package pageobjectsfactory.pageobject;

import common.UrlHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

/**
 * Created by rave7003 on 16-07-2017.
 */
public class AdminLoginPage extends BasePageObject{


    private  static final By superAdminWelcomeMsg=By.xpath("//span[text()='Super Admin']") ;
    @FindBy(name="email")
    private WebElement userNameInput;
    @FindBy(name="password")
    private WebElement passwordInput;
    @FindBy(xpath = "//button/span[text()='Login']")
    private WebElement submitButton;



    public void openLoginPage() {
        driver.get(UrlHolder.administratorBackEndLoginUrl);
    }

    public void login(String userId, String password) {
        userNameInput.sendKeys(userId);
        passwordInput.sendKeys(password);
        submitButton.click();

    }

    public void verifyLoginPage() {
        Assert.assertEquals(driver.getTitle(),"Administator Login");
    }

    public void verifyUserLoggedIn() {
        actions.waitTillElementPresent(superAdminWelcomeMsg);

        System.out.print("assertions passed");

    }
}
