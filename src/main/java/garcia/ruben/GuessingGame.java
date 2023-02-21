package garcia.ruben;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public GuessingGame() {
        System.out.println("Hi, what's your name?");
        System.out.println("(input your name) ");

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        System.out.println("Hi " + name + "!");
        // create an instance of the Random object
        Random rand = new Random();

        // call method nextInt and pass in upper range bound
        int number = rand.nextInt(100);

        System.out.println("Let's play a guessing Game. Select a number between 1 and 100");
        System.out.println("Input your guessing number");
        int userAns = 0;
        String userAnsString = input.nextLine();
        catchString(userAnsString, userAns, input);

        int tries = 0;
        while (userAns != number) {
            catchString(userAnsString, userAns, input);
            if (userAns > number) {
                System.out.println("Wrong answer. Your answer is greater than the number. Try again");
            } else {
                System.out.println("Wrong answer. Your number is lesser than the number. Try again"); 
            }
            System.out.println("input another number");
            userAns = input.nextInt();
            tries++;
            continue;
        }

        System.out
                .println("Correct! " + userAns + " is the number. It took " + tries + " tries. Good job " + name + "!");

    }

    static void catchString(String input, int ans, Scanner scanner) {
        try {
            ans = Integer.parseInt(input);
            if(ans >= 101 || ans <1){
                System.out.println("You have to pick a value between 1 and 100. Try again");
                String inputString = scanner.nextLine();
                catchString(inputString, ans, scanner);
            }
        } catch (Exception e) {
            System.out.println("Not a valid input. Try again");
            String inputString = scanner.nextLine();
            catchString(inputString, ans, scanner);
        }
    }

}
