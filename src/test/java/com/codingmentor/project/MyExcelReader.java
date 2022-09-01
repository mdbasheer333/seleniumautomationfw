package com.codingmentor.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MyExcelReader {

	public static void main(String[] args) throws IOException {

		
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\Rasheed\\Desktop\\basheer\\ftbatch\\seleniumautomationfw\\src\\test\\resources\\testdata\\mytestdata.xlsx"));
		
		XSSFWorkbook wrokbook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wrokbook.getSheet("myloginsheet");
		
		XSSFRow row=sheet.getRow(0);
		
		XSSFCell cell=row.getCell(0);
		System.out.println(cell.getStringCellValue());
		
		cell=row.getCell(1);
		System.out.println(cell.getStringCellValue());
		
		row=sheet.getRow(1);
		
		cell=row.getCell(0);
		System.out.println(cell.getStringCellValue());
		
		cell=row.getCell(1);
		System.out.println(cell.getStringCellValue());
		
		row=sheet.getRow(2);
		
		cell=row.getCell(0);
		System.out.println(cell.getStringCellValue());
		
		cell=row.getCell(1);
		System.out.println(cell.getStringCellValue());
		
		wrokbook.close();
		fis.close();

	}

}
