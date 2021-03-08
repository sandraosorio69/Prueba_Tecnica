package proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static proyecto.userinterfaces.login.*;

public class loginTask implements Task {

    private String usuario, clave;

    public loginTask(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //El actor intenta dar clic en el botón nombrado en el mapeo de objetos
        //Click.on se usa con target siempre


        actor.attemptsTo(Enter.theValue(usuario).into(USUARIO),
                Enter.theValue(clave).into(CLAVE),
                Click.on(BOTON_LOGIN));
    }
    public static loginTask alHome(String usuario, String clave){
        return Tasks.instrumented(loginTask.class, usuario, clave);
    }
}
