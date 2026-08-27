package JavaAssignment;



import java.util.Scanner;

/**
 * The NumberAnalyzer class serves as a console-based application that offers
 * various numerical analysis tools such as descending counter, even/odd report,
 * number sign checking, and calculating the sum of two integers.
 *
 * @author Sama
 */
public class NumberAnalyzer {

    /**
     * Prints numbers starting from 10 down to 1 in descending order.
     */
    public static void printNumbersDescending() {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    /**
     * Evaluates numbers from 1 to 10 and prints whether each integer is Even or Odd.
     */
    public static void printEvenOrOdd() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " -> Even");
            } else {
                System.out.println(i + " -> Odd");
            }
        }
    }

    /**
     * Determines whether a given integer is Positive, Negative, or Zero.
     *
     * @param number The integer value to be evaluated.
     * @return A String indicating if the number is "Positive", "Negative", or "Zero".
     */
    public static String checkNumberType(int number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    /**
     * Computes the arithmetic addition of two provided integer numbers.
     *
     * @param number1 The first integer parameter.
     * @param number2 The second integer parameter.
     * @return The total sum of number1 and number2.
     */
    public static int calculateSum(int number1, int number2) {
        return number1 + number2;
    }

    /**
     * The entry point of the application displaying a menu interface using a do-while loop.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===============================");
            System.out.println("     Number Analyzer Menu      ");
            System.out.println("===============================");
            System.out.println("1 - Print Numbers 10 to 1");
            System.out.println("2 - Print Even/Odd Report");
            System.out.println("3 - Check Number Type");
            System.out.println("4 - Calculate Sum Between Two Numbers");
            System.out.println("5 - Exit");
            System.out.print("Enter your choice: ");

            // Validation for non-integer inputs
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                choice = -1;
                scanner.next(); // Clear invalid token
            }

            switch (choice) {
                case 1:
                    printNumbersDescending();
                    break;
                case 2:
                    printEvenOrOdd();
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Invalid input. Please enter a valid integer: ");
                        scanner.next();
                    }
                    int numToCheck = scanner.nextInt();
                    String result = checkNumberType(numToCheck);
                    System.out.println("Output: " + result);
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Invalid input. Please enter a valid integer: ");
                        scanner.next();
                    }
                    int firstNum = scanner.nextInt();

                    System.out.print("Enter second number: ");
                    while (!scanner.hasNextInt()) {
                        System.out.print("Invalid input. Please enter a valid integer: ");
                        scanner.next();
                    }
                    int secondNum = scanner.nextInt();

                    int sum = calculateSum(firstNum, secondNum);
                    System.out.println("Sum = " + sum);
                    break;
                case 5:
                    System.out.println("Thank you for using Number Analyzer.");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
            System.out.println();
        } while (choice != 5);

        scanner.close();
    }
}
