import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URL url = new URL("http://www.qspiders.com");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		int code = con.getResponseCode(); //if code is 200, then link is not broken
		System.out.println(code);
		String msg = con.getResponseMessage(); //if msg is Ok, then link is not broken
		System.out.println(msg);
	}

}
