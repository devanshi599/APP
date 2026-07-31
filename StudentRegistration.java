public class StudentRegistration {

    String name = "Devanshi Agrawal";
    int rollNumber = 101;
    String department = "Computer Science";

    public static void main(String[] args) {

        StudentRegistration student = new StudentRegistration();

        System.out.println("Student Details");
        System.out.println("Name: " + student.name);
        System.out.println("Roll Number: " + student.rollNumber);
        System.out.println("Department: " + student.department);
    }
}