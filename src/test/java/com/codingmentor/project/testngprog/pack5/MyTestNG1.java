package com.codingmentor.project.testngprog.pack5;

import org.testng.annotations.Test;

public class MyTestNG1 {


	@Test(groups = {"sanity"})
	public void myTest1() {
		System.out.println("MyTestNG1 method is myTest1");
	}
	
	@Test(groups = {"sanity"})
	public void myTest2() {
		System.out.println("MyTestNG1 method is myTest2");
	}
	
	@Test(groups = {"smoke", "regression"})
	public void myTest3() {
		System.out.println("MyTestNG1 method is myTest3");
	}
	
	@Test(groups = {"regression"})
	public void myTest4() {
		System.out.println("MyTestNG1 method is myTest4");
	}
	
	@Test(groups = {"regression"})
	public void myTest5() {
		System.out.println("MyTestNG1 method is myTest5");
	}
	
	@Test(groups = {"regression"})
	public void myTest6() {
		System.out.println("MyTestNG1 method is myTest6");
	}
	
}
