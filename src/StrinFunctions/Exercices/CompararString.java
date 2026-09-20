package StrinFunctions.Exercices;

import java.util.Map;

public class CompararString {
  public static boolean comparativasString(Map<String, String[]> textos) {
    String[] lista = textos.get("comparativas");
    String[] listaNegativa = textos.get("malacomparativa");

    String compa1 = lista[0];
    String compa2 = lista[1];
    String negativeCompa = listaNegativa[0];

    return compa1.equalsIgnoreCase(negativeCompa);
  }
}
