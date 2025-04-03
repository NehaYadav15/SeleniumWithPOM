package googleSearch_Suite;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer
{
    int initialCount=0;
    int retryCountTimes=2;
	
	@Override
	public boolean retry(ITestResult result) 
	{
	   if(initialCount<retryCountTimes)
	   {
		   initialCount++;
		   return true;
	   }
		
		return false;
	}

}
