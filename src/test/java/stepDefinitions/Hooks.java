package stepDefinitions;
import cucumber.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	TestContext testContext;
	public Hooks (TestContext contect) {
		testContext=contect;
	}

	@Before
	public void BeforeSteps() {
		/*What all you can perform here
		Starting a webdriver
		Setting up DB connections
		Setting up test data
		Setting up browser cookies
		Navigating to certain page
		or anything before the test
	*/
	}
	@After
	public void AfterSteps() {
		testContext.getWebDriverManager().closeDriver();
	}
}
