import java.util.InputMismatchException;
import java.util.Scanner;
public class MarsExpedition {
    public MarsExpedition() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bootup message");
        System.out.println("Please, wait");
        System.out.println("Please, wait");
        System.out.println("A few more moments");
        System.out.println("Ready");


        String playerName = input.nextLine();
        System.out.println("Hi, " + playerName + " — Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String answer = input.nextLine();

        if (answer.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else if (answer.equalsIgnoreCase("N")) {
            System.out.println("Too bad you are team leader. You have to go.");
        } else {
            System.out.println("Please, answer Y or N");
        }

        System.out.println("How many people they want on their team? Answer with an integer");

        int people;
        try {
            people = input.nextInt();
        } catch (InputMismatchException e) {
            String wrong_input = input.next();
            System.out.println("Please answer with an integer");
        }
        people = input.nextInt();
        if (people > 2) {
            System.out.println("That’s way to many people. We can only send 2 more members");
            people = 2;
        } else if (people < 2) {
            System.out.println("That’s not enough people. We can only send 2 more members");
            people = 2;
        } else if (people == 2) {
            System.out.println("Great! Let's go");
        }

        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        String snack = input.nextLine();
        System.out.println("Nice choice, you will be bringing a " + snack + " with you.");
        System.out.println("Please, choose the vehicle: \n A: Plane\n B: Car\n C: Horse");
        String  vehicle = input.nextLine();

        if (vehicle.equalsIgnoreCase("A")) {
            vehicle = "Plane";
        } else if (vehicle.equalsIgnoreCase("B")){
            vehicle = "Car";
        } else if (vehicle.equalsIgnoreCase("C")){
            vehicle = "Horse";
        } else {
            System.out.println("Sorry, you can choose only between these 3 vehicles. You'll travel by feet than");
            vehicle = "feet";
        }

        System.out.println(playerName + "your team of " + people + "is going to an expedition by "
                + vehicle + ". Don't forget your " + snack + "!\n" + "Your journey will start in...\n 5...\n 4...\n" +
                "3...\n 2...\n 1...\n Start!");

    }
}
