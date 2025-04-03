package startingWithTestNG;

import org.testng.annotations.Test;

public class Test_Caese_3_Present_Together 
{
    @Test
    public static void test_1()     /*Order Of Execution is Alphabetical or Numeric
                                    Order of the Method Name*/
    {
    	System.out.println("Executing TestCase 1");
    }
    @Test
    public static void test_2()
    {
    	System.out.println("Executing TestCase 2");
    }
    @Test
    public static void test_3()
    {
    	System.out.println("Executing TestCase 3");
    }
}
