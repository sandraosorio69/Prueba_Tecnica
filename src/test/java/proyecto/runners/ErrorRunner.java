package proyecto.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/Error500.feature",
        glue = "proyecto.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class ErrorRunner {
}

