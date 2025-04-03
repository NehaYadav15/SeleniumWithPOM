package amazon_PaymentPageScenarios;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_GoToPaymentPageWitoutAnyWait 
{
   @Test
   public void amazon()
   {
	   ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?ref_=nav_custrec_signin");
		driver.manage().window().maximize();
		
       WebElement e5=driver.findElement(By.xpath("(//input)[5]"));
       e5.sendKeys("Shoes"+Keys.ENTER);
       
       WebElement firstshoe=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
       firstshoe.click();
       
       Set<String> pcid=driver.getWindowHandles();
       System.out.println(pcid);
       //driver.close();
       Iterator<String> i2=pcid.iterator();
       String pid=i2.next();
       String cid=i2.next();
       System.out.println(pid);
       System.out.println(cid);
       driver.switchTo().window(cid);
       
       WebElement cart=driver.findElement(By.id("add-to-cart-button"));
       cart.click();
       
       WebElement proceedbuy=driver.findElement(By.name("proceedToRetailCheckout"));
       proceedbuy.click();
       
       WebElement e1=driver.findElement(By.id("ap_email"));
		e1.sendKeys("9583495508");
		
		WebElement e2=driver.findElement(By.id("continue"));
		e2.click();
		
		WebElement e3=driver.findElement(By.name("password"));
		e3.sendKeys("Amazon12");
		
		WebElement e4=driver.findElement(By.id("signInSubmit"));
		e4.click();
		
		WebElement e7=driver.findElement(By.xpath("(//span[@id='orderSummaryPrimaryActionBtn'])"));
       e7.click();
       
       WebElement e8=driver.findElement(By.xpath("(//input[@name='ppw-instrumentRowSelection'])[3]"));
       e8.click();
       
	}
}

