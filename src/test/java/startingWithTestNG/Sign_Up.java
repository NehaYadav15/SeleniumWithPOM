package startingWithTestNG;

import org.testng.annotations.Test;

public class Sign_Up 
{
	@Test
    public void login()     /*Order Of Execution is Alphabetical or Numeric
                                    Order of the Method Name*/
    {
		System.out.println("Login");
    }
    @Test
    public void logout()
    {
    	System.out.println("Logout");
    }
    @Test
    public void registeration()
    {
    	System.out.println("Registeration");
    }
}
