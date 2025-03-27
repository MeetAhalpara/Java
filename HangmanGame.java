import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class HangmanGame extends JPanel implements ActionListener, KeyListener {

    private static final String[] WORDS = {"JAVA", "PYTHON", "HTML", "CSS", "JAVASCRIPT", "RUBY", "PHP"};
    private static final int MAX_TRIES = 6;
    private String wordToGuess;
    private StringBuilder guessedWord;
    private int triesLeft;
    private boolean gameOver;
    private boolean gameWon;
    private JButton[] letterButtons;
    private JLabel wordLabel;
    private JLabel statusLabel;

    public HangmanGame() {
        setPreferredSize(new Dimension(400, 300));
        setBackground(Color.white);
        setLayout(new BorderLayout());

        initializeGame();

        add(createGamePanel(), BorderLayout.CENTER);
        add(createButtonPanel(), BorderLayout.SOUTH);

        setFocusable(true);
        addKeyListener(this);
    }

    private void initializeGame() {
        Random random = new Random();
        wordToGuess = WORDS[random.nextInt(WORDS.length)];
        guessedWord = new StringBuilder("-".repeat(wordToGuess.length()));
        triesLeft = MAX_TRIES;
        gameOver = false;
        gameWon = false;
    }

    private JPanel createGamePanel() {
        JPanel gamePanel = new JPanel();
        gamePanel.setLayout(new BorderLayout());

        wordLabel = new JLabel(guessedWord.toString(), JLabel.CENTER);
        wordLabel.setFont(new Font("Arial", Font.BOLD, 24));
        gamePanel.add(wordLabel, BorderLayout.CENTER);

        statusLabel = new JLabel("Tries left: " + triesLeft, JLabel.CENTER);
        statusLabel.setFont(new Font("Arial", Font.PLAIN, 18));
        gamePanel.add(statusLabel, BorderLayout.SOUTH);

        return gamePanel;
    }

    private JPanel createButtonPanel() {
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 13));

        letterButtons = new JButton[26];
        for (char c = 'A'; c <= 'Z'; c++) {
            int index = c - 'A';
            letterButtons[index] = new JButton(String.valueOf(c));
            letterButtons[index].setFont(new Font("Arial", Font.PLAIN, 18));
            letterButtons[index].addActionListener(this);
            buttonPanel.add(letterButtons[index]);
        }

        return buttonPanel;
    }

    private void checkGuess(char guess) {
        boolean guessedCorrectly = false;
        for (int i = 0; i < wordToGuess.length(); i++) {
            if (wordToGuess.charAt(i) == guess) {
                guessedWord.setCharAt(i, guess);
                guessedCorrectly = true;
            }
        }

        if (!guessedCorrectly) {
            triesLeft--;
        }

        if (guessedWord.toString().equals(wordToGuess)) {
            gameWon = true;
            gameOver = true;
        } else if (triesLeft <= 0) {
            gameOver = true;
        }

        updateUI();
    }

    public void updateUI() {
        wordLabel.setText(guessedWord.toString());
        statusLabel.setText("Tries left: " + triesLeft);

        if (gameOver) {
            disableAllButtons();
            String message = gameWon ? "You won!" : "Game over. The word was: " + wordToGuess;
            JOptionPane.showMessageDialog(this, message);
        }
    }

    private void disableAllButtons() {
        for (JButton button : letterButtons) {
            button.setEnabled(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!gameOver) {
            JButton source = (JButton) e.getSource();
            char guess = source.getText().charAt(0);
            checkGuess(guess);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {}

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Hangman Game");
            HangmanGame game = new HangmanGame();
            frame.add(game);
            frame.pack();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}