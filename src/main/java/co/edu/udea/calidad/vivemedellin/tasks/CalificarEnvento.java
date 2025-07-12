package co.edu.udea.calidad.vivemedellin.tasks;

import co.edu.udea.calidad.vivemedellin.interactions.CalificarInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class CalificarEnvento  implements Task {


    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(CalificarInteraction.CalificarInteraction());
    }

    public static CalificarEnvento calificarEnvento() {
        return Tasks.instrumented(CalificarEnvento.class);
    }

}