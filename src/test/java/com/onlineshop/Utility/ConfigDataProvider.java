package com.onlineshop.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	
			public ConfigDataProvider (){
				
				File src = new File("./Config/HRM.properties");
				
				
				
				try {
					FileInputStream fis = new FileInputStream(src);
					pro = new Properties();
					pro.load(fis);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			/*public String getDatafromConfig() {
				return
			}*/
			
			public String getBrowser() {
				return pro.getProperty("browsername");
			}
			
			public String getURL() {
				 return pro.getProperty("URL");
			}
			public String getSheetName() {
				 return pro.getProperty("sheet");
			}

}
