package com.sel_cucum.SeleniumCucumber.webUtils.controllers;

import org.openqa.selenium.WebDriver;

public interface WebControllers {

	WebDriver launchBrowser();
	void getUrl();
	void maximize();
	void wimplicitWait();
	void closeBrowser();
	void explicit();
	
	
}
