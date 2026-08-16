import java.util.Scanner;

public class ProductBilling {

    int productId;
    String productName;
    double price;
    int quantity;

    // Constructor
    ProductBilling(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of 5 Product objects
        ProductBilling[] products = new ProductBilling[5];

        // Input for 5 products
        for (int i = 0; i < 5; i++) {

            System.out.println("Product " + (i + 1) + ":");

            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Price: ");
            double price = sc.nextDouble();

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            products[i] = new ProductBilling(id, name, price, quantity);
        }

        // Calculate and display bill
        for (int i = 0; i < 5; i++) {

            double totalPrice = products[i].price * products[i].quantity;
            double discount;

            if (totalPrice >= 5000) {
                discount = totalPrice * 0.10;
            } else {
                discount = totalPrice * 0.05;
            }

            double finalPrice = totalPrice - discount;

            System.out.println("\nProduct ID: " + products[i].productId);
            System.out.println("Name: " + products[i].productName);
            System.out.println("Total Price: ₹" + totalPrice);
            System.out.println("Discount: ₹" + discount);
            System.out.println("Final Price: ₹" + finalPrice);
        }

        sc.close();
    }
}