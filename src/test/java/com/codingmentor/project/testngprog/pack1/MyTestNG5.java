package com.codingmentor.project.testngprog.pack1;

import org.testng.annotations.Test;

public class MyTestNG5 {

	
	@Test(description = "this tc is related to ordrt cance", invocationCount = 3)
	public void mytest1() {
		System.out.println("MyTestNG1 - this is my test1 ");
	}
	
	@Test(description = "this tc is related to ordrt cance", enabled = false)
	public void mytest2() {
		System.out.println("MyTestNG1 - this is my test2 ");
	}
	
	
}
