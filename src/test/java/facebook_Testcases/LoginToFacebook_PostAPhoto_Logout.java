package facebook_Testcases;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginToFacebook_PostAPhoto_Logout 
{
	@DataProvider(name="data1")
    public Object[][] method() throws EncryptedDocumentException, IOException
    {
   	 Object[][] d=new Object[1][2];
   	 
   	 FileInputStream fs=new FileInputStream("C:\\Users\\nehav\\Videos\\Workspace\\8th July 2024\\Maven_TestNG_Project\\ExcelSheet\\Facebook_Login_Credentials.xlsx");
   	 Workbook wb=WorkbookFactory.create(fs);
   	 String value1=wb.getSheet("login").getRow(0).getCell(0).getStringCellValue();
   	 String value2=wb.getSheet("login").getRow(0).getCell(1).getStringCellValue();
   	 
   	 d[0][0]=value1;
	 d[0][1]=value2;
	 
	 return d;
    }
	
	@Test(dataProvider="data1")
	public void facebookScenario(String UN,String PWD) throws InterruptedException
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
    driver.manage().window().maximize();
    WebElement e1=driver.findElement(By.id("email"));
    e1.sendKeys(UN);
    WebElement e2=driver.findElement(By.id("pass"));
    e2.sendKeys(PWD);
    WebElement e3=driver.findElement(By.name("login"));
    e3.click();
    Thread.sleep(1000);
    driver.switchTo().alert().dismiss();
    
    //Assert.assertEquals(false, false);
    Thread.sleep(1000);
    WebElement e4=driver.findElement(By.className("x1i10hfl xjbqb8w x1ejq31n xd10rxx x1sy0etr x17r0tee x972fbf xcfux6l x1qhh985 xm0m39n x1ypdohk xe8uvvx xdj266r x11i5rnm xat24cr x1mh8g0r xexx8yu x4uap5 x18d9i69 xkhd6sd x16tdsg8 x1hl2dhg xggy1nq x1o1ewxj x3x9cwd x1e5q0jg x13rtm0m x87ps6o x1lku1pv x1a2a7pz x9f619 x3nfvp2 xdt5ytf xl56j7k x1n2onr6 xh8yej3"));
    e4.click();
    
	}
}
