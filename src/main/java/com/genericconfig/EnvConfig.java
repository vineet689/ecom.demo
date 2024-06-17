package com.genericconfig;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import io.restassured.RestAssured;

public class EnvConfig {
	public static String appUrl= "https://www.saucedemo.com/";
	public static String userName= "standard_user";
	public static String password= "secret_sauce";
	public static String EnvInfo;
	public static String jsonFileType;
	public static String usernameTextbox;
	public static String browser= "headless";
	public static String Device;
	public static String Env;
	public static String siteUrl;
	public static String browserType;
	public static String xtrass;
	public static void getTestData() throws Throwable{
		if(EnvInfo !=null) {
			jsonFileType = "TestData.json";
		}else {
			jsonFileType = "TestData.json";
		}
	System.out.println("Test Data File Loaded.... : " +jsonFileType+ "\n");
	JSONObject jsonObject = DataMgr.getJSONDataURL(jsonFileType);
	usernameTextbox = (String) jsonObject.get("Username");
	}
public static void getEnvData()throws FileNotFoundException, IOException, ParseException {
	Device = System.getProperty("device");
	browserType = System.getProperty("browser");
	Env = System.getProperty("env");
	siteUrl = System.getProperty("siteurl");
	System.out.println("Site URL is: " +siteUrl);
}
}