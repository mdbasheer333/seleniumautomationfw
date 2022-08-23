package com.codingmentor.project.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver loginPageDriver;

	public LoginPage(WebDriver driver) {
		loginPageDriver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Account")
	WebElement linkAccount;

	@FindBy(id = "username")
	WebElement txtuserName;

	@FindBy(css = "input[type='password']")
	WebElement txtpassword;

	@FindBy(xpath = "//input[@name='rememberme']")
	WebElement chkBoxRemember;

	@FindBy(xpath = "//button[text()='Log in']")
	WebElement btnLogin;

	public void login(String userName, String password) throws InterruptedException {
		linkAccount.click();
		Thread.sleep(2000);
		txtuserName.sendKeys(userName);
		txtpassword.sendKeys(password);
		chkBoxRemember.click();
		btnLogin.click();
	}

}
