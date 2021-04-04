package app;

import java.util.Scanner;
import entities.Product;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name:");
        product.name = sc.nextLine();

        System.out.print("Price:");
        product.price = sc.nextDouble();

        System.out.print("Quantity: ");
        product.quantity = sc.nextInt();

        System.out.println(product.toString());

        sc.close();
    }

}
