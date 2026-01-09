📚 Collections & Generics Lab – Java Project
📋 Project Overview

This project demonstrates Java Collections (List, Map, Set) and Generics concepts through practical examples, including data manipulation, CRUD operations, and type-safe generic programming.

Author: Mustapha AARAB
Course: Object-Oriented Programming in Java
Instructor: Loubna Aminou
Academic Year: 2025/2026

📦 Part I: Collections & Streams
1️⃣ Lists – Product Management (collections package)

Product.java
Model class representing a product with id, name, and price.
Includes constructor, getters, setters, and toString() for easy display.

ProductManagementApp.java
Demonstrates ArrayList operations:

Add products

<img width="730" height="306" alt="image" src="https://github.com/user-attachments/assets/fc461757-c6d4-448a-9ea7-506bbfd273cf" />



Delete products by index


<img width="720" height="324" alt="image" src="https://github.com/user-attachments/assets/87641ac6-08f4-4951-a622-a622157e023a" />


Display all products

Modify product details

Search products by name (user input)


<img width="707" height="513" alt="image" src="https://github.com/user-attachments/assets/a4f94188-1ca8-49bf-b409-387b83750ac0" />



📌 Shows how to manipulate dynamic arrays in Java.

2️⃣ Maps – Student Grades Management

StudentGradesApp.java
Uses a HashMap<String, Double> to manage student grades:

Insert and update grades

Increase a student’s grade


<img width="743" height="772" alt="image" src="https://github.com/user-attachments/assets/c770e8b1-bc4a-495b-abbf-968cd65642ea" />


Delete entries


<img width="608" height="335" alt="image" src="https://github.com/user-attachments/assets/09a51194-e7fa-44dd-8b0f-44308621159f" />


Display map size


<img width="397" height="104" alt="image" src="https://github.com/user-attachments/assets/9868f5ab-61fe-4db9-985a-14820d5323a9" />



Calculate statistics (average, max, min)


<img width="401" height="197" alt="image" src="https://github.com/user-attachments/assets/4fde0554-5571-41ce-88d5-5ca2bf1c44aa" />


Check for specific grade values

<img width="603" height="118" alt="image" src="https://github.com/user-attachments/assets/aadbeb1e-0f71-40b7-b6f6-4b7894821ffb" />


Display all entries using forEach and lambda expressions


<img width="366" height="236" alt="image" src="https://github.com/user-attachments/assets/81cf28ee-ff65-4d97-bf45-51dfe2462f79" />



📌 Demonstrates key-value management and functional programming.

3️⃣ Sets – Student Groups Operations

StudentGroupsApp.java
Uses two HashSet<String> collections:


<img width="839" height="169" alt="image" src="https://github.com/user-attachments/assets/06830b87-f220-4786-a718-dd1e19a8d067" />




Intersection (common students)


<img width="787" height="127" alt="image" src="https://github.com/user-attachments/assets/a28c8968-45d3-4433-87ab-600e912a8d63" />



Union (all unique students)


<img width="1049" height="131" alt="image" src="https://github.com/user-attachments/assets/97b7be28-0559-439b-ad8c-2615b1b0d3eb" />




Difference (students only in one group)



<img width="603" height="124" alt="image" src="https://github.com/user-attachments/assets/e327788b-b87b-4d9f-938e-18349a08606c" />



📌 Demonstrates set theory and uniqueness constraints.

🔧 Part II: Generics
1️⃣ Generic Storage System (generics package)

GenericStorage<T>

Generic class capable of storing any data type

Methods: add, remove by index, retrieve by index, get size, display all elements

Ensures type safety without casting

Application.java

Tests GenericStorage with Integer, String, and Double

Demonstrates flexibility and reusability of generics


<img width="678" height="1700" alt="image" src="https://github.com/user-attachments/assets/e89f6e60-b3c1-472b-8e8b-aaacb6b9ffbe" />




<img width="709" height="780" alt="image" src="https://github.com/user-attachments/assets/bcf04c7c-ddf9-4bdc-adcb-6c08ba1a52ef" />






2️⃣ Product Management System (products package)

Product.java
Enhanced product model with:

id, name, brand, price, description, stockQuantity

Fully encapsulated with getters and setters

IMetier<T>
Generic interface defining CRUD operations:

add

getAll

findById

delete

MetierProduitImpl.java

Implements IMetier<Product>

Uses ArrayList to store products

Implements all CRUD functionalities

Application.java
Menu-driven console application:

Display all products

Search product by ID

Add a new product

Delete a product by ID

Exit





<img width="1061" height="1821" alt="image" src="https://github.com/user-attachments/assets/812485f7-41e5-4968-9104-5f4e93efab49" />






<img width="855" height="862" alt="image" src="https://github.com/user-attachments/assets/abb70d89-4719-41c5-8c29-682b1d96ea80" />







📌 Provides an interactive CRUD experience.

🎯 Key Learning Outcomes
✅ Collections Framework

ArrayList for dynamic lists

HashMap for fast key-value access

HashSet for unique elements and set operations

Lambda expressions and forEach loops

✅ Generics

Generic classes and interfaces

Type-safe programming

Reusable and flexible code

Compile-time error detection

✅ Software Design Principles

Encapsulation

Interface-based design

Full CRUD implementation

Menu-driven console applications

Code reusability and maintainability

🚀 How to Run the Project

Each class contains a main method.

In IntelliJ IDEA:

Right-click the Java file

Select Run [ClassName].main()

Follow the console instructions

▶ Classes to Run

collections.ProductManagementApp

collections.StudentGradesApp

collections.StudentGroupsApp

generics.Application

products.Application

📊 Project Structure Summary
src/
├── collections/
│   ├── Product.java
│   ├── ProductManagementApp.java
│   ├── StudentGradesApp.java
│   └── StudentGroupsApp.java
│
├── generics/
│   ├── GenericStorage.java
│   └── Application.java
│
└── products/
    ├── Product.java
    ├── IMetier.java
    ├── MetierProduitImpl.java
    └── Application.java

🔗 GitHub Repository

👉 https://github.com/mustapha005/TP2_Mustapha_Aarab

⭐ Educational project demonstrating Java Collections and Generics

