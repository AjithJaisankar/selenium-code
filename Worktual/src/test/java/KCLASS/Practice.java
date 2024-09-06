package KCLASS;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Browser name");
		
		
		String browser = sc.next();
		
		 WebDriver driver = null;
		 if(browser.equals("Firefox"))
		 {
		 System.setProperty("webdriver.gecko.driver",
		 "./drivers/geckodriver.exe");
		 driver = new FirefoxDriver();
		 }
		 else
		 if(browser.equals("Chrome"))
		 {
		 System.setProperty("https://www.google.co.in/", browser);
		 driver = new ChromeDriver();
		 }
		 else
		 {
		 System.out.println("Invalid browser");
	}
}
}
