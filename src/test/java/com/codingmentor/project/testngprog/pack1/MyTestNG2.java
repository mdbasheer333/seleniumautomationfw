package com.codingmentor.project.testngprog.pack1;

import org.testng.annotations.Test;

public class MyTestNG2 {

	
	@Test()
	public void login() {
		System.out.println("MyTestNG1 - this is my login");
	}
	
	@Test(priority = 2)
	public void cancelorder2() {
		System.out.println("MyTestNG1 - this is my cancelorder2 ");
	}
	
	@Test(priority = 2)
	public void cancelorder1() {
		System.out.println("MyTestNG1 - this is my cancelorder1 ");
	}
	
	@Test(priority = 1)
	public void placeorder() {
		System.out.println("MyTestNG1 - this is my placeorder ");
	}
	
	@Test(priority = 3)
	public void verifyStatus() {
		System.out.println("MyTestNG1 - this is my verifyStatus ");
	}
	
}
