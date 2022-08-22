package com.example;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestClassOne {
	@BeforeGroups("Creating new users")
	public void setUpBeforeGroup() {
		System.out.println ( "Start of regression" );
	}
	@AfterGroups("Creating new users")
	public void tearDownAfterGroup() {
		System.out.println ("The end of regression");
	}

	@Test(groups = "Creating new users")
	public void createNewUser() {
		System.out.println("User was created successfully!");
	}

	@Test(groups = "Deleting users")
	public void deleteUser() {
		System.out.println("User was deleted!");
	}
}
