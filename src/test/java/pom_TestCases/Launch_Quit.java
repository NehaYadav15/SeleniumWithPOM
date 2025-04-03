package pom_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_Quit 
{
	WebDriver driver;
   @BeforeMethod
   public void launch()
   {
	   driver=new EdgeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://www.amazon.in");
   }
   
//   @AfterMethod
//   public void quit() throws InterruptedException
//   {
//	   Thread.sleep(5000);
//	   driver.quit();
//   }
}
