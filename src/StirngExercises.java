import java.util.HashMap;
import java.util.Map;

public class StirngExercises {


    public static void main(String[] args) {
        concatenarString();
        System.out.println(longitudTexto("hola"));

        System.out.println(minusculasMaiusculas("hola gente que tall"));

        primeraYultimaLetra("hola como estamos");

        comparativasString(stirngTemplate());

    }

    public static Map<String, String[]> stirngTemplate() {
        Map<String, String[]> diccionario = new HashMap<>();

        diccionario.put("comparativas", new String[]{"Correspondencia a A", "Correspondencia a A",});
        diccionario.put("malacomparativa", new String[]{"no corresponde a A"});
        return diccionario;
    }

    public static void concatenarString() {
        String nombre = "esto es una cadena";
        String texto = "de texto";

        System.out.println(String.format("%s %s", nombre, texto));
    }

    public static int longitudTexto(String texto) {
        return texto.length();
    }

    public static String minusculasMaiusculas(String texto) {
        int len = texto.length() - 1;
        String newString = "";
        for (int i = 0; i < len; ++i) {
            if (i % 2 == 0) {
                char upper = texto.charAt(i);
                newString = newString + Character.toUpperCase(upper);
            } else {
                char upper = texto.charAt(i);
                newString = newString + Character.toLowerCase(upper);
            }
        }
        return newString;
    }

    public static void primeraYultimaLetra(String input) {
        input = input.trim();
        char fristPosition = input.charAt(0);
        char ultimaPosition = input.charAt(input.length() - 1);

        System.out.println(String.format("PRIMERA: %c\nULTIMA: %c", fristPosition, ultimaPosition));
    }

    ;

    public static void comparativasString(Map<String, String[]> textos) {
        String[] lista = textos.get("comparativas");
        String[] listaNegativa = textos.get("malacomparativa");

        String compa1 = lista[0];
        String compa2 = lista[1];
        String negativeCompa = listaNegativa[0];

        System.out.println(compa1 + " " + compa2 + " " + negativeCompa);
    }

    // ejercicio 5. minuto 2:44:55

/*
 public static void procesarComparativas(Map<String, String[]> textos) {
        // Sacamos los textos directos usando la etiqueta
        String[] lista = textos.get("comparativas");

        System.out.println("-> Usando texto 1: " + lista[0]);
        System.out.println("-> Usando texto 2: " + lista[1]);
    }
 */
}
