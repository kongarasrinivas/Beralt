package com.Beralt.accounts;

import org.testng.annotations.Test;

import com.crm.GenericLib.BaseTest;
import com.crm.GenericLib.webDriverComonLib;
import com.crm.Pages.AccountsPage;
import com.crm.Pages.ContactDetailsPage;
import com.crm.Pages.HomePage;
import com.crm.leads.ValidLoginTest;

//@Listeners(com.crm.GenericLib.MyListeners.class)
public class VerifyAccountsTest extends BaseTest{

	@Test
	public void verifyAccounts() throws Throwable
	{
		
		ValidLoginTest vl=new ValidLoginTest();
		vl.loginTOApp();
		
		HomePage hp=new HomePage();
		hp.clickaccounttab();
		
		webDriverComonLib wlib=new webDriverComonLib();
		AccountsPage ap=new AccountsPage();
		wlib.elementDisplayed(ap.getAccountsTextAddress(), "Accounts Page");
		
		//List<WebElement> al = ap.getAllAccountNames();
		//for(int i=1;i<=3;i++)
		//{
			//System.out.println(al.get(i).getText());
		ap.clickSrinuTabClick();
		ContactDetailsPage cdp = new ContactDetailsPage();
		cdp.clickDeletBTn();
		//wlib.dismissAlert();
		wlib.GetAlertText();
		
		}
	
	}
