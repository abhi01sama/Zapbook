package com.org.Exceldataread;

import org.openqa.selenium.WebDriver;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.testng.annotations.Test;

import com.org.Zapbook.WebUtillayer.WebUtil;

public class R {

	protected WebUtil util;
	protected WebDriver driver;
	@Test

	public void initDriver() throws IOException {
			//Path of the excel file
		FileInputStream fs = new FileInputStream("C:\\Users\\hp\\Downloads\\new\\new\\Exceldata\\Zapbook.xlsx");
		//Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		System.out.println(sheet.getRow(0).getCell(0));
		Row row1 = sheet.getRow(1);
		Cell cell1 = row1.getCell(1);
		System.out.println(sheet.getRow(0).getCell(1));
		Row row2 = sheet.getRow(1);
		Cell cell2 = row2.getCell(1);
		System.out.println(sheet.getRow(1).getCell(0));
		Row row3 = sheet.getRow(1);
		Cell cell3 = row3.getCell(1);
		System.out.println(sheet.getRow(1).getCell(1));
		String cellval = cell.getStringCellValue();
		System.out.println(cellval);
		
		
		
		
		
	}
		



	}
