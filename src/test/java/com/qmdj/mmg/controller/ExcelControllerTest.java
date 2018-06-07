package com.qmdj.mmg.controller;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;


public class ExcelControllerTest {

	@Test
	public void excelMerge()throws Exception {
		//Create Blank workbook
		
	      HSSFWorkbook wb = new HSSFWorkbook();
	      HSSFSheet sheet = wb.createSheet("new Sheet");  
	      FileOutputStream out = new FileOutputStream(
	    	      new File("createworkbook.xls"));
	      wb.write(out);
	      out.close();
	      System.out.println("......");
	}
}
