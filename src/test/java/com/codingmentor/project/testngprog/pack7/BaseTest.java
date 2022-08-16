package com.codingmentor.project.testngprog.pack7;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	@BeforeMethod
	public void bm() {
		System.out.println("launch browser");
		System.out.println("login to app");
	}
	
	@AfterMethod
	public void am() {
		System.out.println("logout from app");
		System.out.println("clsoe browser");
	}
}
