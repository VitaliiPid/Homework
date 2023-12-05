package Lesson_18.Homework;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Amy", 22);
        Student student3 = new Student("Charlie", 21);

        System.out.print("The name " + student1.name + ", age is: " + student1.age + "\n");
        System.out.print("The name " + student2.name + ", age is: " + student2.age + "\n");
        System.out.print("The name " + student3.name + ", age is: " + student3.age + "\n");
    }
}
