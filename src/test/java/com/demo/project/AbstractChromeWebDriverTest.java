
package com.demo.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AbstractChromeWebDriverTest {

	protected WebDriver driver;

	public AbstractChromeWebDriverTest() {
		super();
	}

	@BeforeTest
	public void beforeTest() {
		//Download the web driver executable
		WebDriverManager.chromedriver().setup();
		
		//Create a instance of your web driver - chrome
		driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		System.out.println("************ Executed successfully *****************");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
	public void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}