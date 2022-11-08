package Runner_cs;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@CucumberOptions (features = {"src/test/resources/Casestudy/Multipleoption.feature"},glue = {"Definition"}, tags= "@PositiveTesting",plugin= {"html:suresh/Talakal.html"})
@CucumberOptions (features = {"src/test/resources/Casestudy/Multipleoption.feature"},glue = {"Definition"},tags= "@PositiveTesting")
public class run_test extends AbstractTestNGCucumberTests{

}