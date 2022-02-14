package estruturaCondicional;

/*Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.*/

import java.util.Scanner;

public class Exercicio_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter with a number:");
        double number = sc.nextDouble();

        if (number >= 0 && number <= 25) {
            System.out.println("[0,25]");
        } else if (number > 25 && number <= 50) {
            System.out.println("[25,50}");
        } else if (number > 50 && number <= 75) {
            System.out.println("[50,75]");
        } else if (number > 75 && number <= 100) {
            System.out.println("[75,100]");
        } else {
            System.out.println("Out of range");
        }

        sc.close();
    }
}
