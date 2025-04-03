package parallel_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_5 extends Launch_Quit
{
	@Test
    public void clickGoogleApps()
    {
		WebElement e1=driver.findElement(By.xpath("(//div[@class='gb_J gb_cd gb_0'])"));
    	e1.click();
    }
}
