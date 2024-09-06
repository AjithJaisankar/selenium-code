package KCLASS;

import org.testng.annotations.Test;

public class TesTng_Basics {

	@Test(priority=1)
	public void setup() {
		
		System.out.println("one");
		
	}
	@Test(priority=2)
	public void setup1() {
		
		System.out.println("one1");
		
	}
	
	@Test(priority=3)
	public void setup3() {
		System.out.println("one3");
	}
}
