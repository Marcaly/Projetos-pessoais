package pOO.test;

import pOO.domain.Employee;

import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Scanner sc = new Scanner(System.in);

        System.out.print("Insert the employee name: ");
        employee.employee = sc.nextLine();
        System.out.print("Insert employee's gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Insert employees taxes: ");
        employee.tax = sc.nextDouble();

        System.out.println(employee);
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Updater data: " + employee);


        sc.close();
    }
}
