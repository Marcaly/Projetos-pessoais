package estruturasRepetitivas;

import java.util.Scanner;

public class DoWhileExc01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert password");
        int pass = sc.nextInt();

        while (pass != 2002) {
            System.out.println("Invalid password");
            pass = sc.nextInt();
        }
        System.out.println("Access alowed");
        sc.close();
    }
}
