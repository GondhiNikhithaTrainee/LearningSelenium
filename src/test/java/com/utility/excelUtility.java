package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtility {

	public static  String getTestData(int rowNumber,int cellNumber) throws InvalidFormatException, IOException
	{
		//create file object
		File file =new File("C:\\Users\\INDIA\\Desktop.xlsx");
		//create workbook object
		XSSFWorkbook book=new XSSFWorkbook(file);
		//create sheet object
		XSSFSheet sheet=book.getSheetAt(0);
		//specify row and cell number
		
		return sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();
	}
}
