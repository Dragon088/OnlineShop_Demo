package com.onlineshop.Utility;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AssertionLibrary {

	private static WebDriver driver;
	
	
	
	
	public static void assertEquals(int actual, int expected)
	{
		
		Assert.assertEquals(actual, expected);
	}

}
