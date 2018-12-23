package com.abc.simple;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("inside beforeSuite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("inside afterSuite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("inside beforeTest");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("inside afterTest");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("inside beforeClass\n");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("inside afterclass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("inside beforemethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("inside afterMethod\n");
	}

	@Test
	public void Test1() {
		System.out.println("inside Test1");
	}

	@Test
	public void Test2() {
		System.out.println("inside Test2");
	}
}
