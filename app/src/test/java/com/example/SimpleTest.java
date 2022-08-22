package com.example;

import org.testng.Assert;
import org.testng.annotations.*;

public class SimpleTest {

	@BeforeClass
	public void setUpBeforeClass() {
		System.out.println( "setUpBeforeClass" );
	}

	@BeforeMethod
	public void setUpBeforeMethod() {
		System.out.println( "setUpBeforeMethod" );
	}

	@AfterClass
	public void tearDownAfterClass() {
		System.out.println( "tearDownAfterClass" );
	}

	@AfterMethod
	public void tearDownAfterMethod() {
		System.out.println( "tearDownAfterMethod" );
	}

	@Test
	public void numberOfUsers() {
		Assert.assertEquals(3,3, "The number of users is incorrect");
		System.out.println( "The number of users is correct!" );
	}
}