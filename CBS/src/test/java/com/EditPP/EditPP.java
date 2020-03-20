package com.EditPP;

import java.awt.Robot;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import base.BaseTest;
import pom.cmlogin.GothramPOM;

public class EditPP extends  BaseTest{
	
	String PP_Gothram;
	String VP_Gothram;
	int k;
	int b=1;
	boolean status;
	WebElement Search_Caste, Search_SubCaste, Search_MotherTongue, Search_Star;
	Select sss, sss1, sss2, sss3, sss4;
	List<WebElement> c,c1,c2,c3, c4;
	String[] array, array1, array2, array3, array4;
	
	@BeforeSuite
	public void setUp() {
		// test=reports.startTest("Divorcee Negative Payment");
		// test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\amuthan\\eclipse-workspace\\CBS\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
	
	}
	
	@Test
	public void SearchCheck() throws Throwable {
			
	GothramPOM g = new GothramPOM(driver);
	Actions acc = new Actions(driver);
	Robot r = new Robot();
	WebDriverWait wait = new WebDriverWait(driver, 30);
	JavascriptExecutor js  = (JavascriptExecutor)driver;
	
	

	Thread.sleep(3000);
	driver.get("https://www.communitymatrimony.com");
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
	BaseTest.click(g.getMatriID());
	BaseTest.typeData(g.getMatriID(), "BRH1393126");
	
	Thread.sleep(1000);
	BaseTest.click(g.getPasswordClear());
	BaseTest.typeData(g.getPassword(), "test4cbs");
	
	Thread.sleep(1000);
	BaseTest.click(g.getLogin_btn());
	
	try {
	Thread.sleep(3000);
	BaseTest.click(g.getInterMediate_page());
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	try {
		BaseTest.click(g.getInterMediate_page1());
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	try {
	Thread.sleep(3000);
	BaseTest.click(driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")));
	} catch (Exception e) {
		
	}
	

	Thread.sleep(3000);
	BaseTest.click(g.getSearch());
	
	Thread.sleep(2000);
	BaseTest.click(g.getAdvanced_Search());
	
/////////////////////////  Caste	
	Thread.sleep(2000);
	for (int i = 2; i < 10; i++) {
		acc.doubleClick(driver.findElement(By.xpath("//*[@id=\"casteTemp\"]/option["+i+"]"))).build().perform();
	}
	
	
	Thread.sleep(2000);
     Search_Caste = g.getCaste_Selected_Value();  	     
     sss = new Select(Search_Caste);
     c = sss.getOptions();
    System.out.println(c);
       System.out.println("lst size"+c.size());
        array=new String[c.size()];
       for (int j = 0; j<c.size(); j++) {

           String f = c.get(j).getText();
         //  System.out.println("string value "+j+" "+f);
           array[j]=f;
           System.out.println("String value after adding in to array : "+array[j]); 

    }
       
 ////////////////////////////////   Sub Caste
       
       Thread.sleep(2000);
       for (int l = 2; l < 10; l++) {
		acc.doubleClick(driver.findElement(By.xpath("//*[@id=\"subcasteTemp\"]/option["+l+"]"))).build().perform();
	}
       
   	Thread.sleep(2000);
     Search_SubCaste = g.getSubcaste_Selected_Value();  	     
     sss1 = new Select(Search_SubCaste);
     c1 = sss1.getOptions();
    System.out.println(c1);
       System.out.println("lst size"+c1.size());
        array1=new String[c1.size()];
       for (int k = 0; k<c1.size(); k++) {

           String f1 = c1.get(k).getText();
         //  System.out.println("string value "+j+" "+f);
           array1[k]=f1;
           System.out.println("String value after adding in to array : "+array1[k]); 

    }
       
	/////////////////////////////////////////   Mother Tongue
       
       Thread.sleep(2000);
       for (int m = 2; m < 10; m++) {
		acc.doubleClick(driver.findElement(By.xpath("//*[@id=\"motherTongueTemp\"]/option["+m+"]"))).build().perform();
	}
       
       
       
      	Thread.sleep(2000);
         Search_MotherTongue = g.getMotherTongue_Selected_Value(); 	     
       sss2 = new Select(Search_MotherTongue);
         c2 = sss2.getOptions();
        System.out.println(c2);
           System.out.println("lst size"+c2.size());
            array2=new String[c2.size()];
           for (int n = 0; n<c2.size(); n++) {

               String f2 = c2.get(n).getText();
             //  System.out.println("string value "+j+" "+f);
               array2[n]=f2;
               System.out.println("String value after adding in to array : "+array2[n]); 

        }
           
//////////////////////////////////////////// STar
           
           Thread.sleep(2000);
           for (int p = 2; p < 10; p++) {
			acc.doubleClick(driver.findElement(By.xpath("//*[@id=\"starTemp\"]/option["+p+"]"))).build().perform();
		}
           
           
        	Thread.sleep(2000);
          Search_Star = g.getStar_Selected_Value(); 	     
             sss3 = new Select(Search_Star);
            c3 = sss3.getOptions();
            System.out.println(c3);
               System.out.println("lst size"+c3.size());
                array3=new String[c3.size()];
               for (int q = 0; q<c3.size(); q++) {

                   String f3 = c3.get(q).getText();
                 //  System.out.println("string value "+j+" "+f);
                   array3[q]=f3;
                   System.out.println("String value after adding in to array : "+array3[q]); 

            }
               
               
               Thread.sleep(5000);
               BaseTest.click(g.getSearch_btn());
               
               Thread.sleep(2000);
              List<WebElement> aaaaa = driver.findElements(By.xpath("//input[@value='Modify Search']"));
               if (aaaaa.size()>0) {
            	   
            	   Thread.sleep(2000);
            	   BaseTest.click(g.getModify_Search());
            	   
            	   
            	   Thread.sleep(2000);
            		BaseTest.click(g.getAdvanced_Search());
            		
            	/////////////////////////  Caste	
            		Thread.sleep(2000);
            		for (int i = 1; i <=1; i++) {
            			acc.doubleClick(driver.findElement(By.xpath("//*[@id=\"casteTemp\"]/option["+i+"]"))).build().perform();
            		}
            		
            		
            		Thread.sleep(2000);
            	     Search_Caste = g.getCaste_Selected_Value();  	     
            	     sss = new Select(Search_Caste);
            	    c = sss.getOptions();
            	    System.out.println(c);
            	       System.out.println("lst size"+c.size());
            	       array=new String[c.size()];
            	       for (int j = 0; j<c.size(); j++) {

            	           String f = c.get(j).getText();
            	         //  System.out.println("string value "+j+" "+f);
            	           array[j]=f;
            	           System.out.println("String value after adding in to array : "+array[j]); 

            	    }
            	       
            	 ////////////////////////////////   Sub Caste
            	       
            	       Thread.sleep(2000);
            	       for (int l = 1; l <=1; l++) {
            			acc.doubleClick(driver.findElement(By.xpath("//*[@id=\"subcasteTemp\"]/option["+l+"]"))).build().perform();
            		}
            	       
            	   	Thread.sleep(2000);
            	     Search_SubCaste = g.getSubcaste_Selected_Value();  	     
            	     sss1 = new Select(Search_SubCaste);
            	   c1 = sss1.getOptions();
            	    System.out.println(c1);
            	       System.out.println("lst size"+c1.size());
            	     array1=new String[c1.size()];
            	       for (int k = 0; k<c1.size(); k++) {

            	           String f1 = c1.get(k).getText();
            	         //  System.out.println("string value "+j+" "+f);
            	           array1[k]=f1;
            	           System.out.println("String value after adding in to array : "+array1[k]); 

            	    }
            	       
            		/////////////////////////////////////////   Mother Tongue
            	       
            	       Thread.sleep(2000);
            	       for (int m = 1; m <=1; m++) {
            			acc.doubleClick(driver.findElement(By.xpath("//*[@id=\"motherTongueTemp\"]/option["+m+"]"))).build().perform();
            		}
            	       
            	       
            	       
            	      	Thread.sleep(2000);
            	       Search_MotherTongue = g.getMotherTongue_Selected_Value(); 	     
            	         sss2 = new Select(Search_MotherTongue);
            	         c2 = sss2.getOptions();
            	        System.out.println(c2);
            	           System.out.println("lst size"+c2.size());
            	            array2=new String[c2.size()];
            	           for (int n = 0; n<c2.size(); n++) {

            	               String f2 = c2.get(n).getText();
            	             //  System.out.println("string value "+j+" "+f);
            	               array2[n]=f2;
            	               System.out.println("String value after adding in to array : "+array2[n]); 

            	        }
            	           
            	//////////////////////////////////////////// STar
            	           
            	           Thread.sleep(2000);
            	           for (int p = 1; p <=1; p++) {
            				acc.doubleClick(driver.findElement(By.xpath("//*[@id=\"starTemp\"]/option["+p+"]"))).build().perform();
            			}
            	           
            	           
            	        	Thread.sleep(2000);
            	            Search_Star = g.getStar_Selected_Value(); 	     
            	             sss3 = new Select(Search_Star);
            	             c3 = sss3.getOptions();
            	            System.out.println(c3);
            	               System.out.println("lst size"+c3.size());
            	               array3=new String[c3.size()];
            	               for (int q = 0; q<c3.size(); q++) {

            	                   String f3 = c3.get(q).getText();
            	                 //  System.out.println("string value "+j+" "+f);
            	                   array3[q]=f3;
            	                   System.out.println("String value after adding in to array : "+array3[q]); 

            	            }
            	               
            	               
            	               Thread.sleep(2000);
            	               BaseTest.click(g.getSearch_btn());
            	   
            	   
				
			} else {

				System.out.println("Search Result Profile Displayed");
			}
           
               
               

///////////////////////////////////////////////////////////////////////
               Thread.sleep(10000);
       		String Count = g.getSearch_Results_Count().getText();
       		int Res = Integer.parseInt(Count);
       		System.out.println("Total Result : " + Res);
       		
       		int scroll = (Res/10);
       		int ScrollCount = (int) Math.ceil(scroll);
       		System.out.println(ScrollCount);
       		Thread.sleep(2000);
       		String Parent = driver.getWindowHandle();
       	//	BaseTest.click(g.getProfile_Click_toGo_VP());
       		
       		
       		
       		/////////////////
       		Thread.sleep(3000);
       		for (int i = 0; i <=ScrollCount; i++) {
       			
       			Thread.sleep(2000);
       			BaseTest.click(g.getProfile_Click_toGo_VP());
       		
       		/////////  
       		Thread.sleep(2000);
       		Set<String> Child = driver.getWindowHandles();
       		for (String handle : Child) {
       			if (!Parent.equals(handle)) {
       				Thread.sleep(1000);
       				driver.switchTo().window(handle);
       			}
       				}
       		
       		Thread.sleep(3000);
       		js.executeScript("window.scrollBy(0,350)");
       		
       		Thread.sleep(3000);
       		js.executeScript("window.scrollBy(0,350)");
       		
       		Thread.sleep(3000);
       		js.executeScript("window.scrollBy(0,350)");
       		
       		Thread.sleep(5000);
       		 VP_Gothram = driver.findElement(By.xpath("(//span[contains(text(),'Gothra')])[1]//following::span[3]")).getText();
       		System.out.println(VP_Gothram);
       		
       		
       		Thread.sleep(2000);
       		String VP_MotherTongue = driver.findElement(By.xpath("(//span[contains(text(),'Mother Tongue')]//following::span[2])[1]")).getText();
       		System.out.println(VP_MotherTongue);
       		
       		Thread.sleep(2000);
       		String VP_Star = driver.findElement(By.xpath("( //span[contains(text(),'Star')]//following::span[2])[2]")).getText();
       		System.out.println(VP_Star);
       		
       		
       		//************************************************************************


       		
       		for (int k = 0; k < array.length; k++) {


       			
       			Thread.sleep(3000);
       			if (array2.equals("Any")) {
					status=true;
					System.out.println("The Mother Tongue Value is Any");
					break;
				}else if (array2[k].equals(VP_MotherTongue)) {
       				status=true;
       				System.out.println(k +" : MotherTongue Matches "+array2[k]+" with opposite profile Mother Tongue "+VP_MotherTongue);
       				break;
       			} else {
       				
       				System.err.println(k +" : MotherTongue  Not Matches with opposite profile");

       			}
       			
       			Thread.sleep(3000);
       			if (array3.equals("Any")) {
					status=true;
					System.out.println("The Mother Tongue Value is Any");
					break;
				}else
       			if (array3[k].equals(VP_Star)) {
       				status=true;
       				System.out.println(k +" : Star Matches "+array3[k]+" with opposite profile Star"+VP_Star);
       				break;
       			} else {
       				
       				System.err.println(k +" : Star  Not Matches with opposite profile Star");

       			}
       			
       			
       		
       			
       			
       		}
       		
       	
       		
       		driver.close();
       		Thread.sleep(3000);
       		driver.switchTo().window(Parent);
       		
       		Thread.sleep(2000);
       		driver.navigate().refresh();
       		
       		Thread.sleep(5000);
       		
       		}  
               
           
}
	
}
