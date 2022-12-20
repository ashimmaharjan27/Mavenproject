package seleniumDemo;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CookiesDemo {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//How to capture cookies from browser
		driver.get("https://demo.nopcommerce.com/");
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("Number of cookies :" + cookies.size());
		
		//How to print cookies from browser?
		for(Cookie cookie:cookies) {
			String name = cookie.getName();
			String value = cookie.getValue();
			System.out.println(name + " : " + value);
		}
		//How to add cookies to browser
			Cookie cookieobj = new Cookie("MyCookies1234", "987654321");
			driver.manage().addCookie(cookieobj);
			
			cookies = driver.manage().getCookies();
			System.out.println("Number of cookies after adding:" + cookies.size());
		
			
		//How to delete cookies
//			driver.manage().deleteCookie(cookieobj);
//			cookies = driver.manage().getCookies();
//			System.out.println("Number of cookies after deleting:" + cookies.size());
			
			
		//How to delete specific cookie from the browser
//			driver.manage().deleteCookieNamed("MyCookies1234");
//			cookies = driver.manage().getCookies();
//			System.out.println("Number of cookies after deleting:" + cookies.size());
			
		//How to delete all cookies 
			driver.manage().deleteAllCookies();
			cookies = driver.manage().getCookies();
			System.out.println("Number of cookies after deleting:" + cookies.size());
			
			driver.quit();
	}
	

}
