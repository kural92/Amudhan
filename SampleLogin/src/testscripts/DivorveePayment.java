package testscripts;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.InetAddress;
import java.net.URL;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import businessFunctions.BussinessFunctions;
import utility.BaseTest;

public class DivorveePayment extends BaseTest {
    public static String baseurl;
    public static Properties properties, properties5;
    public WebElement readRep;

    public DivorveePayment() throws Exception {

        properties = new Properties();
        FileInputStream fis = new FileInputStream(
                new File("C:\\Users\\amuthan\\eclipse-workspace\\SampleLogin\\objectRepository\\Login.properties"));
        properties.load(fis);

    }
   
    @Test
    public void paymentTest() throws Exception {

        test = extent.createTest("Payment Test Scenario-1");
        test.pass("Browser Opened ");

        FileInputStream file = new FileInputStream(
                new File("C:\\Users\\amuthan\\eclipse-workspace\\SampleLogin\\Resources\\LoginTestData_Mohan2333.xlsx"));
        Workbook workbook = WorkbookFactory.create(file);
        Sheet sheet1 = workbook.getSheet("login");
        for (int i = 1; i <= 1; i++) {
            baseurl = sheet1.getRow(i).getCell(0).getStringCellValue();
            driver.navigate().to(baseurl);
           
            InetAddress ip = InetAddress.getByName(new URL(baseurl)
                    .getHost());
             System.out.println("Public IP Address of: " + ip);
             test.pass("Public IP Address of: " + ip);
         
            test.pass("Application Launched Successfully");
            driver.manage().window().maximize();
            Thread.sleep(2000);

            String username = sheet1.getRow(i).getCell(1).getStringCellValue();
            String password = sheet1.getRow(i).getCell(2).getStringCellValue();
            test.info("Reading communitymatrimony UserName & Password from Test Data Repository");
            test.pass("UserName is Valid :" + username);
            test.pass("Password is Valid : *******");
            BussinessFunctions.cmLogin(driver, properties, username, password);
            Thread.sleep(2000);
            test.pass("Login Button Clicked");
            System.out.println("Login Successfully...");

          
            Thread.sleep(3000);;
            try {
            	 driver.findElement(By.xpath("//a[@class='clr7']")).click();
			} catch (Exception e) {
				e.getMessage();
			}
      Thread.sleep(3000);    
try {
	driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")).click();
} catch (Exception e) {
	e.getMessage();
}
            test.pass("Intermidate Pages are closed...Successfully");
            System.out.println("Intermidate Pages are closed...");


            Thread.sleep(10000);
          
            Actions acc  = new Actions(driver);

			Thread.sleep(3000);
			
			 WebDriverWait wait=new WebDriverWait(driver,60);
			 WebElement upgrade = driver.findElement(By.xpath("//*[@id=\"topnav-login-menu\"]/div[3]/div[2]/div[1]/span"));
			    wait.until(ExpectedConditions.visibilityOf(upgrade)); 
			
			    acc.moveToElement(upgrade).perform();
			    Thread.sleep(3000);
			    
			    acc.doubleClick(upgrade).perform();
			    Thread.sleep(3000);
			    WebElement upgrde = driver.findElement(By.xpath("//*[@id=\"userpop\"]/div[2]/div/div[2]/div[1]/span/a"));
			    acc.moveToElement(upgrde).click().perform();
       
            test.info("Scenario-1 Through Upgrade in Menu Bar....");
            String parent = driver.getWindowHandle();
            System.out.println("Parent Window ID is  " + parent);
            Thread.sleep(3000);

            Set<String> winHandles = driver.getWindowHandles();
            int count = winHandles.size();
            System.out.println("Window Count is : " + count);
            for (String winHandle : winHandles) {
                if (!parent.contains(winHandle)) {
                	Thread.sleep(3000);
                    driver.switchTo().window(winHandle);
                }
               
                System.out.println("window Handle Id :" + winHandle);
               
            }
            System.out.println("Handled");
            test.pass("Membership Plan Offer Button Clicked");


        /*    try {
            	
            	driver.findElement(By.xpath("//*[@id=\"vpc_CardNum_C\"]")).sendKeys("xxxxx");
            } catch (Exception e) {
                e.getCause();
            }*/
            Thread.sleep(90000);
            driver.findElement(By.id("vpc_CardNum_C")).sendKeys("4111111111111111");

            Select month = new Select(driver.findElement(By.xpath(".//*[@id='cardExpiryMonth']")));
            month.selectByIndex(4);
            Select year = new Select(driver.findElement(By.xpath(".//*[@id='cardExpiryYear']")));
            year.selectByIndex(6);
            Thread.sleep(2000);

driver.findElement(By.xpath(".//*[@id='vpc_CardSecurityCode']")).sendKeys("635");
            Thread.sleep(3000);

driver.findElement(By.xpath(".//*[@id='crditCardRiSubButL']")).click();
            Thread.sleep(3000);
            test.pass("Card Details entered Successfully");
            System.out.println("Card Details entered Successfully");
            test.pass("Pay Securly Button Cliked");
            test.pass("Redirecting Payment Process....");
            System.out.println("Negative payment completed");
            


   //     driver.quit();

    }
}
    
    @AfterSuite
    public void sms(ITestResult testResult) throws Exception {
		
    	
    	 FileInputStream file = new 
     		    FileInputStream("D:\\New folder\\SMS and MAIL Jenkin Code\\Sms_Test_Data.xlsx");

     		         XSSFWorkbook workbook = new XSSFWorkbook(file);
     		    XSSFSheet sheet = workbook.getSheet("Sheet1");


 		
 		 int result =(testResult.getStatus());
 		  System.out.println(result);
 		   
 		 	 
 				 
 				 if (testResult.getStatus()==2) {
 					 BaseTest.sendVFSms();
 					
 				} else if (testResult.getStatus()==1) {
 					
 					
 					//Thread.sleep(10000);
 				  String test =  sheet.getRow(1).getCell(0).getStringCellValue();
 				  
 				  if (test.equals("2.0")) {
 					  
 					 BaseTest.sendVFSms1();
 					
 				}
 					
 				} else {

 				}
 				 
 			
 					
 		        		         //Update the value of cell
 		        		        Cell cell = sheet.getRow(1).getCell(0);
 		        		         cell.setCellValue(testResult.getStatus());

 		        		         file.close();

 		        		         FileOutputStream outFile =new FileOutputStream(new File("C:\\Users\\amuthan\\eclipse-workspace\\SMS_Project\\Excel\\SMSTEST.xlsx"));
 		        		        
 		        		         workbook.write(outFile);
 		        		         outFile.close();

    }
 	
 	
}


    
