package parallel_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_Quit 
{
	WebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	   public void launch(String nameOfBrowser) throws InterruptedException
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
		   Thread.sleep(1000);
		   driver.manage().window().maximize();
	   }
	   
	   @AfterMethod
	   public void quit() throws InterruptedException
	   {
		   Thread.sleep(2000);
		   driver.quit();
	   }
}
