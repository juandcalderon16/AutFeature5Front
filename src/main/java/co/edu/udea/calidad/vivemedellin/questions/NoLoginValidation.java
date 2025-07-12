package co.edu.udea.calidad.vivemedellin.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.calidad.vivemedellin.userinterfaces.UserInterface.AVISO;
import static co.edu.udea.calidad.vivemedellin.userinterfaces.UserInterface.NEED_LOGIN;

public class NoLoginValidation implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String temporal = Text.of(NEED_LOGIN).answeredBy(actor);
        if(temporal.contains("Log in to write")){
            return true;
        }else return false;
    }

    public static CalificarValidation Calificacion() {
        return new CalificarValidation();
    }

}