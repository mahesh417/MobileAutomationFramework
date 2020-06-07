package com.w2a.appium.base;

import java.io.IOException;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.w2a.appium.pages.ios.StrykerScreen;
import com.w2a.appium.pages.ios.UICatalogScreen;
import com.w2a.appium.utils.CommonUtils;
import com.w2a.appium.utils.ExcelReader;

public class TestBase {
	

	public static AppiumDriver driver;
	public static StrykerScreen str;
	public static UICatalogScreen ucs;
	public static String loadPropertyFile = "IOS_UICatalog.properties";
	
	
	public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"/src/test/resources/properties/testdata.xlsx");
	public static Logger log = Logger.getLogger("devpinoyLogger");
	@BeforeSuite
	public void setUp() throws IOException, InterruptedException{
		
		if(driver==null){
			
			log.debug("Appium server started");	
	
		if(loadPropertyFile.startsWith("IOS")){
			
			log.debug("Starting on IOS");
			CommonUtils.loadIOSConfigProp(loadPropertyFile);
			CommonUtils.setIOSCapabilities();
			driver = CommonUtils.getIOSDriver();
		
		}else if(loadPropertyFile.startsWith("Android")){
			
			log.debug("Starting on Android");
			CommonUtils.loadAndroidConfigProp(loadPropertyFile);
			CommonUtils.setAndroidCapabilities();
			driver = CommonUtils.getAndroidDriver();
		}
		
		
		
		}
		
	}
	
	@AfterSuite
	public void tearDown() throws IOException{
		
		driver.quit();
		
		
	}

}
