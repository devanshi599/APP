public class Temperature {

    double celsius = 25.0;

    void convert() {
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperature Details");
        System.out.println("Celsius: " + celsius + "°C");
        System.out.println("Fahrenheit: " + fahrenheit + "°F");
    }

    public static void main(String[] args) {

        Temperature temp = new Temperature();
        temp.convert();

    }
}