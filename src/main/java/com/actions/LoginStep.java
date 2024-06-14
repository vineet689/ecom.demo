package com.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.genericconfig.Context;
import com.genericconfig.EnvConfig;
import com.genericconfig.LocatorConfig;
import com.genericconfig.MainMethods;
import com.webpages.LoginPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	private WebDriver driver;
	LoginPage loginPage;
	
	ApplicationBooks hooks;
	private Context context;
	
	public LoginStep(LoginPage loginPage, Context context) {
		this.loginPage = loginPage;
		driver = ApplicationBooks.driver;
		this.context = context;
		
	}
	
	@Given("^I launch the application$")
	public  void launchLoginPage() {
	  driver.get("https://www.saucedemo.com/");
	}

	
	@When("^I enter Login credentials with \"(.*?)\" and \"(.*?)\"$")
	public void enterCredentials(String usr, String pwd) throws InterruptedException {
		loginPage.enterUserNameAndPassword(driver, EnvConfig.userName, EnvConfig.password);
	}
	
	@And("^I click login button to login successfully$")
	public void clickLoginButtonAndVerifyLogin() {
		
		
	}
	
	@When("^I launch 360SMS application$")
	public void launch360SMSapp() throws InterruptedException {
	      loginPage.launchSMSApp(driver);
	      //driver.get(EnvConfig.reLaunchApp);
			}


}
