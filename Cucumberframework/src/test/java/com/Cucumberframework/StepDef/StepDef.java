package com.Cucumberframework.StepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Cucumberframework.PageObjects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	
	public WebDriver driver;
	public LoginPage lp;
	
	
	@Given("user launch browser")
	public void user_launch_browser() {
		System.setProperty("webdriver.chrome.driver", "/Users/suhas/Desktop/Class/Cucumberframework/drivers/chromedriver");
		driver = new ChromeDriver();
		lp = new LoginPage(driver);
		
	}

	@When("user opens application page {string}")
	public void user_opens_application_page(String url) {
		driver.get(url);
		

	}

	@When("user clicks on Sign In")
	public void user_clicks_on_sign_in() {
		

	}

	@Then("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("click on Sign In")
	public void click_on_sign_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
