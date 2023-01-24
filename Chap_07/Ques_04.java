public class Ques_04 {
    public static void main(String[] args) {
        int [] a = {1, 2, 3};
        int sum = 0;
          for(int element:a) {
              sum += element;
          }
          int ave = sum/a.length;
        System.out.println(ave);
          }
    }
