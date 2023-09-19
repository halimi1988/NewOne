package stepDifination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Initalizer extends Base {
	
	
public void beforhook() {
		
		String broswer = Base.getBrowserName();
		
		switch (broswer) {
		
		case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break;
		case "FF":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;
		case "IE":
		WebDriverManager.iedriver().setup();
		driver = new InternetExplorerDriver();
		break;
		default:
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(getPageLoad(),TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(getImplicitWate(),TimeUnit.SECONDS );
		
}
	
	
	public void afterhook () {
	Base.tearDown();
}	
	
	
	
	
	
	

}
