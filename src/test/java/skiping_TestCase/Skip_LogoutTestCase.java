package skiping_TestCase;

import org.testng.annotations.Test;

public class Skip_LogoutTestCase 
{
     @Test(priority=1)
     public void login()
     {
    	 throw new NullPointerException();
     }
     @Test(priority=2, dependsOnMethods="login")
     public void logout()
     {
    	 
     }
}
