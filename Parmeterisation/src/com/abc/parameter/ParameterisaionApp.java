package com.abc.parameter;

import org.testng.annotations.Test;

public class ParameterisaionApp {

	@Test(parameters = { "username", "password" })
	public void test1(String un, String pwd) {
		System.out.println(un + " " + pwd);
	}

}
