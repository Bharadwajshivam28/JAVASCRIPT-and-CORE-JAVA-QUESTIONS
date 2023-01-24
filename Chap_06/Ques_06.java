public class Ques_06 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int temp;
        for (int i = 0; i < 2; i++) {
            temp = a[i];
            a[i] = a[5 - i - 1];
            a[5 - i - 1] = temp;
        }
        for (int element:a){
        System.out.println(element);
        }

    }
}