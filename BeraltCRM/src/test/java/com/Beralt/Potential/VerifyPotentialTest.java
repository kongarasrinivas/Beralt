package com.Beralt.Potential;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.GenericLib.BaseTest;
import com.crm.GenericLib.filelib;
import com.crm.GenericLib.webDriverComonLib;
import com.crm.Pages.HomePage;
import com.crm.Pages.LoginPage;
import com.crm.Pages.potentialpage;
import com.crm.leads.ValidLoginTest;
@Listeners(com.crm.GenericLib.MyListeners.class)
public class VerifyPotentialTest extends BaseTest {
	@Test
	public void verifyPotentialTest() throws Throwable
	{
		ValidLoginTest vl= new ValidLoginTest();
		vl.loginTOApp();
		Thread.sleep(2000);
		HomePage hp=new HomePage();
		hp.clickPotentialTab();
		webDriverComonLib wlib=new webDriverComonLib();
		potentialpage pl=new potentialpage();
		wlib.elementDisplayed(pl.getpotentialPageTextaddr(),"potential page");
		

	}
	
	
}
