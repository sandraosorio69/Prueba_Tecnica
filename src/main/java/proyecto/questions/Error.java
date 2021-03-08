package proyecto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static proyecto.userinterfaces.login.HOME_PRINCIPAL;

public class Error implements Question {

    public Error() {

    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return HOME_PRINCIPAL.resolveFor(actor).isPresent();
    }

    public static Error home (){
        return new Error();


    }
}


