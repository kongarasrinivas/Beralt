package VerifyArwSymbl;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.GenericLib.BaseTest;
import com.crm.Pages.ArrwSymblOptns;
import com.crm.Pages.HomePage;
import com.crm.leads.ValidLoginTest;

public class ArwSymblTest extends BaseTest{
	@Test
	public void verifyArwSymbl() throws Throwable
	{
	ValidLoginTest vl = new ValidLoginTest();
	vl.loginTOApp();
	Actions ac = new Actions(driver);
	HomePage hp = new HomePage();
	ac.moveToElement(hp.getArrowSymblAddr()).perform();
//hp.sendKeys(Keys.DOWN);
	//hp.getArrowSymblAddr().sendKeys(Keys.DOWN);
	ArrwSymblOptns as = new ArrwSymblOptns();
	as.clickNewcaseBtn();
	

}
}
	
