import java.util.Scanner;

public class Ques_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4 == 0){
            System.out.println(year + "is a leap year");
        }
        else{
            System.out.println(year + "is not a leap year");
        }
    }
}
