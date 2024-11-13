import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, OOP");
        System.out.println("-----Lab 6-----\n");

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap username: ");
        String userName = sc.nextLine();
        System.out.println("Nhap password: ");
        String passWord = sc.nextLine();
        if (userName.equals("hoidanit") && passWord.length() > 6)
            System.out.println("Hop le");
        else
            System.out.println("Khong hop le");
         */

        ArrayList<Student> listStudent = new ArrayList<Student>();

        listStudent.add(new Student("Duong", 1));
        listStudent.add(new Student("Nguyễn Thị Huyền Trang", 2));
        listStudent.add(new Student("Hà Duy An", 3));
        listStudent.add(new Student("Lê Ngô Minh Huy", 4));
        listStudent.add(new Student("Phạm Linh Linh", 5));

        for(Student s : listStudent) {
            if (s.getName().startsWith("Nguyễn")) {
                System.out.println(s.toString());
            }

        }
    }
}
