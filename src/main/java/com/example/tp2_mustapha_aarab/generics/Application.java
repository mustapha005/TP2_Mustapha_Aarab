package com.example.tp2_mustapha_aarab.generics;


public class Application {
    public static void main(String[] args) {
        // Test with Integer
        System.out.println("=== Testing with Integer ===");
        GenericStorage<Integer> intStorage = new GenericStorage<>();
        intStorage.addElement(10);
        intStorage.addElement(20);
        intStorage.addElement(30);
        intStorage.addElement(40);
        intStorage.displayAll();

        System.out.println("\nGet element at index 2: " + intStorage.getElement(2));
        System.out.println("Size: " + intStorage.getSize());

        intStorage.removeElement(1);
        intStorage.displayAll();

        // Test with String
        System.out.println("\n\n=== Testing with String ===");
        GenericStorage<String> stringStorage = new GenericStorage<>();
        stringStorage.addElement("Hello");
        stringStorage.addElement("World");
        stringStorage.addElement("Java");
        stringStorage.addElement("Generics");
        stringStorage.displayAll();

        System.out.println("\nGet element at index 0: " + stringStorage.getElement(0));
        System.out.println("Size: " + stringStorage.getSize());

        stringStorage.removeElement(2);
        stringStorage.displayAll();

        // Test with Double
        System.out.println("\n\n=== Testing with Double ===");
        GenericStorage<Double> doubleStorage = new GenericStorage<>();
        doubleStorage.addElement(3.14);
        doubleStorage.addElement(2.71);
        doubleStorage.addElement(1.41);
        doubleStorage.displayAll();

        System.out.println("\nGet element at index 1: " + doubleStorage.getElement(1));
        System.out.println("Size: " + doubleStorage.getSize());

        doubleStorage.removeElement(0);
        doubleStorage.displayAll();
    }
}