package com.onlineshop.Utility;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;

public class DateUtil {

	
	public static String date() {
		Date objDate = new Date(); // Current System Date and time is assigned to objDate
		 System.out.println(objDate);
	
		  String strDateFormat = "yyyy.MM.dd.HH.mm.ss"; //Date format is Specified
		  SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat); //Date format string is passed as an argument to the Date format object
		  System.out.println(objSDF.format(objDate)); //Date formatting is applied to the current date
		return objSDF.format(objDate);
		
	}

	
	
}
