import java.util.Scanner;

public class Ques_01 {
    public static void main(String[] args) {
        System.out.println("Enter your maths marks");
        Scanner sc = new Scanner(System.in);
        int maths = sc.nextInt();
        System.out.println("Enter your bio marks");
        int bio = sc.nextInt();
        System.out.println("Enter your chem marks");
        int chem = sc.nextInt();
        float average = (maths+bio+chem)/3.0f;
        if(average>=40 && maths>=33 && bio>=33 && chem>=33){
            System.out.println("You are pass!");
        }
        else {
            System.out.println("You are fail");
        }

    }
}
