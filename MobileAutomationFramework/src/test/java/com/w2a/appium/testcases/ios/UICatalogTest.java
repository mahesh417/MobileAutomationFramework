package com.w2a.appium.testcases.ios;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.w2a.appium.base.TestBase;
import com.w2a.appium.pages.ios.StrykerScreen;
import com.w2a.appium.pages.ios.UICatalogScreen;



public class UICatalogTest extends TestBase {
	
	@BeforeTest
	public void init(){
		
		ucs = new UICatalogScreen(driver);
		
	}
	
	@Test(priority=1)
	public void SwitchTest() throws InterruptedException{
	
		ucs.handleSwitches();
		
	}
	
	@Test(priority=2)
	public void SliderTest() throws InterruptedException{
	
		ucs.handleSliders();
		
	}
	
	
	@Test(priority=3)
	public void SteppersTest() throws InterruptedException{
	
		ucs.handleSteppers();
		
	}
	
	

}
