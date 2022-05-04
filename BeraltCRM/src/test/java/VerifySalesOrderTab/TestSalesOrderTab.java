package VerifySalesOrderTab;



import org.testng.annotations.Test;

import com.crm.GenericLib.BaseTest;
import com.crm.GenericLib.webDriverComonLib;
import com.crm.Pages.HomePage;

import com.crm.leads.ValidLoginTest;

public class TestSalesOrderTab extends BaseTest {
	@Test
	public void salesOrder() throws Throwable
	{
		ValidLoginTest vl = new ValidLoginTest();
		vl.loginTOApp();
		HomePage hp = new HomePage();
		hp.clickScrollRigtTabBtn();
		webDriverComonLib wlib = new webDriverComonLib();
		wlib.executeJavaScript("window.scrollBy(100,100)");
	}

}
