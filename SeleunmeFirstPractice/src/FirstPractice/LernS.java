package FirstPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LernS {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhal\\Desktop\\Chrom browser\\chromedriver.exe");

		
		WebDriver Bes = new ChromeDriver();
		
		Bes.get("http://www.google.com");
	}

}
