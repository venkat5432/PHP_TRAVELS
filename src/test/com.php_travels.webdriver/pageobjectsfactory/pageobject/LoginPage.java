package pageobjectsfactory.pageobject;

import common.UrlHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import testcases.Login_Tests;


public class LoginPage extends BasePageObject {

    private  static final By welcomeMessage=By.xpath("//h3[text()='Hi, John Smith']") ;
   @FindBy(name="username")
   private WebElement userNameInput;
   @FindBy(name="password")
    private WebElement passwordInput;
   @FindBy(xpath = "//button[text()='Login']")
    private WebElement submitButton;


    public LoginPage()
    {

    }

    public void openLoginPage() {
    driver.get(UrlHolder.homePageLoginUrl);
    }

    public void login(String userId, String password) {
        userNameInput.sendKeys(userId);
        passwordInput.sendKeys(password);
        submitButton.click();

    }

    public void verifyLoginPage() {
        Assert.assertEquals(driver.getTitle(),"Login");
    }

    public void verifyUserLoggedIn() {
        waitTillElementPresent(welcomeMessage);
        System.out.print("assertions passed");
        //driver.close();
    }

}
