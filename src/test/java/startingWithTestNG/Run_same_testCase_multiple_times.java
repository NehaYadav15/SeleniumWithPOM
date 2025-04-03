package startingWithTestNG;

import org.testng.annotations.Test;

public class Run_same_testCase_multiple_times 
{
    @Test(invocationCount=15)
    public void buy()
    {
    	System.out.println("Buy");
    }
    
    @Test(invocationCount=2)
    public void login()
    {
    	System.out.println("Login");
    }
}
