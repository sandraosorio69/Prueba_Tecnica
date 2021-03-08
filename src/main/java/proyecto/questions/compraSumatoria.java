package proyecto.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.asciidoctor.AsciiDocDirectoryWalker;

import static proyecto.userinterfaces.compra.*;
import static proyecto.userinterfaces.login.HOME_PRINCIPAL;

public class compraSumatoria implements Question<Boolean> {

        private Double sumatoriaTotal;

    public compraSumatoria(Double sumatoriaTotal) {this.sumatoriaTotal=sumatoriaTotal;}

    @Override
    public Boolean answeredBy(Actor actor) {
       Double valorJava =  Double.parseDouble(Text.of(VALORJAVA).viewedBy(actor).asString().replace("Rs.", ""));
        Double valorRuby =  Double.parseDouble(Text.of(VALORRUBY).viewedBy(actor).asString().replace("Rs.", ""));
        Double valorPhyton =  Double.parseDouble(Text.of(VALORPHYTON).viewedBy(actor).asString().replace("Rs.", ""));

        Double SumitaTotal= (valorJava + valorRuby + valorPhyton);

    return SumitaTotal.equals(sumatoriaTotal);
        //return GRANTOTAL.of(sumatoriaTotal).resolveFor(actor).isPresent();
    }

    public static compraSumatoria sumatoria (Double sumatoriaTotal) {
        return new compraSumatoria(sumatoriaTotal);

    }
}
