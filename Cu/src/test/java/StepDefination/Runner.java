package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src\\test\\resources", glue= {"StepDefination"},
monochrome = true,

plugin = {"pretty", 
		"junit:target/c-reports/c.xml"
		
		}	
		)

//"html:target/c-reports/report.html"
//"pretty", "json:target/c-reports/report.json"


public class Runner {

	
	
	
	
	
	
}
