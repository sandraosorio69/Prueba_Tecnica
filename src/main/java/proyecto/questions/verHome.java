package proyecto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static proyecto.userinterfaces.login.HOME_PRINCIPAL;

public class verHome implements Question<Boolean> {

    public verHome() {

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return HOME_PRINCIPAL.resolveFor(actor).isPresent();
    }

    public static verHome home (){
        return new verHome();


    }
}
