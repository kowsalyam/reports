package cs1;

import static org.testng.AssertJUnit.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.utility.Drivers;

//import com.utility.Drivers;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cs1code {
 WebDriver driver;
	
	
	
	@Given("url")
	public void url() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver=UtilityClass.getDriver("chrome");
		//driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
	      driver.findElement(By.id("details-button")).click();
	      driver.findElement(By.id("proceed-link")).click();	
	      driver.findElement(By.linkText("SignUp")).click();
		
		
	}
	
	@And("enter the username {string}")
	public void enter_the_username(String un) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		driver.findElement(By.name("userName")).sendKeys(un);
	}

	@And("enter the firstname {string}")
	public void enter_the_firstname(String fn) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("firstName")).sendKeys(fn);
	}

	@And("enter the lastname {string}")
	public void enter_the_lastname(String ln) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("lastName")).sendKeys(ln);
	}

	@And("enter the password {string}")
	public void enter_the_password(String pwd) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("password")).sendKeys(pwd);
	}

	@And("enter the confirm password {string}")
	public void enter_the_confirm_password(String pwd) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.name("confirmPassword")).sendKeys(pwd);
	}

	@And("enter the gender Female")
	public void enter_the_gender_Female() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@value= 'Female']")).click();
	}

	@And("enter the email {string}")
	public void enter_the_email(String eml) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.name("emailAddress")).sendKeys(eml);
	}

	@And("enter the  mobile {string}")
	public void enter_the_mobile(String mbl) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.name("mobileNumber")).sendKeys(mbl);
		 
	}

	@And("enter the dob {string}")
	public void enter_the_dob(String dob) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.name("dob")).sendKeys(dob);
}

	@And("enter the address {string}")
	public void enter_the_address(String add) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.name("address")).sendKeys(add);
	}

	@And("i click the security question")
	public void i_click_the_security_question() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	      Select sel=new Select(driver.findElement(By.name("securityQuestion")));
	      sel.selectByIndex(1);
	}

	@And("i give security answer {string}")
	public void i_give_security_answer(String qns) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	      driver.findElement(By.name("answer")).sendKeys(qns);
	}

	@When("i click register button")
	public void i_click_register_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.name("Submit")).click();
	}

	@Then("i see my home page")
	public void i_see_my_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//Assert.assertEquals("Login",driver.getTitle());
		//System.out.println("User regsited sucessfully");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
}
