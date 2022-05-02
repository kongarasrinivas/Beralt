package com.Beralt.PotentialCreation;

import org.testng.annotations.Test;

import com.crm.GenericLib.BaseTest;
import com.crm.GenericLib.filelib;
import com.crm.GenericLib.webDriverComonLib;
import com.crm.Pages.CreatePotentialPage;
import com.crm.Pages.HomePage;
import com.crm.Pages.potentialpage;
import com.crm.leads.ValidLoginTest;

public class VerifyNewPotential extends BaseTest {
@Test
public void VerifyNewPotentialTest() throws Throwable {
	
ValidLoginTest vl= new ValidLoginTest();
//webDriverComonLib wlib = new webDriverComonLib();
//filelib flib = new filelib();
vl.loginTOApp();
//wlib.verify(flib.readPropertyData(PROP_PATH,"homeTitle"),wlib.getpageTitle(),"CRM Home ");

HomePage hp = new HomePage();
hp.clickPotentialTab();
potentialpage pl = new potentialpage();
webDriverComonLib wlib = new webDriverComonLib();
CreatePotentialPage cp = new CreatePotentialPage();
 wlib.elementDisplayed(pl.getpotentialPageTextaddr(),"potential page");
 pl.clicknewPotentialtab();
 wlib.elementDisplayed(cp.getcreatePotentialTxtAddr(),"Create potential page");

filelib flib = new filelib();
 String potentialNam= flib.readExcelData(EXCEL_PATH,"Potential", 0, 1);
String amnt = flib.readExcelData(EXCEL_PATH,"Potential",1,1);
String accName = flib.readExcelData(EXCEL_PATH,"Potential",2,1);
String stagedrp = flib.readExcelData(EXCEL_PATH,"Potential",3,1);
String accCloseTxtBx = flib.readExcelData(EXCEL_PATH,"Potential",4,1);
//CreatePotentialPage cp = new CreatePotentialPage();
cp.createPotential(potentialNam, amnt, accName, stagedrp,accCloseTxtBx);

}
}
