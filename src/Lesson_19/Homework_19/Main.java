package Lesson_19.Homework_19;

public class Main {
    public static void main(String[] args) {
        Temperature temperature1 = new Temperature(32);
        Temperature temperature2 = new Temperature(184);
        Temperature temperature3 = new Temperature(420);

        System.out.println("Температура " + temperature1.convertToFahrenheitToCelsius() + " по Фаренгейту в Цельсиях");
        System.out.println("Температура " + temperature2.convertToFahrenheitToCelsius() + " по Фаренгейту в Цельсиях");
        System.out.println("Температура " + temperature3.convertToFahrenheitToCelsius() + " по Фаренгейту в Цельсиях");
    }
}
