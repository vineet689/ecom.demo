package com.genericconfig;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import io.cucumber.core.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;


public class MainMethods {
	static Actions action;
	private WebDriver driver= null;
	public static Map<String, Object>pref;
	
	
	public static boolean waitForElementClickable(WebDriver driver, By locator, int time) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
			wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
			return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	
	public static WebDriver launchWebDriver(Scenario scenario, WebDriver driver) throws IOException, MalformedURLException {
		try {
			if(EnvConfig.browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\chromedriver-win64\\chromedriver.exe");  
		        ChromeOptions Option = new ChromeOptions();
		        Map<String, Object> prefs= new HashMap<String, Object>();
		        prefs.put("download.default_directory",  System.getProperty("user.dir")+ File.separator + "externalFiles" + File.separator + "downloadFiles");
		        Option.addArguments("--test-type");
		        Option.addArguments("start-maximized");
		        Option.addArguments("disable-extensions");
		        Option.addArguments("disable-popup-blocking");
		        Option.setExperimentalOption("prefs", prefs);
		        Option.addArguments("--remote-allow-origins=*");
				driver=new ChromeDriver(Option);
				driver.manage().window().maximize();
			}
			else if(EnvConfig.browser.equalsIgnoreCase("headless")) {
				WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--no-sandbox");
				options.addArguments("--remote-allow-origins=*");
				options.addArguments("--disable-dev-shm-usage");
				options.addArguments("--headless");
				driver = new ChromeDriver(options);
		 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				driver.manage().window().maximize();  
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return driver;
		
	}
	public static boolean waitforElementVisibility(WebDriver driver, By locator) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			wait.until(ExpectedConditions.and(ExpectedConditions.presenceOfElementLocated(locator), ExpectedConditions.visibilityOfElementLocated(locator)));
			return true;
		}catch(Exception e) {
			e.getMessage();
			return false;
		}
	}
	
	public static boolean isElementPresent(WebDriver driver, By elemLocator) {
		try {
			driver.findElement(elemLocator);
			waitforElementVisibility(driver, elemLocator);
			return true;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}




	public static String getText(WebDriver driver, By locator) {
		if(waitforElementVisibility(driver, locator)) {
			return driver.findElement(locator).getText().toString();
		}else {
			throw new IllegalStateException("Element " +locator+ "not found.. ");
		}
	}
	
	public static void enterText(WebDriver driver, By locator, String txt) throws InterruptedException {
		if(waitforElementVisibility(driver, locator)) {
			waitforElementVisibility(driver, locator);
			driver.findElement(locator).click();
			Thread.sleep(500);
			driver.findElement(locator).sendKeys(txt);
		}else {
			throw new IllegalStateException("Element " +locator+ "not found.. ");
		}
	}

	   public static void sleepForSecondsToSeeTheAlertWhileTestIsRunning(int seconds) {
	        try {
	            Thread.sleep(seconds * 1000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	    }
	
	
	public static void clickElement(WebDriver driver, By locator) {
		try {
			for(int i=0; i<5; i++) {
				try {
					driver.findElement(locator).click();
					break;
				}catch(StaleElementReferenceException e) {
				}
			}
		}catch(ElementClickInterceptedException e) {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("argument[0].click()", locator);
				}catch(Exception e) {
					e.printStackTrace();
					throw new IllegalStateException("Failed... Object" +locator+ " not found");
				}
			}
	
	
	public static String getTextByJQuery(WebDriver driver, By locator) {
		WebElement myElement = driver.findElement(locator); 
		String actualValue= ((JavascriptExecutor)driver).executeScript("return arguments[0].lastChild.textContent;",myElement).toString();
		return actualValue;
}
	
	public static WebElement findElement(WebDriver driver, By locator) {
		try {
			return driver.findElement(locator);
		}catch(StaleElementReferenceException e) {
			return driver.findElement(locator);
		}
	}
	

	
	
	public static void sleepCode(String slTime) {
		try {
			long l= Long.parseLong(slTime);
			Thread.sleep(l);
		}catch(Exception e) {
	}
	}
	
	public static void launchApplication(WebDriver driver, String url) {
		if(!(url==null)) {
			try {
				driver.get(url);
				System.out.println("WebSite Title is .. : " +driver.getTitle());
			}catch(Exception e) {
				System.out.println("launching website......");
			}
			String pageTitle = driver.getTitle();
			if(!(pageTitle.contains("404 not found") || pageTitle.contains("is not avilable") || pageTitle.contains("Problem loading page"))) {
			}else {
				throw new IllegalStateException("The Website is not launched..");
			}
			}else {
				throw new IllegalStateException("The URL is null");
			}
		}
	



	public static boolean waitForElementVisibility(WebDriver driver, By locator) {
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50)).pollingEvery(Duration.ofMillis(5)).ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.invisibilityOfElementWithText(locator, "Loading..."));
		return true;
	}
	
	
	
	public static String removeSpace(String value) {
		String finalString= value.replaceAll(" ", "");
		return  finalString;
		
	}
	
	

}
