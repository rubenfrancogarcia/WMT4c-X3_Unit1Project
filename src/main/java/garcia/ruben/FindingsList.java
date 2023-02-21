package garcia.ruben;

import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindingsList {
    FindingsList() throws InterruptedException {

        Scanner input = new Scanner(System.in);
        Thread.sleep(500);
        System.out.println("Welcome Back!");
        String[] s = { "rock", "weird rock", "smooth rock", "not rock" };
        System.out.println("Downloading complete");
        for (String item : s) {
            System.out.println(item);
        }
        System.out.println("We realize there is an item that is not a rock in the list. We must delete it");
        List<String> output = Arrays.stream(s).collect(Collectors.toList());
        output.remove("not rock");
        for (String item : output) {
            System.out.println(item);
        }
        System.out.println("Change is made. Perfect");
        Thread.sleep(1000);
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("bird fossil", "The fossil has wings implying it was capable of flight");
        hashmap.put("fish fossil", "The fossil is vaguely fish shaped implies there was once water");
        hashmap.put("tooth fossil", "The tooth from an unknown fossil");
        System.out.println("Fossil data downloaded");
        System.out.println("Which of the fossils would you like to learn more about? Fish, bird, or tooth?");
        String fossil = input.nextLine();
        fossil.toLowerCase();
        if (fossil.equals("fish")) {
            System.out.println(hashmap.get("fish fossil"));
        } else if (fossil.equals("bird")) {
            System.out.println(hashmap.get("fish fossil"));
        } else if (fossil.equals("tooth")) {
            System.out.println(hashmap.get("tooth fossil"));
        } else {
            System.out.println("wrong answer foo");
        }

        Thread.sleep(700);
        HashSet<String> hashset = new HashSet<>();
        hashset.add("jug of water");
        hashset.add("can of tuna");
        hashset.add("medkit");
        System.out.println("Supplies before expedition");
        System.out.println(hashset);
        hashset.remove("medkit");
        System.out.println("Supplies after expedition");
        input.close();
    }

}
