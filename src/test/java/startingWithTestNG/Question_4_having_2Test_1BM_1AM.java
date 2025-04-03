package startingWithTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Question_4_having_2Test_1BM_1AM 
{
   @AfterMethod
   public static void quit()
   {
	   System.out.println("AM");
   }
   @Test
   public static void testCase_2()
   {
	   System.out.println("Test Case-2");
   }
   @Test
   public void testCase_1()
   {
	   System.out.println("Test Case-1");
   }
   @BeforeMethod
   public void launchBrowser()
   {
	   System.out.println("BM");
   }
}
