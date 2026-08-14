# Java Module 1 Assignment – Antigravity Instructions

## Objective

Complete all the Java programming questions given in the uploaded assignment PDF.

The code is for a **college assignment**, so keep everything **simple, beginner-friendly, and easy to explain in a viva**.

## Important Coding Rules

1. Use **Java only**.
2. Use basic Java concepts wherever possible.
3. Do NOT use advanced libraries, frameworks, or complicated techniques.
4. Keep the code easy enough for a **beginner Java student to understand and explain**.
5. Prefer simple `Scanner`, loops, `if-else`, `switch`, arrays, classes, and methods.
6. Do not unnecessarily use advanced concepts such as:

   * Streams
   * Lambda expressions
   * Generics unless required
   * Collections unless required
   * Complex exception handling
   * Multithreading
   * Design patterns except where specifically asked
7. Each question should have a **separate Java program**.
8. Use simple and meaningful class names.
9. Add short comments only where they help explain the code.
10. Do not make the code unnecessarily long.
11. Do not combine multiple assignment questions into one program.
12. The output should be simple and clearly demonstrate that the question has been solved.

## For Every Question

For each question, provide:

### 1. Question

Write the original assignment question.

### 2. Concept

Mention the Java concept being demonstrated in one or two lines.

### 3. Code

Provide the complete Java program.

### 4. Sample Output

Show a simple example of what the program produces.

### 5. Short Explanation

Explain the important parts of the code in very simple language.

The explanation should be something I can understand and explain to my teacher during a viva.

---

# Questions to Complete

## A. Access Modifiers and Basic Java Concepts

### 1. Access Modifiers

Explain and implement the concept of access modifiers in Java.

Demonstrate:

* `public`
* `private`
* `protected`
* default

Keep the example very simple.

### 2. Final Keyword

Show examples of the `final` keyword for:

* variables
* methods
* classes

Use separate small examples if that makes the concept easier to understand.

### 3. StringBuilder

Write a program using Java's `StringBuilder` for efficient string operations.

Demonstrate simple operations such as:

* append
* insert
* reverse

### 4. String Immutability

Write a simple program demonstrating that Java's `String` class is immutable.

Clearly show that modifying a String creates a new String rather than changing the original object.

---

# B. Data Types, Control Statements and Identifiers

### 5. Primitive Data Types

Write a program to declare variables of all primitive data types in Java and print their values.

Important:
Java local variables do not have default values, so if demonstrating default values, use **class/instance variables**.

Demonstrate:

* byte
* short
* int
* long
* float
* double
* char
* boolean

### 6. Control Statements

Write a program demonstrating:

* if-else
* switch
* for loop

Keep the example simple.

### 7. Prime Number Using While Loop

Write a program to check whether a number is prime using a `while` loop.

Take the number from the user using `Scanner`.

### 8. Factorial Using Recursion

Write a program to calculate the factorial of a number using recursion.

Explain the base condition simply.

### 9. Valid and Invalid Identifiers

Create a program to identify valid and invalid Java identifiers.

Since invalid identifiers cannot be declared directly in Java code, demonstrate this using strings and simple validation rules.

Explain rules such as:

* cannot start with a digit
* cannot contain spaces
* cannot use Java keywords
* can contain letters, digits, `_` and `$`

---

# C. Arrays and Basic Programs

### 10. Largest and Smallest

Write a program to find the largest and smallest numbers in an array.

### 11. Odd or Even

Write a program to check whether a number is odd or even.

### 12. Largest of Three Numbers

Write a program to take three numbers from the user and find the largest.

### 13. Factorial Using Recursion

Write another simple program to calculate factorial using recursion.

Keep it separate from Question 8 because each assignment question should have its own program.

### 14. Palindrome

Write a program to check whether a given string or number is a palindrome.

Use a simple approach.

### 15. Fibonacci Series

Write a program to generate the first `n` terms of the Fibonacci series.

### 16. Prime Number

Write a program to check whether a number is prime.

Use a simple approach.

### 17. Sum of Array

Write a program to find the sum of all elements in an array.

### 18. Reverse Array

Write a program to reverse the elements of an array.

### 19. Matrix Addition and Multiplication

Write a Java program to perform:

* matrix addition
* matrix multiplication

Use small matrices and simple nested loops.

### 20. Bubble Sort

Write a program to sort an array using the bubble sort algorithm.

