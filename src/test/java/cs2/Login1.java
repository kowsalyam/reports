package cs2;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cs1.UtilityClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login1{
	WebDriver driver;
	@Given("I want to write a step with {string}")
	public void i_want_to_write_a_step_with(String name) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver=UtilityClass.getDriver("chrome");
		//driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
		driver.get("https://10.232.237.143/TestMeApp/fetchcat.htm");
	      driver.findElement(By.id("details-button")).click();
	      driver.findElement(By.id("proceed-link")).click();	
	      driver.findElement(By.linkText("SignIn")).click();
	      driver.findElement(By.name("userName")).sendKeys(name);
	}

	@And("i have to give {string}")
	public void i_have_to_give(String password) {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new cucumber.api.PendingException();
		driver.findElement(By.name("password")).sendKeys(password);
	}

	@When("I give sumbit")
	public void i_give_sumbit() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 driver.findElement(By.name("Login")).click();
	}

	@Then("I login to next page")
	public void i_login_to_next_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Assert.assertEquals("Login", driver.getTitle());
		System.out.println("User regsited sucessfully");
	}
	
	@When("clicks the search tab & enters the first four letters of the product")
	public void clicks_the_search_tab_enters_the_first_four_letters_of_the_product() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		  driver.findElement(By.id("myInput")).sendKeys("Head");
	}

	@When("selects product from drop down")
	public void selects_product_from_drop_down() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("html/body/div[1]/form/div[1]/input")).click();
	}

	@When("clicks on find details")
	public void clicks_on_find_details() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
	}

	@When("adds the product to cart")
	public void adds_the_product_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		driver.findElement(By.xpath("html//body//section//div//div//div[2]//div//div//div//div[2]//center//a")).click();
	}

	@Then("user should be in add to cart page")
	public void user_should_be_in_add_to_cart_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 Assert.assertEquals("Search",driver.getTitle());
		 System.out.println("user is in search page");
	}







}


