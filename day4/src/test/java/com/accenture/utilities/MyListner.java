package com.accenture.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class MyListner  implements ITestListener{

	ExtentReports r;
	ExtentTest t;
	public void onFinish(ITestContext arg0) {
		r.endTest(t);
		r.flush();
	}

	public void onStart(ITestContext arg0) {
		r = new ExtentReports("C:\\Java Programs\\PNCSel\\Shahnawaz\\MyFrameWork\\MyReport\\Cukoo.html");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("Test Failed in percentage");
	}

	public void onTestFailure(ITestResult arg0) {
		t.log(LogStatus.FAIL,arg0.getMethod().getMethodName()+"  Has failed");
	}

	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Test Skipped");
	}

	public void onTestStart(ITestResult arg0) {
		System.out.println("Test Started");
		t = r.startTest(arg0.getMethod().getMethodName()+"Has Started");
		t.log(LogStatus.INFO,arg0.getMethod().getMethodName()+"  Has Started");
	}

	public void onTestSuccess(ITestResult arg0) {
		t.log(LogStatus.PASS,arg0.getMethod().getMethodName()+"   Has passed");
	}

}
