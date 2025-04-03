package startingWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_2_as_Clicking_Images_onGoogle extends Launch_and_Quit
{
    @Test
    public void clickImages()
    {
    	WebElement e1=driver.findElement(By.linkText("Images"));
    	e1.click();
    }
}
