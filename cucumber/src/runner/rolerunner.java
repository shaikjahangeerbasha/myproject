package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\jahan\\eclipse-workspace.present\\cucumber\\src\\feature\\Role.feature",glue="stepdefination",monochrome= true,
plugin={"pretty","json:target\\reports\\role.json"})
	
public class rolerunner {

}
