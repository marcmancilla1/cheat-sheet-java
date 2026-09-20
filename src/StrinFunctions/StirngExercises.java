package StrinFunctions;

import static StrinFunctions.Exercices.CompararString.comparativasString;
import static StrinFunctions.Exercices.FormatIntegrer.formateo;
import static StrinFunctions.Exercices.MayusculasMinusculas.minusculasMaiusculas;
import static StrinFunctions.Exercices.PrimeraUltimaLetra.primeraYultimaLetra;
import static StrinFunctions.Exercices.StringTemplate.stirngTemplate;
import static StrinFunctions.Exercices.concatenarString.concatenarString;
import static StrinFunctions.Exercices.TienenMismaLongitud.mismaLongitud;

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

    boolean b = comparativasString(stirngTemplate());
    System.out.println(b);


    formateo();

    mismaLongitud(stirngTemplate());




  }
}
