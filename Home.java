import java.util.List;
import java.io.FileWriter;
import java.io.IOException;

class Home {
    private int squareFeet;
    private String address;
    private String city;
    private String state;
    private int zipCode;
    private String modelName;
    private String saleStatus;

    // Parameterized constructor
    public Home(int squareFeet, String address, String city, String state, int zipCode, String modelName,
            String saleStatus) {
        this.squareFeet = squareFeet;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.modelName = modelName;
        this.saleStatus = saleStatus;
    }

    // Add a new home method
    public static String addHome(List<Home> homes, Home home) {
        try {
            homes.add(home);
            return "Home added successfully";
        } catch (Exception e) {
            return "Failed to add home: " + e.getMessage();
        }
    }

    // Remove a home method
    public static String removeHome(List<Home> homes, Home home) {
        try {
            homes.remove(home);
            return "Home removed successfully";
        } catch (Exception e) {
            return "Failed to remove home: " + e.getMessage();
        }
    }

    // Update home attributes
    public String updateSaleStatus(String newSaleStatus) {
        try {
            this.saleStatus = newSaleStatus;
            return "Sale status updated successfully";
        } catch (Exception e) {
            return "Failed to update sale status: " + e.getMessage();
        }
    }

    // Method to list the values
    public static void listHomes(List<Home> homes) {
        for (Home home : homes) {
            System.out.println(home.toString());
        }
    }

    @Override
    public String toString() {
        return "Home{" +
                "squareFeet=" + squareFeet +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode=" + zipCode +
                ", modelName='" + modelName + '\'' +
                ", saleStatus='" + saleStatus + '\'' +
                '}';
    }

    // Method to print information to a file
    public static void printToFile(List<Home> homes, String filePath) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        for (Home home : homes) {
            writer.write(home.toString() + System.lineSeparator());
        }
        writer.close();
    }
}
