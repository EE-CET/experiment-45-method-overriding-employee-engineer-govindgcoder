[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/_yne3m16)
# Experiment 45: Method Overriding (Employee/Engineer)

## Problem Statement

Create a class `Employee` with a method `display()` that prints "Name of class is Employee".
Create a subclass `Engineer` that overrides `display()` to print "Name of class is Engineer".

In the main method:
1. Create an `Engineer` object.
2. Call `display()` on it.
3. Inside the `Engineer`'s `display()` method (or a separate method called from main), use the `super` keyword to call the base class `display()` method.

**Requirement:** The output must appear in the specific order shown below.

## Input Format

* No input.

## Output Format

* Output of Engineer's display method.
* Output of Employee's display method (called via super).

### Example 1

**Input:**

```text
No input
```

**Output:**

```text
Name of class is Engineer
Name of class is Employee
```
