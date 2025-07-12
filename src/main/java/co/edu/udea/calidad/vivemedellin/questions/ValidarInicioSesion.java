package co.edu.udea.calidad.vivemedellin.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.calidad.vivemedellin.userinterfaces.UserInterface.EVENTS;

public class ValidarInicioSesion implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String texto = Text.of(EVENTS).answeredBy(actor);
        if(texto.contains("Events")){
            return true;
        }else return false;
    }

    public static ValidarInicioSesion SesionIniciada() {
        return new ValidarInicioSesion();
    }

}