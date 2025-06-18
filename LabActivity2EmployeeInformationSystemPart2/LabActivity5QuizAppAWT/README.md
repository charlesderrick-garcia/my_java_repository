# **Lab Activity 5: Quiz Application AWT**

This Java program implements a simple multiple-choice quiz application with a Graphical User Interface (GUI) using the Abstract Window Toolkit (AWT). The quiz presents a series of questions, allows the user to select an answer from provided options, and tracks the score. At the end of the quiz, it displays the final score. This program was created for a laboratory activity.

## **Features**

* **Graphical User Interface (GUI):** Provides an interactive window for the quiz.  
* **Multiple-Choice Questions:** Presents a predefined set of questions with four options each.  
* **Answer Selection:** Users select an answer using radio buttons (checkboxes within a `CheckboxGroup`).  
* **Score Tracking:** Keeps track of the user's correct answers.  
* **Navigation:** A "Next" button allows progression through the questions.  
* **Input Validation:** Prompts the user to select an answer if they try to proceed without one.  
* **Quiz Completion:** Displays the final score and disables input fields once all questions are answered.  
* **Window Management:** Centers the quiz window on the screen and ensures proper window closing.

## **How to Compile and Run**

To compile and run this Java AWT application, follow these steps:

1. **Save the file:** Save the code as `LabActivity5QuizAppAWT.java`.  
2. **Open a terminal or command prompt.**  
3. **Navigate to the directory** where you saved the file.  
4. **Compile the Java code.**  
5. **Run the compiled program.**

## **Example Usage**

Upon running the program, a quiz window will appear. You will see a question at the top and four options below it.

**Interaction Flow:**

1. A question will be displayed.  
2. Select one of the options by clicking its checkbox.  
3. Click the "Next" button to proceed to the next question.  
4. If you click "Next" without selecting an answer, an error message "Please select an answer." will appear.  
5. After the last question, the "Question Label" will display "Quiz Completed\! Your Score: X out of Y", and the options and "Next" button will be disabled.

## **Technologies Used**

* Java  
* `java.awt.*` (Abstract Window Toolkit) for GUI components  
* `java.awt.event.*` for event handling

## **Created by:**

**Author:** Charles Derrick A. Garcia

**Course:** Bachelor of Science in Computer Science

