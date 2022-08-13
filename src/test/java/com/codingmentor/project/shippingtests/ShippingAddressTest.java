package com.codingmentor.project.shippingtests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.codingmentor.project.pageobjects.LoginPage;
import com.codingmentor.project.pageobjects.ShippingAddressPage;

public class ShippingAddressTest {

	@Test
	public void tc02_ShippingAddressTest() {
		// intial stage
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rasheed\\Desktop\\basheer\\ftbatch\\seleniumautomationfw\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://askomdch.com/");
		driver.manage().window().maximize();

		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("basheer", "pass#1234");

		ShippingAddressPage shippingAddressPage = new ShippingAddressPage(driver);
		shippingAddressPage.shippingAddressEntry();

		// post activities
		driver.close();
	}

}
