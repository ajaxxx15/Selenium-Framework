package com.abc.magento;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginValidation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(
				"/root/eclipse-workspace/DataDrivenFramework/src/com/abc/utilities/data.properties");

		Properties p = new Properties();

		p.load(fis);

		String url = p.getProperty("url");
		String username = p.getProperty("username");
		String password = p.getProperty("password");

		FirefoxDriver driver = new FirefoxDriver();
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
