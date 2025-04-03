package parallel_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase_6 extends Launch_Quit
{
	@Test
    public void clickIamFeelingLuckyButton()
    {
		WebElement element=driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]"));
    	element.click();
    }
}
