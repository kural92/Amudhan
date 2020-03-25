package com.search;

import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.EditPIMethod;
import com.pages.SearchMethod;

import base.BaseTest;
import pom.cmlogin.EditPI_POM;
import pom.cmlogin.GothramPOM;
import pom.cmlogin.Search_POM;

public class Search extends BaseTest {

	@BeforeSuite
	public void setUp() {
		// test=reports.startTest("Divorcee Negative Payment");
		// test.log(LogStatus.PASS, "Divorcee Negative Payment Test Started");
		System.setProperty("webdriver.chrome.driver", ".//Driver//chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--disable-notifications");
		// options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);

	}

	@Test
	public void regularSearch() throws Throwable {

		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		com.pages.EditPIMethod pp = new EditPIMethod();

		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), "EZH710533");
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest1");
		BaseTest.click(g.getLogin_btn());

		try {
			BaseTest.click(g.getInterMediate_page());
		} catch (Exception e2) {
			// TODO: handle exception
		}

		try {
			BaseTest.click(g.getInterMediate_page1());
		} catch (Exception e2) {
			// TODO: handle exception
		}

		Thread.sleep(5000);
		try {
			Alert al = driver.switchTo().alert();
			al.accept();
		} catch (Exception e) {
			// TODO: handle exception
		}

		Thread.sleep(5000);
		try {
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")));
		} catch (Exception e2) {
			// TODO: handle exception
		}

		Search_POM s = new Search_POM(driver);

		// SearchMethod.regularSearch();

		/////////////////////////////////////////////

		Thread.sleep(2000);
		BaseTest.click(s.getSearch_Menu_btn());

		try {
			Thread.sleep(5000);
			acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"RSearchForm\"]/div[2]/div[1]/a[2]"))).build()
					.perform();
			driver.findElement(By.id("chatbuddylistwin")).click();
			acc.moveToElement(driver.findElement(By.xpath("//*[@id=\"RSearchForm\"]/div[2]/div[1]/a[2]"))).click()
					.build().perform();
			;
		} catch (Exception e) {

		}

		Thread.sleep(2000);

		BaseTest.select_text(s.getAdvanced_AgeFrom_DD(), BaseTest.getExcelData("Advanced Search", 1, 1));
		BaseTest.select_text(s.getAdvanced_AgeTo_DD(), BaseTest.getExcelData("Advanced Search", 1, 2));

		BaseTest.select_text(s.getAdvanced_HeightFrom_DD(), BaseTest.getExcelData("Advanced Search", 1, 3));
		BaseTest.select_text(s.getAdvanced_HeightTo_DD(), BaseTest.getExcelData("Advanced Search", 1, 4));

//////////////////////////////////////////////////////////////////////////

////////////////////////////////////Marital Status   ////////////////////////////////////		
		Thread.sleep(2000);
		if (BaseTest.getExcelData("Advanced Search", 1, 5).contains("Unmarried")) {
			if (!s.getAdvanced_Marital_Unmarried().isSelected()) {
				BaseTest.click(s.getAdvanced_Marital_Unmarried());
			} else {
				System.out.println("Unmarried Marital is Already Selected");
			}

		} else {
		}
		if (BaseTest.getExcelData("Advanced Search", 1, 5).contains("Widow / Widower")) {
			if (!s.getAdvanced_Marital_Widow().isSelected()) {
				BaseTest.click(s.getAdvanced_Marital_Widow());
			} else {
				System.out.println("Widow / Widower Marital is Already Selected");
			}

		} else {
		}
		if (BaseTest.getExcelData("Regular Search", 1, 5).contains("Divorced")) {
			if (!s.getAdvanced_Marital_Divorceed().isSelected()) {
				BaseTest.click(s.getAdvanced_Marital_Divorceed());
			} else {
				System.out.println("Divorced Marital is Already Selected");
			}

		} else {
		}
		if (BaseTest.getExcelData("Advanced Search", 1, 5).contains("Separated")) {
			if (!s.getAdvanced_Marital_Seperated().isSelected()) {
				BaseTest.click(s.getAdvanced_Marital_Seperated());
			} else {
				System.out.println("Seperated Marital is Already Selected");
			}

		} else {
		}
		if (BaseTest.getExcelData("Advanced Search", 1, 5).contains("Any")) {
			if (!s.getAdvanced_Marital_Any().isSelected()) {
				BaseTest.click(s.getRegular_Marital_Any());
			} else {
				System.out.println("Any Marital is Already Selected");
			}
		}
