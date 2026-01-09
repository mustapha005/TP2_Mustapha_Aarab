package com.example.tp2_mustapha_aarab.collections;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGradesApp {
    public static void main(String[] args) {
        HashMap<String, Double> studentGrades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // 1. Insert student grades
        System.out.println("=== Inserting Student Grades ===");
        studentGrades.put("Alice", 18.5);
        studentGrades.put("Bob", 15.0);
        studentGrades.put("Charlie", 20.0);
        studentGrades.put("Diana", 17.5);
        studentGrades.put("Eve", 12.0);
        System.out.println("Grades inserted!");
        displayGrades(studentGrades);

        // 2. Increase a student's grade
        System.out.println("\n=== Increasing a Grade ===");
        System.out.print("Enter student name to increase grade: ");
        String studentName = scanner.nextLine();
        if (studentGrades.containsKey(studentName)) {
            System.out.print("Enter amount to increase: ");
            double increase = scanner.nextDouble();
            studentGrades.put(studentName, studentGrades.get(studentName) + increase);
            System.out.println("Grade increased!");
        } else {
            System.out.println("Student not found!");
        }
        displayGrades(studentGrades);

        // 3. Delete a student's grade
        System.out.println("\n=== Deleting a Grade ===");
        scanner.nextLine(); // consume newline
        System.out.print("Enter student name to delete: ");
        String deleteStudent = scanner.nextLine();
        if (studentGrades.remove(deleteStudent) != null) {
            System.out.println("Grade deleted!");
        } else {
            System.out.println("Student not found!");
        }
        displayGrades(studentGrades);

        // 4. Display the size of the map
        System.out.println("\n=== Map Size ===");
        System.out.println("Number of students: " + studentGrades.size());

        // 5. Display average, maximum, and minimum grades
        System.out.println("\n=== Statistics ===");
        double sum = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (Double grade : studentGrades.values()) {
            sum += grade;
            if (grade > max) max = grade;
            if (grade < min) min = grade;
        }

        double average = sum / studentGrades.size();
        System.out.println("Average grade: " + average);
        System.out.println("Maximum grade: " + max);
        System.out.println("Minimum grade: " + min);

        // 6. Check if there is a grade equal to 20
        System.out.println("\n=== Check for Grade 20 ===");
        boolean hasGrade20 = studentGrades.containsValue(20.0);
        System.out.println("Is there a grade equal to 20? " + hasGrade20);

        // Final display
        System.out.println("\n=== Final Grades ===");
        displayGrades(studentGrades);

        scanner.close();
    }

    // Helper method to display grades using forEach with lambda
    private static void displayGrades(HashMap<String, Double> grades) {
        grades.forEach((name, grade) ->
                System.out.println(name + ": " + grade)
        );
    }
}
