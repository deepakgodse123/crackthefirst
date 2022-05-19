package automationProg1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelData
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	 FileInputStream file=new FileInputStream("C:\\Users\\Shubham\\OneDrive\\Desktop\\excelData.xlsx");
     String value = WorkbookFactory.create(file).getSheet("sheet1").getRow(10).getCell(2).getStringCellValue();
     System.out.println(value);
	}
}
