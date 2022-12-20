package newPackageWithTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TitleChecking {

	public static WebDriver driver;
	
	@Test(description = " Validating the title of the application")
	public void titleChecking() {
		
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demoqa.com/forms");
	String title = driver.getTitle();
	//System.out.println(title);
	Assert.assertEquals(title, "ToolsQA");
	driver.close();
	
		
	}
}
