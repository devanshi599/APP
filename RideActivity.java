public class RideActivity {

    int rideNumber;
    String rideName;

    // Constructor
    RideActivity(int rideNumber, String rideName) {
        this.rideNumber = rideNumber;
        this.rideName = rideName;
    }

    // Method to display ride activity
    void displayPattern() {

        System.out.print(rideName + " : ");

        // Nested for loop to print stars
        for (int j = 1; j <= rideNumber; j++) {
            System.out.print("*");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Array of 5 Ride objects
        RideActivity[] rides = new RideActivity[5];

        // Creating 5 ride objects
        rides[0] = new RideActivity(1, "Roller Coaster");
        rides[1] = new RideActivity(2, "Ferris Wheel");
        rides[2] = new RideActivity(3, "Bumper Cars");
        rides[3] = new RideActivity(4, "Water Ride");
        rides[4] = new RideActivity(5, "Haunted House");

        // For loop to access each ride
        for (int i = 0; i < 5; i++) {
            rides[i].displayPattern();
        }
    }
}