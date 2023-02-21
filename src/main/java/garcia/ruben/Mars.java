package garcia.ruben;

public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "Rubles";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;

        meals = meals - (shipPopulation * 0.75);
        meals = meals - (shipPopulation * 0.75);
        System.out.println(meals);
        meals = meals + (meals * .5);
        shipPopulation = shipPopulation + 5;

        String landingLocation = "The Ocean";
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
        landing = landingCheck(6);
        new GuessingGame();
        new MarsExpedition();
        new FindingsList();
    }

    public static boolean landingCheck(int minutesLeft) {
        for (int minute = 0; minute == minutesLeft; minute++) {
            if (minute % 2 == 0 && minute % 3 == 0) {
                System.out.println("Center");
            } else if (minute % 2 == 0) {
                System.out.println("Right");
            } else if (minute % 2 != 0) {
                System.out.println("Left");
            } else {
                System.out.println("Calculating");
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Landed");
        return false;
    }
}

/*
 * 
 * Create a string variable named colonyName, and set it equal to your desired
 * name
 * 
 * Create an int variable named shipPopulation, and set it equal to 300
 * 
 * Create a double variable named meals, and set it equal to 4000.00
 * 
 * Create a boolean variable named landing, and set it equal to true
 */