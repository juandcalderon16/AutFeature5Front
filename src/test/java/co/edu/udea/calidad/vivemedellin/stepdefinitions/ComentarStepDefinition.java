package co.edu.udea.calidad.vivemedellin.stepdefinitions;

import co.edu.udea.calidad.vivemedellin.questions.CalificarValidation;
import co.edu.udea.calidad.vivemedellin.questions.NoLoginValidation;
import co.edu.udea.calidad.vivemedellin.tasks.CalificarEnvento;
import co.edu.udea.calidad.vivemedellin.tasks.ComentarEvento;
import co.edu.udea.calidad.vivemedellin.tasks.ComentarEventoVacio;
import co.edu.udea.calidad.vivemedellin.tasks.ComentarSinLogin;
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

public class ComentarStepDefinition {

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

    @Given("que el usuario ha iniciado sesión correctamente")
    public void elUsuarioHaIniciadoSesiónCorrectamente() {
        actor.wasAbleTo(Open.browserOn(userInterface));
    }
    @When("el usuario escribe un comentario valido")
    public void elUsuarioSeleccionaUnaCalificaciónEntreYParaUnEvento() {
        actor.attemptsTo(ComentarEvento.comentarEvento());
    }
    @Then("el comentario se muestra inmediatamente en el listado")
    public void laCalificaciónSeAsociaAlUsuarioYAlEvento() {
        actor.should(seeThat(CalificarValidation.Calificacion(), equalTo(true)));
    }

    @When("el usuario escribe un comentario vacio")
    public void elUsuarioEscribeUnComentarioValidoVacio() {
        actor.attemptsTo(ComentarEventoVacio.comentarEventoVacio());
    }
    @Then("el comentario vacio no se publica")
    public void elComentarioVacioNoSePublica() {
        actor.should(seeThat(CalificarValidation.Calificacion(), equalTo(false)));
    }

    @Given("que el usuario no ha iniciado sesión correctamente")
    public void elUsuarioNoHaIniciadoSesiónCorrectamente() {
        actor.wasAbleTo(Open.browserOn(userInterface));
    }
    @When("el usuario intenta escribir un comentario")
    public void elUsuarioIntentaComentarUnEvento() {
        actor.attemptsTo(ComentarSinLogin.comentarSinLogin());
    }

    @Then("el comentario no se publica")
    public void elComentarioSinLoginNoSePublica() {
        actor.should(seeThat(NoLoginValidation.Calificacion(), equalTo(false)));
    }

}
