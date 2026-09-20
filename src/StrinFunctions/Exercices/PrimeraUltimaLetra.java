package StrinFunctions.Exercices;

public class PrimeraUltimaLetra {
    public static void primeraYultimaLetra(String input) {
        input = input.trim();
        char fristPosition = input.charAt(0);
        char ultimaPosition = input.charAt(input.length() - 1);

        System.out.println(String.format("PRIMERA: %c\nULTIMA: %c", fristPosition, ultimaPosition));
    }
}
