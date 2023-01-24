public class Ques_01 {
    public static void main(String[] args) {
        float[] num = {5.4f, 7.2f, 6.9f, 89.6f, 65.36f};
        float sum = 0;
        for (float element:num){
            sum = sum + element;
        }
        System.out.println("The sum is " + sum);
    }
}

