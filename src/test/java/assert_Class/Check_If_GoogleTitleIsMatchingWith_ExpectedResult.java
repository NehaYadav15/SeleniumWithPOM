package assert_Class;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Check_If_GoogleTitleIsMatchingWith_ExpectedResult 
{
     @Test
     public void testCase_1()
     {
    	 ChromeDriver driver=new ChromeDriver();
    	 driver.get("https://www.google.com");
 
    	 Assert.assertEquals(driver.getTitle(),"MKT","Sorry title is wrong");
    	 driver.manage().window().maximize(); 
     }
}
