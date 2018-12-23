package com.abc.demo;

import org.testng.annotations.Test;

public class GroupApp {

	@Test(groups = { "odd", "even" })
	public void test0() {
		System.out.println("belong to odd and even");
	}

	@Test(groups = { "odd" })
	public void test1() {
		System.out.println("belong to odd");
	}

	@Test(groups = { "even" })
	public void test2() {
		System.out.println("belong to even");
	}

	@Test(groups = { "odd" })
	public void test3() {
		System.out.println("belong to odd");
	}

	@Test(groups = { "even" })
	public void test4() {
		System.out.println("belong to even");
	}

	@Test(groups = { "odd" })
	public void test5() {
		System.out.println("belong to odd");
	}

}
