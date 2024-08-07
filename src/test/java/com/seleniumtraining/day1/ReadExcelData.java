package com.seleniumtraining.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		String[][] data= getData();
//		System.out.println(data[0][0]);
//		System.out.println(data[0][1]);
		
	}
	
	public static String[][] getData() throws IOException {
		File excelfile=new File("./TestData/credentials.xlsx");
		FileInputStream fi=new FileInputStream(excelfile);
		
		XSSFWorkbook workbook=new XSSFWorkbook(fi);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int numberofrows=sheet.getPhysicalNumberOfRows();
		int numberofcolumns = sheet.getRow(0).getLastCellNum();
		System.out.println(numberofrows);
		System.out.println(numberofcolumns);
		
		String[][] data=new String[numberofrows][numberofcolumns];
		//					String[4][3]
		
		for(int i=0;i<numberofrows-1;i++) { //0<4, 0, 1,2,3
			
			for(int j=0;j<numberofcolumns;j++) {
				DataFormatter df=new DataFormatter();
				data[i][j]=df.formatCellValue(sheet.getRow(i+1).getCell(j));
				//System.out.println(data[i][j]);
			}
		}
		
		
		fi.close();
		return data;
		
		
	}

}
