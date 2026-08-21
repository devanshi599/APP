
import java.util.Scanner;

public class PaymentSystem {

    // Interface
    interface Payment {
        void makePayment(double amount);
    }

    // UPI payment
    static class UPI implements Payment {

        @Override
        public void makePayment(double amount) {
            System.out.println("Payment of ₹" + amount + " made through UPI.");
        }
    }

    // Credit Card payment
    static class CreditCard implements Payment {

        @Override
        public void makePayment(double amount) {
            System.out.println("Payment of ₹" + amount + " made through Credit Card.");
        }
    }

    // Net Banking payment
    static class NetBanking implements Payment {

        @Override
        public void makePayment(double amount) {
            System.out.println("Payment of ₹" + amount + " made through Net Banking.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== PAYMENT SYSTEM =====");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Net Banking");

        System.out.print("Select payment method: ");
        int choice = sc.nextInt();

        System.out.print("Enter payment amount: ₹");
        double amount = sc.nextDouble();

        Payment payment;

        // Polymorphism
        if (choice == 1) {
            payment = new UPI();
        } else if (choice == 2) {
            payment = new CreditCard();
        } else if (choice == 3) {
            payment = new NetBanking();
        } else {
            System.out.println("Invalid payment method.");
            sc.close();
            return;
        }

        payment.makePayment(amount);

        sc.close();
    }
}