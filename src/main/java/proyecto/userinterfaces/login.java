package proyecto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class login {

    public static final Target USUARIO = Target.the("Ingresar usuario").located(By.xpath("/html/body/center/div/form/table/tbody/tr[1]/td[2]/input"));
    public static final Target CLAVE = Target.the("Ingresar clave").located(By.xpath("/html/body/center/div/form/table/tbody/tr[2]/td[2]/input"));
    public static final Target BOTON_LOGIN = Target.the("Boton ingresar").located(By.xpath("/html/body/center/div/form/table/tbody/tr[3]/td[2]/input"));
    public static final Target HOME_PRINCIPAL = Target.the("Pagina principal").located(By.xpath("//*[@id=\"available\"]/h2"));

}
