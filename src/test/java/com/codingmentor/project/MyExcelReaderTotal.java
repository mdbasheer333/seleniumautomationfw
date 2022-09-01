package com.codingmentor.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MyExcelReaderTotal {

	public static void main(String[] args) throws IOException {

		FileInputStream fis=new FileInputStream(new File("C:\\Users\\Rasheed\\Desktop\\basheer\\ftbatch\\seleniumautomationfw\\src\\test\\resources\\testdata\\mytestdata.xlsx"));
		
		XSSFWorkbook wrokbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=wrokbook.getSheet("myloginsheet");
		System.out.println("the no of rows are " + sheet.getLastRowNum());
		
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			XSSFRow row=sheet.getRow(i);
			System.out.println("no of cols are " + row.getLastCellNum());
			for (int j = 0; j < row.getLastCellNum(); j++) {
				XSSFCell cell=row.getCell(j);
				System.out.println(cell.getStringCellValue());
			}
		}
		
		wrokbook.close();
		fis.close();

	}

}
