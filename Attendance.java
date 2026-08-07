import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] attendance = new int[7];
        int presentDays = 0;

        for (int i = 0; i < 7; i++) {
            attendance[i] = sc.nextInt();
        }

        for (int i = 0; i < 7; i++) {
            if (attendance[i] == 1) {
                presentDays++;
            }
        }

        double percentage = (presentDays / 7.0) * 100;

        System.out.println("Present Days : " + presentDays);
        System.out.println("Attendance : " + percentage + "%");

        if (percentage >= 75) {
            System.out.println("Eligible for Exam");
        } else {
            System.out.println("Not Eligible");
        }

        sc.close();
    }
}