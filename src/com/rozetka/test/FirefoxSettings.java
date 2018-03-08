package com.rozetka.test;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class FirefoxSettings {

	protected WebDriver driver;
	protected String userEmail = "rozetkatest@mailinator.com";
	protected String userPassword = "Password1";
	
	@BeforeClass
	public void SetUp() {
		driver = new FirefoxDriver();
		driver.get("https://rozetka.com.ua/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
	}
}