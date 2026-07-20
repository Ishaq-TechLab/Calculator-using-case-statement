# Java Calculator Using Switch Case

## Overview

This is a simple console-based calculator application written in Java that performs basic arithmetic operations using a **`switch` statement**. The program prompts the user to enter two numbers, select an operation from a menu, and then displays the calculated result.

This project demonstrates how to use `switch` statements to simplify decision-making compared to multiple `if-else` conditions.

## Features

* Addition
* Subtraction
* Multiplication
* Division
* Division-by-zero validation
* Invalid menu option handling
* User-friendly console interface

## Technologies Used

* Java
* `Scanner` class for user input
* `switch` statement for program flow
* Console-based application

## Project Structure

```text
day3/
└── CalculatorUsingCaseStatements.java
```

## How It Works

1. The program asks the user to enter the first number.
2. The user enters the second number.
3. A menu of available operations is displayed:

   * `1` – Addition
   * `2` – Subtraction
   * `3` – Multiplication
   * `4` – Division
4. The user selects an operation.
5. A `switch` statement determines which calculation to perform.
6. The result is displayed.
7. If the user attempts to divide by zero, an error message is shown.

## Example Output

```text
Enter the First Number
20

Enter the Second Number
4

Choose an operation
Enter 1 for Addition
Enter 2 for Subtraction
Enter 3 for Multiplication
Enter 4 for Division

3

You Chose option 3
Your Result=80.0
```

### Division by Zero Example

```text
Enter the First Number
15

Enter the Second Number
0

Choose an operation
4

Error : Division by zero is not allowed.
```

### Invalid Choice Example

```text
Choose an operation
5

You Chose option 5
You selected an invalid Choice
```

## How to Run

### Compile

```bash
javac day3/CalculatorUsingCaseStatements.java
```

### Run

```bash
java day3.CalculatorUsingCaseStatements
```

## Key Concepts Demonstrated

* Java classes and methods
* Variables and primitive data types
* User input using the `Scanner` class
* `switch` statements
* `break` statements
* Arithmetic operators
* Conditional logic
* Division-by-zero handling
* Console output formatting

## Why Use a Switch Statement?

Compared to using multiple `if-else` statements, a `switch` statement:

* Makes the code easier to read.
* Improves organization when handling multiple menu options.
* Is simpler to maintain and extend with additional operations.

## Possible Enhancements

* Add modulus (`%`) and exponent (`^`) operations.
* Allow users to perform multiple calculations without restarting the program.
* Validate non-numeric input using exception handling.
* Support decimal precision formatting.
* Create a graphical user interface (GUI) using Java Swing or JavaFX.

## Author
Ishaq Taj
# Java Calculator Using Switch Case

## Overview

This is a simple console-based calculator application written in Java that performs basic arithmetic operations using a **`switch` statement**. The program prompts the user to enter two numbers, select an operation from a menu, and then displays the calculated result.

This project demonstrates how to use `switch` statements to simplify decision-making compared to multiple `if-else` conditions.

## Features

* Addition
* Subtraction
* Multiplication
* Division
* Division-by-zero validation
* Invalid menu option handling
* User-friendly console interface

## Technologies Used

* Java
* `Scanner` class for user input
* `switch` statement for program flow
* Console-based application

## Project Structure

```text
day3/
└── CalculatorUsingCaseStatements.java
```

## How It Works

1. The program asks the user to enter the first number.
2. The user enters the second number.
3. A menu of available operations is displayed:

   * `1` – Addition
   * `2` – Subtraction
   * `3` – Multiplication
   * `4` – Division
4. The user selects an operation.
5. A `switch` statement determines which calculation to perform.
6. The result is displayed.
7. If the user attempts to divide by zero, an error message is shown.

## Example Output

```text
Enter the First Number
20

Enter the Second Number
4

Choose an operation
Enter 1 for Addition
Enter 2 for Subtraction
Enter 3 for Multiplication
Enter 4 for Division

3

You Chose option 3
Your Result=80.0
```

### Division by Zero Example

```text
Enter the First Number
15

Enter the Second Number
0

Choose an operation
4

Error : Division by zero is not allowed.
```

### Invalid Choice Example

```text
Choose an operation
5

You Chose option 5
You selected an invalid Choice
```

## How to Run

### Compile

```bash
javac day3/CalculatorUsingCaseStatements.java
```

### Run

```bash
java day3.CalculatorUsingCaseStatements
```

## Key Concepts Demonstrated

* Java classes and methods
* Variables and primitive data types
* User input using the `Scanner` class
* `switch` statements
* `break` statements
* Arithmetic operators
* Conditional logic
* Division-by-zero handling
* Console output formatting

## Why Use a Switch Statement?

Compared to using multiple `if-else` statements, a `switch` statement:

* Makes the code easier to read.
* Improves organization when handling multiple menu options.
* Is simpler to maintain and extend with additional operations.

## Possible Enhancements

* Add modulus (`%`) and exponent (`^`) operations.
* Allow users to perform multiple calculations without restarting the program.
* Validate non-numeric input using exception handling.
* Support decimal precision formatting.
* Create a graphical user interface (GUI) using Java Swing or JavaFX.

## Author
Ishaq Taj
QA Automation Engineer | Java | Selenium | Test Automation

