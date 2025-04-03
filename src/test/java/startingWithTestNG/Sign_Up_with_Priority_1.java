package startingWithTestNG;

import org.testng.annotations.Test;

public class Sign_Up_with_Priority_1 
{
	@Test(priority=2)
    public void login()   
    {
		System.out.println("Login");
    }
    @Test(priority=3)
    public void logout()
    {
    	System.out.println("Logout");
    }
    @Test(priority=1)
    public void registeration()
    {
    	System.out.println("Registeration");
    }
}
