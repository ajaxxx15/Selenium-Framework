package com.abc.magentoObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	WebDriver driver;

	By myacc = By.linkText("My Account");

	public Home(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnMyAccount() {
		driver.findElement(myacc).click();
	}

}
