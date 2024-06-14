package com.genericconfig;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class DataMgr {

	private static String filePath = "/conf/";
	private static String dataFilePath="/data/";
	public static JSONParser parser = new JSONParser();

	
	public static String fetchObject(String  textValue) throws Throwable{
		JSONObject jsonObject = getJSONURL("ObjectRepository.json");
		String text = (String) jsonObject.get(textValue);
		return text;
	}
	
	public static JSONObject getJSONURL(String File)throws FileNotFoundException, IOException, ParseException  {
		String basePath = new File("").getAbsolutePath();
		Object obj= parser.parse(new FileReader(basePath +filePath+ File));
		JSONObject jsonObject= (JSONObject) obj;
		return jsonObject;
	}
	
	
	public static JSONObject getJSONDataURL(String File)throws FileNotFoundException, IOException, ParseException {
		String basePath = new File("").getAbsolutePath();
		Object obj= parser.parse(new FileReader(basePath +dataFilePath+ File));
		JSONObject jsonObject= (JSONObject) obj;
		return jsonObject;
	}
	
	
}