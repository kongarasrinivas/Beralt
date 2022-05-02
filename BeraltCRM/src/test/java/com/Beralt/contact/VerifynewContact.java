package com.Beralt.contact;

import org.testng.annotations.Test;

import com.crm.GenericLib.BaseTest;
import com.crm.GenericLib.filelib;
import com.crm.GenericLib.webDriverComonLib;
import com.crm.Pages.ContactDetailsPage;
import com.crm.Pages.Contactspage;
import com.crm.Pages.Craetecontact;
import com.crm.Pages.HomePage;
import com.crm.Pages.createaccountspage;
import com.crm.leads.ValidLoginTest;

public class VerifynewContact extends BaseTest {


	@Test
	public void VerifynewContacttest() throws Throwable
	{
		ValidLoginTest vl= new ValidLoginTest();
		vl.loginTOApp();
		HomePage hp = new HomePage();
		hp.clickcontactTab();
		
		 Contactspage cp = new Contactspage();
		webDriverComonLib wlib = new webDriverComonLib();
		 
		wlib.elementDisplayed(cp.getContactTxtAddr(),"contact page");
		 
		 cp.newcontactTabclick();
		  
		 filelib flib = new filelib();
		 
		 
		 Craetecontact cc = new Craetecontact();
		 String fnameddr =flib.readExcelData(EXCEL_PATH, "Contact", 0, 1);
		 String fname = flib.readExcelData(EXCEL_PATH, "Contact", 1, 1);
		 String leaddrp= flib.readExcelData(EXCEL_PATH, "Contact", 2, 1);
		 String ltext= flib.readExcelData(EXCEL_PATH, "Contact", 3,1);
		String accname= flib.readExcelData(EXCEL_PATH, "Contact", 4,1);
		 wlib.switchToWindow(cc.getaccNameLink(),flib.readPropertyData(PROP_PATH,"contactNameLookup"));
			Thread.sleep(3000);
			
		 cc.createContact(fnameddr, fname, leaddrp, ltext,accname);
		 wlib.switchToWindow(cc.getaccNameLink(),flib.readPropertyData(PROP_PATH,"contactNameLookup"));
			Thread.sleep(3000);
			
		 cc.clickSaveBtn();
		 ContactDetailsPage cdp = new ContactDetailsPage();
		 wlib.elementDisplayed(cdp.getContactDetailsTextAddr(),"contact details page");
		
		
		 
	}

}
