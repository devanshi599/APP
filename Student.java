public class Student {

    String name = "Devanshi Agrawal";
    int rollNumber = 101;
    String department = "Computer Science";

    public static void main(String[] args) {

        Student student = new Student();

        System.out.println("Student Details");
        System.out.println("Name: " + student.name);
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Department: " + student.department);
    }
}