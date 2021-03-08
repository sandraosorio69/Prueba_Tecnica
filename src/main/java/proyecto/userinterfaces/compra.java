package proyecto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class compra{
        public static final Target CANTIDADJAVA = Target.the("Ingresar cantidad java").located(By.xpath("//*[@id=\"listing\"]/tbody/tr[2]/td[4]/input"));
        public static final Target CANIDADRUBY = Target.the("Ingresar clave").located(By.xpath("//*[@id=\"listing\"]/tbody/tr[3]/td[4]/input"));
        public static final Target CANTIDADPHYTON = Target.the("Boton ingresar").located(By.xpath("//*[@id=\"listing\"]/tbody/tr[4]/td[4]/input"));
        public static final Target ADD = Target.the("Pagina principal").located(By.xpath("//*[@id=\"available\"]/input[1]"));
        public static final Target GRANTOTAL = Target.the("gran total").located(By.xpath("//input[@id=\"total\"]"));

        public static final Target VALORJAVA = Target.the("valor Java").located(By.xpath("//*[@id=\"added\"]/tbody/tr[2]/td[4]"));
        public static final Target VALORRUBY = Target.the("valor Ruby").located(By.xpath("//*[@id=\"added\"]/tbody/tr[3]/td[4]"));
        public static final Target VALORPHYTON= Target.the("valor Phyton").located(By.xpath("//*[@id=\"added\"]/tbody/tr[4]/td[4]"));

}
