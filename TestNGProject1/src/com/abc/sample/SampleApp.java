package com.abc.sample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleApp {

	@AfterMethod
	public void afterMethod() {
		System.out.println("inside after method\n");
	}

	@Test
	public void test1() {
		System.out.println("inside test1\n");
	}

	@Test
	public void test2() {
		System.out.println("inside test2\n");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("indisde before method\n");
	}

}
