package Simple.Cucumberwa;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		format= {"pretty","html:target/cucumber"},
		tags = {"@Important"},
		features = {"src/test/Resources"}	)

public class TestRunnerCucku {

}
