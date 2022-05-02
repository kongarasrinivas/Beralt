package com.Beralt.ProductCreation;

import org.testng.annotations.Test;

import com.crm.GenericLib.BaseTest;
import com.crm.GenericLib.filelib;
import com.crm.GenericLib.webDriverComonLib;
import com.crm.Pages.CreateproductPage;
import com.crm.Pages.HomePage;
import com.crm.Pages.NewProduct;
import com.crm.leads.ValidLoginTest;

public class VerifyNewProduct extends BaseTest {
	@Test
	public void newProduct() throws Throwable
	{
	ValidLoginTest vl = new ValidLoginTest();
	vl.loginTOApp();
	HomePage hp = new HomePage();
	webDriverComonLib wlib = new webDriverComonLib();
	NewProduct np = new NewProduct();
	
	hp.clickProductTab();
	wlib.elementDisplayed(np.getProducttxtaddr(),"products page");
	
	np.ClickNewProductTab();
	CreateproductPage csp = new CreateproductPage();
	filelib flib = new filelib();
	wlib.elementDisplayed(csp.getCreateprdctTxtaddr(),"create product page");
	
String prdctcode = flib.readExcelData(EXCEL_PATH,"Product", 0,1);
String prdctcategrydrp = flib.readExcelData(EXCEL_PATH,"Product",1,1);
String prdctnametxt = flib.readExcelData(EXCEL_PATH,"Product",2, 1);
String manufactrdrpp = flib.readExcelData(EXCEL_PATH,"Product",3,1);
csp.createProduct(prdctcode, prdctcategrydrp, prdctnametxt, manufactrdrpp);
}
}
