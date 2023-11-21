package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WorkingWithExcel2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		
		FileInputStream fis=new FileInputStream("C:\\Users\\MohammedFais_xad7v\\Documents\\Selenium\\Book1.xlsx");
		//to access the workbook
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh=book.getSheet("Sheet2");
	//to get last row number
	int lastRow= sh.getPhysicalNumberOfRows();
	System.out.println("Last Row number : "+lastRow);
	//to get last cell number
	int lastCell=sh.getRow(0).getPhysicalNumberOfCells();
	System.out.println("Last Cell number : "+lastCell);
	
	for(int i=0 ; i<=lastRow;i++)
	{
		for(int j=0 ; j<=1;j++)
		{
			String value=sh.getRow(i).getCell(j).toString();
			System.out.print(value+" ");
		}
		System.out.println();
	}
}
}