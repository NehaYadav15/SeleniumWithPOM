package parallel_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_4 extends Launch_Quit
{
	@Test
    public void clickStore()
    {
    	WebElement e1=driver.findElement(By.linkText("Store"));
    	e1.click();
    }
}
