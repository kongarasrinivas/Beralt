package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericLib.BaseTest;
import com.crm.GenericLib.webDriverComonLib;

public class CreatePotentialPage {
@FindBy(xpath=" //td[contains (text(),'Create Potential')]")private WebElement createPotentialTxt;
@FindBy(name="property(Potential Name)")private WebElement potentialNameTextBx;
@FindBy(name="property(Amount)")private WebElement amountTExtBx;
@FindBy(name="property(Account Name)")private WebElement accNameTextBx;
@FindBy(xpath="//select[@name='property(Stage)']")private WebElement stageDrpDwn;
@FindBy(name="property(Closing Date)") private WebElement closingAccntTxtbx;
@FindBy(xpath="//input[@value=\"Save\"]") WebElement saveBtn;
public CreatePotentialPage()
{
	PageFactory.initElements(BaseTest.driver,this);
}
public void createPotential(String potentialText,String amountTxt,String accnametxt,String stagedrp,String closeAccTxtbx)
{
	webDriverComonLib wlib = new webDriverComonLib();
	potentialNameTextBx.sendKeys(potentialText);
	amountTExtBx.sendKeys(amountTxt);
	accNameTextBx.sendKeys(accnametxt);
	wlib.selectOption(stagedrp,stageDrpDwn);
	closingAccntTxtbx.sendKeys(closeAccTxtbx);
	
	saveBtn.click();
}
public WebElement getcreatePotentialTxtAddr()
{
	return createPotentialTxt;
}
public String getPOtentialTxt()
{
	String text = createPotentialTxt.getText();
	return text;
			
	 
	
	
}

}
