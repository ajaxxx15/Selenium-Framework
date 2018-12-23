package com.abc.magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MagentoApp {

	@DataProvider(name = "authentication")
	public Object[][] credentials() {
		Object temp[][] = new Object[2][3];
		temp[0][0] = "http://www.magento.com";
		temp[0][1] = "nitinmanjunath1991@gmail.com";
		temp[0][2] = "Welcome123";

		temp[1][0] = "www.magento.com";
		temp[1][1] = "nitinmanjunath1991@gmail.com";
		temp[1][2] = "Welcom123";

		return temp;
	}

	@Test(dataProvider = "authentication")
	public void test(String url, String username, String password) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get(url);

		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(5000);

		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(5000);

		driver.findElement(By.id("send2")).click();
		Thread.sleep(5000);

		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(5000);

		driver.quit();

	}
}
