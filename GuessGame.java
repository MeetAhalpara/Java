import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GuessGame extends JFrame implements KeyListener {
    private int currentNumber;
    private int nextNumber;
    private Random random;

    public GuessGame() {
        setTitle("Guess Game");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        addKeyListener(this);
        random = new Random();
        currentNumber = random.nextInt(10) + 1;
        nextNumber = random.nextInt(10) + 1;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawString("Current Number: " + currentNumber, 50, 100);
        g.drawString("Press UP if you think the next number is higher", 50, 130);
        g.drawString("Press DOWN if you think the next number is lower", 50, 160);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            checkGuess(true);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            checkGuess(false);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Not used
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not used
    }

    private void checkGuess(boolean isHigher) {
        boolean isCorrect = (isHigher && nextNumber > currentNumber) || (!isHigher && nextNumber < currentNumber);
        currentNumber = nextNumber;
        nextNumber = random.nextInt(10) + 1;

        String message = isCorrect ? "Correct!" : "Wrong!";
        System.out.println(message);

        repaint();
    }

    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.setVisible(true);
    }
}

