package SprintTask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;
import pom.cmlogin.GothramPOM;

public class Who_View_Group extends BaseTest {
	 WebDriver driver;
     String Requested_Id = null;
     String requested_deatils = null;
     String oppid;
     int page_cou;

     @Test
     public void viewpro() throws Throwable {
             System.setProperty("webdriver.chrome.driver",".//Driver\\chromedriver.exe");
             ChromeOptions options = new ChromeOptions();
             options.addArguments("--disable-notifications");

             driver = new ChromeDriver(options);
             
             
             for (int i = 1; i <=15; i++) {
				
			
             
             driver.get("https://www.communitymatrimony.com");
             SoftAssert asrt = new SoftAssert();
             GothramPOM g = new GothramPOM(driver);
             Actions acc = new Actions(driver);
            
             driver.manage().window().maximize();
             JavascriptExecutor js = (JavascriptExecutor) driver;

           //  try {
            	 
            	 Thread.sleep(1000);
         		BaseTest.click(g.getMatriID());
         	//	String MatriID = BaseTest.getExcelData("WVM", 1, i);
         		BaseTest.typeData(g.getMatriID(), BaseTest.getExcelData("WVM", i, 4));
         		
         		Thread.sleep(1000);
         		BaseTest.click(g.getPasswordClear());
         		BaseTest.typeData(g.getPassword(), BaseTest.getExcelData("WVM", i, 5));
         		
         		Thread.sleep(1000);
         		BaseTest.click(g.getLogin_btn());
                     /*Base.click(i.getMatriId());
                     Base.typeData(i.getMatriId(),
"KMC451597");//KMC451599

                     Base.click(i.getPaswwordclr());
                     Base.typeData(i.getPassword(), "cbstest");

                     Base.click(i.getLoginbtn());*/
             
             ////////////// Intermediate Pages
Thread.sleep(3000);
             try {
                     WebElement photo_add =driver.findElement(By.xpath("/html/body/div[2]/a"));
                     if (photo_add.isDisplayed()) {
                             photo_add.click();
                             driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
                             driver.findElement(By.xpath("//*[@id=\"reason3\"]")).click();
                             driver.findElement(By.xpath("//*[@id=\"skipphotoclick\"]")).click();

                     }

             } catch (Exception e) {
                     System.out.println("Photo Page Skipped");
             }
             Thread.sleep(3000);
             try {
                     WebElement skip_matches =driver.findElement(By.xpath("//a[contains(text(),'Skip to Daily Matches >>')]"));
                     if (skip_matches.isDisplayed()) {
                             skip_matches.click();

                     }
             } catch (Exception e) {
                     System.out.println("Intermediate pages handled");
             }

             try {
                 WebElement skip_matches =driver.findElement(By.xpath("//a[contains(text(),'Skip to Matrimony >>')]"));
                 if (skip_matches.isDisplayed()) {
                         skip_matches.click();

                 }
         } catch (Exception e) {
                 System.out.println("Intermediate pages handled");
         }
             
             try {
                 WebElement skip_matches =driver.findElement(By.xpath("//a[contains(text(),'Skip to My Matrimony >>')]"));
                 if (skip_matches.isDisplayed()) {
                         skip_matches.click();

                 }
         } catch (Exception e) {
                 System.out.println("Intermediate pages handled");
         }
             
             Thread.sleep(3000);
             try {
                     WebElement element =driver.findElement(By.xpath("/html/body/div[1]/div[2]/a"));
                     if (element.isDisplayed()) {
                             element.click();

                     }
             } catch (Exception e) {
                     System.out.println("Intermediate pages handled");
             }

             Thread.sleep(3000);
             try {
                     WebElement divorcee_intermediate_skip =driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/a"));
                     if (divorcee_intermediate_skip.isDisplayed()) {
                             divorcee_intermediate_skip.click();

                     }
             } catch (Exception e) {
                     System.out.println("Intermediate pages handled");
             }

             Thread.sleep(3000);
             try {
                     driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
             } catch (Exception e) {
                     System.out.println("No Intermediate pages");
             }

           //*[@id="strategicComm"]/div/div[2]/a/img
             Thread.sleep(5000);
             try {
                     driver.findElement(By.xpath(" //*[@id=\"strategicComm\"]/div/div[2]/a/img")).click();
             } catch (Exception e) {
                     System.out.println("ADs Closed Successfully");
             }
             // AD Pages
             Thread.sleep(5000);
             try {
                     driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
             } catch (Exception e) {
                     System.out.println("ADs Closed Successfully");
             }

          //   ProfileViewNotContacted p = new ProfileViewNotContacted(driver);

             /* -- -- -- --- -- - */
             //////////////// Going to Edit PP //////////////////////////
             /*
              * Thread.sleep(3000);
acc.moveToElement(driver.findElement(By.xpath(
              *
"//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/a"))).build()
              * .perform(); Thread.sleep(1500);
              * acc.moveToElement(driver.findElement(By.xpath(
              *
"//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[2]/a")))
              * .build().perform();
              *
              * Thread.sleep(2000);
Base.click(driver.findElement(By.xpath(
              *
"//*[@id=\"userpop\"]/div[2]/div/div[3]/div[1]/ul/li[2]/a")));
              */
             
             ////////////////////////// click on Home button and shortlisted
             ////////////////////////// section////////////////////
             Thread.sleep(5000);
             acc.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'My Home')]"))).build().perform();
             Thread.sleep(5000);
             acc.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'My Home')]"))).build().perform();
             Thread.sleep(3000);
             acc.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Who viewed my profile')]"))).click()
                             .perform();
             Thread.sleep(3000);
             /////////////////////////////////////////////////////////////////

             //driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[2]/div[2]/a")).click();
             // acc.moveToElement(p.getMy_home()).build().perform();

             try {
                     Thread.sleep(5000);
                     driver.findElement(By.xpath("(//a[@class='popupclose'])[2]")).click();
             } catch (Exception e) {
                     e.getMessage();
             }
             Thread.sleep(3000);

             //// Getting total profile count//////////////
        
                     Thread.sleep(10000);
                     if (driver.findElement(By.id("total_div")).isDisplayed()) {
                    	 Thread.sleep(5000);
                    	 WebElement profilecount=driver.findElement(By.id("total_div"));
                    	 Thread.sleep(5000);
							
							  String pf = profilecount.getText(); 
							  System.err.println(pf);
							  
							  
						
					}else {
                     Thread.sleep(5000);					
						 // String Noprofile_txt=driver.findElement(By.xpath("//*[text()=\"No member has viewed your profile.\"]")).getText();
						//  System.out.println(Noprofile_txt);
                //Thread.sleep(5000);
               // BaseTest.sms_who_viewed(BaseTest.getExcelData("WVM", i, 1),i);
                
                Thread.sleep(5000);
				  BaseTest.sms_who_viewed(BaseTest.getExcelData("WVM", i, 4),i);
               
					}


             //System.out.println("Total times Next has to be clicked  :" + page_cou);

             //for (int m = 0; m <= page_cou; m++) {

                     Thread.sleep(5000);
                     
            
                   
             }
     }

}
