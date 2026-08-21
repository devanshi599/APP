import java.util.Scanner;

public class ShapeArea {

    // Abstract parent class
    static abstract class Shape {

        // Abstract method
        abstract double calculateArea();
    }

    // Circle subclass
    static class Circle extends Shape {

        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    // Rectangle subclass
    static class Rectangle extends Shape {

        double length;
        double breadth;

        Rectangle(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        @Override
        double calculateArea() {
            return length * breadth;
        }
    }

    // Triangle subclass
    static class Triangle extends Shape {

        double base;
        double height;

        Triangle(double base, double height) {
            this.base = base;
            this.height = height;
        }

        @Override
        double calculateArea() {
            return 0.5 * base * height;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        Shape circle = new Circle(radius);

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();

        Shape rectangle = new Rectangle(length, breadth);

        // Triangle
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();

        Shape triangle = new Triangle(base, height);

        // Display areas using polymorphism
        System.out.println("\n===== AREA OF SHAPES =====");

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());

        sc.close();
    }
}
