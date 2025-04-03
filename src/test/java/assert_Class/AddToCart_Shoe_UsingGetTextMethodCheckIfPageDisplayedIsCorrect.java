package assert_Class;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCart_Shoe_UsingGetTextMethodCheckIfPageDisplayedIsCorrect 
{
    @Test
    public void addToCartMethod() throws InterruptedException
    {
    	ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?ref_=nav_custrec_signin");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
        WebElement e1=driver.findElement(By.xpath("(//input)[5]"));
        e1.sendKeys("Shoes"+Keys.ENTER);
        Thread.sleep(1000);
        
        WebElement firstshoe=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
        firstshoe.click();
        Thread.sleep(1000);
        
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
        Thread.sleep(1000);
        
        //WebElement e2=driver.findElement(By.className("a-size-medium-plus a-color-base sw-atc-text a-text-bold"));
        //Thread.sleep(1000);
        WebElement e2=driver.findElement(By.xpath("//h1[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']"));
        Thread.sleep(1000);
        
        Assert.assertEquals(e2.getText(), "Added to cart","Sorry you are at wrong page");
    }
}




