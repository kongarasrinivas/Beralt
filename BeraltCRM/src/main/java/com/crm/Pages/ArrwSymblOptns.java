package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericLib.BaseTest;

public class ArrwSymblOptns {
	@FindBy(xpath="//a[text()='New Case']") private WebElement newCaseBtn;
	
	public ArrwSymblOptns()
	{
		PageFactory.initElements(BaseTest.driver,this);
	}
	public void clickNewcaseBtn()
	{
		newCaseBtn.click();
	}

}
