package com.sel_cucum.SeleniumCucumber.webUtils.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sel_cucum.SeleniumCucumber.webUtils.BrowserUtils;
import com.sel_cucum.SeleniumCucumber.webUtils.controllers.WebControllers;

public class WebImplementations implements WebControllers {

	
	
	public  WebDriver driver;
	
	public WebDriver launchBrowser() {
		this.driver = BrowserUtils.getInstance();
		return driver;
	}

	public void getUrl() {
		driver.get("http://www.nnnow.com");
		
	}

	public void maximize() {
		driver.manage().window().maximize();
		
	}

	public void wimplicitWait() {
		// TODO Auto-generated method stub
		
	}

	public void closeBrowser() {
		driver.close();
		
	}

	public void explicit() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		
	}

}
