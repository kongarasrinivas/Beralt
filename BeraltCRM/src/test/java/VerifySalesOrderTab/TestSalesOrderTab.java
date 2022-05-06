package VerifySalesOrderTab;



import org.testng.annotations.Test;

import com.crm.GenericLib.BaseTest;
import com.crm.GenericLib.webDriverComonLib;
import com.crm.Pages.HomePage;
import com.crm.Pages.SalesOrderTab;
import com.crm.leads.ValidLoginTest;

public class TestSalesOrderTab extends BaseTest {
	@Test
	public void salesOrder() throws Throwable
	{
		ValidLoginTest vl = new ValidLoginTest();
		vl.loginTOApp();
		HomePage hp = new HomePage();
		SalesOrderTab stb = new SalesOrderTab();
		hp.clickScrollRigtTabBtn();
		webDriverComonLib wlib = new webDriverComonLib();
		wlib.executeJavaScript("window.scrollBy"+wlib.getElementLocation(stb.getcaluclatraddr()));
	}

}
