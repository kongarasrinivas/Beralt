package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericLib.BaseTest;
import com.crm.GenericLib.webDriverComonLib;

public class CreateLeadPage {
	@FindBy(name = "property(saltName)") private WebElement firstnameDropdown;
	@FindBy(name="property(First Name)") private WebElement firstnameTextbox;
	@FindBy(name="property(Company)") private WebElement companyTextbox;
	@FindBy(name="property(Last Name)") private WebElement lastNameTextbox;
	@FindBy(name="property(Lead Source)") private WebElement leadSourceDropdown;
	@FindBy(xpath = "(//input[@name=\"Button\"])[1]") private WebElement saveButton;
	
	
	public CreateLeadPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void createNewLead(String salText, String fn, String company, String ln, String leadSource)
	{
		webDriverComonLib wlib = new webDriverComonLib();
		wlib.selectOption(salText, firstnameDropdown);
		firstnameTextbox.sendKeys(fn);
		companyTextbox.sendKeys(company);
		lastNameTextbox.sendKeys(ln);
		wlib.selectOption(leadSource, leadSourceDropdown);
		
		saveButton.click();
	}
	
}