/////////////////////////////////////////   *  *  *  *  *   ///////////////////////////////	
/////////     Have Children  //////
		if (!s.getAdvanced_Marital_Unmarried().isSelected() || s.getAdvanced_Marital_Divorceed().isSelected()
				|| s.getAdvanced_Marital_Seperated().isSelected() || s.getAdvanced_Marital_Widow().isSelected()
				|| s.getAdvanced_Marital_Any().isSelected()) {
			if (BaseTest.getExcelData("Advanced Search", 1, 6).equals("Doesn't matter")) {
				if (!s.getAdvanced_HaveChild__Doesnt().isSelected()) {
					BaseTest.click(s.getAdvanced_HaveChild__Doesnt());
				} else {
					System.out.println("Doesn't Matter Children Status is Already Selected");
				}

			} else if (BaseTest.getExcelData("Advanced Search", 1, 6).equals("Yes. Living together")) {
				if (!s.getAdvanced_HaveChild_YesLiving().isSelected()) {
					BaseTest.click(s.getAdvanced_HaveChild_YesLiving());
				} else {
					System.out.println("Yes Living Together Children Status is Already Selected");
				}
			} else if (BaseTest.getExcelData("Advanced Search", 1, 6).equals("Yes. Not living together")) {
				if (!s.getAdvanced_HaveChild_Yes_Not_Living().isSelected()) {
					BaseTest.click(s.getAdvanced_HaveChild_Yes_Not_Living());
				} else {
					System.out.println("Yes, Not Living Together Children Status is Already Selected");
				}
			} else {
				if (!s.getAdvanced_HaveChild_No().isSelected()) {
					BaseTest.click(s.getAdvanced_HaveChild_No());
				} else {
					System.out.println("No Children Status is Already Selected");
				}
			}
		} else {
			System.out.println("Marital Status is UnMarried - So there is no Children Status to Display/Select");
		}

/////////////////////////////////////////////////////////////////////////////////	
		// Sub Caste /////

		
		 String SubCaste = BaseTest.getExcelData("Advanced Search", 1, 7);
		 Thread.sleep(2000);
		 BaseTest.click(s.getRegular_Subcaste_Value());
		 if (SubCaste.contains(", ")) { 
			 String[] Subcaste = SubCaste.split(", "); 
			 
			 for(int j = 0; j < Subcaste.length; j++) {
		 
		 Thread.sleep(1000);
		 acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).build().perform();
		 //acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).doubleClick().build().perform(); Thread.sleep(1000); } }else{
		 Thread.sleep(2000); BaseTest.click(s.getRegular_Subcaste_Value());
		 acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+SubCaste+"')]"))).build().perform(); 
		 }
		 }	else {System.out.println("There is no SubCaste field to choose the give value");
		 }
