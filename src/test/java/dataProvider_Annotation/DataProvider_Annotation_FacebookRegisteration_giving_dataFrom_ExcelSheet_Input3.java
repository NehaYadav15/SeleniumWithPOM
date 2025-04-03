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

public class DataProvider_Annotation_FacebookRegisteration_giving_dataFrom_ExcelSheet_Input3 
{
     @DataProvider(name="data1")
     public Object[][] method() throws EncryptedDocumentException, IOException
     {
    	 Object[][] d=new Object[4][4];
    	 
    	 FileInputStream fs=new FileInputStream("C:\\Users\\nehav\\Videos\\Workspace\\8th July 2024\\Maven_TestNG_Project\\ExcelSheet\\DataProvider_Data_1_FacebookRegisteration.xlsx");
    	 Workbook wb=WorkbookFactory.create(fs);
    	 //Row1
    	 String value1=wb.getSheet("Details").getRow(0).getCell(0).getStringCellValue();
    	 String value2=wb.getSheet("Details").getRow(0).getCell(1).getStringCellValue();
    	 String value3=NumberToTextConverter.toText(wb.getSheet("Details").getRow(0).getCell(2).getNumericCellValue());
    	 String value4=wb.getSheet("Details").getRow(0).getCell(3).getStringCellValue();
    	 //Row2
    	 String value5=wb.getSheet("Details").getRow(1).getCell(0).getStringCellValue();
    	 String value6=wb.getSheet("Details").getRow(1).getCell(1).getStringCellValue();
    	 String value7=NumberToTextConverter.toText(wb.getSheet("Details").getRow(1).getCell(2).getNumericCellValue());
    	 String value8=wb.getSheet("Details").getRow(1).getCell(3).getStringCellValue();
    	 //Row3
    	 String value9=wb.getSheet("Details").getRow(2).getCell(0).getStringCellValue();
    	 String value10=wb.getSheet("Details").getRow(2).getCell(1).getStringCellValue();
    	 String value11=NumberToTextConverter.toText(wb.getSheet("Details").getRow(2).getCell(2).getNumericCellValue());
    	 String value12=wb.getSheet("Details").getRow(2).getCell(3).getStringCellValue();
    	 //Row4
    	 String value13=wb.getSheet("Details").getRow(3).getCell(0).getStringCellValue();
    	 String value14=wb.getSheet("Details").getRow(3).getCell(1).getStringCellValue();
    	 String value15=NumberToTextConverter.toText(wb.getSheet("Details").getRow(3).getCell(2).getNumericCellValue());
    	 String value16=wb.getSheet("Details").getRow(3).getCell(3).getStringCellValue();
    	 
    	 d[0][0]=value1;
    	 d[0][1]=value2;
    	 d[0][2]=value3;
    	 d[0][3]=value4;
    	 d[1][0]=value5;
    	 d[1][1]=value6;
    	 d[1][2]=value7;
    	 d[1][3]=value8;
    	 d[2][0]=value9;
    	 d[2][1]=value10;
    	 d[2][2]=value11;
    	 d[2][3]=value12;
    	 d[3][0]=value13;
    	 d[3][1]=value14;
    	 d[3][2]=value15;
    	 d[3][3]=value16;
    	 
    	 return d;
     }
     
     @Test(dataProvider="data1")
     public void testCase1(String FN,String SN,String NU,String PWD) throws InterruptedException
     {
    	 EdgeDriver driver=new EdgeDriver();
 		driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525804935%7Cb%7Cfacebook%20registration%7C&placement=&creative=550525804935&keyword=facebook%20registration&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-300840385888%26loc_physical_ms%3D9300881%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gad_source=1&gclid=Cj0KCQiAz6q-BhCfARIsAOezPxnqM3AABZTednaA7s9zTHp8BSsqQX9dfnQL6qv8iZcq0DhcY6vS6isaAt-2EALw_wcB");
         driver.manage().window().maximize();
         WebElement e1=driver.findElement(By.name("firstname"));
         e1.sendKeys(FN);
         WebElement e2=driver.findElement(By.name("lastname"));
         e2.sendKeys(SN);
         WebElement e3=driver.findElement(By.xpath("(//span[@class='_5k_2 _5dba'])[1]"));
         e3.click();
         WebElement e4=driver.findElement(By.name("reg_email__"));
         e4.sendKeys(NU);
         WebElement e5=driver.findElement(By.id("password_step_input"));
         e5.sendKeys(PWD);
         WebElement e6=driver.findElement(By.name("websubmit"));
         e6.click();
         
         
         
     }
}
