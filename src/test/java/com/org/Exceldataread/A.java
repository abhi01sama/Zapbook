package com.org.Exceldataread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class A {

	public static void main(String[] args) throws FileNotFoundException {
		// File fileObj = new File("C:\\Users\\hp\\Desktop\\Book1.xlsx");
		// fileObj.mkdir();

		// FileInputStream
		// fileOutputStream
	}

// Apachi POI
	public static void DataRead() {
		File fileObj = new File("Exceldata\\Book1.xlsx");
		FileInputStream fis = null;
		try {
			// Interface - Workbook
			fis = new FileInputStream("fileObj");
			XSSFWorkbook wBook = new XSSFWorkbook(fis);// xlsx

			// HSSFWorkbook hBook = new HSSFWorkbook(fis);//xls
		} catch (IOException e) {
			e.printStackTrace();

		}

	}
}
