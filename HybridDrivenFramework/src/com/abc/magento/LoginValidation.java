package com.abc.magento;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginValidation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(
				"/root/eclipse-workspace/HybridDrivenFramework/src/com/abc/utilities/hybrid.properties");
		Properties p = new Properties();
		p.load(fis);

		String url = p.getProperty("url");
		String username = p.getProperty("username");
		String password = p.getProperty("password");
		String myacc = p.getProperty("myacc");
		String email = p.getProperty("email");
		String pass = p.getProperty("pass");
		String login = p.getProperty("login");
		String logout = p.getProperty("logout");

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		driver.findElement(By.xpath(myacc)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(email)).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.xpath(pass)).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath(login)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(logout)).click();
		Thread.sleep(3000);

		FileOutputStream fos = new FileOutputStream(
				"/root/eclipse-workspace/HybridDrivenFramework/src/com/abc/utilities/hybrid.properties");
		p.setProperty("car", "Benze");
		p.save(fos, "Benze car is purchased");

		driver.quit();

	}

}
