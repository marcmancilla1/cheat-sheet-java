package Condicionales;

public class CondicionalExercices {

  public static void main(String[] args) {

    // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).

    //    int edad = -1;
    //    if (edad > 0 && !(edad > 130)) {
    //      if (edad >= 18) {
    //        System.out.println("puedes pasar");
    //      } else {
    //        System.out.println("no puedes pasar");
    //      }
    //    } else {
    //      System.out.println("pon una fecha correcta");
    //    }

    // 2. Declara dos números y muestra cuál es mayor, o si son iguales.

    int numero1 = 5;
    int numero2 = 20;
    //
    //    if (numero1 == numero2) {
    //      System.out.println("son iguales");
    //    } else if (numero1 > numero2) {
    //      textExtractet(numero1, numero2);
    //    } else {
    //      textExtractet(numero2, numero1);
    //    }

    // 3. Dado un número, verifica si es positivo, negativo o cero.
    //    if (numero1 > 0){
    //      System.out.println("es positivo");
    //    } else if(numero1 < 0){
    //      System.out.println("es negativo");
    //    }else {
    //      System.out.println("0");
    //    }
    // 4. Crea un programa que diga si un número es par o impar.
    //    if (numero1 % 2 == 0){
    //      System.out.println("es par");
    //    } else {
    //      System.out.println("es impar");
    //    }
    //    // 5. Verifica si un número está en el rango de 1 a 100.
    //    if (numero1 > 0 && numero1 < 101){
    //      System.out.println("esta en el rango");
    //    } else {
    //      System.out.println("no esta en el rango");
    //    }

    // 6. Declare una variable con el día de la seaman (1-7) y extra su number con switch.
    //    switch (numero1) {
    //      case 1:
    //        System.out.println("lunes");
    //        break;
    //      case 2:
    //        System.out.println("martes");
    //        break;
    //      case 3:
    //        System.out.println("miercoles");
    //        break;
    //      case 4:
    //        System.out.println("jueves");
    //        break;
    //      case 5:
    //        System.out.println("viernes");
    //        break;
    //      case 6:
    //        System.out.println("sabado");
    //        break;
    //      case 7:
    //        System.out.println("domingo");
    //        break;
    //    }
    // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota
    // (0-100).
    //    var nota = 70;
    //    var maximo = 100;
    //    var minimo = 0;
    //
    //    var sobresaliente = 90;
    //    var notable = 70;
    //    var aprobado = 50;
    //
    //    if (nota < (maximo + 1) && nota > (minimo - 1)) {
    //
    //      if (nota >= sobresaliente) {
    //        System.out.println("Sobresaliente");
    //
    //      } else if (nota >= notable && nota <= sobresaliente) {
    //        System.out.println("Notable");
    //
    //      } else if (nota >= aprobado && nota <= notable){
    //        System.out.println("aprobado");
    //
    //      } else {
    //        System.out.println("suspendido");
    //      }
    //    }

    // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o
    // ir acompañado.

    //    boolean compañado = false;
    //
    //    if (numero1 >= 15 || compañado) {
    //      System.out.printf("puedes entrar");
    //    } else {
    //      System.out.println("no puedes entrar");
    //    }

    // 9. Crea un programa que diga si una letra es vocal o consonante.
    char caract = 'a';
    char[] letras = new char[5];
    letras[0] = 'a';
    letras[1] = 'e';
    letras[2] = 'i';
    letras[3] = 'o';
    letras[4] = 'u';
    if (isVocal(letras, caract)) {
      System.out.println("es vocal");
    } else {
      System.out.println("no es vocal");
    }
    var a = 10;
    var b = 40;
    var c = 30;

    if (a > b && a > c){
      System.out.println(a);
    } else if (b > c){
      System.out.println(b);
    }else {
      System.out.println(c);
    }
  }

  private static boolean isVocal(char[] letras, char caract) {
    boolean esVocal = false;
    for (char l : letras) {
      if (l == caract) {
        esVocal = true;
        break;
      }
    }
    return esVocal;
  }

  private static void textExtractet(int mayor, int menor) {
    System.out.println(String.format("%d es mayor a %d", mayor, menor));
  }
}
