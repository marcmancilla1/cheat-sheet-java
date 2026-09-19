import java.util.Scanner;
//Crea un programa que solicite dos números y muestre su resta únicamente cuando
//el valor de la resta supere el valor 50.

public class Main {


    public static void main(String[] args){
        Scanner scaner = new Scanner(System.in);

        int valor = scaner.nextInt(), resta = scaner.nextInt();

        if (valor >= resta){
            if (resta > 50){

                int procesing = valor - resta;

                System.out.println(procesing);
            }
            else {
                System.out.println("la resta no supera los 50");
            }

        }
        else {
            System.out.println("valor insuficiente para restar");
        }

    }
}