package testNGdemo;

import org.testng.annotations.Test;

public class NewFirstTest {
	
@Test(enabled = true) //we can use enable boolean to include and exclude in Test
	public void alphatest() {
		System.out.println("Alphatest 1");
	}
	
@Test
	public void betatest() {
		System.out.println("Betatest 1");
	}
	
	
}
