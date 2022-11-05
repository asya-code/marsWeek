import java.util.*;

public class FindingsList {
    public FindingsList() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Welcome back!");
        ArrayList<String> rocks = new ArrayList<>();
        rocks.add("rock 1");
        rocks.add("weird rock");
        rocks.add("smooth rock");
        rocks.add("not rock");
        System.out.println("Rocks' info is downloaded\n" + rocks);

        System.out.println("Alert! There is not a rock in the list. It will be removed.");
        rocks.remove("not rock");
        System.out.println("Now the problem is fixed\n" + rocks);

        Thread.sleep(1000);

        HashMap<String, String> fossils = new HashMap<>();
        fossils.put("Bird Fossil", "The fossil has wings implying it was capable of flight");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");
        System.out.println("Fossil data downloaded");

        System.out.println("Which of the fossils would you like to learn more about? (Bird, fish, or tooth)");
        Scanner input = new Scanner(System.in);
        String fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird")){
            System.out.println("Here is an ingo about " + fossilChoice + ": " + fossils.get("Bird Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("Fish")){
            System.out.println("Here is an ingo about " + fossilChoice + ": " + fossils.get("Fish Fossil"));
        } else if (fossilChoice.equalsIgnoreCase("Tooth")){
            System.out.println("Here is an ingo about " + fossilChoice + ": " + fossils.get("Tooth Fossil"));
        } else {
            System.out.println("Sorry, that wasn't valid choice");
        }

        Thread.sleep(700);
        HashSet<String> supplies = new HashSet();
        supplies.add("important thing");
        supplies.add("very important thing");
        supplies.add("super important thing");
        System.out.println("Here are the expedition's supplies:");

        Iterator itr = supplies.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        supplies.remove("important thing");
        System.out.println("Here are the supplies at the end of the expedition:");

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
