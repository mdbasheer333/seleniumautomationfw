package com.codingmentor.project.testngprog.pack2;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class MyTestNG2 {

	@BeforeSuite
	public void beforeSuit() {
		System.out.println("*******before suit***********");
	}
	
	@AfterSuite
	public void afetrSuit() {
		System.out.println("*******after suit***********");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("------------i am before class-------");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("------------i am after class-------");
	}
	
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
