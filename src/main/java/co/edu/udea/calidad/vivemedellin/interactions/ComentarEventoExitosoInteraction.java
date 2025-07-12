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

public class ComentarEventoExitosoInteraction implements Interaction {

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Open.url("https://fabrica-artifact-v2.vercel.app/events/3"));
        t.attemptsTo(
                WaitUntil.the(ESTRELLA, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(ESTRELLA)
        );
        t.attemptsTo(Enter.theValue("Muy buen evento me gusto").into(COMENTAR));
        t.attemptsTo(Click.on(SUBMIT));
    }

    public static ComentarEventoExitosoInteraction ComentarInteraction() {
        return Tasks.instrumented(ComentarEventoExitosoInteraction.class);
    }

}