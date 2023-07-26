package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunchTestingFrames {
	public WebDriver driver;
	
	@Test(priority =1)
	private void tc01() {
		
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Browser Successfully Launched");
		}
@Test(priority = 2)
private void tc02() {

	driver.get("https://www.facebook.com/");
	System.out.println("Given Url Launched Successfully");
}

@Test(priority = 3)
private void tc03() {
	
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("saga1234");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("5678");
		System.out.println("In-valid Credentials are Entered Successfully");
	}

@Test(priority = 4)
private void tc04() {

		WebElement login = driver.findElement(By.id("login"));
		login.click();
		System.out.println("Login Button Successfuly Clicked");
	}
}


