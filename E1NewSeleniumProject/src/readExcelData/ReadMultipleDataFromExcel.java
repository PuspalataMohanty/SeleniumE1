package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	for(int i=0;i<11;i++) {
	FileInputStream fis = new FileInputStream("./Data/testData.xlsx");//to provide the path of excel file
	
	Workbook wb = WorkbookFactory.create(fis);//to make the file ready to read
	
	Sheet sheet = wb.getSheet("ipl");//to get into the sheet
	
	 Row row = sheet.getRow(i);//to get into the row
	 
	 Cell cell = row.getCell(0);//to get into the cell
	 
	 String data = cell.getStringCellValue();//to read the data or value from the cell
	 
	 System.out.println(data);
	 }
}
}
