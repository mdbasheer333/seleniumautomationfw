package com.codingmentor.project.testngprog.pack6;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyTestNG1 {

	@Test
	@Parameters({"username","password"})
	public void login(String uname, String pwd) {
		System.out.println("user name is " + uname + " and password is " + pwd);
	}
	
}
