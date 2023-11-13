import java.util.Scanner;

public class FuelEfficiencyCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the car's brand, model, year, starting and ending
        // odometer readings, and gallons used
        System.out.print("Enter the car brand: ");
        String brand = scanner.nextLine();

        System.out.print("Enter the car model: ");
        String model = scanner.nextLine();

        System.out.print("Enter the car year: ");
        int year = scanner.nextInt();

        System.out.print("Enter the starting odometer reading: ");
        double startingOdometer = scanner.nextDouble();

        System.out.print("Enter the ending odometer reading: ");
        double endingOdometer = scanner.nextDouble();

        System.out.print("Enter the gallons of fuel used: ");
        double gallonsUsed = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        // Calculate the miles driven and the MPG
        double milesDriven = endingOdometer - startingOdometer;
        double mpg = milesDriven / gallonsUsed;

        // Output the information along with the MPG calculation
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("Starting Odometer: " + startingOdometer);
        System.out.println("Ending Odometer: " + endingOdometer);
        System.out.println("Gallons Used: " + gallonsUsed);
        System.out.printf("MPG: %.2f", mpg); // Prints MPG rounded to two decimal places
    }
}
