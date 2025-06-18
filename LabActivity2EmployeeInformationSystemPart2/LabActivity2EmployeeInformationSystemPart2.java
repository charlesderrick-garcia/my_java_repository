
// Imports Java Scanner for User Input Commands
import java.util.Scanner;

public class LabActivity2EmployeeInformationSystemPart2 {

    public static void main(String[] args){
        // Defines Scanner Module for User Inputs
        Scanner scanner = new Scanner(System.in);

       // Prompts the User to Enter their First Name 
       System.out.print("Enter your first name: ");
       String firstName = scanner.nextLine().toUpperCase();

       // Prompts the User to Enter their Last Name
       System.out.print("Enter your last name: ");
       String lastName = scanner.nextLine().toUpperCase();

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
       System.out.println("Full Name:           " + lastName + ", " + firstName);
       System.out.println("Age:                 " + userAge + " years old");

       // Prints the Employee's Years to Retirement
       int yearsToRetirement = 65 - userAge;
       System.out.println("Years to Retirement: " + yearsToRetirement + " years");

       // Calculates the User's Daily Salary based on their Hours worked and Hourly Wage
       Float dailySalary = (float) Math.round(dailyHoursWorked * hourlyWage);

       // Prints the User's Daily Salary, rounded off to two decimal places
       System.out.printf("Daily Salary:             Php %.2f\n", dailySalary);

       // Prints the User's Weekly Salary, rounded off to two decimal places
       Float weeklySalary = (dailyHoursWorked * hourlyWage) * 5;
       System.out.printf("Weekly Salary:            Php %.2f\n", weeklySalary);

       // Prints the User's Monthly Salary, rounded off to two decimal places
       Float monthlySalary = (weeklySalary) * 4;
       System.out.printf("Monthly Salary:           Php %.2f\n", monthlySalary);

       // Prints the User's Gross Yearly Salary, rounded off to two decimal places
       Float grossYearlySalary = (monthlySalary) * 12;
       System.out.printf("Gross Yearly Salary:      Php %.2f\n", grossYearlySalary);

       // Calculates and Prints the User's Net Yearly Salary. 
       // 32% of the Yearly Salary is subtracted from the gross yearly salary
       // PHP1500 is also subtracted due to the deduction of government mandated benefits
       Float percentageYearlySalary = (grossYearlySalary * 0.32f);
       Float gvmtMandateSalary = (float) (Math.round((grossYearlySalary - percentageYearlySalary) * 10)) / 10 - 1500;;
       System.out.printf("Net Yearly Salary:        Php %.2f\n", gvmtMandateSalary);             

       // Closes the Scanner
       scanner.close();

    }

}
