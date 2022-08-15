package com.codingmentor.project.testngprog.pack6;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MyTestNG2 {

	@Test(dataProvider = "myDataProv")
	public void login(String uname, String pwd, String email) {
		System.out.println("login ---- ");
		System.out.println("user name is " + uname + " and password is " + pwd + " and email is " + email);
		System.out.println("logout ---- ");
	}
	
	@DataProvider(name = "myDataProv")
	public static Object[][] myDp(){
		Object data[][]=new Object[3][3];
		// rows -> no of times a test should exe
		// cols -> no of params of method
		
		data[0][0]="basheer";
		data[0][1]="bash#1234";
		data[0][2]="bash@gmail.com";
		
		data[1][0]="kishore";
		data[1][1]="kishore#1234";
		data[1][2]="kishore@gmail.com";
		
		data[2][0]="imitiaz";
		data[2][1]="imitiaz#1234";
		data[2][2]="imitiaz@gmail.com";
		
		return data;
	}
	
	
	@Test(dataProvider = "myDataProv1", dataProviderClass = MyDPDataClass.class)
	public void cancel(String uname, String pwd, String email) {
		System.out.println("login ---- ");
		System.out.println("user name is " + uname + " and password is " + pwd + " and email is " + email);
		System.out.println("logout ---- ");
	}
	
}
