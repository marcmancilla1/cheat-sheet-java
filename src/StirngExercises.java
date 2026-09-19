
import static StringFunctions.CompararString.comparativasString;
import static StringFunctions.MayusculasMinusculas.minusculasMaiusculas;
import static StringFunctions.PrimeraUltimaLetra.primeraYultimaLetra;
import static StringFunctions.StringTemplate.stirngTemplate;
import static StringFunctions.concatenarString.concatenarString;

public class StirngExercises {

  public static void main(String[] args) {
    concatenarString();
    System.out.println("hola".length());

    System.out.println(minusculasMaiusculas("hola gente que tall"));

    primeraYultimaLetra("hola como estamos");
    System.out.println("contiene el a?".contains("el"));

    System.out.println("espacios por un guion".replace(" ", "-"));
    // ej7
    System.out.println("   el pepe     ".trim());

    comparativasString(stirngTemplate());
  }
}
