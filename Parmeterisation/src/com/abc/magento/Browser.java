package com.abc.magento;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Browser {

	public WebDriver driver;

	@BeforeTest
	@Parameters({ "browser" })
	public void openBrowser(String browser) {
		System.out.println(browser);
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();

		} else {
			driver = new FirefoxDriver();

		}

	}

	@Test
	@Parameters({ "username", "password" })
	public void credentials(String un, String pwd) throws Exception {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url = "http://magento.com";
		driver.get(url);

		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("email")).sendKeys(un);
		Thread.sleep(5000);

		driver.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(5000);

		driver.findElement(By.id("send2")).click();
		Thread.sleep(5000);

		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(5000);

	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();

	}

}
