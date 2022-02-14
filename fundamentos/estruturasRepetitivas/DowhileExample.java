package estruturasRepetitivas;

/*Fazer um programa para ler uma temperatura celsiuss e mostrar o equivalente em Fahrenheit.
 * Perguntar se o usuario deseja repetir (s/n). Caso o usuario digite "s", repetir o programa
 * Formula: F = 9C/5 + 32*/

import java.util.Scanner;

public class DowhileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        char resp;
        do {
            System.out.print("Enter the Celsius temperature:  ");
            double C = sc.nextDouble();
            double F = (9 * C) / 5 + 32;

            System.out.printf("Fahrenheit equivalent: %.1f%n ", F );
            System.out.println("Repeat? ");

            resp = sc.next().charAt(0);
        } while (resp != 'n');

        sc.close();
    }

}
