package KCLASS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

	WebDriver  ajith;

	@Test
	public void a_setup()
	{
		 ajith = new ChromeDriver();
		//WebDriver ajith=new ChromeDriver();

		ajith.get("https://booking.worktual.co.uk");
	

		
	}
	
	@Test
	public void b_login() {
System.out.println("ajith");
	
	
//		
	}

}
