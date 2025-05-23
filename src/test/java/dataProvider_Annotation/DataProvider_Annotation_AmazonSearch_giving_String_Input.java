package dataProvider_Annotation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Annotation_AmazonSearch_giving_String_Input 
{
     @DataProvider(name="data1")
     public Object[][] method()
     {
    	 Object[][] d=new Object[9][1];
    	 d[0][0]="Puma Shoes";
    	 d[1][0]="Calvin Klein T-Shirt";
    	 d[2][0]="Hand Bag";
    	 d[3][0]="Wallet";
    	 d[4][0]="Laptop";
    	 d[5][0]="Mobiles";
    	 d[6][0]="Books";
    	 d[7][0]="Dry-Fruits";
    	 d[8][0]="TV";
    	 
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
