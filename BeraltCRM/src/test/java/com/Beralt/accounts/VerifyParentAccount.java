package com.Beralt.accounts;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.GenericLib.BaseTest;
import com.crm.GenericLib.filelib;
import com.crm.GenericLib.webDriverComonLib;
import com.crm.Pages.AccountsPage;
import com.crm.Pages.HomePage;
import com.crm.Pages.createaccountspage;
import com.crm.leads.ValidLoginTest;

public class VerifyParentAccount extends BaseTest{

	@Test
	public void verifyParentAccountTest() throws Throwable
	{
		ValidLoginTest vl=new ValidLoginTest();
		vl.loginTOApp();
		
		HomePage hp=new HomePage();
		hp.clickaccounttab();
		
		webDriverComonLib wlib=new webDriverComonLib();
		AccountsPage ap=new AccountsPage();
		wlib.elementDisplayed(ap.getAccountsTextAddress(), "Accounts Page");
		
		ap.clicknewAccounttab();
		
		createaccountspage cp=new createaccountspage();
		cp.clickParentAccountImage();
		Thread.sleep(2000);
		filelib flib=new filelib();
		wlib.switchToWindow(cp.getAccountnameLink(), flib.readPropertyData(PROP_PATH, "accNameLookup"));
		
	}
}
