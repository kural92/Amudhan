package SprintTask;

import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.EditPIMethod;

import base.BaseTest;
import pom.cmlogin.EditPI_POM;
import pom.cmlogin.GothramPOM;

public class PayGreat40 extends BaseTest
{

	int Gold3m, Gold6m, Diamond3m, Diamon6m, Platinum3m, Platinum6m, TillYouMarry,Gold3mDis, Gold6mDis, Diamond3mDis, Diamon6mDis, Platinum3mDis, Platinum6mDis, TillYouMarryDis;
	
	String Great40 = "AGR102093";
	
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
	public void paymentTestPrice() throws InterruptedException, Throwable {
		
		GothramPOM g = new GothramPOM(driver);
		EditPI_POM i = new EditPI_POM(driver);
		Actions acc = new Actions(driver);
		Robot r = new Robot();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		JavascriptExecutor js  = (JavascriptExecutor)driver;
		com.pages.EditPIMethod pp = new EditPIMethod();
		
		
		driver.get("https://www.communitymatrimony.com");
		driver.manage().window().maximize();
		BaseTest.click(g.getMatriID());
		BaseTest.typeData(g.getMatriID(), Great40);
		BaseTest.click(g.getPasswordClear());
		BaseTest.typeData(g.getPassword(), "cbstest");
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
		
		try {
			BaseTest.click(driver.findElement(By.xpath("//*[@id=\"special_offer_lightpic1\"]/div[1]/div/a/img")));
		} catch (Exception e2) {
			// TODO: handle exception
		}
		
		Thread.sleep(2000);
		try {
			acc.moveToElement(g.getMenu_btn());
		} catch (Exception e2) {
		    acc.moveToElement(g.getMenu_btn1());
		}
		Thread.sleep(2000);
		acc.moveToElement(g.getEdit_Profile()).click().build().perform();
		
		Thread.sleep(3000);
		
		
		for (int j = 4; j < 9; j++) {
			String MotherTongue = BaseTest.getExcelData("Pay",j , 1);
			System.out.println(MotherTongue+"  ");
			if (MotherTongue.equalsIgnoreCase("Tamil")) {
				System.err.println("SOUTH-1");
			}else if (MotherTongue.equalsIgnoreCase("Kannada")) {
				System.err.println("SOUTH-2");
			}else if (MotherTongue.equalsIgnoreCase("Assamese")) {
				System.err.println("EAST");
			}else if (MotherTongue.equalsIgnoreCase("Punjabi")) {
				System.err.println("NORTH");
			}else if (MotherTongue.equalsIgnoreCase("Marathi")) {
				System.err.println("WEST");
			}else { }
			Thread.sleep(3000);
			BaseTest.select_text(i.getPI_MotherTongue_DD(), MotherTongue);
			
			Thread.sleep(2000);
			 BaseTest.click(driver.findElement(By.xpath("//*[@id=\"frmProfile\"]/div[2]/div/input")));
			 
		
		Thread.sleep(2000);
		String Parent = driver.getWindowHandle();
		
		BaseTest.click(driver.findElement(By.xpath("(//a[contains(text(),'Upgrade')])[1]")));
		
		Thread.sleep(3000);
		try {
			Set<String> Child = driver.getWindowHandles();
			for (String handle : Child) {
				if (!Parent.contains(handle)) {
					driver.switchTo().window(handle);
				}
			}
		} catch (Exception e) {	}
		
		for (int k = 0; k < 6; k++) {
			String url = driver.getCurrentUrl();
			String Urladd = url+"&OfferDay="+k+"&countryCode=98";
			if (!(k%2==0)) {
				driver.get(Urladd);
		
	System.err.println(k);
		
		Thread.sleep(3000);
		String G3 = driver.findElement(By.xpath("(//span[@class='boldtxt font18'])[1]")).getText();
		System.out.println(G3 );
		String[] G3S = G3.split("Rs. ");
		String G3St = G3S[1].toString();
		if (G3St.contains(" ")) {
			String[] G3Str = G3St.split(" ");
			String G3Stri = G3Str[0].toString().trim();
			int G3Strin = Integer.parseInt(G3Stri);
			Gold3mDis=G3Strin;
			System.out.println(Gold3mDis);
			String G3Stri1 = G3Str[1].toString().trim();
			int G3Strin1 = Integer.parseInt(G3Stri1);
			Gold3m=G3Strin1;
			System.out.println(Gold3m);
		}else {
			String G3Str = G3S[1].toString().trim();
			int G3Strin = Integer.parseInt(G3Str);
			Gold3m=G3Strin;
			System.out.println(Gold3m);
		}
		
		
		
		
		
		String G6 = driver.findElement(By.xpath("(//span[@class='boldtxt font18'])[2]")).getText();
		System.out.println(G6);
		String[] G6S = G6.split("Rs. ");
		String G6St = G6S[1].toString();
		if (G6St.contains(" ")) {
			String[] G6Str = G6St.split(" ");
			String G6Stri = G6Str[0].toString().trim();
			int G6Strin = Integer.parseInt(G6Stri);
			Gold6mDis=G6Strin;
			System.out.println(Gold6mDis);
			String G6Stri1 = G6Str[1].toString().trim();
			int G6Strin1 = Integer.parseInt(G6Stri1);
			Gold6m=G6Strin1;
			System.out.println(Gold6m);
		}else {
			String G6Str = G6S[1].toString().trim();
			int G6Strin = Integer.parseInt(G6Str);
			Gold6m=G6Strin;
			System.out.println(Gold6m);
		}
		
		String D3 = driver.findElement(By.xpath("(//span[@class='boldtxt font18'])[3]")).getText();
		System.out.println(D3 );
		String[] D3S = D3.split("Rs. ");
		String D3St = D3S[1].toString();
		if (D3St.contains(" ")) {
			String[] D3Str = D3St.split(" ");
			String D3Stri = D3Str[0].toString().trim();
			int D3Strin = Integer.parseInt(D3Stri);
			Diamond3mDis=D3Strin;
			System.out.println(Diamond3mDis);
			String D3Stri1 = D3Str[1].toString().trim();
			int D3Strin1 = Integer.parseInt(D3Stri1);
			Diamond3m=D3Strin1;
			System.out.println(Diamond3m);
		}else {
			String D3Str = D3S[1].toString().trim();
			int D3Strin = Integer.parseInt(D3Str);
			Diamond3m=D3Strin;
			System.out.println(Diamond3m);
		}
		String D6 = driver.findElement(By.xpath("(//span[@class='boldtxt font18'])[4]")).getText();
		System.out.println(D6);
		String[] D6S = D6.split("Rs. ");
		String D6St = D6S[1].toString();
		if (D6St.contains(" ")) {
			String[] D6Str = D6St.split(" ");
			String D6Stri = D6Str[0].toString().trim();
			int D6Strin = Integer.parseInt(D6Stri);
			Diamon6mDis=D6Strin;
			System.out.println(Diamon6mDis);
			String D6Stri1 = D6Str[1].toString().trim();
			int D6Strin1 = Integer.parseInt(D6Stri1);
			Diamon6m=D6Strin1;
			System.out.println(Diamon6m);
		}else {
			String D6Str = D6S[1].toString().trim();
			int D6Strin = Integer.parseInt(D6Str);
			Diamon6m=D6Strin;
			System.out.println(Diamon6m);
		}
		
		String P3 = driver.findElement(By.xpath("(//span[@class='boldtxt font18'])[5]")).getText();
		System.out.println(P3);
		String[] P3S = P3.split("Rs. ");
		String P3St = P3S[1].toString();
		if (P3St.contains(" ")) {
			String[] P3Str = P3St.split(" ");
			String P3Stri = P3Str[0].toString().trim();
			int P3Strin = Integer.parseInt(P3Stri);
			Platinum3mDis=P3Strin;
			System.out.println(Platinum3mDis);
			String P3Stri1 = P3Str[1].toString().trim();
			int P3Strin1 = Integer.parseInt(P3Stri1);
			Platinum3m=P3Strin1;
			System.out.println(Platinum3m);
		}else {
			String P3Str = P3S[1].toString().trim();
			int P3Strin = Integer.parseInt(P3Str);
			Platinum3m=P3Strin;
			System.out.println(Platinum3m);
		}
		
		
		String P6 = driver.findElement(By.xpath("(//span[@class='boldtxt font18'])[6]")).getText();
		System.out.println(P6 );
		String[] P6S = P6.split("Rs. ");
		String P6St = P6S[1].toString();
		if (P6St.contains(" ")) {
			String[] P6Str = P6St.split(" ");
			String P6Stri = P6Str[0].toString().trim();
			int P6Strin = Integer.parseInt(P6Stri);
			Platinum6mDis=P6Strin;
			System.out.println(Platinum6mDis);
			String P6Stri1 = P6Str[1].toString().trim();
			int P6Strin1 = Integer.parseInt(P6Stri1);
			Platinum6m=P6Strin1;
			System.out.println(Platinum6m);
		}else {
			String P6Str = P6S[1].toString().trim();
			int P6Strin = Integer.parseInt(P6Str);
			Platinum6m=P6Strin;
			System.out.println(Platinum6m);
		}
		
		String TUM = driver.findElement(By.xpath("(//span[@class='boldtxt font18'])[7]")).getText();
		System.out.println(TUM);
		String[] TS = TUM.split("Rs. ");
		String TSt = TS[1].toString();
		if (TSt.contains(" ")) {
			String[] TStr = TSt.split(" ");
			String TStri = TStr[0].toString().trim();
			int TStrin = Integer.parseInt(TStri);
			TillYouMarryDis=TStrin;
			System.out.println(TillYouMarryDis);
			String TStri1 = TStr[1].toString().trim();
			int TStrin1 = Integer.parseInt(TStri1);
			TillYouMarry=TStrin1;
			System.out.println(TillYouMarry);
		}else {
			String TStr = TS[1].toString().trim();
			int TStrin = Integer.parseInt(TStr);
			TillYouMarry=TStrin;
			System.out.println(TillYouMarry);
		}
		
		
		
		
		String lessthan40D6 =  BaseTest.getExcelData("Pay", j, 2);
		int ilessthan40D6 = Integer.parseInt(lessthan40D6);
		String Greater40D6= BaseTest.getExcelData("Pay", j, 3);
		int iGreater40D6 = Integer.parseInt(Greater40D6);
		String R2D6 = BaseTest.getExcelData("Pay", j, 6);
		int iR2D6 = Integer.parseInt(R2D6);
		String RND6 = BaseTest.getExcelData("Pay", j, 7);
		int iRND6 = Integer.parseInt(RND6);
		String R1PGD6 = BaseTest.getExcelData("Pay", j, 4);
		int iR1PGD6 = Integer.parseInt(R1PGD6);
		
		String lessthan40D3 =  BaseTest.getExcelData("Pay", j, 8);
		int ilessthan40D3 = Integer.parseInt(lessthan40D3);
		String Greater40D3= BaseTest.getExcelData("Pay", j, 9);
		int iGreater40D3 = Integer.parseInt(Greater40D3);
		String R2D3 = BaseTest.getExcelData("Pay", j, 12);
		int iR2D3 = Integer.parseInt(R2D3);
		String RND3 = BaseTest.getExcelData("Pay", j, 13);
		int iRND3 = Integer.parseInt(RND3);
		String R1PGD3 = BaseTest.getExcelData("Pay", j, 10);
		int iR1PGD3 = Integer.parseInt(R1PGD3);
		
		String lessthan40P3 =  BaseTest.getExcelData("Pay", j, 14);
		int ilessthan40P3 = Integer.parseInt(lessthan40P3);
		String Greater40P3= BaseTest.getExcelData("Pay", j, 15);
		int iGreater40P3 = Integer.parseInt(Greater40P3);
		String R2P3 = BaseTest.getExcelData("Pay", j, 18);
		int iR2P3 = Integer.parseInt(R2P3);
		String RNP3 = BaseTest.getExcelData("Pay", j, 19);
		int iRNP3 = Integer.parseInt(RNP3);
		String R1PGP3 = BaseTest.getExcelData("Pay", j, 16);
		int iR1PGP3 = Integer.parseInt(R1PGP3);
		
///////////////////////////////////		
		if (iGreater40D6==(Diamon6m)) {
			System.err.println("Listed Value is matched with Diamond 6mnth "+Greater40D6);
		}else {
	//		System.out.println("Listed Value is not matched with Diamond 6mnth "+Greater40D6);
		}
		
		if (iGreater40D6==(Diamon6mDis)) {
			System.err.println("Listed Value is matched with Diamond 6mnth_DIS "+Greater40D6);
		} else {
	//		System.out.println("Listed Value is not matched with Diamond 6mnth_DIS "+Greater40D6);
		}
/////			
		
		if (iGreater40D3==(Diamond3m)) {
			System.err.println("Listed Value is matched with Diamond 3mnth "+Greater40D3);
		}else {
	//		System.out.println("Listed Value is not matched with Diamond 3mnth "+Greater40D3);
		}
		
		if (iGreater40D3==(Diamond3mDis)) {
			System.err.println("Listed Value is matched with Diamond 3mnth_DIS "+Greater40D3);
		} else {
	//		System.out.println("Listed Value is not matched with Diamond 3mnth_DIS "+Greater40D3);
		}
/////////////		
		
		if (iGreater40P3==(Platinum3m)) {
			System.err.println("Listed Value is matched with Platinum 3mnth "+Greater40P3);
		}else {
	//		System.out.println("Listed Value is not matched with Platinum 3mnth "+Greater40P3);
		}
		if (iGreater40P3==(Platinum3mDis)) {
			System.err.println("Listed Value is matched with Platinum 3mnth_DIS "+Greater40P3);
		} else {
//			System.out.println("Listed Value is not matched with Platinum 3mnth_DIS "+Greater40P3);
		}
		
			}
		}
		
////////////////////////////////////////////////////////////////////////////////////////		
		
		
		driver.close();
		driver.switchTo().window(Parent);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
	

		
		
		
		}
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	}
	
	


}
