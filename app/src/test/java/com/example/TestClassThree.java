package com.example;

import org.testng.annotations.Test;

public class TestClassThree {
	@Test(priority = 3)
	public void priority3() {
		System.out.println("Regression suite 1, priority 3");
	}

	@Test(priority = 2)
	public void priority2() {
		System.out.println("Regression suite 2, priority 2");
	}

	@Test(priority = 1)
	public void priority1() {
		System.out.println("Regression suite 3, priority 1");
	}
}
