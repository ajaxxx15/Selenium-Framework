
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MagentoTest {

	@Test
	public void test() throws Exception {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String url = "http://magento.com";
		driver.get(url);

		Home h = new Home(driver);
		h.clickOnMyacc();

		Login l1 = new Login(driver);
		l1.typeEmail("nitinmanjunath1991@gmail.com");
		Thread.sleep(3000);
		l1.typePass("Welcome123");
		Thread.sleep(3000);
		l1.clickOnLogin();
		Thread.sleep(3000);

		Logout l2 = new Logout(driver);
		l2.clickOnLogout();
		Thread.sleep(3000);

		driver.quit();

	}

}
