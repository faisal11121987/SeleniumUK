package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Working_with_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
	FileInputStream fis=new FileInputStream("C:\\Users\\MohammedFais_xad7v\\Documents\\Selenium\\Book1.xlsx");
		//to access the workbook
	Workbook book=WorkbookFactory.create(fis);
	//to access the sheet
	Sheet sh=book.getSheet("Sheet1");
	//to access the row
	Row row=sh.getRow(0);
	//to access cell
	Cell cell=row.getCell(0);
	// to fetch the data is String
	// String value=cell.getStringCellValue();
	// System.out.println(value);
	// to fetch number value
	// double value1=sh.getRow(2).getCell(0).getNumericCellValue();
    // System.out.println(value1);
	
	String value1=sh.getRow(0).getCell(0).toString();
    System.out.println(value1);

	String value2=sh.getRow(2).getCell(0).toString();
    System.out.println(value2);
	}

}
