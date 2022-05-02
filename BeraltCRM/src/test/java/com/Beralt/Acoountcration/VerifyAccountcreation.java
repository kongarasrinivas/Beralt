package com.Beralt.Acoountcration;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.GenericLib.BaseTest;
import com.crm.GenericLib.filelib;
import com.crm.GenericLib.webDriverComonLib;
import com.crm.Pages.AccountsPage;
import com.crm.Pages.HomePage;
import com.crm.Pages.createaccountspage;
import com.crm.leads.ValidLoginTest;
@Listeners(com.crm.GenericLib.MyListeners.class)
public class VerifyAccountcreation extends BaseTest {
	
	@Test
	public void VerifyAccountcreationtest() throws Throwable
	{
		ValidLoginTest vl= new ValidLoginTest();
		vl.loginTOApp();
		HomePage hp = new HomePage();
		hp.clickaccounttab();
		
		webDriverComonLib wlib = new webDriverComonLib();
		AccountsPage ap= new AccountsPage();
		wlib.elementDisplayed(ap.getAccountsTextAddress(),"Account page");
		
		ap.clicknewAccounttab();
		filelib flib = new filelib();
		wlib.verify(flib.readPropertyData(PROP_PATH,"createaccountTitle"),
				wlib.getpageTitle(),"create Accounts page");
		
		 createaccountspage ca= new  createaccountspage();
		 
		 String  accname= flib.readExcelData(EXCEL_PATH, "Accounts", 0, 1);
		 String ownerdrop= flib.readExcelData(EXCEL_PATH,"Accounts",4,1);
		 String prprtydrp = flib.readExcelData(EXCEL_PATH,"Accounts",3, 1);
		 String accType = flib.readExcelData(EXCEL_PATH,"Accounts", 2, 1);
		 String accsitename= flib.readExcelData(EXCEL_PATH, "Accounts",1,1);
		 
		
		ca.createNewAcc(accname, ownerdrop, prprtydrp, accType, accsitename);
	}

}






