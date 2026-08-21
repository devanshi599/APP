public class ProductDiscount {

    // Abstract parent class
    static abstract class Product {

        int productId;
        String productName;
        double price;

        // Constructor
        Product(int productId, String productName, double price) {
            this.productId = productId;
            this.productName = productName;
            this.price = price;
        }

        // Abstract method
        abstract double calculateDiscount();

        // Calculate final price
        double calculateFinalPrice() {
            return price - calculateDiscount();
        }

        // Display product details
        void displayDetails() {
            System.out.println("Product ID: " + productId);
            System.out.println("Product Name: " + productName);
            System.out.println("Original Price: ₹" + price);
            System.out.println("Discount: ₹" + calculateDiscount());
            System.out.println("Final Price: ₹" + calculateFinalPrice());
            System.out.println("-----------------------------------");
        }
    }

    // Electronics subclass
    static class Electronics extends Product {

        Electronics(int productId, String productName, double price) {
            super(productId, productName, price);
        }

        @Override
        double calculateDiscount() {
            return price * 0.10;
        }
    }

    // Clothing subclass
    static class Clothing extends Product {

        Clothing(int productId, String productName, double price) {
            super(productId, productName, price);
        }

        @Override
        double calculateDiscount() {
            return price * 0.20;
        }
    }

    // Books subclass
    static class Books extends Product {

        Books(int productId, String productName, double price) {
            super(productId, productName, price);
        }

        @Override
        double calculateDiscount() {
            return price * 0.15;
        }
    }

    public static void main(String[] args) {

        // Polymorphism
        Product p1 = new Electronics(101, "Laptop", 50000);
        Product p2 = new Clothing(102, "Jacket", 4000);
        Product p3 = new Books(103, "Java Programming", 2000);

        System.out.println("===== PRODUCT DISCOUNT DETAILS =====");

        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
    }
}
