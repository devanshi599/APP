public class Marks {

    int subject1 = 85;
    int subject2 = 90;
    int subject3 = 88;

    void calculate() {
        int total = subject1 + subject2 + subject3;
        double average = total / 3.0;

        System.out.println("Marks Details");
        System.out.println("Subject 1: " + subject1);
        System.out.println("Subject 2: " + subject2);
        System.out.println("Subject 3: " + subject3);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }

    public static void main(String[] args) {

        Marks student = new Marks();
        student.calculate();

    }
}
