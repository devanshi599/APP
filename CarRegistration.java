public class CarRegistration {

    String model;
    double price;

    // Constructor 1: No details
    CarRegistration() {
        model = "Not Provided";
        price = 0;
    }

    // Constructor 2: Model name only
    CarRegistration(String model) {
        this.model = model;
        price = 0;
    }

    // Constructor 3: Model name and price
    CarRegistration(String model, double price) {
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Model Name: " + model);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        CarRegistration car1 = new CarRegistration();
        CarRegistration car2 = new CarRegistration("Toyota");
        CarRegistration car3 = new CarRegistration("Honda", 1500000);

        System.out.println("Car 1 Details");
        car1.display();

        System.out.println("Car 2 Details");
        car2.display();

        System.out.println("Car 3 Details");
        car3.display();
    }
}