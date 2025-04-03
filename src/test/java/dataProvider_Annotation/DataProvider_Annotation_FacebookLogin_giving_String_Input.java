package dataProvider_Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//Total columns=2
//Set of values=5 [rows]
public class DataProvider_Annotation_FacebookLogin_giving_String_Input 
{
     @DataProvider(name="data1")
     public Object[][] login()
     {
    	 Object[][] d=new Object[5][2];
    	 //row 1
    	 d[0][0]="nehavns21@gmail.com";//UN1--valid un
    	 d[0][1]="12345n";//PWD1--valid pwd
    	 //row 2
    	 d[1][0]="9583495508";//UN2--valid un
    	 d[1][1]="12345n";//PWD2--valid pwd
    	 //row 3
    	 d[2][0]="919583495508";//UN3--valid un
    	 d[2][1]="12345n";//PWD3--valid pwd
    	 //row 4
    	 d[3][0]="nehavns21@gmail.com";//UN4--valid un
    	 d[3][1]="abcdefgh1234";//PWD4--wrong pwd
    	 //row 5
    	 d[4][0]="";//UN5--blank un
    	 d[4][1]="";//PWD5--blank pwd
    	 return d;
     }
     
     @Test(dataProvider="data1")
     public void testCase1(String UN,String PWD) throws InterruptedException
     {
    	 EdgeDriver driver=new EdgeDriver();
 		 driver.get("https://en-gb.facebook.com/login/web/");
         driver.manage().window().maximize();
         WebElement e1=driver.findElement(By.id("email"));
         e1.sendKeys(UN);
         WebElement e2=driver.findElement(By.id("pass"));
         e2.sendKeys(PWD);
         WebElement e3=driver.findElement(By.name("login"));
         e3.click();
     }
}
