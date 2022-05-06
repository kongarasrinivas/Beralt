package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericLib.BaseTest;



public class SalesOrderTab{
	@FindBy(xpath="//td[text()='Calculator']") private WebElement caluclatorAddr;
	
	public SalesOrderTab()
	{
		PageFactory.initElements(BaseTest.driver,this);
	
	}
	public WebElement getcaluclatraddr()
{
		return caluclatorAddr;
	}

}
