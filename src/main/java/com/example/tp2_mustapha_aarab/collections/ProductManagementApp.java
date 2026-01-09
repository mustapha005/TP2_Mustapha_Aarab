package com.example.tp2_mustapha_aarab.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManagementApp {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // 1. Add products
        System.out.println("=== Adding Products ===");
        products.add(new Product(1, "Laptop", 999.99));
        products.add(new Product(2, "Mouse", 25.50));
        products.add(new Product(3, "Keyboard", 75.00));
        products.add(new Product(4, "Monitor", 299.99));
        System.out.println("Products added successfully!");

        // 2. Display the list of products
        System.out.println("\n=== List of Products ===");
        displayProducts(products);

        // 3. Delete a product by index
        System.out.println("\n=== Deleting Product ===");
        System.out.print("Enter index to delete (0-" + (products.size()-1) + "): ");
        int deleteIndex = scanner.nextInt();
        if (deleteIndex >= 0 && deleteIndex < products.size()) {
            Product removed = products.remove(deleteIndex);
            System.out.println("Deleted: " + removed);
        } else {
            System.out.println("Invalid index!");
        }

        // Display after deletion
        System.out.println("\n=== After Deletion ===");
        displayProducts(products);

        // 4. Modify a product by index
        System.out.println("\n=== Modifying Product ===");
        System.out.print("Enter index to modify (0-" + (products.size()-1) + "): ");
        int modifyIndex = scanner.nextInt();
        if (modifyIndex >= 0 && modifyIndex < products.size()) {
            scanner.nextLine(); // consume newline
            System.out.print("Enter new name: ");
            String newName = scanner.nextLine();
            System.out.print("Enter new price: ");
            double newPrice = scanner.nextDouble();

            products.get(modifyIndex).setName(newName);
            products.get(modifyIndex).setPrice(newPrice);
            System.out.println("Product modified successfully!");
        } else {
            System.out.println("Invalid index!");
        }

        // Display after modification
        System.out.println("\n=== After Modification ===");
        displayProducts(products);

        // 5. Search for a product by name
        System.out.println("\n=== Search Product ===");
        scanner.nextLine(); // consume newline
        System.out.print("Enter product name to search: ");
        String searchName = scanner.nextLine();

        boolean found = false;
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Found: " + p);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found!");
        }

        scanner.close();
    }

    // Helper method to display products
    private static void displayProducts(ArrayList<Product> products) {
        for (int i = 0; i < products.size(); i++) {
            System.out.println("Index " + i + ": " + products.get(i));
        }
    }
}