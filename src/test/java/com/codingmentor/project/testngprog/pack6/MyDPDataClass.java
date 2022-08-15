package com.codingmentor.project.testngprog.pack6;

import org.testng.annotations.DataProvider;

public class MyDPDataClass {
	@DataProvider(name = "myDataProv1")
	public static Object[][] myDp1(){
		Object data[][]=new Object[1][3];
		data[0][0]="arshad";
		data[0][1]="arshad#1234";
		data[0][2]="arshad@gmail.com";
		return data;
	}
}
