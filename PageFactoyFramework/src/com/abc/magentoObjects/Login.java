package com.abc.magentoObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;

	public Login(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	WebElement email;

	@FindBy(id = "pass")
	WebElement pwd;

	@FindBy(id = "send2")
	WebElement login;

	public void typeEmail(String data) {
		email.sendKeys(data);
	}

	public void typePass(String data) {
		pwd.sendKeys(data);
	}

	public void clickOnLogin() {
		login.click();
	}

}
