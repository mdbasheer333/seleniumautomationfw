package com.codingmentor.project.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	protected WebDriver driver;
	protected WebDriverWait wait;
	
	public  BasePage(WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(this.driver, 30);
	}
	
	public void waitForElement(WebElement element) {
		this.wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitForElementClickable(WebElement element) {
		this.wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void selectValueBytext(WebElement element, String valueToSelect) {
		Select select=new Select(element);
		select.selectByVisibleText(valueToSelect);
	}
	
}
