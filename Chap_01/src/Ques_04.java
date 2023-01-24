import java.util.Scanner;

public class Ques_04 {
    public static void main(String[] args) {
        System.out.println("Enter kilometers value");
        Scanner enter_kilo = new Scanner(System.in);
        double kilometers = enter_kilo.nextDouble();
        float value_miles = 1.609f;
        double miles = kilometers*value_miles;
        System.out.println(miles);

    }
}
