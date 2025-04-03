package assert_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LoginToAmazon_CheckIfTitleIsSame_TestCaseGotPassed 
{
	@Test
	public void loginMethod() throws InterruptedException 
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
    driver.manage().window().maximize();
    
    WebElement e1=driver.findElement(By.xpath("//a[@class='nav-a nav-a-2   nav-progressive-attribute'][1]"));
    e1.sendKeys(Keys.ENTER);
    //e1.sendKeys(Keys.ARROW_DOWN);
    
    WebElement e2=driver.findElement(By.id("nav-flyout-ya-signin"));
    e2.click();
    
    WebElement e3=driver.findElement(By.id("ap_email"));
	e3.sendKeys("9583495508");
	
	Thread.sleep(1000);
	WebElement e4=driver.findElement(By.id("continue"));
	e4.click();
	Thread.sleep(1000);
	
	WebElement e5=driver.findElement(By.name("password"));
	e5.sendKeys("Amazon12");
	Thread.sleep(1000);
	
	WebElement e6=driver.findElement(By.id("signInSubmit"));
	e6.click();
	
	}
}
