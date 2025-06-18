// Imports Java AWT
import java.awt.*;
import java.awt.event.*;

public class LabActivity4EmpInfoSystemGUI extends Frame implements ActionListener {

   // Declare Objects for Input Fields
   private TextField firstName, lastName, employeeAge, hoursWorked, hourlyRate;  
   private TextArea employeeOutput;  
   private Button submitButton;   

   // Constructor to setup the GUI components and event handlers
   public LabActivity4EmpInfoSystemGUI() {
      setLayout(new BorderLayout());

      Panel inputPanel = new Panel(new GridLayout(7, 2));

      //Input Box for First Name of Employee
      inputPanel.add(new Label("First Name"));  
      firstName = new TextField(10); 
      inputPanel.add(firstName);    

      //Input Box for Last Name of Employee
      inputPanel.add(new Label("Last Name"));  
      lastName = new TextField(10); 
      inputPanel.add(lastName);    
         
      //Input Box for Age of Employee
      inputPanel.add(new Label("Age"));  
      employeeAge = new TextField(10); 
      inputPanel.add(employeeAge);                  

      // Input Box for Hours Worked of Employee
      inputPanel.add(new Label("Hours Worked"));  
      hoursWorked = new TextField(10); 
      inputPanel.add(hoursWorked);    
             
      // Input Box for Hourly Rate of Employee
      inputPanel.add(new Label("Hourly Rate"));  
      hourlyRate = new TextField(10); 
      inputPanel.add(hourlyRate);    

      // Add inputPanel to the top of the frame
      add(inputPanel, BorderLayout.NORTH);

      // Panel for Submit button 
      Panel buttonPanel = new Panel(new FlowLayout(FlowLayout.CENTER));
      submitButton = new Button("Submit");
      submitButton.setPreferredSize(new Dimension(50, 20)); 
      submitButton.addActionListener(this);
      buttonPanel.add(submitButton);
      add(buttonPanel, BorderLayout.CENTER); 

      // Shows Output 
      Panel outputPanel = new Panel(new BorderLayout());
      outputPanel.add(new Label("Output:"), BorderLayout.NORTH);
      employeeOutput = new TextArea(3, 40);
      employeeOutput.setEditable(false);
      outputPanel.add(employeeOutput, BorderLayout.CENTER);
      add(outputPanel, BorderLayout.SOUTH);                

      setTitle("Laboratory Activity 4");  
      setSize(400, 300);  
      setVisible(true);  

      // Close window properly
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent we) {
            dispose();
         }
      });
   }

   // The entry main() method to run the application
   public static void main(String[] args) {
      // Creates an instance of the class
      new LabActivity4EmpInfoSystemGUI();
   }
   
   @Override
   public void actionPerformed(ActionEvent e) {
      
      // Obtains Input Values from Text Fields
      String fName = firstName.getText().trim();
      String lName = lastName.getText().trim();
      String ageText = employeeAge.getText().trim();
      String hrsWrkdText = hoursWorked.getText().trim();
      String hrlyRateText = hourlyRate.getText().trim();

   // All fields must be filled, otherwise show error
   if (fName.isEmpty() || lName.isEmpty() || ageText.isEmpty() || hrsWrkdText.isEmpty() || hrlyRateText.isEmpty()) {
      employeeOutput.setText("Error: All fields must be filled out.");
      return;
      }
   
   // Age must be a valid integer, otherwise show error
   int age;
   double hrsWrkd, hrlyRate;

   try {
      age = Integer.parseInt(ageText);
   } catch (NumberFormatException ex) {
      employeeOutput.setText("Error: Age must be a valid integer.");
      return;
   }

   // Validate: Hours worked and hourly rate must be valid numbers
   try {
      hrsWrkd = Double.parseDouble(hrsWrkdText);
      hrlyRate = Double.parseDouble(hrlyRateText);
   } catch (NumberFormatException ex) {
      employeeOutput.setText("Error: Hours worked and hourly rate must be valid numbers.");
      return;
   }
   // All fields are filled and valid. Print Result
   double dailySalary = hrsWrkd * hrlyRate;

   String output = "Full Name: " + fName + " " + lName +
   "\nAge: " + age + " years old" +
   String.format("\nDaily Salary: PHP %.2f", dailySalary);
      
   employeeOutput.setText(output);
   }
   }
