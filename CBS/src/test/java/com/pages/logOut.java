package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BaseTest;
import pom.cmlogin.EditPP_POM;
import pom.cmlogin.GothramPOM;
import pom.cmlogin.ViewProfile_POM;

public class logOut extends BaseTest {
	
	
	
	public static void logoutMethod() throws Throwable {
		
		GothramPOM g = new GothramPOM(driver);
		EditPP_POM e = new EditPP_POM(driver);
		ViewProfile_POM v= new ViewProfile_POM(driver);
		  Actions acc = new Actions(driver);
		
		Thread.sleep(3000);
		try {
			acc.moveToElement(g.getMenu_btn()).build().perform();
		} catch (Exception e2) {
			acc.moveToElement(g.getMenu_btn()).build().perform();
		}
		
		Thread.sleep(2000);
		WebElement logout = driver.findElement(By.xpath("( //a[contains(text(),'Logout')])[1]"));
		acc.moveToElement(logout).build().perform();
		
		Thread.sleep(1000);
		BaseTest.click(logout);
		

	}

}
