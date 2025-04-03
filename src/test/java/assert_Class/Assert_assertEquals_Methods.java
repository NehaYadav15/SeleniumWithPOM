package assert_Class;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_assertEquals_Methods 
{
	@Test
    public void testCase1()
    {
    	Assert.assertEquals(false, false);
    	//Assert.assertEquals(true, true);
		//Assert.assertEquals(false, true);
		//Assert.assertEquals(true, false);
    }
}
