package pOO.test;

import pOO.domain.Retangle;

import java.util.Scanner;

public class RetangleTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Retangle ret = new Retangle();

        System.out.println("Enter with retangle measures");

        System.out.print("Height: ");
        ret.height = sc.nextInt();


        System.out.print("Width: ");
        ret.width = sc.nextInt();
        System.out.println();

        System.out.println("AREA = " + ret.area());
        System.out.println("PERIMETER = " + ret.perimeter());
        System.out.println("DIAGONAL = " + ret.diagonal());
    }
}
