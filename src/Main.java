//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, OOP");
        System.out.println("Lab 7: Inheritance");

        Student s1 = new Student_IT(1, 2);
        System.out.println(s1.calMark());
        Student s2 = new Student_Mechanic(3, 4);
        System.out.println(s2.calMark());
    }
}