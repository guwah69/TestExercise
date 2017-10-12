//package steps;
//
//
//import org.junit.runner.RunWith;
//
//import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//        format = {"pretty", "html:target/html/"},
//        features = "src/test/resources/feature",
//        tags = {"@Login"})
//
//public class RunnerTest {
//
//}

package steps;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(strict = false, features = "src/test/resources", format = { "pretty",
        "json:target/cucumber.json" }, tags = {"@hotelManagementTest"})
public class RunnerTest {

}