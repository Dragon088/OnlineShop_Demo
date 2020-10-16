package com.onlineshop.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook workbook;
	XSSFSheet sheet;
	//HSSFWorkbook: Represents workbook in xls file.
	public ExcelDataProvider() {
		
		File src = new File("./Data_HRM/DataSheet.xlsx");
		
		
			try {
				FileInputStream fis = new FileInputStream(src);
				
				workbook = new XSSFWorkbook(fis);
			
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
	
		
	}
		public String getStringData(String sheetname, int row, int column) {
			
			return workbook.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		}
		
		public String getStringData(int  indexvalue, int row, int column) {
			
			return workbook.getSheetAt(indexvalue).getRow(row).getCell(column).getStringCellValue();
		}
		public double getNumericData(String  sheetname, int row, int column) {
			
			return workbook.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
		}
	
}
