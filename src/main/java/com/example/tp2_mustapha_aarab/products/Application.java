package com.example.tp2_mustapha_aarab.products;


import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl();
        Scanner scanner = new Scanner(System.in);

        // Add some initial products
        metier.add(new Product(1, "Laptop", "Dell", 1200.0, "High performance laptop", 10));
        metier.add(new Product(2, "Mouse", "Logitech", 25.0, "Wireless mouse", 50));
        metier.add(new Product(3, "Keyboard", "Corsair", 85.0, "Mechanical keyboard", 30));

        int choice;
        do {
            System.out.println("\n========== PRODUCT MANAGEMENT MENU ==========");
            System.out.println("1. Display the list of products");
            System.out.println("2. Search for a product by its id");
            System.out.println("3. Add a new product to the list");
            System.out.println("4. Delete a product by id");
            System.out.println("5. Exit this program");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayAllProducts(metier);
                    break;
                case 2:
                    searchProductById(metier, scanner);
                    break;
                case 3:
                    addNewProduct(metier, scanner);
                    break;
                case 4:
                    deleteProduct(metier, scanner);
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }

    private static void displayAllProducts(MetierProduitImpl metier) {
        System.out.println("\n=== LIST OF PRODUCTS ===");
        List<Product> products = metier.getAll();
        if (products.isEmpty()) {
            System.out.println("No products available.");
        } else {
            for (Product p : products) {
                System.out.println(p);
            }
        }
    }

    private static void searchProductById(MetierProduitImpl metier, Scanner scanner) {
        System.out.print("\nEnter product ID to search: ");
        long id = scanner.nextLong();
        Product product = metier.findById(id);
        if (product != null) {
            System.out.println("Product found:");
            System.out.println(product);
        } else {
            System.out.println("Product with ID " + id + " not found!");
        }
    }

    private static void addNewProduct(MetierProduitImpl metier, Scanner scanner) {
        System.out.println("\n=== ADD NEW PRODUCT ===");
        System.out.print("Enter ID: ");
        long id = scanner.nextLong();
        scanner.nextLine(); // consume newline

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.print("Enter description: ");
        String description = scanner.nextLine();

        System.out.print("Enter stock quantity: ");
        int stock = scanner.nextInt();

        Product newProduct = new Product(id, name, brand, price, description, stock);
        metier.add(newProduct);
    }

    private static void deleteProduct(MetierProduitImpl metier, Scanner scanner) {
        System.out.print("\nEnter product ID to delete: ");
        long id = scanner.nextLong();
        metier.delete(id);
    }
}
