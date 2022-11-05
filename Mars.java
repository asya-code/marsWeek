public class Mars {
    static int landingTime = 2;
    static int babies = 5;
    static String colonyName = "Destiny";
    static int shipPopulation = 300;
    static double meals = 4000.00;
    static boolean landing = true;
    static double mealFound = 0.5;
    static String landingLocation = "The Plain";

    public static void main(String[] args) throws InterruptedException {
        calculateMeals(meals, shipPopulation);
        reCalculateMeals(meals, mealFound);
        updatePopulation(shipPopulation, babies);
        calculateMeals(meals, shipPopulation);

        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
        landing = landingCheck(100);
        new GuessingGame();
        new MarsExpedition();
        new FindingsList();
    }

        public static double calculateMeals ( double meals, int shipPopulation){
            meals = meals - (shipPopulation * 0.75 * landingTime);
            System.out.println("Meals left: " + meals);
            return meals;
        }

        public static double reCalculateMeals ( double meals, double mealFound){
            meals = meals + (meals * mealFound);
            return meals;
        }

        public static int updatePopulation ( int shipPopulation, int babies){
            shipPopulation = shipPopulation + 5;
            return shipPopulation;
        }

        public static boolean landingCheck(int minutesLeft) throws InterruptedException {
            for (int minute = 0; minute <= minutesLeft; minute ++) {
                if (((minute % 2) == 0) && ((minute % 3) == 0)) {
                    System.out.println("Keep Center");
                } else if ((minute % 2) == 0) {
                    System.out.println("Right");
                } else if ((minute % 3) == 0) {
                    System.out.println("Left");
                } else {
                    System.out.println("Calculating");
                }
                Thread.sleep(250);
            }
            System.out.println("Landed");
            return false;
        }
    }