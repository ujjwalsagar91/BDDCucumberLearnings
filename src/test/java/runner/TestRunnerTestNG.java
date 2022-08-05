package runner;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

@CucumberOptions(
		features= "src\\test\\java\\AppFeatures\\TestScenario.feature",
		glue= {"stepdefinition"},
		plugin= {"pretty"})

public class TestRunnerTestNG {

	private TestNGCucumberRunner cucumberRunner;
	
	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		cucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
	
//	@Test(dataProvider = "features")
//	public void feature(CucumberFeatureWrapper cucumberFeatureWrapper) {
//		
//	}
	
}
