package com.superstore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== SUPERSTORE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Product");
            System.out.println("2. View Inventory");
            System.out.println("3. Generate Bill");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> store.addProduct();
                case 2 -> store.viewProducts();
                case 3 -> store.generateBill();
                case 4 -> {
                    System.out.println("Exiting... Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
