package parallel_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_3 extends Launch_Quit
{
	@Test
    public void clickAbout()
    {
		
    	WebElement e1=driver.findElement(By.linkText("About"));
    	e1.click();
    }
}
