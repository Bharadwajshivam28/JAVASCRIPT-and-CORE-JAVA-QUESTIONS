import java.util.Scanner;

public class Ques_02 {
    public static void main(String[] args) {
        int[] num = {5, 9, 98, 36, 75, 81};
        System.out.println("Enter your number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean isInArray = false;
        for (int data : num) {
            if (a == data) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.println("Number is present in array");
        } else {
            System.out.println("Number is not present");
        }
    }
}

