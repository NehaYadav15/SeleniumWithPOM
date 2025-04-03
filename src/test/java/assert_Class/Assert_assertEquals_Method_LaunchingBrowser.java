package assert_Class;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_assertEquals_Method_LaunchingBrowser 
{
	@Test
    public void testCase1()
    {
    	ChromeDriver driver=new ChromeDriver();
    	driver.get("https://www.google.com");
    	Assert.assertEquals(driver.getTitle(), "Google");
    }
}
