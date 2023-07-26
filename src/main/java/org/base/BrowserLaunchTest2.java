package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunchTest2 {
	public WebDriver driver;
	
	//@Test(priority = 5)
	//public void  tc05() {
	//	try {
		//	WebDriverManager.chromedriver().setup();
			//driver = new ChromeDriver();
			//driver.manage().window().maximize();
		//	System.out.println("Browser successfully Launched");
	//	}catch (Exception e) {
			// TODO: handle exception
	//	}
	//}
@Test(priority = 2)	
private void tc02() {
	try {
		driver.get("https://www.facebook.com/");
		System.out.println("Given Url Launched Successfully");
	}catch (Exception e) {
		// TODO: handle exception
	}
}
@Test(priority = 3)
private void tc03() {
	try {
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("saga10591@gmail.com");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("9487733045");
		System.out.println("Valid Credentials are Entered Successfully ");
	}catch (Exception e) {
		// TODO: handle exception
	}
}
@Test(priority = 4)
private void tc04() {
	try {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		System.out.println("Login Button Successfully Clicked");
	}catch (Exception e) {
		// TODO: handle exception
	}
}



	
	
	
	
	
	
	
	
	
	
}