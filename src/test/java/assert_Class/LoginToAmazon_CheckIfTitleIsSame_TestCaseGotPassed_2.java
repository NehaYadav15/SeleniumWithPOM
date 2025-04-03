package assert_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class LoginToAmazon_CheckIfTitleIsSame_TestCaseGotPassed_2 
{
	@Test
	public void loginMethod() 
	{
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Flog-in%2Fs%3Fk%3Dlog%2Bin%26ref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
    driver.manage().window().maximize();
    WebElement e1=driver.findElement(By.id("ap_email"));
	e1.sendKeys("9583495508");
	
	WebElement e2=driver.findElement(By.id("continue"));
	e2.click();
	//Thread.sleep(1000);
	
	WebElement e3=driver.findElement(By.name("password"));
	e3.sendKeys("Amazon12");
	//Thread.sleep(1000);
	
	WebElement e4=driver.findElement(By.id("signInSubmit"));
	e4.click();
	
	}
}
