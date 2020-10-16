package com.onlineshop.Utility;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import com.onlineshop.baseClass.BaseClass;
import com.onlineshop.javaPage.DemoBlaze_JavaPage;
import com.onlineshop.stepDefinition.DemoBlaze_StepDefinition;

public class GenericMethod {

	private WebDriver driver;
    private FluentWait<WebDriver> fluentWait;
	
 
    
    

		public GenericMethod(WebDriver driver) {
		this.driver = driver;
	}

		public void setInput(By by, String Value) throws IOException {
			
			WebElement e = driver.findElement(by);
			e.clear();
			e.sendKeys(Value);	
			//Screenshot.attachedScreenshotsToReport(Screenshot.captureScreenshots(driver));
		}
        
		public void click(By by) throws IOException {
			
			WebElement e = driver.findElement(by);
			e.click();
			//Screenshot.attachedScreenshotsToReport(Screenshot.captureScreenshots(driver));
	
	     }	
		public void  get(String url) throws IOException {
			driver.get(url);
			//Screenshot.attachedScreenshotsToReport(Screenshot.captureScreenshots(driver));
		}
		public void  quit() throws IOException {
			driver.quit();
			
		}
		public void  switchToAlertAccept() throws IOException {
			driver.switchTo().alert().accept();
		}
		public String  getText(By by) throws IOException {
			return driver.findElement(by).getText();
		}
		
		
		protected List<WebElement> getElement(final By by){
			    WaitUtil.explicitWait(by);
				return driver.findElements(by);
			}
			
		protected WebElement getElement(final String locator){
			 WaitUtil.explicitWait(By.xpath(locator));
			return driver.findElement(By.xpath(locator));
		}
		

		
		
		
		
}
