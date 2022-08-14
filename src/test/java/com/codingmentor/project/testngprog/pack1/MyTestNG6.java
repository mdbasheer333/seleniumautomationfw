package com.codingmentor.project.testngprog.pack1;

import org.testng.annotations.Test;

public class MyTestNG6 {

	
	@Test(timeOut = 3000)
	public void mytest1() throws InterruptedException {
		System.out.println("MyTestNG1 - this is my test1 ");
		Thread.sleep(4000);
		System.out.println("MyTestNG1 - this is my test1 ");
	}
	
	
}
