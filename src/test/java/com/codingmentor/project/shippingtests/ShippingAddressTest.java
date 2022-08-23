package com.codingmentor.project.shippingtests;

import org.testng.annotations.Test;

import com.codingmentor.project.BaseTest;
import com.codingmentor.project.pageobjects.LoginPage;
import com.codingmentor.project.pageobjects.ShippingAddressPage;
import com.codingmentor.project.utils.PropertyUtil;

public class ShippingAddressTest extends BaseTest{

	@Test
	
	public void tc02_ShippingAddressTest() throws InterruptedException {
	
		
		String uname=PropertyUtil.getProperty("userid");
		String pwd=PropertyUtil.getProperty("password");
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(uname, pwd);

		ShippingAddressPage shippingAddressPage = new ShippingAddressPage(driver);
		shippingAddressPage.shippingAddressEntry();
		
	}

}
