package newPackageWithTestNG;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.DataProvider;

public class DataProviderclass {
	
	public static WebDriver driver;
	
	@Test(dataProvider = "TestingData" )
	public void test(String email, String password) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(email);
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(password);
				
	}
	
	
	@DataProvider(name = "TestingData")
	Object getData() throws IOException{
		
		String path = System.getProperty("user.dir")+"/Datafile/username.xlsx";
		String sheet = "Sheet1";
		
		return XLUtils.getExcelData(path,sheet);
		
	}
}
