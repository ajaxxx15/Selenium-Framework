package com.abc.magento;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginValidation {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url = "http://magento.com";
		driver.get(url);

		FileInputStream fis = new FileInputStream(
				"/root/eclipse-workspace/KeyboradDrivenFramework/src/com/abc/utilities/keyboard.properties");
		Properties p = new Properties();
		p.load(fis);
		String myacc = p.getProperty("myacc");
		String email = p.getProperty("email");
		String pass = p.getProperty("pass");
		String login = p.getProperty("login");
		String logout = p.getProperty("logout");

		System.out.println(myacc);
		System.out.println(email);
		System.out.println(pass);
		System.out.println(login);
		System.out.println(logout);

		driver.findElement(By.xpath(myacc)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(email)).sendKeys("sucheendra.abc@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pass)).sendKeys("Welcome123");
		Thread.sleep(3000);
		driver.findElement(By.xpath(login)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(logout)).click();
		Thread.sleep(3000);

		driver.quit();

	}

}
