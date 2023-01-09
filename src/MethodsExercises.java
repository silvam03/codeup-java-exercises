import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {
        // 1.
        int num1 = 10;
        int num2 = 2;
        System.out.println(add(num1, num2));
        System.out.println(subtract(num1, num1));
        System.out.println(multiply(num1, num2));
        System.out.println(division(num1, num2));
        System.out.println(modulus(num1, num2));

        // 2.
        System.out.println(getInteger(1, 10));

        // 3.
        System.out.println(factorial());

        // dice:
        System.out.println(dice());

    }// main

    // 1.
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double division(double num1, double num2) {
        return num1/num2;
    }

    public static double modulus(double num1, double num2) {
        return num1%num2;
    }

    // 2.
    public static int getInteger(int min, int max) {
        System.out.println("Enter a number between " + min + " and " + max + ":");
        Scanner scanner = new Scanner(System.in);
        int userInput;
        userInput = scanner.nextInt();
        if(userInput >= min && userInput <= max) {
            return userInput;
        }
        return getInteger(min, max);
    }

    private static long factorial() {
        int NumToFactor = getInteger(1, 10);
        long currentSum = 1;
        for(int counter = 1; counter <= NumToFactor; counter++) {
            currentSum *= counter;
        }
        boolean userChoice = cont();
        if(userChoice) {
            factorial();
        }
        return currentSum;
    }
    public static boolean cont() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to try again?");
        String answer = scanner.nextLine();
        if(answer.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public static int dice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many sides does your dice have?");
        int sides = scanner.nextInt();
        int dice1 = (int) ((Math.random() * sides) + 1);
        int dice2 = (int) ((Math.random() * sides) + 1);
        return dice1 + dice2;
    }



}// methods end
