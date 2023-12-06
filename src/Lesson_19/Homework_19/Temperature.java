package Lesson_19.Homework_19;

public class Temperature {
    private double fahrenheit;
    public Temperature(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }
    public double convertToFahrenheitToCelsius() {
        return 5 * (fahrenheit - 32) / 9;
    }
}

