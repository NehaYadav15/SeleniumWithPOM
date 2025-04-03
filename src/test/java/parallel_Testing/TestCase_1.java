package parallel_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_1 extends Launch_Quit
{
	@Test
    public void clickGmail()
    {
    	WebElement e1=driver.findElement(By.linkText("Gmail"));
    	e1.click();
    }
}
