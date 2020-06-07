package com.w2a.appium.base;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;


public class ScreenBase {
	
	
	public AppiumDriver driver;
	
	public WebDriverWait wait;
	
	public ScreenBase(AppiumDriver driver){
		
		this.driver = driver;
		
	}



	
	public void waitforElement(long duration, String locator){
		
		wait = new WebDriverWait(driver, duration);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
	
		
		
	}
	
	
	public void hideKeyboard(){
		
		driver.hideKeyboard();
	}
}
