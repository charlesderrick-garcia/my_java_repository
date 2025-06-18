# **Lab Activity 3: Employee Information System with Conditional Statements**

This Java program is an advanced version of the previously created Employee Information Systems. This program incorporates conditional statements, specifically if-else and switch cases for input validation. It collects detailed employee information, as well as providing a comprehensive salary breakdown, which includes conditional tax deductions based on the employee’s income. This program was created for a laboratory activity.

## **Features**

* **User Input:** Gathers employee information (first name, last name, age, hours worked, hourly wage, and a role code) through interactive console prompts.  
* **Input Validation:**  
  * **Age Validation:** Prevents minors (under 18\) and senior citizens (65 and above) from proceeding with the program.  
  * **Work Hours Validation:** Ensures that daily hours worked are within a valid range (greater than 0 and not exceeding 24 hours).  
* **Case Conversion:** Converts first and last names to uppercase upon input.  
* **Role Assignment:** The program assigns an employee position (Manager, Supervisor, Staff, Intern, or Undefined) based on a numerical role code entered by the user, utilizing a switch statement.  
* **Years to Retirement Calculation:** Calculates and displays the number of years until the employee reaches 65 years old.  
* **Comprehensive Salary Calculation:**  
  * Calculates daily salary.  
  * Calculates weekly salary (based on 5 working days).  
  * Calculates monthly salary (based on 4 weeks per month).  
  * Calculates gross yearly salary.  
  * **Conditional Net Yearly Salary:**  
    * If the gross yearly salary exceeds PHP 250,000, a 32% tax deduction and an additional PHP 1500 for government-mandated benefits are applied.  
    * Otherwise, only the PHP 1500 government-mandated benefit deduction is applied.  
* **Formatted Output:** Displays all employee details and various salary figures, formatted to two decimal places for clarity.

## **How to Compile and Run**

To compile and run this Java application, follow these steps:

1. **Save the file:** Save the code as LabActivity3ConditionalStatement.java.  
2. **Open a terminal or command prompt.**  
3. **Navigate to the directory** where you saved the file.  
4. **Compile the Java code.**  
5. **Run the compiled program.**

## **Example Usage**

When you run the program, it will prompt you to enter the following information:

Enter your first name: \[e.g., Charles\]  
Enter your last name: \[e.g., Garcia\]  
Enter your age: \[e.g., 18\]  
Enter hours worked: \[e.g., 8.0\]  
Enter hourly wage: \[e.g., 200.00\]  
Enter role code (1-Manager, 2-Supervisor, 3-Staff, 4-Intern): \[e.g., 3\]

After you provide all the inputs, the program will output the employee's information and salary breakdown:

Employee Information  
\---------------------  
Full Name:               GARCIA, CHARLES  
Age:                     18 years old  
Position:                Staff  
Years to Retirement:     47 years  
Daily Salary:            Php 1600.00  
Weekly Salary:           Php 8000.00  
Monthly Salary:          Php 32000.00  
Gross Yearly Salary:     Php 384000.00  
Net Yearly Salary:       Php 260380.00

## **Technologies Used**

* Java  
* java.util.Scanner for input handling  
* java.lang.Math for rounding calculations

## **Created by:**

**Author:** Charles Derrick A. Garcia

**Course:** Bachelor of Science in Computer Science

