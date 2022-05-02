package com.Beralt.campaign;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.GenericLib.BaseTest;
import com.crm.GenericLib.webDriverComonLib;
import com.crm.Pages.HomePage;
import com.crm.Pages.campaignpage;
import com.crm.leads.ValidLoginTest;

@Listeners(com.crm.GenericLib.MyListeners.class)
public class verifyCampaignTest extends BaseTest {
@Test
	public void verifyCampaign() throws Throwable
	{
		ValidLoginTest v1=new ValidLoginTest();
		v1.loginTOApp();
		Thread.sleep(2000);
		HomePage hp= new HomePage();
		hp.clickcampaigntab();
		webDriverComonLib wlib= new webDriverComonLib();
		campaignpage cp = new campaignpage();
		wlib.elementDisplayed(cp.getcampaignpageTextaddr(),"campaign page");
	}
}
