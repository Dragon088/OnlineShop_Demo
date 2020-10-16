package com.onlineshop.baseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.onlineshop.Utility.BrowserFactory;
import com.onlineshop.Utility.ConfigDataProvider;
import com.onlineshop.Utility.DateUtil;
import com.onlineshop.Utility.ExcelDataProvider;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class BaseClass extends DateUtil {
	
	 static WebDriver driver;
	public ConfigDataProvider config;
	public static ExtentTest logger;
	public static ExtentReports report;
	public ExcelDataProvider excel;
	
	
	public BaseClass() throws IOException {
		
		Reporter.log("Before suite running", true);
		String logdate = date();
		 config = new ConfigDataProvider();
		  excel = new ExcelDataProvider();
			 ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Report/" +logdate+ ".html"));
			 report = new ExtentReports(); 
			 report.attachReporter(extent);
			
			 extent.config().setDocumentTitle("Automation Report"); // Tile of report
			 extent.config().setReportName("Functional Testing"); // Name of the report
			 extent.config().setTheme(Theme.DARK);
			 
		
	}
	
	
	
	
	 public  static WebDriver invokeApplication() {
	 return driver  = BrowserFactory.startApplication(driver, "chrome","https://www.demoblaze.com/index.html"); 
	 }
	

	
}
