package com.codingmentor.project.shippingtests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.codingmentor.project.BaseTest;
import com.codingmentor.project.pageobjects.LoginPage;
import com.codingmentor.project.pageobjects.ShippingAddressPage;

public class ShippingAddressVerifyTest extends BaseTest{

	
	@Test
	@Parameters({"username","password"})
	public void tc01_ShippingAddressVerifyTest(String uname, String pwd) throws InterruptedException {
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(uname, pwd);

		ShippingAddressPage shippingAddressPage = new ShippingAddressPage(driver);
		shippingAddressPage.shippingAddressValidation();
		
	}

}
