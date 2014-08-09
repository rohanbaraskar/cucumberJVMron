package Simple.Cucumberwa;

import java.util.concurrent.TimeUnit;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefsLogin {
	WebDriver driver = new FirefoxDriver();
	
	
	
	@Given("^I am on \"([^\"]*)\"$")
	public void I_am_on(String url) throws Throwable {
	 driver.get(url);
	 
	   
	}

	@And("^I insert userId as \"([^\"]*)\" in input field id \"([^\"]*)\"$")
	public void I_insert_userId_as_in_input_field_id(String id, String userid) throws Throwable {
	    driver.findElement(By.id(userid)).sendKeys(id);
	}

	@And("^I insert password as \"([^\"]*)\" in input field id \"([^\"]*)\"$")
	public void I_insert_password_as_in_input_field_id(String password, String id) throws Throwable {
		driver.findElement(By.id(id)).sendKeys(password);
	}

	@When("^I click on Sigin button having name \"([^\"]*)\"$")
	public void I_click_on_Sigin_button_having_id(String arg1) throws Throwable {
		Thread.sleep(1000);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name(arg1)).click();
	    
	}

	@And("^I wait for \"([^\"]*)\" seconds$")
	public void I_wait_for_seconds(String arg1) throws Throwable {
		Thread.sleep(1000);
	   
	}

	@Then("^I should get logged in succesfully$")
	public void I_should_get_logged_in_succesfully() throws Throwable {
	
		Assert.assertTrue(driver.getPageSource().contains("People You May Know"));
		driver.close();
	   
	}
	
	@When("^I insert ([^\"]*) as userid$")
	public void I_insert_as_userid(String usrid) throws Throwable {
		driver.findElement(By.id("Email")).sendKeys(usrid);
	   
	}

	@When("^I insert ([^\"]*) as password$")
	public void I_insert_password_as_password(String pswd) throws Throwable {
		driver.findElement(By.id("Passwd")).sendKeys(pswd);
		driver.findElement(By.id("signIn")).click();
	}

	@Then("^I get ([^\"]*) from webpage$")
	public void I_getfrom_webpage(String title) throws Throwable {
		Assert.assertTrue(driver.getPageSource().contains(title));
		driver.close();
	    
	   
	}

	
}
