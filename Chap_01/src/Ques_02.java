public class Ques_02 {
    public static void main(String[] args) {
        int maths = 85;
        int bio = 80;
        int chem = 75;
        int total_marks = 300;
        int total_marks_obtained = maths + bio + chem;
        float percentage = total_marks_obtained*100/total_marks;
        float cgpa = percentage/10;
        System.out.println(cgpa);
    }
}
