package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericLib.BaseTest;

public class ContactDetailsPage {
	@FindBy(xpath="//td[contains(text(),'Contact Details')]") private WebElement contctDetlsTxt;
	@FindBy(xpath="//input[@value=\"Delete\"]") private WebElement deleteBtn;
	
public ContactDetailsPage()
	{
PageFactory.initElements(BaseTest.driver,this);
	}

public 	WebElement getContactDetailsTextAddr()
{
	return contctDetlsTxt;
}

public String getcontactText()
{
	String text = contctDetlsTxt.getText();
	return text;
}
public void clickDeletBTn()
{
	deleteBtn.click();
}
}
