package startingWithTestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Passing_Multiple_Parameter_Together 
{
	@Test(invocationCount=5,priority=9)
    public void login()
    {
    	System.out.println("Login");
    }
	
	@Test//(enabled=false)
    public void search()
    {
    	System.out.println("Search");
    }
	
	@Test(timeOut=1000)
    public void logout()
    {
    	System.out.println("Logout");
    	//ChromeDriver driver=new ChromeDriver();
    }
}
