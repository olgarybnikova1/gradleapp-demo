package com.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClassTwo {
	@Parameters({"color", "font"})
	@Test public void parameterTest(String color, String font) {
		System.out.println("Element is displayed with " + color);
		System.out.println("The text is typed in " + font);
	}

	@DataProvider(name = "defaultDataProvider")
	public Object[][] createNameAge() {
		return new Object[][]{
				{"Kate", 28},
				{"Philip", 45},
		};
	}
	@Test(dataProvider = "defaultDataProvider")
	public void verifyNameAge(String n1, Integer n2) {
		System.out.println(n1 + " " + n2);
	}

}
