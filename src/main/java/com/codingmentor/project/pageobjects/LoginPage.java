package com.codingmentor.project.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
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
		waitForElement(txtuserName);
		txtuserName.sendKeys(userName);
		txtpassword.sendKeys(password);
		chkBoxRemember.click();
		waitForElementClickable(btnLogin);
		btnLogin.click();
	}
	
	public void logut() throws InterruptedException {
		linkAccount.click();
		waitForElementClickable(btnLogin);
	}
	
}
