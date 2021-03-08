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
import proyecto.tasks.loginTask;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class Error500StepDefinition {

    @Managed(driver = "chrome")
    protected WebDriver hisBrowser;
    @Before
    public void iniciarChormeDriver ()
    {
        setTheStage(new Cast());
        theActorCalled("Sandra");
        theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Dado("^que sandra se encuentra en la pagina Sahi Tests$")
    public void queSandraSeEncuentraEnLaPaginaSahiTests() {
        theActorInTheSpotlight().wasAbleTo(Open.url("http://sahitest.com/demo/"));
    }

    @Cuando("^ella selecciona los campos ErrorPages Y error$")
    public void ellaSeleccionaLosCamposErrorPagesYError() {


    }

    @Entonces("^a ella se le presenta el ingreso a dicha pagina$")
    public void aEllaSeLePresentaElIngresoADichaPagina() {

    }

}
