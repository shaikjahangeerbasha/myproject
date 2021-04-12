package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Rolestep {
	WebDriver driver;
@Given("^User should be Ranford Home page$")
public void user_should_be_Ranford_Home_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\jahan\\eclipse-workspace.project\\ecommers\\src\\ecommersjars\\chromedriver.exe");

	  driver= new ChromeDriver();
	driver.manage().window().maximize();
			driver.get("http://122.175.8.158/ranford2");
}

@When("^tester should enter  user name and password$")
public void tester_should_enter_user_name_and_password() throws Throwable {
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	driver.findElement(By.id("txtPword")).sendKeys("Testing@");
	driver.findElement(By.xpath("//*[@id=\"login\"]")).click();
		 
}

@Then("^tester Validate Login functionality$")
public void tester_Validate_Login_functionality() throws Throwable {
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

@When("^tester click on new role button$")
public void tester_click_on_new_role_button() throws Throwable {
	driver.findElement(By.xpath((" //*[@id=\"Table_01\"]/tbody/tr[2]/td/table/tbody/tr[4]/td/a/img\r\n"
			))).click();

}

@When("^tester  enters \"([^\"]*)\" and \"([^\"]*)\" and click on submit$")
public void tester_enters_and_and_click_on_submit(String ji, String po) throws Throwable {
	driver.findElement(By.xpath("//*[@id=\"btnRoles\"]")).click();
	driver.findElement(By.xpath("//*[@id=\"txtRname\"]")).sendKeys(ji);
driver.findElement(By.xpath("//*[@id=\\\"lstRtypeN\\\"]")).sendKeys(po);

}

@Then("^tester close the application$")
public void tester_close_the_application() throws Throwable {
	  driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/table/tbody/tr/td[4]/table/tbody/tr/td[3]/a/img")).click();

}


}
