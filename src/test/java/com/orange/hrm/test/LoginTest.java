package com.orange.hrm.test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;

import com.orange.hrm.pages.LoginPage;
import com.utility.excelUtility;

public class LoginTest extends BaseTest{
	@Test
	public void loginWithValidUsernameAndPassword() throws InvalidFormatException, IOException
	{
		LoginPage login=new LoginPage();
		
		login.loginToApplication(excelUtility.getTestData(1, 0), excelUtility.getTestData(1, 1));
	}
	
	}
