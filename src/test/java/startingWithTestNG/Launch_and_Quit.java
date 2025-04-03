package startingWithTestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_and_Quit 
{
   ChromeDriver driver;
   @BeforeMethod
   public void launch()
   {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.google.com/");
   }
   
   @AfterMethod
   public void quit() throws InterruptedException
   {
	   Thread.sleep(2000);
	   driver.quit();
   }
}
