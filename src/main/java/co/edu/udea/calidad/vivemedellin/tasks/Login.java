package co.edu.udea.calidad.vivemedellin.tasks;

import co.edu.udea.calidad.vivemedellin.interactions.ComentarEventoExitosoInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Login  implements Task {


    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(ComentarEventoExitosoInteraction.ComentarInteraction());
    }

    public static Login login() {
        return Tasks.instrumented(Login.class);
    }

}