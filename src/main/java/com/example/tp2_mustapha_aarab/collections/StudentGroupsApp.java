package com.example.tp2_mustapha_aarab.collections;


import java.util.HashSet;

public class StudentGroupsApp {
    public static void main(String[] args) {
        // Create two HashSets
        HashSet<String> groupA = new HashSet<>();
        HashSet<String> groupB = new HashSet<>();

        // 1. Add student names to each HashSet
        System.out.println("=== Adding Students to Groups ===");

        // Group A
        groupA.add("Alice");
        groupA.add("Bob");
        groupA.add("Charlie");
        groupA.add("Diana");
        groupA.add("Eve");

        // Group B
        groupB.add("Charlie");
        groupB.add("Diana");
        groupB.add("Frank");
        groupB.add("Grace");
        groupB.add("Henry");

        System.out.println("Group A: " + groupA);
        System.out.println("Group B: " + groupB);

        // 2. Display the intersection of the two HashSets
        System.out.println("\n=== Intersection (Students in both groups) ===");
        HashSet<String> intersection = new HashSet<>(groupA);
        intersection.retainAll(groupB);
        System.out.println("Intersection: " + intersection);

        // 3. Display the union of the two HashSets
        System.out.println("\n=== Union (All students) ===");
        HashSet<String> union = new HashSet<>(groupA);
        union.addAll(groupB);
        System.out.println("Union: " + union);

        // Additional: Display difference (students only in A)
        System.out.println("\n=== Difference (Only in Group A) ===");
        HashSet<String> onlyInA = new HashSet<>(groupA);
        onlyInA.removeAll(groupB);
        System.out.println("Only in A: " + onlyInA);
    }
}