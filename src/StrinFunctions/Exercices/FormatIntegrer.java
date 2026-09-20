package StrinFunctions.Exercices;

import java.util.Scanner;

public class FormatIntegrer {
  // formatear una string con un numero entero
  public static void formateo() {

    Scanner scaner = new Scanner(System.in);
    System.out.println("");

    System.out.println("ingrese su edad: ");
    int edad = Integer.parseInt(scaner.nextLine());

    System.out.println("ingrese su nombre: ");
    String nombre = scaner.nextLine();

    System.out.println(String.format("hola! \n me llamo %s y tengo %d años", nombre, edad).trim());
  }
}
