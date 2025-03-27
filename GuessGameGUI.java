import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessGameGUI extends JFrame {
    private JTextField userInputField;
    private JLabel feedbackLabel;
    private int randomNumber;
    private int numberOfGuesses;
    private int till; // Class-level field for till

    public GuessGameGUI(int till) {
        this.till = till; // Initialize the class-level till
        // Set up JFrame properties
        setTitle("Guessing Game");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Generate random number
        Random rand = new Random();
        randomNumber = rand.nextInt(till) + 1;
        numberOfGuesses = 0;

        // Create components
        JLabel promptLabel = new JLabel("Enter your guess (1 - " + till + "):");
        userInputField = new JTextField(10);
        feedbackLabel = new JLabel();

        // Add components to the frame
        JPanel inputPanel = new JPanel();
        inputPanel.add(promptLabel);
        inputPanel.add(userInputField);

        add(inputPanel, BorderLayout.NORTH);
        add(feedbackLabel, BorderLayout.CENTER);

        // Add key listener to userInputField to listen for Enter key press
        userInputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleGuess();
            }
        });
    }

    private void handleGuess() {
        try {
            int guess = Integer.parseInt(userInputField.getText().trim());

            if (guess < 1 || guess > this.till) {
                feedbackLabel.setText("Invalid guess. Enter a number between 1 and " + this.till);
            } else {
                numberOfGuesses++;
                if (guess < randomNumber) {
                    feedbackLabel.setText("Too low. Try again.");
                } else if (guess > randomNumber) {
                    feedbackLabel.setText("Too high. Try again.");
                } else {
                    feedbackLabel.setText("Correct! You win! It took you " + numberOfGuesses + " guesses.");
                    userInputField.setEnabled(false); // Disable field after winning
                }
            }
            userInputField.setText(""); // Clear text field after each guess
        } catch (NumberFormatException ex) {
            feedbackLabel.setText("Invalid input. Enter a number.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                int till = 100; // Example upper limit
                GuessGameGUI game = new GuessGameGUI(till);
                game.setVisible(true);
            }
        });
    }
}