package com.rozetka.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;



public class MainPage {
	private WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
	By signInButtonLocator	= By.xpath("//*[@name='signin']");
	By emailInputLocator = By.xpath("//*[@name='login']");
	By passwordInputLocator = By.xpath("//div[contains(text(), 'Пароль')]//following-sibling::input");
	By submitButtonLocator = By.xpath("//*[@name='auth_submit']");
	By closeSocialPopUpLocator = By.xpath("//*[@name='close']");
	By userNameLocator = By.xpath("//span[@id='header_user_menu_parent']//child::a[@name='profile']");
	By searchInputLocator = By.xpath("//input[@class='rz-header-search-input-text passive']");
	By searchButtonLocator = By.xpath("//button[@class='btn-link-i js-rz-search-button']");
	
	public void clickSignInButton(){
		driver.findElement(signInButtonLocator).click();
		
	}
	
	public void typeEmail(String email) {
		WebElement login = driver.findElement(emailInputLocator);
		login.click();
		login.clear();
		login.sendKeys(email);
	}
	
	public void typePassword(String password) {
		WebElement login = driver.findElement(passwordInputLocator);
		login.click();
		login.clear();
		login.sendKeys(password);
	}
	
	public void clickSubmitButton() {
		driver.findElement(submitButtonLocator).click();
	}
	
	public void login (String email, String password) {
		typeEmail(email);
		typePassword(password);
		clickSubmitButton();
		System.out.println("Login OK");
	}
	
	public void closeSocialPopUp() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(closeSocialPopUpLocator).click();
		
		System.out.println("Pop Up is closed");
	}
	
	public void assertUserName() {
		Assert.assertEquals(driver.findElement(userNameLocator).getText(), "Bill Gates");
		System.out.println("User Name is OK");
	}
	
	public void searchMacbook() {
		WebElement input = driver.findElement(By.xpath("//input[@class='rz-header-search-input-text passive']"));
		input.click();
		input.clear();
		input.sendKeys("macbook");
	}
	
	public ResultPage clickSearchButton() {
		driver.findElement(searchButtonLocator).click();
		return new ResultPage (driver);
		
	}
}
