package proyecto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Error {
    public static final Target SAIH_TEST = Target.the("Ingresar usuario").located(By.xpath("/html/body/h2"));
    public static final Target ERROR_PAGES = Target.the("Seleccionar error pages").located(By.xpath("Error Pages"));
    public static final Target ERROR_500 = Target.the("Seleccionar error 500").located(By.xpath("/html/body/a[2]"));
    public static final Target PAGINA_PRINCIPAL = Target.the("Pagina principal").located(By.xpath("//*[@id=\"main-message\"]/h1/span"));

}


