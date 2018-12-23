package com.abc.autoit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItApp {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		
		String url="file:///C:/Users/Somee/Documents/n+/HTML/fileupload.html";
		driver.get(url);
		
		driver.findElement(By.id("upload")).click();
		
		Runtime.getRuntime().exec("D:\\tech support\\selenium components\\fileupload.exe");
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
