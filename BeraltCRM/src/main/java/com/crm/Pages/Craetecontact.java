package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericLib.BaseTest;
import com.crm.GenericLib.webDriverComonLib;

public class Craetecontact {
	@FindBy(name="property(saltName)") private WebElement fnNamedrp;
	@FindBy(name="property(First Name)") private WebElement fnNameTextbox;
	@FindBy(name="property(Lead Source)") private WebElement leadSourcedrp;
	@FindBy(name="property(Last Name)") private WebElement lastNameTExtbox;
	@FindBy(name="property(Account Name)") private WebElement accNameTextbox;
	@FindBy(xpath="//input[@value=\"Save\"]") private WebElement saveBtn;
	@FindBy(xpath="//img[@src=\"/crm/images/Accounts_small.gif\"]") private WebElement accNameImageBtn;
	@FindBy(xpath="(//table)[4]//tr[2]//td[1]")private WebElement accNameLink;
	public Craetecontact()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
public void createContact(String fnamedr,String fNameTxt,String leadSrcdrp,String lNametxt,String accNamTxt)
{
	webDriverComonLib wlib = new webDriverComonLib();
	wlib.selectOption(fnamedr, fnNamedrp);
	fnNameTextbox.sendKeys(fNameTxt);
	wlib.selectOption(leadSrcdrp, leadSourcedrp);
	lastNameTExtbox.sendKeys(lNametxt);
	accNameTextbox.sendKeys(accNamTxt);
}
public void clickSaveBtn() {
	saveBtn.click();
	
}
public WebElement getaccNameImagbtn()
{
	return accNameImageBtn;
}
public void clickaccNameImgBTn()
{
	accNameImageBtn.click();
}
public WebElement getaccNameLink()
{
	return accNameLink;
}
}
