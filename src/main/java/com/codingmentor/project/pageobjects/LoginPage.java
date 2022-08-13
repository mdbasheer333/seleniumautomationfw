package com.codingmentor.project.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	
	WebDriver loginPageDriver;
	
	public LoginPage(WebDriver driver) {
		loginPageDriver=driver; 
	}

	public void login(String userName, String password) {
		// login stage
		loginPageDriver.findElement(By.linkText("Account")).click();
		loginPageDriver.findElement(By.id("username")).sendKeys(userName);
		loginPageDriver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
		loginPageDriver.findElement(By.xpath("//input[@name='rememberme']")).click();
		loginPageDriver.findElement(By.xpath("//button[text()='Log in']")).click();
	}
	
}
