import java.util.Scanner;

public class StudentPerformance {

    int rollNumber;
    String studentName;
    int[] marks = new int[3];
    double attendance;

    StudentPerformance(int rollNumber, String studentName,
                       int mark1, int mark2, int mark3,
                       double attendance) {

        this.rollNumber = rollNumber;
        this.studentName = studentName;

        marks[0] = mark1;
        marks[1] = mark2;
        marks[2] = mark3;

        this.attendance = attendance;
    }

    void displayDetails() {

        int total = 0;

        // Calculate total using for loop
        for (int i = 0; i < 3; i++) {
            total += marks[i];
        }

        double average = total / 3.0;

        // Pass or Fail using ternary operator
        String result = (average >= 50) ? "Pass" : "Fail";

        // Scholarship eligibility using ternary operator
        String scholarship =
                (average >= 75 && attendance >= 80)
                ? "Eligible"
                : "Not Eligible";

        // Performance classification using ternary operator
        String performance =
                (average >= 85) ? "Excellent" : "Good";

        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Attendance: " + attendance + "%");
        System.out.println("Result: " + result);
        System.out.println("Scholarship: " + scholarship);
        System.out.println("Performance: " + performance);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentPerformance[] students =
                new StudentPerformance[5];

        // Create 5 Student objects
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter details for Student " + (i + 1));

            System.out.print("Roll Number: ");
            int rollNumber = sc.nextInt();

            System.out.print("Student Name: ");
            String studentName = sc.next();

            System.out.print("Mark 1: ");
            int mark1 = sc.nextInt();

            System.out.print("Mark 2: ");
            int mark2 = sc.nextInt();

            System.out.print("Mark 3: ");
            int mark3 = sc.nextInt();

            System.out.print("Attendance Percentage: ");
            double attendance = sc.nextDouble();

            students[i] = new StudentPerformance(
                    rollNumber,
                    studentName,
                    mark1,
                    mark2,
                    mark3,
                    attendance
            );

            System.out.println();
        }

        System.out.println("\n===== STUDENT PERFORMANCE DETAILS =====");

        double highestAverage = -1;
        StudentPerformance topStudent = null;

        // Display details and find highest average
        for (int i = 0; i < 5; i++) {

            students[i].displayDetails();

            int total = 0;

            for (int j = 0; j < 3; j++) {
                total += students[i].marks[j];
            }

            double average = total / 3.0;

            if (average > highestAverage) {
                highestAverage = average;
                topStudent = students[i];
            }
        }

        System.out.println("\n===== HIGHEST AVERAGE =====");
        System.out.println("Roll Number: " + topStudent.rollNumber);
        System.out.println("Student Name: " + topStudent.studentName);
        System.out.println("Highest Average: " + highestAverage);

        sc.close();
    }
}