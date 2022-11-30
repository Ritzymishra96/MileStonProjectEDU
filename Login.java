package pom;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Login {

	static String expectedSignUpMessage = "Sign up successful.";

	private WebDriver driver;
	WebDriverWait wait;

	@CacheLookup
	@FindBy(partialLinkText = "Sign up")
	WebElement signUp;

	@CacheLookup
	@FindBy(id = "sign-username")
	WebElement un;

	@CacheLookup
	@FindBy(id = "sign-password")
	WebElement pwd;

	@CacheLookup
	@FindBy(xpath = "//button[contains(text()='Close']")
	WebElement closeBtn;

	@CacheLookup
	@FindBy(xpath = "//button[contains(text(),'Sign up')]")
	WebElement signUpBtn;

	// login paths

	@CacheLookup
	@FindBy(partialLinkText = "Log in")
	WebElement logIn;

	@CacheLookup
	@FindBy(id = "loginusername")
	WebElement emailID;

	@CacheLookup
	@FindBy(id = "loginpassword")
	WebElement loginPwd;

	@CacheLookup
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	WebElement clickToLogin;

	@CacheLookup
	@FindBy(partialLinkText = "Close")
	WebElement closeLogIn;

	// home Page Content Test Page

	@CacheLookup
	@FindBy(partialLinkText = "Home")
	WebElement homePage;

	@CacheLookup
	@FindBy(partialLinkText = "Contact")
	WebElement clickOnContact;

	@CacheLookup
	@FindBy(xpath = "//input[@id='recipient-email']")
	WebElement contactEmail;

	@CacheLookup
	@FindBy(xpath = "//input[@id='recipient-name']")
	WebElement contactName;

	@CacheLookup
	@FindBy(xpath = "//textarea[@id='message-text']")
	WebElement contactMessage;

	@CacheLookup
	@FindBy(xpath = "//button[contains(text(),'Send message')]")
	WebElement sendMessage;

	@CacheLookup
	@FindBy(partialLinkText = "About us")
	WebElement aboutUs;

	// CATEGORIES Locators Phone

	@CacheLookup
	@FindBy(xpath = "//div[@class='list-group']/child::a[contains(text(),'Phones')]")
	WebElement phones;

	@CacheLookup
	@FindBy(xpath = "//div[@class='list-group']/child::a[contains(text(),'Laptops')]")
	WebElement laptops;

	@CacheLookup
	@FindBy(xpath = "//div[@class='list-group']/child::a[contains(text(),'Monitors')]")
	WebElement monitors;

	@CacheLookup
	@FindBy(xpath = "//div[@class='card-block']/child::h4/child::a[contains(text(),'Samsung galaxy s6')]")
	WebElement selectPhone;

	@CacheLookup
	@FindBy(xpath = "//div[@id='tbodyid']/child::h2[contains(text(),'Samsung galaxy s6')]")
	WebElement verifySelectedPhone;

	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'Add to cart')]")
	WebElement addToCart;

	@CacheLookup
	@FindBy(partialLinkText = "Cart")
	WebElement clickToCart;

	@CacheLookup
	@FindBy(xpath = "//button[contains(text(),'Place Order')]")
	WebElement placeOrder;

	@CacheLookup
	@FindBy(id = "name")
	WebElement name;

	@CacheLookup
	@FindBy(id = "country")
	WebElement country;

	@CacheLookup
	@FindBy(id = "city")
	WebElement city;

	@CacheLookup
	@FindBy(id = "card")
	WebElement creditCard;

	@CacheLookup
	@FindBy(id = "month")
	WebElement month;

	@CacheLookup
	@FindBy(id = "year")
	WebElement year;

	@CacheLookup
	@FindBy(xpath = "//button[contains(text(),'Purchase')]")
	WebElement Purchase;

	@CacheLookup
	@FindBy(xpath = "//h2[contains(text(),'Thank you for your purchase!')]")
	WebElement verifyPurchaseMessage;

	@CacheLookup
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	WebElement clickOK;

	// CATEGORIES Locators Laptop

	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'MacBook air')]")
	WebElement selectLaptop;

	@CacheLookup
	@FindBy(xpath = "//div[@id='tbodyid']/child::h2[contains(text(),'MacBook air')]")
	WebElement verifySelectedLaptop;

	// CATEGORIES Locators Monitors

	@CacheLookup
	@FindBy(xpath = "//a[contains(text(),'Apple monitor 24')]")
	WebElement selectMonitor;

	@CacheLookup
	@FindBy(xpath = "//div[@id='tbodyid']/child::h2[contains(text(),'Apple monitor 24')]")
	WebElement verifySelectedMonitor;

	// productStorePageVerification LOCATORS

	@CacheLookup
	@FindBy(partialLinkText = "PRODUCT STORE")
	WebElement productStoreVerify;

	@CacheLookup
	@FindBy(xpath = "//h4[@class='grrrr']/child::b[contains(text(),'About Us')]")
	WebElement aboutUsVerify;

	@CacheLookup
	@FindBy(xpath = "//p[contains(text(),'Copyright © Product Store 2017')]")
	WebElement copyRightVerify;

	@CacheLookup
	@FindBy(xpath = "//span[@class = 'carousel-control-next-icon']")
	WebElement slideButton;

	@CacheLookup
	@FindBy(partialLinkText = "Log out")
	WebElement logOut;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}

	public void signUp(String username, String password) {

		signUp.click();

		wait.until(ExpectedConditions.visibilityOf(un));

		un.clear();
		un.sendKeys(username);

		pwd.clear();
		pwd.sendKeys(password);

		signUpBtn.click();

	}

	public void logIn() throws InterruptedException {

		logIn.click();

		// wait.until(ExpectedConditions.visibilityOf(un));

		Thread.sleep(1000);

		emailID.clear();
		emailID.sendKeys("ritesh1@gmail.com");

		loginPwd.clear();
		loginPwd.sendKeys("Password@123");

		Thread.sleep(1000);

		clickToLogin.click();

	}

	public void clickOnPopUp() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertSignUpMessage = alert.getText();

			if (expectedSignUpMessage.equalsIgnoreCase(alertSignUpMessage)) {
				System.out.println("Expected and Actual message are same");
			} else {
				System.out.println("Expected and Actual message are not same");
			}

			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}
	}

	public void homePageContentTest() throws InterruptedException {

		Thread.sleep(1000);
		homePage.click();
		String expectedTitle = "STORE";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(expectedTitle, actualTitle);

		Thread.sleep(1000);

		clickOnContact.click();

		wait.until(ExpectedConditions.visibilityOf(contactEmail));
		contactEmail.clear();
		contactEmail.sendKeys("ritesh123@gmail.com");
		contactName.clear();
		contactName.sendKeys("Ritesh Kumar Mishra");
		contactMessage.clear();
		contactMessage.sendKeys("I want this Product");
		sendMessage.click();

		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not present");
		}

	}

	public void buyAPhoneFromCategories() throws InterruptedException {

		phones.click();

		wait.until(ExpectedConditions.visibilityOf(selectPhone));
		selectPhone.click();

		wait.until(ExpectedConditions.visibilityOf(verifySelectedPhone));
		String actualText = verifySelectedPhone.getText();
		String expectedText = "Samsung galaxy s6";
		Assert.assertEquals(actualText, expectedText);

		addToCart.click();

		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not Present");
		}

		clickToCart.click();
		Thread.sleep(2000);

		placeOrder.click();

		wait.until(ExpectedConditions.visibilityOf(name));
		name.sendKeys("Ritesh Kumar Mishra");
		country.sendKeys("India");
		city.sendKeys("Pune");
		creditCard.sendKeys("123456789");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		month.sendKeys("09");
		year.sendKeys("2029");
		Purchase.click();

		String expectedTextPurchase = "Thank you for your purchase!";
		System.out.println(verifyPurchaseMessage.getText());
		String actualTextPurchase = verifyPurchaseMessage.getText();
		Assert.assertEquals(expectedTextPurchase, actualTextPurchase);

		wait.until(ExpectedConditions.visibilityOf(verifyPurchaseMessage));

		Thread.sleep(2000);

		clickOK.click();

	}

	// Purchasing a laptops

	public void buyALaptopFromCategories() throws InterruptedException {

		laptops.click();

		wait.until(ExpectedConditions.visibilityOf(selectLaptop));
		selectLaptop.click();
		wait.until(ExpectedConditions.visibilityOf(verifySelectedLaptop));
		String actualText = "MacBook air";
		String expectedText = verifySelectedLaptop.getText();
		Assert.assertEquals(actualText, expectedText);

		addToCart.click();

		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not Present");
		}

		clickToCart.click();
		Thread.sleep(2000);

		placeOrder.click();

		wait.until(ExpectedConditions.visibilityOf(name));
		name.sendKeys("Ritesh Kumar Mishra");
		country.sendKeys("India");
		city.sendKeys("Pune");
		creditCard.sendKeys("123456789");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		month.sendKeys("09");
		year.sendKeys("2029");
		Purchase.click();

		String expectedTextPurchase = "Thank you for your purchase!";
		System.out.println(verifyPurchaseMessage.getText());
		String actualTextPurchase = verifyPurchaseMessage.getText();
		Assert.assertEquals(expectedTextPurchase, actualTextPurchase);

		wait.until(ExpectedConditions.visibilityOf(verifyPurchaseMessage));

		Thread.sleep(2000);

		clickOK.click();

		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,150)");
	}

	public void buyAMonitorFromCategories() throws InterruptedException {
		monitors.click();

		wait.until(ExpectedConditions.visibilityOf(selectMonitor));
		selectMonitor.click();
		wait.until(ExpectedConditions.visibilityOf(verifySelectedMonitor));
		String actualText = "Apple monitor 24";
		String expectedText = verifySelectedMonitor.getText();
		Assert.assertEquals(actualText, expectedText);

		addToCart.click();

		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("Alert is not Present");
		}

		clickToCart.click();
		Thread.sleep(2000);

		placeOrder.click();

		wait.until(ExpectedConditions.visibilityOf(name));
		name.sendKeys("Ritesh Kumar Mishra");
		country.sendKeys("India");
		city.sendKeys("Pune");
		creditCard.sendKeys("123456789");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,150)");
		month.sendKeys("09");
		year.sendKeys("2029");
		Purchase.click();

		String expectedTextPurchase = "Thank you for your purchase!";
		System.out.println(verifyPurchaseMessage.getText());
		String actualTextPurchase = verifyPurchaseMessage.getText();
		Assert.assertEquals(expectedTextPurchase, actualTextPurchase);

		wait.until(ExpectedConditions.visibilityOf(verifyPurchaseMessage));

		Thread.sleep(2000);

		clickOK.click();

		Thread.sleep(2000);

	}

	public void productStorePageVerification() throws InterruptedException {

		String expectedText = "PRODUCT STORE";
		String actualText = productStoreVerify.getText();
		Assert.assertEquals(expectedText, actualText);
		Thread.sleep(2000);
		slideButton.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,3000)");

		String expectedTextAbout = "About Us";
		String actualTextAbout = aboutUsVerify.getText();
		Assert.assertEquals(expectedTextAbout, actualTextAbout);

		Thread.sleep(1000);

		String expectedTextCopyright = "Copyright © Product Store 2017";
		String actualCopyright = copyRightVerify.getText();
		Assert.assertEquals(expectedTextCopyright, actualCopyright);

		js.executeScript("window.scrollBy(0,-3000)");
		Thread.sleep(1000);
		logOut.click();
		// check user is able to login with un-valid credential
		logIn.click();
		Thread.sleep(1000);

		emailID.clear();
		emailID.sendKeys("akjhksajhdkjsahdkjsab");

		loginPwd.clear();
		loginPwd.sendKeys("akjhkjashkjsagdhkjh");

		Thread.sleep(1000);

		clickToLogin.click();

		Thread.sleep(1000);
		clickOnPopUp();

	}

}
