package com.ABCP_Library;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {


	public static WebDriver driver;
	public static FirefoxOptions firefoxOption;
	public static FirefoxProfile ffprofile;
	public static EdgeOptions Edgeoption;
	public static WebDriver InitializeBrowser(String browser) throws IOException {
		WebDriver driver = null;
		ChromeOptions option;
		
		try {
			
			if(browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				option = new ChromeOptions();
				
				option.addArguments("disable-infobars");
				option.addArguments("--disable-notifications");
				option.addArguments("--disable-extensions");
				option.addArguments("--disable-gpu");
				option.addArguments("--disable-dev-shm-usage");
				option.addArguments("--no-sandbox");
				option.addArguments("--remote-allow-origins=*");
				option.addArguments("--window-size=1920,1080");
				
				driver = new ChromeDriver(option);
				
				if(Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
					System.out.println("Desktop browsing is supported on this platform.");
				}else {
					System.err.println("Desktop browsing is not supported on this platform.");
				}
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(UtilityClass.GetData("url"));
				driver.getTitle();
				System.out.println(driver.getCurrentUrl());
				System.out.println("chrome driver started Succhessfully..!");
			
			}else if (browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				
				firefoxOption = new FirefoxOptions();				
				driver = new FirefoxDriver(firefoxOption);	
				ffprofile = new FirefoxProfile();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				ffprofile.setPreference("dom.webnotifications.enable", false);
				driver.get(UtilityClass.GetData("url"));
				
				driver.manage().deleteAllCookies();
				driver.getTitle();
				System.out.println(driver.getCurrentUrl());

				System.out.println("Firefox driver started successfully..!");
			}else if (browser.equalsIgnoreCase("edge")) {
				
				WebDriverManager.edgedriver().setup();
				Edgeoption = new EdgeOptions();
				
				driver = new EdgeDriver(Edgeoption);
				Edgeoption.addArguments("start-maximized"); // open Browser in maximized mode
				Edgeoption.addArguments("disable-infobars"); // disabling infobars
				Edgeoption.addArguments("--disable-notification");
				Edgeoption.addArguments("--disable-extensions"); // disabling extensions
				Edgeoption.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
				Edgeoption.addArguments("--remote-debugging-port=9222");
				Edgeoption.addArguments("--remote-allow-origins=*");
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(UtilityClass.GetData("url"));
				
				driver.manage().deleteAllCookies();
				driver.getTitle();
				System.out.println(driver.getCurrentUrl());
				System.out.println("Edge driver started successfully..!");
				
			}
			
		}catch (IllegalStateException e) {
			System.out.println(e);
		}		
		
		return driver;
		
	}
	
	
	
}
