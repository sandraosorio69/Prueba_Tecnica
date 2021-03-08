package proyecto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static proyecto.userinterfaces.compra.*;
import static proyecto.userinterfaces.login.*;

public class compraTask implements Task {

    private String cantidadJava,cantidadRuby, cantidadPhyton, sumatoriatotal;

    public compraTask(String cantidadJava , String cantidadRuby, String cantidadPhyton) {
        this.cantidadJava = cantidadJava;
        this.cantidadRuby = cantidadRuby;
        this.cantidadPhyton = cantidadPhyton;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //El actor intenta dar clic en el botón nombrado en el mapeo de objetos
        //Click.on se usa con target siempre


        actor.attemptsTo(Enter.theValue (cantidadJava).into(CANTIDADJAVA),
                Enter.theValue(cantidadRuby).into(CANIDADRUBY),
                Enter.theValue(cantidadPhyton).into(CANTIDADPHYTON),
                Click.on(ADD));
    }
    public static compraTask realizarCompra(String cantidadJava, String cantidadRuby, String cantidadPhyton){
        return Tasks.instrumented(compraTask.class, cantidadJava, cantidadRuby,cantidadPhyton);
    }
}
