package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericLib.BaseTest;

public class campaignpage {
	@FindBy(xpath="//td[contains(text(),'Campaigns:')]") private WebElement campaignsText;
	public campaignpage()
	{
		PageFactory.initElements(BaseTest.driver, this);
		
	}
	public WebElement getcampaignpageTextaddr() {
	return campaignsText;
	
	}
}
