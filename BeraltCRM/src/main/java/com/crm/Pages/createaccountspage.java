package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericLib.BaseTest;
import com.crm.GenericLib.webDriverComonLib;;

public class createaccountspage {
	@FindBy(name = "property(Account Name)")
	private WebElement accNameTextbox;
	@FindBy(name = "property(Account Site)")
	private WebElement accSiteTextbox;
	@FindBy(name = "property(Account Type)")
	private WebElement accountTypedrop;
	@FindBy(name = "property(Rating)")
	private WebElement propertyRatedrop;
	@FindBy(name = "property(Ownership)")
	private WebElement ownerShipdrop;
	@FindBy(name = "Button")
	private WebElement saveButton;

	@FindBy(xpath = "//img[@title='Account Name Lookup']")
	private WebElement parentAccountImage;

	@FindBy(xpath = "(//table)[4]//tr[2]//td[1]")
	private WebElement accountNameLink;

	public createaccountspage() {
		PageFactory.initElements(BaseTest.driver, this);
	}

	public void createNewAcc(String accname, String accsitename, String accType, String prprtydrp, String ownerdrop) {
		webDriverComonLib wlib = new webDriverComonLib();

		accNameTextbox.sendKeys(accname);
		accSiteTextbox.sendKeys(accsitename);
		wlib.selectOption(accType, accountTypedrop);
		wlib.selectOption(prprtydrp, propertyRatedrop);
		wlib.selectOption(ownerdrop, ownerShipdrop);

		saveButton.click();

	}

	public WebElement getParentAccountImage() {
		return parentAccountImage;
	}

	public void clickParentAccountImage() {
		parentAccountImage.click();
	}

	public WebElement getAccountnameLink() {
		return accountNameLink;
	}

}
