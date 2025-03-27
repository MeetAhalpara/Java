import java.util.Scanner;

class Calculator {
    public int performAddition(int a, int b) {
           return a + b;
    }

    public double performSubtraction(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Subtraction by zero is not allowed.");
            return Double.NaN; // return 'Not a Number' to indicate error
        }
        return (double) a / b;
    }

    public int performMultiplication(int a, int b) {
        return a * b;
    }

    public double performDivision(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; // return 'Not a Number' to indicate error
        }
        return (double) a / b;
    }
}

public class basic_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.print("Enter the first number: ");
            int a = sc.nextInt();
            System.out.print("Enter the second number: ");
            int b = sc.nextInt();

            System.out.println("Select an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");

            int choice = sc.nextInt();
            double result = 0;

            switch (choice) {
                case 1:
                    result = calculator.performAddition(a, b);
                    break;
                case 2:
                    result = calculator.performSubtraction(a, b);
                    break;
                case 3:
                    result = calculator.performMultiplication(a, b);
                    break;
                case 4:
                    result = calculator.performDivision(a, b);
                    break;
                default:
                    System.out.println("Invalid choice.");
                    continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Would you like to perform another calculation (yes/no)? ");
            String response = sc.next();

            if (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("y")) {
                continueProgram = false;
                System.out.println("Program will shut down.");
            }
        }
    }
}