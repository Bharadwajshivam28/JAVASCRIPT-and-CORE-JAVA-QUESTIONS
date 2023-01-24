public class Ques_07 {
    public static void main(String[] args) {
        int[] arr = {98, 105, 999, 36};
        int max = 0;
        for (int e : arr) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println(max);

    }
}
