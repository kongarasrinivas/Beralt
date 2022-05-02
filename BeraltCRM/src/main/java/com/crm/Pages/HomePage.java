package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericLib.BaseTest;

public class HomePage {

	@FindBy(xpath="//a[text()='Potentials']") private WebElement potentialTab;
	@FindBy(xpath = "//a[text()='Contacts']")private WebElement contactTab;
	@FindBy(xpath="//a[text()='Accounts']") private WebElement accountsTab;
	@FindBy(xpath="//a[text()='Campaigns']") private WebElement campaignsTab;
	@FindBy(xpath = "//a[text()='Leads']") private WebElement leadsTab;
	@FindBy(xpath="//a[text()='Forecasts']") private WebElement forecastTab;
	@FindBy(xpath="//a[text()='Products']") private WebElement productTab;
	@FindBy(xpath="//IMG[@alt=\"crm.dropdown.submenu\"]") private WebElement arrowSymbl;
	
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getPotentialTab()
	{
		return potentialTab;
	}
	
	public void clickPotentialTab()
	{
		potentialTab.click();
	}
	public WebElement getPotentialTabAddress() {
		return potentialTab;

	}

	public WebElement getContacttab() {
		return contactTab;
		
	}
	public void clickcontactTab() {
		contactTab.click();
	}
	public WebElement getcontactTabaddress() {
		return contactTab;
		
	}
	public WebElement getaccountsTab(){
		return  accountsTab;
	}
	public void clickaccounttab(){
		 accountsTab.click();
	}
public WebElement getaccountsTabaddress() {
	return  accountsTab;
	
}
public WebElement getcampaignsTab() {
	return campaignsTab;
}
public void clickcampaigntab() {
	campaignsTab.click();
}
public WebElement getcampaignsTabaddress() {
	return campaignsTab;
}
	
public void clickLeadstab() {
	leadsTab.click();
}
public void clickforecastTab()
{
	forecastTab.click();
}
public WebElement getArrowSymblAddr()
{
return arrowSymbl;
}
public void clickProductTab()
{
	productTab.click();
}
	



	
	
}
