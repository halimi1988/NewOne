package base;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Base {

	public static WebDriver  driver ; 
	public static Properties properties;
	public static Logger L;
	private static String UserDr = System.getProperty("User.Dr"); 
	private static String phatProperty = "\\src\\test\\recose\\InputData\\Proterty.properties";
	private static String pp = UserDr+phatProperty;
	
	
	
	public Base() {
			BufferedReader reader;
			try {
				reader = new BufferedReader (new FileReader(pp));
				
				properties = new Properties();
				
				try {
				properties.load(reader);
				reader.close();}
				catch(FileNotFoundException e) {
					
					e.printStackTrace();}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	// Methods of Base class.
	
	public static String getBrowserName() {
		String ba = properties.getProperty("browser");
		return ba;	
	}
	
	public static String getURL() {
		String ur = properties.getProperty("url");
		return ur;
	}
	public static long getPageLoad() {
		String ge = properties.getProperty("pageload");
		return Long.parseLong(ge);
	}
	public static long getImplicitWate() {
		String mpli = properties.getProperty("implicitWait");
		return Long.parseLong(mpli);
	}
	
	public static void initialize () {
		driver.get(getURL());
	}
	public static void tearDown() {
		driver.quit();}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
