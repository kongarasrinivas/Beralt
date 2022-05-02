package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericLib.BaseTest;

public class potentialpage {
	@FindBy(xpath = "//td[contains(text(),'Potentials: ')]")private WebElement potentialPageText;
	@FindBy(xpath="//input[@value=\"New Potential\"]") private WebElement newPotentialTAb;
	public potentialpage()
	{
		PageFactory.initElements(BaseTest.driver, this);

	}
	public WebElement getpotentialPageTextaddr()
	{
		return potentialPageText;
	}
	public String getPotentialText()
	{
		String text = potentialPageText.getText();
		return text;
	}
	public void clicknewPotentialtab()
	{
		newPotentialTAb.click();
	}
}
