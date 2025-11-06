# 🔥 Celsius/Fahrenheit Converter

## Overview

This is a simple, command-line utility built in Java to perform conversions between the **Celsius** ($\text{°C}$) and **Fahrenheit** ($\text{°F}$) temperature scales. It is an ideal introductory project for students learning core Java concepts like **interactive menus**, **user input processing**, **control flow** (`switch`, `while`), and basic **exception handling** (`InputMismatchException`).

The program offers an interactive loop that allows the user to perform multiple conversions before choosing to exit.

## ✨ Features

  * **Two-Way Conversion:** Convert Celsius to Fahrenheit and Fahrenheit to Celsius.
  * **Interactive Menu:** A clear, numbered menu for selecting the conversion type.
  * **Robust Input Handling:** Includes a `try-catch` block to handle non-numeric input for the main menu choice.
  * **Continuous Operation:** The program loops, asking the user if they want to perform another conversion until they explicitly choose to exit.

-----

## 🚀 How to Run

### Prerequisites

You need to have the **Java Development Kit (JDK) 11 or newer** installed to compile and run the application.

### Compilation

1.  Save the provided code as `CelsiusFahrenheit.java`.
2.  Open your terminal or command prompt.
3.  Navigate to the directory where you saved the file.
4.  Compile the Java file:
    ```bash
    javac CelsiusFahrenheit.java
    ```

### Execution

Since the provided code defines a class method `runConverter()`, we assume a standard `main` method is present or will be added to start the application.

**You can run the program with:**

```bash
java CelsiusFahrenheit
```

### Example Interaction

```
--- Temperature Converter ---
1. Convert Celsius to Fahrenheit
2. Convert Fahrenheit to Celsius
3. Exit Program
Enter your choice (1-3): 1
Enter Celsius to convert to Fahrenheit: 37
Result: 98.6°F
Do you want to convert more?
yes
--- Temperature Converter ---
1. Convert Celsius to Fahrenheit
...
```

-----

## 📝 Conversion Formulas

The program implements the standard mathematical equations for temperature conversion:

### 1\. Celsius to Fahrenheit

The Fahrenheit temperature F is calculated using the Celsius temperature C:

F = C * 9/5 + 32

### 2\. Fahrenheit to Celsius

The Celsius temperature ($\text{C}$) is calculated using the Fahrenheit temperature ($\text{F}$):

C = F - 32 * 5/9

-----

## 💡 Code Highlights for Practice

| Method | Focus Area | Notes |
| :--- | :--- | :--- |
| `runConverter()` | **Control Flow & Error Handling** | Contains the `while` loop, `switch` statement, and the `try-catch` block for handling invalid menu input. |
| `celsiusToFahrenheitMathematics()` | **Pure Function Design** | This method only performs the calculation and takes no external dependencies (like `Scanner`), making it easy to test. |
| `askAgain(Scanner input)` | **Input Validation & Looping** | Demonstrates how to check a user's textual response against a list of accepted answers (`yes`, `yea`, `no`, `nope`, etc.) to control the program loop. |
$$
