package com.codingmentor.project.testngprog.pack1;

import org.testng.annotations.Test;

public class MyTestNG3 {

	
	@Test
	public void mytest1() {
		System.out.println("MyTestNG1 - this is my test1 ");
	}
	
	
	@Test(enabled = false)
	public void mytest2() {
		System.out.println("MyTestNG1 - this is my test2 ");
	}
	
	@Test
	public void mytest3() {
		System.out.println("MyTestNG1 - this is my test3 ");
	}
	
}
