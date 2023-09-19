package selenuiamp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Se {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\ccc\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.google.com");
		String ti = dr.getTitle();
		System.out.println(ti);
		// the guit will close all tabs one tab but dr.close will cloase the one tab 
		//dr.quit();
		//dr.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}

}
