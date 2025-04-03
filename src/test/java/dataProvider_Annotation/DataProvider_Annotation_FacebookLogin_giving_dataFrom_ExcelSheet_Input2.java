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
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Annotation_FacebookLogin_giving_dataFrom_ExcelSheet_Input2 
{
     @DataProvider(name="data1")
     public Object[][] method() throws EncryptedDocumentException, IOException
     {
    	 Object[][] d=new Object[5][2];
    	 
    	 FileInputStream fs=new FileInputStream("C:\\Users\\nehav\\Videos\\Workspace\\8th July 2024\\Maven_TestNG_Project\\ExcelSheet\\DataProvider_Data_2_FacebookLogin.xlsx");
    	 Workbook wb=WorkbookFactory.create(fs);
    	 
    	 String value1=wb.getSheet("Facebook Credentials").getRow(0).getCell(0).getStringCellValue();
    	 String value2=wb.getSheet("Facebook Credentials").getRow(0).getCell(1).getStringCellValue();
    	 
    	 String value3=NumberToTextConverter.toText(wb.getSheet("Facebook Credentials").getRow(1).getCell(0).getNumericCellValue());
    	 String value4=wb.getSheet("Facebook Credentials").getRow(1).getCell(1).getStringCellValue();
    	 
    	 String value5=NumberToTextConverter.toText(wb.getSheet("Facebook Credentials").getRow(2).getCell(0).getNumericCellValue());
    	 String value6=wb.getSheet("Facebook Credentials").getRow(2).getCell(1).getStringCellValue();
    	 
    	 String value7=wb.getSheet("Facebook Credentials").getRow(3).getCell(0).getStringCellValue();
    	 String value8=wb.getSheet("Facebook Credentials").getRow(3).getCell(1).getStringCellValue();
    	 
    	 String value9=wb.getSheet("Facebook Credentials").getRow(4).getCell(0).getStringCellValue();
    	 String value10=wb.getSheet("Facebook Credentials").getRow(4).getCell(1).getStringCellValue();
    	 
    	 d[0][0]=value1;
    	 d[0][1]=value2;
    	 d[1][0]=value3;
    	 d[1][1]=value4;
    	 d[2][0]=value5;
    	 d[2][1]=value6;
    	 d[3][0]=value7;
    	 d[3][1]=value8;
    	 d[4][0]=value9;
    	 d[4][1]=value10;
    	 
    	 return d;
     }
     
     @Test(dataProvider="data1")
     public void testCase1(String UN,String PWD) throws InterruptedException
     {
    	 EdgeDriver driver=new EdgeDriver();
 		 driver.get("https://www.facebook.com/");
         driver.manage().window().maximize();
         WebElement e1=driver.findElement(By.id("email"));
         e1.sendKeys(UN);
         WebElement e2=driver.findElement(By.id("pass"));
         e2.sendKeys(PWD);
         WebElement e3=driver.findElement(By.name("login"));
         e3.click();
         
         
         
     }
}
