package com.crm.GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//Github Changes
public abstract class BaseTest implements Iautoconsts {
 
	public static WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws Throwable
	{
		filelib flib=new filelib();
		String browserName = flib.readPropertyData(PROP_PATH,"browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty(CHROME_KEY, CHROME_VALUE);
			driver=new ChromeDriver();
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Enter proper browser name");
		}
		
		driver.manage().window().maximize();
		String appUrl = flib.readPropertyData(PROP_PATH, "url");
		driver.get(appUrl);
		
		webDriverComonLib wlib=new webDriverComonLib();
		wlib.waitForPageTitle(flib.readPropertyData(PROP_PATH,"loginTitle"));
		
		wlib.verify(flib.readPropertyData(PROP_PATH,"loginTitle"),wlib.getpageTitle(),"Login page");
	}
	
	@AfterClass(enabled = false)
	public void closeBrowser()
	{
		driver.quit();
	}
	}


