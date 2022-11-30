package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common {
	
	private WebDriver driver;
	
	public void setupBrowser(String browser, String url) {
		String currDir = System.getProperty("user.dir");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", currDir + "\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", currDir + "\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("valid browser now provided, hence quitting the automation run");
			System.exit(0);
		}
		
		//maximize the window
		driver.manage().window().maximize();
		
		
		//open url
		if(url!="")
			driver.get(url);
		else
			driver.get("about:blank");
		
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public void closeTab() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}

}
