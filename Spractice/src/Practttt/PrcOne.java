package Practttt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrcOne {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhal\\Desktop\\Chrome 32 new\\chromedriver.exe");

		WebDriver Abdullah = new ChromeDriver();
		Abdullah.get("https://www.yahoo.com");
		String t = Abdullah.getTitle();
		System.out.println(t);
		Abdullah.manage().window().fullscreen();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Abdullah.quit();
		Abdullah.close();
	}

}
