package stepDefinitions;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HotelAppLoginTest {
	WebDriver driver;
	String ExpectedURL = "https://adactinhotelapp.com/";
	
	@After
	public void t2() {
		driver.quit();
	}
	@Given("I am on Hotel App Login Page")
	public void i_am_on_hotel_app_login_page() {
		driver=new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://adactinhotelapp.com/");
	    // Write code here that turns the phrase above into concrete actions
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,ExpectedURL);
	}

	@When("I enter username as {string}")
	public void i_enter_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(string);
	}

	@When("I enter password as {string}")
	public void i_enter_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("I click Login")
	public void i_click_login() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login")).click();
	}

	@Then("I am Logged in Successfully")
	public void i_am_logged_in_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		String Greeting=driver.findElement(By.id("username_show")).getAttribute("value");
		Assert.assertEquals(Greeting,"Hello vasuvespag!");
	}

}
