import java.util.Scanner;

public class taxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Weekly Income: ");
        double income = scanner.nextDouble();

        // Initialize taxRate
        double taxRate;

        // Determine the tax rate based on income
        if (income < 500) {
            taxRate = 0.10;
        } else if (income < 1500) {
            taxRate = 0.15;
        } else if (income < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        // Calculate tax
        double tax = income * taxRate;

        // Display tax
        System.out.printf("Weekly average tax withholding: $%.2f%n", tax);

        // Closing the scanner
        scanner.close();
    }
}