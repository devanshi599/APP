public class StudentRecords {

    String name;
    int age;

    StudentRecords(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {

        StudentRecords student1 = new StudentRecords("Devanshi", 20);
        StudentRecords student2 = new StudentRecords("Rahul", 21);

        System.out.println("Student 1 Details");
        student1.display();

        System.out.println("Student 2 Details");
        student2.display();
    }
}
