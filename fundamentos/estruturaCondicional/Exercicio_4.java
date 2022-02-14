package estruturaCondicional;

/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

import java.util.Scanner;

public class Exercicio_4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter with the initial and final hours: ");
        int initialHour = sc.nextInt();
        int finalHour = sc.nextInt();
        int gameDuration;

        if (initialHour < finalHour) {
            gameDuration = finalHour + initialHour;
        } else {
            gameDuration = 24 - initialHour + finalHour;
        }

        System.out.println("The game lasted " + gameDuration + " Hours");
        sc.close();
    }
}