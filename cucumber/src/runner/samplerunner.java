package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\jahan\\eclipse-workspace.present\\cucumber\\src\\feature\\f.feature",glue="stepdefination",monochrome=true
,plugin={"pretty","json:target\\reports\\login.json"})
public class samplerunner {

}


