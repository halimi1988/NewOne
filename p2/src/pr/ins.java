package pr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhal\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver j = new ChromeDriver();
		
		j.get("http://googl.com");
	//	j.manage().timeout().
		j.manage().deleteAllCookies();
		j.manage().window().maximize();
		
		
		WebElement se = j.findElement(By.xpath("//textarea[@id='APjFqb']"));
		se.sendKeys("Afghanistan");
		
		WebElement eng = j.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]"));
	     eng.click();
	   
	     
	     j.close();
	
	}

	

}
