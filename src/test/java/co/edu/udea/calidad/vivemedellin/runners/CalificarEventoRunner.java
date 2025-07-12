package co.edu.udea.calidad.vivemedellin.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/CalificarEvento.feature",
        glue = "co.edu.udea.calidad.vivemedellin.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class CalificarEventoRunner {}