package com.task8;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Que3 {

	public static void main(String[] args) {
		        //create a blank excel sheet of XSSFWorkbook
				//try with resource				
		        try(XSSFWorkbook workbook=new XSSFWorkbook()){
		        	
		        //create sheet	
		        Sheet sheet= (Sheet) workbook.createSheet("Sheet1");
		              
		        //create an array of objects
		        Object[][]data= {
		        		{"name","age","email"},
		        		{"John Doe",30,"john@test.com."},
		        		{"Jane Dee",28,"john@test.com."},
		        		{"Bob Smith",35,"jacky@example.com."},
		        		{"Swapnil",37,"swapnil@example.com."},
		        		
		        };
		        
		        }catch(Exception e) {
		        	
		        }
	}

}
