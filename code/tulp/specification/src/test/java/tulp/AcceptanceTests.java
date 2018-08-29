package tulp;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//@CucumberOptions(plugin = {"pretty"})
@CucumberOptions(features="tulp")
public class AcceptanceTests {
}
