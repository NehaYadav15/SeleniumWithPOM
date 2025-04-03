package startingWithTestNG;

import org.testng.annotations.Test;

public class Passing_Parameter_timeOut 
{
	@Test(invocationCount=5)
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
    }
}
