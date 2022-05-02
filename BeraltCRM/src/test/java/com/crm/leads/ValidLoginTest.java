package com.crm.leads;

import com.crm.GenericLib.BaseTest;
import com.crm.GenericLib.filelib;
import com.crm.GenericLib.webDriverComonLib;
import com.crm.Pages.LoginPage;

public class ValidLoginTest extends BaseTest{
	
	
	public void loginTOApp() throws Throwable {
		LoginPage lp = new LoginPage();
		filelib flib = new filelib();
		lp.login(flib.readPropertyData(PROP_PATH,"username"),flib.readPropertyData(PROP_PATH,"password"));
		webDriverComonLib wlib = new webDriverComonLib();
		wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH,"homeTitle"));
		wlib.verify(flib.readPropertyData(PROP_PATH,"homeTitle"),wlib.getpageTitle(),"CRM Home ");
	}

}
