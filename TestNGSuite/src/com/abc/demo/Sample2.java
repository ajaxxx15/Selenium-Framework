package com.abc.demo;

import org.testng.annotations.Test;

public class Sample2 {

	@Test
	public void a_method() {
		System.out.println("a_method is ready");
	}

	@Test
	public void b_method() {
		System.out.println("b_method is ready");
	}

	@Test
	public void c_method() {
		System.out.println("c_method is not ready");
	}

	@Test
	public void d_method() {
		System.out.println("d_method is ready");
	}

}
