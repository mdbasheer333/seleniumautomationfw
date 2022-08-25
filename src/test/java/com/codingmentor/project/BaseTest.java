package com.codingmentor.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.codingmentor.project.utils.PropertyUtil;

public class BaseTest {

	public WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browserType"})
	public void tearUp(String browserType) throws Exception {
		
		String browTy=PropertyUtil.getProperty("browerToSelect");
		String br= System.getProperty("browser");
		
		System.out.println("command line value is " + br);
		
		System.out.println("--------------- " + System.getProperty("name"));
		System.out.println("----------- " + System.getProperty("city"));
		System.out.println("----------- " + System.getProperty("age"));
		
		if(browTy!=null) {
			browserType=browTy;
		}
		
		if(br!=null) {
			browserType=br;
		}
		
		switch (browserType) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(PropertyUtil.getProperty("appUrl"));
			driver.manage().window().maximize();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get(PropertyUtil.getProperty("appUrl"));
			driver.manage().window().maximize();
			break;
			
//		case "headless":
//			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\msedgedriver.exe");
//			driver = new HtmlUnitDriver();
//			driver.get(PropertyUtil.getProperty("appUrl"));
//			driver.manage().window().maximize();
//			break;
			
		default:
			throw new Exception("pls select valid broswr");
		}
	}
	
//	@BeforeMethod
//	public void tearUpOnlyCommandLine() throws Exception {
//		String browserType= System.getProperty("browser");
//		switch (browserType) {
//		case "chrome":
//			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
//			driver = new ChromeDriver();
//			driver.get(PropertyUtil.getProperty("appUrl"));
//			driver.manage().window().maximize();
//			break;
//		case "edge":
//			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\msedgedriver.exe");
//			driver = new EdgeDriver();
//			driver.get(PropertyUtil.getProperty("appUrl"));
//			driver.manage().window().maximize();
//			break;
//		default:
//			throw new Exception("pls select valid broswr");
//		}
//	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
