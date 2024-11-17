import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, OOP");
        System.out.println("Lab 8: Interface");

//        Pig p1 = new Pig();
//        p1.animalSound();
//        p1.run();


        IVehicle car = new Car("BMW");
        System.out.println(car.getBrand());
        System.out.println(car.speedUp());
        System.out.println(car.slowDown());
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());

        System.out.println("---------------------");

        IAlarm car1 = new Car("Mercedes");
        System.out.println(car1.turnAlarmOn());
        System.out.println(car1.turnAlarmOff());
    }
}