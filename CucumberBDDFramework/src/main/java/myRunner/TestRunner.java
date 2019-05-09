package myRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/elmurotyangiboev/git/CucumberBDDFramework/CucumberBDDFramework/src/main/java/features/taggedhooks.feature",//the path of feature files
		glue = {"stepDefinition"}, //the path of step definition files
		plugin = {"pretty", "html:target/cucumber", "json:json_output/cucumber.json"}, // to generate different types of reporting
		monochrome = true, // display the console output in a proper readable format
		dryRun = false // to check mapping is proper between feature file and step definition file
//		tags= {"@End2End,~@SmokeTest"}
		)

public class TestRunner {

}
 