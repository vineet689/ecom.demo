package com.genericconfig;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LocatorConfig {
public static By xpath_username;
public static By xpath_password;
public static By id_loginbutton;
public static By xpath_appLauncher;
public static By xpath_inputAppLauncher;
public static By idlocatoraddtocartTo;
public static By xpathitem_priceBeforeAdd;
public static By xpath_shopingCartbadge;
public static By id_removebuttonwhileaddtocart;
public static By xpath_inventryitempricecheckout;

public static By xpath_inventryitemqntycheckout;
public static By xpath_iframe;
public static By id_checkoutbutton;
public static By id_label_firstNameCheckout;
public static By id_label_lastNameCheckout;
public static By id_label_postalCodeCheckout;

public static By id_continuebutton;
public static By id_cancelbutton;
public static By xpath_errormsg;
public static By xpath_totalamtCheckout;
public static By xpath_subtotalamtCheckout;
public static By xpath_taxamtCheckout;
public static By id_checkoutFinish;


	public static By bySpanText(String text) {
		return By.xpath("//span[text()='"+text+"']");
	}
	
	public static  By byDivText(String text) {
		return By.xpath("//div[text()='"+text+"']");
	}
	
	public  static By byTitle(String text) {
		return By.xpath("//a[@title='"+text+"']");
	}
	
	public static void getLocatorData() throws Throwable{
		JSONObject jsonObject = DataMgr.getJSONURL("Repo.json");
		
		xpath_username = By.id((String) jsonObject.get("id_username"));
		xpath_password = By.id((String) jsonObject.get("id_password"));
		id_loginbutton = By.id((String) jsonObject.get("id_loginbutton"));
	
		//xpath_appLauncher = By.cssSelector((String) jsonObject.get("xpath_appLauncher"));
		idlocatoraddtocartTo = By.id((String) jsonObject.get("idlocatoraddtocartTo"));
		xpathitem_priceBeforeAdd =By.xpath((String)jsonObject.get("xpathitem_priceBeforeAdd"));
		xpath_shopingCartbadge = By.xpath((String) jsonObject.get("xpath_shopingCartbadge"));
		id_removebuttonwhileaddtocart =By.id((String)jsonObject.get("id_removebuttonwhileaddtocart"));
		
		xpath_inventryitempricecheckout =By.xpath((String)jsonObject.get("xpath_inventryitempricecheckout"));
		xpath_inventryitemqntycheckout =By.xpath((String)jsonObject.get("xpath_inventryitemqntycheckout"));
		id_checkoutbutton = By.id((String) jsonObject.get("id_checkoutbutton"));
		id_label_firstNameCheckout = By.id((String) jsonObject.get("id_label_firstNameCheckout"));
		id_label_lastNameCheckout =By.id((String) jsonObject.get("id_label_lastNameCheckout"));
		id_label_postalCodeCheckout = By.id((String) jsonObject.get("id_label_postalCodeCheckout"));
		id_continuebutton = By.id((String) jsonObject.get("id_continuebutton"));
		
		id_cancelbutton = By.id((String) jsonObject.get("id_cancelbutton"));
		xpath_errormsg = By.xpath((String) jsonObject.get("xpath_errormsg"));
		xpath_totalamtCheckout = By.xpath((String) jsonObject.get("xpath_totalamtCheckout"));
		xpath_subtotalamtCheckout = By.xpath((String) jsonObject.get("xpath_subtotalamtCheckout"));
		
		xpath_taxamtCheckout= By.xpath((String) jsonObject.get("xpath_taxamtCheckout"));
		id_checkoutFinish= By.id((String) jsonObject.get("id_checkoutFinish"));
		
}
}
