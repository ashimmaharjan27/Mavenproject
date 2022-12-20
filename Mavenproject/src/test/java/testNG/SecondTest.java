package testNG;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SecondTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("SecondTest-Before suite");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("SecondTest-Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("SecondTest-After Class");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("SecondTest-After Suite");
	}
	
	@Test(enabled = true)
	public void betatest() {
		System.out.println("SecondTest-Test 2");
	}
	
	@Test(enabled = false)
	public void alphatest() {
		System.out.println("SecondTest-Test 1");
	}
	
		
	}

