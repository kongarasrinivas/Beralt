package com.crm.leads;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.GenericLib.BaseTest;
import com.crm.GenericLib.filelib;
import com.crm.GenericLib.webDriverComonLib;
import com.crm.Pages.CreateLeadPage;
import com.crm.Pages.HomePage;
import com.crm.Pages.Leadspage;

//@Listeners(com.crm.GenericLib.MyListeners.class)
public class VerifyLeadCreation extends BaseTest{

	@Test
	public void verifyLeadCreationTest() throws Throwable
	{
		ValidLoginTest vl=new ValidLoginTest();
		vl.loginTOApp();
		
		HomePage hp=new HomePage();
		hp.clickLeadstab();
		
		webDriverComonLib wlib=new webDriverComonLib();
		Leadspage lp=new Leadspage();
		wlib.elementDisplayed(lp.getLeadsTextAddress(), "Leads Page");
		
		lp.clickNewLeadButton();
		filelib flib=new filelib();
		wlib.verify(flib.readPropertyData(PROP_PATH, "createLeadTitle"),
				wlib.getpageTitle(), 
				"Create Leads page");
		
		CreateLeadPage cl=new CreateLeadPage();
		String salText = flib.readExcelData(EXCEL_PATH, "Leads", 0, 1);
		String fn = flib.readExcelData(EXCEL_PATH, "Leads", 1, 1);
		String company = flib.readExcelData(EXCEL_PATH, "Leads", 2, 1);
		String ln = flib.readExcelData(EXCEL_PATH, "Leads", 3, 1);
		String leadSource = flib.readExcelData(EXCEL_PATH, "Leads", 4, 1);
		cl.createNewLead(salText, fn, company, ln, leadSource);
		
		
		
	}
}
