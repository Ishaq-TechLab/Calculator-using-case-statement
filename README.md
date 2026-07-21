# 🧮 Java Calculator Using Switch Case

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-orange?style=for-the-badge&logo=openjdk" alt="Java">
  <img src="https://img.shields.io/badge/IDE-Eclipse-blue?style=for-the-badge&logo=eclipseide" alt="Eclipse">
  <img src="https://img.shields.io/badge/Project-Console%20Application-success?style=for-the-badge" alt="Console Application">
  <img src="https://img.shields.io/badge/Status-Completed-brightgreen?style=for-the-badge" alt="Status">
</p>

## 📖 Overview

The **Java Calculator Using Switch Case** is a console-based application that performs basic arithmetic operations using Java's `switch` statement. Users enter two numbers, choose an operation from a menu, and the program calculates and displays the result.

This project demonstrates Java fundamentals including **user input**, **control flow with `switch`**, **arithmetic operations**, and **basic error handling**.

---

## ✨ Features

* ➕ Addition
* ➖ Subtraction
* ✖️ Multiplication
* ➗ Division
* 🚫 Division-by-zero validation
* ✅ Invalid menu option handling
* 💻 Simple console interface

---

## 🛠 Technologies Used

| Technology             | Purpose                   |
| ---------------------- | ------------------------- |
| ☕ Java                 | Programming Language      |
| 📥 Scanner             | User Input                |
| 🔀 Switch Statement    | Menu Selection            |
| ➗ Arithmetic Operators | Mathematical Calculations |
| 🖥 Console             | User Interface            |

---

## 📂 Project Structure

```text id="tg3x7r"
day3/
└── CalculatorUsingCaseStatements.java
```

---

## 🚀 How It Works

1. 🔢 Enter the first number.
2. 🔢 Enter the second number.
3. 📋 Choose an operation:

   * **1** ➜ Addition
   * **2** ➜ Subtraction
   * **3** ➜ Multiplication
   * **4** ➜ Division
4. 🧮 The `switch` statement processes the selected operation.
5. 📄 The result is displayed on the console.
6. ⚠️ If division by zero is attempted, an error message is shown.

---

## 🧾 Available Operations

| Choice | Operation         |
| :----: | ----------------- |
|  **1** | ➕ Addition        |
|  **2** | ➖ Subtraction     |
|  **3** | ✖️ Multiplication |
|  **4** | ➗ Division        |

---

## 🖥 Sample Output

```text id="sdw8t0"
Enter the First Number
20

Enter the Second Number
5

Choose an operation

Enter 1 for Addition
Enter 2 for Subtraction
Enter 3 for Multiplication
Enter 4 for Division

3

You Chose option 3

Your Result=100.0
```

---

## ➗ Division by Zero Example

```text id="5n8dht"
Enter the First Number
10

Enter the Second Number
0

Choose an operation

4

Error : Division by zero is not allowed.
```

---

## ❌ Invalid Choice Example

```text id="n09tfu"
Choose an operation

5

You Chose option 5

You selected an invalid Choice
```

---

## 📸 Application Screenshot

After uploading a screenshot to your GitHub repository, display it using:

```markdown id="1u6jlwm"
![Calculator Output](images/calculator-output.png)
```

Example repository structure:

```text id="3r7bh0"
CalculatorUsingCaseStatements/
│── README.md
│── images/
│     └── calculator-output.png
│── src/
│     └── day3/
│            └── CalculatorUsingCaseStatements.java
```

---

## ▶️ Running the Application

### Compile

```bash id="tdymc0"
javac day3/CalculatorUsingCaseStatements.java
```

### Run

```bash id="mdj4hb"
java day3.CalculatorUsingCaseStatements
```

---

## 📚 Concepts Demonstrated

* ☕ Java Fundamentals
* 📥 User Input using `Scanner`
* 🔀 `switch` Statements
* ➗ Arithmetic Operators
* ⚠️ Error Handling
* 🖥 Console-Based Applications

---

## 💡 Future Enhancements

* 🧮 Add modulus (`%`) and exponent (`^`) operations.
* 🎯 Format results to two decimal places.
* 🔄 Allow multiple calculations without restarting.
* ✅ Validate non-numeric input using exception handling.
* 📜 Display a calculation history.
* 🖥 Create a graphical user interface (GUI) using Java Swing or JavaFX.

---

## 📋 Example Calculations

| Input | Operation         | Output |
| ----: | ----------------- | -----: |
| 15, 5 | ➕ Addition        |     20 |
| 15, 5 | ➖ Subtraction     |     10 |
| 15, 5 | ✖️ Multiplication |     75 |
| 15, 5 | ➗ Division        |      3 |

---

## 📝 Notes

* Supports decimal (`double`) values for calculations.
* Division by zero is handled with an appropriate error message.
* Invalid menu selections display an informative message instead of causing the program to fail.
* The project demonstrates how a `switch` statement can simplify menu-driven applications.

---

## 👨‍💻 Author

**Your Name**

Java Programming Practice Project

⭐ **If you found this project helpful, consider giving it a star on GitHub!**


QA Automation Engineer | Java | Selenium | Test Automation

