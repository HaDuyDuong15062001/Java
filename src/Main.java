//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, OOP");
        System.out.println("Lab 8: Interface");

        Person p1 = new Person(23, "123", "Duong");
        Student s1 = new Student(21, "456", "An", 10);
        s1.setGrade();
        System.out.println(p1.toString());
        System.out.println(s1.toString());
    }
}