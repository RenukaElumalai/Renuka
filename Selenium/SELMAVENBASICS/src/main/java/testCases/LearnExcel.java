package testCases;


import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LearnExcel {
	
	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook wBook=new XSSFWorkbook("./Data/LoginWD.xlsx");
		//Goto the Sheet
		XSSFSheet sheet = wBook.getSheet("Login");
		//Find the Rowscount(Sheet Level)
		int rowCount = sheet.getLastRowNum();
		System.out.println(rowCount);
		//Go to Header Row(Row=))
		XSSFRow headerRow = sheet.getRow(0);
		//To Find Column Count
		int columnCount = headerRow.getLastCellNum();
		System.out.println(columnCount);
		//Goto Each row
		for (int i = 1; i <=rowCount; i++) {
			XSSFRow row = sheet.getRow(i);
			//to find each cell
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				//print contents of the cell
				System.out.println(cell.getStringCellValue());
							}
			
		}
		wBook.close();
	}

}