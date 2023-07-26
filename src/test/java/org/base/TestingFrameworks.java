package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingFrameworks extends BaseClass  {
	public static WebDriver driver;
		public static void getdriver(String url) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
		//public static void tc01() {
		driver.get("https://www.facebook.com/");
		System.out.println("url Launched Successfuly");
		
	
		driver.get("email");
		System.out.println("Sags");
		}
	

}
