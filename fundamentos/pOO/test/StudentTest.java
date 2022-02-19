package pOO.test;

import pOO.domain.Student;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Student name: ");
        student.student = sc.next();
        System.out.print("Insert the grades: ");
        student.grade1 = sc.nextDouble();
        student.grade2 = sc.nextDouble();
        student.grade3 = sc.nextDouble();

        System.out.println("FINAL GRADE = " + student.finalGrade());

        if (student.finalGrade() > 60) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.println("MISSING " + student.missing() + "POINTS");
        }

        sc.close();
    }
}
