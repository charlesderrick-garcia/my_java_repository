# **Lab Activity 6: Swing To-Do List Application**

This Java program creates a simple To-Do List application with a Graphical User Interface (GUI) built using Java Swing. It allows users to add new tasks, including a task name, description, and status. The tasks are displayed in a table, providing a clear overview of all pending and completed items. This program was created for a laboratory activity.

## **Features**

* **Graphical User Interface (GUI):** Provides an interactive window for managing tasks.  
* **Add New Tasks:** Users can add new tasks through a pop-up form.  
  * **Task Name:** A text field for the task's title.  
  * **Task Description:** A text area for a detailed description of the task.  
  * **Status Selection:** A dropdown menu (combo box) to set the task's status ("Not Started", "Ongoing", "Completed").  
* **Task List Display:** Tasks are presented in a JTable with columns for "Task Name", "Description", and "Status".  
* **Input Validation:** Ensures that the "Task Name" and "Task Description" fields are not empty when a new task is saved.  
* **Scrollable Table:** The task table is placed within a JScrollPane to handle a large number of tasks.  
* **Window Management:** Main and pop-up windows are centered on the screen and close properly.

## **How to Compile and Run**

To compile and run this Java Swing application, follow these steps:

1. **Save the file:** Save the code as LabActivity6SwingToDoList.java.  
2. **Open a terminal or command prompt.**  
3. **Navigate to the directory** where you saved the file.  
4. **Compile the Java code.**  
5. **Run the compiled program.**

## **Example Usage**

Upon running the program, the main "To-Do List Viewer" window will appear.

**Adding a Task:**

1. Click the "Add Task" button. A new "Add New Task" pop-up window will appear.  
2. Fill in the "Task Name" and "Task Description".  
3. Select a "Status" from the dropdown.  
4. Click "Save Task".

**Example Input (in "Add New Task" window):**

* **Task Name:** Finish Lab Report  
* **Task Description:** Complete the write-up and submit the Java code for Lab Activity 6\.  
* **Status:** Ongoing

After clicking "Save Task", the main window's table will update with the added task.

## **Technologies Used**

* Java Swing  
* javax.swing.\* for GUI components  
* java.awt.\* and java.awt.event.\* for layout and event handling

## **Created by:**

**Author:** Charles Derrick A. Garcia

**Course:** Bachelor of Science in Computer Science

