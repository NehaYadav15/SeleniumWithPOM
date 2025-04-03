package assert_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonSearch_Shoes_CheckTheNumberOfElementsPresentOnThatPage 
{
     @Test
     public void searchShoes() throws InterruptedException
     {
    	 ChromeDriver driver=new ChromeDriver();
 		driver.get("https://www.amazon.in/");
 		driver.manage().window().maximize();
 		WebElement e1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
 		e1.sendKeys("Shoes"+Keys.ENTER);
 		Thread.sleep(4000);
 		List<WebElement> e2=driver.findElements(By.xpath("//a[@class='a-link-normal s-no-outline']"));
        
 		//Assert.assertEquals(e2.size()>70, true);
 		Assert.assertEquals(e2.size()==70, true);
     }
}
