package startingWithTestNG;

import org.testng.annotations.Test;

public class Enable_and_Disable_testCases 
{
    @Test(invocationCount=15)
    public void buy()
    {
    	System.out.println("Buy");
    }
    
    @Test(invocationCount=5)
    public void login()
    {
    	System.out.println("Login");
    }
    
    @Test(enabled=true)
    public void addToCart()
    {
    	System.out.println("Adding to cart");
    }
    
    @Test(enabled=false)
    public void search()
    {
    	System.out.println("Search");
    }
}
