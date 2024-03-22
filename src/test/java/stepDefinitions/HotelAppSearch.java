package stepDefinitions;

import io.cucumber.java.After;
import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HotelAppSearch {
	WebDriver driver;
	String ExpectedURL = "https://adactinhotelapp.com/";
	
	@After
	public void t2() {
		driver.quit();
	}
	@Given("I am on Hotel app login")
	public void i_am_on_hotel_app_login() {
	    // Write code here that turns the phrase above into concrete actions
		driver=new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://adactinhotelapp.com/");
	    // Write code here that turns the phrase above into concrete actions
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,ExpectedURL);

	}

	@When("I enter username {string}")
	public void i_enter_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(string);
	}

	@When("I enter password {string}")
	public void i_enter_password(String password) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("I click login")
	public void i_click_login() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("login")).click();
	}

	@Then("I login Successfully")
	public void i_login_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("I enter City {string}")
	public void i_enter_city(String locationname) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebElement location_name=driver.findElement(By.id("location"));
        Select select=new Select(location_name);
        select.selectByValue(locationname);
	}

	@When("I enter Hotel name {string}")
	public void i_enter_hotel_name(String hotelname) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement hotel_name=driver.findElement(By.id("hotels"));
        Select select1=new Select(hotel_name);
        select1.selectByVisibleText(hotelname);
	}

	@When("I enter Room type {string}")
	public void i_enter_room_type(String roomtype) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement room=driver.findElement(By.id("room_type"));
        Select select2=new Select(room);
        select2.selectByVisibleText(roomtype);
	}

	@When("I enter Number of rooms {string}")
	public void i_enter_number_of_rooms(String roomno) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement noroom=driver.findElement(By.id("room_nos"));
        Select select3=new Select(noroom);
        select3.selectByVisibleText(roomno);
	}

	@When("I click on Search")
	public void i_click_on_search() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("Submit")).click();
	}

	/*@Then("the search is Successful")
	public void the_search_is_successful() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}*/

}
