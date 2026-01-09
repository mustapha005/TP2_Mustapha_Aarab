package com.example.tp2_mustapha_aarab.generics;


import java.util.ArrayList;
import java.util.List;

public class GenericStorage<T> {
    private List<T> elements;

    // Constructor
    public GenericStorage() {
        this.elements = new ArrayList<>();
    }

    // Add an element to the collection
    public void addElement(T o) {
        elements.add(o);
        System.out.println("Element added: " + o);
    }

    // Remove an element by index
    public void removeElement(int index) {
        if (index >= 0 && index < elements.size()) {
            T removed = elements.remove(index);
            System.out.println("Element removed: " + removed);
        } else {
            System.out.println("Invalid index!");
        }
    }

    // Get an element at a given position
    public T getElement(int index) {
        if (index >= 0 && index < elements.size()) {
            return elements.get(index);
        } else {
            System.out.println("Invalid index!");
            return null;
        }
    }

    // Get the current size of the list
    public int getSize() {
        return elements.size();
    }

    // Display all elements
    public void displayAll() {
        System.out.println("Storage contents (" + elements.size() + " elements):");
        for (int i = 0; i < elements.size(); i++) {
            System.out.println("  [" + i + "] " + elements.get(i));
        }
    }
}