package com.abc.magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MagentoTest {

	FirefoxDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@Test
	public void firefoxBrowser() throws Exception {
		String url = "http://magento.com";
		driver.get(url);

		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("email")).sendKeys("nitinmanjunath1991@gmail.com");
		Thread.sleep(3000);

		driver.findElement(By.id("pass")).sendKeys("Welcome123");
		Thread.sleep(3000);

		driver.findElement(By.id("send2")).click();
		Thread.sleep(3000);

		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(3000);

	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
