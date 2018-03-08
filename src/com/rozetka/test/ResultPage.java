package com.rozetka.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class ResultPage {
	
	private WebDriver driver;
	public ResultPage(WebDriver driver) {
		this.driver = driver;				
	}
	
	By selectFirstMacBookLocator = By.xpath("//*[@id='block_with_search']/div/div[2]/div[1]/div/div/div/div/div[2]/a");
	By buttonBuyLocator = By.xpath("//button[@name='topurchases']");
	By addInBusketLocator = By.xpath("//*[@class='cart-title']");

	public void selectFirstMacBook() {
		driver.findElement(selectFirstMacBookLocator).click();
		System.out.println("macbook id picked up");
	}
	
	public void clickBuyButton () {
		driver.findElement(buttonBuyLocator).click();
	}
	
	/*public void addInBasket() throws InterruptedException {
		List <WebElement> list = driver.findElements(By.xpath("//span[@class='g-buy-submit-link']"));
		System.out.println(list.size());
		Thread.sleep(5000);
		list.get(0).click();
	}*/
	
	public void assertAddInBusket() {
		Assert.assertEquals("Вы добавили товар в корзину", driver.findElement(addInBusketLocator).getText());
	}
}
