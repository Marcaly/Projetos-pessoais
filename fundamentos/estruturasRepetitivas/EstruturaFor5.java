package estruturasRepetitivas;

/*Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo.*/

import java.util.Scanner;

public class EstruturaFor5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int number = i;
            int quadrate = i * i;
            int cube = i * i * i;
            System.out.printf("%d %d %d%n", number, quadrate, cube);
        }

        sc.close();
    }
}
