package com.onlineshop.Utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	
   public static WebDriver startApplication(WebDriver driver, String browsername, String URL) {
	   
	   
	    if(browsername.equals("chrome")) {
		   
		   System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
	         driver = new ChromeDriver();
	         
	   }
	   
	    else if(browsername.equals("ie")) {
		   
		   System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
       driver = new InternetExplorerDriver();
	   }
 
	    else if(browsername.equals("firefox")) {
   
 			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
 		}
 		else
 		{
 		System.out.println("Browser is not available");
 		}
	    driver.manage().deleteAllCookies();
 		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
 		driver.manage().window().maximize();
 		
 		driver.get(URL);
 		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		
 		return driver;
 			
   }
   public static void quitApplication(WebDriver driver) {
    driver.quit();
}
}
