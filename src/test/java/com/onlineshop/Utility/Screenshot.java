package com.onlineshop.Utility;

import java.io.File;
//import java.util.logging.FileHandler;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.onlineshop.baseClass.BaseClass;

public class Screenshot  {
	static String ScreenshotPath = System.getProperty("user.dir") + "//Pictures//Screenshots//" + DateUtil.date() +".png";
	
	 public static String captureScreenshots(WebDriver driver) {
		 
		File src =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try {
			
			FileHandler.copy(src, new File("C://Users//"+ScreenshotPath));
			
			
		} catch (Exception e) {
			
		System.out.println(e.getMessage());	
		}
		return ScreenshotPath;
		
	 }
	 public static void attachedScreenshotsToReport(String ScreenshotPath) throws IOException {
		 BaseClass.logger.pass("passed", MediaEntityBuilder.createScreenCaptureFromPath("C://Users//"+ScreenshotPath).build()); 
	 }
	 
	
}
