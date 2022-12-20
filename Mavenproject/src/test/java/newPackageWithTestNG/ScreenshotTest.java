package newPackageWithTestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

@Listeners(CustomListener.class)
public class ScreenshotTest extends BaseClass {

	@BeforeMethod
	public void setup() {
		initialization();
	}

	@AfterMethod
	public void tearDown() {
		driver.close();

	}

	@Test
	public void takeScreenshotTest1() {
		
		Assert.assertEquals(true, false);
	
	}

	@Test
	public void takeScreenshotTest2() {
		Assert.assertEquals(true, true);
	
	}

}
