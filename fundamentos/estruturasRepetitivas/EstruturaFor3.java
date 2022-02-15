package estruturasRepetitivas;

/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5*/

import java.util.Scanner;

public class EstruturaFor3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double grade1 = 0;
        double grade2 = 0;
        double grade3 = 0;


        for (int i = 0; i < N; i++) {

            grade1 = sc.nextDouble();
            grade2 = sc.nextDouble();
            grade3 = sc.nextDouble();

            double media = (grade1 * 2 + grade2 * 3 + grade3 * 5) / 10;
            System.out.printf("%.1f%n", media);
        }


        sc.close();
    }
}
