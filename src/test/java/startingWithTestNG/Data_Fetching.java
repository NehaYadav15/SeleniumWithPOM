package startingWithTestNG;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Data_Fetching {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//step 1:
		FileInputStream fs=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\SeleniumProject_LearnBasicConcept\\excelsheet\\jayashri.xlsx");
		//step 2:
		Workbook wb=WorkbookFactory.create(fs);
		//step 3:
		/* Sheet s1= wb.getSheet("login");
		//Step4:
		Row r1= s1.getRow(1);
		//Step 5:
		Cell c1=r1.getCell(0);
		*/ //step 6:
		String un= NumberToTextConverter.toText(wb.getSheet("login").getRow(1).getCell(0).getNumericCellValue());
		// String un= c1.getStringCellValue();
		System.out.println(un);

		//AnotherWay
		/*String id= wb.getSheet("login").getRow(1).getCell(0).getStringCellValue();
		System.out.println(id);
		*/
		String pwd= wb.getSheet("login").getRow(1).getCell(1).getStringCellValue();
		System.out.println(pwd);
	}
}

