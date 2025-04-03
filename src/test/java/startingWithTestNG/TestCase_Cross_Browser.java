package startingWithTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCase_Cross_Browser 
{
   WebDriver driver;
   @Parameters("browser")
   @Test
   public void launchBrowser(String nameOfBrowser) throws InterruptedException
   {
	   if(nameOfBrowser.equals("edge"))
	   {
		   driver=new EdgeDriver();
	   }
	   if(nameOfBrowser.equals("chrome"))
	   {
		   driver=new ChromeDriver();
	   }
	   if(nameOfBrowser.equals("firefox"))
	   {
		   driver=new FirefoxDriver();
	   }
	   driver.get("https://www.google.com/");
	   driver.manage().window().maximize();
	   driver.findElement(By.linkText("Gmail")).click();
	   driver.quit(); 
   }
}
