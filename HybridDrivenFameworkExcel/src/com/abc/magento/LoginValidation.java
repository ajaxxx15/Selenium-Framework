package com.abc.magento;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginValidation {

	static XSSFSheet sheet;
	static WebDriver driver;

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream(
				"/root/eclipse-workspace/HybridDrivenFameworkExcel/src/com/abc/utilities/hybrid.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		sheet = book.getSheetAt(0);

		int numberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(numberOfRows);

		for (int i = 1; i < numberOfRows; i++) {
			String action = getCellValue(i, 2);

			switch (action) {
			case "open":
				driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

				break;
			case "navigate":
				driver.get(getCellValue(i, 4));
				break;
			case "click":
				driver.findElement(By.xpath(getCellValue(i, 3))).click();
				Thread.sleep(5000);
				break;
			case "type":
				driver.findElement(By.xpath(getCellValue(i, 3))).sendKeys(getCellValue(i, 4));
				Thread.sleep(5000);
				break;
			case "quit":
				driver.quit();
				break;

			default:
				System.out.println("invalid choice");
				break;
			}
		}

	}

	public static String getCellValue(int row, int col) {
		XSSFRow r1 = sheet.getRow(row);
		XSSFCell c1 = r1.getCell(col);
		String data = c1.getStringCellValue();
		System.out.println(data);
		return data;
	}

}
