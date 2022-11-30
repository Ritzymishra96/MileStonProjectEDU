package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.Common;

public class BaseTest {
	
	static WebDriver driver;
	
	String browser = "chrome";
	String url = "https://www.demoblaze.com/index.html";
	
	Common common;

	@BeforeTest
	public void beforeTest() {
		common = new Common();
		common.setupBrowser(browser, url);
		driver = common.getDriver();
	}

	
	@AfterTest
	public void afterTest() {
//		common.quitBrowser();
	}
}
