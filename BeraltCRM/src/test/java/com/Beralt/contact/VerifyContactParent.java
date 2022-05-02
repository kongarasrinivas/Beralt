package com.Beralt.contact;

import org.testng.annotations.Test;

import com.crm.GenericLib.BaseTest;
import com.crm.GenericLib.filelib;
import com.crm.GenericLib.webDriverComonLib;
import com.crm.Pages.Contactspage;
import com.crm.Pages.Craetecontact;
import com.crm.Pages.HomePage;
import com.crm.Pages.createaccountspage;
import com.crm.leads.ValidLoginTest;

public class VerifyContactParent extends BaseTest {
	@Test
	public void VerifyCntctpage() throws Throwable
	{
		ValidLoginTest vl = new ValidLoginTest();
		vl.loginTOApp();
		 
		HomePage hp = new HomePage();
		hp.clickcontactTab();
		
		Contactspage cp = new Contactspage();
		cp.newcontactTabclick();
		Craetecontact cc = new Craetecontact();
		cc.clickaccNameImgBTn();
		filelib flib = new filelib();
		//wlib.switchToWindow(cp.getAccountnameLink(), flib.readPropertyData(PROP_PATH, "accNameLookup"));
		webDriverComonLib wlib = new webDriverComonLib();
		wlib.switchToWindow(cc.getaccNameLink(),flib.readPropertyData(PROP_PATH,"contactNameLookup"));
		
		
		
		
		
		
		
	}

}
