package co.edu.udea.calidad.vivemedellin.tasks;

import co.edu.udea.calidad.vivemedellin.interactions.ComentarEventoExitosoInteraction;
import co.edu.udea.calidad.vivemedellin.interactions.ComentarEventoVacioInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ComentarEventoVacio  implements Task {


    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(ComentarEventoVacioInteraction.comentarEventoVacio());
    }

    public static ComentarEventoVacio comentarEventoVacio() {
        return Tasks.instrumented(ComentarEventoVacio.class);
    }

}