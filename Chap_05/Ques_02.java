public class Ques_02 {
    public static void main(String[] args) {
        int n = 3;
        int sum = 0;
        int i = 0;
        while (i<n) {
            sum = sum + (2*i);
            i++;
        }
        System.out.println("Sum of even numbers is : ");
        System.out.println(sum);
    }
}
