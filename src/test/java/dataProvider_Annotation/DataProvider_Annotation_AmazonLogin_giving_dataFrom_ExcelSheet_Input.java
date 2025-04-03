package dataProvider_Annotation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Annotation_AmazonLogin_giving_dataFrom_ExcelSheet_Input 
{
     @DataProvider(name="data1")
     public Object[][] method() throws EncryptedDocumentException, IOException
     {
    	 Object[][] d=new Object[4][1];
    	 
    	 FileInputStream fs=new FileInputStream("C:\\Users\\nehav\\Videos\\Workspace\\8th July 2024\\Maven_TestNG_Project\\ExcelSheet\\DataProvider_Data_2_AmazonSearch.xlsx");
    	 Workbook wb=WorkbookFactory.create(fs);
    	 String value1=wb.getSheet("Search Input").getRow(0).getCell(0).getStringCellValue();
    	 String value2=wb.getSheet("Search Input").getRow(1).getCell(0).getStringCellValue();
    	 String value3=wb.getSheet("Search Input").getRow(2).getCell(0).getStringCellValue();
    	 String value4=wb.getSheet("Search Input").getRow(3).getCell(0).getStringCellValue();
    	 d[0][0]=value1;
    	 d[1][0]=value2;
    	 d[2][0]=value3;
    	 d[3][0]=value4;
    	 
    	 return d;
     }
     
     @Test(dataProvider="data1")
     public void testCase1(String input) throws InterruptedException
     {
    	ChromeDriver driver=new ChromeDriver();
    	driver.get("https://www.amazon.in/");
 		driver.manage().window().maximize();
 		Thread.sleep(500);
 		WebElement e1=driver.findElement(By.cssSelector("input[placeholder^='Search Amazon.in']"));
 		e1.sendKeys(input+Keys.ENTER);
 		Thread.sleep(500);
 		driver.quit();
     }
}
