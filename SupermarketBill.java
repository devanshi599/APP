import java.util.Scanner;

public class SupermarketBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] prices = new double[5];
        double total = 0;

        for (int i = 0; i < 5; i++) {
            prices[i] = sc.nextDouble();
        }

        for (int i = 0; i < 5; i++) {
            total = total + prices[i];
        }

        System.out.println("Total Bill : " + (int) total);

        if (total > 5000) {
            System.out.println("Discount Applicable");
        } else {
            System.out.println("No Discount");
        }

        sc.close();
    }
}