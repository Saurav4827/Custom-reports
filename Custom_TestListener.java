package javascriptexecutor;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Custom_TestListener implements ITestListener

{

	public void onTestStart(ITestResult result) {
		
		System.out.println("TestStarted" + result.getName());

	}

	public void onTestSuccess(ITestResult result) {
	
		System.out.println("TestSuccess" + result.getName());

	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("Testfailed" + result.getName());

	}

	public void onTestSkipped(ITestResult result) {
	
		System.out.println("TestSkipped" + result.getName());

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Testfailed within success percentage" + result.getName());
	}

	public void onStart(ITestContext context) {
		System.out.println("Execution Start" + context.getName());
	}

	public void onFinish(ITestContext context) {
		System.out.println("Execution finished" + context.getName());
	}


}
