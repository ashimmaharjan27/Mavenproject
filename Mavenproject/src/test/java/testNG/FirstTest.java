package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstTest {

	public static WebDriver driver;
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("FirstTest- Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("FirstTest- Before Method1");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("FirstTest- After Class");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("FirstTest- After Method");
	}
	
	@Test(priority = 1)
	public void betatest() {
		System.out.println("FirstTest- Test 2");
	}
	
	@Test(priority = 2)
	public void alphatest() {
		System.out.println("FirstTest- Test 1");
	}
	
		
	}

