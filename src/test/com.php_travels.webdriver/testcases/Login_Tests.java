package testcases;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import common.Credentials;
import pageobjectsfactory.pageobject.AdminLoginPage;
import pageobjectsfactory.pageobject.LoginPage;
import pageobjectsfactory.pageobject.SupplierLoginPage;

public class Login_Tests {

	Credentials credentials= new Credentials();
	
	
	@Test
	public void homePageFrontEndLogin() throws IOException
	{
		LoginPage loginPage=new LoginPage();
		loginPage.openLoginPage();
		loginPage.verifyLoginPage();
		loginPage.login(credentials.userId,credentials.password);
        loginPage.verifyUserLoggedIn();
    }


	@Test
	public void administratorBackEndLogin()
	{
        AdminLoginPage adminLoginPage=new AdminLoginPage();
        adminLoginPage.openLoginPage();
        adminLoginPage.verifyLoginPage();
        adminLoginPage.login(credentials.adminUserId,credentials.adminPassword);
        adminLoginPage.verifyUserLoggedIn();
	}


	@Test
	public void supplierBackEndLogin()
	{
        SupplierLoginPage supplierLoginPage=new SupplierLoginPage();
        supplierLoginPage.openLoginPage();
        supplierLoginPage.verifyLoginPage();
        supplierLoginPage.login(credentials.supplierUserId,credentials.supplierPassword);
        supplierLoginPage.verifyUserLoggedIn();
	}




			}

