package startingWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_1_as_Clicking_Gmail extends Launch_and_Quit
{
    @Test
    public void clickGmail()
    {
    	WebElement e1=driver.findElement(By.linkText("Gmail"));
    	e1.click();
    }
}
