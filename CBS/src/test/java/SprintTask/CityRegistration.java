package SprintTask;

import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import base.BaseTest;

public class CityRegistration extends BaseTest{
	
	String matriid, Caste_Value, subCaste_Value,Caste_PP,SubCaste_PP,Dosham_PP,CitizenShip_PP;
	
	@BeforeSuite
	public void setUp() {
		// test=reports.startTest("Divorcee Negative Payment");
		// test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
		System.setProperty("webdriver.chrome.driver",
				".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
	
	}
	
	
	
	@Test
	public void occupationSearch() throws Throwable {
		
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
	
	Thread.sleep(3000);
	driver.get("https://www.communitymatrimony.com");
	driver.manage().window().maximize();
	
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"home-register\"]/div/div[2]/nav/ul/li[2]/a")).click();
	String CommunitySite = BaseTest.getExcelData("Registeration", 1, 0);
	Thread.sleep(3000);
	BaseTest.select_text(driver.findElement(By.id("domainName")), getExcelData("Registeration", 1, 0));
	
	Thread.sleep(3000);
	BaseTest.select_index(driver.findElement(By.id("profile")), 2);
	
	Thread.sleep(3000);
	driver.findElement(By.id("name")).sendKeys(getExcelData("Registeration", 1, 2));
	
	Thread.sleep(2000);
	//driver.findElement(By.id("gendermale")).click();
	acc.moveToElement(driver.findElement(By.id("genderfemale"))).click().build().perform();
	
	
	
	
	Thread.sleep(2000);
//	acc.moveToElement(driver.findElement(By.id("dobDay"))).build().perform();
//	acc.sendKeys("15").build().perform();
//	BaseTest.click(driver.findElement(By.id("dobDay")));
	BaseTest.select_index(driver.findElement(By.id("dobDay")), 5);
	
	
	Thread.sleep(2000);
//	acc.moveToElement(driver.findElement(By.id("dobMonth"))).build().perform();
//	acc.sendKeys("10").build().perform();
//	BaseTest.click(driver.findElement(By.id("dobMonth")));
	BaseTest.select_index(driver.findElement(By.id("dobMonth")), 5);
	
	Thread.sleep(2000);
//	acc.moveToElement(driver.findElement(By.id("dobYear"))).build().perform();
//	acc.sendKeys("1995").build().perform();
//	BaseTest.click(driver.findElement(By.id("dobYear")));
	BaseTest.select_index(driver.findElement(By.id("dobYear")), 10);
	
	
	Thread.sleep(3000);
	BaseTest.select_index(driver.findElement(By.id("maritalStatus")),1);
	
