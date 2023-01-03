import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %-10.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInt = scanner.nextInt();
        System.out.println("You entered: " + userInt);

        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter 3 words: ");
        String userInput = scanner1.next();
        String userInput2 = scanner1.next();
        String userInput3 = scanner1.next();
        System.out.printf("You entered: %s, %n then %s, %n then %s%n", userInput, userInput2, userInput3);
        scanner1.nextLine();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String userSentence = scanner2.nextLine();
        System.out.printf("Your sentence was this: %s %n", userSentence);

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter room length: ");
        String userLength = scanner3.nextLine();
        System.out.println("Enter room width: ");
        String userWidth = scanner3.nextLine();
        int length = Integer.parseInt(userLength);
        int width = Integer.parseInt(userWidth);
        int area = length*width;
        int perimiter = (length*2) + (width*2);
        System.out.printf("The area of the room is: %s %n", area);
        System.out.printf("The perimiter of the room is: %s %n", perimiter);





    }

}
