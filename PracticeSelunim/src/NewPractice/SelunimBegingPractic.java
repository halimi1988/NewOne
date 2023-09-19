package NewPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelunimBegingPractic {

	public static void main(String[] args) {
		
		

		System.setProperty("webDriver.Chorme.driver", "C:\\Users\\abhal\\Desktop\\Chrom browser\\chromedriver.exe");
		
		WebDriver ab = new ChromeDriver();
		ab.get("http//www.google.com");
	}

}
