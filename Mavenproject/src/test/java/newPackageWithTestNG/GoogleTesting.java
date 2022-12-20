package newPackageWithTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTesting {
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("https://www.google.com/");
		
	}
	
	@Test(enabled = false)
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Google");
		}
	
	@Test
	public void logoTest() {
		boolean logo = driver.findElement(By.xpath("//*[@id=\"lawson-cta-animated\"]")).isDisplayed();
		Assert.assertTrue(logo);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
}
