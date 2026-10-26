
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in km: ");
        double distance = scanner.nextDouble();

        System.out.println("\nChoose transport:");
        System.out.println("1. Walking");
        System.out.println("2. Bicycle");
        System.out.println("3. Car");
        System.out.print("Your choice: ");

        int choice = scanner.nextInt();

        TravelStrategy strategy;

        switch (choice) {
            case 1:
                strategy = new WalkingStrategy();
                break;
            case 2:
                strategy = new BicycleStrategy();
                break;
            case 3:
                strategy = new CarStrategy();
                break;
            default:
                System.out.println("Invalid transport choice.");
                scanner.close();
                return;
        }

        TravelPlanner planner = new TravelPlanner(strategy);

        int time = planner.calculateTime(distance);
        String transport = planner.getTransport();

        System.out.println("\nExpected time: " + time + " minutes by " + transport);

        scanner.close();
    }
}
