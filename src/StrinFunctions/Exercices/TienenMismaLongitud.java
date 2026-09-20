package StrinFunctions.Exercices;

import java.util.Map;

public class TienenMismaLongitud {

  // si tienen la misma longitud

    public static int restaCorrespondiente(int a, int b){
        if (a > b){
            a = a - b;
        } else {
            a = b - a;
        }
        return a;
    }

  public static void mismaLongitud(Map<String, String[]> diccionario) {
    String[] lista = diccionario.get("comparativas");

    int longitud1 = lista[0].length();
    int longitud2 = lista[1].length();

      if (longitud1 == longitud2) {
          System.out.println("es correcto\n" + "longitud 1: " + longitud1 + "\n longitud 2: " + longitud2);
      } else {
          System.out.println("no es correcto, se pasa por: " + restaCorrespondiente(longitud1, longitud2));
      }

  }
}
