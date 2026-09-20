package StrinFunctions.Exercices;

import java.util.HashMap;
import java.util.Map;

public class StringTemplate {
  public static Map<String, String[]> stirngTemplate() {
    Map<String, String[]> diccionario = new HashMap<>();

    diccionario.put(
        "comparativas",
        new String[] {
          "Correspondencia a A", "Correspondencia a A",
        });
    diccionario.put("malacomparativa", new String[] {"no corresponde a A"});
    return diccionario;
  }
}
