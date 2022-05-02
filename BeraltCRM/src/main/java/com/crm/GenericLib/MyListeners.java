package com.crm.GenericLib;

import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.internal.annotations.IListeners;

public  class MyListeners  implements ITestListener {

	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+" method started",true);
	}

	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+" method passed",true);
	}

	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+" method failed",true);
		webDriverComonLib wlib=new webDriverComonLib();
		 wlib.getFullScreenshot("D:\\crmexperience\\Beralt\\screenshots\\"+result.getName()+".jpg");
	}

	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+" method skipped",true);
	}

	

	

}
