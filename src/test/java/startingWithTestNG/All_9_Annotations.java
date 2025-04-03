package startingWithTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class All_9_Annotations 
{
	@BeforeSuite
	public void bs()
	{
		System.out.println("BeforeSuite");
		
	}
	@BeforeTest
	public void bt()
	{
		System.out.println("Beforetest");
		
	}
	@BeforeClass
	public void bc()
	{
		System.out.println("Beforeclass");
		
	}
	@BeforeMethod
	public void bm()
	{
		System.out.println("Beforemethod");
		
	}
	@Test
	public void testcase1()
	{
		System.out.println("Test case 1");
		
	}
	@AfterSuite
	public void as()
	{
		System.out.println("AS");
		
	}
	@AfterMethod
	public void am()
	{
		System.out.println("AM");
		
	}
	@AfterClass
	public void ac()
	{
		System.out.println("AC");
		
	}
	@AfterTest
	public void at()
	{
		System.out.println("AT");
		
	}
}
