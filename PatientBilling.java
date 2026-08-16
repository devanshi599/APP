import java.util.Scanner;

public class PatientBilling {

    String patientName;
    double consultationFee;

    // Parameterized constructor
    PatientBilling(String patientName, double consultationFee) {
        this.patientName = patientName;
        this.consultationFee = consultationFee;
    }

    // Method with argument to calculate final amount
    double calculateFinalAmount(double fee) {

        double discount;

        if (fee >= 2000) {
            discount = fee * 0.10;
        } else {
            discount = fee * 0.05;
        }

        return fee - discount;
    }

    // Method to display patient details
    void displayDetails() {

        double discount;

        if (consultationFee >= 2000) {
            discount = consultationFee * 0.10;
        } else {
            discount = consultationFee * 0.05;
        }

        double finalAmount = calculateFinalAmount(consultationFee);

        System.out.println("Patient Name: " + patientName);
        System.out.println("Original Consultation Fee: ₹" + consultationFee);
        System.out.println("Discount: ₹" + discount);
        System.out.println("Final Amount: ₹" + finalAmount);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of 5 Patient objects
        PatientBilling[] patients = new PatientBilling[5];

        // Input details for 5 patients
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter details for Patient " + (i + 1));

            System.out.print("Patient Name: ");
            String name = sc.next();

            System.out.print("Consultation Fee: ");
            double fee = sc.nextDouble();

            patients[i] = new PatientBilling(name, fee);

            System.out.println();
        }

        // Display details of all patients
        System.out.println("===== CONSULTATION BILLING DETAILS =====");

        for (int i = 0; i < 5; i++) {
            patients[i].displayDetails();
        }

        sc.close();
    }
}