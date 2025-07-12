package co.edu.udea.calidad.vivemedellin.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UserInterface extends PageObject {

    public static final Target EVENTO = Target.the("Evento").locatedBy("/html/body/main/section/div/a[1]/div/div[1]/div[2]");
    public static final Target ESTRELLA = Target.the("estrella número 3").located(By.cssSelector("svg.lucide-star.cursor-pointer:nth-of-type(3)"));

    public static final Target SUBMIT = Target.the("Submit").locatedBy("/html/body/main/section/div[1]/div[2]/div[2]/form/button");

    public static final Target AVISO = Target.the("Aviso").locatedBy("/html/body/main/section/div[1]/div[2]/div[1]/div[2]");

    public static final Target EVENTS = Target.the("Events").locatedBy("/html/body/main/section/h1");

    public static final Target LOGIN = Target.the("Login").locatedBy("/html/body/header/nav/div[2]/button");

    public static final Target EMAIL_FIELD = Target.the("campo de correo").locatedBy("//*[@id='email']");

    public static final Target PASSWORD_FIELD = Target.the("campo de contraseña").locatedBy("//*[@id='password']");

    public static final Target LOGIN_BUTTON = Target.the("botón de login").locatedBy("/html/body/main/div/div/div/div/div[2]/form/div[1]/button");

    public static final Target COMENTAR = Target.the("campo de comentario").located(By.name("comment"));

    public static final Target NEED_LOGIN = Target.the("noLogin").locatedBy("/html/body/main/section/div[1]/div[2]/div[1]/div[1]");



}