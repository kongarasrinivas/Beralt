//package com.crm.GenericLib;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.markuputils.ExtentColor;
//import com.aventstack.extentreports.markuputils.MarkupHelper;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//public class CustomReports {
//	
//public static void main(String[] args) {
//	//set path of report
//	ExtentSparkReporter spark = new ExtentSparkReporter("C:\\Users\\Srinivas\\git\\repository\\BeraltCRM\\Extentreport\\myReport.html");
//	ExtentReports extent = new ExtentReports();
//	//giving setting reports 
//	spark.config().setDocumentTitle("BERALT REPORT");
//	spark.config().setReportName("EXTENT REPORT");
//	spark.config().setTheme(Theme.DARK);
//	extent.attachReporter(spark);
//	
//	//create test into repotrs
//	ExtentTest test = extent.createTest("Verify AccountCreation");
//	//give various status of test steps
//	test.info(MarkupHelper.createLabel("Account created",ExtentColor.BLUE));
//	test.pass(MarkupHelper.createLabel("Element is Displayed",ExtentColor.GREEN));
//	//test.fail(MarkupHelper.createLabel("accounts is not displayed", ExtentColor.RED));
//	
//	
//	//save the report
//	extent.flush();
//	
//	
//}
//}
