package util;
import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.nextLine();
    }

    public static boolean yesNo() {
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y");
    }

    public static int getInt(int min, int max) {
        System.out.printf("Enter a number between %d and %d: ", min, max);
        int userNum = scanner.nextInt();
        if (userNum < min || userNum > max) {
            getInt(min, max);
        }
        return userNum;
    }
    public static int getInt() {
        System.out.println("Enter integer: ");
        String userNum = getString();
        try {
            return Integer.valueOf(userNum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input, please try again!")
            return getInt();
        }
    }

    public static double getDouble(double min, double max) {
        System.out.printf("Enter a number between %s and %s", min, max);
        double userNum = scanner.nextDouble();
        if (Double.compare(userNum, min) < 0 || Double.compare(userNum, max) > 0) {
            getDouble(min, max);
        }
        return userNum;
    }

    public static double getDouble() {
        System.out.println("Enter integer:");
        String userNum = getString();
        double doubleNum = 0;
        try {
            return Double.valueOf(userNum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input");
            return getDouble();
        }
    }

} // Input method end