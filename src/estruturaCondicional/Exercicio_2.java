package estruturaCondicional;

/*Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.*/

import java.util.Scanner;

public class Exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter with a number to verify: ");
        int number  = sc.nextInt();

        if (number % 2 == 1) {
            System.out.println("Odd");
        }else {
            System.out.println("Even");
        }



        sc.close();
    }
}
