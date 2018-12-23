package com.abc.fb;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookApp {

	@Test
	public void openBrower() {
		System.out.println("opening brower");
	}

	@Test(dependsOnMethods = "openBrower")
	public void loginAccount() {
		System.out.println("logging in");
		Assert.fail(); // to fail the test case

	}

	@Test(dependsOnMethods = "loginAccount", alwaysRun = true)
	public void logoutAccount() {
		System.out.println("logged out");
	}

}
