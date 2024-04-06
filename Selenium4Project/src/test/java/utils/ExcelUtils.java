package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	
	public ExcelUtils(String excelPath, String sheetName) {
		
		
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet =workbook.getSheet(sheetName);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		getRowCount();
		getCellDataString(0, 1);
		getCellDataNumber(1, 1);
	}
	
	public static int getRowCount() {
		int rowCount = 0;
		
		try {
			
			rowCount =sheet.getPhysicalNumberOfRows();
			System.out.println("no of row: "+ rowCount);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		
			e.printStackTrace();
		}
		return rowCount;
		
	}
	
public static int getColCount() {
		
		int colCount =0;
		try {
			
			colCount =sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("no of column: "+ colCount);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		
			e.printStackTrace();
		}
		return colCount;
		
	}
	
	public static String getCellDataString(int rowNum, int colNum) {
		String columnValue = null;
		try {
			
			columnValue = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			//System.out.println("cell data: "+ columnValue);
			
		}catch (Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			
		}
		return columnValue;
	}
	
	public static void getCellDataNumber(int rowNum, int colNum) {
		try {
			
			Double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println("cell data number: "+ cellData);
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	
	

}