/////////////////////////////////////////////////////////////////////
		 
		   ////////////////  Mother tongue  ////////////////////
		 
		 String MotherTongue = BaseTest.getExcelData("Advanced Search", 1, 8);
		  
		  Thread.sleep(2000);
			BaseTest.click(s.getAdvanced_MOtherTongue_Value());
		  
				if (MotherTongue.contains(", ")) {
					String[] Mother_tongue = MotherTongue.split(", ");
					for (int j = 0; j < Mother_tongue.length; j++) {
						
						Thread.sleep(1000);
						acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).build().perform();
						//acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).doubleClick().build().perform();
						Thread.sleep(1000);
					} }else{
						Thread.sleep(2000);
						BaseTest.click(s.getAdvanced_MOtherTongue_Value());
						Thread.sleep(1000);
						acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+MotherTongue+"')]"))).build().perform();
					}
	//////////////////////////////////////////////////////////////////////////////////////////////
				
				String PhysicalStatus =  BaseTest.getExcelData("Advanced Search", 1, 13);
				if (PhysicalStatus.contains("Doesn't matter")) {
					if (!s.getAdvanced_Physical_Doesnt().isSelected()) {
						BaseTest.click(s.getAdvanced_Physical_Doesnt());
					} else {System.out.println("Physical Status Doesnt Matter was already selected");
					} }
				
					if (PhysicalStatus.contains("Normal")) {
						if (!s.getAdvanced_Physical_Normal().isSelected()) {
							BaseTest.click(s.getAdvanced_Physical_Normal());
						} else {System.out.println("Physical Status Normal was Already Selected");
						} }
					
						if (PhysicalStatus.contains("Physically Challenged")) {
							if (!s.getAdvanced_Physical_Challenged().isSelected()) {
								BaseTest.click(s.getAdvanced_Physical_Challenged());
							}else {
								System.out.println("Physical Status Physically Challenged was Already Selected");
							}
							}
						
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////				
				
				String Gothra  =  BaseTest.getExcelData("Advanced Search", 1, 14);
				BaseTest.typeData(s.getAdvanced_Gothram_Input(), Gothra);
				
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				
				// Star /////

				
				 String Star = BaseTest.getExcelData("Advanced Search", 1, 15);
				 Thread.sleep(2000);
				 BaseTest.click(s.getAdvanced_Star_Value());
				 if (Star.contains(", ")) { 
					 String[] Stars = Star.split(", "); 
					 
					 for(int j = 0; j < Stars.length; j++) {
				 
				 Thread.sleep(1000);
				 acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).build().perform();
				 //acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).doubleClick().build().perform(); Thread.sleep(1000); } }else{
				 Thread.sleep(2000); BaseTest.click(s.getRegular_Subcaste_Value());
				 acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+Star+"')]"))).build().perform(); 
				 }
				 }	else {System.out.println("There is no Star field to choose the give value");
				 }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
				 
				 //  Dosham   /////////////
					String Dosham =  BaseTest.getExcelData("Advanced Search", 1, 16);
					if (Dosham.contains("Doesn't matter")) {
						if (!s.getAdvanced_Dosham_Doesnt().isSelected()) {
							BaseTest.click(s.getAdvanced_Dosham_Doesnt());
						} else {System.out.println("Dosham Doesnt Matter was already selected");
						} }
					
						if (Dosham.contains("Yes")) {
							if (!s.getAdvanced_Dosham_Yes().isSelected()) {
								BaseTest.click(s.getAdvanced_Dosham_Yes());
							} else {System.out.println("Dosham Yes was Already Selected");
							} }
						
							if (Dosham.contains("No")) {
								if (!s.getAdvanced_Dosham_No().isSelected()) {
									BaseTest.click(s.getAdvanced_Dosham_No());
								}else {
									System.out.println("Dosham No was Already Selected");
								}
								}
				
	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
							
							////   Country Living ///
							
							String Countryliving = BaseTest.getExcelData("Advanced Search", 1, 9);
							Thread.sleep(2000);
							BaseTest.click(s.getAdvanced_CountryLiving_Value());
							
							if (Countryliving.contains(", ")) {
								String[] Country_Living = Countryliving.split(", ");
								for (int j = 0; j < Country_Living.length; j++) {
									
									Thread.sleep(1000);
									acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).build().perform();
									//acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).doubleClick().build().perform();
									Thread.sleep(1000);
								} }else{
									Thread.sleep(2000);
									BaseTest.click(s.getAdvanced_CountryLiving_Value());
									Thread.sleep(1000);
									acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+Countryliving+"')]"))).build().perform();
								}
							
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
							
							///  resident Status   //////////////////
			
					String ResidentStaus = BaseTest.getExcelData("Advanced Search", 1, 17);	
							
			if (ResidentStaus.contains("Any")) {
				if (!s.getAdvanced_Resident_Any().isSelected()) {
					BaseTest.click(s.getAdvanced_Resident_Any());
				} else {
					System.out.println("Resident Status Any Was Already was Selected");
				}
			}
			
			if (ResidentStaus.contains("Citizen")) {
				if (!s.getAdvanced_Resident_Citizen().isSelected()) {
					BaseTest.click(s.getAdvanced_Resident_Citizen());
				} else {
					System.out.println("Resident Status Citizen Was Already was Selected");
				}
			}
			
			if (ResidentStaus.contains("Work permit")) {
				if (!s.getAdvanced_Resident_WorkPermit().isSelected()) {
					BaseTest.click(s.getAdvanced_Resident_WorkPermit());
				} else {
					System.out.println("Resident Status Work Permit Was Already was Selected");
				}
			}
			
			if (ResidentStaus.contains("Permit resident")) {
				if (!s.getAdvanced_Resident_Permanent_resident().isSelected()) {
					BaseTest.click(s.getAdvanced_Resident_Permanent_resident());
				} else {
					System.out.println("Resident Status Permit Resident Was Already was Selected");
				}
			}
			
			if (ResidentStaus.contains("Temporary visa")) {
				if (!s.getAdvanced_Resident_TemporaryVisa().isSelected()) {
					BaseTest.click(s.getAdvanced_Resident_TemporaryVisa());
				} else {
					System.out.println("Resident Status Temporary Visa Was Already was Selected");
				}
			}
			
			if (ResidentStaus.contains("Student visa")) {
				if (!s.getAdvanced_Resident_StudentVisa().isSelected()) {
					BaseTest.click(s.getAdvanced_Resident_StudentVisa());
				} else {
					System.out.println("Resident Status Student visa Was Already was Selected");
				}
			}				
							
