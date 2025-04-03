package dataProvider_Annotation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataProvider_1 
{
	@DataProvider(name="data1")
	public Object[][] method() throws EncryptedDocumentException, IOException
	{
		Object[][] d=new Object[5][2];
		
		FileInputStream fs=new FileInputStream("C:\\Users\\nehav\\Videos\\Workspace\\8th July 2024\\Maven_TestNG_Project\\ExcelSheet\\DataProvider_Data_2_FacebookLogin.xlsx");
        Workbook wb=WorkbookFactory.create(fs);
        Sheet s1= wb.getSheet("login");
        Row r1=s1.getRow(0);
        Cell c1=r1.getCell(0);
        String value=c1.getStringCellValue();
        
        return d;
	}
}
