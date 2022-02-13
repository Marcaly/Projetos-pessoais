package estruturaCondicional;

/*Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
1 | Hot dog | $4,50
2 | X-salad | $4,50
3 | X-bacon | $5,00
4 | Toast   | $2.00
5 | Soda    | $1.50
*/
import java.util.Scanner;

public class Exercicio_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter with the item code and quantity:");
        int codigo = sc.nextInt();
        int quantity = sc.nextInt();
        double total = 0;

        if (codigo == 1) {
            total = quantity * 4;
        } else if (codigo == 2) {
            total = quantity * 4.50;
        } else if (codigo == 3) {
            total = quantity * 5;
        } else if (codigo == 4) {
            total = quantity * 2;
        } else if (codigo == 5) {
            total = quantity * 1.50;
        } else {
            System.out.println("Invalid code");
        }
        System.out.println("Total: $" + total);


        sc.close();
    }
}
