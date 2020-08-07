package stepDefinitions;

import org.openqa.selenium.WebDriver;

import com.sel_cucum.SeleniumCucumber.webPages.LoginClass;
import com.sel_cucum.SeleniumCucumber.webUtils.implementation.WebImplementations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	public WebDriver driver;
	WebImplementations web;
	LoginClass  login;
	public Steps() {
		web = new WebImplementations();
		this.driver = web.launchBrowser();
		login = new LoginClass(driver);
	}
	@Given("^user Launches Browser$")
	public void launchBrwser() throws Throwable{
		
		this.driver = web.launchBrowser();
	}

	
	@When("^user enters Url$")
	public void enter_url() {
		web.getUrl();
	}
	
	@Then("^maximise browser$")
	public void maximise() {
		web.maximize();
	}
	
	@And("^wait for page load$")
	public void loadPage() {
		//web.im
	}
	@Then("^user clicks on login$")
	public void clickLogin() {
		login.LoginButton.click();
	}
	
	@Then("^user enters username \"([^\"]*)\"$")
	public void enterUsername(String username) {
		web.explicit();
		login.UserName.sendKeys(username);
	}
	
	@And("^close browser$")
	public void closeBrowser() {
		web.closeBrowser();
	}
}
