# Java Operators and Conditions

In Java, operators are special symbols that perform specific operations on one, two, or three operands and then return a result. Conditions are used to perform different actions based on different conditions. Here is an overview of the different types of operators and conditional statements in Java:

# Logical Operators in Java

## AND Operator (`&`)

| Operand 1 | Operand 2 | Result    |
| --------- | --------- | --------- |
| T (True)  | T (True)  | T (True)  |
| T (True)  | F (False) | F (False) |
| F (False) | T (True)  | F (False) |
| F (False) | F (False) | F (False) |

## OR Operator (`|`)

| Operand 1 | Operand 2 | Result    |
| --------- | --------- | --------- |
| T (True)  | T (True)  | T (True)  |
| T (True)  | F (False) | T (True)  |
| F (False) | T (True)  | T (True)  |
| F (False) | F (False) | F (False) |

## NOT Operator (`!`)

| Operand   | Result    |
| --------- | --------- |
| T (True)  | F (False) |
| F (False) | T (True)  |

### Arithmetic Operators

Arithmetic operators are used to perform basic mathematical operations.

- `+` (Addition): Adds two operands.
  - Example: `int sum = a + b;`
- `-` (Subtraction): Subtracts the second operand from the first.
  - Example: `int difference = a - b;`
- `*` (Multiplication): Multiplies two operands.
  - Example: `int product = a * b;`
- `/` (Division): Divides the first operand by the second.
  - Example: `int quotient = a / b;`
- `%` (Modulus): Returns the remainder of the division.
  - Example: `int remainder = a % b;`

### Relational Operators

Relational operators are used to compare two values.

- `==` (Equal to): Checks if two operands are equal.
  - Example: `if (a == b)`
- `!=` (Not equal to): Checks if two operands are not equal.
  - Example: `if (a != b)`
- `>` (Greater than): Checks if the left operand is greater than the right.
  - Example: `if (a > b)`
- `<` (Less than): Checks if the left operand is less than the right.
  - Example: `if (a < b)`
- `>=` (Greater than or equal to): Checks if the left operand is greater than or equal to the right.
  - Example: `if (a >= b)`
- `<=` (Less than or equal to): Checks if the left operand is less than or equal to the right.
  - Example: `if (a <= b)`

### Logical Operators

Logical operators are used to combine multiple boolean expressions.

- `&&` (Logical AND): Returns true if both operands are true.
  - Example: `if (a > b && a < c)`
- `||` (Logical OR): Returns true if at least one of the operands is true.
  - Example: `if (a > b || a < c)`
- `!` (Logical NOT): Reverses the logical state of its operand.
  - Example: `if (!a)`

### Assignment Operators

Assignment operators are used to assign values to variables.

- `=` (Assignment): Assigns the right operand to the left operand.
  - Example: `int a = 10;`
- `+=` (Add and assign): Adds the right operand to the left operand and assigns the result to the left operand.
  - Example: `a += b;` (equivalent to `a = a + b;`)
- `-=` (Subtract and assign): Subtracts the right operand from the left operand and assigns the result to the left operand.
  - Example: `a -= b;` (equivalent to `a = a - b;`)
- `*=` (Multiply and assign): Multiplies the left operand by the right operand and assigns the result to the left operand.
  - Example: `a *= b;` (equivalent to `a = a * b;`)
- `/=` (Divide and assign): Divides the left operand by the right operand and assigns the result to the left operand.
  - Example: `a /= b;` (equivalent to `a = a / b;`)
- `%=` (Modulus and assign): Takes the modulus using two operands and assigns the result to the left operand.
  - Example: `a %= b;` (equivalent to `a = a % b;`)

### Conditional (Ternary) Operator

The conditional operator is a shorthand for the `if-else` statement.

- `? :` (Ternary): Evaluates a boolean expression and returns one of two values.
  - Example: `int result = (a > b) ? a : b;`

## Conditional Statements

Conditional statements are used to perform different actions based on different conditions.

### if Statement

Executes a block of code if the condition is true.

```java
if (condition) {
    // code to be executed if condition is true
}
```
