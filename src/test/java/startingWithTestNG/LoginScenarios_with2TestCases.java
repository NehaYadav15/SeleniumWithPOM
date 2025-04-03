package startingWithTestNG;

import org.testng.annotations.Test;

public class LoginScenarios_with2TestCases 
{
   @Test
   public void loginWithPhoneNo()
   {
	   System.out.println("Done login using phone number");
   }
   @Test
   public void loginWithEmailId()
   {
	   System.out.println("Done login using email id");
   }
   
}
