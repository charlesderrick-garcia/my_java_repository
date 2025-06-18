# **Lab Activity 2: Employee Information System (Part 2\)**

This Java program is an enhanced version of the previous basic Employee Information System. Apart from collecting personal and work-related input from the user, it now also provides a more comprehensive salary breakdown, including daily, weekly, monthly, gross yearly, and net yearly salaries. It also calculates the employee's years until retirement. This program was created for a laboratory activity.

## **Features**

* **User Input:** Gathers employee information (first name, last name, age, hours worked, hourly wage) through interactive console prompts.  
* **Case Conversion:** Converts first and last names to uppercase upon input.  
* **Years to Retirement Calculation:** Calculates and displays the number of years until the employee reaches 65 years old.  
* **Comprehensive Salary Calculation:**  
  * Calculates daily salary.  
  * Calculates weekly salary (based on 5 working days).  
  * Calculates monthly salary (based on 4 weeks per month).  
  * Calculates gross yearly salary.  
  * Calculates net yearly salary, applying a 32% tax deduction and an additional PHP 1500 deduction for government-mandated benefits.  
* **Formatted Output:** Displays all employee details and various salary figures, formatted to two decimal places.

## **How to Compile and Run**

To compile and run this Java application, follow these steps:

1. **Save the file:** Save the code as LabActivity2EmployeeInformationSystemPart2.java.  
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
Enter hourly wage: \[e.g., 100.00\]

After you provide all the inputs, the program will output the employee's information and salary breakdown:

Employee Information  
\---------------------  
Full Name:           GARCIA, CHARLES  
Age:                 18 years old  
Years to Retirement: 47 years  
Daily Salary:             Php 800.00  
Weekly Salary:            Php 4000.00  
Monthly Salary:           Php 16000.00  
Gross Yearly Salary:      Php 192000.00  
Net Yearly Salary:        Php 129460.00

## **Technologies Used**

* Java  
* java.util.Scanner for input handling  
* java.lang.Math for rounding calculations

## **Created by:**

**Author:** Charles Derrick A. Garcia

**Course:** Bachelor of Science in Computer Science