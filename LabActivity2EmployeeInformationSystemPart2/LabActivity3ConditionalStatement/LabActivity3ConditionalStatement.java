// Imports Java Scanner for User Input Commands
import java.util.Scanner;

public class LabActivity3ConditionalStatement {

    public static void main(String[] args){
        // Defines Scanner Module for User Inputs
        Scanner scanner = new Scanner(System.in);

       // Prompts the User to Enter their First Name 
       System.out.print("Enter your first name: ");
       String firstName = scanner.nextLine().toUpperCase();

       // Prompts the User to Enter their Last Name
       System.out.print("Enter your last name: ");
       String lastName = scanner.nextLine().toUpperCase();

       // Prompts the User to Enter their Age, and Checks Whether the User is a Minor or a Senior Citizen
       System.out.print("Enter your age: ");
       int userAge = scanner.nextInt();
            if (userAge < 18){
                System.out.print("Minors are not allowed");
                System.exit(0); 
            } else if (userAge >= 65){
                System.out.print("Senior Citizens are not allowed");
                System.exit(0); 
              }            

       // Prompts the User to Enter their Hours Worked in a Day
       System.out.print("Enter hours worked: ");
       float dailyHoursWorked = scanner.nextFloat();
            if (dailyHoursWorked == 0){
                System.out.print("Wrong input on daily work hours");
                System.exit(0); 
            } else if (dailyHoursWorked > 24){
                System.out.print("Number of hours worked cannot exceed 24 hours");
                System.exit(0); 
              }  
       // Prompts the User to Enter their Hourly Wage
       System.out.print("Enter hourly wage: ");
       float hourlyWage = scanner.nextFloat();
        
       // Prompts the User to Enter a Code based off of their Role in the Company 
       System.out.print("Enter role code (1-Manager, 2-Supervisor, 3-Staff, 4-Intern): ");
       int roleCode = scanner.nextInt();

       // Prints the Header for the Employee's Information
       System.out.println("\nEmployee Information");
       System.out.println("---------------------");

       // Prints the Employee's concatenated First and Last Name
       System.out.println("Full Name:               " + lastName + ", " + firstName);
       System.out.println("Age:                     " + userAge + " years old");

       //Prints the Employee's Position According to their Entered Code (1-Manager, 2-Supervisor, 3-Staff, 4-Intern)
       String role;
       switch (roleCode){
        case 1: 
            role = "Manager";
            break;
        case 2: 
            role = "Supervisor";
            break;      
        case 3:  
            role = "Staff";
            break; 
        case 4: 
            role = "Intern";
            break; 
        default:
            role = "Undefined";
            break; 
       }
       System.out.print("Position:                " + role + "\n");     

       // Prints the Employee's Years to Retirement
       int yearsToRetirement = 65 - userAge;
       System.out.println("Years to Retirement:     " + yearsToRetirement + " years");

       // Calculates the User's Daily Salary based on their Hours worked and Hourly Wage
       Float dailySalary = (float) Math.round(dailyHoursWorked * hourlyWage);

       // Prints the User's Daily Salary, rounded off to two decimal places
       System.out.printf("Daily Salary:            Php %.2f\n", dailySalary);

       // Prints the User's Weekly Salary, rounded off to two decimal places
       Float weeklySalary = (dailyHoursWorked * hourlyWage) * 5;
       System.out.printf("Weekly Salary:           Php %.2f\n", weeklySalary);

       // Prints the User's Monthly Salary, rounded off to two decimal places
       Float monthlySalary = (weeklySalary) * 4;
       System.out.printf("Monthly Salary:          Php %.2f\n", monthlySalary);

       // Prints the User's Gross Yearly Salary, rounded off to two decimal places
       Float grossYearlySalary = (monthlySalary) * 12;
       System.out.printf("Gross Yearly Salary:     Php %.2f\n", grossYearlySalary);

       // Calculates and Prints the User's Net Yearly Salary. 
       // If Gross Yearly Salary is Greater than 250,000, deduct 32% of taxes and 1,500 government mandated-benefits. Else, deduct only the government-mandated benefits
       Float yearlySalaryDeductedTax = (grossYearlySalary * 0.32f);
       if (grossYearlySalary > 250000){
            Float netYearlySalaryTaxed = (float) (Math.round((grossYearlySalary - yearlySalaryDeductedTax) * 10)) / 10 - 1500;
            System.out.printf("Net Yearly Salary:       Php %.2f\n", netYearlySalaryTaxed);
       } else {
            Float netYearlySalary = (grossYearlySalary - 1500);
            System.out.printf("Net Yearly Salary:       Php %.2f\n", netYearlySalary);
       }          

       // Closes the Scanner
       scanner.close();

    }

}

