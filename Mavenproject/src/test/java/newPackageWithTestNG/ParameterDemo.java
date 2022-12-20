package newPackageWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterDemo {

	public static WebDriver driver;

	@BeforeMethod
	@Parameters({ "url" })
	public void setup(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@Test(description = "Validating Title", priority = 2, groups = "nopCommerce")
	@Parameters({ "actualTitle" })
	public void titleTest(String actualtitle) {
		String expectedTitle = driver.getTitle();
		System.out.println(expectedTitle);
		Assert.assertEquals(expectedTitle, actualtitle);
	}
	
	@Test(description = "Validating url", priority = 1, groups = "nopCommerce")
	@Parameters({ "url" })
	public void urlTest(String url) {
		String expectedUrl = driver.getCurrentUrl();
		System.out.println(expectedUrl);
		Assert.assertEquals(expectedUrl, url);
	}

		
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
