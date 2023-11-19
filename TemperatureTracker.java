import java.util.ArrayList;
import java.util.Scanner;

public class TemperatureTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

        // Initialize days
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        // Input temperatures for each day
        for (String day : days) {
            System.out.println("Enter the average temperature for " + day + ": ");
            temperatures.add(scanner.nextDouble());
        }

        while (true) {
            System.out.println("Enter a day of the week or 'week' for weekly average: ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("week")) {
                double total = 0;
                System.out.println("Average temperatures for the week:");
                for (int i = 0; i < days.size(); i++) {
                    System.out.println(days.get(i) + ": " + temperatures.get(i));
                    total += temperatures.get(i);
                }
                System.out.println("Weekly average temperature: " + (total / days.size()));
                break;
            } else {
                int index = days.indexOf(input);
                if (index != -1) {
                    System.out.println(input + ": " + temperatures.get(index));
                } else {
                    System.out.println("Invalid input. Please try again.");
                }
            }
        }

        scanner.close();
    }
}
