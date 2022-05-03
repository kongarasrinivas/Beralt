package com.crm.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericLib.BaseTest;

public class AccountsPage {

	@FindBy(xpath = "//td[contains(text(),'Accounts: ')]") private WebElement accountsText; 
	@FindBy(xpath="//input[@value='New Account']") private WebElement newaccountsTab;

	@FindBy(xpath = "//table[@class='secContent']//tr[*]//td[3]") private List<WebElement> allAccountNames;
	@FindBy(xpath="(//table)[11]//tr[1]//td[2]") private WebElement srinivasTabClick;
	public AccountsPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}

	public WebElement getAccountsTextAddress() {
		return accountsText;
	}

	public String getAccountsText() {
		String text = accountsText.getText();
		return text;
	}
	public void clicknewAccounttab() {
		newaccountsTab.click();
	}
	
	public List<WebElement> getAllAccountNames()
	{
		return allAccountNames;
	}
	public void clickSrinuTabClick()
	{
		srinivasTabClick.click();
	}
	
}
