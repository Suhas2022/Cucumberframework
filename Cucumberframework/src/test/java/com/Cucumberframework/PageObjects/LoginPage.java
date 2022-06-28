package com.Cucumberframework.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver cdriver;
	
	public LoginPage(WebDriver rdriver) {
		cdriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//a[@class='login']")
	private WebElement signin;
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement pass;
	@FindBy(xpath="//button[@id='SubmitLogin")
	private WebElement submit;
	
	
	

	
	
				
	

}
