public class Employee {

    String name;
    int employeeId;
    String department;

    Employee(String name, int employeeId, String department) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Department: " + department);
        System.out.println();
    }

    public static void main(String[] args) {

        Employee emp1 = new Employee("Devanshi Agrawal", 101, "IT");
        Employee emp2 = new Employee("Rahul Sharma", 102, "HR");

        System.out.println("Employee 1 Details");
        emp1.display();

        System.out.println("Employee 2 Details");
        emp2.display();
    }
}
