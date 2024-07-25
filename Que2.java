package com.task8;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Que2 {

	public static void main(String[] args) {
		
		//create a blank excel sheet of XSSFWorkbook
		//try with resource
        try(XSSFWorkbook workbook=new XSSFWorkbook();){
        	
        //create sheet	
        Sheet sheet= (Sheet)workbook.createSheet("Sheet1");
                      	
        }catch(Exception e) {
		        	
        }
	}

}
