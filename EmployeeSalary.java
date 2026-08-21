public class EmployeeSalary {

    // Parent Employee class
    static class Employee {
        String name;
        int employeeId;
        double basicSalary;

        Employee(String name, int employeeId, double basicSalary) {
            this.name = name;
            this.employeeId = employeeId;
            this.basicSalary = basicSalary;
        }

        double calculateSalary() {
            return basicSalary;
        }

        void displaySalary() {
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + employeeId);
            System.out.println("Basic Salary: ₹" + basicSalary);
            System.out.println("Calculated Salary: ₹" + calculateSalary());
            System.out.println("-----------------------------------");
        }
    }

    // Child class: Professor
    static class Professor extends Employee {

        Professor(String name, int employeeId, double basicSalary) {
            super(name, employeeId, basicSalary);
        }

        @Override
        double calculateSalary() {
            return basicSalary + (basicSalary * 0.30);
        }
    }

    // Child class: LabAssistant
    static class LabAssistant extends Employee {

        LabAssistant(String name, int employeeId, double basicSalary) {
            super(name, employeeId, basicSalary);
        }

        @Override
        double calculateSalary() {
            return basicSalary + (basicSalary * 0.15);
        }
    }

    // Child class: AdministrativeStaff
    static class AdministrativeStaff extends Employee {

        AdministrativeStaff(String name, int employeeId, double basicSalary) {
            super(name, employeeId, basicSalary);
        }

        @Override
        double calculateSalary() {
            return basicSalary + (basicSalary * 0.10);
        }
    }

    public static void main(String[] args) {

        Employee professor =
                new Professor("Dr. Rahul", 101, 60000);

        Employee labAssistant =
                new LabAssistant("Priya", 102, 30000);

        Employee administrativeStaff =
                new AdministrativeStaff("Aman", 103, 40000);

        System.out.println("===== EMPLOYEE SALARY DETAILS =====");

        professor.displaySalary();
        labAssistant.displaySalary();
        administrativeStaff.displaySalary();
    }
}
