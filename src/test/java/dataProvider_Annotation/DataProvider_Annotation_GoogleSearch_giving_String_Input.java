package dataProvider_Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Annotation_GoogleSearch_giving_String_Input 
{
     @DataProvider(name="data1")
     public Object[][] method()
     {
    	 Object[][] d=new Object[5][1];
    	 d[0][0]="Virat Kohli";
    	 d[1][0]="MS Dhoni";
    	 d[2][0]="Rohit Sharma";
    	 d[3][0]="Hardik Pandya";
    	 d[4][0]="Ravinder Jadeja";
    	 
    	 return d;
     }
     
     @Test(dataProvider="data1")
     public void testCase1(String input) throws InterruptedException
     {
    	 ChromeDriver driver=new ChromeDriver();
 		driver.get("https://www.google.com/");
 		driver.manage().window().maximize();
 		Thread.sleep(500);
 		WebElement e1=driver.findElement(By.cssSelector(".gLFyf"));
 		e1.sendKeys(input+Keys.ENTER);
 		Thread.sleep(500);
 		driver.quit();
     }
}
