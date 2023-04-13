package poo2.application;


import poo2.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.next();

        System.out.print("Price: ");
        product.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println("Product data: " + product.name + ", $" + product.price + ", " + product.quantity + "units, Total: $" + product.totalValueInStock());

        int quantity;
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println("Update data: " + product.name + ", $" + product.price + ", " + product.quantity + "units, Total: $" + product.totalValueInStock());

        System.out.print("Enter the number of products to be remove in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println("Update data: " + product.name + ", $" + product.price + ", " + product.quantity + "units, Total: $" + product.totalValueInStock());

        sc.close();
    }
}
