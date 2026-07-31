public class Rectangle {

    double length = 10.5;
    double breadth = 5.0;

    double calculateArea() {
        return length * breadth;
    }

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        System.out.println("Rectangle Details");
        System.out.println("Length: " + rectangle.length);
        System.out.println("Breadth: " + rectangle.breadth);
        System.out.println("Area: " + rectangle.calculateArea());
    }
}
