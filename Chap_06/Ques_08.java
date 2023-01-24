public class Ques_08 {
    public static void main(String[] args) {
        int [] a = {2, 6, 89, 78};
        int min = 100;
        for (int e:a){
            if(e<min){
                min = e;
            }
        }
        System.out.println(min);
    }
}