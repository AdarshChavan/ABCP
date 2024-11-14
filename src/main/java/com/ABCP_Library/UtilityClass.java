package com.ABCP_Library;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UtilityClass {
	
	public static WebDriver driver;

	public UtilityClass(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
	
	
	
	public static String GetData(String key) throws IOException {
		FileInputStream file = new FileInputStream("A:\\Eclipse\\Automation_WorkSpace\\ABCP_TestNG\\Properties.properties");
		Properties prop = new Properties();
		
		prop.load(file);
		
		String value = prop.getProperty(key);
		return value;
	}

}
