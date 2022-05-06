package com.crm.GenericLib;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.internal.annotations.IListeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public  class MyListeners  implements ITestListener {
	ExtentSparkReporter spark;
	ExtentReports extent;
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		//Reporter.log(result.getName()+" method started",true);
		test=extent.createTest(result.getName());
		test.pass(MarkupHelper.createLabel(result.getName()+" is started",ExtentColor.BLUE ));
	}

	public void onTestSuccess(ITestResult result) {
		//Reporter.log(result.getName()+" method passed",true);
		test=extent.createTest(result.getName());
		test.pass(MarkupHelper.createLabel(result.getName()+" is passed", ExtentColor.GREEN));
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+" method failed",true);
		webDriverComonLib wlib=new webDriverComonLib();
		 wlib.getFullScreenshot("D:\\crmexperience\\Beralt\\screenshots\\"+result.getName()+".jpg");
		 
		 test=extent.createTest(result.getName());
		 test.fail(MarkupHelper.createLabel(result.getName()+" is Failed", ExtentColor.RED));
	}

	public void onTestSkipped(ITestResult result) {
		//Reporter.log(result.getName()+" method skipped",true);
		test=extent.createTest(result.getName());
		test.skip(MarkupHelper.createLabel(result.getName()+" is Skipped",ExtentColor.ORANGE));
	}

	

	

}
