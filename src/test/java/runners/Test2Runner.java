package runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/functionalTests",glue= {"stepDefinitions"},
tags= {"@SmokeTest"},plugin= {"pretty","junit:target/cucumber-reports/Cucumber.xml"},monochrome=true)

public class Test2Runner  extends AbstractTestNGCucumberTests{

}
