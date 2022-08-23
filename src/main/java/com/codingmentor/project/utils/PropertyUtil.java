package com.codingmentor.project.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {

	public static String getProperty(String key) {
		Properties prop = new Properties();
		FileInputStream fis;
		String propertyValue = null;
		try {
			fis = new FileInputStream(
					new File(System.getProperty("user.dir") + "\\src\\main\\resources\\properties.properties"));
			prop.load(fis);
			propertyValue = prop.getProperty(key);
		} catch (IOException e) {
			System.out.println("there is some issue in property file reading");
		}
		return propertyValue;
	}

}
