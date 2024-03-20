
import java.util.Scanner;
public class CalSpeed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Calculate Speed");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    double[] speeds = calculateSpeed(scanner);
                    System.out.println("Your speed in meters/second is " + speeds[0]);
                    System.out.println("Your speed in km/h is " + speeds[1]);
                    System.out.println("Your speed in miles/h is " + speeds[2]);
                    break;
                case 2:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1 or 2.");
            }
        }

    }
    public static double[] calculateSpeed(Scanner scanner) {

        System.out.print("Input distance in meters: ");
        double distance = scanner.nextDouble();


        System.out.print("Input hour: ");
        int hour = scanner.nextInt();
        System.out.print("Input minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Input seconds: ");
        int seconds = scanner.nextInt();


        double totalTimeInSeconds = hour * 3600 + minutes * 60 + seconds;


        double speedInMetersPerSecond = distance / totalTimeInSeconds;
        double speedInKmPerHour = (distance / 1000) / (totalTimeInSeconds / 3600);
        double speedInMilesPerHour = (distance / 1609) / (totalTimeInSeconds / 3600);

        return new double[]{speedInMetersPerSecond, speedInKmPerHour, speedInMilesPerHour};
    }

}
