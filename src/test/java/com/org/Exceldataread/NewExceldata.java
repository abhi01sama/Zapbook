package com.org.Exceldataread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.org.Zapbook.WebUtillayer.WebUtil;

public class NewExceldata {

	protected WebUtil util;
	protected WebDriver driver;
	@Test

	public void initDriver() throws InterruptedException, IOException {
		util = new WebUtil();
		util.extentReport("ZapBook");
		util.openBroswer("chrome");
		util.openURl("https://app.zap.betaplanets.com");
		util.maximize();
		FileInputStream fis = new FileInputStream("C:\\Users\\hp\\Downloads\\new\\new\\Exceldata\\Zapbook.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbook.getSheet("Sheet2");
		int rowcount = sheet.getLastRowNum();
		int celcount = sheet.getRow(1).getLastCellNum();
		System.out.println("rowcount:" + rowcount + "celcount:" + celcount);
		for (int i = 0; i <= rowcount; i++) {

			XSSFRow celldata = sheet.getRow(i);
			String Email = celldata.getCell(0).getStringCellValue();
			String Password = celldata.getCell(1).getStringCellValue();

			driver.findElement(By.xpath("//ion-input[@placeholder='Enter email']")).sendKeys(Email);
			driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys(Password);
			
		System.out.println(Email+"||"+Password);	
			  
			
			
			
			
			
			
			
		}

	}
}