	Thread.sleep(3000);
	try {
		BaseTest.select_index(driver.findElement(By.id("religion")), 1);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	Thread.sleep(3000);
	try {
		BaseTest.select_index(driver.findElement(By.id("caste")), 3);
		Thread.sleep(2000);
		WebElement Caste_aa = driver.findElement(By.id("caste"));
		Select aa = new Select(Caste_aa);
		WebElement Caste_Val = aa.getFirstSelectedOption();
		 Caste_Value = Caste_Val.getText();
		System.out.println("Caste Value : "+ Caste_Value);
		
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	Thread.sleep(3000);
	try {
		BaseTest.select_index(driver.findElement(By.id("subCaste")), 2);
		Thread.sleep(2000);
		WebElement subCaste_aa = driver.findElement(By.id("subCaste"));
		Select aa = new Select(subCaste_aa);
		WebElement subCaste_Val = aa.getFirstSelectedOption();
		 subCaste_Value = subCaste_Val.getText();
		System.out.println("Caste Value : "+ subCaste_Value);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	int ran = getExcelRandomRowNum("Registeration");
	
	Thread.sleep(3000);
	BaseTest.select_text(driver.findElement(By.id("motherTongue")), getExcelData("Registeration", 1, 11));
	 String moth_tng = getExcelData("Registeration", 1, 11);
	 System.out.println(moth_tng);

	
	Thread.sleep(3000);
	try {
		BaseTest.select_index(driver.findElement(By.id("religion")), 2);
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	Thread.sleep(3000);
	try {
	driver.findElement(By.id("subCasteText")).sendKeys("Others");
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	Thread.sleep(3000);
	BaseTest.select_text(driver.findElement(By.id("country")), getExcelData("Registeration", 1, 8));
	
	Thread.sleep(3000);
	driver.findElement(By.id("mobileNo")).sendKeys("8098882244");
	
	Thread.sleep(3000);
	driver.findElement(By.id("password")).sendKeys("cbstest");
	
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='REGISTER NOW']")).click();
	
	
	Thread.sleep(5000);
	driver.findElement(By.id("email")).sendKeys("amukural"+Math.random()*123+"@gmail.com");
	
	Thread.sleep(3000);
	BaseTest.select_index(driver.findElement(By.id("heightFeet")), 20);
	
	Thread.sleep(3000);
	driver.findElement(By.id("physicalStatuss0")).click();
	
	Thread.sleep(3000);
	BaseTest.select_index(driver.findElement(By.id("residingState")), 16);
	
	
	Thread.sleep(3000);
	BaseTest.select_index(driver.findElement(By.id("residingCityMainDistId")), 6);
	
	
	Thread.sleep(3000);
	BaseTest.select_index(driver.findElement(By.id("residingCityMainDistId")), 6);
	
	
	String Citizenship = BaseTest.getExcelData("Registeration", 1, 18);
	Thread.sleep(3000);
	BaseTest.select_index(driver.findElement(By.id("citizenship")), 1);
	
	
	String Willing_subCaste = BaseTest.getExcelData("Registeration", 1, 19);
	
	if (Willing_subCaste.equals("Yes")) {
	Thread.sleep(3000);
	BaseTest.click(driver.findElement(By.id("labelsamecaste1")));
	}else {
		BaseTest.click(driver.findElement(By.id("labelsamecaste2")));
	}
	
	try {
	Thread.sleep(3000);
	BaseTest.select_index(driver.findElement(By.id("gothram")), 3);
	}catch (Exception e) {
		// TODO: handle exception
	}

	/*  String Dosham = BaseTest.getExcelData("Registeration", 1, 20);
	  Thread.sleep(3000); 
	  if (Dosham.contains("Yes")) {
	  driver.findElement(By.xpath("//*[@id=\"manglikdisplay\"]/dl[2]/dd/label[1]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.id("manglik_m4")).click(); 
	  } else
	  if(Dosham.contains("No")) { 
		  driver.findElement(By.xpath("//*[@id=\"manglikdisplay\"]/dl[2]/dd/label[2]")).click();
	  }else{
		  driver.findElement(By.xpath("//*[@id=\"manglikdisplay\"]/dl[2]/dd/label[3]")).click(); 
		  }
	*/
	
	
	Thread.sleep(3000);
	BaseTest.select_text(driver.findElement(By.id("educationCategory")), "IPS");
	
	
	Thread.sleep(3000);
	driver.findElement(By.id("employmentCategorys3")).click();
	
	Thread.sleep(3000);
	BaseTest.select_text(driver.findElement(By.id("occupation")), "Manager");
	
	
	Thread.sleep(3000);
	BaseTest.select_index(driver.findElement(By.id("annualIncome")), 3);
	
	Thread.sleep(3000);
	BaseTest.click(driver.findElement(By.id("familyValues1")));
	
	Thread.sleep(3000);
	BaseTest.click(driver.findElement(By.id("familyTypes1")));
	
	Thread.sleep(3000);
	BaseTest.click(driver.findElement(By.id("familyStatuss1")));
	
    
	Thread.sleep(3000);
	driver.findElement(By.id("complete")).click();
	
	Thread.sleep(5000);
	//try {			
		//driver.findElement(By.id("residingState")).sendKeys("Nepal");
				 Thread.sleep(5000);
				//test.pass("****Registration Page--2 Completed Successfully****");
				//PIN Verification.....
				Thread.sleep(5000);
			//	if(CommunitySite.equals("brahminmatrimony")||CommunitySite.equals("christianmatrimony")||CommunitySite.equals("muslimmatrimony"))
			//	{
					Thread.sleep(2000);
				WebElement element1 = driver.findElement(By.xpath("//div[contains(text(),'Your Matrimony ID:')]"));
		        String text = element1.getText();
		        System.out.println(text);
		         String matriid = text.substring(19,28);
		        System.out.println("Newly Registered Matri ID is - : "+matriid);
		      //  test.info("Newly Registered Matri ID is - : "+matriid);
			//	}
				/*
				 * else { Thread.sleep(2000); WebElement element1 =
				 * driver.findElement(By.xpath("//div[contains(text(),'Your Matrimony ID:')]"));
				 * String text = element1.getText(); matriid = text.substring(19,28);
				 * System.out.println("Newly Registered Matri ID is - : "+matriid); //
				 * test.info("Newly Registered Matri ID is - : "+matriid); }
				 */
			//	driver.quit();
//	} catch (Exception e) {
		// TODO: handle exception
//	}	
		       // For opening new tab
			Thread.sleep(5000);
		        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		       System.out.println("New tab opened");	          
		       Thread.sleep(9000);	      
		        driver.navigate().to("https://admin:lRqW6WNT@communitymatrimony.com/api/webservicecall.php?filename=getSmsPin&MatriId="+matriid);    
		        
		        //  Nepali -  https://www.nepalimatrimony.com/cbscheck/smspin.php?MatriId="+matriid
		        
		        //https://admin:lRqW6WNT@communitymatrimony.com/api/webservicecall.php?filename=getSmsPin&MatriId="+matriid
		        //driver.navigate().back();
		        Thread.sleep(5000);
				WebElement element = driver.findElement(By.xpath("/html/body"));
				String pinnotext = element.getText();
				driver.navigate().back();
				System.out.println("PIN : "+pinnotext);			
				System.out.println("Success...");    
			//	test.pass("Mobile Activation Started.....");	                      
		       Thread.sleep(1000);	  //Your Matrimony ID: BRH2699411      
		        String pinNum=pinnotext.substring(24,31);
		        System.out.println(pinNum);
		   //     test.pass("Mobile Recivied PIN Number is :  ****** ");	        
		        Thread.sleep(1000);	     
		        Thread.sleep(5000);
		        driver.findElement(By.tagName("body")).sendKeys(Keys.CONTROL+"w"); 
		       // driver.switchTo().window(pwh);
		       // driver.navigate().back(); 
		        Thread.sleep(1000);
		        driver.findElement(By.id("pinNo")).sendKeys(pinNum);
		        driver.findElement(By.id("Verify")).click();
		        Thread.sleep(1000);
		        
		        try {
		        WebElement mobileAlert=driver.findElement(By.xpath(".//*[@id='alertresult']"));
		        String mobileAlertMessage=mobileAlert.getText();
		   //     test.pass(mobileAlertMessage);
		        
		   
		     
		        
		        driver.findElement(By.xpath(".//*[@id='popupphoneverified']/div/div/div/div[1]/div[3]/a")).click();
		        } catch (Exception e) {
					// TODO: handle exception
				}
		  //      test.pass("Mobile POPUP Closed");	        
		        Thread.sleep(5000);
		try {        
		        ////////////////////////////////
		        driver.findElement(By.id("skippage")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.xpath("//*[@id=\"conform\"]/div/div/div/a[1]")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.id("reason3")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.id("skipphotoclick")).click();
		        
		        
		        Thread.sleep(5000);
		        driver.navigate().to("https://www.agarwalmatrimony.com/profiledetail/index.php?act=fullprofilenew&id="+matriid);
		        ///////////////////////////////
	        Thread.sleep(5000);
		   //    driver.findElement(By.id("partnerFoodChoice4")).click();
		        Thread.sleep(2000);
		   //    driver.findElement(By.id("save_addpp")).click();
		} 
		        catch (Exception e) {
					// TODO: handle exception
				}
	/////////////////////////////////////////////////////////////////
		/*		  try {      Thread.sleep(2000);
                driver.findElement(By.xpath("//a[contains(text(),'Skip to Home')]")).click();
	
                Thread.sleep(2000);
                driver.findElement(By.xpath("//a[contains(text(),'do this later')]")).click();
		  } catch (Exception e) {
			// TODO: handle exception
		}
	////////////////////////////////////////////////////////////////////////////////////
                
     try {           Thread.sleep(5000);
     		     driver.findElement(By.id("eatingHabits4")).click();
     		        Thread.sleep(2000);
     		        driver.findElement(By.xpath("//*[@id=\"frm\"]/div[18]/div[1]/input")).click();
     }catch (Exception e) {
		// TODO: handle exception
	}
         ////////////////////////////////////////////
     		try {        Thread.sleep(3000);
     		        driver.findElement(By.xpath("//a[contains(text(),'skip »')]")).click();
		} catch (Exception e) {
			 Thread.sleep(3000);
		//	driver.navigate().to("https://www."+CommunitySite+".com/profiledetail/index.php?act=fullprofilenew&id="+matriid);
		}  		        //AGR755419
     		       Thread.sleep(3000);
     		       try{	        		        
     			       Alert leavePage=driver.switchTo().alert();
     			       leavePage.accept();
     			        }catch(Exception e)
     			        {
     			        	e.getMessage();
     			        }     
         /////////////////////////////////////////
     		        Thread.sleep(3000);
     		        try {
						acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/div/a"))).build().perform();
						Thread.sleep(3000);
     		        	acc.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Edit Partner Preference')]"))).click().build().perform();
					} catch (Exception e) {
						acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/div/a/img"))).build().perform();
						Thread.sleep(3000);
     		        	acc.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Edit Partner Preference')]"))).click().build().perform();
					}
                
     		       
		        Thread.sleep(5000);
		        try {
		         Caste_PP = driver.findElement(By.xpath("//span[contains(text(),'Caste / Division - ')]//following::span[1]")).getText();
                System.out.println(Caste_PP);  } catch (Exception e) {
					// TODO: handle exception
				}
	
                Thread.sleep(2000);
                try {
                 SubCaste_PP = driver.findElement(By.xpath("//span[contains(text(),'Subcaste - ')]//following::span[1]")).getText();
                System.out.println(SubCaste_PP); } catch (Exception e) {
					// TODO: handle exception
				}
                
                Thread.sleep(2000);
                try {
                 Dosham_PP = driver.findElement(By.xpath("//span[contains(text(),'Dosham ')]//following::span[1]")).getText();
                System.out.println(Dosham_PP); } catch (Exception e) {
					// TODO: handle exception
				}
                
                try {
                Thread.sleep(2000);
                 CitizenShip_PP = driver.findElement(By.xpath("//span[contains(text(),'Citizenship - ')]//following::span[1]")).getText();
                System.out.println(CitizenShip_PP);
                } catch (Exception e) {
					// TODO: handle exception
				}
                
           try {     
                if (Willing_subCaste.contains("Yes")) {
					if (Caste_Value.contains(Caste_PP)) {
					System.err.println("The Registered Value matches System PP Caste");	
					}else {
						System.err.println("The Registered Value not matches System PP Caste");	
					}
                }	
                
           }catch (Exception e) {
			// TODO: handle exception
		}  
           
           try {
					 if (Willing_subCaste.contains("Yes")) {
							if (subCaste_Value.contains(SubCaste_PP)) {
							System.err.println("The Registered Value matches System PP SubCaste");	
							}else {
								System.err.println("The Registered Value not matches System PP SubCaste");	
							}
				}
           }catch (Exception e) {
			// TODO: handle exception
		}
                
           try {
					 if (Willing_subCaste.contains("No")) {
							if (SubCaste_PP.contains("Any")) {
							System.err.println("The Registered Value matches System PP SubCaste");	
							}else {
								System.err.println("The Registered Value not matches System PP SubCaste");	
							}
				}
           } catch (Exception e) {
			// TODO: handle exception
		}	 
           
           try {
					 if (Willing_subCaste.contains("No")) {
							if (Caste_Value.contains("Caste_PP")) {
							System.err.println("The Registered Value matches System PP Caste");	
							}else {
								System.err.println("The Registered Value not matches System PP Caste");	
							}
				}
					 
					 
           }catch (Exception e) {
			// TODO: handle exception
		}
           
           
           try {
					 if (Citizenship.contains("India")) {
							if (CitizenShip_PP.contains("Any")) {
							System.err.println("The Registered Value matches System PP CitizenShip");	
							}else {
								System.err.println("The Registered Value not matches System PP CitizenShip");	
							}
				}
           }catch (Exception e) {
			// TODO: handle exception
		}
                
	
*/
		}
	}
