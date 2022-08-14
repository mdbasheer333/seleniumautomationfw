package com.codingmentor.project.testngprog.pack2;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyTestNG1 {

	@BeforeMethod
	public void tearUp() {
		System.out.println("launching browser");
		System.out.println("login to applicaton");
	}

	@AfterMethod
	public void tearDown() {
		System.out.println("logout from app");
		System.out.println("close browse");
	}

	@Test
	public void placeorder() {
		System.out.println("---------place order--------");
	}

	@Test
	public void cancelorder() {
		System.out.println("---------cancel order--------");
	}

}
