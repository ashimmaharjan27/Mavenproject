package testNGdemo;

import org.testng.annotations.Test;

public class NewSecondTest {

	@Test
	public void alphatest() {
		System.out.println("Alphatest 2");
	}
	
	@Test(enabled = false)
	
	public void betatest() {
		System.out.println("Betatest 2");
	}
	
	
}
