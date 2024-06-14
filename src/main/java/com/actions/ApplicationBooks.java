package com.actions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.genericconfig.Context;
import com.genericconfig.EnvConfig;
import com.genericconfig.LocatorConfig;
import com.genericconfig.MainMethods;
import com.webpages.LoginPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.cucumber.core.api.Scenario;

public class ApplicationBooks {
	public static WebDriver driver;
	@SuppressWarnings("unused")
	private final Context context;
	@SuppressWarnings("unused")
	private Scenario scenario;
	@SuppressWarnings("unused")
	private final LoginPage loginPage;
	
	public ApplicationBooks(Context context,LoginPage loginPage) {
		this.context = context;
		this.loginPage = loginPage;
		
	}
	@Before
	public void before(Scenario scenario) {
		this.scenario=scenario;
		
	}
	
	@Before
	public void setup(Scenario scenario) throws Throwable, IOException, Exception{
		EnvConfig.getTestData();
		LocatorConfig.getLocatorData();
		if(EnvConfig.browser==null) {
		}else {
			try {
				driver=MainMethods.launchWebDriver(scenario, driver);
				System.out.println("Driver: " +driver);
			}catch(Exception e) {
				System.out.println("Somthing wrong please check again...");
				throw new IllegalStateException("Somthing went wrong while opening window..." +"\n" +e.getMessage()+"\n" +e.getStackTrace());
				
			}
		}
		try {
			MainMethods.launchApplication(driver, EnvConfig.appUrl);
			if(driver== null) {
				System.out.println("ReLaunching the browser");
				MainMethods.launchApplication(driver, EnvConfig.appUrl);
			}else {
				System.out.println("Driver Value is not relaunch... "+driver);
			}
		}catch(Exception e) {
			System.out.println("Somthing went wrong....");
			throw new IllegalStateException("Somthing went wrong.... while opening browser" +e.getMessage());
				
			}
		}
	
	@After(order =1)
		public void quit() {
			if(EnvConfig.browser==null) {
				System.out.println("No Browser..");
			}else {
				try {
					Thread.sleep(500);
					driver.quit();
				}catch(Exception e) {
					e.printStackTrace();
				}
		
	}
	}
}
