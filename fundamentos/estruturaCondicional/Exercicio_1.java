package estruturaCondicional;

/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/

import java.util.Scanner;

public class Exercicio_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }


        sc.close();
    }
}
