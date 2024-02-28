package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class orangeHRMTest {
	ChromeDriver driver;
	@Test
	public void login() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//enter username 
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		//enter password 
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		
		//click on login page 
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		
		
	}
	@Test
	public void testAdmin() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		Thread.sleep(2000);
		boolean isDisplayed=driver.findElement(By.xpath("//h5[text()='System Users']")).isDisplayed();
		Assert.assertTrue(isDisplayed);
		
	}
	@Test
	public void testLogout() throws InterruptedException
	{
		driver.findElement(By.xpath("//img[@alt='profile picture']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}


}
