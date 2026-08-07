public class GeometryArea {

    // Area of square
    double calculateArea(double side) {
        return side * side;
    }

    // Area of rectangle
    double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    // Area of circle
    double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        GeometryArea shape = new GeometryArea();

        double squareArea = shape.calculateArea(5.0);
        double rectangleArea = shape.calculateArea(10.0, 5.0);
        double circleArea = shape.calculateArea(7.0f);

        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
        System.out.println("Area of Circle: " + circleArea);
    }
}