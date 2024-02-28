package com.orange.hrm.test;

import org.testng.annotations.Test;

import com.orange.hrm.pages.HomePage;

public class HomeTest extends BaseTest {
	@Test
	public void logOut()
	{
		HomePage homepage=new HomePage();
		homepage.clickonAdminLink();
		homepage.logOut();
	}

}
