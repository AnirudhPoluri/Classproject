package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LIGner implements ITestListener {

	BaseTest b =new BaseTest();
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("testcases onTestStart and detailes are  " +result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("testcases onTestSuccess and detailes are  " +result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("testcases failed and detailes are  " +result.getName());
		String testmethodname = result.getName();
		b.takescreenshot(testmethodname);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("testcases onTestSkipped and detailes are  " +result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
