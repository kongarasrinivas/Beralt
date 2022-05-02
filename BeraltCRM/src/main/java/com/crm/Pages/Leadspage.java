package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericLib.BaseTest;

public class Leadspage {

	@FindBy(xpath = "//td[contains(text(),'Leads: ')]") private WebElement leadsText;
	@FindBy(xpath = "//input[@value='New Lead']") private WebElement newLeadsButton;
	
	
	
	public Leadspage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public WebElement getLeadsTextAddress()
	{
		return leadsText;
	}
	
	public String getLeadsText()
	{
		String lText = leadsText.getText();
		return lText;
	}
	
	public void clickNewLeadButton()
	{
		newLeadsButton.click();
	}
	
	
	
	
	
}
