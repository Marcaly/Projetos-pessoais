package estruturasRepetitivas;

/*Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).*/

import java.util.Scanner;

public class DoWhileExc02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the X coordinate ");
        int x = sc.nextInt();
        System.out.println("Enter the Y coordinate");
        int y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("First");
            } else if (x > 0 && y < 0) {
                System.out.println("Second");
            } else if (x < 0 && y < 0) {
                System.out.println("Third");
            } else {
                System.out.println("Fourth");
            }
            x = sc.nextInt();
            y = sc.nextInt();
        }


        sc.close();
    }
}
