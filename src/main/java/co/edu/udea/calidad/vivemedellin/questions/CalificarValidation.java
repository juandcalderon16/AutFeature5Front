package co.edu.udea.calidad.vivemedellin.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.edu.udea.calidad.vivemedellin.userinterfaces.UserInterface.AVISO;

public class CalificarValidation implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        String temporal = Text.of(AVISO).answeredBy(actor);
        if(temporal.contains("You can only update")){
            return true;
        }else return false;
    }

    public static CalificarValidation Calificacion() {
        return new CalificarValidation();
    }

}