import java.util.Scanner;

public class Ques_05 {
    public static void main(String[] args) {
        System.out.println("Enter celsius value : ");
        Scanner sc = new Scanner(System.in);
        int cel = sc.nextInt();
        int temp = (cel * 9/5) + 32;
        System.out.println("Temperature is " + temp);
    }
}






