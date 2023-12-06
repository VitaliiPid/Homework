package Lesson_19.Homework_19;

public class Main {
    /*
    Создать класс Temperature (температура), содержащий метод для перевода градусов по фаренгейту
    в градусы цельсия ( celsius = 5*(farenheit - 32)/9). В классе Main создать несколько обьектов
    класса Temperature (значение температуры по фаренгейту должно задаваться через конструктор)
    и вывести результат перевода на экран
     */
    public static void main(String[] args) {
        Temperature temperature1 = new Temperature(32);
        Temperature temperature2 = new Temperature(184);
        Temperature temperature3 = new Temperature(420);

        System.out.println("Температура " + temperature1.convertToFahrenheitToCelsius() + " по Фаренгейту в Цельсиях");
        System.out.println("Температура " + temperature2.convertToFahrenheitToCelsius() + " по Фаренгейту в Цельсиях");
        System.out.println("Температура " + temperature3.convertToFahrenheitToCelsius() + " по Фаренгейту в Цельсиях");
    }
}
