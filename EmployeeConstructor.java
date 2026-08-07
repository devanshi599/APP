import java.util.Scanner;

public class EmployeeConstructor {

    int employeeId;
    String employeeName;
    double salary;

    EmployeeConstructor(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Salary : " + (int) salary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id = sc.nextInt();
        String name = sc.next();
        double salary = sc.nextDouble();

        EmployeeConstructor employee =
                new EmployeeConstructor(id, name, salary);

        employee.display();

        sc.close();
    }
}