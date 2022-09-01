package com.codingmentor.project.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShippingAddressPage extends BasePage{
	
	public ShippingAddressPage(WebDriver driver) {
		super(driver);
	}
	
	 By address = By.xpath("//a[text()='Addresses']");
	 By sfname=By.id("shipping_first_name");
	
	public void shippingAddressEntry() {
		// shipping address entry
		driver.findElement(address).click();
		driver.findElement(By.xpath("//a[@href=\"https://askomdch.com/account/edit-address/shipping/\"]")).click();
		driver.findElement(sfname).sendKeys("Kishore");
		driver.findElement(By.name("shipping_last_name")).sendKeys("Bolgam");
		driver.findElement(By.xpath("//p[@id='shipping_company_field']//descendant::input[1]"))
				.sendKeys("Microsoft Pvt.Ltd");
		WebElement region = driver.findElement(By.xpath("//select[@autocomplete='country']"));
		Select country = new Select(region);
		country.selectByValue("IN");
		driver.findElement(By.id("shipping_address_1")).sendKeys("10-4-c/949/a");
		driver.findElement(By.id("shipping_address_2")).sendKeys("Gurukrupa");
		driver.findElement(By.id("shipping_city")).sendKeys("Malkajgiri");
		
		WebElement State = driver.findElement(By.id("shipping_state"));
		selectValueBytext(State, "Telangana");
		
		driver.findElement(By.id("shipping_postcode")).sendKeys("500047");
		driver.findElement(By.xpath("//button[@name='save_address']")).click();
	}

	public void shippingAddressValidation() {
		// shipping address verification
		driver.findElement(address).click();
		driver.findElement(By.xpath("//a[@href=\"https://askomdch.com/account/edit-address/shipping/\"]")).click();
		driver.findElement(By.xpath("//input[@value='Kishore']")).getAttribute("value");
		String BFN = driver.findElement(By.xpath("//input[@value='Kishore']")).getAttribute("value");
		System.out.println("User Shipping address First Name : " + BFN);
		String BLN = driver.findElement(By.xpath("//input[@value]//following::input[1]")).getAttribute("value");
		System.out.println("User Shipping address Last Name : " + BLN);
		String CN = driver.findElement(By.xpath("//input[@value]//following::input[2]")).getAttribute("value");
		System.out.println("Shipping address Company Name : " + CN);
		WebElement region = driver.findElement(By.xpath("//select[@autocomplete='country']"));
		String Country = region.getAttribute("value");
		System.out.println("Shipping address Country Name displayed :" + Country);
		String ADD1 = driver.findElement(By.xpath("//input[@value]//following::input[3]")).getAttribute("value");
		System.out.println("Shipping address Address Line One : " + ADD1);
		String ADD2 = driver.findElement(By.xpath("//input[@value]//following::input[4]")).getAttribute("value");
		System.out.println("Shipping address Address Line One 2 : " + ADD2);
		String TC = driver.findElement(By.xpath("//input[@value]//following::input[5]")).getAttribute("value");
		System.out.println("User Shipping address Town or City : " + TC);
		WebElement State = driver.findElement(By.id("shipping_state"));
		String ST = State.getAttribute("value");
		System.out.println("Shipping address State Name displayed : " + ST);
		String PIN = driver.findElement(By.xpath("//input[@value]//following::input[6]")).getAttribute("value");
		System.out.println("User Shipping address Postal Code : " + PIN);
		System.out.println("Successfully verified all the fields of the form Hurray!! ");
	}

}
