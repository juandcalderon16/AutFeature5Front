package co.edu.udea.calidad.vivemedellin.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.edu.udea.calidad.vivemedellin.userinterfaces.UserInterface.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CalificarInteraction implements Interaction {


    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Click.on(LOGIN));
        t.attemptsTo(Enter.theValue("juand.calderon@udea.edu.co").into(EMAIL_FIELD));
        t.attemptsTo(Enter.theValue("123456").into(PASSWORD_FIELD));
        t.attemptsTo(Click.on(LOGIN_BUTTON));
        t.attemptsTo(Click.on(EVENTO));
        t.attemptsTo(
                WaitUntil.the(ESTRELLA, isVisible()).forNoMoreThan(5).seconds(),
                Click.on(ESTRELLA)
        );
        t.attemptsTo(Click.on(SUBMIT));
    }

    public static CalificarInteraction CalificarInteraction() {
        return Tasks.instrumented(CalificarInteraction.class);
    }

}