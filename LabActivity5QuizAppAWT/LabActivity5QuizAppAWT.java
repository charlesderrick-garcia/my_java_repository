import java.awt.*; 
import java.awt.event.*; 

public class LabActivity5QuizAppAWT { 
    Frame frame; 
    Label questionLabel;
    Label errorLabel;
    Checkbox option1, option2, option3, option4; 
    CheckboxGroup optionGroup; 
    Button nextButton;  

    // Questions for quiz
    String[] questions = { 
        "Which of the following is an input device?", 
        "Which is known as the mother of all programming languages?", 
        "What is the main function of an operating system?" 
    }; 

    // Multiple choices for questions
    String[][] options = {
        {"A. Mouse", "B. Headphones", "C. Speaker", "D. Monitor"},
        {"A. C++", "B. COBOL", "C. Assembly", "D. FORTRAN"},
        {"A. Data storage", "B. Managing hardware and software", "C. Web browsing", "D. Running games"}
    };

    // Correct answers for each question (1. A, 2. D, 3.B)
    int[] answers = {0, 3, 1};  
    int currentQuestion = 0; 
    int score = 0; 

    // Creates Frame
    public LabActivity5QuizAppAWT() { 
        frame = new Frame("Quiz App"); 
        frame.setSize(500, 300); 
        frame.setLayout(new BorderLayout()); 
        frame.setResizable(false); 

        // Centers the window
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation((screen.width - 500) / 2, (screen.height - 300) / 2);

        // Sets label for questions
        questionLabel = new Label("", Label.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        frame.add(questionLabel, BorderLayout.NORTH);

        // Creates a panel for multiple choices
        Panel optionsPanel = new Panel(new GridLayout(2, 2, 10, 10));
        optionGroup = new CheckboxGroup();

        option1 = new Checkbox("", optionGroup, false);
        option2 = new Checkbox("", optionGroup, false);
        option3 = new Checkbox("", optionGroup, false);
        option4 = new Checkbox("", optionGroup, false);

        optionsPanel.add(option1);
        optionsPanel.add(option2);
        optionsPanel.add(option3);
        optionsPanel.add(option4);

        frame.add(optionsPanel, BorderLayout.CENTER);

        // Creates panel for error messages
        Panel bottomPanel = new Panel(new BorderLayout());
        
        errorLabel = new Label("", Label.CENTER);
        errorLabel.setForeground(Color.RED);
        errorLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        bottomPanel.add(errorLabel, BorderLayout.NORTH);

        nextButton = new Button("Next");
        nextButton.setFont(new Font("Arial", Font.BOLD, 16));
        nextButton.setBackground(Color.LIGHT_GRAY);
        bottomPanel.add(nextButton, BorderLayout.SOUTH);

        frame.add(bottomPanel, BorderLayout.SOUTH);


        loadQuestion();

        // Action listener for when user clicks "next" without selecting an answer
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Checkbox selected = optionGroup.getSelectedCheckbox();
                if (selected == null) {
                    errorLabel.setText("Please select an answer.");
                    return;
                }

                errorLabel.setText("");
                int selectedIndex = -1;
                String selectedLabel = selected.getLabel();
                for (int i = 0; i < 4; i++) {
                    if (options[currentQuestion][i].equals(selectedLabel)) {
                        selectedIndex = i;
                        break;
                    }
                }

                if (selectedIndex == answers[currentQuestion]) {
                    score++;
                }

                currentQuestion++;

                if (currentQuestion < questions.length) {
                    loadQuestion();
                } else {
                    showFinalScore();
                }
            }
        });
        
        // Window listener for program exit
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });

        frame.setVisible(true);
    }

    // Displays next questions
    void loadQuestion() {
        questionLabel.setText(questions[currentQuestion]);
        option1.setLabel(options[currentQuestion][0]);
        option2.setLabel(options[currentQuestion][1]);
        option3.setLabel(options[currentQuestion][2]);
        option4.setLabel(options[currentQuestion][3]);
        optionGroup.setSelectedCheckbox(null);
        errorLabel.setText("");
    }

    // Displays final score
    void showFinalScore() {
        questionLabel.setText("Quiz Completed! Your Score: " + score + " out of " + questions.length);
        option1.setEnabled(false);
        option2.setEnabled(false);
        option3.setEnabled(false);
        option4.setEnabled(false);
        nextButton.setEnabled(false);
    }

    public static void main(String[] args) {
        new LabActivity5QuizAppAWT();
    }
}
