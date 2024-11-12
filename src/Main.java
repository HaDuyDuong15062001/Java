import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, OOP");
        System.out.println("-----Lab 5-----\n");

//        ArrayList<String> myArrList = new ArrayList<String>();
//
//        // Some method
//        myArrList.add("Duong");
//        myArrList.add("Trang");
//        System.out.println(myArrList.toString());
//        System.out.println(myArrList.size());
//        System.out.println(myArrList.get(0));
        ArrayList<Double> list = new ArrayList<Double>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter double number");
            double x = scanner.nextDouble();
            list.add(x);
            scanner.nextLine();
            System.out.println("Do you want to continue entering ? Y/N");
            String option = scanner.nextLine();
            if (option.equals("N") || option.equals("n")) {
                break;
            }
            else if (option.equals("Y") || option.equals("y")) {
                continue;
            }
        }
        System.out.println(list.toString());
        int sum = 0;
        for (int i = 0; i < list.size(); ++i) {
            sum += list.get(i);
        }
        System.out.println("Sum = " + sum);
    }
}