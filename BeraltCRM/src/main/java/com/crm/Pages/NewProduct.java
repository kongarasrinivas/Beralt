package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericLib.BaseTest;

public class NewProduct {
	@FindBy(xpath="//input[@value=\"New Product\"]")private WebElement newProductTab;
@FindBy(xpath="//td[contains(text(),'Products:')]") private WebElement newProductTxt;

public NewProduct()
{
	PageFactory.initElements(BaseTest.driver,this);
}

public void ClickNewProductTab()
{
	newProductTab.click();
}
public WebElement getProducttxtaddr()
{
	return newProductTxt;
	
}
public String getPotentailTxtAddr()
{
	String text = newProductTxt.getText();
	return text;
			
	
}
}




