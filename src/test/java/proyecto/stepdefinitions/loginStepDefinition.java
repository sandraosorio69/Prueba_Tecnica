package proyecto.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import proyecto.questions.compraSumatoria;
import proyecto.questions.verHome;
import proyecto.tasks.compraTask;
import proyecto.tasks.loginTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class loginStepDefinition {

    @Managed(driver = "chrome")
    protected WebDriver hisBrowser;
    @Before
    public void iniciarChormeDriver ()

    {
        setTheStage(new Cast());
        theActorCalled("Sandra");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));

    }

    @Dado("^que sandra se encuentra en la pantalla del login$")
    public void queSandraSeEncuentraEnLaPantallaDelLogin() {
        //para levantar el navergador
        theActorInTheSpotlight().wasAbleTo(Open.url("http://sahitest.com/demo/training/login.htm"));
    }

    @Cuando("^ella diligencie los campos \"([^\"]*)\" y \"([^\"]*)\"$")
    public void ellaDiligencieLosCamposY(String usuario, String clave) {
        theActorInTheSpotlight().wasAbleTo(loginTask.alHome(usuario, clave));
    }

    @Entonces("^ella deberia ver la pagina principal$")
    public void ella_deberia_ver_la_pagina_principal() {
        theActorInTheSpotlight().should(seeThat(verHome.home()));
    }

    @Cuando("^ella ingrese los valores de los libros a comprar \"([^\"]*)\",\"([^\"]*)\" y \"([^\"]*)\"$")
    public void ellaIngreseLosValoresDeLosLibrosAComprarY(String cantidadJava, String cantidadRuby, String cantidadPhyton) {
        theActorInTheSpotlight().wasAbleTo(compraTask.realizarCompra(cantidadJava,cantidadRuby,cantidadPhyton));
    }

    @Entonces("^ella deberia ver la suma total de su compra \"([^\"]*)\"$")
    public void ellaDeberiaVerLaSumaTotalDeSuCompra(Double sumatoriatotal) {
        theActorInTheSpotlight().should(seeThat(compraSumatoria.sumatoria(sumatoriatotal)));
    }

}
