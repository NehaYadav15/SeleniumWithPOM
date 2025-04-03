package googleSearch_Suite;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleSearch_Pass_India extends Launch_and_Quit
{
     @Test(retryAnalyzer=RetryLogic.class)
     public void searchIndia()
     {
    	 WebElement e1=driver.findElement(By.tagName("textarea"));
 		 e1.sendKeys("India"+Keys.ENTER);
     }
}
