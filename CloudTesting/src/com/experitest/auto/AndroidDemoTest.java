package com.experitest.auto;

import java.net.URL;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;


public class AndroidDemoTest extends BaseTest {
	protected AndroidDriver<AndroidElement> driver = null;
	
	@BeforeMethod
	@Parameters("deviceQuery")
	public void setUp(@Optional("@os='android'") String deviceQuery) throws Exception{
		init(deviceQuery);
		// Init application / device capabilities
		//dc.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank/.LoginActivity");
	//	dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
	//	dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
		dc.setCapability(MobileCapabilityType.APP, "cloud:com.community.matrimony/com.domaininstance.ui.activities.Splash");
		dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.community.matrimony");
		dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.domaininstance.ui.activities.Splash");
		dc.setCapability("appVersion", "4.8");
		dc.setCapability("instrumentApp", true);
		dc.setCapability("testName", "AndroidDemoTest");
		driver = new AndroidDriver<>(new URL(getProperty("url",cloudProperties) + "/wd/hub"), dc);
	}
	
	@Test
	public void test(){
		
		driver.findElement(in.Repo.obj("//*[@id='reg_login_button']")).click();
		
		driver.findElement(in.Repo.obj("Login_Details.Matrimony_ID___Email_ID")).sendKeys("EZH710533");
		
		
		driver.findElement(in.Repo.obj("Login_Details.Password")).sendKeys("cbstest");
		
		driver.findElement(in.Repo.obj("Login_Details.Login")).click();
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
