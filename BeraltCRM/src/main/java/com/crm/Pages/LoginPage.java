package com.crm.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericLib.BaseTest;

public class LoginPage {
	@FindBy(id="userName") private WebElement untb;
	@FindBy(id="passWord") private WebElement pwtb;
	@FindBy(xpath="//input[@title='Sign In']") private WebElement signinbtn;
public LoginPage() {
	PageFactory.initElements(BaseTest.driver, this);
}
public void login(String un,String pw)
{
	untb.sendKeys(un);
	pwtb.sendKeys(pw);
	signinbtn.click();
}
public WebElement getuntb() {
	return untb;
}
public  WebElement getpwtb() {
	return pwtb;
}
public WebElement getLoginbtn()
{
	return signinbtn;
}
public void typeun(String un)
{
	untb.sendKeys(un);
}
public void typepw(String pw)
{
	pwtb.sendKeys(pw);
}
public void clickloginbtn()
{
	signinbtn.click();
}








}


