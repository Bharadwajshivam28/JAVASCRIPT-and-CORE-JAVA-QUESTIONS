public class Ques_03 {
    public static void main(String[] args) {
        float [] marks = {65f,98f,36f,78f,24f};
        float sum = 0;
        for(float data:marks){
            sum = sum + data;
        }
        System.out.println("The value of average is " + sum/ marks.length);
    }
}
