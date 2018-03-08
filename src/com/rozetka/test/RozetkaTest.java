package com.rozetka.test;

import org.testng.annotations.Test;

public class RozetkaTest extends FirefoxSettings {

	@Test
	public void serchMacbook() throws InterruptedException{
		MainPage mainpage = new MainPage(driver);
		mainpage.clickSignInButton();
		mainpage.login(userEmail, userPassword);
		mainpage.closeSocialPopUp();
		mainpage.assertUserName();
		mainpage.searchMacbook();
		ResultPage resultpage = mainpage.clickSearchButton();
		resultpage.selectFirstMacBook();
		resultpage.clickBuyButton();
		resultpage.assertAddInBusket();
	}
}
