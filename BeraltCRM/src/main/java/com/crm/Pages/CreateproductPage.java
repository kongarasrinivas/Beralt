package com.crm.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.GenericLib.BaseTest;
import com.crm.GenericLib.webDriverComonLib;

public class CreateproductPage {
@FindBy(xpath="//input[@name=\"property(Product Code)\"]")private WebElement productCodeTxtbx;
@FindBy(xpath="//select[@name=\"property(Product Category)\"]")private WebElement productCatageryDrp;
@FindBy(xpath="//input[@name=\"property(Product Name)\"]")private WebElement productNameTxt;
@FindBy(xpath="//select[@name='property(Manufacturer)']") private WebElement manufactureDrp;
@FindBy(xpath="//td[contains(text(),'Create Product')]")private WebElement createPrductTxt;
@FindBy(xpath="//input[@value=\"Save\"]") private WebElement   saveBtnClick;

 public CreateproductPage() 
{
	PageFactory.initElements(BaseTest.driver,this);
}
 public void createProduct(String prdctCodeBx,String prdctCatageryDrp,String prdctNameTxtBx,String manufctureDrp){
	 webDriverComonLib wlib = new webDriverComonLib();
	 productCodeTxtbx.sendKeys(prdctCodeBx);
	 wlib.selectOption(prdctCatageryDrp, productCatageryDrp);
	 productNameTxt.sendKeys(prdctNameTxtBx);
	 wlib.selectOption(manufctureDrp,manufactureDrp);	 
	 saveBtnClick.click();
 }
 public WebElement getCreateprdctTxtaddr()
 {
	 return createPrductTxt;
	 
 }
 public String getprdcttxt()
 {
	 String text = createPrductTxt.getText();
	 return text;
 }
 
}
