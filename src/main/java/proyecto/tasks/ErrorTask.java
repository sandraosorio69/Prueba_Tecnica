package proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static proyecto.userinterfaces.Error.*;
import static proyecto.userinterfaces.login.*;

public class ErrorTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        //El actor intenta dar clic en el botón nombrado en el mapeo de objetos
        //Click.on se usa con target siempre


        actor.attemptsTo(Click.on(ERROR_PAGES),
                Click.on(ERROR_500));

    }
    public static ErrorTask alHome(){
        return Tasks.instrumented(ErrorTask.class);
    }
}
