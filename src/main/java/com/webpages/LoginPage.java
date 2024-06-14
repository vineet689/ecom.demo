package com.webpages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.actions.ApplicationBooks;
import com.genericconfig.Context;
import com.genericconfig.LocatorConfig;
import com.genericconfig.MainMethods;

import io.cucumber.core.api.Scenario;

public class LoginPage {
	private WebDriver driver;
	private final Context context;
	private Scenario scenario;
	
	public LoginPage(Context context) {
		driver = ApplicationBooks.driver;
		this.context = context;
		this.scenario = scenario;
	}
	
	public void enterUserNameAndPassword(WebDriver driver, String userName, String Password) throws InterruptedException {
		//MainMethods.jsClickElement(driver, LocatorConfig.xpath_username);
		MainMethods.enterText(driver, LocatorConfig.xpath_username, userName);
	//	MainMethods.jsClickElement(driver, LocatorConfig.xpath_password);
		MainMethods.enterText(driver, LocatorConfig.xpath_password, Password);
		MainMethods.clickElement(driver, LocatorConfig.id_loginbutton);
	}
	
	public void launchSMSApp(WebDriver driver) throws InterruptedException{
	try
	{	MainMethods.waitforElementVisibility(driver, LocatorConfig.xpath_appLauncher);
		MainMethods.waitForElementClickable(driver, LocatorConfig.xpath_appLauncher, 30);
		MainMethods.clickElement(driver, LocatorConfig.xpath_appLauncher);
		MainMethods.enterText(driver, LocatorConfig.xpath_inputAppLauncher, "360");
	}catch(IllegalStateException e) {
		MainMethods.waitforElementVisibility(driver, LocatorConfig.xpath_appLauncher);
		MainMethods.waitForElementClickable(driver, LocatorConfig.xpath_appLauncher, 30);
		MainMethods.sleepForSecondsToSeeTheAlertWhileTestIsRunning(10);
		MainMethods.clickElement(driver, LocatorConfig.xpath_appLauncher);
		MainMethods.enterText(driver, LocatorConfig.xpath_inputAppLauncher, "360");
	}
	catch(Exception e) {
		MainMethods.waitforElementVisibility(driver, LocatorConfig.xpath_appLauncher);
		MainMethods.waitForElementClickable(driver, LocatorConfig.xpath_appLauncher, 30);
		MainMethods.sleepForSecondsToSeeTheAlertWhileTestIsRunning(10);
		MainMethods.clickElement(driver, LocatorConfig.xpath_appLauncher);
		MainMethods.enterText(driver, LocatorConfig.xpath_inputAppLauncher, "360");
	}

	}

}
