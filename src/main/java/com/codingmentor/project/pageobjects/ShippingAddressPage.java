package com.codingmentor.project.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ShippingAddressPage {
	
	WebDriver shippingAddressPageDriver;
	
	public ShippingAddressPage(WebDriver driver) {
		shippingAddressPageDriver=driver;
	}
	
	 By address = By.xpath("//a[text()='Addresses']");
	 By sfname=By.id("shipping_first_name");
	
	public void shippingAddressEntry() {
		// shipping address entry
		shippingAddressPageDriver.findElement(address).click();
		shippingAddressPageDriver.findElement(By.xpath("//a[@href=\"https://askomdch.com/account/edit-address/shipping/\"]")).click();
		shippingAddressPageDriver.findElement(sfname).sendKeys("Kishore");
		shippingAddressPageDriver.findElement(By.name("shipping_last_name")).sendKeys("Bolgam");
		shippingAddressPageDriver.findElement(By.xpath("//p[@id='shipping_company_field']//descendant::input[1]"))
				.sendKeys("Microsoft Pvt.Ltd");
		WebElement region = shippingAddressPageDriver.findElement(By.xpath("//select[@autocomplete='country']"));
		Select country = new Select(region);
		country.selectByValue("IN");
		shippingAddressPageDriver.findElement(By.id("shipping_address_1")).sendKeys("10-4-c/949/a");
		shippingAddressPageDriver.findElement(By.id("shipping_address_2")).sendKeys("Gurukrupa");
		shippingAddressPageDriver.findElement(By.id("shipping_city")).sendKeys("Malkajgiri");
		WebElement State = shippingAddressPageDriver.findElement(By.id("shipping_state"));
		Select state = new Select(State);
		state.selectByVisibleText("Telangana");
		shippingAddressPageDriver.findElement(By.id("shipping_postcode")).sendKeys("500047");
		shippingAddressPageDriver.findElement(By.xpath("//button[@name='save_address']")).click();
	}

	public void shippingAddressValidation() {
		// shipping address verification
		shippingAddressPageDriver.findElement(address).click();
		shippingAddressPageDriver.findElement(By.xpath("//a[@href=\"https://askomdch.com/account/edit-address/shipping/\"]")).click();
		shippingAddressPageDriver.findElement(By.xpath("//input[@value='Kishore']")).getAttribute("value");
		String BFN = shippingAddressPageDriver.findElement(By.xpath("//input[@value='Kishore']")).getAttribute("value");
		System.out.println("User Shipping address First Name : " + BFN);
		String BLN = shippingAddressPageDriver.findElement(By.xpath("//input[@value]//following::input[1]")).getAttribute("value");
		System.out.println("User Shipping address Last Name : " + BLN);
		String CN = shippingAddressPageDriver.findElement(By.xpath("//input[@value]//following::input[2]")).getAttribute("value");
		System.out.println("Shipping address Company Name : " + CN);
		WebElement region = shippingAddressPageDriver.findElement(By.xpath("//select[@autocomplete='country']"));
		String Country = region.getAttribute("value");
		System.out.println("Shipping address Country Name displayed :" + Country);
		String ADD1 = shippingAddressPageDriver.findElement(By.xpath("//input[@value]//following::input[3]")).getAttribute("value");
		System.out.println("Shipping address Address Line One : " + ADD1);
		String ADD2 = shippingAddressPageDriver.findElement(By.xpath("//input[@value]//following::input[4]")).getAttribute("value");
		System.out.println("Shipping address Address Line One 2 : " + ADD2);
		String TC = shippingAddressPageDriver.findElement(By.xpath("//input[@value]//following::input[5]")).getAttribute("value");
		System.out.println("User Shipping address Town or City : " + TC);
		WebElement State = shippingAddressPageDriver.findElement(By.id("shipping_state"));
		String ST = State.getAttribute("value");
		System.out.println("Shipping address State Name displayed : " + ST);
		String PIN = shippingAddressPageDriver.findElement(By.xpath("//input[@value]//following::input[6]")).getAttribute("value");
		System.out.println("User Shipping address Postal Code : " + PIN);
		System.out.println("Successfully verified all the fields of the form Hurray!! ");
	}

}
