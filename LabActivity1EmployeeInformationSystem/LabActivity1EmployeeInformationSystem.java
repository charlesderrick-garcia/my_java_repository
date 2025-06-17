
// Imports Java Scanner for User Input Commands
import java.util.Scanner;

public class LabActivity1EmployeeInformationSystem {

    public static void main(String[] args){
        // Defines Scanner Module for User Inputs
        Scanner scanner = new Scanner(System.in);

       // Prompts the User to Enter their First Name 
       System.out.print("Enter your first name: ");
       String firstName = scanner.nextLine();

       // Prompts the User to Enter their Last Name
       System.out.print("Enter your last name: ");
       String lastName = scanner.nextLine();

       // Prompts the User to Enter their Age 
       System.out.print("Enter your age: ");
       int userAge = scanner.nextInt();

       // Prompts the User to Enter their Hours Worked in a Day
       System.out.print("Enter hours worked: ");
       float dailyHoursWorked = scanner.nextFloat();

       // Prompts the User to Enter their Hourly Wage
       System.out.print("Enter hourly wage: ");
       float hourlyWage = scanner.nextFloat();
       
       // Prints the Header for the Employee's Information
       System.out.println("\nEmployee Information");
       System.out.println("---------------------");

       // Prints the Employee's concatenated First and Last Name
       System.out.println("Full Name   : " + firstName + " " + lastName);
       System.out.println("Age         : " + userAge + " years old");

       // Calculates the User's Daily Salary based on their Hours worked and Hourly Wage
       Float dailySalary = dailyHoursWorked * hourlyWage;

       // Prints the User's Daily Salary, rounded off to two decimal places
       System.out.printf("Daily Salary: PHP %.2f\n", dailySalary);

       // Closes the Scanner
       scanner.close();

    }
}