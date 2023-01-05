import java.util.Scanner;

public class ControlFlowExercise {

    public static void main(String[] args) {
        // 1. part 1
//        int i = 5;
//        while(i <= 15) {
//            System.out.printf("%s ", i);
//            i++;
//        }

        // 1. part 2
//        int count = 0;
//        do {
//            if(count%2 == 0) {
//                System.out.println(count);
//            }
//            count++;
//        } while(count <= 100);
//        int count2 = 100;
//        do{
//            if(count2%5 == 0){
//                System.out.println(count2);
//            }
//            count2 -= 5;
//        } while(count2 >= -10);
//
//        long count3 = 2;
//        do{
//            System.out.println(count3);
//            count3 *= count3;
//        } while(count3 < 1000000);

        // 1. part 3
//        for(int k = 100; k >= -10; k -= 5){
//            System.out.println(k);
//        }
//        for(long l = 2; l < 1000000; l *= l){
//            System.out.println(l);
//        }

        // 2.
//        int count4 = 1;
//        while(count4 <= 100){
//            if(count4%3 == 0 && count4%5 == 0){
//                System.out.println("FizzBuzz");
//            } else if(count4%3 == 0){
//                System.out.println("Fizz");
//            } else{
//                System.out.println(count4);
//            }
//            count4++;
//        }

        // 3.
//        Scanner steve = new Scanner(System.in);
//
//        int userInput = 0;
//        String playAgain = "y";
//
//        while(playAgain.equalsIgnoreCase("y")){
//            System.out.print("Choose a number to go to?");
//            userInput = steve.nextInt();
//            System.out.println("Here's your table! \n");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for(int i = 1; i <= userInput; i++) {
//                System.out.printf(" %s     | %s       | %s    \n", i, i*i, i*i*i);
//            }
//            System.out.println("Wish to continue?");
//            playAgain = steve.next();
//        }

        // 4.
//        Scanner steve = new Scanner(System.in);
//
//        int userInput = 0;
//        String playAgain = "y";
//
//        while(playAgain.equalsIgnoreCase("y")){
//            System.out.print("Choose a number between 0 - 100");
//            userInput = steve.nextInt();
//            if(userInput >= 0 && userInput <= 59){
//                System.out.println("F");
//            } else if(userInput >= 60 && userInput <= 66){
//                System.out.println("D");
//            } else if(userInput >= 67 && userInput <= 79){
//                System.out.println("{C");
//            } else if(userInput >= 80 && userInput <= 87){
//                System.out.println("B");
//            } else if(userInput >= 88 && userInput <= 100){
//                System.out.println("A");
//            } else{
//                System.out.print("No grade available");
//            }
//            System.out.println("Go again?");
//            playAgain = steve.next();
//        }
    }// main end



}
