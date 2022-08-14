package com.codingmentor.project.testngprog.pack1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTestNG7 {

	
	@Test(dependsOnMethods = {"placeorder"})
	public void cancelorder() {
		System.out.println("MyTestNG1 - this is my cancelorder ");
	}
	
	
	@Test()
	public void placeorder() {
		System.out.println("MyTestNG1 - this is my placeorder ");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = {"cancelorder"})
	public void verifyStatus() {
		System.out.println("MyTestNG1 - this is my verifyStatus ");
	}
	
	@Test()
	public void changedAdress() {
		System.out.println("MyTestNG1 - this is my changedAdress ");
	}
	
	
}
