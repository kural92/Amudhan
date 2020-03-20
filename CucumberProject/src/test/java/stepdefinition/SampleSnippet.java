package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SampleSnippet {
	WebDriver driver;
	



@Given("^Entering into the Community Matrimony Domain$")
public void entering_into_the_Community_Matrimony_Domain() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\amuthan\\eclipse-workspace\\CucumberProject\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.communitymatrimony.com/login/?error=2&preselus=TWF0cmlt8067FfKrTgCb255IElE8067FfKrTgCIC8gRS1t8067FfKrTgCYWls");
	driver.manage().window().maximize();
	 driver.findElement(By.id("idEmail")).sendKeys("agr405939");
	  driver.findElement(By.id("password")).click();
	  driver.findElement(By.id("password")).clear();
	  driver.findElement(By.id("password")).sendKeys("cbstest");
	 driver.findElement(By.id("frmsubmit")).click();
}


}

/*@Given("^Login$")
public void login() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^enter username Password$")
public void enter_username_Password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^Logged IN$")
public void logged_IN() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^Hanfdling IntermedIATE PAGES$")
public void hanfdling_IntermedIATE_PAGES() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^eNTERED Home Page$")
public void entered_Home_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^Logout$")
public void logout() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^Close Browser$")
public void close_Browser() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}
*/