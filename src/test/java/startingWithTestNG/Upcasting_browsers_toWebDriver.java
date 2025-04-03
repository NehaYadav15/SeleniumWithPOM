package startingWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Upcasting_browsers_toWebDriver 
{
	static WebDriver driver;
    public static void main(String[] args) 
    {
		if(1==1)
		{
			driver=new ChromeDriver();
			driver.quit();
		}
		if(true)
		{
			driver=new EdgeDriver();
			driver.quit();
		}
		if(2==2)
		{
			driver=new FirefoxDriver();
			driver.quit();
		}
	}
}
