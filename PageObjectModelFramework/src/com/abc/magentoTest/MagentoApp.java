package com.abc.magentoTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.abc.magentoObjects.Home;
import com.abc.magentoObjects.Login;
import com.abc.magentoObjects.Logout;

public class MagentoApp {

	public static void main(String[] args) throws Exception {
		String url = "http://magento.com";
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);

		Home h = new Home(driver);
		h.clickOnMyAccount();
		Thread.sleep(5000);

		Login l1 = new Login(driver);
		l1.typeEmail("sucheendra.abc@gmail.com");
		Thread.sleep(5000);
		l1.typePassword("Welcome123");
		Thread.sleep(5000);
		l1.clickOnLogin();
		Thread.sleep(5000);

		Logout l2 = new Logout(driver);
		l2.clickOnLogout();
		Thread.sleep(5000);

		driver.quit();

	}

}
