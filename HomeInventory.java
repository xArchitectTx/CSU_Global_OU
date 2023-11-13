import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeInventory {
    public static void main(String[] args) {
        List<Home> homes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try {
            // Call home class with parameterized constructor
            Home home = new Home(2500, "123 Main St", "Anytown", "Anystate", 12345, "Model X", "available");
            System.out.println(Home.addHome(homes, home));

            // Call the method to list the values
            Home.listHomes(homes);

            // Call the remove home method
            System.out.println(Home.removeHome(homes, home));

            // Add a new home
            Home newHome = new Home(3000, "456 Elm St", "Othertown", "Otherstate", 67890, "Model Y", "sold");
            System.out.println(Home.addHome(homes, newHome));
            Home.listHomes(homes);

            // Update the home
            System.out.println(home.updateSaleStatus("under contract"));
            Home.listHomes(homes);

            // Ask if the user wants to print the information to a file
            System.out.println("Do you want to print the information to a file (Y or N)?");
            String response = scanner.nextLine();
            if ("Y".equalsIgnoreCase(response)) {
                Home.printToFile(homes, "C:\\Temp\\Home.txt");
                System.out.println("Information printed to the file.");
            } else {
                System.out.println("A file will not be printed.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}