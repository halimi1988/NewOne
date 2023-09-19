package selenuiamp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewPractice {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhal\\Desktop\\Chrom browser\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://googl.com");
		
		
		
		
	}

}
