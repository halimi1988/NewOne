package Practttt;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class rodiabotoon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abhal\\Desktop\\Chrome 32 new\\chromedriver.exe");
		WebDriver aa = new ChromeDriver();
		//Thread.sleep();
		aa.get("http://tek-school.com/retail/index.php?route=account/register");
		WebDriverWait wait = new WebDriverWait(aa,Duration.ofSeconds(30)); 
		aa.manage().window().maximize();
	    Thread.sleep(6000);
		boolean  bo = false;
		WebElement sect = aa.findElement(By.xpath("(// input[@name = 'newsletter'])[1]"));
		
		if (!sect.isSelected()) {
			System.out.println(sect.isSelected());
			sect.click();
			System.out.println(sect.isSelected());
		}
	}

}
