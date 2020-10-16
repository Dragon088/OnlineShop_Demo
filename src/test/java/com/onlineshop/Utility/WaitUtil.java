package com.onlineshop.Utility;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtil {
	static WebDriver driver;
	
	public static void wait(WebDriver driver){
	//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public static void explicitWait(final By by) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public static void sleep(int value) throws InterruptedException {
		Thread.sleep(value);
	}
	
/*	public static WebElement FluentWait(final By by) {
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)                            
			.withTimeout(20, TimeUnit.SECONDS)          
			.pollingEvery(5, TimeUnit.SECONDS)          
			.ignoring(NoSuchElementException.class);    

			  WebElement aboutMe= wait.until(new Function<WebDriver, WebElement>() {       
			public WebElement apply(WebDriver driver) { 
			return driver.findElement(by);     
			 }  
			});
	}*/
}