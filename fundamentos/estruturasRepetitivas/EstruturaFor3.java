package estruturasRepetitivas;

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
