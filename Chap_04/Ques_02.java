import java.util.Scanner;

public class Ques_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your tax in lakhs");
        float income = sc.nextFloat();
        float tax = 0;
        if (income>2.5f && income<=5f) {
            tax = tax + 0.05f * (income - 2.5f);
        }
        if (income>5.0f && income<=10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5.0f);
        }
        else if (income> 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5.0f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("The total tax paid by person is" + tax);
    }
}
