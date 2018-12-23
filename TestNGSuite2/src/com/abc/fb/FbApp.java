package com.abc.fb;

import org.testng.annotations.Test;

public class FbApp {

	@Test
	public void test1() {
		System.out.println("can execute once");
	}

	@Test(invocationCount = 5)
	public void test2() {
		System.out.println("can execute multiple times");
	}

	@Test(enabled = false)
	public void test3() {
		System.out.println("not execute");
	}

}
