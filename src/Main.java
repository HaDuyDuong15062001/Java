import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, OOP");
        System.out.println("----- Lab 6.1 -----");
        System.out.println("Regular Expression");
        System.out.println("-------------------");

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
        Matcher matcher = pattern.matcher("haduyduong06031902@gmail.com");
        System.out.println("Input String matches regex - "+matcher.matches());
    }
}
