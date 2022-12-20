package newPackageWithTestNG;


import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class CustomListener extends BaseClass implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
		System.out.println("Test Failed");
		failed(result.getMethod().getMethodName());
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test Case Failed is : " + result.getName());
		test.log(Status.FAIL, "Test Case Failed is : " + result.getThrowable());
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "Test Case Passed is : " + result.getName());
		}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test Case Skipped is : " + result.getName());
		}
	
	
	@Override
	public void onFinish(ITestContext testContext)
	{
		extent.flush();
	}

}
