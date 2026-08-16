import java.util.Scanner;

public class EmployeeManagement {

    int employeeId;
    String employeeName;
    double monthlySalary;

    // Constructor
    EmployeeManagement(int employeeId, String employeeName, double monthlySalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.monthlySalary = monthlySalary;
    }

    // Method to calculate annual salary
    double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    // Method to calculate bonus
    double calculateBonus() {
        if (monthlySalary >= 30000) {
            return calculateAnnualSalary() * 0.10;
        } else {
            return 0;
        }
    }

    // Method to check bonus eligibility
    String checkBonusEligibility() {
        if (monthlySalary >= 30000) {
            return "Eligible for Bonus";
        } else {
            return "Not Eligible for Bonus";
        }
    }

    // Method to display employee details
    void displayDetails() {

        double annualSalary = calculateAnnualSalary();
        double bonus = calculateBonus();

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Monthly Salary: ₹" + monthlySalary);
        System.out.println("Annual Salary: ₹" + annualSalary);
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Eligibility: " + checkBonusEligibility());
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of 5 Employee objects
        EmployeeManagement[] employees =
                new EmployeeManagement[5];

        // Input details of 5 employees
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Employee ID: ");
            int id = sc.nextInt();

            System.out.print("Employee Name: ");
            String name = sc.next();

            System.out.print("Monthly Salary: ");
            double salary = sc.nextDouble();

            employees[i] =
                    new EmployeeManagement(id, name, salary);

            System.out.println();
        }

        // Display details of all employees
        System.out.println("===== EMPLOYEE DETAILS =====");

        for (int i = 0; i < 5; i++) {
            employees[i].displayDetails();
        }

        sc.close();
    }
}