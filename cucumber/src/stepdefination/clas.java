package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class clas {

WebDriver driver; 

@Given("^User on Ranford Home Page$")
public void user_on_Ranford_Home_Page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jahan\\eclipse-workspace.project\\ecommers\\src\\ecommersjars\\chromedriver.exe");

	  driver= new ChromeDriver();
	driver.manage().window().maximize();
			driver.get("http://122.175.8.158/ranford2");
}

@When("^User enters valid \"(.*)\" and \"(.*)\"$")
public void user_enters_valid_UserName_and_password(String un, String pwd) throws Throwable {
	driver.findElement(By.id("txtuId")).sendKeys(un);
	driver.findElement(By.id("txtPword")).sendKeys(pwd);
	driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		 
}

@Then("^Verifying Admin Login validation$")
public void verifying_Admin_Login_validation() throws Throwable {
	String Actval = driver.findElement(By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[4]/strong/font/font")).getText();
	System.out.println(Actval);
	String Expval = "Welcome to Admin";

if (Expval.equalsIgnoreCase(Actval)) 
{
System.out.println("adminhome is displayed");
//	return "pass";
}
else
{
	System.out.println("adminhome is not displayed"); 
}
}
@When("^User Clicks on Logout$")
public void user_Clicks_on_Logout() throws Throwable {
	  driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")).click();

}


		 
}
