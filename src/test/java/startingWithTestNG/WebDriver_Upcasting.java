package startingWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver_Upcasting 
{
    public static void main(String[] args) 
    {
		WebDriver driver=new ChromeDriver();
		WebDriver dri=new EdgeDriver();
		WebDriver dr=new FirefoxDriver();
	}
}
