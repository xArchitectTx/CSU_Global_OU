import java.util.Scanner;

public class GradeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;
        double maxGrade = Double.MIN_VALUE;
        double minGrade = Double.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            double grade = scanner.nextDouble();

            // Update sum, max, and min
            sum += grade;
            if (grade > maxGrade) {
                maxGrade = grade;
            }
            if (grade < minGrade) {
                minGrade = grade;
            }
        }

        double average = sum / 10;

        // Print the statistics
        System.out.println("Average grade: " + average);
        System.out.println("Maximum grade: " + maxGrade);
        System.out.println("Minimum grade: " + minGrade);

        // Close the scanner
        scanner.close();
    }
}
