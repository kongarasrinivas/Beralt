package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericLib.BaseTest;

public class Contactspage {
	
	
	@FindBy(xpath="//td[contains(text(),'All Contacts')]") private WebElement contactText;
	@FindBy(xpath="//input[@value=\'New Contact\']") private WebElement newContacTTab;
	
	
	
	public Contactspage() {
		PageFactory.initElements(BaseTest.driver, this);

	}
	public WebElement getContactTxtAddr()
	{
		return contactText;
	}

	public String getContactText()
	{
		String text = contactText.getText();
	return text;
	}
public void newcontactTabclick()
{
	newContacTTab.click();
}
}