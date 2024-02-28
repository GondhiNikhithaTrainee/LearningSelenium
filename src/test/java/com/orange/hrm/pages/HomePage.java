package com.orange.hrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.orange.hrm.test.BaseTest;

public class HomePage {
	
	@FindBy(xpath = "//span[text()='Admin']")
	WebElement Adminlink;
	
	@FindBy(xpath = "//img[@alt='profile picture']")
	WebElement profilePicture;
	
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement logOut;
	
	public HomePage()
	{
		PageFactory.initElements(BaseTest.driver, this);
		
	}
	
	public void clickonAdminLink()
	{
		Adminlink.click();
	}
	public void logOut()
	{
		profilePicture.click();
		logOut.click();
	}
	
}
