package test;

import org.testng.annotations.Test;

import pom.Login;

public class LoginTest extends BaseTest {

	String username = "ritesh21@gmail.com";
	String password = "Password@123";

	@Test(priority = 0, enabled = false)
	public void validUsernameValidPasswordTest() {
		Login login = new Login(driver);
		// login.signUp(username, password);
	}

	@Test(priority = 1, enabled = true)
	public void logInWithValidUsernameValidPasswordTest() throws InterruptedException {
		Login login = new Login(driver);
		Thread.sleep(1000);
		login.clickOnPopUp();
		Thread.sleep(1000);
		login.logIn();
	}

	@Test(priority = 2, enabled = true)
	public void homePageContentAction() throws InterruptedException {
		Login login = new Login(driver);
		Thread.sleep(1000);
		login.homePageContentTest();
	}

	@Test(priority = 3, enabled = true)
	public void buyPhoneEndToEnd() throws InterruptedException {
		Login login = new Login(driver);
		login.buyAPhoneFromCategories();
	}

	@Test(priority = 4, enabled = true)
	public void buyLaptopEndToEnd() throws InterruptedException {
		Login login = new Login(driver);
		login.buyALaptopFromCategories();
	}

	@Test(priority = 5, enabled = true)
	public void buyMonitorEndToEnd() throws InterruptedException {
		Login login = new Login(driver);
		login.buyAMonitorFromCategories();
	}

	@Test(priority = 6, enabled = true)
	public void pSPVerify() throws InterruptedException {
		Login login = new Login(driver);
		login.productStorePageVerification();
	}
}
