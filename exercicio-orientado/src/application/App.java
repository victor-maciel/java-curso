package application;

import java.util.Scanner;
//import entities.Employee;
//import entities.Rectangle;
import entities.Student;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * Rectangle retangle = new Rectangle();
         * 
         * System.out.println("Enter rectangle width and height: "); retangle.width =
         * sc.nextDouble(); retangle.height = sc.nextDouble();
         * 
         * System.out.println(retangle.toString());
         * 
         * 
         * sc.close();
         * 
         */

        /*
         * Scanner sc = new Scanner(System.in);
         * 
         * Employee employee = new Employee(); System.out.println("Name: ");
         * employee.name = sc.nextLine(); System.out.println("Gross salary: ");
         * employee.grossSalary = sc.nextDouble(); System.out.println("Tax: ");
         * employee.tax = sc.nextDouble(); System.out.println(employee.name + ", $ " +
         * employee.NetSalary());
         * System.out.println("Witch percentage to increase salary? "); double
         * percentage = sc.nextDouble(); employee.increaseSalary(percentage);
         * System.out.println("Update data: " + employee.name + ", $ " +
         * employee.grossSalary);
         * 
         * sc.close();
         */

        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        student.name = sc.nextLine();
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.notaFinal());

        if (student.notaFinal() < 60.0) {
            System.out.println("FAILED");

            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        } else {
            System.out.println("PASS");
        }

        sc.close();

    }
}
