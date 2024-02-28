package com.orange.hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.hrm.test.BaseTest;

public class LoginPage {
	
	@FindBy(name = "username")
	WebElement usernameTxtbox;
	
	@FindBy(name = "password")
	WebElement passwordTxtbox;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitTxtbox;
	
	public LoginPage()// to initialise the above locators, you have to initialise using constructor
	{
		PageFactory.initElements(BaseTest.driver, this);//initElements of pagefactory is used to initialise the locators.Accepts 2 
		//parameters (driver and this keyword) .BaseTest isthe test class created in  com.orange.hrm.test package.We are calling 
		//driver object created in Base Test using BaseTest.driver. this keyword is used to refer to current object of this class which
		//is used to refer to all objects i.e. locators of this class.
		//initElements is a static method so u can call it without creating an object.
	}
	public void loginToApplication(String username,String password)
	{
		usernameTxtbox.sendKeys(username);
		passwordTxtbox.sendKeys(password);
		submitTxtbox.click();
	}
	
	

}
