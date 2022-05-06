package runnerClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = "src/test/java/features/Login.feature", 
				glue = {"stepDefinition"}, dryRun = false)

public class runner extends AbstractTestNGCucumberTests{
	 
 }