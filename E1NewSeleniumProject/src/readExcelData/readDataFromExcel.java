package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class readDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./Data/testData.xlsx");//to specify the path of the excel file
	
	Workbook wb = WorkbookFactory.create(fis);//to make the file ready to read
	
	Sheet sheet = wb.getSheet("ipl");//to get into the sheet
	
	Row row = sheet.getRow(1);//to get into the row
	
	Cell cell = row.getCell(0);//to get into cell
	
	String data = cell.getStringCellValue();//to read the data from the cell
	
	System.out.println(data);
	}
}
