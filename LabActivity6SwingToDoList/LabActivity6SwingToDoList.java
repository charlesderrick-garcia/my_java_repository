// Imports Java AWT and Swing element libraries 
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class LabActivity6SwingToDoList {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ToDoListViewer());
    }
}

// Creates main to-do list window
class ToDoListViewer extends JFrame {
    private DefaultTableModel tableModel;
    private JTable table;
    private JButton addTaskButton;
    private static ToDoForm toDoForm;

    // Main Window
    public ToDoListViewer() {
        setTitle("To-Do List Viewer");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Creates table model
        tableModel = new DefaultTableModel(new Object[]{"Task Name", "Description", "Status"}, 0);
        table = new JTable(tableModel);

        // Creates "Add Task" Button
        addTaskButton = new JButton("Add Task");
        addTaskButton.addActionListener(e -> {
            if (toDoForm == null || !toDoForm.isDisplayable()) {
                toDoForm = new ToDoForm(this);
                toDoForm.setVisible(true);
            }
        });

        // Centers "Add Task" Button
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topPanel.add(addTaskButton);

        // Creates Scroll Wheel
        JScrollPane scrollPane = new JScrollPane(table);
        add(topPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        setVisible(true);
    }

    // Method for adding tasks to the table
    public void addTask(String name, String desc, String status) {
        tableModel.addRow(new Object[]{name, desc, status});
    }
}

// Pop-up window when adding task 
class ToDoForm extends JFrame {
    private JTextField taskNameField;
    private JTextArea taskDescArea;
    private JComboBox<String> statusCombo;
    private JButton saveButton;
    private ToDoListViewer parent;

    public ToDoForm(ToDoListViewer parent) {
        this.parent = parent;
        setTitle("Add New Task");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Creates form panel
        JPanel formPanel = new JPanel(new GridLayout(6, 1, 5, 5));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Task Name 
        formPanel.add(new JLabel("Task Name:"));
        taskNameField = new JTextField();
        formPanel.add(taskNameField);

        // Task Description
        formPanel.add(new JLabel("Task Description:"));
        taskDescArea = new JTextArea(3, 20);
        taskDescArea.setLineWrap(true);
        taskDescArea.setWrapStyleWord(true);
        JScrollPane descScrollPane = new JScrollPane(taskDescArea);
        formPanel.add(descScrollPane);

        // Status
        formPanel.add(new JLabel("Status:"));
        String[] statuses = {"Not Started", "Ongoing", "Completed"};
        statusCombo = new JComboBox<>(statuses);
        formPanel.add(statusCombo);

        // Save Button
        saveButton = new JButton("Save Task");
        saveButton.addActionListener(new SaveTaskListener());

        // Centers the window
        add(formPanel, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(saveButton);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    // ActionListener class for the Save button
    class SaveTaskListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String name = taskNameField.getText().trim();
            String desc = taskDescArea.getText().trim();
            String status = (String) statusCombo.getSelectedItem();

            // Error message to display when there is no input
            if (name.isEmpty() || desc.isEmpty()) {
                JOptionPane.showMessageDialog(ToDoForm.this,
                        "Please fill in Task Name and Status.",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }

            parent.addTask(name, desc, status);
            dispose(); // Close the form
        }
    }
}