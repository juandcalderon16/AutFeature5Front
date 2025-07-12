package co.edu.udea.calidad.vivemedellin.stepdefinitions;

import co.edu.udea.calidad.vivemedellin.questions.ValidarInicioSesion;
import co.edu.udea.calidad.vivemedellin.questions.CalificarValidation;
import co.edu.udea.calidad.vivemedellin.tasks.CalificarEnvento;
import co.edu.udea.calidad.vivemedellin.tasks.Login;
import co.edu.udea.calidad.vivemedellin.userinterfaces.UserInterface;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

public class CalificarStepDefinition {

    @Managed
    public WebDriver theDriver;

    public Actor actor = new Actor("user");

    UserInterface userInterface=  new UserInterface();

    @Before
    public void config(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("user");
        actor.can(BrowseTheWeb.with(theDriver));
    }

    //@Given("This method is responsible for parameterizing the instantiation of chromedriver")    public void thisMethodIsResponsibleForParameterizingTheInstantiationOfChromedriver() {         OnStage.theActorInTheSpotlight().wasAbleTo(Open.browserOn().thePageNamed("pages.swaglabsUrl"));    }

    @Given("el usuario ha iniciado sesión correctamente")
    public void elUsuarioHaIniciadoSesiónCorrectamente() {
        actor.wasAbleTo(Open.browserOn(userInterface));
    }
    @When("el usuario selecciona una calificación entre 1 y 5 para un evento")
    public void elUsuarioSeleccionaUnaCalificaciónEntreYParaUnEvento() {
        actor.attemptsTo(CalificarEnvento.calificarEnvento());
    }
    @Then("la calificación se asocia al usuario y al evento")
    public void laCalificaciónSeAsociaAlUsuarioYAlEvento() {
        actor.should(seeThat(CalificarValidation.Calificacion(), equalTo(true)));
    }
    @Then("se muestra el usuario que calificó y hace cuánto fue publicada la calificación")
    public void seMuestraElUsuarioQueCalificóYHaceCuántoFuePublicadaLaCalificación() {
        actor.should(seeThat(CalificarValidation.Calificacion(), equalTo(true)));
    }

    @Given("el usuario abre la aplicación")
    public void elUsuarioAbreLaAplicacion() {
        actor.wasAbleTo(Open.browserOn(userInterface)); // ejemplo
    }

    @When("ingresa su correo y contraseña válidos")
    public void ingresaCredenciales() {
        actor.attemptsTo(Login.login());
    }

    @Then("debería ver la página principal del sistema")
    public void verificaInicioSesion() {
        actor.should(seeThat(ValidarInicioSesion.SesionIniciada(), equalTo(true)));
    }

}