///////////////////////////////////////////////////////////////////
			
			String Education = BaseTest.getExcelData("Advanced Search", 1, 10);
			Thread.sleep(2000);
			BaseTest.click(s.getAdvanced_Education_Value());  
			
			if (Education.contains(", ")) {
				String[] Education_detail = Education.split(", ");
				for (int j = 0; j < Education_detail.length; j++) {
					
					Thread.sleep(1000);
					acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).build().perform();
					//acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).doubleClick().build().perform();
					Thread.sleep(1000);
				} }else{
					Thread.sleep(2000);
					BaseTest.click(s.getAdvanced_Education_Value());
					Thread.sleep(1000);
					acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+Education+"')]"))).build().perform();
				}
							
/////////////////////////////////////////////////////////////////////////////////////////////////
			

			String Occupation = BaseTest.getExcelData("Advanced Search", 1, 10);
			Thread.sleep(2000);
			BaseTest.click(s.getAdvanced_Occupation_Value());  
			
			if (Occupation.contains(", ")) {
				String[] Occupation_detail = Occupation.split(", ");
				for (int j = 0; j < Occupation_detail.length; j++) {
					
					Thread.sleep(1000);
					acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).build().perform();
					//acc.moveToElement(driver.findElement(By.xpath("//option[contains(text(),'"+j+"')]"))).doubleClick().build().perform();
					Thread.sleep(1000);
				} }else{
					Thread.sleep(2000);
					BaseTest.click(s.getAdvanced_Occupation_Value());
					Thread.sleep(1000);
					acc.doubleClick(driver.findElement(By.xpath("//option[contains(text(),'"+Occupation+"')]"))).build().perform();
				}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			      //////////////////////////////////   Annual income  ////////////////////
			
			 try {
			       BaseTest.select_text(s.getAdvanced_AnnualIncome_DD(), BaseTest.getExcelData("Advanced Search", 1, 18));
			   }    catch (Exception e2) {  System.out.println("Living Status is Not India");
				}
			                    //////          Annual Income To   ///////////////////
			       try {
			    	   BaseTest.select_text(s.getAdvanced_AnnualIncomeTO_DD(), BaseTest.getExcelData("Advanced Search", 1, 19));
				} catch (Exception e2) {  System.out.println("Annual Income From is ANY or Less than 30K ");
				}
			
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			       
			       /////////////////////////////////   Food Habits   /////////////////////////////////

			       if (BaseTest.getExcelData("Advanced Search",1,20).contains("Any")) {
			    		if(!s.getAdvanced_Eating_Any().isSelected()) {
			    			BaseTest.click(s.getAdvanced_Eating_Any());
			    		} else {
			    			System.out.println("Eating Habit - Any is Already Selected");
			    		}
			    		
			    	} else {} 
			       if (BaseTest.getExcelData("Advanced Search", 1, 21).contains("Vegetarian")) {
			     		if(!s.getAdvanced_Eating_Vegetarian().isSelected()) {
			     			BaseTest.click(s.getAdvanced_Eating_Vegetarian());
			     		} else {
			     			System.out.println("Eating Habit -Vegetarian is Already Selected");
			     		}
			     		
			     	} else {} 
			       if (BaseTest.getExcelData("Advanced Search", 1, 21).contains("Non vegetarian")) {
			    		if(!s.getAdvanced_Eating_NonVegetarian().isSelected()) {
			    			BaseTest.click(s.getAdvanced_Eating_NonVegetarian());
			    		} else {
			    			System.out.println("Eating Habit - Non Vegetarian is Already Selected");
			    		}
			    		
			    	} else {} 
			       if (BaseTest.getExcelData("Advanced Search", 1, 20).contains("Eggetarian")) {
			    		if(!s.getAdvanced_Eating_Egg_tarian().isSelected()) {
			    			BaseTest.click(s.getAdvanced_Eating_Egg_tarian());
			    		} else {
			    			System.out.println("Eating Habit - Eggetarian is Already Selected");
			    		}
			    		
			    	} else {} 
			       if (BaseTest.getExcelData("Advanced Search", 1, 20).contains("Vegan")) {
			    		if(!s.getAdvanced_Eating_Vegan().isSelected()) {
			    			BaseTest.click(s.getAdvanced_Eating_Vegan());
			    		} else {
			    			System.out.println("Eating Habit -  Vegan   is Already Selected");
			    		}
			    		
			    	} else {} 
			    		
			    		
			    		////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			    	     ///////////          Smoking Habits      //////////////////////
			    	
			    	if (BaseTest.getExcelData("Advanced Search", 1, 21).contains("Doesn't matter")) {
			    		if(!e.getSmoking_DoesntMatter().isSelected()) {
			    			BaseTest.click(e.getSmoking_DoesntMatter());
			    		} else {
			    			System.out.println("Smoking Habit - Doesn't Matter is Already Selected");
			    		}
			    		
			    	} else {} 
			       if (BaseTest.getExcelData("Advanced Search", 1, 21).contains("Non-smoker")) {
			     		if(!e.getSmoking_NonSmoker().isSelected()) {
			     			BaseTest.click(e.getSmoking_NonSmoker());
			     		} else {
			     			System.out.println("Smoking Habit - Non-Smoker is Already Selected");
			     		}
			     		
			     	} else {} 
			       if (BaseTest.getExcelData("Advanced Search", 1, 21).contains("Light / Social smoker")) {
			    		if(!e.getSmoking_LightSmoker().isSelected()) {
			    			BaseTest.click(e.getSmoking_LightSmoker());
			    		} else {
			    			System.out.println("Eating Habit - Light / Social smoker is Already Selected");
			    		}
			    		
			    	} else {} 
			       if (BaseTest.getExcelData("EditPP", 1, 21).contains("Regular smoker")) {
			    		if(!e.getSmoking_RegularSmoker().isSelected()) {
			    			BaseTest.click(e.getSmoking_RegularSmoker());
			    		} else {
			    			System.out.println("Eating Habit - Regular smoker is Already Selected");
			    		}
			    		
			    	} else {} 
			    		
			       ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
			       ///////////////////////////           Drinking Habits  ///////////////////////////////
			    	if (BaseTest.getExcelData("Advanced Search", 1, 22).contains("Any")) {
			    		if(!s.getAdvanced_Drinker_Any().isSelected()) {
			    			BaseTest.click(ss.getAdvanced_Drinker_Any());
			    		} else {
			    			System.out.println("Smoking Habit - Any is Already Selected");
			    		}
			    		
			    	} else {} 
			       if (BaseTest.getExcelData("Advanced Search", 1, 22).contains("Non-drinker")) {
			     		if(!e.getDrinking_NonDrinker().isSelected()) {
			     			BaseTest.click(e.getDrinking_NonDrinker());
			     		} else {
			     			System.out.println("Smoking Habit - Non-Smoker is Already Selected");
			     		}
			     		
			     	} else {} 
			       if (BaseTest.getExcelData("Advanced Search", 1, 22).contains("Light / Social drinker")) {
			    		if(!e.getDrinking_LightDrinker().isSelected()) {
			    			BaseTest.click(e.getDrinking_LightDrinker());
			    		} else {
			    			System.out.println("Eating Habit - Light / Social smoker is Already Selected");
			    		}
			    		
			    	} else {} 
			       if (BaseTest.getExcelData("Advanced Search", 1, 22).contains("Regular drinker")) {
			    		if(!e.getDrinking_RegularDrinker().isSelected()) {
			    			BaseTest.click(e.getDrinking_RegularDrinker());
			    		} else {
			    			System.out.println("Eating Habit - Regular smoker is Already Selected");
			    		}
			    		
			    	} else {} 

		 
	}

}
