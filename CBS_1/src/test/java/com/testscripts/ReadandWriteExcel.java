package com.testscripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadandWriteExcel {
	 
	 public static void main(String []args){
	 
	  try {
	 
	  File src=new File("C:\\Users\\amuthan\\eclipse-workspace\\CBS_1\\Excel\\Data.xlsx");
	 
	  // Load the file
	 
	  FileInputStream fis=new FileInputStream(src);
	 
	   // load the workbook
	 
	   XSSFWorkbook wb=new XSSFWorkbook(fis);
	 
	  // get the sheet which you want to modify or create
	 
	   XSSFSheet sh1= wb.getSheet("Sheet2");
	 
	 // getRow specify which row we want to read and getCell which column
	 
	/* System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
	 
	 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
	 
	 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
	 
	 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
	 
	 System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
	 
	 System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());  */
	 
	// here createCell will create column
	 
	// and setCellvalue will set the value
	 
	Cell cell =  sh1.getRow(0).getCell(6);
	cell.setCellValue("2.41214.0");
	System.out.println(cell);
	 
	 sh1.getRow(1).createCell(7).setCellValue("2.5");
	 
	 sh1.getRow(2).createCell(8).setCellValue("2.39");
	 
	 
	// here we need to specify where you want to save file
	 
	 FileOutputStream fout=new FileOutputStream(new File("C:\\Users\\amuthan\\eclipse-workspace\\\\CBS_1\\\\Excel\\\\Data.xlsx"));
	 
	 
	// finally write content 
	 
	 wb.write(fout);
	 
	// close the file
	 
	 fout.close();
	 
	  } catch (Exception e) {
	 
	   System.out.println(e.getMessage());
	 
	  }
	 
	 }
	 
	}



