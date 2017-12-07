package Cucmber_demo.cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resource/features",
        format = {"pretty", "html:target/cucumber", "json:target/cucumber-report.json"})
public class RunnerTest 
{

	
	
	
}