Do not use `Arrays.sort()`.

### 21. 2D Array

Create a program demonstrating a 2D array and print its elements.

### 22. Binary Search

Write a program to search for an element in a **sorted array** using binary search.

Explain the `low`, `high`, and `mid` variables simply.

### 23. Remove Duplicate Elements

Write a program to remove duplicate elements from an array.

Use a beginner-friendly approach.

---

# D. Operators

### 24. Arithmetic, Relational and Logical Operators

Write a program demonstrating:

* arithmetic operators
* relational operators
* logical operators

Show simple examples.

### 25. == vs equals()

Create a program showing the difference between `==` and `.equals()` when comparing Strings.

Explain why the results can be different.

### 26. Ternary Operator

Write a simple program demonstrating the ternary operator.

Example:
Check whether a number is positive/negative or even/odd.

### 27. Bitwise Operators

Write a program demonstrating basic bitwise operations:

* `&`
* `|`
* `^`
* `~`
* `<<`
* `>>`

Keep the numbers small.

### 28. Operator Precedence

Write a program demonstrating operator precedence in Java.

Use simple arithmetic expressions and explain which operation is performed first.

---

# E. Classes and Constructors

### 29. Constructor Overloading

Create a class with multiple constructors.

Demonstrate:

* default constructor
* parameterized constructor
* another parameterized constructor with different parameters

Explain constructor overloading.

### 30. Copy Constructor

Implement a program demonstrating a copy constructor in Java.

Since Java does not have a built-in copy constructor like some languages, create a constructor that receives an object of the same class and copies its values.

### 31. Parameterized Constructor

Create a program that initializes class fields using a parameterized constructor.

### 32. Static and Non-Static Methods

Write a program demonstrating:

* static method
* non-static method

Explain how they are called.

### 33. Singleton Class

Implement a simple Singleton class in Java.

Keep the implementation as simple as possible and explain why only one object is created.

---

# F. Inheritance and Method Overriding

### 34. Multilevel Inheritance

Write a program demonstrating multilevel inheritance.

Use a simple example such as:

Animal → Dog → Puppy

or

Grandparent → Parent → Child

### 35. Method Overriding and super

Create a program demonstrating:

* method overriding
* `super` keyword
* calling the parent class method using `super`

Keep the example simple.

### 36. Abstract Class

Implement an abstract class and override its methods in a subclass.

Use a simple example such as Shape, Animal, or Vehicle.

### 37. Final Class and Final Method

Write a program demonstrating:

* final class
* final method

Explain what cannot be changed or overridden.

### 38. Runtime Polymorphism

Create a program demonstrating runtime polymorphism using dynamic method dispatch.

Use a parent class reference pointing to a child class object.

Keep the example very simple.

---

# G. String Class and Operations

### 39. Reverse String

Write a program to reverse a string **without using a built-in reverse method**.

Use a loop.

### 40. Character Frequency

Write a program to count the frequency of each character in a String.

Keep the implementation beginner-friendly.

### 41. String Immutability

Write another simple program demonstrating String immutability.

Clearly show the original String and the new String.

### 42. String Palindrome

Create a program to check whether a given String is a palindrome.

Do not use complicated techniques.

### 43. Split String

Implement a program to split a String into words and print each word on a new line.

---

# Code Style

Use this general structure wherever appropriate:

```java
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Simple code here

        sc.close();
    }
}
```

Do not force `Scanner` into programs where user input is not necessary.

## Naming

Use simple names such as:

* `PrimeNumber`
* `Factorial`
* `Palindrome`
* `ArraySum`
* `BubbleSort`
* `Student`
* `Animal`
* `Dog`

Avoid unnecessarily complicated names.

## Output

Keep output simple, for example:

```text
Enter a number: 7
7 is a prime number.
```

## Explanations

Use beginner-level language.

For example, instead of:

> "The recursive function maintains a call stack until the termination condition is satisfied."

write:

> "The method keeps calling itself with a smaller number until it reaches 1. This is the stopping condition."

## Important

Do not try to make the project look like professional software.

This is a **college Java assignment**, so the priority is:

**Simple code → Correct output → Easy explanation → Easy viva**

Do not add unnecessary GUI, database, Maven, Spring, packages, advanced OOP patterns, or external libraries.

Create all programs in a clean folder structure and make sure every program can be compiled and run independently.
