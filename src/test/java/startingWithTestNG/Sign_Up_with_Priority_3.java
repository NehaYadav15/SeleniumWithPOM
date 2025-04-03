package startingWithTestNG;

import org.testng.annotations.Test;

public class Sign_Up_with_Priority_3 
{
	@Test(priority=1)
    public void login()   
    {
		System.out.println("Login");
    }
    @Test()
    public void logout()
    {
    	System.out.println("Logout");
    }
    @Test(priority=-1)
    public void registeration()
    {
    	System.out.println("Registeration");
    }
}
