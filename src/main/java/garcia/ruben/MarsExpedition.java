package garcia.ruben;

import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() {

        Scanner input = new Scanner(System.in);
        System.out.println("Expedition prep program starting...");
        System.out.println("Booting up...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("Ready");
        System.out.println("Hi, what's your name?");
        String userName = input.nextLine();
        System.out.println("Hi, " + userName
                + "  Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String choice = input.nextLine();
        if (choice.toLowerCase().equals("y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else if (choice.toLowerCase().equals("n")) {
            System.out.println("Too bad you are team leader. You have to go.");
        }
        System.out.println("How many people do you want on your team?");
        int numberOfTeam = Integer.parseInt(input.nextLine());
        if (numberOfTeam > 2) {
            System.out.println("Thats way to many people. We can only send 2 more members.");
        } else if (numberOfTeam < 2) {
            System.out.println("That's not enough of team members");
        } else if (numberOfTeam == 2) {
            System.out.println("Great, that's the exact number of teamates you may have");
        }
        numberOfTeam = 2;
        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        String snack = input.nextLine();

        String vehicleChoice = null;
        System.out.println("Nice. You will be bringing on a " + snack + " as a snack");
        System.out.println(
                "You have now 3 choices for a vehicle: a.2005 ford focus b.1990 ford bronco c.2020 toyota camry");
        vehicleChoice = input.nextLine();
        if (vehicleChoice.toLowerCase().equals("a")) {
            vehicleChoice = "2005 Ford Focus";
        } else if (vehicleChoice.toLowerCase().equals("b")) {
            vehicleChoice = "1990 ford focus";
        } else if (vehicleChoice.toLowerCase().equals("c")) {
            vehicleChoice = "2020 toyota camry";
        } else {
            vehicleChoice = "none";
        }
        System.out.println("Your expedition team is now ready" +
                "\nLed by " + userName + " with " + numberOfTeam + " teammates." +
                "\nTo explore the surface of Mars using " + vehicleChoice + "." +
                "\nExploration team heads out in" +
                "\n5...." +
                "\n4...." +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nGO GO GO!");
                input.close();
    }

    /*
     * After the program “boots”, we need to get the user’s name and ask them some
     * questions.
     * 
     * Ask for the user’s name, welcome them, and ask if they’re ready to begin.
     * 
     * “Hi, {name} — Welcome to the Expedition prep program. Are you ready to head
     * out into the new world? Type Y or N”
     * 
     * Save their input and check if they said yes or no. If they said “yes”, print:
     * “I knew you would say that. You are team leader for a reason.”
     * 
     * Otherwise, print “Too bad you are team leader. You have to go.”
     * 
     * Last, ask how many people they want on their team. Use an if statement to
     * check if their answer is greater than 2. If it is, print “That’s way to many
     * people. We can only send 2 more members.” And set the team size to be 2
     * anyway.
     * 
     * Check for other cases as well. The team size always needs to be exactly 2
     * (there are only 3 seats in the pod).
     * 
     * Now that we’ve got the team size all sorted, it’s on to the important things
     * - snacks! Or rather, snack. You only get one.
     * 
     * The program should then log: “You are allowed to bring one snack with you.
     * What do you want to bring?”
     * 
     * After they give an answer, it should confirm with a message like: “Nice
     * choice, you will be bringing a {snack} with you.” (The {snack} part should be
     * whatever the user typed in.)
     * Last, you’ll have the user choose a vehicle from a list.
     * 
     * Present the user with a list of vehicles that are in a lettered or numbered
     * list.
     * 
     * Store their choice in a variable to use in the next step.
     */

}
