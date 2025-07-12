package co.edu.udea.calidad.vivemedellin.tasks;

import co.edu.udea.calidad.vivemedellin.interactions.ComentarEventoExitosoInteraction;
import co.edu.udea.calidad.vivemedellin.interactions.ComentarEventoVacioInteraction;
import co.edu.udea.calidad.vivemedellin.interactions.ComentarSinLoginInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ComentarSinLogin implements Task {


    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(ComentarSinLoginInteraction.comentarSinLoginInteraction());
    }

    public static ComentarSinLogin comentarSinLogin() {
        return Tasks.instrumented(ComentarSinLogin.class);
    }

}