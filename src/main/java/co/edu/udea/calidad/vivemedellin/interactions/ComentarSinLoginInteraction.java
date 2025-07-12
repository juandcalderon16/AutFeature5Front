package co.edu.udea.calidad.vivemedellin.interactions;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.edu.udea.calidad.vivemedellin.userinterfaces.UserInterface.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ComentarSinLoginInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Open.url("https://fabrica-artifact-v2.vercel.app/events"));
        t.attemptsTo(Click.on(EVENTO));
    }

    public static ComentarSinLoginInteraction comentarSinLoginInteraction() {
        return Tasks.instrumented(ComentarSinLoginInteraction.class);
    }

}