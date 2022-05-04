package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesOrderTab {
	@FindBy(xpath="//td[text()='Calculator']") private WebElement caluclatorAddr;
	 
	public WebElement getcaluclatraddr()
	{
		return caluclatorAddr;
	}

}
