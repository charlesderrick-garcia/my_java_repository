# **Midterm Laboratory Exam: IT Ticket Processing System**

This Java program simulates a basic IT ticket processing system. It allows users to add new tickets, update their statuses, view all existing tickets, and generate a summary report. The system uses arrays to store ticket information and includes input validation to ensure data integrity. This program was created as a midterm laboratory exam.

## **Features**

* **Ticket Management:**  
  * **Add Ticket:** Allows users to create new tickets by providing an issue description and urgency level (Low, Medium, High). New tickets are automatically assigned a "Pending" status.  
  * **Update Ticket Status:** Enables users to change the status of existing tickets to "In Progress" or "Resolved". It prevents updates to already resolved tickets.  
  * **Show All Tickets:** Displays a list of all tickets, including their urgency, description, and current status.  
* **Report Generation:** Provides a summary report showing the total number of tickets, as well as counts for "Pending/In Progress" and "Resolved" tickets.  
* **Input Validation:**  
  * Ensures that menu choices are valid integers.  
  * Validates urgency levels (only accepts "Low", "Medium", "High").  
  * Validates ticket numbers for updates.  
  * Validates new ticket statuses (only accepts "In Progress" or "Resolved").  
* **System Limits:** The system can store a maximum of 5 tickets.

## **How to Compile and Run**

To compile and run this Java application, follow these steps:

1. **Save the file:** Save the code as MyMidtermLabExam.java.  
2. **Open a terminal or command prompt.**  
3. **Navigate to the directory** where you saved the file.  
4. **Compile the Java code.**  
5. **Run the compiled program.**

## **Example Usage**

When you run the program, it will display a menu:

\=== IT Ticket Processing System \===  
1\. Add Ticket  
2\. Update Ticket Status  
3\. Show All Tickets  
4\. Generate Report  
5\. Exit  
Enter Choice:

**Example Scenarios:**

**1\. Adding a Ticket:**

Enter Choice: 1  
Enter issue description: Printer not working  
Enter urgency level (Low / Medium / High): High  
Ticket added successfully\!

**2\. Showing All Tickets:**

Enter Choice: 3

\--- Ticket List \---  
1\. \[High\] Printer not working \- Status: Pending

**3\. Updating a Ticket Status:**

Enter Choice: 2

\--- Ticket List \---  
1\. \[High\] Printer not working \- Status: Pending  
Enter ticket number to update (1 to 1): 1  
Enter new status (In Progress / Resolved): In Progress  
Ticket status updated successfully.

**4\. Generating a Report:**

Enter Choice: 4

\--- Ticket Report \---  
Total Tickets: 1  
Pending/In Progress: 1  
Resolved: 0

## **Technologies Used**

* Java  
* java.util.Scanner for input handling

## **Created by:**

**Author:** Charles Derrick A. Garcia

**Course:** Bachelor of Science in Computer Science

